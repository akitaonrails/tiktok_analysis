package X;

import Y.AComparatorS524S0100000_30;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20038013ak implements InterfaceC21333118e9 {
    public final ViewGroup LIZ;
    public int[] LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS219S0000000_30.get$arr$(320));

    @Override // X.InterfaceC21333118e9
    public final boolean LIZ(Canvas canvas) {
        return false;
    }

    @Override // X.InterfaceC21333118e9
    public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, int i) {
    }

    @Override // X.InterfaceC21333118e9
    public final void LIZLLL() {
        this.LIZIZ = null;
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup instanceof AbstractC21332918e7) {
            ((AbstractC21332918e7) viewGroup).setChildrenDrawingOrderEnabled(!((WeakHashMap) this.LIZJ.getValue()).isEmpty());
        }
        this.LIZ.invalidate();
    }

    @Override // X.InterfaceC21333118e9
    public final void LJ() {
        this.LIZIZ = null;
    }

    public C20038013ak(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    @Override // X.InterfaceC21333118e9
    public final void removeView(View view) {
        ((WeakHashMap) this.LIZJ.getValue()).remove(view);
        this.LIZIZ = null;
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup instanceof AbstractC21332918e7) {
            ((AbstractC21332918e7) viewGroup).setChildrenDrawingOrderEnabled(!((WeakHashMap) this.LIZJ.getValue()).isEmpty());
        }
    }

    @Override // X.InterfaceC21333118e9
    public final void LIZIZ(int i, View view) {
        if (i == 0) {
            ((WeakHashMap) this.LIZJ.getValue()).remove(view);
        } else {
            ((WeakHashMap) this.LIZJ.getValue()).put(view, Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC21333118e9
    public final int getChildDrawingOrder(int i, int i2) {
        Integer numLJJIIJ;
        if (this.LIZIZ == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                View childAt = this.LIZ.getChildAt(i3);
                if (childAt != null) {
                    arrayList.add(childAt);
                }
            }
            C08XD.LJJ(arrayList, new AComparatorS524S0100000_30(this, 7));
            int[] iArr = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                iArr[i4] = this.LIZ.indexOfChild((View) C13LP.LJJJLZIJ(i4, arrayList));
            }
            this.LIZIZ = iArr;
        }
        int[] iArr2 = this.LIZIZ;
        if (iArr2 != null && (numLJJIIJ = C13LQ.LJJIIJ(i2, iArr2)) != null && numLJJIIJ.intValue() >= 0) {
            return numLJJIIJ.intValue();
        }
        return i2;
    }
}

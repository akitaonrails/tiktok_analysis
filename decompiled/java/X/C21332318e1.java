package X;

import Y.AComparatorS525S0100000_32;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS33S0202000_32;

/* JADX INFO: renamed from: X.18e1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21332318e1 implements InterfaceC21333118e9 {
    public final C21332218e0 LIZ;
    public int[] LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS223S0000000_32.get$arr$(273));

    @Override // X.InterfaceC21333118e9
    public final void LJ() {
    }

    @Override // X.InterfaceC21333118e9
    public final void removeView(View view) {
    }

    @Override // X.InterfaceC21333118e9
    public final void LIZLLL() {
        C1325860kbg.LIZIZ(null, AFwS223S0000000_32.get$arr$(272), C2097608Jq.LJ());
    }

    public C21332318e1(C21332218e0 c21332218e0) {
        this.LIZ = c21332218e0;
    }

    @Override // X.InterfaceC21333118e9
    public final boolean LIZ(Canvas canvas) {
        return this.LIZ.LJIJ(canvas);
    }

    @Override // X.InterfaceC21333118e9
    public final void LIZIZ(int i, View view) {
        C1325860kbg.LIZIZ(null, AFwS223S0000000_32.get$arr$(274), C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21333118e9
    public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, int i) {
        if (i == 0) {
            ((WeakHashMap) this.LIZJ.getValue()).remove(abstractC21333318eB);
        } else {
            ((WeakHashMap) this.LIZJ.getValue()).put(abstractC21333318eB, Integer.valueOf(i));
        }
        this.LIZIZ = null;
        if (!abstractC21333318eB.LJIILL() && !this.LIZ.LJIILL()) {
            ((AbstractC21332918e7) this.LIZ.getView()).setChildrenDrawingOrderEnabled(!((WeakHashMap) this.LIZJ.getValue()).isEmpty());
        }
        this.LIZ.LJJJJJL();
    }

    @Override // X.InterfaceC21333118e9
    public final int getChildDrawingOrder(int i, int i2) {
        Integer numLJJIIJ;
        int i3;
        int iIntValue;
        AbstractC21333318eB<?> abstractC21333318eBLJZI;
        if (!((WeakHashMap) this.LIZJ.getValue()).isEmpty()) {
            int[] iArr = this.LIZIZ;
            int iLJZL = this.LIZ.LJZL();
            if (iArr == null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < iLJZL; i4++) {
                    AbstractC21333318eB<?> abstractC21333318eBLJZI2 = this.LIZ.LJZI(i4);
                    if (abstractC21333318eBLJZI2 != null) {
                        arrayList.add(abstractC21333318eBLJZI2);
                    }
                }
                C08XD.LJJ(arrayList, new AComparatorS525S0100000_32(this, 2));
                iArr = new int[iLJZL];
                for (int i5 = 0; i5 < iLJZL; i5++) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(i5, arrayList);
                    if (objLJJJLZIJ != null) {
                        iArr[i5] = ((ArrayList) this.LIZ.LLZZLLIL).indexOf(objLJJJLZIJ);
                    }
                }
                this.LIZIZ = iArr;
            }
            if (i != iLJZL) {
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i6 < iLJZL) {
                        Integer numLJJIIJ2 = C13LQ.LJJIIJ(i6, iArr);
                        if (numLJJIIJ2 != null && (abstractC21333318eBLJZI = this.LIZ.LJZI((iIntValue = numLJJIIJ2.intValue()))) != null && !abstractC21333318eBLJZI.LJIILL()) {
                            if (i7 == i2) {
                                int i8 = 0;
                                for (int i9 = 0; i9 < iIntValue; i9++) {
                                    AbstractC21333318eB<?> abstractC21333318eBLJZI3 = this.LIZ.LJZI(i9);
                                    if (abstractC21333318eBLJZI3 != null && abstractC21333318eBLJZI3.LJIILL()) {
                                        i8++;
                                    }
                                }
                                i3 = iIntValue - i8;
                            } else {
                                i7++;
                            }
                        }
                        i6++;
                    } else {
                        i3 = i2;
                        break;
                    }
                }
                numLJJIIJ = Integer.valueOf(i3);
            } else {
                numLJJIIJ = C13LQ.LJJIIJ(i2, iArr);
            }
            if (numLJJIIJ != null && numLJJIIJ.intValue() >= 0) {
                if (numLJJIIJ.intValue() >= i) {
                    C1325860kbg.LIZIZ(null, new AwS33S0202000_32(numLJJIIJ, i, i2, this, 3), C2097608Jq.LJ());
                } else {
                    return numLJJIIJ.intValue();
                }
            }
        }
        return i2;
    }
}

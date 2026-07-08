package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0Pfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650780Pfo implements InterfaceC650760Pfm {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(508));

    @Override // X.InterfaceC650760Pfm
    public final List<InterfaceC650860Pfw> LIZIZ(EnumC648690PcR enumC648690PcR, RecyclerView recyclerView, List<? extends InterfaceC650860Pfw> list, int i, boolean z) {
        return null;
    }

    @Override // X.InterfaceC650760Pfm
    public final List<InterfaceC650860Pfw> LIZ(RecyclerView recyclerView, List<? extends InterfaceC650860Pfw> list) {
        InterfaceC650860Pfw next;
        InterfaceC650860Pfw interfaceC650860Pfw = (InterfaceC650860Pfw) C13LP.LJJJLL(list);
        if (interfaceC650860Pfw == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (interfaceC650860Pfw.LJFF() == 1) {
            if (interfaceC650860Pfw.N1()) {
                arrayList.add(interfaceC650860Pfw);
            }
            InterfaceC650860Pfw interfaceC650860PfwLJII = interfaceC650860Pfw.LJII();
            if (interfaceC650860PfwLJII == null || !interfaceC650860PfwLJII.N1()) {
                return arrayList;
            }
            arrayList.add(interfaceC650860PfwLJII);
            return arrayList;
        }
        if (interfaceC650860Pfw.N1()) {
            arrayList.add(interfaceC650860Pfw);
            return arrayList;
        }
        Iterator<? extends InterfaceC650860Pfw> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.N1()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC650860Pfw interfaceC650860Pfw2 = next;
        if (interfaceC650860Pfw2 == null) {
            return arrayList;
        }
        int[] iArr = new int[2];
        C650830Pft.LIZ(recyclerView, interfaceC650860Pfw2.getView(), iArr);
        if (recyclerView.getHeight() / 2 < iArr[1]) {
            return arrayList;
        }
        arrayList.add(interfaceC650860Pfw2);
        InterfaceC650860Pfw interfaceC650860PfwLJII2 = interfaceC650860Pfw2.LJII();
        if (interfaceC650860PfwLJII2 == null || !interfaceC650860PfwLJII2.N1()) {
            return arrayList;
        }
        arrayList.add(interfaceC650860PfwLJII2);
        return arrayList;
    }

    @Override // X.InterfaceC650760Pfm
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView) {
        int height;
        if (((Boolean) C18116077q.LIZ.getValue()).booleanValue()) {
            height = recyclerView.getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(350));
        } else {
            height = (int) (recyclerView.getHeight() * (((Number) AnonymousClass0755.LIZ.getValue()).intValue() / 100.0f));
        }
        float f = height;
        canvas.drawLine(0.0f, f, recyclerView.getWidth(), f, (Paint) this.LIZ.getValue());
    }
}

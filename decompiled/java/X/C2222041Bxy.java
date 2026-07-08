package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1Bxy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222041Bxy implements InterfaceC2222351ByT {
    public final InterfaceC2222101By4 LIZ;
    public final List<InterfaceC2222351ByT> LIZIZ = new CopyOnWriteArrayList();

    @Override // X.InterfaceC2222251ByJ
    public final void LIZ() {
        Iterator<InterfaceC2222351ByT> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onDestroy() {
        Iterator<InterfaceC2222351ByT> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onDestroy();
        }
        ((CopyOnWriteArrayList) this.LIZIZ).clear();
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onRelease() {
        Iterator<InterfaceC2222351ByT> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onRelease();
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2222351ByT interfaceC2222351ByT : this.LIZIZ) {
            if (interfaceC2222351ByT instanceof C2222141By8) {
                arrayList.add(interfaceC2222351ByT);
            }
        }
        ((CopyOnWriteArrayList) this.LIZIZ).clear();
        ((CopyOnWriteArrayList) this.LIZIZ).addAll(arrayList);
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onStart() {
        Iterator<InterfaceC2222351ByT> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onStart();
        }
    }

    public C2222041Bxy(InterfaceC2222101By4 interfaceC2222101By4) {
        this.LIZ = interfaceC2222101By4;
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIIZ(C2222081By2 c2222081By2) {
        ((CopyOnWriteArrayList) this.LIZIZ).clear();
        C2221701BxQ c2221701BxQ = c2222081By2.LIZIZ;
        Iterator<T> it2 = c2221701BxQ.LIZJ.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    ((CopyOnWriteArrayList) this.LIZIZ).add(new C2222141By8(this, c2221701BxQ.LIZIZ));
                }
            } else {
                ((CopyOnWriteArrayList) this.LIZIZ).add(new C2222161ByA(this, c2221701BxQ.LIZIZ));
            }
        }
        Iterator<InterfaceC2222351ByT> it3 = this.LIZIZ.iterator();
        while (it3.hasNext()) {
            it3.next().LJIIIZ(c2222081By2);
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIL(C2222371ByV c2222371ByV) {
        Iterator<InterfaceC2222351ByT> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIL(c2222371ByV);
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIILL(long j, C2222081By2 c2222081By2) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2222251ByJ) it2.next()).LJIILL(j, c2222081By2);
        }
    }

    @Override // X.InterfaceC2222351ByT
    public final void LJIILLIIL(long j, C1500700p9g c1500700p9g, InterfaceC19666511x1 interfaceC19666511x1) {
        Iterator<InterfaceC2222351ByT> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILLIIL(j, c1500700p9g, interfaceC19666511x1);
        }
    }
}

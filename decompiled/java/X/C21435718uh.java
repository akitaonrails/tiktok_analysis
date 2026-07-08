package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.18uh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21435718uh extends AbstractC21425218t0 {
    public final InterfaceC21447718wd LIZ;

    public C21435718uh(C21432018u6 c21432018u6) {
        this.LIZ = c21432018u6;
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LIZJ(C21433918uP c21433918uP) {
        C21432018u6 c21432018u6 = (C21432018u6) this.LIZ;
        c21432018u6.getClass();
        final boolean z = c21432018u6.LIZJ;
        final List<AbstractC21442818vq> list = c21432018u6.LIZ;
        final List<InterfaceC21444318w5> list2 = c21432018u6.LIZIZ;
        c21433918uP.LJ = new InterfaceC21446618wS(z, list, list2) { // from class: X.18ui
            public final boolean LIZ;
            public final List<AbstractC21442818vq> LIZIZ;
            public final List<InterfaceC21444318w5> LIZJ;

            @Override // X.InterfaceC21446618wS
            public final InterfaceC21429918tl LIZ(C21444018w2 c21444018w2) {
                List list3;
                int size;
                List<InterfaceC21444318w5> list4 = c21444018w2.LIZ;
                if (list4 != null && (size = list4.size()) > 0) {
                    ArrayList arrayList = new ArrayList(size + this.LIZJ.size());
                    arrayList.addAll(this.LIZJ);
                    arrayList.addAll(list4);
                    list3 = arrayList;
                } else {
                    list3 = this.LIZJ;
                }
                return new C21442318vl(c21444018w2, this.LIZ, this.LIZIZ, list3);
            }

            {
                this.LIZ = z;
                this.LIZIZ = list;
                this.LIZJ = list2;
            }
        };
    }
}

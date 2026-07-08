package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tGC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658500tGC {
    public final C1660100tIm<InterfaceC1659860tIO> LIZ;
    public final C055100Ib LIZIZ;
    public final AbstractC1665600tRe LIZJ;

    public C1658500tGC() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1658500tGC)) {
            return false;
        }
        C1658500tGC c1658500tGC = (C1658500tGC) obj;
        return Intrinsics.LJFF(this.LIZ, c1658500tGC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1658500tGC.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1658500tGC.LIZJ);
    }

    public C1658500tGC(C1660100tIm c1660100tIm, AbstractC1665600tRe abstractC1665600tRe, int i) {
        C055100Ib c055100Ib;
        c1660100tIm = (i & 1) != 0 ? new C1660100tIm(0) : c1660100tIm;
        if ((i & 2) != 0) {
            c055100Ib = new C055100Ib(0);
        } else {
            c055100Ib = null;
        }
        abstractC1665600tRe = (i & 4) != 0 ? null : abstractC1665600tRe;
        this.LIZ = c1660100tIm;
        this.LIZIZ = c055100Ib;
        this.LIZJ = abstractC1665600tRe;
    }
}

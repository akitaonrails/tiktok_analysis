package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03MY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MY {
    public final C833003Ng LIZ;
    public final C830003Mc LIZIZ;
    public final C03MQ LIZJ;
    public final boolean LIZLLL;
    public final C830103Md LJ;
    public final boolean LJFF;
    public final C03MZ LJI;
    public final List<C03MY> LJII;

    public C03MY() {
        this(null, null, null, false, null, false, null, null, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03MY)) {
            return false;
        }
        C03MY c03my = (C03MY) obj;
        return Intrinsics.LJFF(this.LIZ, c03my.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03my.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c03my.LIZJ) && this.LIZLLL == c03my.LIZLLL && Intrinsics.LJFF(this.LJ, c03my.LJ) && Intrinsics.LJFF(null, null) && this.LJFF == c03my.LJFF && this.LJI == c03my.LJI && Intrinsics.LJFF(this.LJII, c03my.LJII);
    }

    public C03MY(C833003Ng c833003Ng, C830003Mc c830003Mc, C03MQ c03mq, boolean z, C830103Md c830103Md, boolean z2, C03MZ c03mz, List list, int i) {
        c833003Ng = (i & 1) != 0 ? null : c833003Ng;
        c830003Mc = (i & 2) != 0 ? null : c830003Mc;
        c03mq = (i & 4) != 0 ? null : c03mq;
        z = (i & 8) != 0 ? false : z;
        c830103Md = (i & 16) != 0 ? null : c830103Md;
        z2 = (i & 64) != 0 ? false : z2;
        c03mz = (i & 128) != 0 ? C03MZ.SINGLE : c03mz;
        list = (i & 256) != 0 ? null : list;
        this.LIZ = c833003Ng;
        this.LIZIZ = c830003Mc;
        this.LIZJ = c03mq;
        this.LIZLLL = z;
        this.LJ = c830103Md;
        this.LJFF = z2;
        this.LJI = c03mz;
        this.LJII = list;
    }
}

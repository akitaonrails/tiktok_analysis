package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03XN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03XN {
    public final C833003Ng LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final C03K4 LJI;
    public final C03MJ LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03XN)) {
            return false;
        }
        C03XN c03xn = (C03XN) obj;
        return Intrinsics.LJFF(this.LIZ, c03xn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03xn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c03xn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c03xn.LIZLLL) && Intrinsics.LJFF(this.LJ, c03xn.LJ) && Intrinsics.LJFF(this.LJFF, c03xn.LJFF) && this.LJI == c03xn.LJI && Intrinsics.LJFF(this.LJII, c03xn.LJII);
    }

    public C03XN(C833003Ng c833003Ng, String str, Integer num, Integer num2, Integer num3, Integer num4, C03K4 c03k4, C03MJ c03mj) {
        this.LIZ = c833003Ng;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = num2;
        this.LJ = num3;
        this.LJFF = num4;
        this.LJI = c03k4;
        this.LJII = c03mj;
    }

    public /* synthetic */ C03XN(C833003Ng c833003Ng, String str, Integer num, Integer num2, Integer num3, Integer num4, C03K4 c03k4, C03MJ c03mj, int i) {
        this(c833003Ng, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? 0 : num4, (i & 64) != 0 ? null : c03k4, (i & 128) == 0 ? c03mj : null);
    }
}

package X;

import java.util.List;

/* JADX INFO: renamed from: X.0lSL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358510lSL {
    public final long LIZ;
    public final List<C1358440lSE> LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public C1358510lSL(long j, long j2, long j3, List list) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = j2;
        this.LIZLLL = j3;
    }

    public static C1358510lSL LIZ(C1358510lSL c1358510lSL, long j, List list, long j2, int i) {
        long j3;
        long j4 = j2;
        List list2 = list;
        long j5 = j;
        if ((i & 1) != 0) {
            j5 = c1358510lSL.LIZ;
        }
        if ((i & 2) != 0) {
            list2 = c1358510lSL.LIZIZ;
        }
        if ((i & 4) != 0) {
            j3 = c1358510lSL.LIZJ;
        } else {
            j3 = 0;
        }
        if ((i & 8) != 0) {
            j4 = c1358510lSL.LIZLLL;
        }
        return new C1358510lSL(j5, j3, j4, list2);
    }
}

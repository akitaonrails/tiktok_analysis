package X;

import java.util.List;

/* JADX INFO: renamed from: X.0WQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823060WQm {
    public final boolean LIZ;
    public final List<C0WQX> LIZIZ;
    public final List<String> LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;

    public C823060WQm(C823070WQn c823070WQn) {
        this.LIZ = c823070WQn.LIZ;
        List<C0WQX> list = c823070WQn.LIZIZ;
        LIZ(list);
        this.LIZIZ = list;
        List<String> list2 = c823070WQn.LIZJ;
        LIZ(list2);
        this.LIZJ = list2;
        long j = c823070WQn.LIZLLL;
        LIZIZ(j);
        this.LIZLLL = j;
        long j2 = c823070WQn.LJ;
        LIZIZ(j2);
        this.LJ = j2;
        long j3 = c823070WQn.LJFF;
        LIZIZ(j3);
        this.LJFF = j3;
    }

    public static void LIZ(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalStateException("should not be null!");
        }
    }

    public static void LIZIZ(long j) {
        if (j != 0) {
        } else {
            throw new IllegalStateException("should not be zero!");
        }
    }
}

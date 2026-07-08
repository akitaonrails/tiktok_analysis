package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03YV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03YV {
    public final int LIZ;
    public final String LIZIZ;
    public final C03YK LIZJ;
    public final Integer LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03YV)) {
            return false;
        }
        C03YV c03yv = (C03YV) obj;
        return this.LIZ == c03yv.LIZ && Intrinsics.LJFF(this.LIZIZ, c03yv.LIZIZ) && this.LIZJ == c03yv.LIZJ && Intrinsics.LJFF(this.LIZLLL, c03yv.LIZLLL) && Intrinsics.LJFF(this.LJ, c03yv.LJ);
    }

    public static C03YV LIZ(C03YV c03yv, String str) {
        int i = c03yv.LIZ;
        C03YK c03yk = c03yv.LIZJ;
        Integer num = c03yv.LIZLLL;
        String str2 = c03yv.LJ;
        c03yv.getClass();
        return new C03YV(i, str, c03yk, num, str2);
    }

    public /* synthetic */ C03YV(int i, String str, C03YK c03yk) {
        this(i, str, c03yk, null, null);
    }

    public C03YV(int i, String str, C03YK c03yk, Integer num, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = c03yk;
        this.LIZLLL = num;
        this.LJ = str2;
    }
}

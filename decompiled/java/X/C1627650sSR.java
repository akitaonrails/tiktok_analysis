package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sSR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627650sSR<T_1, T_2, T_3, T_4, T_5> {
    public final T_1 LIZ;
    public final T_2 LIZIZ;
    public final T_3 LIZJ;
    public final T_4 LIZLLL;
    public final T_5 LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1627650sSR)) {
            return false;
        }
        C1627650sSR c1627650sSR = (C1627650sSR) obj;
        return Intrinsics.LJFF(this.LIZ, c1627650sSR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1627650sSR.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1627650sSR.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1627650sSR.LIZLLL) && Intrinsics.LJFF(this.LJ, c1627650sSR.LJ);
    }

    public C1627650sSR(T_1 t_1, T_2 t_2, T_3 t_3, T_4 t_4, T_5 t_5) {
        this.LIZ = t_1;
        this.LIZIZ = t_2;
        this.LIZJ = t_3;
        this.LIZLLL = t_4;
        this.LJ = t_5;
    }
}

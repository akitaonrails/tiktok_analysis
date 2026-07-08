package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0twt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684970twt {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final C1146150fvp LIZLLL;
    public final C1147600fyA LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1684970twt)) {
            return false;
        }
        C1684970twt c1684970twt = (C1684970twt) obj;
        return Intrinsics.LJFF(this.LIZ, c1684970twt.LIZ) && this.LIZIZ == c1684970twt.LIZIZ && this.LIZJ == c1684970twt.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1684970twt.LIZLLL) && Intrinsics.LJFF(this.LJ, c1684970twt.LJ);
    }

    public C1684970twt(String str, long j, long j2, C1146150fvp c1146150fvp, C1147600fyA c1147600fyA) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = c1146150fvp;
        this.LJ = c1147600fyA;
    }
}

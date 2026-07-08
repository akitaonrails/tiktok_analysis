package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869380Y8q {
    public final String LIZ;
    public final String LIZIZ;
    public final C0Y97 LIZJ;
    public final C873950YQf LIZLLL;
    public final C873950YQf LJ;
    public final long LJFF;
    public final long LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C869380Y8q() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C869380Y8q)) {
            return false;
        }
        C869380Y8q c869380Y8q = (C869380Y8q) obj;
        return Intrinsics.LJFF(this.LIZ, c869380Y8q.LIZ) && Intrinsics.LJFF(this.LIZIZ, c869380Y8q.LIZIZ) && this.LIZJ == c869380Y8q.LIZJ && Intrinsics.LJFF(this.LIZLLL, c869380Y8q.LIZLLL) && Intrinsics.LJFF(this.LJ, c869380Y8q.LJ) && this.LJFF == c869380Y8q.LJFF && this.LJI == c869380Y8q.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        C873950YQf c873950YQf = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c873950YQf == null ? 0 : c873950YQf.hashCode())) * 31;
        C873950YQf c873950YQf2 = this.LJ;
        return ((((iHashCode2 + (c873950YQf2 != null ? c873950YQf2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestQuery(querySessionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", queryUniqueId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", readFlag=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", equalKVQueryInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", unEqualKVQueryInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", nextUpdateTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", maxConvShortId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C869380Y8q(String str, String str2, C873950YQf c873950YQf, C873950YQf c873950YQf2, int i) {
        C0Y97 c0y97;
        long j;
        long j2;
        C873950YQf c873950YQf3 = c873950YQf;
        String str3 = (i & 1) != 0 ? "" : str;
        String str4 = (i & 2) == 0 ? str2 : "";
        if ((i & 4) != 0) {
            c0y97 = C0Y97.ALL;
        } else {
            c0y97 = null;
        }
        c873950YQf3 = (i & 8) != 0 ? null : c873950YQf3;
        C873950YQf c873950YQf4 = (i & 16) == 0 ? c873950YQf2 : null;
        if ((i & 32) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        if ((i & 64) != 0) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = 0;
        }
        this(str3, str4, c0y97, c873950YQf3, c873950YQf4, j, j2);
    }

    public static C869380Y8q LIZ(C869380Y8q c869380Y8q, C0Y97 c0y97, long j, long j2, int i) {
        String str;
        String str2;
        C873950YQf c873950YQf;
        long j3 = j2;
        long j4 = j;
        C0Y97 c0y972 = c0y97;
        C873950YQf c873950YQf2 = null;
        if ((i & 1) != 0) {
            str = c869380Y8q.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c869380Y8q.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            c0y972 = c869380Y8q.LIZJ;
        }
        if ((i & 8) != 0) {
            c873950YQf = c869380Y8q.LIZLLL;
        } else {
            c873950YQf = null;
        }
        if ((i & 16) != 0) {
            c873950YQf2 = c869380Y8q.LJ;
        }
        if ((i & 32) != 0) {
            j4 = c869380Y8q.LJFF;
        }
        if ((i & 64) != 0) {
            j3 = c869380Y8q.LJI;
        }
        return new C869380Y8q(str, str2, c0y972, c873950YQf, c873950YQf2, j4, j3);
    }

    public C869380Y8q(String str, String str2, C0Y97 c0y97, C873950YQf c873950YQf, C873950YQf c873950YQf2, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c0y97;
        this.LIZLLL = c873950YQf;
        this.LJ = c873950YQf2;
        this.LJFF = j;
        this.LJI = j2;
    }
}

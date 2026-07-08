package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jPA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279660jPA {
    public String LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1279660jPA)) {
            return false;
        }
        C1279660jPA c1279660jPA = (C1279660jPA) obj;
        return Intrinsics.LJFF(this.LIZ, c1279660jPA.LIZ) && this.LIZIZ == c1279660jPA.LIZIZ && this.LIZJ == c1279660jPA.LIZJ && this.LIZLLL == c1279660jPA.LIZLLL && this.LJ == c1279660jPA.LJ && this.LJFF == c1279660jPA.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerSwitchLogContext(liveStreamSessionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startPlayTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", firstFrameTimeMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lastStopTimeMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stallTotalTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", stallTotalCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1279660jPA() {
        this(0L, 0L, 0L, "", 0L, 0L);
    }

    public C1279660jPA(long j, long j2, long j3, String str, long j4, long j5) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = j5;
    }
}

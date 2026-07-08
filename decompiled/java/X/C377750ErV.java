package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ErV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377750ErV {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final EnumC381960EyI LJFF;
    public final C377760ErW LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final String LJIIIZ;
    public final long LJIIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C377750ErV() {
        boolean z = false;
        long j = 0;
        this(null, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, j, j, j, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C377750ErV)) {
            return false;
        }
        C377750ErV c377750ErV = (C377750ErV) obj;
        return Intrinsics.LJFF(this.LIZ, c377750ErV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c377750ErV.LIZIZ) && this.LIZJ == c377750ErV.LIZJ && this.LIZLLL == c377750ErV.LIZLLL && this.LJ == c377750ErV.LJ && this.LJFF == c377750ErV.LJFF && Intrinsics.LJFF(this.LJI, c377750ErV.LJI) && this.LJII == c377750ErV.LJII && this.LJIIIIZZ == c377750ErV.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c377750ErV.LJIIIZ) && this.LJIIJ == c377750ErV.LJIIJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        EnumC381960EyI enumC381960EyI = this.LJFF;
        int iHashCode3 = (iHashCode2 + (enumC381960EyI == null ? 0 : enumC381960EyI.hashCode())) * 31;
        C377760ErW c377760ErW = this.LJI;
        return ((((((((iHashCode3 + (c377760ErW != null ? c377760ErW.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIJ);
    }

    public final String toString() {
        return "GenerateTaskState(epAIGCId=" + this.LIZ + ", serverTaskId=" + this.LIZIZ + ", isAsync=" + this.LIZJ + ", isFailed=" + this.LIZLLL + ", isFinished=" + this.LJ + ", source=" + this.LJFF + ", errorResult=" + this.LJI + ", taskServerCreateTime=" + this.LJII + ", taskServerEndTime=" + this.LJIIIIZZ + ", errorMsgFromServer=" + this.LJIIIZ + ", imageUploadDuration=" + this.LJIIJ + ')';
    }

    public /* synthetic */ C377750ErV(String str, String str2, boolean z, boolean z2, EnumC381960EyI enumC381960EyI, long j, long j2, long j3, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, false, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : enumC381960EyI, null, (i & 128) != 0 ? 0L : j, (i & 256) != 0 ? 0L : j2, (i & 512) != 0 ? "" : null, (i & 1024) != 0 ? 0L : j3);
    }

    public C377750ErV(String str, String str2, boolean z, boolean z2, boolean z3, EnumC381960EyI enumC381960EyI, C377760ErW c377760ErW, long j, long j2, String str3, long j3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = enumC381960EyI;
        this.LJI = c377760ErW;
        this.LJII = j;
        this.LJIIIIZZ = j2;
        this.LJIIIZ = str3;
        this.LJIIJ = j3;
    }
}

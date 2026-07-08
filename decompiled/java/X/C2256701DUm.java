package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256701DUm {
    public final long LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final EnumC2249731D3r LIZLLL;
    public final EnumC1446110njd LJ;
    public final int LJFF;
    public final boolean LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final Long LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2256701DUm)) {
            return false;
        }
        C2256701DUm c2256701DUm = (C2256701DUm) obj;
        return this.LIZ == c2256701DUm.LIZ && this.LIZIZ == c2256701DUm.LIZIZ && this.LIZJ == c2256701DUm.LIZJ && this.LIZLLL == c2256701DUm.LIZLLL && this.LJ == c2256701DUm.LJ && this.LJFF == c2256701DUm.LJFF && this.LJI == c2256701DUm.LJI && Intrinsics.LJFF(this.LJII, c2256701DUm.LJII) && this.LJIIIIZZ == c2256701DUm.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c2256701DUm.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c2256701DUm.LJIIJ);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        EnumC2249731D3r enumC2249731D3r = this.LIZLLL;
        int iHashCode = (((((((iY2 + (enumC2249731D3r == null ? 0 : enumC2249731D3r.hashCode())) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        String str = this.LJII;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        Long l = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.LJIIJ;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SendMessageMonitorInitParams(startTime=" + this.LIZ + ", isFastSend=" + this.LIZIZ + ", fromRecord=" + this.LIZJ + ", strategy=" + this.LIZLLL + ", mediaType=" + this.LJ + ", selectCount=" + this.LJFF + ", isRetry=" + this.LJI + ", creationId=" + this.LJII + ", isPreuploadHit=" + this.LJIIIIZZ + ", videoDuration=" + this.LJIIIZ + ", enterMethod=" + this.LJIIJ + ')';
    }

    public static C2256701DUm LIZ(C2256701DUm c2256701DUm, EnumC2249731D3r enumC2249731D3r, String str, boolean z, int i) {
        long j;
        boolean z2;
        boolean z3;
        EnumC1446110njd enumC1446110njd;
        int i2;
        boolean z4;
        Long l;
        boolean z5 = z;
        String str2 = str;
        EnumC2249731D3r enumC2249731D3r2 = enumC2249731D3r;
        if ((i & 1) != 0) {
            j = c2256701DUm.LIZ;
        } else {
            j = 0;
        }
        if ((i & 2) != 0) {
            z2 = c2256701DUm.LIZIZ;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = c2256701DUm.LIZJ;
        } else {
            z3 = false;
        }
        if ((i & 8) != 0) {
            enumC2249731D3r2 = c2256701DUm.LIZLLL;
        }
        String str3 = null;
        if ((i & 16) != 0) {
            enumC1446110njd = c2256701DUm.LJ;
        } else {
            enumC1446110njd = null;
        }
        if ((i & 32) != 0) {
            i2 = c2256701DUm.LJFF;
        } else {
            i2 = 0;
        }
        if ((i & 64) != 0) {
            z4 = c2256701DUm.LJI;
        } else {
            z4 = false;
        }
        if ((i & 128) != 0) {
            str2 = c2256701DUm.LJII;
        }
        if ((i & 256) != 0) {
            z5 = c2256701DUm.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            l = c2256701DUm.LJIIIZ;
        } else {
            l = null;
        }
        if ((i & 1024) != 0) {
            str3 = c2256701DUm.LJIIJ;
        }
        c2256701DUm.getClass();
        return new C2256701DUm(j, z2, z3, enumC2249731D3r2, enumC1446110njd, i2, z4, str2, z5, l, str3);
    }

    public /* synthetic */ C2256701DUm(long j, boolean z, boolean z2, EnumC1446110njd enumC1446110njd, int i, boolean z3, String str, boolean z4, Long l, String str2, int i2) {
        this(j, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (EnumC2249731D3r) null, enumC1446110njd, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? false : z3, str, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? null : l, (i2 & 1024) != 0 ? null : str2);
    }

    public C2256701DUm(long j, boolean z, boolean z2, EnumC2249731D3r enumC2249731D3r, EnumC1446110njd enumC1446110njd, int i, boolean z3, String str, boolean z4, Long l, String str2) {
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = enumC2249731D3r;
        this.LJ = enumC1446110njd;
        this.LJFF = i;
        this.LJI = z3;
        this.LJII = str;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = l;
        this.LJIIJ = str2;
    }
}

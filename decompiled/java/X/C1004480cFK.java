package X;

/* JADX INFO: renamed from: X.0cFK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004480cFK {
    public final Boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final String LJ;
    public final Boolean LJFF;
    public final Long LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final long LJIIIZ;
    public final int LJIIJ;

    public C1004480cFK() {
        this(null, null, null, null, null, null, null, null, null, 0L, 0, 2047);
    }

    public final String toString() {
        return "PitayaResult(show=" + this.LIZ + ", reason=" + this.LIZIZ + ", traceId=" + this.LIZJ + ", isAvailable=" + this.LIZLLL + ", candidateId=" + this.LJ + ", useDefault=" + this.LJFF + ", nextAvailableTimeStamp=" + this.LJI + ", extraInfo=" + this.LJII + ", triggerSource=" + this.LJIIIIZZ + ", pitayaDuration=" + this.LJIIIZ + ", pitayaCode=" + this.LJIIJ + ')';
    }

    public C1004480cFK(Boolean bool, String str, String str2, Boolean bool2, String str3, Boolean bool3, Long l, String str4, String str5, long j, int i, int i2) {
        bool = (i2 & 1) != 0 ? null : bool;
        str = (i2 & 2) != 0 ? null : str;
        str2 = (i2 & 4) != 0 ? null : str2;
        bool2 = (i2 & 8) != 0 ? null : bool2;
        str3 = (i2 & 16) != 0 ? null : str3;
        bool3 = (i2 & 32) != 0 ? null : bool3;
        l = (i2 & 64) != 0 ? null : l;
        str4 = (i2 & 128) != 0 ? null : str4;
        str5 = (i2 & 256) != 0 ? null : str5;
        j = (i2 & 512) != 0 ? -1L : j;
        i = (i2 & 1024) != 0 ? 0 : i;
        this.LIZ = bool;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = bool2;
        this.LJ = str3;
        this.LJFF = bool3;
        this.LJI = l;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = j;
        this.LJIIJ = i;
    }
}

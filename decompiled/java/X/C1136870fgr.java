package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fgr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136870fgr {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final EnumC1142180fpQ LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1136870fgr)) {
            return false;
        }
        C1136870fgr c1136870fgr = (C1136870fgr) obj;
        return this.LIZ == c1136870fgr.LIZ && this.LIZIZ == c1136870fgr.LIZIZ && this.LIZJ == c1136870fgr.LIZJ && this.LIZLLL == c1136870fgr.LIZLLL && Intrinsics.LJFF(this.LJ, c1136870fgr.LJ) && Intrinsics.LJFF(this.LJFF, c1136870fgr.LJFF) && Intrinsics.LJFF(this.LJI, c1136870fgr.LJI) && Intrinsics.LJFF(this.LJII, c1136870fgr.LJII) && this.LJIIIIZZ == c1136870fgr.LJIIIIZZ;
    }

    public final int hashCode() {
        return (((((((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftPreviewSource(giftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", songId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", moodId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", snippetId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", audioUrl=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", lyricsUrl=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", songName=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", artistName=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", entrySource=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ(C1136870fgr c1136870fgr) {
        if (c1136870fgr == null || this.LIZ != c1136870fgr.LIZ) {
            return false;
        }
        long j = this.LIZJ;
        if (j <= 0 && c1136870fgr.LIZJ <= 0) {
            long j2 = this.LIZLLL;
            if (j2 > 0) {
                long j3 = c1136870fgr.LIZLLL;
                if (j3 > 0) {
                    if (j2 != j3) {
                        return false;
                    }
                    return true;
                }
            }
            long j4 = this.LIZIZ;
            if (j4 > 0) {
                long j5 = c1136870fgr.LIZIZ;
                if (j5 > 0) {
                    if (j4 != j5) {
                        return false;
                    }
                    return true;
                }
            }
            return Intrinsics.LJFF(this.LJ, c1136870fgr.LJ);
        }
        if (j <= 0) {
            return false;
        }
        long j6 = c1136870fgr.LIZJ;
        if (j6 <= 0 || j != j6) {
            return false;
        }
        return true;
    }

    public C1136870fgr(long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, EnumC1142180fpQ enumC1142180fpQ) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = enumC1142180fpQ;
    }
}

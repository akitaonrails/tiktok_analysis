package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lsl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556890Lsl implements InterfaceC543440LTa {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Integer LJIIJJI;
    public final String LJIIL;
    public final Long LJIILIIL;
    public final String LJIILJJIL = null;
    public final String LJIILL;
    public final String LJIILLIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C556890Lsl)) {
            return false;
        }
        C556890Lsl c556890Lsl = (C556890Lsl) obj;
        return Intrinsics.LJFF(this.LIZ, c556890Lsl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c556890Lsl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c556890Lsl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c556890Lsl.LIZLLL) && this.LJ == c556890Lsl.LJ && Intrinsics.LJFF(this.LJFF, c556890Lsl.LJFF) && this.LJI == c556890Lsl.LJI && Intrinsics.LJFF(this.LJII, c556890Lsl.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c556890Lsl.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c556890Lsl.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c556890Lsl.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c556890Lsl.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c556890Lsl.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c556890Lsl.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c556890Lsl.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c556890Lsl.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c556890Lsl.LJIILLIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJ) * 31) + this.LJFF.hashCode()) * 31) + this.LJI) * 31;
        String str2 = this.LJII;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIIIZZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIIIZ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIJ;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.LJIIJJI;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.LJIIL;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.LJIILIIL;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str7 = this.LJIILJJIL;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIILL;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIILLIIL;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        return "AsyncSubTaskEndEvent(clientTaskId=" + this.LIZ + ", taskType=" + this.LIZIZ + ", business=" + this.LIZJ + ", serverTaskType=" + this.LIZLLL + ", status=" + this.LJ + ", serverTaskID=" + this.LJFF + ", isRetry=" + this.LJI + ", creationId=" + this.LJII + ", resourceID=" + this.LJIIIIZZ + ", deviceID=" + this.LJIIIZ + ", userID=" + this.LJIIJ + ", errorCode=" + this.LJIIJJI + ", errorMsg=" + this.LJIIL + ", durationMs=" + this.LJIILIIL + ", enterFrom=" + this.LJIILJJIL + ", logID=" + this.LJIILL + ", triggerType=" + this.LJIILLIIL + ')';
    }

    public C556890Lsl(String str, String str2, String str3, String str4, int i, String str5, int i2, String str6, String str7, String str8, String str9, Integer num, String str10, Long l, String str11, String str12) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = i;
        this.LJFF = str5;
        this.LJI = i2;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = num;
        this.LJIIL = str10;
        this.LJIILIIL = l;
        this.LJIILL = str11;
        this.LJIILLIIL = str12;
    }
}

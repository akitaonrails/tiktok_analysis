package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lsm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556900Lsm implements InterfaceC543440LTa {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final String LJI;
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
        if (!(obj instanceof C556900Lsm)) {
            return false;
        }
        C556900Lsm c556900Lsm = (C556900Lsm) obj;
        return Intrinsics.LJFF(this.LIZ, c556900Lsm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c556900Lsm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c556900Lsm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c556900Lsm.LIZLLL) && this.LJ == c556900Lsm.LJ && Intrinsics.LJFF(this.LJFF, c556900Lsm.LJFF) && Intrinsics.LJFF(this.LJI, c556900Lsm.LJI) && Intrinsics.LJFF(this.LJII, c556900Lsm.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c556900Lsm.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c556900Lsm.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c556900Lsm.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c556900Lsm.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c556900Lsm.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c556900Lsm.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c556900Lsm.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c556900Lsm.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c556900Lsm.LJIILLIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJ) * 31) + this.LJFF.hashCode()) * 31;
        String str2 = this.LJI;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJII;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIIIIZZ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIIZ;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIJ;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.LJIIJJI;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.LJIIL;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.LJIILIIL;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        String str8 = this.LJIILJJIL;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIILL;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIILLIIL;
        return iHashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        return "AsyncTaskEndEvent(clientTaskId=" + this.LIZ + ", taskType=" + this.LIZIZ + ", business=" + this.LIZJ + ", serverTaskType=" + this.LIZLLL + ", status=" + this.LJ + ", serverTaskID=" + this.LJFF + ", creationId=" + this.LJI + ", triggerType=" + this.LJII + ", resourceID=" + this.LJIIIIZZ + ", deviceID=" + this.LJIIIZ + ", userID=" + this.LJIIJ + ", errorCode=" + this.LJIIJJI + ", errorMsg=" + this.LJIIL + ", durationMs=" + this.LJIILIIL + ", enterFrom=" + this.LJIILJJIL + ", logID=" + this.LJIILL + ", isOfflineLoading=" + this.LJIILLIIL + ')';
    }

    public C556900Lsm(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, Long l, String str12, String str13) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = i;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = num;
        this.LJIIL = str11;
        this.LJIILIIL = l;
        this.LJIILL = str12;
        this.LJIILLIIL = str13;
    }
}

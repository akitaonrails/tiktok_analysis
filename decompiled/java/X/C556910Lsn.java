package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lsn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556910Lsn implements InterfaceC543440LTa {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Integer LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Integer LJIIJJI;
    public final String LJIIL;
    public final Long LJIILIIL;
    public final String LJIILJJIL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C556910Lsn)) {
            return false;
        }
        C556910Lsn c556910Lsn = (C556910Lsn) obj;
        return Intrinsics.LJFF(this.LIZ, c556910Lsn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c556910Lsn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c556910Lsn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c556910Lsn.LIZLLL) && Intrinsics.LJFF(this.LJ, c556910Lsn.LJ) && Intrinsics.LJFF(this.LJFF, c556910Lsn.LJFF) && Intrinsics.LJFF(this.LJI, c556910Lsn.LJI) && Intrinsics.LJFF(this.LJII, c556910Lsn.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c556910Lsn.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c556910Lsn.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c556910Lsn.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c556910Lsn.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c556910Lsn.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c556910Lsn.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c556910Lsn.LJIILJJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LJFF.hashCode()) * 31;
        Integer num = this.LJI;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.LJII;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIIZ;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIJ;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.LJIIJJI;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.LJIIL;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.LJIILIIL;
        int iHashCode11 = (iHashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        String str8 = this.LJIILJJIL;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "AsyncTaskCancelEvent(clientTaskId=" + this.LIZ + ", business=" + this.LIZIZ + ", serverTaskID=" + this.LIZJ + ", serverTaskType=" + this.LIZLLL + ", creationId=" + this.LJ + ", taskType=" + this.LJFF + ", status=" + this.LJI + ", triggerType=" + this.LJII + ", resourceID=" + this.LJIIIIZZ + ", deviceID=" + this.LJIIIZ + ", userID=" + this.LJIIJ + ", errorCode=" + this.LJIIJJI + ", errorMsg=" + this.LJIIL + ", durationMs=" + this.LJIILIIL + ", isOfflineLoading=" + this.LJIILJJIL + ')';
    }

    public C556910Lsn(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, Integer num2, String str11, Long l) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = num;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = num2;
        this.LJIIL = str11;
        this.LJIILIIL = l;
    }
}

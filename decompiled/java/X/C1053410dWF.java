package X;

import com.ss.android.ugc.aweme.history.model.AdWebHistoryAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dWF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053410dWF extends AbstractC1053500dWO {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final AdWebHistoryAdInfo LJFF;
    public final Long LJI;
    public final Long LJII;
    public final Long LJIIIIZZ;
    public final Long LJIIIZ;
    public final Integer LJIIJ;
    public final Boolean LJIIJJI;
    public int LJIIL = 0;
    public final int LJIILIIL = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1053410dWF)) {
            return false;
        }
        C1053410dWF c1053410dWF = (C1053410dWF) obj;
        return Intrinsics.LJFF(this.LIZ, c1053410dWF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1053410dWF.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1053410dWF.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1053410dWF.LIZLLL) && Intrinsics.LJFF(this.LJ, c1053410dWF.LJ) && Intrinsics.LJFF(this.LJFF, c1053410dWF.LJFF) && Intrinsics.LJFF(this.LJI, c1053410dWF.LJI) && Intrinsics.LJFF(this.LJII, c1053410dWF.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1053410dWF.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1053410dWF.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1053410dWF.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1053410dWF.LJIIJJI) && this.LJIIL == c1053410dWF.LJIIL;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AdWebHistoryAdInfo adWebHistoryAdInfo = this.LJFF;
        int iHashCode3 = (iHashCode2 + (adWebHistoryAdInfo == null ? 0 : adWebHistoryAdInfo.hashCode())) * 31;
        Long l = this.LJI;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LJII;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.LJIIIZ;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num = this.LJIIJ;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LJIIJJI;
        return ((iHashCode8 + (bool != null ? bool.hashCode() : 0)) * 31) + this.LJIIL;
    }

    public final String toString() {
        return "HistoryRecordItemData(title=" + this.LIZ + ", webUrl=" + this.LIZIZ + ", date=" + this.LIZJ + ", iconUrl=" + this.LIZLLL + ", creativeId=" + this.LJ + ", adWebHistoryAdInfo=" + this.LJFF + ", cursorId=" + this.LJI + ", uniqueId=" + this.LJII + ", requestTime=" + this.LJIIIIZZ + ", order=" + this.LJIIIZ + ", status=" + this.LJIIJ + ", strictUsePureLink=" + this.LJIIJJI + ", clickTimes=" + this.LJIIL + ')';
    }

    @Override // X.AbstractC1053500dWO
    public final int LIZ() {
        return this.LJIILIIL;
    }

    public C1053410dWF(String str, String str2, String str3, String str4, String str5, AdWebHistoryAdInfo adWebHistoryAdInfo, Long l, Long l2, Long l3, Long l4, Integer num, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = adWebHistoryAdInfo;
        this.LJI = l;
        this.LJII = l2;
        this.LJIIIIZZ = l3;
        this.LJIIIZ = l4;
        this.LJIIJ = num;
        this.LJIIJJI = bool;
    }
}

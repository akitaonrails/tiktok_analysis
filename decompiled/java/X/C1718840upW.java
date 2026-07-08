package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0upW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718840upW implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final boolean LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final boolean LLJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1718840upW)) {
            return false;
        }
        C1718840upW c1718840upW = (C1718840upW) obj;
        return Intrinsics.LJFF(this.LL, c1718840upW.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1718840upW.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1718840upW.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1718840upW.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1718840upW.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1718840upW.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1718840upW.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1718840upW.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1718840upW.LLJ) && Intrinsics.LJFF(this.LLJI, c1718840upW.LLJI) && this.LLJIJIL == c1718840upW.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1718840upW.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1718840upW.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1718840upW.LLJILLL) && this.LLJJ == c1718840upW.LLJJ;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LLJI;
        int iHashCode10 = (((iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31;
        String str10 = this.LLJILJIL;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LLJILJILJ;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LLJILLL;
        return ((iHashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJ);
    }

    public final String toString() {
        return "FinishPageData(scene=" + this.LL + ", homePageUrl=" + this.LLILLJJLI + ", previousPageId=" + this.LLILLL + ", enterFrom=" + this.LLILZ + ", userStatus=" + this.LLILZIL + ", activateResult=" + this.LLILZLL + ", title=" + this.LLIZ + ", desc=" + this.LLIZLLLIL + ", resultBtnText=" + this.LLJ + ", boldTuxColor=" + this.LLJI + ", hitMarketing=" + this.LLJIJIL + ", finishPageImageUrl=" + this.LLJILJIL + ", finishPageImageDarkUrl=" + this.LLJILJILJ + ", postGuideJumpSchema=" + this.LLJILLL + ", showClose=" + this.LLJJ + ')';
    }

    public C1718840upW(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = str9;
        this.LLJI = str10;
        this.LLJIJIL = z;
        this.LLJILJIL = str11;
        this.LLJILJILJ = str12;
        this.LLJILLL = str13;
        this.LLJJ = z2;
    }
}

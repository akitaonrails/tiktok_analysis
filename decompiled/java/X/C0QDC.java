package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QDC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDC implements InterfaceC1618170sD9<C0QDC> {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final int LLJI;
    public final String LLJIJIL;

    public C0QDC() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QDC)) {
            return false;
        }
        C0QDC c0qdc = (C0QDC) obj;
        return Intrinsics.LJFF(this.LL, c0qdc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0qdc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0qdc.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0qdc.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0qdc.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0qdc.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0qdc.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0qdc.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0qdc.LLJ) && this.LLJI == c0qdc.LLJI && Intrinsics.LJFF(this.LLJIJIL, c0qdc.LLJIJIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LLJ;
        int iHashCode9 = (((iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.LLJI) * 31;
        String str10 = this.LLJIJIL;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        return "SearchDetailPageCurrentItemState(searchResultId=" + this.LL + ", listItemId=" + this.LLILLJJLI + ", tokenType=" + this.LLILLL + ", awemeType=" + this.LLILZ + ", isInner=" + this.LLILZIL + ", innerSearchId=" + this.LLILZLL + ", slideRank=" + this.LLIZ + ", fullscreenActualRank=" + this.LLIZLLLIL + ", fullscreenActualEnterDocId=" + this.LLJ + ", rankInViewPager=" + this.LLJI + ", aidInViewPager=" + this.LLJIJIL + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C0QDC(int i) {
        this(null, null, null, null, null, null, null, null, null, -1, null);
    }

    public C0QDC(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = str9;
        this.LLJI = i;
        this.LLJIJIL = str10;
        C0P8T.LIZ();
    }

    public static C0QDC LIZ(C0QDC c0qdc, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, int i2) {
        String str11 = str10;
        int i3 = i;
        String str12 = str9;
        String str13 = str8;
        String str14 = str7;
        String str15 = str6;
        String str16 = str5;
        String str17 = str4;
        String str18 = str3;
        String str19 = str2;
        String str20 = str;
        if ((i2 & 1) != 0) {
            str20 = c0qdc.LL;
        }
        if ((i2 & 2) != 0) {
            str19 = c0qdc.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            str18 = c0qdc.LLILLL;
        }
        if ((i2 & 8) != 0) {
            str17 = c0qdc.LLILZ;
        }
        if ((i2 & 16) != 0) {
            str16 = c0qdc.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            str15 = c0qdc.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            str14 = c0qdc.LLIZ;
        }
        if ((i2 & 128) != 0) {
            str13 = c0qdc.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            str12 = c0qdc.LLJ;
        }
        if ((i2 & 512) != 0) {
            i3 = c0qdc.LLJI;
        }
        if ((i2 & 1024) != 0) {
            str11 = c0qdc.LLJIJIL;
        }
        c0qdc.getClass();
        return new C0QDC(str20, str19, str18, str17, str16, str15, str14, str13, str12, i3, str11);
    }
}

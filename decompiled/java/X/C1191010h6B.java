package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h6B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191010h6B implements InterfaceC111300bX {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final Long LL;
    public final EnumC1190580h5U LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Integer LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;

    public C1191010h6B() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191010h6B)) {
            return false;
        }
        C1191010h6B c1191010h6B = (C1191010h6B) obj;
        return Intrinsics.LJFF(this.LL, c1191010h6B.LL) && this.LLILLJJLI == c1191010h6B.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1191010h6B.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1191010h6B.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1191010h6B.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1191010h6B.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1191010h6B.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1191010h6B.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1191010h6B.LLJ) && Intrinsics.LJFF(this.LLJI, c1191010h6B.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1191010h6B.LLJIJIL);
    }

    public final int hashCode() {
        Long l = this.LL;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        EnumC1190580h5U enumC1190580h5U = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (enumC1190580h5U == null ? 0 : enumC1190580h5U.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLJI;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLJIJIL;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "PoiReviewHelpfulHierarchyData(likedCount=" + this.LL + ", reviewStatus=" + this.LLILLJJLI + ", reviewId=" + this.LLILLL + ", localReviewFlag=" + this.LLILZ + ", reviewOrder=" + this.LLILZIL + ", enterFrom=" + this.LLILZLL + ", enterMethod=" + this.LLIZ + ", collectInfo=" + this.LLIZLLLIL + ", logId=" + this.LLJ + ", fromGroupId=" + this.LLJI + ", enterPosition=" + this.LLJIJIL + ')';
    }

    public C1191010h6B(Long l, EnumC1190580h5U enumC1190580h5U, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.LL = l;
        this.LLILLJJLI = enumC1190580h5U;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = num;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = str7;
        this.LLJIJIL = str8;
    }
}

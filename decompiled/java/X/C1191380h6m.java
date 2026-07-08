package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191380h6m implements InterfaceC111300bX {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final Long LL;
    public final EnumC1191410h6p LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Integer LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;

    public C1191380h6m() {
        this(null, null, null, null, null, null, null, null, null, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191380h6m)) {
            return false;
        }
        C1191380h6m c1191380h6m = (C1191380h6m) obj;
        return Intrinsics.LJFF(this.LL, c1191380h6m.LL) && this.LLILLJJLI == c1191380h6m.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1191380h6m.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1191380h6m.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1191380h6m.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1191380h6m.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1191380h6m.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1191380h6m.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1191380h6m.LLJ) && Intrinsics.LJFF(this.LLJI, c1191380h6m.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1191380h6m.LLJIJIL);
    }

    public final int hashCode() {
        Long l = this.LL;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        EnumC1191410h6p enumC1191410h6p = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (enumC1191410h6p == null ? 0 : enumC1191410h6p.hashCode())) * 31;
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
        return "PoiReviewHelpfulBtnHierarchyData(likedCount=" + this.LL + ", reviewStatus=" + this.LLILLJJLI + ", reviewId=" + this.LLILLL + ", localReviewFlag=" + this.LLILZ + ", reviewOrder=" + this.LLILZIL + ", enterFrom=" + this.LLILZLL + ", enterMethod=" + this.LLIZ + ", collectInfo=" + this.LLIZLLLIL + ", logId=" + this.LLJ + ", fromGroupId=" + this.LLJI + ", enterPosition=" + this.LLJIJIL + ')';
    }

    public C1191380h6m(Long l, EnumC1191410h6p enumC1191410h6p, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        l = (i & 1) != 0 ? null : l;
        enumC1191410h6p = (i & 2) != 0 ? null : enumC1191410h6p;
        str = (i & 4) != 0 ? null : str;
        num = (i & 16) != 0 ? null : num;
        str2 = (i & 32) != 0 ? null : str2;
        str3 = (i & 64) != 0 ? null : str3;
        str4 = (i & 128) != 0 ? null : str4;
        str5 = (i & 256) != 0 ? null : str5;
        str6 = (i & 512) != 0 ? null : str6;
        str7 = (i & 1024) != 0 ? null : str7;
        this.LL = l;
        this.LLILLJJLI = enumC1191410h6p;
        this.LLILLL = str;
        this.LLILZ = null;
        this.LLILZIL = num;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = str6;
        this.LLJIJIL = str7;
    }
}

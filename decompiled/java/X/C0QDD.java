package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QDD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDD implements C0PWT {
    public static final /* synthetic */ int LLJI = 0;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;

    public C0QDD() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QDD)) {
            return false;
        }
        C0QDD c0qdd = (C0QDD) obj;
        return Intrinsics.LJFF(this.LL, c0qdd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0qdd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0qdd.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0qdd.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0qdd.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0qdd.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0qdd.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0qdd.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0qdd.LLJ);
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
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSearchDetailCurrentItemAction(searchResultId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listItemId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", tokenType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isInner=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", innerSearchId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", slideRank=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", fullscreenActualRank=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", fullscreenActualEnterDocId=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().ov1().LIZIZ(C13LE.LIZ(C0QDD.class), AFwS293S0000000_10.get$arr$(169));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0QDD(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = str9;
    }
}

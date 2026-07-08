package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ufT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712610ufT implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public C1712610ufT() {
        this(null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1712610ufT)) {
            return false;
        }
        C1712610ufT c1712610ufT = (C1712610ufT) obj;
        return Intrinsics.LJFF(this.LL, c1712610ufT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1712610ufT.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1712610ufT.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1712610ufT.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1712610ufT.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1712610ufT.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1712610ufT.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1712610ufT.LLIZLLLIL);
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
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftCardCheckoutSource(sessionId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", merchantId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", orderId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", host=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", traceId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", previousPageId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", entrance=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", merchantUserId=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1712610ufT(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
    }
}

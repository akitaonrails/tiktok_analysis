package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ibr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249090ibr<T> implements InterfaceC111300bX {
    public T LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Boolean LLILZ;
    public final Boolean LLILZIL;
    public final String LLILZLL;
    public final HashMap<String, String> LLIZ;
    public final C1252230igv LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1249090ibr)) {
            return false;
        }
        C1249090ibr c1249090ibr = (C1249090ibr) obj;
        return Intrinsics.LJFF(this.LL, c1249090ibr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1249090ibr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1249090ibr.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1249090ibr.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1249090ibr.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1249090ibr.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1249090ibr.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1249090ibr.LLIZLLLIL);
    }

    public final int hashCode() {
        T t = this.LL;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.LLILZLL;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LLIZ.hashCode()) * 31;
        C1252230igv c1252230igv = this.LLIZLLLIL;
        return iHashCode6 + (c1252230igv != null ? c1252230igv.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileUserData(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isMine=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", delayProfileLoading=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", noticeType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", userProfileInfo=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1249090ibr(Object obj, C1252230igv c1252230igv, int i) {
        Boolean bool;
        Boolean bool2;
        HashMap map;
        C1252230igv c1252230igv2 = c1252230igv;
        if ((i & 8) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = Boolean.FALSE;
        } else {
            bool2 = null;
        }
        if ((i & 64) != 0) {
            map = new HashMap();
        } else {
            map = null;
        }
        this(obj, null, null, bool, bool2, null, map, (i & 128) != 0 ? null : c1252230igv2);
    }

    public C1249090ibr(T t, String str, String str2, Boolean bool, Boolean bool2, String str3, HashMap<String, String> map, C1252230igv c1252230igv) {
        this.LL = t;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = bool;
        this.LLILZIL = bool2;
        this.LLILZLL = str3;
        this.LLIZ = map;
        this.LLIZLLLIL = c1252230igv;
    }
}

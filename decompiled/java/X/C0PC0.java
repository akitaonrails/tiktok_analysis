package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PC0, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PC0 implements InterfaceC1618170sD9<C0PC0> {
    public final String LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Boolean LLILZLL;
    public final long LLIZ;
    public final Map<String, String> LLIZLLLIL;

    public C0PC0() {
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
        if (!(obj instanceof C0PC0)) {
            return false;
        }
        C0PC0 c0pc0 = (C0PC0) obj;
        return Intrinsics.LJFF(this.LL, c0pc0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0pc0.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0pc0.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0pc0.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0pc0.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0pc0.LLILZLL) && this.LLIZ == c0pc0.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c0pc0.LLIZLLLIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.LLILZLL;
        return ((((iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchIdActivatedState(activatedSearchId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", entityId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", topBarType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", topBarId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", topBarKeyword=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hasTopBar=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", searchIdViewStartTime=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", extraMobParams=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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

    public /* synthetic */ C0PC0(int i) {
        this(null, null, null, null, null, null, 0L, C2097608Jq.LJ());
    }

    public C0PC0(String str, String str2, Integer num, String str3, String str4, Boolean bool, long j, Map<String, String> map) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = num;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = bool;
        this.LLIZ = j;
        this.LLIZLLLIL = map;
        C0P8T.LIZ();
    }

    public static C0PC0 LIZ(C0PC0 c0pc0, String str, Integer num, String str2, String str3, Boolean bool, long j, int i) {
        String str4;
        Boolean bool2 = bool;
        String str5 = str3;
        String str6 = str2;
        long j2 = j;
        Integer num2 = num;
        String str7 = str;
        Map<String, String> map = null;
        if ((i & 1) != 0) {
            str4 = c0pc0.LL;
        } else {
            str4 = null;
        }
        if ((i & 2) != 0) {
            str7 = c0pc0.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            num2 = c0pc0.LLILLL;
        }
        if ((i & 8) != 0) {
            str6 = c0pc0.LLILZ;
        }
        if ((i & 16) != 0) {
            str5 = c0pc0.LLILZIL;
        }
        if ((i & 32) != 0) {
            bool2 = c0pc0.LLILZLL;
        }
        if ((i & 64) != 0) {
            j2 = c0pc0.LLIZ;
        }
        if ((i & 128) != 0) {
            map = c0pc0.LLIZLLLIL;
        }
        c0pc0.getClass();
        return new C0PC0(str4, str7, num2, str6, str5, bool2, j2, map);
    }
}

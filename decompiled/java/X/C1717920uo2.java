package X;

import com.ss.android.ugc.aweme.biz.bnpl.network.model.ConfirmRegisterMobileResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uo2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717920uo2 implements InterfaceC0148002o {
    public final C0TUO LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final EnumC1717850unv LLILZIL;
    public ConfirmRegisterMobileResponse LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final int LLJ;
    public final C2218561BsM LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1717920uo2)) {
            return false;
        }
        C1717920uo2 c1717920uo2 = (C1717920uo2) obj;
        return this.LL == c1717920uo2.LL && Intrinsics.LJFF(this.LLILLJJLI, c1717920uo2.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1717920uo2.LLILLL) && this.LLILZ == c1717920uo2.LLILZ && this.LLILZIL == c1717920uo2.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1717920uo2.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1717920uo2.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1717920uo2.LLIZLLLIL) && this.LLJ == c1717920uo2.LLJ && Intrinsics.LJFF(this.LLJI, c1717920uo2.LLJI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31;
        ConfirmRegisterMobileResponse confirmRegisterMobileResponse = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (confirmRegisterMobileResponse == null ? 0 : confirmRegisterMobileResponse.hashCode())) * 31;
        String str3 = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLIZLLLIL;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LLJ) * 31;
        C2218561BsM c2218561BsM = this.LLJI;
        return iHashCode6 + (c2218561BsM != null ? c2218561BsM.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhoneNumberContentState(mode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", countryCode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", countryAlpha2=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", needClearError=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", networkStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", confirmResp=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", errorContent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", phoneCountryCodeNotMatchHint=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", phoneNumberHint=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1717920uo2(C0TUO c0tuo, String str, String str2, boolean z, EnumC1717850unv enumC1717850unv, ConfirmRegisterMobileResponse confirmRegisterMobileResponse, String str3, String str4, int i, C2218561BsM c2218561BsM) {
        this.LL = c0tuo;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = enumC1717850unv;
        this.LLILZLL = confirmRegisterMobileResponse;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = i;
        this.LLJI = c2218561BsM;
    }

    public static C1717920uo2 LIZ(C1717920uo2 c1717920uo2, C0TUO c0tuo, String str, String str2, boolean z, EnumC1717850unv enumC1717850unv, ConfirmRegisterMobileResponse confirmRegisterMobileResponse, String str3, String str4, int i, C2218561BsM c2218561BsM, int i2) {
        C2218561BsM c2218561BsM2 = c2218561BsM;
        int i3 = i;
        String str5 = str4;
        String str6 = str3;
        ConfirmRegisterMobileResponse confirmRegisterMobileResponse2 = confirmRegisterMobileResponse;
        EnumC1717850unv enumC1717850unv2 = enumC1717850unv;
        boolean z2 = z;
        String str7 = str2;
        String str8 = str;
        C0TUO c0tuo2 = c0tuo;
        if ((i2 & 1) != 0) {
            c0tuo2 = c1717920uo2.LL;
        }
        if ((i2 & 2) != 0) {
            str8 = c1717920uo2.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            str7 = c1717920uo2.LLILLL;
        }
        if ((i2 & 8) != 0) {
            z2 = c1717920uo2.LLILZ;
        }
        if ((i2 & 16) != 0) {
            enumC1717850unv2 = c1717920uo2.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            confirmRegisterMobileResponse2 = c1717920uo2.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            str6 = c1717920uo2.LLIZ;
        }
        if ((i2 & 128) != 0) {
            str5 = c1717920uo2.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            i3 = c1717920uo2.LLJ;
        }
        if ((i2 & 512) != 0) {
            c2218561BsM2 = c1717920uo2.LLJI;
        }
        c1717920uo2.getClass();
        return new C1717920uo2(c0tuo2, str8, str7, z2, enumC1717850unv2, confirmRegisterMobileResponse2, str6, str5, i3, c2218561BsM2);
    }
}

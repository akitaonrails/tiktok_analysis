package X;

import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.ConfirmRegisterMobileResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uon, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718390uon implements InterfaceC0148002o {
    public final EnumC488160JCk LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Boolean LLILZIL;
    public BaseResponse<ConfirmRegisterMobileResponse> LLILZLL;

    public C1718390uon() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1718390uon)) {
            return false;
        }
        C1718390uon c1718390uon = (C1718390uon) obj;
        return this.LL == c1718390uon.LL && Intrinsics.LJFF(this.LLILLJJLI, c1718390uon.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1718390uon.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1718390uon.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1718390uon.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1718390uon.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseResponse<ConfirmRegisterMobileResponse> baseResponse = this.LLILZLL;
        return iHashCode5 + (baseResponse != null ? baseResponse.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserTTMobileState(loadingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errorContent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isTTAccountError=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", responseBody=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1718390uon(int i) {
        this(EnumC488160JCk.SUCCESS, null, null, null, null, null);
    }

    public C1718390uon(EnumC488160JCk enumC488160JCk, String str, String str2, String str3, Boolean bool, BaseResponse<ConfirmRegisterMobileResponse> baseResponse) {
        this.LL = enumC488160JCk;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = bool;
        this.LLILZLL = baseResponse;
    }

    public static C1718390uon LIZ(C1718390uon c1718390uon, EnumC488160JCk enumC488160JCk, String str, String str2, String str3, Boolean bool, int i) {
        BaseResponse<ConfirmRegisterMobileResponse> baseResponse;
        Boolean bool2 = bool;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        EnumC488160JCk enumC488160JCk2 = enumC488160JCk;
        if ((i & 1) != 0) {
            enumC488160JCk2 = c1718390uon.LL;
        }
        if ((i & 2) != 0) {
            str6 = c1718390uon.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str5 = c1718390uon.LLILLL;
        }
        if ((i & 8) != 0) {
            str4 = c1718390uon.LLILZ;
        }
        if ((i & 16) != 0) {
            bool2 = c1718390uon.LLILZIL;
        }
        if ((i & 32) != 0) {
            baseResponse = c1718390uon.LLILZLL;
        } else {
            baseResponse = null;
        }
        c1718390uon.getClass();
        return new C1718390uon(enumC488160JCk2, str6, str5, str4, bool2, baseResponse);
    }
}

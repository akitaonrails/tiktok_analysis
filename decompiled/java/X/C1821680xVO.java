package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.smb.SMBThirdPartyLinkGetBySkuResponse;

/* JADX INFO: renamed from: X.0xVO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821680xVO implements InterfaceC0148002o {
    public final SMBThirdPartyLinkGetBySkuResponse.ResponseData LL;
    public final EnumC1821690xVP LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public C1821680xVO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1821680xVO)) {
            return false;
        }
        C1821680xVO c1821680xVO = (C1821680xVO) obj;
        return Intrinsics.LJFF(this.LL, c1821680xVO.LL) && this.LLILLJJLI == c1821680xVO.LLILLJJLI && this.LLILLL == c1821680xVO.LLILLL && this.LLILZ == c1821680xVO.LLILZ;
    }

    public final int hashCode() {
        SMBThirdPartyLinkGetBySkuResponse.ResponseData responseData = this.LL;
        return ((((((responseData == null ? 0 : responseData.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsThirdPartyLinkVmState(responseData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", canGoBack=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", canGoForward=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1821680xVO(int i) {
        this(null, EnumC1821690xVP.INIT, false, false);
    }

    public C1821680xVO(SMBThirdPartyLinkGetBySkuResponse.ResponseData responseData, EnumC1821690xVP enumC1821690xVP, boolean z, boolean z2) {
        this.LL = responseData;
        this.LLILLJJLI = enumC1821690xVP;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    public static C1821680xVO LIZ(C1821680xVO c1821680xVO, SMBThirdPartyLinkGetBySkuResponse.ResponseData responseData, EnumC1821690xVP enumC1821690xVP, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            responseData = c1821680xVO.LL;
        }
        if ((i & 2) != 0) {
            enumC1821690xVP = c1821680xVO.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c1821680xVO.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c1821680xVO.LLILZ;
        }
        c1821680xVO.getClass();
        return new C1821680xVO(responseData, enumC1821690xVP, z, z2);
    }
}

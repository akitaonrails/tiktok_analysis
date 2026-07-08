package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.AgreementConfiguration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentGuideModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722180uuu implements InterfaceC111300bX {
    public final String LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final GeneralPostPaymentGuideModel LLILZLL;
    public final AgreementConfiguration LLIZ;
    public final String LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1722180uuu)) {
            return false;
        }
        C1722180uuu c1722180uuu = (C1722180uuu) obj;
        return Intrinsics.LJFF(this.LL, c1722180uuu.LL) && this.LLILLJJLI == c1722180uuu.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1722180uuu.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1722180uuu.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1722180uuu.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1722180uuu.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1722180uuu.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1722180uuu.LLIZLLLIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        String str3 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        GeneralPostPaymentGuideModel generalPostPaymentGuideModel = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (generalPostPaymentGuideModel == null ? 0 : generalPostPaymentGuideModel.hashCode())) * 31;
        AgreementConfiguration agreementConfiguration = this.LLIZ;
        return ((iHashCode4 + (agreementConfiguration != null ? agreementConfiguration.hashCode() : 0)) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GeneralPostPaymentGuideData(source=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", useCloseIcon=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", merchantAgreementId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", agreementType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", riskInfo=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", model=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", configuration=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1722180uuu(String str, boolean z, String str2, String str3, String str4, GeneralPostPaymentGuideModel generalPostPaymentGuideModel, AgreementConfiguration agreementConfiguration, String str5) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = generalPostPaymentGuideModel;
        this.LLIZ = agreementConfiguration;
        this.LLIZLLLIL = str5;
    }
}

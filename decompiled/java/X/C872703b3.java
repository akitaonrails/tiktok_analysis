package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03b3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C872703b3 implements InterfaceC111300bX {
    public final PaymentMethod LL;
    public final EnterParams LLILLJJLI;
    public final EnumC865103Zp LLILLL;
    public final EnumC872903b5 LLILZ;
    public final Function0<Unit> LLILZIL;
    public final InterfaceC871003am LLILZLL;
    public final String LLIZ;
    public final ButtonStyle LLIZLLLIL;
    public final PaymentInfo LLJ;
    public final EnumC865103Zp LLJI;
    public final InstallmentPlan LLJIJIL;
    public final String LLJILJIL;

    public C872703b3() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C872703b3)) {
            return false;
        }
        C872703b3 c872703b3 = (C872703b3) obj;
        return Intrinsics.LJFF(this.LL, c872703b3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c872703b3.LLILLJJLI) && this.LLILLL == c872703b3.LLILLL && this.LLILZ == c872703b3.LLILZ && Intrinsics.LJFF(this.LLILZIL, c872703b3.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c872703b3.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c872703b3.LLIZ) && this.LLIZLLLIL == c872703b3.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c872703b3.LLJ) && this.LLJI == c872703b3.LLJI && Intrinsics.LJFF(this.LLJIJIL, c872703b3.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c872703b3.LLJILJIL);
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LL;
        int iHashCode = (paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31;
        EnterParams enterParams = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (enterParams == null ? 0 : enterParams.hashCode())) * 31;
        EnumC865103Zp enumC865103Zp = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (enumC865103Zp == null ? 0 : enumC865103Zp.hashCode())) * 31;
        EnumC872903b5 enumC872903b5 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (enumC872903b5 == null ? 0 : enumC872903b5.hashCode())) * 31;
        Function0<Unit> function0 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (function0 == null ? 0 : function0.hashCode())) * 31;
        InterfaceC871003am interfaceC871003am = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (interfaceC871003am == null ? 0 : interfaceC871003am.hashCode())) * 31;
        String str = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        ButtonStyle buttonStyle = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
        PaymentInfo paymentInfo = this.LLJ;
        int iHashCode9 = (iHashCode8 + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31;
        EnumC865103Zp enumC865103Zp2 = this.LLJI;
        int iHashCode10 = (iHashCode9 + (enumC865103Zp2 == null ? 0 : enumC865103Zp2.hashCode())) * 31;
        InstallmentPlan installmentPlan = this.LLJIJIL;
        int iHashCode11 = (iHashCode10 + (installmentPlan == null ? 0 : installmentPlan.hashCode())) * 31;
        String str2 = this.LLJILJIL;
        return iHashCode11 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "BankInstallmentHierarchyData(cciPaymentMethod=" + this.LL + ", enterParams=" + this.LLILLJJLI + ", openType=" + this.LLILLL + ", pageType=" + this.LLILZ + ", dismissParent=" + this.LLILZIL + ", installmentProcessor=" + this.LLILZLL + ", countryCode=" + this.LLIZ + ", style=" + this.LLIZLLLIL + ", originalPaymentInfo=" + this.LLJ + ", parentOpenType=" + this.LLJI + ", selectedInstallmentPlan=" + this.LLJIJIL + ", recommendInstallmentTenure=" + this.LLJILJIL + ')';
    }

    public C872703b3(PaymentMethod paymentMethod, EnterParams enterParams, EnumC865103Zp enumC865103Zp, EnumC872903b5 enumC872903b5, Function0<Unit> function0, InterfaceC871003am interfaceC871003am, String str, ButtonStyle buttonStyle, PaymentInfo paymentInfo, EnumC865103Zp enumC865103Zp2, InstallmentPlan installmentPlan, String str2) {
        this.LL = paymentMethod;
        this.LLILLJJLI = enterParams;
        this.LLILLL = enumC865103Zp;
        this.LLILZ = enumC872903b5;
        this.LLILZIL = function0;
        this.LLILZLL = interfaceC871003am;
        this.LLIZ = str;
        this.LLIZLLLIL = buttonStyle;
        this.LLJ = paymentInfo;
        this.LLJI = enumC865103Zp2;
        this.LLJIJIL = installmentPlan;
        this.LLJILJIL = str2;
    }
}

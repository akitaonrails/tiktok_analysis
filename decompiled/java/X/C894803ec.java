package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.CreditCardInstallmentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C894803ec {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(FragmentManager fragmentManager, PaymentMethod paymentMethod, EnterParams enterParams, Function0 function0, String str, EnumC872903b5 enumC872903b5) {
        CCDCAddCardHalfFragment cCDCAddCardHalfFragment = new CCDCAddCardHalfFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("needs_dim", false);
        cCDCAddCardHalfFragment.setArguments(bundle);
        cCDCAddCardHalfFragment.LLJJIJIIJIL = paymentMethod;
        cCDCAddCardHalfFragment.LLJJIJIL = enterParams;
        cCDCAddCardHalfFragment.LLJJJJ = function0;
        cCDCAddCardHalfFragment.LLJJJ = str;
        cCDCAddCardHalfFragment.LLJJJIL = enumC872903b5;
        cCDCAddCardHalfFragment.show(fragmentManager, "ccdc_add_card_half_fragment");
        C03SY.LIZ.getClass();
        C03SY.LJJ("");
    }

    public static void LIZIZ(FragmentManager fragmentManager, PaymentMethod paymentMethod, EnterParams enterParams, Function0 function0, EnumC865103Zp enumC865103Zp, EnumC872903b5 enumC872903b5, String str, ButtonStyle buttonStyle, PaymentInfo paymentInfo, EnumC865103Zp enumC865103Zp2, C863703Zb c863703Zb, InstallmentPlan installmentPlan, String str2, int i) {
        Function0 function02 = function0;
        EnumC865103Zp enumC865103Zp3 = enumC865103Zp;
        EnumC872903b5 enumC872903b52 = enumC872903b5;
        String str3 = str;
        ButtonStyle buttonStyle2 = buttonStyle;
        PaymentInfo paymentInfo2 = paymentInfo;
        EnumC865103Zp enumC865103Zp4 = enumC865103Zp2;
        C863703Zb c863703Zb2 = c863703Zb;
        InstallmentPlan installmentPlan2 = installmentPlan;
        String str4 = null;
        if ((i & 8) != 0) {
            function02 = null;
        }
        if ((i & 16) != 0) {
            enumC865103Zp3 = EnumC865103Zp.SELECT_BANK_INSTALLMENT_SEA;
        }
        if ((i & 32) != 0) {
            enumC872903b52 = EnumC872903b5.ADD_CCI;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            buttonStyle2 = null;
        }
        if ((i & 256) != 0) {
            paymentInfo2 = null;
        }
        if ((i & 512) != 0) {
            enumC865103Zp4 = null;
        }
        if ((i & 1024) != 0) {
            c863703Zb2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            installmentPlan2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0) {
            str4 = str2;
        }
        CreditCardInstallmentFragment creditCardInstallmentFragment = new CreditCardInstallmentFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("needs_dim", false);
        creditCardInstallmentFragment.setArguments(bundle);
        creditCardInstallmentFragment.LLJIJIL = paymentMethod;
        creditCardInstallmentFragment.LLJILJIL = enterParams;
        creditCardInstallmentFragment.LLJJI = function02;
        creditCardInstallmentFragment.LLJILJILJ = enumC865103Zp3;
        creditCardInstallmentFragment.LLJJ = enumC872903b52;
        creditCardInstallmentFragment.LLJJIII = str3;
        creditCardInstallmentFragment.LLJJIJI = buttonStyle2;
        creditCardInstallmentFragment.LLJJIJIIJIL = fragmentManager;
        creditCardInstallmentFragment.LLJJIJIL = paymentInfo2;
        creditCardInstallmentFragment.LLJILLL = enumC865103Zp4;
        creditCardInstallmentFragment.LLJJJ = c863703Zb2;
        creditCardInstallmentFragment.LLJJJIL = installmentPlan2;
        creditCardInstallmentFragment.LLJJJJ = str4;
        creditCardInstallmentFragment.show(fragmentManager, "cci_add_card_half_fragment");
        C03SY.LIZ.getClass();
        C03SY.LJJ("");
    }
}

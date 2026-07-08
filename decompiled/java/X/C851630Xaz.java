package X;

import Y.AfS182S0100000_13;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ICoinEmailAccountService;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Set;

/* JADX INFO: renamed from: X.0Xaz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851630Xaz {
    public static final C851630Xaz LIZ = new C851630Xaz();

    public static void LIZ(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2, String str3, String str4) {
        Bundle arguments;
        Bundle arguments2;
        if (str3 != null && (arguments2 = baseAccountFlowFragment.getArguments()) != null) {
            C786410Ut5.LJJJI("verify_method", str3, arguments2);
        }
        Set<String> set = C1260730iud.LIZ;
        if (!C851730Xb9.LIZIZ() || ((arguments = baseAccountFlowFragment.getArguments()) != null && arguments.getBoolean("IS_AGE_GATE_PASSED"))) {
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            EnumC852660Xce enumC852660XceSR = baseAccountFlowFragment.SR();
            EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = baseAccountFlowFragment.LLJJLIIIJLLLLLLLZ();
            ICoinEmailAccountService iCoinEmailAccountService = (ICoinEmailAccountService) PluggableExtentionKt.pluggableSpi$default(ICoinEmailAccountService.class, false, false, false, 14, null);
            if (iCoinEmailAccountService != null) {
                iCoinEmailAccountService.LIZ();
            }
            c0xz4.getClass();
            C0XZ4.LJJJIL(baseAccountFlowFragment, baseAccountFlowFragment, str, str2, enumC852660XceSR, enumC852910Xd3LLJJLIIIJLLLLLLLZ, str3, str4, 27, null).LJIIIIZZ(new AfS182S0100000_13(baseAccountFlowFragment, 47)).LJIILL();
            return;
        }
        Bundle arguments3 = baseAccountFlowFragment.getArguments();
        if (arguments3 == null) {
            arguments3 = new Bundle();
        }
        C786410Ut5.LJJJI("code", str2, arguments3);
        C786410Ut5.LJJJI("input_method", str3, arguments3);
        arguments3.putBoolean("email_otp_signup", true);
        arguments3.putInt("next_page", EnumC852910Xd3.AGE_GATE_SIGN_UP.getValue());
        baseAccountFlowFragment.fo(arguments3);
    }
}

package X;

import Y.AfS64S0400000_13;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ICoinEmailAccountService;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AwS222S0300000_13;

/* JADX INFO: renamed from: X.0Xay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851620Xay {
    public static void LIZ(InterfaceC851650Xb1 interfaceC851650Xb1, EnumC852910Xd3 enumC852910Xd3, Bundle bundle, C851660Xb2 c851660Xb2) {
        String strUR;
        InputCodeFragmentV2 inputCodeFragmentV2;
        C851990XbZ c851990XbZ = C851990XbZ.LIZ;
        EnumC851960XbW enumC851960XbW = EnumC851960XbW.VERIFY_EMAIL_CODE;
        c851990XbZ.getClass();
        C851990XbZ.LIZ(enumC852910Xd3, enumC851960XbW);
        BaseAccountFlowFragment currentFragment = c851660Xb2.getCurrentFragment();
        if (currentFragment != null) {
            C852810Xct.LIZ.getClass();
            String strLJ = C852810Xct.LJ(bundle);
            bundle.putBoolean("IS_AGE_GATE_PASSED", true);
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            String string = bundle.getString("code", "");
            EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
            String string2 = bundle.getString("verify_method", "code");
            if (!(currentFragment instanceof InputCodeFragmentV2) || (inputCodeFragmentV2 = (InputCodeFragmentV2) currentFragment) == null || (strUR = inputCodeFragmentV2.mT()) == null) {
                strUR = currentFragment.UR();
            }
            ICoinEmailAccountService iCoinEmailAccountService = (ICoinEmailAccountService) PluggableExtentionKt.pluggableSpi$default(ICoinEmailAccountService.class, false, false, false, 14, null);
            if (iCoinEmailAccountService != null) {
                iCoinEmailAccountService.LIZ();
            }
            AwS222S0300000_13 awS222S0300000_13 = new AwS222S0300000_13(interfaceC851650Xb1, enumC852910Xd3, currentFragment, c851660Xb2, 1);
            c0xz4.getClass();
            C0XZ4.LJJJIL(currentFragment, currentFragment, strLJ, string, enumC852660Xce, enumC852910Xd3, string2, strUR, 27, awS222S0300000_13).LJIIIIZZ(new AfS64S0400000_13(interfaceC851650Xb1, enumC852910Xd3, currentFragment, bundle, c851660Xb2, 1)).LJIILL();
        }
    }
}

package X;

import android.content.Context;
import androidx.fragment.app.SAFTikTokFragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.account.main.AgeGateSAFWrapperFragment;
import com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10TJ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10TJ extends C09AY implements Function0<InterfaceC427710Gpt> {
    public final /* synthetic */ LoginAndConsentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10TJ(LoginAndConsentAssem loginAndConsentAssem) {
        super(0);
        this.LL = loginAndConsentAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC427710Gpt invoke() {
        final LoginAndConsentAssem loginAndConsentAssem = this.LL;
        return new InterfaceC427710Gpt() { // from class: X.10Sl
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                SAFTikTokFragment sAFTikTokFragment;
                C19EG c19egLIZIZ;
                if (i != 4 && i != 12) {
                    return;
                }
                IRegistrationAgeGateService iRegistrationAgeGateService = (IRegistrationAgeGateService) loginAndConsentAssem.LLILZIL.getValue();
                if (iRegistrationAgeGateService != null) {
                    iRegistrationAgeGateService.dismiss();
                }
                Context context = loginAndConsentAssem.getContext();
                InterfaceC214902198i interfaceC214902198iLJIILLIIL = null;
                if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                    interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19egLIZIZ);
                }
                if (!(interfaceC214902198iLJIILLIIL instanceof AgeGateSAFWrapperFragment) || (sAFTikTokFragment = (SAFTikTokFragment) interfaceC214902198iLJIILLIIL) == null) {
                    return;
                }
                sAFTikTokFragment.finish();
            }
        };
    }
}

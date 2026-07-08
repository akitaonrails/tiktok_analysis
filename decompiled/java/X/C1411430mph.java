package X;

import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.google.gson.Gson;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411430mph extends C09AY implements Function2<SMBOptInStep, String, String> {
    public final /* synthetic */ PcsOnboardingVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411430mph(PcsOnboardingVM pcsOnboardingVM) {
        super(2);
        this.LL = pcsOnboardingVM;
    }

    @Override // kotlin.jvm.functions.Function2
    public final String invoke(SMBOptInStep sMBOptInStep, String str) {
        int i;
        SMBOptInStep sMBOptInStep2 = sMBOptInStep;
        String str2 = str;
        Gson gson = C1822270xWL.LIZ;
        String strLJIJI = this.LL.LLJIJIL;
        if (strLJIJI.length() == 0) {
            strLJIJI = C497740JfY.LJIJI(2131853165);
        }
        PcsOnboardingVM pcsOnboardingVM = this.LL;
        String strLJIJI2 = pcsOnboardingVM.LLJILJIL;
        if (strLJIJI2.length() == 0) {
            int iLIZJ = C1122150fJ7.LIZJ(pcsOnboardingVM.EQ2());
            if (iLIZJ != 1 && iLIZJ != 2) {
                if (iLIZJ != 3) {
                    i = 2131855937;
                } else {
                    i = 2131855938;
                }
            } else {
                i = 2131855939;
            }
            strLJIJI2 = C497740JfY.LJIJI(i);
        }
        PcsOnboardingVM pcsOnboardingVM2 = this.LL;
        return C1822270xWL.LJII(pcsOnboardingVM2.LLJJI, strLJIJI, strLJIJI2, sMBOptInStep2.skuId, pcsOnboardingVM2.DQ2().getShowEntrance(), str2);
    }
}

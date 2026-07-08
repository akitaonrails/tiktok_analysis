package X;

import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.google.gson.Gson;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mpi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411440mpi extends C09AY implements Function2<SMBOptInStep, String, String> {
    public final /* synthetic */ PcsOnboardingVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411440mpi(PcsOnboardingVM pcsOnboardingVM) {
        super(2);
        this.LL = pcsOnboardingVM;
    }

    @Override // kotlin.jvm.functions.Function2
    public final String invoke(SMBOptInStep sMBOptInStep, String str) {
        SMBOptInStep sMBOptInStep2 = sMBOptInStep;
        String str2 = str;
        PcsOnboardingVM pcsOnboardingVM = this.LL;
        List<String> listLJFF = pcsOnboardingVM.LLJILJILJ;
        if (listLJFF.isEmpty()) {
            Gson gson = C1822270xWL.LIZ;
            listLJFF = C1822270xWL.LJFF(C1122150fJ7.LIZJ(pcsOnboardingVM.EQ2()));
        }
        Gson gson2 = C1822270xWL.LIZ;
        String strLJIJI = this.LL.LLJIJIL;
        if (strLJIJI.length() == 0) {
            strLJIJI = C497740JfY.LJIJI(2131855850);
        }
        PcsOnboardingVM pcsOnboardingVM2 = this.LL;
        return C1822270xWL.LJI(strLJIJI, listLJFF, pcsOnboardingVM2.LLJJI, sMBOptInStep2.skuId, pcsOnboardingVM2.DQ2().getShowEntrance(), str2);
    }
}

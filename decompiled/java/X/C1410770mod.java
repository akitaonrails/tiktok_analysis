package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.smb.GetSMBOptInProgressResponse;

/* JADX INFO: renamed from: X.0mod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410770mod extends C09AY implements Function1<GetSMBOptInProgressResponse.ResponseData, Unit> {
    public final /* synthetic */ PcsOnboardingVM LL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410770mod(PcsOnboardingVM pcsOnboardingVM, C1824300xZc c1824300xZc) {
        super(1);
        this.LL = pcsOnboardingVM;
        this.LLILLJJLI = c1824300xZc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GetSMBOptInProgressResponse.ResponseData responseData) {
        GetSMBOptInProgressResponse.ResponseData responseData2 = responseData;
        List<SMBOptInStep> list = responseData2.optInSteps;
        boolean z = responseData2.skipFormSetup;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSmbOptInProgress cache_hit opt_in_steps_count=");
        sbLIZ.append(list.size());
        sbLIZ.append(" skip_form_setup=");
        sbLIZ.append(z);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LL), null, null, new C1410710moX(this.LL, z, list, this.LLILLJJLI, responseData2, null), 3);
        return Unit.LIZ;
    }
}

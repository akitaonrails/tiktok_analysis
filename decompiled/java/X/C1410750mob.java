package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBServiceSwitchInfoResponse;
import webcast.api.sub.SupportedServiceInfo;

/* JADX INFO: renamed from: X.0mob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410750mob extends C09AY implements Function1<SMBServiceSwitchInfoResponse.ResponseData, Unit> {
    public final /* synthetic */ PcsOnboardingVM LL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410750mob(PcsOnboardingVM pcsOnboardingVM, C1824310xZd c1824310xZd) {
        super(1);
        this.LL = pcsOnboardingVM;
        this.LLILLJJLI = c1824310xZd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SMBServiceSwitchInfoResponse.ResponseData responseData) {
        SMBServiceSwitchInfoResponse.ResponseData responseData2 = responseData;
        List<SupportedServiceInfo> list = responseData2.supportedServices;
        boolean z = responseData2.canEveryoneSendDm;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getServiceSwitchInfo cache_hit supported_services_count=");
        sbLIZ.append(list.size());
        sbLIZ.append(" can_everyone_send_dm=");
        sbLIZ.append(z);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LL), null, null, new C1410720moY(this.LL, list, z, this.LLILLJJLI, responseData2, null), 3);
        return Unit.LIZ;
    }
}

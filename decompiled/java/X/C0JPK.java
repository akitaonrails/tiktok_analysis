package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingDetailAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: renamed from: X.0JPK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JPK extends C09AY implements Function2<UIAssem, SMBBookingEventResponse.ResponseData, Unit> {
    public final /* synthetic */ PcsCalendlyBookingDetailAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPK(PcsCalendlyBookingDetailAssem pcsCalendlyBookingDetailAssem) {
        super(2);
        this.LL = pcsCalendlyBookingDetailAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, SMBBookingEventResponse.ResponseData responseData) {
        if (responseData != null) {
            PcsCalendlyMeetingVm pcsCalendlyMeetingVmIp = this.LL.ip();
            pcsCalendlyMeetingVmIp.setState(new C0JPJ(pcsCalendlyMeetingVmIp));
            PcsCalendlyMeetingVm pcsCalendlyMeetingVmIp2 = this.LL.ip();
            pcsCalendlyMeetingVmIp2.setState(new C0JPE(pcsCalendlyMeetingVmIp2));
            PcsCalendlyMeetingVm pcsCalendlyMeetingVmIp3 = this.LL.ip();
            pcsCalendlyMeetingVmIp3.setState(new C0JPI(pcsCalendlyMeetingVmIp3));
            PcsCalendlyMeetingVm pcsCalendlyMeetingVmIp4 = this.LL.ip();
            pcsCalendlyMeetingVmIp4.setState(new C0JPH(pcsCalendlyMeetingVmIp4));
        }
        return Unit.LIZ;
    }
}

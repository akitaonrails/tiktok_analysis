package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import kotlin.jvm.functions.Function1;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: renamed from: X.0JPE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JPE extends C09AY implements Function1<C0JPA, C0JPA> {
    public final /* synthetic */ PcsCalendlyMeetingVm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPE(PcsCalendlyMeetingVm pcsCalendlyMeetingVm) {
        super(1);
        this.LL = pcsCalendlyMeetingVm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JPA invoke(C0JPA c0jpa) {
        String str;
        C0JPA c0jpa2 = c0jpa;
        SMBBookingEventResponse.ResponseData responseData = this.LL.getState().LL;
        if (responseData != null) {
            str = responseData.bookingEventUrl;
        } else {
            str = null;
        }
        return C0JPA.LIZ(c0jpa2, null, str, 0, 0, 0, null, null, 253);
    }
}

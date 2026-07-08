package X;

import com.bytedance.android.livesdk.chatroom.api.SMBBookingEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import kotlin.jvm.functions.Function1;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: renamed from: X.0JPH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JPH extends C09AY implements Function1<C0JPA, C0JPA> {
    public final /* synthetic */ PcsCalendlyMeetingVm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPH(PcsCalendlyMeetingVm pcsCalendlyMeetingVm) {
        super(1);
        this.LL = pcsCalendlyMeetingVm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JPA invoke(C0JPA c0jpa) {
        int i;
        SMBBookingEvent sMBBookingEvent;
        C0JPA c0jpa2 = c0jpa;
        SMBBookingEventResponse.ResponseData responseData = this.LL.getState().LL;
        if (responseData != null && (sMBBookingEvent = responseData.event) != null) {
            i = sMBBookingEvent.auditStatus;
        } else {
            i = 0;
        }
        return C0JPA.LIZ(c0jpa2, null, null, 0, 0, i, null, null, 239);
    }
}

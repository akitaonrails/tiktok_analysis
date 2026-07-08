package X;

import com.bytedance.android.livesdk.chatroom.api.SMBBookingEvent;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting.PcsCalendlyBookingData;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: renamed from: X.0JOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491270JOj {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(PcsCalendlyMeetingVm pcsCalendlyMeetingVm, EnumC491250JOh enumC491250JOh, String str) {
        String str2;
        String str3;
        Long lValueOf;
        SMBBookingEvent sMBBookingEvent;
        PcsCalendlyBookingData pcsCalendlyBookingData;
        PcsCalendlyBookingData pcsCalendlyBookingData2;
        PcsCalendlyBookingData pcsCalendlyBookingData3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_calendly_booking_page");
        C489960JJi c489960JJiYQ2 = pcsCalendlyMeetingVm.yQ2();
        String str4 = null;
        if (c489960JJiYQ2 != null && (pcsCalendlyBookingData3 = c489960JJiYQ2.LL) != null) {
            str2 = pcsCalendlyBookingData3.anchorId;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "anchor_id");
        C489960JJi c489960JJiYQ22 = pcsCalendlyMeetingVm.yQ2();
        if (c489960JJiYQ22 != null && (pcsCalendlyBookingData2 = c489960JJiYQ22.LL) != null) {
            str3 = pcsCalendlyBookingData2.showEntrance;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "show_entrance");
        c474500IjALIZ.LJJII(enumC491250JOh.getLogValue(), "action_type");
        c474500IjALIZ.LJJII(pcsCalendlyMeetingVm.getState().LLIZ.getLogValue(), "page_status");
        c474500IjALIZ.LJJIIZ(str, "click_position", new C491260JOi(enumC491250JOh));
        C489960JJi c489960JJiYQ23 = pcsCalendlyMeetingVm.yQ2();
        if (c489960JJiYQ23 != null && (pcsCalendlyBookingData = c489960JJiYQ23.LL) != null) {
            lValueOf = Long.valueOf(pcsCalendlyBookingData.skuId);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "sku_id");
        SMBBookingEventResponse.ResponseData responseData = pcsCalendlyMeetingVm.getState().LL;
        if (responseData != null && (sMBBookingEvent = responseData.event) != null) {
            str4 = sMBBookingEvent.eventTemplateId;
        }
        c474500IjALIZ.LJJII(str4, "event_template_id");
        c474500IjALIZ.LIZ();
    }
}

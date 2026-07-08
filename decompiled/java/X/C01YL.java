package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: renamed from: X.01YL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01YL extends C09AY implements Function2<C189200o6<? extends Pair<? extends SMBBookingEventResponse.ResponseData, ? extends Boolean>>, C189200o6<? extends Pair<? extends SMBBookingEventResponse.ResponseData, ? extends Boolean>>, Boolean> {
    public final /* synthetic */ PcsCalendlyMeetingVm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01YL(PcsCalendlyMeetingVm pcsCalendlyMeetingVm) {
        super(2);
        this.LL = pcsCalendlyMeetingVm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(C189200o6<? extends Pair<? extends SMBBookingEventResponse.ResponseData, ? extends Boolean>> c189200o6, C189200o6<? extends Pair<? extends SMBBookingEventResponse.ResponseData, ? extends Boolean>> c189200o62) {
        SMBBookingEventResponse.ResponseData responseData;
        Object objM10unboximpl = c189200o6.m10unboximpl();
        Object objM10unboximpl2 = c189200o62.m10unboximpl();
        PcsCalendlyMeetingVm pcsCalendlyMeetingVm = this.LL;
        SMBBookingEventResponse.ResponseData responseData2 = null;
        if (C189200o6.m7isFailureimpl(objM10unboximpl)) {
            objM10unboximpl = null;
        }
        Pair pair = (Pair) objM10unboximpl;
        if (pair != null) {
            responseData = (SMBBookingEventResponse.ResponseData) pair.getFirst();
        } else {
            responseData = null;
        }
        pcsCalendlyMeetingVm.getClass();
        String strWQ2 = PcsCalendlyMeetingVm.wQ2(responseData);
        PcsCalendlyMeetingVm pcsCalendlyMeetingVm2 = this.LL;
        if (C189200o6.m7isFailureimpl(objM10unboximpl2)) {
            objM10unboximpl2 = null;
        }
        Pair pair2 = (Pair) objM10unboximpl2;
        if (pair2 != null) {
            responseData2 = (SMBBookingEventResponse.ResponseData) pair2.getFirst();
        }
        pcsCalendlyMeetingVm2.getClass();
        return Boolean.valueOf(Intrinsics.LJFF(strWQ2, PcsCalendlyMeetingVm.wQ2(responseData2)));
    }
}

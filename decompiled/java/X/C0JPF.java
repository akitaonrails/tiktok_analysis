package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import webcast.api.smb.SMBBookingEventStatusUpdateRequest;

/* JADX INFO: renamed from: X.0JPF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm", f = "PcsCalendlyMeetingVm.kt", l = {226}, m = "requestEventStatusUpdate")
public final class C0JPF extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public SMBBookingEventStatusUpdateRequest LLILZ;
    public C259800zU LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ PcsCalendlyMeetingVm LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPF(PcsCalendlyMeetingVm pcsCalendlyMeetingVm, InterfaceC1364105Vn<? super C0JPF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = pcsCalendlyMeetingVm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsCalendlyMeetingVm@2176.requestEventStatusUpdate$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLJ.BQ2(null, null, null, false, this);
        C1C7U.LIZIZ("PcsCalendlyMeetingVm@2176.requestEventStatusUpdate$1");
        return objBQ2;
    }
}

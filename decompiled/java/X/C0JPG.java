package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;

/* JADX INFO: renamed from: X.0JPG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm", f = "PcsCalendlyMeetingVm.kt", l = {80, 81}, m = "pollDMStatus")
public final class C0JPG extends AbstractC23140094w {
    public C118300cf LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ PcsCalendlyMeetingVm LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPG(PcsCalendlyMeetingVm pcsCalendlyMeetingVm, InterfaceC1364105Vn<? super C0JPG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = pcsCalendlyMeetingVm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsCalendlyMeetingVm@2176.pollDMStatus$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLJI.zQ2(this);
        C1C7U.LIZIZ("PcsCalendlyMeetingVm@2176.pollDMStatus$1");
        return objZQ2;
    }
}

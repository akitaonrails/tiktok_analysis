package X;

import kotlin.Pair;
import kotlin.Unit;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: renamed from: X.01Y9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm$fetchMeetingData$1$2", f = "PcsCalendlyMeetingVm.kt", l = {}, m = "invokeSuspend")
public final class C01Y9 extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C189200o6<? extends Pair<? extends SMBBookingEventResponse.ResponseData, ? extends Boolean>>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ InterfaceC346701Wf LL;
    public /* synthetic */ Object LLILLJJLI;

    public C01Y9(InterfaceC1364105Vn<? super C01Y9> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsCalendlyMeetingVm@2176.fetchMeetingData$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC346701Wf interfaceC346701Wf = this.LL;
        C20441214yg.LJFF(C13LE.LIZ(interfaceC346701Wf.getClass()).LJI(), "Flow collection error", (Throwable) this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsCalendlyMeetingVm@2176.fetchMeetingData$1$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C189200o6<? extends Pair<? extends SMBBookingEventResponse.ResponseData, ? extends Boolean>>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C01Y9 c01y9 = new C01Y9(interfaceC1364105Vn);
        c01y9.LL = interfaceC346701Wf;
        c01y9.LLILLJJLI = th;
        return c01y9.invokeSuspend(Unit.LIZ);
    }
}

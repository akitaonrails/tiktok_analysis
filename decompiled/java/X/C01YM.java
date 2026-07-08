package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: renamed from: X.01YM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm$fetchMeetingData$1$1", f = "PcsCalendlyMeetingVm.kt", l = {}, m = "invokeSuspend")
public final class C01YM extends C09AX implements Function2<InterfaceC346701Wf<? super C189200o6<? extends Pair<? extends SMBBookingEventResponse.ResponseData, ? extends Boolean>>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PcsCalendlyMeetingVm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01YM(PcsCalendlyMeetingVm pcsCalendlyMeetingVm, InterfaceC1364105Vn<? super C01YM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pcsCalendlyMeetingVm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01YM(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsCalendlyMeetingVm@2176.fetchMeetingData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PcsCalendlyMeetingVm pcsCalendlyMeetingVm = this.LL;
        pcsCalendlyMeetingVm.getClass();
        if (C1533950q1J.LJ(pcsCalendlyMeetingVm.AQ2())) {
            pcsCalendlyMeetingVm.CQ2(EnumC2273991DzZ.PARTIAL_LOADING);
        } else {
            pcsCalendlyMeetingVm.CQ2(EnumC2273991DzZ.LOADING);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsCalendlyMeetingVm@2176.fetchMeetingData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C189200o6<? extends Pair<? extends SMBBookingEventResponse.ResponseData, ? extends Boolean>>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

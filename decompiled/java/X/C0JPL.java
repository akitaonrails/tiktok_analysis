package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingDetailAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JPL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingDetailAssem$handleCalendlyJsEvent$1", f = "PcsCalendlyBookingDetailAssem.kt", l = {175}, m = "invokeSuspend")
public final class C0JPL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsCalendlyBookingDetailAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPL(PcsCalendlyBookingDetailAssem pcsCalendlyBookingDetailAssem, InterfaceC1364105Vn<? super C0JPL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsCalendlyBookingDetailAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JPL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsCalendlyBookingDetailAssem@d76d.handleCalendlyJsEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.ip().DQ2(EnumC491290JOl.SCHEDULED_FIRSTTIME);
            PcsCalendlyMeetingVm pcsCalendlyMeetingVmIp = this.LLILLJJLI.ip();
            String strXQ2 = this.LLILLJJLI.ip().xQ2();
            Integer numLJ = C2286608xc.LJ(2);
            this.LL = 1;
            if (pcsCalendlyMeetingVmIp.BQ2(strXQ2, numLJ, null, false, this) == objLJFF) {
                C1C7U.LIZIZ("PcsCalendlyBookingDetailAssem@d76d.handleCalendlyJsEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsCalendlyBookingDetailAssem@d76d.handleCalendlyJsEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

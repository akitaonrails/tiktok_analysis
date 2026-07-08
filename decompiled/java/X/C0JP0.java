package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingBottomAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JP0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingBottomAssem$updateSendMsgBtnUi$1$2", f = "PcsCalendlyBookingBottomAssem.kt", l = {117}, m = "invokeSuspend")
public final class C0JP0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C197039127h LLILLJJLI;
    public final /* synthetic */ PcsCalendlyBookingBottomAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JP0(C197039127h c197039127h, PcsCalendlyBookingBottomAssem pcsCalendlyBookingBottomAssem, InterfaceC1364105Vn<? super C0JP0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c197039127h;
        this.LLILLL = pcsCalendlyBookingBottomAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JP0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsCalendlyBookingBottomAssem@eb21.updateSendMsgBtnUi$1$2");
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
            this.LLILLJJLI.setText(C497740JfY.LJIJI(2131851510));
            this.LLILLJJLI.setLoading(true);
            this.LLILLJJLI.setEnabled(true);
            PcsCalendlyMeetingVm pcsCalendlyMeetingVmHp = this.LLILLL.hp();
            this.LL = 1;
            if (pcsCalendlyMeetingVmHp.zQ2(this) == objLJFF) {
                C1C7U.LIZIZ("PcsCalendlyBookingBottomAssem@eb21.updateSendMsgBtnUi$1$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.setLoading(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsCalendlyBookingBottomAssem@eb21.updateSendMsgBtnUi$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

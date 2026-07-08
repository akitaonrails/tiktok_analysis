package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.SMBBookingEventStatusUpdateRequest;
import webcast.api.smb.SMBBookingEventStatusUpdateResponse;

/* JADX INFO: renamed from: X.01YA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm$requestEventStatusUpdate$2", f = "PcsCalendlyMeetingVm.kt", l = {229}, m = "invokeSuspend")
public final class C01YA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C259800zU<C470590Icr<SMBBookingEventStatusUpdateResponse>> LLILZ;
    public final /* synthetic */ SMBBookingEventStatusUpdateRequest LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01YA(C259800zU<C470590Icr<SMBBookingEventStatusUpdateResponse>> c259800zU, SMBBookingEventStatusUpdateRequest sMBBookingEventStatusUpdateRequest, InterfaceC1364105Vn<? super C01YA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c259800zU;
        this.LLILZIL = sMBBookingEventStatusUpdateRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01YA c01ya = new C01YA(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c01ya.LLILLL = obj;
        return c01ya;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C259800zU<C470590Icr<SMBBookingEventStatusUpdateResponse>> c259800zU;
        T t;
        C1C7U.LIZ("PcsCalendlyMeetingVm@2176.requestEventStatusUpdate$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c259800zU = this.LL;
                    obj2 = this.LLILLL;
                    C155000ia.LIZIZ(obj);
                    t = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                obj2 = this.LLILLL;
                c259800zU = this.LLILZ;
                C480460Ism.LIZ().getClass();
                PcsApi pcsApi = (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
                SMBBookingEventStatusUpdateRequest sMBBookingEventStatusUpdateRequest = this.LLILZIL;
                this.LLILLL = obj2;
                this.LL = c259800zU;
                this.LLILLJJLI = 1;
                Object objUpdateCalendlyDmConfirmStatus = pcsApi.updateCalendlyDmConfirmStatus(sMBBookingEventStatusUpdateRequest, this);
                t = objUpdateCalendlyDmConfirmStatus;
                if (objUpdateCalendlyDmConfirmStatus == objLJFF) {
                    C1C7U.LIZIZ("PcsCalendlyMeetingVm@2176.requestEventStatusUpdate$2");
                    return objLJFF;
                }
            }
            c259800zU.element = t;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ(C13LE.LIZ(obj2.getClass()).LJI(), "/webcast/smb/booking/status_update failed: " + e.getMessage());
            this.LLILZ.element = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsCalendlyMeetingVm@2176.requestEventStatusUpdate$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

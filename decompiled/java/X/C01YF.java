package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: renamed from: X.01YF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.viewmodel.PcsCalendlyMeetingVm$pollDMStatus$statusResponse$1", f = "PcsCalendlyMeetingVm.kt", l = {82}, m = "invokeSuspend")
public final class C01YF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SMBBookingEventResponse.ResponseData>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PcsCalendlyMeetingVm LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01YF(PcsCalendlyMeetingVm pcsCalendlyMeetingVm, long j, String str, long j2, InterfaceC1364105Vn<? super C01YF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pcsCalendlyMeetingVm;
        this.LLILZ = j;
        this.LLILZIL = str;
        this.LLILZLL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01YF c01yf = new C01YF(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c01yf.LLILLJJLI = obj;
        return c01yf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objLIZ;
        C1C7U.LIZ("PcsCalendlyMeetingVm@2176.pollDMStatus$statusResponse$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            obj2 = this.LLILLJJLI;
            PcsCalendlyMeetingVm pcsCalendlyMeetingVm = this.LLILLL;
            C01YH c01yh = pcsCalendlyMeetingVm.LLILZ;
            String strXQ2 = pcsCalendlyMeetingVm.xQ2();
            long j = this.LLILZ;
            String str = this.LLILZIL;
            long j2 = this.LLILZLL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            objLIZ = c01yh.LIZ(j, j2, strXQ2, str, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("PcsCalendlyMeetingVm@2176.pollDMStatus$statusResponse$1");
                return objLJFF;
            }
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLIZ);
        if (thM5exceptionOrNullimpl != null) {
            String strLJI = C13LE.LIZ(obj2.getClass()).LJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/webcast/smb/booking/event failed: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C20441214yg.LIZIZ(strLJI, C2188811AlT.LIZIZ(sbLIZ));
            objLIZ = null;
        }
        C1C7U.LIZIZ("PcsCalendlyMeetingVm@2176.pollDMStatus$statusResponse$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SMBBookingEventResponse.ResponseData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

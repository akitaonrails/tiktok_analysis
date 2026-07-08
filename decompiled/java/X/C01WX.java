package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: renamed from: X.01WX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.model.PcsCalendlyMeetingRepository$fetchMeetingDataServer$2", f = "PcsCalendlyMeetingRepository.kt", l = {87}, m = "invokeSuspend")
public final class C01WX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends SMBBookingEventResponse.ResponseData>>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C259800zU<SMBBookingEventResponse.ResponseData> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01WX(C259800zU<SMBBookingEventResponse.ResponseData> c259800zU, String str, long j, String str2, long j2, InterfaceC1364105Vn<? super C01WX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c259800zU;
        this.LLILZIL = str;
        this.LLILZLL = j;
        this.LLIZ = str2;
        this.LLIZLLLIL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01WX c01wx = new C01WX(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c01wx.LLILLL = obj;
        return c01wx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object obj2;
        C259800zU<SMBBookingEventResponse.ResponseData> c259800zU;
        C1C7U.LIZ("PcsCalendlyMeetingRepository@3104.fetchMeetingDataServer$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c259800zU = this.LL;
                    obj2 = this.LLILLL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                obj2 = this.LLILLL;
                c259800zU = this.LLILZ;
                C480460Ism.LIZ().getClass();
                PcsApi pcsApi = (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
                String str = this.LLILZIL;
                long j = this.LLILZLL;
                String str2 = this.LLIZ;
                long j2 = this.LLIZLLLIL;
                this.LLILLL = obj2;
                this.LL = c259800zU;
                this.LLILLJJLI = 1;
                obj = pcsApi.getCalendlyBookingInfo(str, j, str2, j2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PcsCalendlyMeetingRepository@3104.fetchMeetingDataServer$2");
                    return objLJFF;
                }
            }
            c259800zU.element = ((C470590Icr) obj).data;
            c098200Yq = this.LLILZ.element;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ(C13LE.LIZ(obj2.getClass()).LJI(), "/webcast/smb/booking/event failed: " + e.getMessage());
            c098200Yq = new C098200Yq(e);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("PcsCalendlyMeetingRepository@3104.fetchMeetingDataServer$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends SMBBookingEventResponse.ResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

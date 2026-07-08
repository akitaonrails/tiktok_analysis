package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingBottomAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingBottomAssem$updateSendMsgBtnUi$1$3$1", f = "PcsCalendlyBookingBottomAssem.kt", l = {146, 152}, m = "invokeSuspend")
public final class C491430JOz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C197039127h LLILLJJLI;
    public final /* synthetic */ PcsCalendlyBookingBottomAssem LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491430JOz(C197039127h c197039127h, PcsCalendlyBookingBottomAssem pcsCalendlyBookingBottomAssem, int i, InterfaceC1364105Vn<? super C491430JOz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c197039127h;
        this.LLILLL = pcsCalendlyBookingBottomAssem;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C491430JOz(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[Catch: Exception -> 0x00b3, all -> 0x00c9, TryCatch #1 {Exception -> 0x00b3, blocks: (B:21:0x0063, B:22:0x0066, B:24:0x0072, B:29:0x007c, B:31:0x009a, B:32:0x009c, B:14:0x0046, B:15:0x0049, B:17:0x0051, B:34:0x00a7, B:36:0x00af, B:10:0x0020), top: B:45:0x000e, outer: #0 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C491430JOz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

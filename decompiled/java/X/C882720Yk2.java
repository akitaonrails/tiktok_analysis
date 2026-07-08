package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yk2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.utils.SendMessageParams$report$1", f = "SendMessageParams.kt", l = {78}, m = "invokeSuspend")
public final class C882720Yk2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ C882730Yk3 LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C882720Yk2(C869590Y9l c869590Y9l, C882730Yk3 c882730Yk3, long j, InterfaceC1364105Vn<? super C882720Yk2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = c882730Yk3;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C882720Yk2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMessageParams@5a8a.report$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                IIMMessageAnalytics.LIZ.getClass();
                IIMMessageAnalytics iIMMessageAnalyticsLIZ = C893510Z3l.LIZ();
                if (iIMMessageAnalyticsLIZ != null) {
                    C869590Y9l c869590Y9l = this.LLILLJJLI;
                    EnumC894220Z6e enumC894220Z6e = this.LLILLL.LIZ;
                    long j = this.LLILZ;
                    this.LL = 1;
                    if (iIMMessageAnalyticsLIZ.LIZIZ(c869590Y9l, enumC894220Z6e, j, new C891480YyA(), C0I0B.LJFF.LIZIZ(), this) == objLJFF) {
                        C1C7U.LIZIZ("SendMessageParams@5a8a.report$1");
                        return objLJFF;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            HashMap map = new HashMap();
            map.put("error_msg", "report error send msg");
            map.put("error_desc", e);
            C0W8I.LIZ.getClass();
            C0W8I.LJ("send_msg_error", "im_error_event", map);
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ = C0Z53.LIZ();
            if (iMALogApiLIZ != null) {
                iMALogApiLIZ.logException(new RuntimeException(e));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageParams@5a8a.report$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

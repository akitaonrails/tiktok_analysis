package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercebase.monitor.ClientLogReportRequest;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01pP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercebase.monitor.ECommerceExceptionMonitor$sendServerEvent$1", f = "ECommerceExceptionMonitor.kt", l = {79}, m = "invokeSuspend")
public final class C452101pP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC1778650wNz LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452101pP(EnumC1778650wNz enumC1778650wNz, Integer num, Map<String, Object> map, InterfaceC1364105Vn<? super C452101pP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1778650wNz;
        this.LLILLL = num;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C452101pP(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("ECommerceExceptionMonitor@94df.sendServerEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                EnumC1778650wNz enumC1778650wNz = this.LLILLJJLI;
                Integer num = this.LLILLL;
                Map<String, Object> map = this.LLILZ;
                InterfaceC452201pQ interfaceC452201pQ = (InterfaceC452201pQ) C0NSL.LIZ().create(InterfaceC452201pQ.class);
                int iOrdinal = enumC1778650wNz.ordinal();
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                ClientLogReportRequest clientLogReportRequest = new ClientLogReportRequest(iOrdinal, iIntValue, String.valueOf(map));
                this.LL = 1;
                obj = interfaceC452201pQ.LIZ(clientLogReportRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ECommerceExceptionMonitor@94df.sendServerEvent$1");
                    return objLJFF;
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceExceptionMonitor@94df.sendServerEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

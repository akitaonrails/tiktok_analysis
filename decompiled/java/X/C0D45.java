package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D45, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.preload.PdpPreloadScheduler$scheduleUcpRetry$1", f = "PdpPreloadScheduler.kt", l = {255}, m = "invokeSuspend")
public final class C0D45 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C0D43 LLILZ;
    public final /* synthetic */ C0D47 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D45(long j, C0D43 c0d43, C0D47 c0d47, InterfaceC1364105Vn<? super C0D45> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = c0d43;
        this.LLILZIL = c0d47;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0D45 c0d45 = new C0D45(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0d45.LLILLJJLI = obj;
        return c0d45;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("PdpPreloadScheduler@8a57.scheduleUcpRetry$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            long j = this.LLILLL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("PdpPreloadScheduler@8a57.scheduleUcpRetry$1");
                return objLJFF;
            }
        }
        if (!C2296808zG.LJI(interfaceC497601wk)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PdpPreloadScheduler@8a57.scheduleUcpRetry$1");
            return unit;
        }
        this.LLILZ.LIZLLL(this.LLILZIL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PdpPreloadScheduler@8a57.scheduleUcpRetry$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

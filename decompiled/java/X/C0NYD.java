package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NYD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusReporter$cancelPolling$1", f = "ActivityStatusReporter.kt", l = {}, m = "invokeSuspend")
public final class C0NYD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0NYA LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NYD(C0NYA c0nya, String str, InterfaceC1364105Vn<? super C0NYD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nya;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NYD c0nyd = new C0NYD(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0nyd.LL = obj;
        return c0nyd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusReporter@261e.cancelPolling$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C595910NYv c595910NYv = this.LLILLJJLI.LIZLLL;
        String str = this.LLILLL;
        C0NYJ c0nyj = c595910NYv.LIZ;
        if (c0nyj != null && c0nyj.LIZ(str, null)) {
            C0NYA c0nya = this.LLILLJJLI;
            C0NXT c0nxt = c0nya.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("intercept irregular report, cancelPolling(");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(") report return");
            c0nya.LIZLLL(c0nxt, C2188811AlT.LIZIZ(sbLIZ), null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ActivityStatusReporter@261e.cancelPolling$1");
            return unit;
        }
        this.LLILLJJLI.LIZIZ(this.LLILLL, null, interfaceC497601wk);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusReporter@261e.cancelPolling$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

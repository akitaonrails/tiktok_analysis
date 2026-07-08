package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CtR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.speedtest.LiveSpeedTestAdapter$handlePreScheduleRequest$1$1", f = "LiveSpeedTestAdapter.kt", l = {}, m = "invokeSuspend")
public final class C327990CtR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2250021D4u LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C327950CtN LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327990CtR(long j, C2250021D4u c2250021D4u, C327950CtN c327950CtN, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2250021D4u;
        this.LLILLJJLI = j;
        this.LLILLL = c327950CtN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327990CtR(this.LLILLJJLI, this.LL, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSpeedTestAdapter@58e5.handlePreScheduleRequest$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJ(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSpeedTestAdapter@58e5.handlePreScheduleRequest$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

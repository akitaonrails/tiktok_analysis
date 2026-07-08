package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.incentive.taskevent.watchvideo.WatchVideoTimeTaskTrigger$reportTaskEvent$2$updateUIJob$1", f = "WatchVideoTimeTaskTrigger.kt", l = {468, 469}, m = "invokeSuspend")
public final class C1703070uQ5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<C1898920zVy> LLILLJJLI;
    public final /* synthetic */ C1898820zVo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703070uQ5(AnonymousClass0957<C1898920zVy> anonymousClass0957, C1898820zVo c1898820zVo, InterfaceC1364105Vn<? super C1703070uQ5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = c1898820zVo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703070uQ5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WatchVideoTimeTaskTrigger@a6ab.reportTaskEvent$2$updateUIJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("WatchVideoTimeTaskTrigger@a6ab.reportTaskEvent$2$updateUIJob$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("WatchVideoTimeTaskTrigger@a6ab.reportTaskEvent$2$updateUIJob$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1898690zVb c1898690zVb = new C1898690zVb(this.LLILLJJLI, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1898690zVb) == objLJFF) {
            C1C7U.LIZIZ("WatchVideoTimeTaskTrigger@a6ab.reportTaskEvent$2$updateUIJob$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("WatchVideoTimeTaskTrigger@a6ab.reportTaskEvent$2$updateUIJob$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

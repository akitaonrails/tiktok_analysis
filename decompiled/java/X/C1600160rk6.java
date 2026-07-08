package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.InboxSkylightStoryDataCenter$startRemainingPagedRead$1$3", f = "SkylightStoryDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C1600160rk6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1600200rkA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1600160rk6(C1600200rkA c1600200rkA, InterfaceC1364105Vn<? super C1600160rk6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1600200rkA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1600160rk6(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSkylightStoryDataCenter@fba4.startRemainingPagedRead$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1600200rkA.LIZIZ(this.LL, false, 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSkylightStoryDataCenter@fba4.startRemainingPagedRead$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

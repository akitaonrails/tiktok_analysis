package X;

import Y.ARunnableS109S0100000_9;
import com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel$onPrepared$1", f = "InterceptorEventViewModel.kt", l = {}, m = "invokeSuspend")
public final class C608840NuM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterceptorEventViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C608840NuM(InterceptorEventViewModel interceptorEventViewModel, InterfaceC1364105Vn<? super C608840NuM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interceptorEventViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C608840NuM(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InterceptorEventViewModel@737d.onPrepared$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C506101y7.LIZ(this.LL.getLifecycle(), new ARunnableS109S0100000_9(this.LL, 49));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InterceptorEventViewModel@737d.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

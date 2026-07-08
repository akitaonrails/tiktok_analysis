package X;

import com.ss.android.ugc.aweme.ecommerce.network.EcomPbRequestHandler;
import com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECAPIInterceptorNetworkBystander;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08W5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.condition.PbNativePrefetchDeferredDispatcher$dispatchIfNeeded$1", f = "PbNativePrefetchDeferredDispatcher.kt", l = {}, m = "invokeSuspend")
public final class C08W5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Map<String, Object>> LL;
    public final /* synthetic */ C08W7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C08W5(Function0<? extends Map<String, ? extends Object>> function0, C08W7 c08w7, InterfaceC1364105Vn<? super C08W5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
        this.LLILLJJLI = c08w7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08W5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PbNativePrefetchDeferredDispatcher@f016.dispatchIfNeeded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, ? extends Object> mapInvoke = this.LL.invoke();
        if (mapInvoke == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PbNativePrefetchDeferredDispatcher@f016.dispatchIfNeeded$1");
            return unit;
        }
        ECAPIInterceptorNetworkBystander.LIZ.getClass();
        List<InterfaceC2027307wt> list = (List) ECAPIInterceptorNetworkBystander.LIZIZ.getValue();
        C08W7 c08w7 = this.LLILLJJLI;
        for (InterfaceC2027307wt interfaceC2027307wt : list) {
            if (interfaceC2027307wt != EcomPbRequestHandler.LIZ && !(interfaceC2027307wt instanceof C1507680pKw) && interfaceC2027307wt.LIZIZ(c08w7.LIZIZ, c08w7.LIZ, c08w7.LIZJ)) {
                interfaceC2027307wt.LJ(mapInvoke, c08w7.LIZ, c08w7.LIZIZ, c08w7.LIZJ, c08w7.LIZLLL, c08w7.LJ, new C07WL(false));
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PbNativePrefetchDeferredDispatcher@f016.dispatchIfNeeded$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

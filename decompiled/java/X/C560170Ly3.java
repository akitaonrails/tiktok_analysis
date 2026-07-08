package X;

import com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam;
import com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ly3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor$matchInterceptRules$1", f = "AIRemixRouterInterceptor.kt", l = {64}, m = "invokeSuspend")
public final class C560170Ly3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIRemixRouterInterceptor LLILLJJLI;
    public final /* synthetic */ C259800zU<AIRemixLaunchParam> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C560170Ly3(AIRemixRouterInterceptor aIRemixRouterInterceptor, C259800zU<AIRemixLaunchParam> c259800zU, InterfaceC1364105Vn<? super C560170Ly3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIRemixRouterInterceptor;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C560170Ly3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIRemixRouterInterceptor@ee11.matchInterceptRules$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AIRemixRouterInterceptor aIRemixRouterInterceptor = this.LLILLJJLI;
            AIRemixLaunchParam aIRemixLaunchParam = this.LLILLL.element;
            this.LL = 1;
            if (aIRemixRouterInterceptor.LIZLLL(aIRemixLaunchParam, this) == objLJFF) {
                C1C7U.LIZIZ("AIRemixRouterInterceptor@ee11.matchInterceptRules$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIRemixRouterInterceptor@ee11.matchInterceptRules$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.lynx.tasm.TemplateData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01YO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.router.EcomSparkSubOrderListInterceptor$injectTemplateData$deffer$1", f = "EcomSparkSubOrderListInterceptor.kt", l = {74}, m = "invokeSuspend")
public final class C01YO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TemplateData>, Object> {
    public Function1 LL;
    public int LLILLJJLI;
    public final /* synthetic */ Function1<Function1<? super String, Unit>, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01YO(Function1<? super Function1<? super String, Unit>, Unit> function1, InterfaceC1364105Vn<? super C01YO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01YO(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomSparkSubOrderListInterceptor@8005.injectTemplateData$deffer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Function1<Function1<? super String, Unit>, Unit> function1 = this.LLILLL;
            this.LL = function1;
            this.LLILLJJLI = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            function1.invoke(new C5183020f(c23260099m, 14));
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcomSparkSubOrderListInterceptor@8005.injectTemplateData$deffer$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcomSparkSubOrderListInterceptor@8005.injectTemplateData$deffer$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TemplateData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

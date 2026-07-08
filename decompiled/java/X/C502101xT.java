package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.composition.SummaryVideoComposer$compose$3$result$1$1$onCompileProgress$1", f = "SummaryVideoComposer.kt", l = {219}, m = "invokeSuspend")
public final class C502101xT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function2<Float, InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C502101xT(Function2<? super Float, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, float f, InterfaceC1364105Vn<? super C502101xT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C502101xT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SummaryVideoComposer@6d74.compose$3$result$1$1$onCompileProgress$1");
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
            Function2<Float, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLJJLI;
            Float fLIZLLL = C2286608xc.LIZLLL(this.LLILLL);
            this.LL = 1;
            if (function2.invoke(fLIZLLL, this) == objLJFF) {
                C1C7U.LIZIZ("SummaryVideoComposer@6d74.compose$3$result$1$1$onCompileProgress$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SummaryVideoComposer@6d74.compose$3$result$1$1$onCompileProgress$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

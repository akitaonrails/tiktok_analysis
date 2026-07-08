package X;

import Y.AgS98S1100000_5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EyB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.handler.BaseAIGCHandler$observeTaskStatus$1", f = "BaseAIGCHandler.kt", l = {98}, m = "invokeSuspend")
public final class C381890EyB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC381830Ey5 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381890EyB(AbstractC381830Ey5 abstractC381830Ey5, String str, InterfaceC1364105Vn<? super C381890EyB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC381830Ey5;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381890EyB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseAIGCHandler@c43d.observeTaskStatus$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C0FXA(this.LLILLJJLI.LIZJ.LJI(this.LLILLL), 10));
            AgS98S1100000_5 agS98S1100000_5 = new AgS98S1100000_5(this.LLILLL, this.LLILLJJLI, 5);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS98S1100000_5, this) == objLJFF) {
                C1C7U.LIZIZ("BaseAIGCHandler@c43d.observeTaskStatus$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseAIGCHandler@c43d.observeTaskStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

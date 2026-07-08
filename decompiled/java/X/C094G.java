package X;

import Y.AgS33S0500000_3;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.094G, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {127}, m = "invokeSuspend")
public final class C094G extends C09AX implements Function2<Unit, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLJJLI;
    public final /* synthetic */ CoroutineContext LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ AnonymousClass0954<Object> LLILZIL;
    public final /* synthetic */ InterfaceC346701Wf<Object> LLILZLL;
    public final /* synthetic */ InterfaceC1631620sYq<Object, Object, InterfaceC1364105Vn<Object>, Object> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C094G(InterfaceC346201Wa<Object> interfaceC346201Wa, CoroutineContext coroutineContext, Object obj, AnonymousClass0954<? extends Object> anonymousClass0954, InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1631620sYq<Object, Object, ? super InterfaceC1364105Vn<Object>, ? extends Object> interfaceC1631620sYq, InterfaceC1364105Vn<? super C094G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = coroutineContext;
        this.LLILZ = obj;
        this.LLILZIL = anonymousClass0954;
        this.LLILZLL = interfaceC346701Wf;
        this.LLIZ = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C094G(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC346201Wa<Object> interfaceC346201Wa = this.LLILLJJLI;
            AgS33S0500000_3 agS33S0500000_3 = new AgS33S0500000_3(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, 1);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS33S0500000_3, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(unit, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

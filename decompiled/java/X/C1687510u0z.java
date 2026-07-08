package X;

import Y.AgS305S0100000_25;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0u0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend")
public final class C1687510u0z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CoroutineContext LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLL;
    public final /* synthetic */ InterfaceC345960DhK<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687510u0z(CoroutineContext coroutineContext, InterfaceC346201Wa<Object> interfaceC346201Wa, InterfaceC345960DhK<Object> interfaceC345960DhK, InterfaceC1364105Vn<? super C1687510u0z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = coroutineContext;
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = interfaceC345960DhK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1687510u0z(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (Intrinsics.LJFF(this.LLILLJJLI, C23271099x.INSTANCE)) {
                InterfaceC346201Wa<Object> interfaceC346201Wa = this.LLILLL;
                AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILZ, 41);
                this.LL = 1;
                if (interfaceC346201Wa.collect(agS305S0100000_25, this) == objLJFF) {
                    return objLJFF;
                }
            } else {
                CoroutineContext coroutineContext = this.LLILLJJLI;
                C1687520u10 c1687520u10 = new C1687520u10(this.LLILLL, this.LLILZ, null);
                this.LL = 2;
                if (C23250099c.LJI(this, coroutineContext, c1687520u10) == objLJFF) {
                    return objLJFF;
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

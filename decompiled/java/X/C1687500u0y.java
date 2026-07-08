package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend")
public final class C1687500u0y extends C09AX implements Function2<InterfaceC345960DhK<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Lifecycle LLILLL;
    public final /* synthetic */ Lifecycle.State LLILZ;
    public final /* synthetic */ CoroutineContext LLILZIL;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687500u0y(Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, InterfaceC346201Wa<Object> interfaceC346201Wa, InterfaceC1364105Vn<? super C1687500u0y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = lifecycle;
        this.LLILZ = state;
        this.LLILZIL = coroutineContext;
        this.LLILZLL = interfaceC346201Wa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1687500u0y c1687500u0y = new C1687500u0y(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1687500u0y.LLILLJJLI = obj;
        return c1687500u0y;
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
            InterfaceC345960DhK interfaceC345960DhK = (InterfaceC345960DhK) this.LLILLJJLI;
            Lifecycle lifecycle = this.LLILLL;
            Lifecycle.State state = this.LLILZ;
            C1687510u0z c1687510u0z = new C1687510u0z(this.LLILZIL, this.LLILZLL, interfaceC345960DhK, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c1687510u0z, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC345960DhK<Object> interfaceC345960DhK, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC345960DhK, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

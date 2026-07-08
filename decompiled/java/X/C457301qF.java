package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01qF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.FlowExtKt$collectIn$1", f = "FlowExt.kt", l = {23}, m = "invokeSuspend")
public final class C457301qF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLL;
    public final /* synthetic */ Function1<Object, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C457301qF(LifecycleOwner lifecycleOwner, InterfaceC346201Wa<Object> interfaceC346201Wa, Function1<Object, Unit> function1, InterfaceC1364105Vn<? super C457301qF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C457301qF(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowExtKt@2510.collectIn$1");
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
            LifecycleOwner lifecycleOwner = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C457401qG c457401qG = new C457401qG(null, this.LLILZ, this.LLILLL);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c457401qG, this) == objLJFF) {
                C1C7U.LIZIZ("FlowExtKt@2510.collectIn$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FlowExtKt@2510.collectIn$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

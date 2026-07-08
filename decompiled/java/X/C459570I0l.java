package X;

import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.PausingDispatcherKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.MainFragmentAssemKt$launchOnViewCreated$2", f = "MainFragmentAssem.kt", l = {191}, m = "invokeSuspend")
public final class C459570I0l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC738140SxQ LLILLJJLI;
    public final /* synthetic */ Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C459570I0l(AbstractC738140SxQ abstractC738140SxQ, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C459570I0l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC738140SxQ;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C459570I0l(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MainFragmentAssemKt@d7c0.launchOnViewCreated$2");
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
            LifecycleRegistry lifecycle = this.LLILLJJLI.getLifecycle();
            Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLL;
            this.LL = 1;
            if (PausingDispatcherKt.whenCreated(lifecycle, function2, this) == objLJFF) {
                C1C7U.LIZIZ("MainFragmentAssemKt@d7c0.launchOnViewCreated$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MainFragmentAssemKt@d7c0.launchOnViewCreated$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01LH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.lynx.pref.TakoLynxExposeHelperKt$addLifecycleObserver$1", f = "TakoLynxExposeHelper.kt", l = {}, m = "invokeSuspend")
public final class C01LH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ LifecycleObserver LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01LH(LifecycleOwner lifecycleOwner, LifecycleObserver lifecycleObserver, InterfaceC1364105Vn<? super C01LH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = lifecycleObserver;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01LH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Lifecycle lifecycle;
        C1C7U.LIZ("TakoLynxExposeHelperKt@48c6.addLifecycleObserver$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LifecycleOwner lifecycleOwner = this.LL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("TakoLynxExposeHelperKt@48c6.addLifecycleObserver$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.performance.core.utils.cardpreload.CardPageLocalPreloader;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01KJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.core.utils.cardpreload.CardPageLocalPreloader$tryAddLifecycleObserver$1", f = "CardPageLocalPreloader.kt", l = {}, m = "invokeSuspend")
public final class C01KJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WeakReference<LifecycleOwner> LL;
    public final /* synthetic */ CardPageLocalPreloader LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01KJ(WeakReference<LifecycleOwner> weakReference, CardPageLocalPreloader cardPageLocalPreloader, InterfaceC1364105Vn<? super C01KJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = weakReference;
        this.LLILLJJLI = cardPageLocalPreloader;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01KJ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Lifecycle lifecycle;
        C1C7U.LIZ("CardPageLocalPreloader@d0b2.tryAddLifecycleObserver$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LifecycleOwner lifecycleOwner = this.LL.get();
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CardPageLocalPreloader@d0b2.tryAddLifecycleObserver$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

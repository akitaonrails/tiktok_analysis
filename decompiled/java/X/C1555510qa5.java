package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qa5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555510qa5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ C1555440qZy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1555510qa5(LifecycleOwner lifecycleOwner, C1555440qZy c1555440qZy) {
        super(0);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = c1555440qZy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Lifecycle lifecycle = this.LL.getLifecycle();
        final C1555440qZy c1555440qZy = this.LLILLJJLI;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.provider.impl.ViewScope$1$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    c1555440qZy.getTree().LJFF();
                }
            }
        });
        return Unit.LIZ;
    }
}

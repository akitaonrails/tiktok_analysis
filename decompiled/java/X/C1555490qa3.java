package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qa3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555490qa3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ C1555410qZv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1555490qa3(C19EG c19eg, C1555410qZv c1555410qZv) {
        super(0);
        this.LL = c19eg;
        this.LLILLJJLI = c1555410qZv;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Lifecycle lifecycle = this.LL.getLifecycle();
        final C1555410qZv c1555410qZv = this.LLILLJJLI;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.provider.impl.ActivityScope$1$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    c1555410qZv.getTree().LJFF();
                }
            }
        });
        return Unit.LIZ;
    }
}

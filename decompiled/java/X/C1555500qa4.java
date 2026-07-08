package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qa4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555500qa4 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ C1555400qZu LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1555500qa4(Fragment fragment, C1555400qZu c1555400qZu) {
        super(0);
        this.LL = fragment;
        this.LLILLJJLI = c1555400qZu;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Lifecycle lifecycle = this.LL.getLifecycle();
        final C1555400qZu c1555400qZu = this.LLILLJJLI;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.provider.impl.FragmentScope$2$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    c1555400qZu.getTree().LJFF();
                }
            }
        });
        return Unit.LIZ;
    }
}

package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.internal.LifecycleAwareObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11KF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11KF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LifecycleAwareObserver<T> LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ Lifecycle.Event LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11KF(LifecycleAwareObserver<T> lifecycleAwareObserver, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super(0);
        this.LL = lifecycleAwareObserver;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = event;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.onLifecycleEvent(this.LLILLJJLI);
        if (this.LLILLL == Lifecycle.Event.ON_DESTROY) {
            this.LL.onDestroy();
        }
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.assem.arch.viewModel.internal.LifecycleAwareObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11HD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11HD extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ LifecycleAwareObserver<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11HD(LifecycleAwareObserver<T> lifecycleAwareObserver) {
        super(1);
        this.LL = lifecycleAwareObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.LL.onProxyAttach();
        } else {
            this.LL.onProxyDetach();
        }
        return Unit.LIZ;
    }
}

package X;

import X.C0RPC;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RPB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RPB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ ViewModelStore LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RPB(C19EG c19eg, ViewModelStore viewModelStore) {
        super(0);
        this.LL = c19eg;
        this.LLILLJJLI = viewModelStore;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Lifecycle lifecycle = this.LL.getLifecycle();
        final C19EG c19eg = this.LL;
        final ViewModelStore viewModelStore = this.LLILLJJLI;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.arch.reused.assemble.AssemblerHolder$getAssembler$1$2$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    c19eg.getLifecycle().removeObserver(this);
                    C0RPC.LIZ.remove(viewModelStore);
                }
            }
        });
        return Unit.LIZ;
    }
}

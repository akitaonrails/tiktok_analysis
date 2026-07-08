package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724950Sc9 extends C09AY implements Function0<C724960ScA> {
    public final /* synthetic */ AbstractC724890Sc3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724950Sc9(AbstractC724890Sc3 abstractC724890Sc3) {
        super(0);
        this.LL = abstractC724890Sc3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ScA] */
    @Override // kotlin.jvm.functions.Function0
    public final C724960ScA invoke() {
        final AbstractC724890Sc3 abstractC724890Sc3 = this.LL;
        return new Lifecycle(abstractC724890Sc3) { // from class: X.0ScA
            public final LifecycleRegistry LL;
            public final Lifecycle.State LLILLJJLI;

            @Override // androidx.lifecycle.Lifecycle
            public final Lifecycle.State getCurrentState() {
                return this.LLILLJJLI;
            }

            {
                LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(abstractC724890Sc3);
                this.LL = lifecycleRegistry;
                this.LLILLJJLI = lifecycleRegistry.getCurrentState();
            }

            @Override // androidx.lifecycle.Lifecycle
            public final void addObserver(LifecycleObserver lifecycleObserver) {
                this.LL.addObserver(lifecycleObserver);
            }

            @Override // androidx.lifecycle.Lifecycle
            public final void removeObserver(LifecycleObserver lifecycleObserver) {
                this.LL.removeObserver(lifecycleObserver);
            }
        };
    }
}

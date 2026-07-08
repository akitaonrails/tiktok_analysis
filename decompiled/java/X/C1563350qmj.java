package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.0qmj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563350qmj extends C09AY implements Function0<C21508219Fg> {
    public final /* synthetic */ AbstractC1563340qmi LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563350qmj(AbstractC1563340qmi abstractC1563340qmi) {
        super(0);
        this.LL = abstractC1563340qmi;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.19Fg] */
    @Override // kotlin.jvm.functions.Function0
    public final C21508219Fg invoke() {
        final LifecycleOwner lifecycleOwner = this.LL.LL;
        final AbstractC1563340qmi abstractC1563340qmi = this.LL;
        return new LifecycleRegistry(lifecycleOwner) { // from class: X.19Fg
            @Override // androidx.lifecycle.LifecycleRegistry, androidx.lifecycle.Lifecycle
            public final Lifecycle.State getCurrentState() {
                AbstractC1563340qmi abstractC1563340qmi2 = abstractC1563340qmi;
                return (Lifecycle.State) abstractC1563340qmi2.LIZ(EnumC682280QpW.GET_CURRENT_STATE, new AwS576S0100000_32(abstractC1563340qmi2, 225));
            }

            @Override // androidx.lifecycle.LifecycleRegistry, androidx.lifecycle.Lifecycle
            public final void addObserver(LifecycleObserver lifecycleObserver) {
                AbstractC1563340qmi abstractC1563340qmi2 = abstractC1563340qmi;
                abstractC1563340qmi2.LIZ(EnumC682280QpW.LIVEDATA_OBSERVE, new AwS433S0200000_32(abstractC1563340qmi2, lifecycleObserver, 17));
            }

            @Override // androidx.lifecycle.LifecycleRegistry, androidx.lifecycle.Lifecycle
            public final void removeObserver(LifecycleObserver lifecycleObserver) {
                abstractC1563340qmi.removeObserver(lifecycleObserver);
            }

            @Override // androidx.lifecycle.LifecycleRegistry
            public final void setCurrentState(Lifecycle.State state) {
                abstractC1563340qmi.setCurrentState(state);
            }
        };
    }
}

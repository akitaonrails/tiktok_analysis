package X;

import X.C11JF;
import X.C2021707vz;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08X0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08X0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1564290qoF LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08X0(C1564290qoF c1564290qoF) {
        super(0);
        this.LL = c1564290qoF;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Lifecycle lifecycle = this.LL.LIZJ.getLifecycle();
        final C1564290qoF c1564290qoF = this.LL;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.ies.powerlist.optimize.Optimizer$init$runnable$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C11JF c11jf;
                if (C2021707vz.LIZ[event.ordinal()] == 1 && (c11jf = c1564290qoF.LJI) != null) {
                    c11jf.dispose();
                }
            }
        });
        return Unit.LIZ;
    }
}

package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R1I, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R1I extends C09AY implements Function0<Lifecycle.State> {
    public final /* synthetic */ LifecycleOwner LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R1I(LifecycleOwner lifecycleOwner) {
        super(0);
        this.LL = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Lifecycle.State invoke() {
        return ((C19FO) this.LL).getLifecycle().getCurrentState();
    }
}

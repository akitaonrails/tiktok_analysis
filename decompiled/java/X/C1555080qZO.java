package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qZO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555080qZO extends C09AY implements Function0<C1555070qZN> {
    public final /* synthetic */ AbstractC1563340qmi LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1555080qZO(AbstractC1563340qmi abstractC1563340qmi) {
        super(0);
        this.LL = abstractC1563340qmi;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0qZN] */
    @Override // kotlin.jvm.functions.Function0
    public final C1555070qZN invoke() {
        final AbstractC1563340qmi abstractC1563340qmi = this.LL;
        return new LifecycleOwner() { // from class: X.0qZN
            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                return (Lifecycle) abstractC1563340qmi.LLILLL.getValue();
            }
        };
    }
}

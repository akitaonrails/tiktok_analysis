package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1830190xj7 extends C09AY implements Function0<LifecycleOwner> {
    public final /* synthetic */ C03K6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1830190xj7(C03K6 c03k6) {
        super(0);
        this.LL = c03k6;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ LifecycleOwner invoke() {
        LifecycleOwner currentLifeCycleOwner = this.LL.getCurrentLifeCycleOwner();
        if (currentLifeCycleOwner != null) {
            return currentLifeCycleOwner;
        }
        "when using VMScope.Custom, we don't allows you to use null lifecycleOwner.".toString();
        throw new IllegalArgumentException("when using VMScope.Custom, we don't allows you to use null lifecycleOwner.");
    }
}

package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JX7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JX7 extends C09AY implements Function0<LifecycleOwner> {
    public final /* synthetic */ C03K6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JX7(C03K6 c03k6) {
        super(0);
        this.LL = c03k6;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ LifecycleOwner invoke() {
        return C827203La.LIZIZ(this.LL.getCurrentLifeCycleOwner());
    }
}

package X;

import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19xe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21708819xe extends C09AY implements Function0<ViewModelStore> {
    public final /* synthetic */ C03K6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21708819xe(C03K6 c03k6) {
        super(0);
        this.LL = c03k6;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        return C827203La.LIZIZ(this.LL.getCurrentLifeCycleOwner()).getViewModelStore();
    }
}

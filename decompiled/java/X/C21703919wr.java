package X;

import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19wr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21703919wr extends C09AY implements Function0<ViewModelStore> {
    public final /* synthetic */ C03K6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21703919wr(C03K6 c03k6) {
        super(0);
        this.LL = c03k6;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        if (this.LL.getCurrentLifeCycleOwner() instanceof AbstractC738140SxQ) {
            return ((AbstractC738140SxQ) this.LL.getCurrentLifeCycleOwner()).getViewModelStore();
        }
        throw new IllegalStateException("Check failed.");
    }
}

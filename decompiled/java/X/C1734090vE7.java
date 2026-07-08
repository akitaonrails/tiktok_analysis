package X;

import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vE7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734090vE7 extends C09AY implements Function0<ViewModelStore> {
    public final /* synthetic */ C03K6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734090vE7(C03K6 c03k6) {
        super(0);
        this.LL = c03k6;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        return C827203La.LIZ(this.LL.getContext()).getViewModelStore();
    }
}

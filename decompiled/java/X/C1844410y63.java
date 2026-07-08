package X;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0y63, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844410y63 extends C09AY implements Function0<ViewModelProvider> {
    public final /* synthetic */ C1844400y62<F> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1844410y63(C1844400y62<F> c1844400y62) {
        super(0);
        this.LL = c1844400y62;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelProvider invoke() {
        return ViewModelProviders.of(this.LL.LIZLLL);
    }
}

package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1827770xfD extends C09AY implements Function0<LifecycleOwner> {
    public final /* synthetic */ C03K6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1827770xfD(C03K6 c03k6) {
        super(0);
        this.LL = c03k6;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ LifecycleOwner invoke() {
        if (this.LL.getCurrentLifeCycleOwner() instanceof AbstractC738140SxQ) {
            return this.LL.getCurrentLifeCycleOwner();
        }
        throw new IllegalStateException("Check failed.");
    }
}

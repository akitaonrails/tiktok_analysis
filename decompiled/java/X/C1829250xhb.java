package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xhb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1829250xhb extends C09AY implements Function0<LifecycleOwner> {
    public final /* synthetic */ C03K6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1829250xhb(C03K6 c03k6) {
        super(0);
        this.LL = c03k6;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ LifecycleOwner invoke() {
        return C827203La.LIZ(this.LL.getContext());
    }
}

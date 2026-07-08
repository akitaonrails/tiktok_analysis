package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19wR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21701319wR extends C09AY implements Function0<InterfaceC665370Q7z> {
    public final /* synthetic */ C03K6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21701319wR(C03K6 c03k6) {
        super(0);
        this.LL = c03k6;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ InterfaceC665370Q7z invoke() {
        AbstractC738140SxQ abstractC738140SxQ;
        if (!(this.LL.getCurrentLifeCycleOwner() instanceof AbstractC738140SxQ)) {
            throw new IllegalStateException("Check failed.");
        }
        LifecycleOwner currentLifeCycleOwner = this.LL.getCurrentLifeCycleOwner();
        if (!(currentLifeCycleOwner instanceof AbstractC738140SxQ) || (abstractC738140SxQ = (AbstractC738140SxQ) currentLifeCycleOwner) == null) {
            return null;
        }
        return C1558520qew.LJIIL(abstractC738140SxQ);
    }
}

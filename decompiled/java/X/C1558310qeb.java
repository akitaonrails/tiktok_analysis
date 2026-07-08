package X;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qeb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558310qeb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ C1555410qZv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558310qeb(C19EG c19eg, C1555410qZv c1555410qZv) {
        super(0);
        this.LL = c19eg;
        this.LLILLJJLI = c1555410qZv;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Lifecycle.State stateLIZ = C1558360qeg.LIZ(this.LL.getLifecycle());
        if (stateLIZ != null && stateLIZ != Lifecycle.State.DESTROYED) {
            C665430Q8f.LIZIZ(String.valueOf(this.LL.hashCode()), this.LLILLJJLI, this.LL);
        }
        return Unit.LIZ;
    }
}

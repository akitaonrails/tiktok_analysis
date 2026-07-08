package X;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558300qea extends C09AY implements Function0<C1554810qYx> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558300qea(C19EG c19eg, String str) {
        super(0);
        this.LL = c19eg;
        this.LLILLJJLI = str;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0qYx] */
    @Override // kotlin.jvm.functions.Function0
    public final C1554810qYx invoke() {
        Lifecycle.State stateLIZ = C1558360qeg.LIZ(this.LL.getLifecycle());
        if (stateLIZ == null || stateLIZ != Lifecycle.State.DESTROYED) {
            return null;
        }
        final C19EG c19eg = this.LL;
        final String strLIZ = C1558290qeZ.LIZ(this.LLILLJJLI);
        return new C1555410qZv(c19eg, strLIZ) { // from class: X.0qYx
        };
    }
}

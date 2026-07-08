package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N7T, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N7T extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Runnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0N7T(Runnable runnable) {
        super(0);
        this.LL = runnable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.run();
        return Unit.LIZ;
    }
}

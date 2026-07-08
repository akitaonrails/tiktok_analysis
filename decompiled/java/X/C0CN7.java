package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CN7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CN7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Runnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CN7(RunnableC2080408Da runnableC2080408Da) {
        super(0);
        this.LL = runnableC2080408Da;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.run();
        return Unit.LIZ;
    }
}

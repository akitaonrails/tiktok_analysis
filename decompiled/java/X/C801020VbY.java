package X;

import Y.ARunnableS113S0100000_13;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801020VbY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1562500qlM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C801020VbY(C1562500qlM c1562500qlM) {
        super(0);
        this.LL = c1562500qlM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Executor executor = C725450Scx.LIZIZ;
        if (executor != null) {
            executor.execute(new ARunnableS113S0100000_13(this.LL, 229));
        }
        return Unit.LIZ;
    }
}

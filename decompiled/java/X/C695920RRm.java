package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695920RRm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Runnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C695920RRm(Runnable runnable) {
        super(0);
        this.LL = runnable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.run();
        return Unit.LIZ;
    }
}

package X;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145460fui extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Runnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145460fui(RunnableC169100kr runnableC169100kr) {
        super(0);
        this.LL = runnableC169100kr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((Handler) C1145410fud.LJI.getValue()).removeCallbacks(this.LL);
        return Unit.LIZ;
    }
}

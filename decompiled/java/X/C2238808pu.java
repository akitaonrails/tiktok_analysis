package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08pu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2238808pu extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C2238608ps LL;
    public final /* synthetic */ Runnable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2238808pu(C2238608ps c2238608ps, RunnableC2238708pt runnableC2238708pt) {
        super(1);
        this.LL = c2238608ps;
        this.LLILLJJLI = runnableC2238708pt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.LL.removeCallbacks(this.LLILLJJLI);
        return Unit.LIZ;
    }
}

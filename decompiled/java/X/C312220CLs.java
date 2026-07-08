package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312220CLs extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AtomicBoolean LL;
    public final /* synthetic */ Runnable LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C312220CLs(AtomicBoolean atomicBoolean, RunnableC312210CLr runnableC312210CLr, Function0 function0) {
        super(0);
        this.LL = atomicBoolean;
        this.LLILLJJLI = runnableC312210CLr;
        this.LLILLL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.compareAndSet(false, true)) {
            C312230CLt.LIZIZ().removeCallbacks(this.LLILLJJLI);
            Function0<Unit> function0 = this.LLILLL;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.LIZ;
    }
}

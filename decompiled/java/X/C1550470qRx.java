package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550470qRx extends C09AY implements Function1<Object, Unit> {
    public final /* synthetic */ C1550480qRy<Object, Object> LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1550500qS0<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1550470qRx(C1550480qRy<Object, Object> c1550480qRy, Object obj, C1550500qS0<Object> c1550500qS0) {
        super(1);
        this.LL = c1550480qRy;
        this.LLILLJJLI = obj;
        this.LLILLL = c1550500qS0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        final C1550480qRy<Object, Object> c1550480qRy = this.LL;
        final Object obj2 = this.LLILLJJLI;
        final C1550500qS0<Object> c1550500qS0 = this.LLILLL;
        c1550480qRy.LIZJ.schedule(new Runnable() { // from class: X.0qRz
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("Deduplicate@5cf3.scheduleClean$1");
                try {
                    try {
                        C189200o6.m2constructorimpl(c1550480qRy.LIZ(obj2, new C1550510qS1(c1550500qS0)));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("Deduplicate@5cf3.scheduleClean$1");
            }
        }, c1550480qRy.LIZIZ, TimeUnit.MILLISECONDS);
        this.LL.LIZ(this.LLILLJJLI, new C1550450qRv(obj));
        return Unit.LIZ;
    }
}

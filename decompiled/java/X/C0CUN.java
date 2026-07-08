package X;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CUN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CUN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ EnumC1585090rLn LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CUN(C19EG c19eg, EnumC1585090rLn enumC1585090rLn) {
        super(0);
        this.LL = c19eg;
        this.LLILLJJLI = enumC1585090rLn;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        C343520DdO.LJFF = true;
        Handler handlerLIZIZ = C799570VYd.LIZIZ();
        final C19EG c19eg = this.LL;
        final EnumC1585090rLn enumC1585090rLn = this.LLILLJJLI;
        C786410Ut5.LJJZZIII(handlerLIZIZ, new Runnable() { // from class: X.0CUM
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TabStabilityReporter@8aab.tryReportTabStabilityDiff$2$1");
                try {
                    C343520DdO c343520DdO = C343520DdO.LIZ;
                    C19EG c19eg2 = c19eg;
                    EnumC1585090rLn enumC1585090rLn2 = enumC1585090rLn;
                    c343520DdO.getClass();
                    C343520DdO.LIZ(c19eg2, enumC1585090rLn2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TabStabilityReporter@8aab.tryReportTabStabilityDiff$2$1");
            }
        });
        return Unit.LIZ;
    }
}

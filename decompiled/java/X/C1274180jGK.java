package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jGK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274180jGK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1274180jGK(C1276910jKj c1276910jKj) {
        super(0);
        this.LL = c1276910jKj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.LJJLIIIJILLIZJL()) {
            synchronized (C1274170jGJ.LIZ) {
                try {
                    C1274170jGJ.LIZIZ = 0.0d;
                    C1274170jGJ.LIZJ = 0;
                    C1274170jGJ.LIZLLL = 0.0d;
                    C1274170jGJ.LJ = 0;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1274170jGJ.LIZLLL();
        }
        return Unit.LIZ;
    }
}

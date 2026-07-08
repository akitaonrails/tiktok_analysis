package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1588230rQr {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(604));
    public volatile boolean LIZIZ;

    public abstract void LIZJ();

    public final List<Integer> LIZ() {
        if (!this.LIZIZ) {
            synchronized (this) {
                try {
                    if (!this.LIZIZ) {
                        LIZJ();
                        this.LIZIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ();
    }

    public final List<Integer> LIZIZ() {
        return (List) this.LIZ.getValue();
    }
}

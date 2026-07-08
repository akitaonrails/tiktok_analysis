package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BMC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1BMC {
    public volatile boolean LIZ;
    public volatile View LIZIZ;

    public final View LIZ() {
        if (!this.LIZ) {
            synchronized (this) {
                try {
                    if (!this.LIZ) {
                        this.LIZ = true;
                        this.LIZIZ = ((C1BMB) this).LIZJ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZIZ;
    }
}

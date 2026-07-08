package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0uJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698930uJP {
    public final int LIZ;
    public JSONArray LIZIZ;
    public final Object LIZJ = new Object();

    public final void LIZ() {
        synchronized (this.LIZJ) {
            try {
                this.LIZIZ = new JSONArray();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1698930uJP(int i) {
        this.LIZ = i;
    }
}

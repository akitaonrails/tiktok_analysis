package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.RTCVideoInterface;

/* JADX INFO: renamed from: X.0jBN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271110jBN implements InterfaceC1270400jAE {
    public final Object LL = new Object();
    public RTCVideoInterface LLILLJJLI;

    @Override // X.InterfaceC1270400jAE
    public final void LLII(long j, int i, float[] fArr) {
    }

    public final void finalize() throws Throwable {
        super.finalize();
        synchronized (this.LL) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

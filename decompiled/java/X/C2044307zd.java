package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2044307zd {
    public static BPEAHandler LIZ;

    public static Handler LIZ() {
        if (LIZ == null) {
            synchronized (C2044307zd.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new BPEAHandler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}

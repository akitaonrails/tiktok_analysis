package X;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809660VpU {
    public static C809660VpU LIZIZ;
    public final ADM LIZ;

    public final boolean LIZIZ() {
        return this.LIZ.isSupported();
    }

    public final void LIZJ() {
        this.LIZ.startRegister();
    }

    public final void LIZLLL() {
        this.LIZ.startUnregister();
    }

    public C809660VpU(Context context) {
        this.LIZ = new ADM(context);
    }

    public static C809660VpU LIZ(Context context) {
        if (LIZIZ == null) {
            synchronized (C809660VpU.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C809660VpU(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}

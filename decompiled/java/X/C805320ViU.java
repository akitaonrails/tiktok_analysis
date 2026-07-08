package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0ViU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805320ViU {
    public static BPEAHandler LIZ;
    public static String LIZIZ;
    public static boolean LIZJ;

    public static String LIZIZ() throws IOException {
        byte[] bArr = new byte[64];
        C0VSP c0vsp = new C0VSP("/proc/self/cmdline");
        try {
            int i = c0vsp.read(bArr);
            int i2 = 0;
            while (true) {
                if (i2 >= 64) {
                    i2 = -1;
                    break;
                }
                if (bArr[i2] == 0) {
                    break;
                }
                i2++;
            }
            if (i2 > 0) {
                i = i2;
            }
            String str = new String(bArr, 0, i);
            c0vsp.close();
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0vsp.close();
            throw th;
        }
    }

    public static boolean LIZ() {
        return Looper.getMainLooper().getThread() == C786410Ut5.u3();
    }

    public static void LIZJ(Runnable runnable) {
        synchronized (C805320ViU.class) {
            try {
                if (LIZ == null) {
                    LIZ = new BPEAHandler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C786410Ut5.LJJZZIII(LIZ, runnable);
    }
}

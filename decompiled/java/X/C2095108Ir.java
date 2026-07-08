package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Ir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2095108Ir {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static final void LIZLLL() {
        try {
            Runtime.getRuntime().gc();
            System.runFinalization();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final String LIZ(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("0x");
        sbLIZ.append(Integer.toHexString(iIdentityHashCode));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZIZ(int i) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/proc/self/task/");
        sbLIZ.append(i);
        sbLIZ.append("/comm");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new C0VSF(c0vsj));
                try {
                    String line = bufferedReader.readLine();
                    C2107108Nh.LIZ(bufferedReader, null);
                    return line;
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(bufferedReader, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return "Unknown";
            }
        } else {
            return "Unknown";
        }
    }

    public static final void LIZJ(Runnable runnable) {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(LIZ, runnable);
        } else {
            runnable.run();
        }
    }
}

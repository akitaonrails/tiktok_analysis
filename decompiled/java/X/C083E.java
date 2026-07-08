package X;

import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.083E, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C083E {
    public static Class LIZ;
    public static Object LIZIZ;

    public static Object LIZ() {
        if (LIZIZ == null) {
            try {
                synchronized (C083E.class) {
                    try {
                        if (LIZIZ == null) {
                            if (LIZ == null) {
                                LIZ = Class.forName("android.app.ActivityThread");
                            }
                            LIZIZ = C1964607mm.LIZIZ(LIZ, "currentActivityThread", new Object[0]);
                        }
                        if (LIZIZ == null && Looper.myLooper() != Looper.getMainLooper()) {
                            Object obj = new Object();
                            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3(obj, 172));
                            if (LIZIZ == null) {
                                synchronized (obj) {
                                    try {
                                        obj.wait(Mp4ScreenVideoLoadTimeout.CONTROL);
                                    } catch (InterruptedException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Exception th2) {
            }
        }
        return LIZIZ;
    }
}

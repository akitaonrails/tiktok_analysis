package X;

import android.util.AndroidRuntimeException;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0j8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269500j8m {
    public static C1269500j8m LIZJ;
    public final ThreadLocal<C1269510j8n>[] LIZ = new ThreadLocal[2];
    public final Object LIZIZ = new Object();

    public static synchronized C1269500j8m LIZJ() {
        if (LIZJ == null) {
            LIZJ = new C1269500j8m();
        }
        return LIZJ;
    }

    public static void LIZIZ(TECameraCapture tECameraCapture) {
        Cert certFindCert;
        try {
            C1269510j8n c1269510j8nLIZLLL = LIZJ().LIZLLL(0);
            if (c1269510j8nLIZLLL == null) {
                certFindCert = CertProviderManagerKt.findCert("bpea-ttlh_video_capture_stop_release_default", 1476788485);
            } else {
                certFindCert = c1269510j8nLIZLLL.LIZIZ;
            }
            tECameraCapture.disConnect(certFindCert);
            AVLog.ioi("PrivacyCertManager", "TECameraCapture.disConnect with Cert");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.logToIODeviceInternal(6, "PrivacyCertManager", "cameraDisconnectWithCert failed", e);
            AVLog.logKibana(6, "PrivacyCertManager", "cameraDisconnectWithCert failed", e);
            tECameraCapture.disConnect();
        }
    }

    public final C1269510j8n LIZLLL(int i) {
        C1269510j8n c1269510j8n = null;
        if (i < 0 || i >= 2) {
            return null;
        }
        synchronized (this.LIZIZ) {
            try {
                ThreadLocal<C1269510j8n> threadLocal = this.LIZ[i];
                if (threadLocal != null) {
                    C1269510j8n c1269510j8n2 = threadLocal.get();
                    this.LIZ[i].set(null);
                    c1269510j8n = c1269510j8n2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1269510j8n;
    }

    public static int LIZ(TECameraCapture tECameraCapture, C1DJ6 c1dj6) {
        C1269510j8n c1269510j8nLIZLLL = LIZJ().LIZLLL(0);
        if (c1269510j8nLIZLLL != null) {
            try {
                AVLog.ioi("PrivacyCertManager", "TECameraCapture.connect with Cert");
                return tECameraCapture.connect(c1dj6, c1269510j8nLIZLLL.LIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.logToIODeviceInternal(6, "PrivacyCertManager", "cameraConnectWithCert failed", e);
                AVLog.logKibana(6, "PrivacyCertManager", "cameraConnectWithCert failed", e);
                return -1128616532;
            }
        }
        return tECameraCapture.connect(c1dj6);
    }

    public static void LJI(TECameraCapture tECameraCapture, int i) {
        C1269510j8n c1269510j8nLIZLLL = LIZJ().LIZLLL(0);
        if (c1269510j8nLIZLLL != null) {
            try {
                tECameraCapture.switchCamera(i, c1269510j8nLIZLLL.LIZIZ);
                AVLog.ioi("PrivacyCertManager", "TECameraCapture.switchCamera with Cert");
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.logToIODeviceInternal(6, "PrivacyCertManager", "switchCameraWithCert failed", e);
                AVLog.logKibana(6, "PrivacyCertManager", "switchCameraWithCert failed", e);
                return;
            }
        }
        tECameraCapture.switchCamera(i);
    }

    public final void LJFF(int i, C1269510j8n c1269510j8n) {
        if (i >= 0 && i < 2) {
            synchronized (this.LIZIZ) {
                try {
                    ThreadLocal<C1269510j8n> threadLocal = this.LIZ[i];
                    if (threadLocal != null && threadLocal.get() != null) {
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("save cert while it's not emptied before.");
                        C1274080jGA.LIZ.LIZ("PrivacyCertManager.saveCert", androidRuntimeException);
                        if (!C1274040jG6.LIZ()) {
                            AVLog.ioe("PrivacyCertManager", "save cert while it's not emptied before.");
                            AVLog.logKibana(6, "PrivacyCertManager", "save cert while it's not emptied before.", new Throwable());
                        } else {
                            throw androidRuntimeException;
                        }
                    }
                    ThreadLocal<C1269510j8n>[] threadLocalArr = this.LIZ;
                    if (threadLocalArr[i] == null) {
                        threadLocalArr[i] = new ThreadLocal<>();
                    }
                    this.LIZ[i].set(c1269510j8n);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJ(int i, String str, Cert cert) {
        LJFF(i, new C1269510j8n(i, str, cert));
    }
}

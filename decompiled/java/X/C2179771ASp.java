package X;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IDebugConfig;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.math.BigDecimal;
import java.util.Arrays;

/* JADX INFO: renamed from: X.1ASp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179771ASp {
    public static AudioManager LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;
    public static C787370Uud LJ;
    public static long LJFF;
    public static int LJI;
    public static long LJII;
    public static String LJIIIIZZ;

    public static boolean LJIIIZ() {
        return LIZ.isMusicActive();
    }

    static {
        ((IDebugConfig) ServiceManager.get().getService(IDebugConfig.class)).isOpen();
        LIZIZ = -1;
        LIZJ = -1;
        LIZLLL = false;
        LJ = null;
        LJFF = 0L;
        LJI = 3;
        LJII = 0L;
        LJIIIIZZ = "";
    }

    public static int LIZ() {
        AudioDeviceInfo[] devices;
        if (LJIIJJI(C1948707kD.LIZ().getApplicationContext()) || (devices = LIZ.getDevices(1)) == null) {
            return 4;
        }
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            int type = audioDeviceInfo.getType();
            if (type == 3) {
                return 1;
            }
            if (type == 22) {
                return 2;
            }
            if (type == 7 || type == 8) {
                return 3;
            }
        }
        return 0;
    }

    public static String LIZIZ() {
        AudioDeviceInfo[] devices;
        if (Math.abs(System.currentTimeMillis() - LJII) > Mp4ScreenVideoLoadTimeout.CONTROL) {
            if (!LJIIJJI(C1948707kD.LIZ().getApplicationContext()) && (devices = LIZ.getDevices(2)) != null && devices.length >= 1) {
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    int type = audioDeviceInfo.getType();
                    if (type != 3 && type != 4 && type != 22 && (type == 7 || type == 8)) {
                        CharSequence productName = audioDeviceInfo.getProductName();
                        if (productName != null) {
                            LJIIIIZZ = productName.toString();
                        }
                    }
                }
            }
            LJII = System.currentTimeMillis();
        }
        return LJIIIIZZ;
    }

    public static String LIZJ() {
        AudioDeviceInfo[] devices;
        CharSequence productName;
        return (LJIIJJI(C1948707kD.LIZ().getApplicationContext()) || (devices = LIZ.getDevices(2)) == null || devices.length < 1 || (productName = devices[0].getProductName()) == null) ? "none" : productName.toString();
    }

    public static int LIZLLL() {
        AudioDeviceInfo[] devices;
        if (LJIIJJI(C1948707kD.LIZ().getApplicationContext()) || (devices = LIZ.getDevices(2)) == null) {
            return 3;
        }
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            int type = audioDeviceInfo.getType();
            if (type == 3 || type == 4) {
                return 4;
            }
            if (type == 22) {
                return 5;
            }
            if (type == 7 || type == 8) {
                return 2;
            }
        }
        return 0;
    }

    public static int LJ() {
        if (Math.abs(System.currentTimeMillis() - LJFF) > 15000) {
            LJI = LIZLLL();
            LJFF = System.currentTimeMillis();
        }
        return LJI;
    }

    public static double LJIIIIZZ() {
        double dDoubleValue = 0.0d;
        if (!LJIIJJI(C1948707kD.LIZ().getApplicationContext())) {
            try {
                if (LIZIZ < 0) {
                    LIZIZ = LJFF(C1948707kD.LIZ().getApplicationContext());
                }
                if (LIZJ < 0 || !LIZLLL) {
                    LIZJ = LJII(C1948707kD.LIZ().getApplicationContext());
                }
                dDoubleValue = new BigDecimal((((double) LIZJ) * 1.0d) / ((double) LIZIZ)).setScale(2, 4).doubleValue();
                return dDoubleValue;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return dDoubleValue;
    }

    public static int LJFF(Context context) {
        if (LJIIJJI(context)) {
            return -1;
        }
        if (LIZIZ < 0) {
            LIZIZ = C786410Ut5.Z3(LIZ, 3);
        }
        return LIZIZ;
    }

    public static int LJI(Context context) {
        AudioDeviceInfo[] devices;
        if (LJIIJJI(context) || (devices = LIZ.getDevices(2)) == null) {
            return 3;
        }
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            int type = audioDeviceInfo.getType();
            if (type != 3 && type != 4 && type != 22) {
                if (type == 7 || type == 8) {
                    return 2;
                }
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static int LJII(Context context) {
        if (LJIIJJI(context)) {
            return -1;
        }
        try {
            return LIZ.getStreamVolume(3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public static boolean LJIIJ(Context context) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (LJIIJJI(context)) {
            return false;
        }
        C2138608Zk.LIZ.getClass();
        AudioDeviceInfo[] audioDeviceInfoArr2 = C2138608Zk.LIZIZ;
        if (audioDeviceInfoArr2 == null || (audioDeviceInfoArr = (AudioDeviceInfo[]) Arrays.copyOf(audioDeviceInfoArr2, audioDeviceInfoArr2.length)) == null) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            int type = audioDeviceInfo.getType();
            if (type == 3 || type == 4 || type == 7 || type == 8) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIJJI(Context context) {
        if (LIZ == null) {
            try {
                LIZ = (AudioManager) C786410Ut5.H2(context, "audio");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (LIZ == null) {
            return true;
        }
        return false;
    }

    public static void LJIIL(Context context) {
        if (!LIZLLL) {
            try {
                if (LJIIJJI(context)) {
                    return;
                }
                LJ = new C787370Uud(LIZ);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                C786410Ut5.LJIJJ(context, LJ, intentFilter);
                LIZLLL = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}

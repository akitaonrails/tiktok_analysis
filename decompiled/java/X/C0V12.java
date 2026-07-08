package X;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0V12, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V12 {
    public static AudioManager LIZ = null;
    public static int LIZIZ = -1;
    public static boolean LIZJ;
    public static int LIZLLL;
    public static C787430Uuj LJ;
    public static final List<String> LJFF = Collections.synchronizedList(new ArrayList());

    public static void LJII() {
        LIZLLL = 0;
    }

    public static String LIZJ() {
        List<String> list = LJFF;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    return "";
                }
                return TextUtils.join(",", list);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJI() {
        List<String> list = LJFF;
        synchronized (list) {
            try {
                list.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static int LIZLLL() {
        return LIZLLL;
    }

    public static void LIZ(int i) {
        if (!((Boolean) C1474810oTv.j2.getValue()).booleanValue()) {
            return;
        }
        List<String> list = LJFF;
        synchronized (list) {
            try {
                if (list.size() >= 50) {
                    list.remove(0);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append(":");
                sbLIZ.append(i);
                list.add(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static int LIZIZ(Context context) {
        if (LJFF(context)) {
            return -1;
        }
        try {
            return LIZ.getStreamVolume(3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public static boolean LJ(Context context) {
        AudioDeviceInfo[] devices;
        if (LJFF(context) || (devices = LIZ.getDevices(2)) == null) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            int type = audioDeviceInfo.getType();
            if (type == 3 || type == 4 || type == 7 || type == 8) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJFF(Context context) {
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
}

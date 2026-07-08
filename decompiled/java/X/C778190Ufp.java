package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostAbnormalExitPidGuardOpt;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Ufp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778190Ufp {
    public static final int LIZ() {
        int iIntValue = 0;
        try {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) a0.LJJLIIIJILLIZJL(Build.VERSION.RELEASE, new String[]{e3.d}, 0, 6).get(0));
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
                return iIntValue;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return iIntValue;
    }

    public static final boolean LIZJ() {
        boolean zIsBackgroundRestricted = false;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                zIsBackgroundRestricted = ((ActivityManager) C786410Ut5.H2(GlobalContext.getApplicationContext(), "activity")).isBackgroundRestricted();
                return zIsBackgroundRestricted;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return zIsBackgroundRestricted;
    }

    public static final boolean LJFF() {
        PowerManager powerManager;
        try {
            Object objH2 = C786410Ut5.H2(GlobalContext.getApplicationContext(), "power");
            if (!(objH2 instanceof PowerManager) || (powerManager = (PowerManager) objH2) == null) {
                return false;
            }
            if (powerManager.isPowerSaveMode()) {
                return true;
            }
            String str = Build.MANUFACTURER;
            boolean zLJIJI = u.LJIJI(str, "Huawei", true);
            boolean zLJIJI2 = u.LJIJI(str, "Xiaomi", true);
            if (zLJIJI) {
                int i = Settings.System.getInt(C497740JfY.LJII().getContentResolver(), "SmartModeStatus");
                if (i == 4) {
                    return true;
                }
                if (i == 1) {
                    return Intrinsics.LJFF("true", (String) Class.forName("android.os.SystemProperties").getMethod("get", C778860Ugu.LIZ.getClass()).invoke(null, "sys.super_power_save"));
                }
            } else if (zLJIJI2) {
                try {
                    return Settings.System.getInt(C497740JfY.LJII().getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return false;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    public static final boolean LIZLLL() {
        try {
            Context applicationContext = GlobalContext.getApplicationContext();
            return ((PowerManager) C786410Ut5.H2(applicationContext, "power")).isIgnoringBatteryOptimizations(applicationContext.getPackageName());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final boolean LJ() {
        return !LIZJ() || LIZLLL();
    }

    public static final ApplicationExitInfo LIZIZ(Context context) {
        Object next;
        Object next2;
        boolean z;
        Object next3;
        Object next4;
        boolean z2;
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        try {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) C786410Ut5.H2(GlobalContext.getApplicationContext(), "activity")).getHistoricalProcessExitReasons(context.getPackageName(), 0, 12);
            if (LiveHostAbnormalExitPidGuardOpt.enable()) {
                Integer numLIZIZ = InterfaceC772190UQv.S3.LIZIZ();
                ArrayList arrayList = new ArrayList();
                for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
                    if (Intrinsics.LJFF(applicationExitInfo.getProcessName(), context.getPackageName())) {
                        arrayList.add(applicationExitInfo);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next3 = it2.next();
                        int pid = ((ApplicationExitInfo) next3).getPid();
                        if (numLIZIZ == null || pid != numLIZIZ.intValue()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                ApplicationExitInfo applicationExitInfo2 = (ApplicationExitInfo) next3;
                if (applicationExitInfo2 == null) {
                    Iterator it3 = arrayList.iterator();
                    if (!it3.hasNext()) {
                        next4 = null;
                    } else {
                        next4 = it3.next();
                        if (it3.hasNext()) {
                            long timestamp = ((ApplicationExitInfo) next4).getTimestamp();
                            do {
                                Object next5 = it3.next();
                                long timestamp2 = ((ApplicationExitInfo) next5).getTimestamp();
                                if (timestamp < timestamp2) {
                                    next4 = next5;
                                    timestamp = timestamp2;
                                }
                            } while (it3.hasNext());
                        }
                    }
                    return (ApplicationExitInfo) next4;
                }
                return applicationExitInfo2;
            }
            Long lLIZIZ = InterfaceC772190UQv.g3.LIZIZ();
            if (lLIZIZ.longValue() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (ApplicationExitInfo applicationExitInfo3 : historicalProcessExitReasons) {
                    ApplicationExitInfo applicationExitInfo4 = applicationExitInfo3;
                    if (applicationExitInfo4.getTimestamp() < lLIZIZ.longValue() || !Intrinsics.LJFF(applicationExitInfo4.getProcessName(), context.getPackageName())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList2.add(applicationExitInfo3);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                if (!it4.hasNext()) {
                    next2 = null;
                } else {
                    next2 = it4.next();
                    if (it4.hasNext()) {
                        long timestamp3 = ((ApplicationExitInfo) next2).getTimestamp() - lLIZIZ.longValue();
                        do {
                            Object next6 = it4.next();
                            long timestamp4 = ((ApplicationExitInfo) next6).getTimestamp() - lLIZIZ.longValue();
                            if (timestamp3 > timestamp4) {
                                next2 = next6;
                                timestamp3 = timestamp4;
                            }
                        } while (it4.hasNext());
                    }
                }
                return (ApplicationExitInfo) next2;
            }
            ArrayList arrayList3 = new ArrayList();
            for (ApplicationExitInfo applicationExitInfo5 : historicalProcessExitReasons) {
                if (Intrinsics.LJFF(applicationExitInfo5.getProcessName(), context.getPackageName())) {
                    arrayList3.add(applicationExitInfo5);
                }
            }
            Iterator it5 = arrayList3.iterator();
            if (!it5.hasNext()) {
                next = null;
            } else {
                next = it5.next();
                if (it5.hasNext()) {
                    long timestamp5 = ((ApplicationExitInfo) next).getTimestamp();
                    do {
                        Object next7 = it5.next();
                        long timestamp6 = ((ApplicationExitInfo) next7).getTimestamp();
                        if (timestamp5 < timestamp6) {
                            next = next7;
                            timestamp5 = timestamp6;
                        }
                    } while (it5.hasNext());
                }
            }
            return (ApplicationExitInfo) next;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

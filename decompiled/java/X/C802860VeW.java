package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: X.0VeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802860VeW {
    public static volatile boolean LIZ;
    public static volatile Object LIZIZ = new Object();
    public static List<ApplicationExitInfo> LIZJ = null;

    public static String LIZLLL(int i) {
        switch (i) {
            case 1:
                return "WAIT FOR DEBUGGER";
            case 2:
                return "TOO MANY CACHED PROCS";
            case 3:
                return "TOO MANY EMPTY PROCS";
            case 4:
                return "TRIM EMPTY";
            case 5:
                return "LARGE CACHED";
            case 6:
                return "MEMORY PRESSURE";
            case 7:
                return "EXCESSIVE CPU USAGE";
            case 8:
                return "SYSTEM UPDATE_DONE";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "KILL ALL FG";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "KILL ALL BG EXCEPT";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "KILL UID";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "KILL PID";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "INVALID START";
            case 14:
                return "INVALID STATE";
            case 15:
                return "IMPERCEPTIBLE";
            case 16:
                return "REMOVE LRU";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "ISOLATED NOT NEEDED";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "CACHED IDLE FORCED APP STANDBY";
            case 19:
                return "FREEZER BINDER IOCTL";
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return "FREEZER BINDER TRANSACTION";
            case 21:
                return "FORCE STOP";
            case 22:
                return "REMOVE TASK";
            case 23:
                return "STOP APP";
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return "KILL BACKGROUND";
            case 25:
                return "PACKAGE UPDATE";
            default:
                return "UNKNOWN";
        }
    }

    public static boolean LIZ() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static List<ApplicationExitInfo> LIZIZ() {
        List<ApplicationExitInfo> list;
        Context contextLJ;
        ActivityManager activityManager;
        if (!LIZ() || (contextLJ = C0VX9.LJ()) == null || (activityManager = (ActivityManager) C786410Ut5.H2(contextLJ, "activity")) == null) {
            list = null;
        } else if (LIZ) {
            list = LIZJ;
        } else {
            synchronized (LIZIZ) {
                try {
                    if (!LIZ) {
                        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(contextLJ.getPackageName(), 0, 0);
                        LIZJ = historicalProcessExitReasons;
                        historicalProcessExitReasons.sort(new Comparator<ApplicationExitInfo>() { // from class: X.0VfU
                            @Override // java.util.Comparator
                            public final int compare(ApplicationExitInfo applicationExitInfo, ApplicationExitInfo applicationExitInfo2) {
                                long timestamp = applicationExitInfo2.getTimestamp() - applicationExitInfo.getTimestamp();
                                if (timestamp > 0) {
                                    return 1;
                                }
                                if (timestamp == 0) {
                                    return 0;
                                }
                                return -1;
                            }
                        });
                    }
                    LIZ = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            list = LIZJ;
        }
        if (list == null) {
            return null;
        }
        return list;
    }

    public static String LIZJ(long j) {
        try {
            long j2 = j / 1024;
            if (j2 >= 1) {
                if (j2 <= 30) {
                    return "[1~30MB]";
                }
                if (j2 <= 60) {
                    return "(30~100MB]";
                }
                if (j2 <= 100) {
                    return "(60~100MB]";
                }
                if (j2 <= 200) {
                    return "(100~150MB]";
                }
                if (j2 <= 300) {
                    return "(200~300MB]";
                }
                if (j2 <= 400) {
                    return "(300~400MB]";
                }
                if (j2 <= 500) {
                    return "(400~500MB]";
                }
                if (j2 <= 600) {
                    return "(500~600MB]";
                }
                if (j2 <= 700) {
                    return "(600~700MB]";
                }
                if (j2 <= 800) {
                    return "(700~800MB]";
                }
                if (j2 <= 900) {
                    return "(800~900MB]";
                }
                if (j2 <= 1000) {
                    return "(900~1000MB]";
                }
                if (j2 <= 1500) {
                    return "(1GB~1.5GB]";
                }
                if (j2 <= 2000) {
                    return "(1.5GB~2GB]";
                }
                if (j2 <= 3000) {
                    return "(2GB~3GB]";
                }
                if (j2 <= 4000) {
                    return "(3GB~4GB]";
                }
                if (j2 <= 6000) {
                    return "(4GB~6GB]";
                }
                if (j2 <= 8000) {
                    return "(6GB~8GB]";
                }
                return ">8G";
            }
            return "<1MB";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "invalid";
        }
    }
}

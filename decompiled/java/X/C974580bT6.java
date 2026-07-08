package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostEnableMatchResumeSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bT6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974580bT6 {
    public static void LIZ() {
        Context context;
        String str;
        if (Keva.getRepo("live_cohost").getLong("channel_id", 0L) == 0) {
            return;
        }
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        Object objH2 = null;
        if (iHostAppContext != null) {
            context = iHostAppContext.context();
            if (context != null) {
                objH2 = C786410Ut5.H2(context, "activity");
            }
        } else {
            context = null;
        }
        ActivityManager activityManager = (ActivityManager) objH2;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) C13LP.LJJJLL(activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 1));
                if (applicationExitInfo != null) {
                    long j = Keva.getRepo("live_match").getLong("battle_id", 0L);
                    if (j != 0) {
                        C974540bT2 c974540bT2 = C974540bT2.LIZ;
                        applicationExitInfo.getDescription();
                        int reason = applicationExitInfo.getReason();
                        Integer num = (Integer) C1965707mx.LIZ(applicationExitInfo, new Object[0]);
                        applicationExitInfo.getProcessName();
                        JSONObject jSONObject = new JSONObject();
                        Keva repo = Keva.getRepo("live_match");
                        C0K04.LJ("battle_id", j, jSONObject);
                        C0K04.LJFF("uid_list", repo.getString("uid_list", ""), jSONObject);
                        C0K04.LJ("channel_id", repo.getLong("channel_id", 0L), jSONObject);
                        C0K04.LJ("current_user_id", repo.getLong("current_user_id", 0L), jSONObject);
                        C0K04.LJ("current_anchor_id", repo.getLong("current_anchor_id", 0L), jSONObject);
                        C0K04.LJ("room_id", repo.getLong("room_id", 0L), jSONObject);
                        C0K04.LIZLLL(repo.getInt("linked_count", 0), "linked_count", jSONObject);
                        C0K04.LJIIIZ(jSONObject, "is_background", repo.getBoolean("is_background", false));
                        C0K04.LJFF("link_mic_id", repo.getString("link_mic_id", ""), jSONObject);
                        C0K04.LJFF("match_type", repo.getString("match_type", ""), jSONObject);
                        if (reason == 1 || reason == 10 || reason == 11) {
                            C974540bT2.LLIIIILZ(c974540bT2, "positive_finish_battle", jSONObject, 4);
                        } else {
                            String str2 = "UNKNOWN";
                            switch (reason) {
                                case 1:
                                    str = "EXIT_SELF";
                                    break;
                                case 2:
                                    str = "SIGNALED";
                                    break;
                                case 3:
                                    str = "LOW_MEMORY";
                                    break;
                                case 4:
                                    str = "APP CRASH(EXCEPTION)";
                                    break;
                                case 5:
                                    str = "APP CRASH(NATIVE)";
                                    break;
                                case 6:
                                    str = "ANR";
                                    break;
                                case 7:
                                    str = "INITIALIZATION FAILURE";
                                    break;
                                case 8:
                                    str = "PERMISSION CHANGE";
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    str = "EXCESSIVE RESOURCE USAGE";
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    str = "USER REQUESTED";
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    str = "USER STOPPED";
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    str = "DEPENDENCY DIED";
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    str = "OTHER KILLS BY SYSTEM";
                                    break;
                                default:
                                    str = "UNKNOWN";
                                    break;
                            }
                            C0K04.LJFF("app_exit_reason", str, jSONObject);
                            if (num != null) {
                                if (num.intValue() == 1) {
                                    str2 = "SUBREASON_WAIT_FOR_DEBUGGER";
                                } else if (num.intValue() == 2) {
                                    str2 = "SUBREASON_TOO_MANY_CACHED";
                                } else if (num.intValue() == 3) {
                                    str2 = "SUBREASON_TOO_MANY_EMPTY";
                                } else if (num.intValue() == 4) {
                                    str2 = "SUBREASON_TRIM_EMPTY";
                                } else if (num.intValue() == 5) {
                                    str2 = "SUBREASON_LARGE_CACHED";
                                } else if (num.intValue() == 6) {
                                    str2 = "SUBREASON_MEMORY_PRESSURE";
                                } else if (num.intValue() == 7) {
                                    str2 = "SUBREASON_EXCESSIVE_CPU";
                                } else if (num.intValue() == 8) {
                                    str2 = "SUBREASON_SYSTEM_UPDATE_DONE";
                                } else if (num.intValue() == 9) {
                                    str2 = "SUBREASON_KILL_ALL_FG";
                                } else if (num.intValue() == 10) {
                                    str2 = "SUBREASON_KILL_ALL_BG_EXCEPT";
                                } else if (num.intValue() == 11) {
                                    str2 = "SUBREASON_KILL_UID";
                                } else if (num.intValue() == 12) {
                                    str2 = "SUBREASON_KILL_PID";
                                } else if (num.intValue() == 13) {
                                    str2 = "SUBREASON_INVALID_START";
                                } else if (num.intValue() == 15) {
                                    str2 = "SUBREASON_IMPERCEPTIBLE";
                                } else if (num.intValue() == 16) {
                                    str2 = "SUBREASON_REMOVE_LRU";
                                } else if (num.intValue() == 17) {
                                    str2 = "SUBREASON_ISOLATED_NOT_NEEDED";
                                } else if (num.intValue() == 18) {
                                    str2 = "SUBREASON_CACHED_IDLE_FORCED_APP_STANDBY";
                                } else if (num.intValue() == 19) {
                                    str2 = "SUBREASON_FREEZER_BINDER_IOCTL";
                                } else if (num.intValue() == 20) {
                                    str2 = "SUBREASON_FREEZER_BINDER_TRANSACTION";
                                }
                            }
                            C0K04.LJFF("app_exit_sub_reason", str2, jSONObject);
                            C0K04.LIZLLL(0, "other_exit_reason", jSONObject);
                            C974540bT2.LLIIIILZ(c974540bT2, "app_abnormal_exit", jSONObject, 4);
                        }
                        C974540bT2.LJJIIJ();
                    }
                    if (LiveCohostEnableMatchResumeSetting.INSTANCE.isEnableCoHostResume()) {
                        C974540bT2 c974540bT22 = C974540bT2.LIZ;
                        long timestamp = applicationExitInfo.getTimestamp();
                        C974540bT2.LJIIZILJ = timestamp;
                        C974540bT2.LJIJ = System.currentTimeMillis();
                        JSONObject jSONObject2 = new JSONObject();
                        C0K04.LIZLLL(1, "is_app_exit", jSONObject2);
                        C0K04.LJ("cost", C974540bT2.LJIJ - timestamp, jSONObject2);
                        if (C974540bT2.LJIJI != 0) {
                            c974540bT22.LLIILII();
                        }
                        if (C974540bT2.LJIJJ != 0) {
                            c974540bT22.LLIIJLIL();
                        }
                        if (C974540bT2.LJIJJLI != 0) {
                            c974540bT22.LLIIL();
                        }
                        if (C974540bT2.LJIL != 0) {
                            c974540bT22.LLIILZL();
                        }
                        C974540bT2.LLIIIILZ(c974540bT22, "battle_finished_timing", jSONObject2, 12);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}

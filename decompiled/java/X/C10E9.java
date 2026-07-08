package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushUGNewExp;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.10E9, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10E9 extends C824390WVp {
    public static WeakReference<C1397510mTF> LIZ;

    public static void LJIIIZ(C19EG c19eg) {
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(c19eg, 0, "NotificationGuide");
        SharedPreferences.Editor editorEdit = sharedPreferencesLIZJ.edit();
        editorEdit.putInt("guide_show_times", sharedPreferencesLIZJ.getInt("guide_show_times", 0) + 1);
        editorEdit.putLong("guide_last_time", System.currentTimeMillis());
        editorEdit.apply();
    }

    public static boolean LJIIIIZZ(Context context, boolean z, boolean z2) {
        boolean z3;
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "NotificationGuide");
        if (C824390WVp.LIZJ(context)) {
            return false;
        }
        if (z2 || z) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needShowOpenNotificationGuide(interval: ");
        C01GW c01gw = GuideOutPushUGNewExp.LJIIIZ;
        sbLIZ.append(((Number) c01gw.getValue()).intValue());
        sbLIZ.append(", 13+: ");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            z3 = true;
        } else {
            z3 = false;
        }
        sbLIZ.append(z3);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw2 = GuideOutPushUGNewExp.LJIIIIZZ;
        if (!((Boolean) c01gw2.getValue()).booleanValue() && i >= 33) {
            return false;
        }
        if (!((Boolean) c01gw2.getValue()).booleanValue()) {
            if (sharedPreferencesLIZJ.getInt("guide_show_times", 0) >= 1) {
                return false;
            }
            if (System.currentTimeMillis() - sharedPreferencesLIZJ.getLong("guide_last_time", 0L) < 60000) {
                return false;
            }
            return true;
        }
        if (C1488240opa.LIZ().getInt("launch_guide_new_show_times", 0) >= 1) {
            if (System.currentTimeMillis() - C1488240opa.LIZ().getLong("launch_guide_new_last_time", 0L) < ((long) ((Number) c01gw.getValue()).intValue()) * 86400000) {
                return false;
            }
        }
        return true;
    }

    public static void LJII(Context context, boolean z, C10EA c10ea, boolean z2, boolean z3, String str, User user, C10EW c10ew) {
        C10EF c10efLIZIZ;
        if (LJIIIIZZ(context, z, z3)) {
            if (c10ew == null) {
                c10efLIZIZ = null;
            } else {
                try {
                    c10efLIZIZ = c10ew.LIZIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ == null || c19egLIZIZ.isFinishing()) {
                return;
            }
            C810560Vqw.LIZJ(new C10EB(context, z2, c19egLIZIZ, str, z, c10efLIZIZ, z3, c10ea, c10ew, user));
            C1488240opa.LIZ().storeBoolean("noticeGuideShown", true);
            return;
        }
        if (c10ea != null) {
            c10ea.onCancel();
        }
    }
}

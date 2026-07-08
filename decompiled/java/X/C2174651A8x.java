package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.feed.NewUserRecCardProtect;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.1A8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174651A8x {
    public static boolean LIZ() {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            int i = C2187451AjH.LIZ;
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("social_big_card_freq_control", true)) {
            int i2 = C2187451AjH.LIZ;
            return false;
        }
        if (C0BSU.LIZ) {
            int i3 = C2187451AjH.LIZ;
            return true;
        }
        if (C1A9E.LIZ().group <= 5) {
            int i4 = C2187451AjH.LIZ;
            return false;
        }
        C1217080hmE.LIZ.getClass();
        Keva keva = C1217080hmE.LIZIZ;
        if (keva.getBoolean(C1217080hmE.LIZ("rcmd_new_user_protection_flag"), false)) {
            C01GW c01gw = C2174671A8z.LIZJ;
            int i5 = ((NewUserRecCardProtect) c01gw.getValue()).strategy;
            if (1 <= i5 && i5 < 3) {
                if (((NewUserRecCardProtect) c01gw.getValue()).strategy == 1) {
                    int i6 = keva.getInt(C1217080hmE.LIZ("rcmd_new_user_protection_cold_start_count"), 0);
                    int i7 = ((NewUserRecCardProtect) c01gw.getValue()).coldStartCountLimit;
                    int i8 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[isMatchBaseCondition] coldStartCount = ");
                    sbLIZ.append(i6);
                    sbLIZ.append(", limit = ");
                    sbLIZ.append(i7);
                    C1720106oR.LJI("RecSwipeViewModel", C2188811AlT.LIZIZ(sbLIZ));
                    if (i6 <= i7) {
                        return false;
                    }
                }
                if (((NewUserRecCardProtect) c01gw.getValue()).strategy == 2) {
                    long j = keva.getLong(C1217080hmE.LIZ("rcmd_new_user_protection_first_launch_time"), 0L);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i9 = ((NewUserRecCardProtect) c01gw.getValue()).coldStartHourLimit;
                    int i10 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[isMatchBaseCondition] coldStartTimeMillis = ");
                    sbLIZ2.append(j);
                    sbLIZ2.append(", hourLimit = ");
                    sbLIZ2.append(i9);
                    sbLIZ2.append(", currentTimeMillis = ");
                    sbLIZ2.append(jCurrentTimeMillis);
                    C1720106oR.LJI("RecSwipeViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                    if (jCurrentTimeMillis - j <= ((long) i9) * 3600000) {
                        return false;
                    }
                }
            }
        }
        if (C1A9E.LIZIZ()) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Boolean bool = (Boolean) ((LinkedHashMap) C2174611A8t.LIZLLL).get(curUserId);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            int i11 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[fetchRecUserData] uid = ");
            sbLIZ3.append(curUserId);
            sbLIZ3.append(", hasShownInAppSession = ");
            sbLIZ3.append(zBooleanValue);
            C1720106oR.LJI("RecSwipeViewModel", C2188811AlT.LIZIZ(sbLIZ3));
            if (zBooleanValue) {
                return false;
            }
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        int friendCount = curUser != null ? curUser.getFriendCount() : 0;
        if (!C1A9E.LIZ().isWorkForHighMuf && friendCount > 60) {
            int i12 = C2187451AjH.LIZ;
            return false;
        }
        if (!C2276131E7f.LIZ(C1E7L.BIG_CARD_FYP, new C995300c0W(curUser))) {
            return false;
        }
        if (!C2277891EDz.LIZIZ.LJFF()) {
            return true;
        }
        int i13 = C2187451AjH.LIZ;
        return false;
    }
}

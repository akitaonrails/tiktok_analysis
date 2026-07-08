package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510100pOq extends FeatureProducer {
    public static boolean LIZJ;
    public static long LJI;
    public static final C1510100pOq LIZIZ = new C1510100pOq();
    public static String LIZLLL = "f_user";
    public static String LJ = "";
    public static final Set<String> LJFF = C13LQ.LJLIIL(new String[]{"u_clk_poi_cnt", "u_clk_follow_cnt", "u_clk_share_cnt", "u_skip_cnt", "u_comment_cnt", "u_clk_report", "u_live_cnt", "u_clk_music_cnt", "u_clk_fav_cnt", "u_live_dur", "u_profile_cnt", "u_clk_like_cnt", "u_e_comment_cnt"});

    public static void LIZ() {
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || Intrinsics.LJFF(curUser.getUid(), LJ)) {
            return;
        }
        LJ = curUser.getUid();
        C1487560ooU c1487560ooU = C1487560ooU.LIZ;
        c1487560ooU.setFeature("u_frd_cnt", Integer.valueOf(curUser.getFriendCount()), false);
        c1487560ooU.setFeature("u_follower_cnt", Integer.valueOf(curUser.getFollowerCount()), false);
        c1487560ooU.setFeature("u_following_cnt", Integer.valueOf(curUser.getFollowingCount()), false);
        c1487560ooU.setFeature("u_aweme_cnt", Integer.valueOf(curUser.getAwemeCount()), false);
        c1487560ooU.setFeature("u_fav_cnt", Integer.valueOf(curUser.getFavoritingCount()), false);
        c1487560ooU.setFeature("u_be_fav", Integer.valueOf((int) curUser.getTotalFavorited()), false);
        c1487560ooU.setFeature("u_app_launch_timestamp", Long.valueOf(C202094145s.LJIILL), false);
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZLLL;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        if (!LIZJ) {
            LIZJ = true;
            C1487560ooU.LIZ.getClass();
            C1487560ooU.LIZIZ = true;
            FeatureServiceManager.Companion.getClass();
            C1510050pOl.LIZ().addAppLogListener(new InterfaceC1510030pOj() { // from class: X.0pOr
                public static final Map<String, String> LIZJ = C2097608Jq.LJIIIIZZ(new Pair("click_comment_button", "u_e_comment_cnt"), new Pair("video_play_finish", "u_finish_cnt"), new Pair("like", "u_clk_like_cnt"), new Pair("enter_personal_detail", "u_profile_cnt"), new Pair("enter_music_detail", "u_clk_music_cnt"), new Pair("follow", "u_clk_follow_cnt"), new Pair("post_comment", "u_comment_cnt"), new Pair("click_more_button", "u_clk_share_cnt"), new Pair("favourite_video", "u_clk_fav_cnt"), new Pair("poi_click", "u_clk_poi_cnt"), new Pair("livesdk_room_enter_success", "u_live_cnt"), new Pair("livesdk_live_duration", "u_live_dur"), new Pair("click_report", "u_clk_report"));

                @Override // X.InterfaceC1510030pOj
                public final Set<String> events() {
                    return LIZJ.keySet();
                }

                @Override // X.InterfaceC1510030pOj
                public final void handleAppLogEvent(String str, C1510130pOt c1510130pOt) {
                    String str2 = LIZJ.get(str);
                    if (str2 != null) {
                        if (Intrinsics.LJFF(str, "livesdk_live_duration")) {
                            C1487560ooU.LIZ.addFeature(str2, Integer.valueOf(C1509410pNj.LIZIZ(c1510130pOt)), false);
                        } else {
                            C1487560ooU.LIZ.addFeature(str2, Float.valueOf(1.0f), false);
                        }
                    }
                }
            });
            LIZ();
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(new InterfaceC427710Gpt() { // from class: X.0pOs
                @Override // X.InterfaceC427710Gpt
                public final void LLLLLLZZ(int i, User user, User user2) {
                    C1510100pOq.LIZIZ.getClass();
                    C1510100pOq.LIZ();
                }
            });
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZLLL = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        Float f;
        if (returnCode != null) {
            returnCode.code = 200;
        }
        PackageInfo packageInfoY3 = null;
        switch (str.hashCode()) {
            case -1308607330:
                if (str.equals("u_is_login")) {
                    return Boolean.valueOf(((AbstractC848400XPy) C0XQ7.LJFF()).isLogin());
                }
                break;
            case 51882421:
                if (str.equals("u_is_new_user")) {
                    return Boolean.valueOf(((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser());
                }
                break;
            case 1192316997:
                if (str.equals("u_user_id")) {
                    User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                    if (curUser == null) {
                        return null;
                    }
                    return curUser.getUid();
                }
                break;
            case 1525815001:
                if (str.equals("u_app_install_time")) {
                    long j = LJI;
                    if (j == 0) {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        try {
                            PackageManager packageManager = contextLIZ.getPackageManager();
                            if (packageManager != null) {
                                packageInfoY3 = C786410Ut5.Y3(packageManager, contextLIZ.getPackageName(), 0);
                            }
                            if (packageInfoY3 == null) {
                                j = 0;
                            } else {
                                j = packageInfoY3.firstInstallTime;
                            }
                            LJI = j;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            j = 0;
                        }
                        break;
                    }
                    return Long.valueOf(j);
                }
                break;
            case 1661853540:
                if (str.equals("session_id")) {
                    C1510170pOx.LIZ.getClass();
                    C827040WcQ.LIZ.getClass();
                    return C827040WcQ.LIZJ;
                }
                break;
            case 1675534802:
                if (str.equals("u_app_stay_duration")) {
                    Object feature = C1487560ooU.LIZ.getFeature("u_app_launch_timestamp");
                    if (feature instanceof Float) {
                        f = (Float) feature;
                    } else {
                        f = null;
                    }
                    if (f == null) {
                        return null;
                    }
                    return Float.valueOf((SystemClock.uptimeMillis() - f.floatValue()) / LSPassThroughRecordSizeConfig.DEFAULT);
                }
                break;
        }
        Object feature2 = C1487560ooU.LIZ.getFeature(str);
        if (feature2 == null) {
            if (LJFF.contains(str)) {
                return 0;
            }
            if (returnCode == null) {
                return null;
            }
            returnCode.code = 1;
            return null;
        }
        return feature2;
    }
}

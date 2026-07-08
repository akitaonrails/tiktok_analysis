package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0m0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379920m0s {
    public static void LIZ(Bundle bundle, Aweme aweme, String str) {
        JSONObject jSONObject;
        String string;
        Object obj;
        Integer numValueOf;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer numValueOf2;
        Integer numValueOf3;
        int i6;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("enable_compliance_biz_monitor", true)) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ftc_child_mode", C10EU.LJIIIIZZ() ? 1 : 0);
        jSONObject2.put("teen_mode_status", ComplianceServiceProvider.LJIL().LJJJJZI() ? 1 : 0);
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            if (curUser != null && curUser.isSecret()) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            jSONObject2.put("current_user_secret", i6);
        }
        jSONObject2.put("region", C2222691Bz1.LIZIZ());
        if (aweme != null) {
            jSONObject2.put("aweme_is_ads", aweme.isAd() ? 1 : 0);
            AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety != null) {
                numValueOf = Integer.valueOf(statusSafety.getPrivateStatus());
            } else {
                numValueOf = null;
            }
            jSONObject2.put("aweme_private_status", numValueOf);
            AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety2 != null && statusSafety2.isInReviewing()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject2.put("aweme_in_reviewing", i);
            AwemeStatus statusSafety3 = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety3 != null && statusSafety3.isReviewed()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject2.put("aweme_reviewed", i2);
            AwemeStatus statusSafety4 = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety4 != null && statusSafety4.isSelfSee()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject2.put("aweme_self_see", i3);
            AwemeStatus statusSafety5 = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety5 != null && statusSafety5.isProhibited()) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            jSONObject2.put("aweme_is_prohibited", i4);
            AwemeRiskModel awemeRiskModel = aweme.getAwemeRiskModel();
            if (awemeRiskModel != null && awemeRiskModel.isWarn()) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            jSONObject2.put("aweme_warning", i5);
            AwemeStatus statusSafety6 = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety6 != null) {
                numValueOf2 = Integer.valueOf(statusSafety6.getDownloadStatus());
            } else {
                numValueOf2 = null;
            }
            jSONObject2.put("aweme_download_status", numValueOf2);
            jSONObject2.put("aweme_prevent_download", aweme.isPreventDownload() ? 1 : 0);
            VideoControl videoControl = aweme.getVideoControl();
            if (videoControl != null) {
                numValueOf3 = Integer.valueOf(videoControl.preventDownloadType);
            } else {
                numValueOf3 = null;
            }
            jSONObject2.put("aweme_prevent_download_type", numValueOf3);
            Music music = aweme.getMusic();
            if (music != null) {
                jSONObject2.put("music_prevent_download", music.isPreventDownload() ? 1 : 0);
                jSONObject2.put("music_mute_share", music.isMuteShare() ? 1 : 0);
            }
            User author = aweme.getAuthor();
            if (author != null) {
                User curUser2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                if (curUser2 == null || !TextUtils.equals(curUser2.getUid(), author.getUid())) {
                    curUser2 = author;
                }
                jSONObject2.put("author_secret", curUser2.isSecret() ? 1 : 0);
                jSONObject2.put("author_is_current", TextUtils.equals(author.getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid()) ? 1 : 0);
                jSONObject2.put("author_follow_status", curUser2.getFollowStatus());
                jSONObject2.put("author_download_setting", curUser2.getDownloadSetting());
            }
            jSONObject = new JSONObject();
            jSONObject.put("aweme_id", aweme.getAid());
        } else {
            jSONObject = null;
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                try {
                    obj = bundle.get(str2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (obj == null) {
                    string = null;
                } else {
                    string = obj.toString();
                }
                jSONObject2.put(str2, string);
            }
        }
        Iterator<String> itKeys = C1379930m0t.LIZ.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (jSONObject2.has(next)) {
                Object objOpt = jSONObject2.opt(next);
                Object objOpt2 = C1379930m0t.LIZ.opt(next);
                if (objOpt != null && !Intrinsics.LJFF(objOpt, objOpt2)) {
                    C793770VBv.LJII(str, jSONObject2, null, jSONObject);
                    return;
                }
            }
        }
    }
}

package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;

/* JADX INFO: renamed from: X.10yY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19421210yY {
    public static String LIZ(String str) {
        if (str.length() != 0) {
            return UriProtector.parse(str).buildUpon().appendQueryParameter("bundle_webview_background", "ffffff").build().toString();
        }
        return str;
    }

    public static boolean LIZJ(Challenge challenge) {
        if (challenge != null && !TextUtils.isEmpty(challenge.getLinkText()) && !TextUtils.isEmpty(challenge.getLinkAction())) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Challenge challenge) {
        if (challenge != null && !TextUtils.isEmpty(challenge.getRuleDetailDesc()) && !TextUtils.isEmpty(challenge.getRuleDetailDesc())) {
            return true;
        }
        return false;
    }

    public static boolean LJ(Challenge challenge) {
        ChallengeDisclaimer challengeDisclaimer;
        if (challenge == null || (challengeDisclaimer = challenge.getChallengeDisclaimer()) == null || TextUtils.isEmpty(challengeDisclaimer.getTitle()) || TextUtils.isEmpty(challengeDisclaimer.getContent())) {
            return false;
        }
        return true;
    }

    public static String LIZIZ(String str, String str2, String str3) {
        if (str.length() != 0) {
            return UriProtector.parse(str).buildUpon().appendQueryParameter("commerce_enter_from", str2).appendQueryParameter("challenge_id", str3).build().toString();
        }
        return str;
    }
}

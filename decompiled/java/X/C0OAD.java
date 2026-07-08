package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0OAD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OAD {
    public static boolean LIZIZ(Aweme aweme) {
        if (aweme != null) {
            if (aweme.getTakeDownReason() == 6 || aweme.getTakeDownReason() == 8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme) {
        if (LIZIZ(aweme) && C729980SkG.LJIIIIZZ(aweme)) {
            return true;
        }
        return false;
    }

    public static String LIZ(int i, Aweme aweme) {
        if (aweme != null && !aweme.getIsTikTokStory() && aweme.getAwemeType() != 40) {
            if (!TextUtils.isEmpty(aweme.getTakeDownDesc()) && LIZIZ(aweme)) {
                return aweme.getTakeDownDesc();
            }
            C844470XAv.LIZ.getClass();
            return C844470XAv.LIZ().getString(i);
        }
        return "";
    }
}

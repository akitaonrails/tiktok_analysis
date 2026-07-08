package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.config.HashtagFeedbackValue;

/* JADX INFO: renamed from: X.116r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194475116r {
    public static HashtagFeedbackValue LIZIZ;
    public static final C194475116r LIZ = new C194475116r();
    public static final String LIZJ = "Give feedback";
    public static final String LIZLLL = "Submit";
    public static final String LJ = "Thanks for your feedback!";

    public static HashtagFeedbackValue LIZ() {
        HashtagFeedbackValue hashtagFeedbackValue = LIZIZ;
        if (hashtagFeedbackValue != null) {
            return hashtagFeedbackValue;
        }
        HashtagFeedbackValue hashtagFeedbackValue2 = (HashtagFeedbackValue) SettingsManager.LIZLLL().LJIIIIZZ("search_creation_hashtag_feesback_optional_config", HashtagFeedbackValue.class, null);
        LIZIZ = hashtagFeedbackValue2;
        return hashtagFeedbackValue2;
    }
}

package X;

import com.ss.android.ugc.aweme.feed.features.model.SessionFeatureItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DCU, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCU<I> implements InterfaceC2251961DCg {
    public static final C1DCU<I> LIZ = new C1DCU<>();

    @Override // X.InterfaceC2251961DCg
    public final void LIZIZ(C204535151p c204535151p) {
        C603460Nlg c603460Nlg;
        InterfaceC582850MtX interfaceC582850MtX = c204535151p.LIZIZ;
        if ((interfaceC582850MtX instanceof C603460Nlg) && (c603460Nlg = (C603460Nlg) interfaceC582850MtX) != null) {
            String str = c603460Nlg.LIZ;
            if ((!Intrinsics.LJFF(str, "video_feedback_bar_show") && !Intrinsics.LJFF(str, "video_feedback_bar_disappear")) || !Intrinsics.LJFF(c603460Nlg.LIZIZ.getValue("survey_user_type"), "new_user")) {
                return;
            }
            SessionFeatureItem sessionFeatureItem = c204535151p.LIZ;
            if (Intrinsics.LJFF(str, "video_feedback_bar_show")) {
                sessionFeatureItem.isSurveyShowed = Boolean.TRUE;
                return;
            }
            if (!Intrinsics.LJFF(str, "video_feedback_bar_disappear")) {
                return;
            }
            String value = c603460Nlg.LIZIZ.getValue("action");
            if (Intrinsics.LJFF(value, "Like")) {
                sessionFeatureItem.isSurveyLiked = Boolean.TRUE;
                sessionFeatureItem.isSurveyNotLiked = Boolean.FALSE;
            } else if (Intrinsics.LJFF(value, "Dislike")) {
                sessionFeatureItem.isSurveyLiked = Boolean.FALSE;
                sessionFeatureItem.isSurveyNotLiked = Boolean.TRUE;
            } else {
                Boolean bool = Boolean.FALSE;
                sessionFeatureItem.isSurveyLiked = bool;
                sessionFeatureItem.isSurveyNotLiked = bool;
            }
        }
    }
}

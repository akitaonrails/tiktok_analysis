package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.comment.experiment.CommentSurveyTemplate;

/* JADX INFO: renamed from: X.0ORo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619500ORo {
    public static final CommentSurveyTemplate[] LIZ;

    static {
        CommentSurveyTemplate[] commentSurveyTemplateArr = new CommentSurveyTemplate[0];
        CommentSurveyTemplate[] commentSurveyTemplateArr2 = (CommentSurveyTemplate[]) SettingsManager.LIZLLL().LJIIIIZZ("survey_source", CommentSurveyTemplate[].class, commentSurveyTemplateArr);
        if (commentSurveyTemplateArr2 != null) {
            commentSurveyTemplateArr = commentSurveyTemplateArr2;
        }
        LIZ = commentSurveyTemplateArr;
    }
}

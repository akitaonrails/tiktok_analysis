package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.comment.experiment.CommentSurveyDataItem;

/* JADX INFO: renamed from: X.0C2L, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C2L {
    public static final CommentSurveyDataItem[] LIZ;

    static {
        CommentSurveyDataItem[] commentSurveyDataItemArr = new CommentSurveyDataItem[0];
        CommentSurveyDataItem[] commentSurveyDataItemArr2 = (CommentSurveyDataItem[]) SettingsManager.LIZLLL().LJIIIIZZ("comment_survey", CommentSurveyDataItem[].class, commentSurveyDataItemArr);
        if (commentSurveyDataItemArr2 != null) {
            commentSurveyDataItemArr = commentSurveyDataItemArr2;
        }
        LIZ = commentSurveyDataItemArr;
    }
}

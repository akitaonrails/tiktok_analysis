package X;

import com.ss.android.ugc.aweme.comment.experiment.CommentSurveyDataItem;
import com.ss.android.ugc.aweme.comment.experiment.FeedSurvey;

/* JADX INFO: renamed from: X.0zpt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911270zpt {
    public static int LIZ;

    public static CommentSurveyDataItem LIZIZ() {
        CommentSurveyDataItem[] commentSurveyDataItemArr = C0C2L.LIZ;
        if (commentSurveyDataItemArr.length != 0) {
            LIZ = 1;
            return commentSurveyDataItemArr[0];
        }
        CommentSurveyDataItem[] commentSurveyDataItemArr2 = C0C2K.LIZ;
        if (commentSurveyDataItemArr2.length == 0) {
            return null;
        }
        LIZ = 2;
        return commentSurveyDataItemArr2[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ() {
        /*
            com.ss.android.ugc.aweme.comment.experiment.CommentSurveyDataItem r0 = LIZIZ()
            r5 = 0
            if (r0 == 0) goto Ld
            com.ss.android.ugc.aweme.comment.experiment.FeedSurvey r0 = r0.fixedSurvey
            if (r0 == 0) goto Ld
            java.lang.String r5 = r0.surveyKey
        Ld:
            com.ss.android.ugc.aweme.comment.experiment.CommentSurveyTemplate[] r4 = X.C619500ORo.LIZ
            int r3 = r4.length
            r2 = 0
        L11:
            if (r2 >= r3) goto L21
            r1 = r4[r2]
            java.lang.String r0 = r1.id
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 == 0) goto L24
            java.lang.String r0 = r1.schema
            if (r0 != 0) goto L23
        L21:
            java.lang.String r0 = ""
        L23:
            return r0
        L24:
            int r2 = r2 + 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1911270zpt.LIZ():java.lang.String");
    }

    public static String LIZJ() {
        FeedSurvey feedSurvey;
        String str;
        CommentSurveyDataItem commentSurveyDataItemLIZIZ = LIZIZ();
        return (commentSurveyDataItemLIZIZ == null || (feedSurvey = commentSurveyDataItemLIZIZ.fixedSurvey) == null || (str = feedSurvey.id) == null) ? "" : str;
    }
}

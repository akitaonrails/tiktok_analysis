package X;

import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentEventModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0lF7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350310lF7 {
    public static final CommentContextSource LIZ(C1350320lF8 c1350320lF8) {
        CommentContextSource commentContextSource = new CommentContextSource();
        String str = c1350320lF8.LLILZIL;
        String str2 = c1350320lF8.LLILLJJLI;
        String str3 = c1350320lF8.LLILZLL;
        commentContextSource.setCommonModel(new CommentCommonModel(c1350320lF8.LL, c1350320lF8.LLJ, str2, null, str3, null, null, false, c1350320lF8.LLILLL, null, null, null, c1350320lF8.LLJI, null, false, false, true, false, 0, -1, -1, -1, false, false, false, false, false, false, false, null, null, 1, true, false, null, null, "", false, false, "", null, null, null, null, null, false, false, false, false, false, null, null, -1, null, null, null, "", false, false, false, "", null, str, Boolean.FALSE, 0, true, false, false, null, null, null, null, null, false));
        commentContextSource.setEventModel(new CommentEventModel(c1350320lF8.LLJ, "", "", "", "", "", "", "", "", "", "", "", 0L, 0, 0.0f, 0, 0, false, "", "", false, 0, false, "", c1350320lF8.LLILZLL, "", false, "", 5, "", 0L, "", "", "", "", c1350320lF8.LLIZ, c1350320lF8.LLIZLLLIL, null, null, new ArrayList()));
        commentContextSource.setRefactorTitlePanel(true);
        return commentContextSource;
    }
}

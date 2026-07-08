package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0kyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339840kyE {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Comment comment) {
        List<TextExtraStruct> textExtra;
        if (comment == null || (textExtra = comment.getTextExtra()) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        for (TextExtraStruct textExtraStruct : textExtra) {
            if (textExtraStruct != null && textExtraStruct.getType() == 0 && textExtraStruct.isTakoUser()) {
                return "1";
            }
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}

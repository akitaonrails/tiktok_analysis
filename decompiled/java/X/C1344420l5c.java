package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0l5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344420l5c {
    public static final boolean LIZ;
    public static final LinkedHashMap<String, List<Comment>> LIZIZ;

    static {
        LIZ = ((Number) C276020Aro.LIZ.getValue()).intValue() == 1;
        LIZIZ = new LinkedHashMap<>();
    }

    public static void LIZ(Comment comment) {
        if (LIZ && comment.getCommentType() == 1) {
            LinkedHashMap<String, List<Comment>> linkedHashMap = LIZIZ;
            List<Comment> listLJIILJJIL = linkedHashMap.get(comment.getAwemeId());
            if (listLJIILJJIL == null) {
                listLJIILJJIL = C1697810uHb.LJIILJJIL(comment);
            } else {
                listLJIILJJIL.add(comment);
            }
            linkedHashMap.put(comment.getAwemeId(), listLJIILJJIL);
        }
    }
}

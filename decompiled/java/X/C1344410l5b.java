package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0l5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344410l5b {
    public static final LinkedHashMap<String, List<Comment>> LIZ = new LinkedHashMap<>();

    public static void LIZ(Comment comment) {
        String awemeId;
        if (comment.getCommentType() != 1 || (awemeId = comment.getAwemeId()) == null) {
            return;
        }
        LinkedHashMap<String, List<Comment>> linkedHashMap = LIZ;
        List<Comment> arrayList = linkedHashMap.get(awemeId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(awemeId, arrayList);
        }
        arrayList.add(comment);
    }
}

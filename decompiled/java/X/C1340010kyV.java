package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340010kyV {
    public static Comment LIZ(List list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Comment comment = (Comment) next;
            if (comment.getCommentType() != 1 && comment.getImageList() == null && comment.getStickerStruct() == null && comment.getCommentType() != 4 && C123100dR.LIZ(comment.getText()) && !comment.isUserBuried()) {
                obj = next;
                break;
            }
        }
        return (Comment) obj;
    }
}

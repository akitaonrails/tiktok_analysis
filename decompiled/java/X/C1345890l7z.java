package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0l7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345890l7z {
    public static final Map<String, C1345990l89> LIZ = new HashMap();

    public static boolean LIZ(Comment comment) {
        int i;
        if (comment == null) {
            return false;
        }
        C1345990l89 c1345990l89 = (C1345990l89) ((HashMap) LIZ).get(comment.getFakeId());
        if (c1345990l89 == null || 1 > (i = c1345990l89.LIZ) || i >= 4 || c1345990l89.LIZJ < 0) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(Comment comment, int i) {
        C1345990l89 c1345990l89;
        if (comment == null) {
            return;
        }
        Map<String, C1345990l89> map = LIZ;
        String fakeId = comment.getFakeId();
        HashMap map2 = (HashMap) map;
        C1345990l89 c1345990l892 = (C1345990l89) map2.get(comment.getFakeId());
        if (c1345990l892 != null) {
            c1345990l89 = C1345990l89.LIZ(c1345990l892, 0, null, null, i, 47);
        } else {
            c1345990l89 = new C1345990l89(0, null, null, i, 47);
        }
        map2.put(fakeId, c1345990l89);
    }
}

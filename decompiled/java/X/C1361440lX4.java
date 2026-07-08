package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lX4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361440lX4 extends AbstractC1361510lXB<Comment, C1361470lX7> {
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, C1361470lX7>> LIZ = new ConcurrentHashMap<>();

    @Override // X.AbstractC1361510lXB
    public final InterfaceC1361520lXC LIZJ(Comment comment) {
        ConcurrentHashMap<String, C1361470lX7> concurrentHashMapPutIfAbsent;
        ConcurrentHashMap<String, ConcurrentHashMap<String, C1361470lX7>> concurrentHashMap = this.LIZ;
        String awemeId = comment.getAwemeId();
        ConcurrentHashMap<String, C1361470lX7> concurrentHashMap2 = concurrentHashMap.get(awemeId);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(awemeId, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        return new C1361450lX5(concurrentHashMap2);
    }

    @Override // X.AbstractC1361510lXB
    public final String LJ(Comment comment) {
        String cid = comment.getCid();
        if (cid == null) {
            return "";
        }
        return cid;
    }

    @Override // X.AbstractC1361510lXB
    public final boolean LIZ(C164B c164b, Object obj) {
        String desc;
        C1361470lX7 c1361470lX7 = (C1361470lX7) c164b;
        Comment comment = (Comment) obj;
        boolean zLIZ = C1339540kxk.LIZ(comment);
        if (!Intrinsics.LJFF(c1361470lX7.LIZ, comment.getText())) {
            if (zLIZ) {
                String str = c1361470lX7.LIZ;
                Aweme aliasAweme = comment.getAliasAweme();
                if (aliasAweme != null) {
                    desc = aliasAweme.getDesc();
                } else {
                    desc = null;
                }
                if (Intrinsics.LJFF(str, desc)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}

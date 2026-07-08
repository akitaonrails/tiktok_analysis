package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: X.0VM2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VM2 {
    public final Type LIZ = new TypeToken<List<? extends FriendsV3FeedModel>>() { // from class: X.0VM3
    }.getType();

    public static LogPbBean LIZIZ(String str) {
        Object c098200Yq;
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = (LogPbBean) C1227904rF.LIZIZ(str, LogPbBean.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (LogPbBean) c098200Yq;
    }

    public final List<FriendsV3FeedModel> LIZ(String str) {
        Object c098200Yq;
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Type type = this.LIZ;
            c1227904rF.getClass();
            c098200Yq = (List) C1227904rF.LIZJ(str, type);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (List) c098200Yq;
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.params.PushStreamData;
import com.ss.pusher.core.utils.GsonHolder;

/* JADX INFO: renamed from: X.07dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1908507dj {
    public static PushStreamData LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = (PushStreamData) GsonHolder.LIZ.LJII(str, PushStreamData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        PushStreamData pushStreamData = new PushStreamData();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = pushStreamData;
        }
        return (PushStreamData) c098200Yq;
    }
}

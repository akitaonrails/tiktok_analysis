package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;

/* JADX INFO: renamed from: X.0gAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155320gAc {
    public static DramaExtraTrackingParams LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = (DramaExtraTrackingParams) C7740030o.LIZ().getGson().LJII(str, DramaExtraTrackingParams.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (DramaExtraTrackingParams) c098200Yq;
    }
}

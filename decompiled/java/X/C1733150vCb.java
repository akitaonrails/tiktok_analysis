package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.audience.us.business.billboard.feed.OecLivePreviewRoomData;

/* JADX INFO: renamed from: X.0vCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733150vCb {
    public static final OecLivePreviewRoomData LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = (OecLivePreviewRoomData) C09C2.LIZ().LJII(str, OecLivePreviewRoomData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (OecLivePreviewRoomData) c098200Yq;
    }
}

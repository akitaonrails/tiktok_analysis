package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.business.billboard.feed.SeaLiveOecPreviewRoomData;

/* JADX INFO: renamed from: X.0cGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005440cGs {
    public static final SeaLiveOecPreviewRoomData LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = (SeaLiveOecPreviewRoomData) C09C2.LIZ().LJII(str, SeaLiveOecPreviewRoomData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (SeaLiveOecPreviewRoomData) c098200Yq;
    }
}

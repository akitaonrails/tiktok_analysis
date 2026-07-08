package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0hL7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200270hL7 {
    public static final C1200260hL6 LIZ(C1200260hL6 c1200260hL6) {
        Object c098200Yq;
        LinkedHashMap linkedHashMap;
        IAVPublishExtension.Callback callback = c1200260hL6.LLILZLL;
        if (callback == null) {
            return c1200260hL6;
        }
        Object obj = null;
        try {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(callback.getValidHashTagList(), ",", null, null, 0, null, null, 62);
            Map<String, String> map = c1200260hL6.LL;
            if (map != null) {
                linkedHashMap = new LinkedHashMap(map);
            } else {
                linkedHashMap = null;
            }
            if (C123100dR.LIZ(strLJJLIIIJ) && linkedHashMap != null) {
                linkedHashMap.put("hashtag_list", strLJJLIIIJ);
            }
            c098200Yq = C1200260hL6.LIZ(c1200260hL6, linkedHashMap, null, 62);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        C1200260hL6 c1200260hL62 = (C1200260hL6) obj;
        if (c1200260hL62 != null) {
            return c1200260hL62;
        }
        return c1200260hL6;
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.vision.entrance.PhotoSearchEntranceConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.07KY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07KY {
    public static final /* synthetic */ int LIZ = 0;

    public static PhotoSearchEntranceConfig LIZ(Integer num) {
        Object c098200Yq;
        Object obj;
        if (num != null) {
            int iIntValue = num.intValue();
            Object obj2 = null;
            try {
                Map map = (Map) C07KD.LIZ.getValue();
                if (map != null && (obj = map.get(String.valueOf(iIntValue))) != null) {
                    c098200Yq = (PhotoSearchEntranceConfig) C08JS.LIZ(obj.toString(), PhotoSearchEntranceConfig.class);
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
            PhotoSearchEntranceConfig photoSearchEntranceConfig = (PhotoSearchEntranceConfig) obj2;
            if (photoSearchEntranceConfig == null) {
                return new PhotoSearchEntranceConfig(3, 0, false, false, null, false, false, false, Float.valueOf(0.73f), false, false, 0);
            }
            return photoSearchEntranceConfig;
        }
        return new PhotoSearchEntranceConfig(3, 0, false, false, null, false, false, false, Float.valueOf(0.73f), false, false, 0);
    }
}

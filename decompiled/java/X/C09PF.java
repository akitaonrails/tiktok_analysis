package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.memory.ab.LynxViewConfig;

/* JADX INFO: renamed from: X.09PF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09PF {
    public static void LIZ(Object obj, String str) {
        Object c098200Yq;
        T t;
        LynxViewConfig lynxViewConfig;
        if (obj != null && !TextUtils.isEmpty(str) && (obj instanceof View)) {
            if (C2366909Pf.LIZ() || ((lynxViewConfig = C09P3.LIZ().lynxConfig) != null && lynxViewConfig.bid)) {
                Object obj2 = null;
                try {
                    AbstractC1514820pWS abstractC1514820pWSLIZLLL = C1514790pWP.LIZLLL((View) obj);
                    if (abstractC1514820pWSLIZLLL != null && (t = abstractC1514820pWSLIZLLL.LLJIJIL) != 0) {
                        c098200Yq = t.LJ();
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
                String str2 = (String) obj2;
                if (str2 != null && str2.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append("_bid_");
                    sbLIZ.append(str2);
                    str = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            C2103208Lu c2103208Lu = C2103208Lu.LIZ;
            C2103208Lu.LIZIZ(str, 3, C2366909Pf.LIZ() ? 1 : 0, C09P3.LIZ().timestamp, obj);
        }
    }
}

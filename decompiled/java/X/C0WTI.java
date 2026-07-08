package X;

import android.webkit.WebResourceRequest;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WTI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTI {
    public static boolean LIZ(WebResourceRequest webResourceRequest, WebKitView webKitView) {
        Object c098200Yq;
        C0WR1 c0wr1 = (C0WR1) webKitView.getHybridContext().LJFF(C0WR1.class);
        if (c0wr1 == null) {
            return false;
        }
        try {
            c098200Yq = Boolean.valueOf(c0wr1.LIZ(webResourceRequest));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("business ssp filter failed: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.W, "SspLifeCycle_");
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }
}

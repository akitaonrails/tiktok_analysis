package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.ttm.ttmparam.container.TTMContainer;

/* JADX INFO: renamed from: X.1DYX, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DYX {
    public static C1DYW LIZ(String str) {
        try {
            C1DUJ c1duj = TTMContainer.Companion;
            int value = C1DYV.TTM_LIST_TYPE.getValue();
            c1duj.getClass();
            long jTtmNativeCreateFromJSON = TTMContainer.ttmNativeCreateFromJSON(str, value);
            if (jTtmNativeCreateFromJSON != 0) {
                return new C1DYW(jTtmNativeCreateFromJSON);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

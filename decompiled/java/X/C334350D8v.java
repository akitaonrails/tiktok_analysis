package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpRequestParams;
import java.util.Map;

/* JADX INFO: renamed from: X.0D8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334350D8v {
    public static ShopifyEcpRequestParams LIZ(Map map) {
        try {
            C1227904rF.LIZ.getClass();
            return (ShopifyEcpRequestParams) C1227904rF.LIZ(C1227904rF.LIZLLL().LJIJJLI(map), ShopifyEcpRequestParams.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

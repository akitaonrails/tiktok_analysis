package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332720D2o {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Map map) {
        boolean z;
        if (map != null && !map.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String strLIZIZ = (String) map.get("domain_for_display");
        if (((strLIZIZ != null && strLIZIZ.length() > 0) || (strLIZIZ = (String) map.get("shop_domain")) != null) && !a0.LJJJIL(strLIZIZ)) {
            if (!a0.LJJIIZI(strLIZIZ, "://", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            String host = UriProtector.parse(strLIZIZ).getHost();
            if (host != null && (!a0.LJJJIL(host))) {
                return host;
            }
        }
        return null;
    }
}

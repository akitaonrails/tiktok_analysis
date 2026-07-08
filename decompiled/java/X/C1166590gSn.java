package X;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import java.util.Map;

/* JADX INFO: renamed from: X.0gSn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166590gSn {
    public static final String LIZ(C1166240gSE c1166240gSE, String str, boolean z) {
        Uri uri;
        Bundle bundle;
        long jCurrentTimeMillis;
        if (c1166240gSE != null) {
            RouteIntent routeIntent = c1166240gSE.LJI;
            Map<String, Object> map = c1166240gSE.LIZLLL;
            String str2 = c1166240gSE.LJII;
            if (str != null) {
                uri = UriProtector.parse(str);
            } else {
                uri = null;
            }
            String strLIZ = C2010707uD.LIZ(Integer.valueOf(C291230BbF.LIZ()), C2010707uD.LIZ(1, C2010707uD.LIZ(Integer.valueOf(C1165500gR2.LIZ.ravenEnable ? 1 : 0), C2010707uD.LIZ(c1166240gSE.LIZ, C1206000hUM.LIZ(routeIntent, map, str2, uri, EnumC1740810vOx.SHOP_PAGE_US), "page_id"), "use_raven_center"), "enable_storage_group"), "enable_half_live_preview");
            if (!z && (bundle = c1166240gSE.LJ) != null) {
                jCurrentTimeMillis = bundle.getLong("start_click_time");
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            String strLIZ2 = C2010707uD.LIZ(Long.valueOf(jCurrentTimeMillis), strLIZ, "_ec_schema_interception_start_time");
            if (C290570BaB.LIZ()) {
                strLIZ2 = C2010707uD.LIZ(c1166240gSE.LJIIJ, strLIZ2, "productListLayout");
            }
            if (Build.VERSION.SDK_INT >= 24) {
                return C2010707uD.LIZ(Long.valueOf(System.currentTimeMillis() - (SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime())), strLIZ2, "process_start_time");
            }
            return strLIZ2;
        }
        return str;
    }
}

package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.07rA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1991807rA {
    public static C1991807rA LIZ;

    public static C1991807rA LIZ() {
        if (LIZ == null) {
            synchronized (C1991807rA.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1991807rA();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static boolean LIZIZ(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || !PatternProtector.compile("\\d+\\.\\d+\\.\\d+").matcher(str).matches()) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        String[] strArrSplit = C844470XAv.LJFF().split("\\.");
        String[] strArrSplit2 = str.split("\\.");
        for (int i = 0; i < strArrSplit.length; i++) {
            int i2 = CastIntegerProtector.parseInt(strArrSplit[i]);
            int i3 = CastIntegerProtector.parseInt(strArrSplit2[i]);
            if (i2 < i3) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//main/update_tips");
                smartRouteBuildRoute.withParam("debug_url", str2);
                smartRouteBuildRoute.withParam("version_required", str);
                smartRouteBuildRoute.addFlags(603979776);
                smartRouteBuildRoute.open();
                HashMap map = new HashMap();
                map.put("schema_url", str2);
                C20684815ws.LJIILLIIL("schema_update_toast_show", map);
                return true;
            }
            if (i2 > i3) {
                break;
            }
        }
        return false;
    }
}

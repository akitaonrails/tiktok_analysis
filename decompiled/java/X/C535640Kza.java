package X;

import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Kza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535640Kza {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(RouteIntent routeIntent, String str) {
        Intent extra = routeIntent.getExtra();
        if (extra != null) {
            try {
                return extra.getStringExtra(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }
}

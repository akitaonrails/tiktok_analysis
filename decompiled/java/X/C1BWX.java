package X;

import android.app.Application;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BWX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BWX {
    public AppBuildConfig LIZ;
    public C1BWW LIZIZ;
    public Application LIZJ;

    public static boolean LIZ(int i) {
        String packageName;
        Map<String, Integer> map = C1699860uKu.LIZ;
        Application application = C1699860uKu.LIZIZ;
        String packageName2 = null;
        if (application != null) {
            packageName = application.getPackageName();
        } else {
            packageName = null;
        }
        int iIntValue = ((Integer) ((HashMap) map).get(packageName)).intValue();
        Application application2 = C1699860uKu.LIZIZ;
        if (application2 != null) {
            packageName2 = application2.getPackageName();
        }
        if (iIntValue == (i & ((Integer) ((HashMap) map).get(packageName2)).intValue())) {
            return true;
        }
        return false;
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;

/* JADX INFO: renamed from: X.08Dx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2082708Dx {
    public static final C2082708Dx LIZ = new C2082708Dx();

    public static int LIZJ() {
        IECommerceMallService iECommerceMallService = (IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class);
        if (iECommerceMallService.shouldShowMallTab()) {
            return 2;
        }
        return iECommerceMallService.shouldShowMallTopTab() ? 1 : 3;
    }

    public static Context LIZIZ(Activity activity) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        if (!activity.isFinishing()) {
            return activity;
        }
        Activity activityLIZ2 = C2421209eE.LIZ();
        if (activityLIZ2 != null && !activityLIZ2.isFinishing()) {
            return activityLIZ2;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && !activityLIZ.isFinishing()) {
            return activityLIZ;
        }
        return C1BWL.LIZ();
    }

    public static String LIZ(Uri uri, String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            Uri uri2 = UriProtector.parse(str);
            Uri.Builder builderClearQuery = uri2.buildUpon().clearQuery();
            for (String str2 : UriProtector.getQueryParameterNames(uri2)) {
                if (!UriProtector.getQueryParameterNames(uri).contains(str2)) {
                    Iterator<String> it2 = UriProtector.getQueryParameters(uri2, str2).iterator();
                    while (it2.hasNext()) {
                        builderClearQuery.appendQueryParameter(str2, it2.next());
                    }
                }
            }
            for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                Iterator<String> it3 = UriProtector.getQueryParameters(uri, str3).iterator();
                while (it3.hasNext()) {
                    builderClearQuery.appendQueryParameter(str3, it3.next());
                }
            }
            return builderClearQuery.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }
}

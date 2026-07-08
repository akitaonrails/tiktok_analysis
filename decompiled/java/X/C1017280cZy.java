package X;

import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterAdapterService;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017280cZy {
    public static final C1017280cZy LIZ = new C1017280cZy();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(548));

    public static String LJFF(int i) {
        String strTransferClickFromToRefer;
        IMainService iMainService = (IMainService) LIZIZ.getValue();
        if (iMainService == null || (strTransferClickFromToRefer = iMainService.transferClickFromToRefer(i)) == null) {
            return "";
        }
        return strTransferClickFromToRefer;
    }

    public static final boolean LIZ(int i, Context context, Aweme aweme) {
        ICRouterComponentClick iCRouterComponentClick = (ICRouterComponentClick) ServiceManager.get().getService(ICRouterComponentClick.class);
        LIZ.getClass();
        return iCRouterComponentClick.LJII(context, aweme, LJFF(i), i);
    }

    public static final boolean LIZJ(int i, Aweme aweme, String str) {
        return ((ICRouterAdapterService) ServiceManager.get().getService(ICRouterAdapterService.class)).LIZJ(i, aweme, str);
    }

    public static final boolean LIZIZ(Context context, Aweme aweme, String str, int i) {
        if (LIZJ(i, aweme, str)) {
            ICRouterComponentClick iCRouterComponentClick = (ICRouterComponentClick) ServiceManager.get().getService(ICRouterComponentClick.class);
            LIZ.getClass();
            return iCRouterComponentClick.LIZIZ(context, aweme, LJFF(i), i);
        }
        return C1017550caP.LIZ(context, aweme);
    }

    public static final boolean LJ(Context context, Aweme aweme, String str, int i) {
        if (LIZJ(i, aweme, str)) {
            ICRouterComponentClick iCRouterComponentClick = (ICRouterComponentClick) ServiceManager.get().getService(ICRouterComponentClick.class);
            LIZ.getClass();
            return iCRouterComponentClick.LJFF(context, aweme, LJFF(i), i);
        }
        LIZ.getClass();
        IMainService iMainService = (IMainService) LIZIZ.getValue();
        if (iMainService != null && iMainService.openFeedAdScheme(context, aweme, i)) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(Context context, Aweme aweme, String str, int i) {
        if (LIZJ(i, aweme, str)) {
            ICRouterComponentClick iCRouterComponentClick = (ICRouterComponentClick) ServiceManager.get().getService(ICRouterComponentClick.class);
            LIZ.getClass();
            return iCRouterComponentClick.LJ(context, aweme, LJFF(i), i);
        }
        LIZ.getClass();
        IMainService iMainService = (IMainService) LIZIZ.getValue();
        if (iMainService != null && iMainService.useSystemBrowserOpenWebPage(context, aweme, i)) {
            return true;
        }
        return false;
    }

    public static final void LIZLLL(Context context, Uri uri, int i, String str, Aweme aweme) {
        if (LIZJ(i, aweme, str)) {
            ICRouterComponentClick iCRouterComponentClick = (ICRouterComponentClick) ServiceManager.get().getService(ICRouterComponentClick.class);
            LIZ.getClass();
            iCRouterComponentClick.LIZ(context, aweme, LJFF(i), i);
        } else {
            LIZ.getClass();
            IMainService iMainService = (IMainService) LIZIZ.getValue();
            if (iMainService != null) {
                iMainService.openAppByHttpUri(context, uri);
            }
        }
    }
}

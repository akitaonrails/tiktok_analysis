package X;

import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07HJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07HJ {
    public static final C07HJ LIZ = new C07HJ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(439));

    public static boolean LIZ() {
        IDeepLinkService iDeepLinkService;
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            return C07HK.LIZ() || ((iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null)) != null && iDeepLinkService.LJJJJLL());
        }
        return false;
    }
}

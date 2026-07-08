package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;

/* JADX INFO: renamed from: X.0ucp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710970ucp {
    public static final C1710970ucp LIZ = new C1710970ucp();
    public static EnumC1712090ued LIZIZ = EnumC1712090ued.NOT_SUPPORT;

    public static boolean LIZ(Context context) {
        IPipoCcdcService iPipoCcdcService;
        if (context == null || (iPipoCcdcService = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null)) == null || !iPipoCcdcService.LJIIIIZZ(context, "ttls")) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(String str) {
        IPipoCcdcService iPipoCcdcService = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null);
        if (iPipoCcdcService == null) {
            return false;
        }
        if (str.length() == 0) {
            str = "ttls";
        }
        if (!iPipoCcdcService.LJIIIZ(str)) {
            return false;
        }
        return true;
    }
}

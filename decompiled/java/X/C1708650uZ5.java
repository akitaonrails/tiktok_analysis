package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0uZ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708650uZ5 {
    public static final C1708650uZ5 LIZ = new C1708650uZ5();

    public static String LIZJ(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            return UriProtector.parse(str).buildUpon().appendQueryParameter("source_btm_token", str2).build().toString();
        }
        return str;
    }

    public static void LIZ(C1708650uZ5 c1708650uZ5, Context context, String str) {
        c1708650uZ5.getClass();
        LIZIZ(context, str, null, null);
    }

    public static void LIZIZ(Context context, String str, String str2, String str3) {
        String str4 = str2;
        if (str.length() == 0) {
            return;
        }
        if (u.LJJIIJZLJL(str, "http", true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://webview?url=");
            sbLIZ.append(str);
            String strLIZJ = LIZJ(C2188811AlT.LIZIZ(sbLIZ), str3);
            IPipoContainerService iPipoContainerService = (IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class);
            if (str4 == null) {
                str4 = "pa_register";
            }
            iPipoContainerService.LIZIZ(context, strLIZJ, str4, false, -1, null, null, null);
            return;
        }
        SmartRouter.buildRoute(context, LIZJ(str, str3)).open();
    }
}

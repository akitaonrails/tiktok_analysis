package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0WIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820970WIl {
    public static final C820970WIl LIZ = new C820970WIl();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(218));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public static boolean LIZ(Context context, String str) {
        String strLIZ = C0WI6.LIZ(context.getPackageManager(), str);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("package_name", str);
        ?? r2 = 0;
        String[] stringArray = ((Keva) LIZIZ.getValue()).getStringArray("oidc_android_client_package_sigs", new String[0]);
        if (C13LQ.LJJIJIIJI(strLIZ, stringArray) >= 0) {
            r2 = 1;
        }
        c2344009Gk.LIZJ(r2, "is_success");
        c2344009Gk.LIZJ(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() ? 1 : 0, "is_login");
        c2344009Gk.LJFF("oidc_client_list", C13LQ.LJJJ(stringArray, ",", null, null, null, 62));
        Map<String, String> map = c2344009Gk.LIZ;
        if (C2104108Md.LIZLLL(context)) {
            C20684815ws.LJIILLIIL("oidc_certificate_validate_result", map);
        }
        return r2;
    }
}

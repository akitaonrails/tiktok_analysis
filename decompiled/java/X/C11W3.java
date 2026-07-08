package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.11W3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11W3 {
    public static final C11W3 LIZ = new C11W3();

    public static final void LIZ(Context context, String str, Map<String, String> map) {
        String host;
        boolean z;
        boolean z2;
        boolean z3;
        String strLIZIZ;
        HashMap map2 = (HashMap) map;
        String str2 = (String) map2.get("anchor_type");
        String str3 = (String) map2.get("shoot_way");
        String str4 = (String) map2.get("creation_id");
        StringBuilder sb = new StringBuilder(str);
        if (str2 == null) {
            String str5 = (String) map2.get("title");
            String str6 = (String) map2.get("close");
            if (str6 != null && str6.length() != 0 && !u.LJIJI(str6, "true", true)) {
                z2 = false;
            } else {
                z2 = true;
            }
            String str7 = (String) map2.get("hide_nav_bar");
            if (str7 != null && str7.length() != 0 && !u.LJIJI(str7, "true", true)) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean zLJIJI = u.LJIJI((String) map2.get("back"), "true", true);
            boolean zLJIJI2 = u.LJIJI((String) map2.get("addButton"), "true", true);
            if (UriProtector.parse(str).getQuery() != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('&');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append('?');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            sb = new StringBuilder(strLIZIZ);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("addButton=");
            sbLIZ3.append(zLJIJI2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("&back=");
            sbLIZ4.append(zLJIJI);
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("&close=");
            sbLIZ5.append(z2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ5));
            if (str5 != null && str5.length() != 0) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("&title=");
                sbLIZ6.append(str5);
                sb.append(C2188811AlT.LIZIZ(sbLIZ6));
            }
            if (str3 != null && str3.length() != 0) {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("&shoot_way=");
                sbLIZ7.append(str3);
                sb.append(C2188811AlT.LIZIZ(sbLIZ7));
            }
            if (str4 != null && str4.length() != 0) {
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("&creation_id=");
                sbLIZ8.append(str4);
                sb.append(C2188811AlT.LIZIZ(sbLIZ8));
            }
            if (z3) {
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("&hide_nav_bar=1&status_bar_height=");
                sbLIZ9.append(C12ES.LJIILJJIL(C497820Jfg.LIZJ(context), context));
                sb.append(C2188811AlT.LIZIZ(sbLIZ9));
            } else {
                sb.append("&hide_nav_bar=0&status_bar_height=0");
            }
            str2 = "Wiki";
        }
        boolean zLJIJI3 = u.LJIJI((String) map2.get("show_keyboard"), "true", true);
        String str8 = (String) map2.get("host_filter");
        if (str8 == null || !u.LJIJI(str8, "true", true) || (host = UriProtector.parse(str).getHost()) == null) {
            host = "";
        }
        CharSequence charSequence = (CharSequence) map2.get("disable_app_link");
        if (charSequence != null && charSequence.length() != 0) {
            z = true;
            if (!u.LJIJI((String) map2.get("disable_app_link"), "true", true)) {
                z = false;
            }
        } else {
            z = true;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//wiki");
        smartRouteBuildRoute.withParam("url", sb.toString());
        smartRouteBuildRoute.withParam("shoot_way", str3);
        smartRouteBuildRoute.withParam("creation_id", str4);
        smartRouteBuildRoute.withParam("show_keyboard", zLJIJI3);
        smartRouteBuildRoute.withParam("anchor_type", str2);
        smartRouteBuildRoute.withParam("author_id", (String) map2.get("author_id"));
        smartRouteBuildRoute.withParam("group_id", (String) map2.get("group_id"));
        smartRouteBuildRoute.withParam("enter_from", (String) map2.get("enter_from"));
        smartRouteBuildRoute.withParam("language", (String) map2.get("language"));
        smartRouteBuildRoute.withParam("wiki_entry", (String) map2.get("wiki_entry"));
        smartRouteBuildRoute.withParam("anchor_entry", (String) map2.get("anchor_entry"));
        smartRouteBuildRoute.withParam("host_filter", host);
        smartRouteBuildRoute.withParam("disable_app_link", z);
        smartRouteBuildRoute.open();
    }
}

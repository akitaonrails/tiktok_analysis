package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.11W4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11W4 {
    public static void LIZ(Context context, String str, Map map, Map map2) {
        String host;
        boolean z;
        boolean z2;
        boolean z3;
        String strLIZIZ;
        String strLIZIZ2;
        String str2 = (String) map.get("anchor_type");
        String str3 = (String) map.get("anchor_subtype");
        String str4 = (String) map.get("shoot_way");
        String str5 = (String) map.get("creation_id");
        String str6 = (String) map.get("title");
        StringBuilder sb = new StringBuilder(str);
        if (Intrinsics.LJFF(str2, "News")) {
            if (UriProtector.parse(str).getQuery() != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('&');
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append('?');
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
            sb = new StringBuilder(strLIZIZ2);
            if (Intrinsics.LJFF(map.get("noRedirect"), "true")) {
                sb.append("&noRedirect=true");
            }
            sb.append("&close=false");
        }
        if (str2 == null) {
            String str7 = (String) map.get("close");
            if (str7 != null && str7.length() != 0 && !u.LJIJI(str7, "true", true)) {
                z2 = false;
            } else {
                z2 = true;
            }
            String str8 = (String) map.get("hide_nav_bar");
            if (str8 != null && str8.length() != 0 && !u.LJIJI(str8, "true", true)) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean zLJIJI = u.LJIJI((String) map.get("back"), "true", true);
            boolean zLJIJI2 = u.LJIJI((String) map.get("addButton"), "true", true);
            if (UriProtector.parse(str).getQuery() != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append('&');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append('?');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            }
            sb = new StringBuilder(strLIZIZ);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("addButton=");
            sbLIZ5.append(zLJIJI2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ5));
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("&back=");
            sbLIZ6.append(zLJIJI);
            sb.append(C2188811AlT.LIZIZ(sbLIZ6));
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("&close=");
            sbLIZ7.append(z2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ7));
            if (str6 != null && str6.length() != 0) {
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("&title=");
                sbLIZ8.append(str6);
                sb.append(C2188811AlT.LIZIZ(sbLIZ8));
            }
            if (str4 != null && str4.length() != 0) {
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("&shoot_way=");
                sbLIZ9.append(str4);
                sb.append(C2188811AlT.LIZIZ(sbLIZ9));
            }
            if (str5 != null && str5.length() != 0) {
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("&creation_id=");
                sbLIZ10.append(str5);
                sb.append(C2188811AlT.LIZIZ(sbLIZ10));
            }
            if (z3) {
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("&hide_nav_bar=1&status_bar_height=");
                sbLIZ11.append(C12ES.LJIILJJIL(C497820Jfg.LIZJ(context), context));
                sb.append(C2188811AlT.LIZIZ(sbLIZ11));
            } else {
                sb.append("&hide_nav_bar=0&status_bar_height=0");
            }
            str2 = "Wiki";
        }
        boolean zLJIJI3 = u.LJIJI((String) map.get("show_keyboard"), "true", true);
        String str9 = (String) map.get("host_filter");
        if (str9 == null || !u.LJIJI(str9, "true", true) || (host = UriProtector.parse(str).getHost()) == null) {
            host = "";
        }
        CharSequence charSequence = (CharSequence) map.get("disable_app_link");
        if (charSequence != null && charSequence.length() != 0) {
            z = true;
            if (!u.LJIJI((String) map.get("disable_app_link"), "true", true)) {
                z = false;
            }
        } else {
            z = true;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//wiki");
        smartRouteBuildRoute.withParam("url", sb.toString());
        smartRouteBuildRoute.withParam("shoot_way", str4);
        smartRouteBuildRoute.withParam("creation_id", str5);
        smartRouteBuildRoute.withParam("show_keyboard", zLJIJI3);
        smartRouteBuildRoute.withParam("anchor_type", str2);
        smartRouteBuildRoute.withParam("anchor_subtype", str3);
        smartRouteBuildRoute.withParam("title", str6);
        smartRouteBuildRoute.withParam("author_id", (String) map.get("author_id"));
        smartRouteBuildRoute.withParam("group_id", (String) map.get("group_id"));
        smartRouteBuildRoute.withParam("enter_from", (String) map.get("enter_from"));
        smartRouteBuildRoute.withParam("language", (String) map.get("language"));
        smartRouteBuildRoute.withParam("wiki_entry", (String) map.get("wiki_entry"));
        smartRouteBuildRoute.withParam("anchor_entry", (String) map.get("anchor_entry"));
        smartRouteBuildRoute.withParam("host_filter", host);
        smartRouteBuildRoute.withParam("disable_app_link", z);
        smartRouteBuildRoute.withParam("content_source", (String) map.get("content_source"));
        smartRouteBuildRoute.withParam("content_type", (String) map.get("content_type"));
        smartRouteBuildRoute.withParam("placeholder_enter_from", (String) map.get("placeholder_enter_from"));
        smartRouteBuildRoute.withParam("mob_extra", C1741890vQh.LJIIIIZZ(map2));
        smartRouteBuildRoute.withParam("anchor_id", (String) map.get("anchor_id"));
        smartRouteBuildRoute.open();
    }
}

package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import java.io.File;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.06le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1702806le {
    public static final C1702806le LIZ = new C1702806le();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1090));
    public static boolean LIZJ;

    public static void LIZ(String str, String str2) {
        String strLIZIZ;
        int i = C1702106lX.LIZ;
        if (i == 2 || (i == 1 && C2367709Pn.LIZJ() < C1702906lf.LIZ)) {
            if (str == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("html");
                sbLIZ.append(File.separator);
                sbLIZ.append(str2);
                sbLIZ.append(".html");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                str = "tiktok_game_projects";
            } else {
                strLIZIZ = "html/index.html";
            }
            if (!LIZJ) {
                Forest forest = (Forest) LIZIZ.getValue();
                RequestParams requestParams = new RequestParams(null, 1, null);
                requestParams.channel = str;
                requestParams.bundle = strLIZIZ;
                requestParams.waitGeckoUpdate = true;
                requestParams.enableRequestReuse = true;
                Boolean bool = Boolean.TRUE;
                requestParams.enableMemoryCache = bool;
                requestParams.enableCDNCache = bool;
                requestParams.disableBuiltin = true;
                requestParams.resourceScene = EnumC1533980q1M.WEB_MAIN_DOCUMENT;
                forest.fetchResourceAsync("", requestParams, AFwS229S0000000_2.get$arr$(761));
            }
        }
    }
}

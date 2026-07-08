package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.RouteIntent;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShowcaseProductListRequest;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vM0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738980vM0 {
    public static final C1738980vM0 LIZ = new C1738980vM0();
    public static final Map<String, C597870Ncf> LIZIZ = new LinkedHashMap();

    public static void LIZ(RouteIntent routeIntent, String str) {
        String str2;
        int i;
        String string;
        String strLJIIIIZZ;
        String str3;
        String str4;
        C597870Ncf c597870Ncf = new C597870Ncf(routeIntent, str);
        String strLIZLLL = C0WWO.LIZLLL(routeIntent, "author_id");
        Map mapLIZIZ = C1741890vQh.LIZIZ(routeIntent.getExtra(), "trackParams");
        if (mapLIZIZ == null) {
            mapLIZIZ = C2097608Jq.LJ();
        }
        Object obj = mapLIZIZ.get("enter_from");
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        String strLIZLLL2 = C0WWO.LIZLLL(routeIntent, "filter_tab");
        if (strLIZLLL2 != null) {
            i = CastIntegerProtector.parseInt(strLIZLLL2);
        } else {
            i = 1;
        }
        C1202220hOG c1202220hOG = C1202220hOG.LIZ;
        Object obj2 = mapLIZIZ.get("list_source_content_id");
        Object obj3 = mapLIZIZ.get("author_id");
        c1202220hOG.getClass();
        n nVarLIZIZ = C1202220hOG.LIZIZ(obj2, obj3);
        if (nVarLIZIZ != null) {
            string = nVarLIZIZ.toString();
        } else {
            string = null;
        }
        PageSourceInfo pageSourceInfoLJFF = C1766860w4y.LJFF(C1766860w4y.LIZ, new PageSource(EnumC1740810vOx.SHOWCASE_PAGE.getPageCode(), null), null, null, 6);
        if (pageSourceInfoLJFF != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJFF);
        } else {
            strLJIIIIZZ = null;
        }
        String str5 = "";
        if (strLIZLLL == null) {
            str3 = "";
        } else {
            str3 = strLIZLLL;
        }
        int value = EnumC797670VQv.ASC.getValue();
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if (string == null) {
            string = "";
        }
        if (strLJIIIIZZ != null) {
            str5 = strLJIIIIZZ;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C597800NcY(c597870Ncf, strLIZLLL, str2, new ShowcaseProductListRequest(str3, i, value, 10, null, null, str, str4, string, str5, null, 1072, null), null), 2);
        LIZIZ.put(str, c597870Ncf);
    }
}

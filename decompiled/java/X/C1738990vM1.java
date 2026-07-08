package X;

import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vM1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738990vM1 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public String LJ;
    public final String LJFF;
    public final List<String> LJI;
    public final List<String> LJII;
    public final List<String> LJIIIIZZ;
    public final List<String> LJIIIZ;
    public final List<String> LJIIJ;
    public final List<String> LJIIJJI;
    public final String LJIIL;
    public long LJIILIIL;

    public C1738990vM1(Bundle bundle) {
        String strLJI;
        String strLJI2;
        String strLJI3;
        String strLJI4;
        this.LIZ = "";
        this.LIZIZ = EnumC1739000vM2.PRODUCT.getValue();
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJ = "";
        this.LJFF = "";
        C13BV c13bv = C13BV.INSTANCE;
        this.LJI = c13bv;
        this.LJII = c13bv;
        this.LJIIIIZZ = c13bv;
        this.LJIIIZ = c13bv;
        this.LJIIJ = c13bv;
        this.LJIIJJI = c13bv;
        this.LJIIL = "";
        this.LJIILIIL = -1L;
        String string = bundle.getString("shop_active_tab_type");
        this.LIZIZ = string == null ? EnumC1739000vM2.UNDEFINED.getValue() : string;
        String string2 = bundle.getString("ka_top_product_id");
        this.LJIIL = string2 == null ? "" : string2;
        String string3 = bundle.getString("ka_identifier");
        string3 = string3 == null ? "unknown" : string3;
        String string4 = bundle.getString("ka_scene");
        String str = string4 != null ? string4 : "unknown";
        HashMap<String, Object> mapLIZLLL = C1741890vQh.LIZLLL(bundle, "trackParams");
        if (mapLIZLLL != null) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("store page, trackParams: ");
            sbLIZ.append(mapLIZLLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            Object obj = mapLIZLLL.get("product_id");
            if (obj == null) {
                strLJI = "";
            } else {
                strLJI = C2010707uD.LJI(obj);
            }
            this.LIZJ = strLJI;
            Object obj2 = mapLIZLLL.get("source_previous_page");
            if (obj2 == null) {
                strLJI2 = "";
            } else {
                strLJI2 = C2010707uD.LJI(obj2);
            }
            this.LIZLLL = strLJI2;
            this.LJI = C007J.LIZ("expo_product_id_list", mapLIZLLL);
            this.LJII = C007J.LIZ("click_product_id_list", mapLIZLLL);
            this.LJIIIIZZ = C007J.LIZ("related_product_id_list", mapLIZLLL);
            this.LJIIJ = C007J.LIZ("search_card_live_product_id_list", mapLIZLLL);
            this.LJIIJJI = C007J.LIZ("search_card_no_live_product_id_list", mapLIZLLL);
            this.LJIIIZ = C007J.LIZ("search_query", mapLIZLLL);
            Object obj3 = mapLIZLLL.get("enter_from");
            if (obj3 == null) {
                strLJI3 = "";
            } else {
                strLJI3 = C2010707uD.LJI(obj3);
            }
            this.LIZ = strLJI3;
            Object obj4 = mapLIZLLL.get("author_id");
            if (obj4 != null) {
                C2010707uD.LJI(obj4);
            }
            Object obj5 = mapLIZLLL.get("first_source_page");
            if (obj5 != null) {
                C2010707uD.LJI(obj5);
            } else {
                Object obj6 = mapLIZLLL.get("source_page_type");
                if (obj6 != null) {
                    C2010707uD.LJI(obj6);
                }
            }
            Object obj7 = mapLIZLLL.get("coupon_type_id");
            if (obj7 == null) {
                strLJI4 = "";
            } else {
                strLJI4 = C2010707uD.LJI(obj7);
            }
            this.LJFF = strLJI4;
            Object obj8 = mapLIZLLL.get("enter_method");
            String strLJI5 = obj8 != null ? C2010707uD.LJI(obj8) : "";
            if (Intrinsics.LJFF(strLJI5, "ka")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLJI5);
                sbLIZ2.append('_');
                sbLIZ2.append(string3);
                sbLIZ2.append('_');
                sbLIZ2.append(str);
                strLJI5 = C2188811AlT.LIZIZ(sbLIZ2);
                mapLIZLLL.put("enter_method", strLJI5);
            }
            this.LJ = strLJI5;
        }
    }
}

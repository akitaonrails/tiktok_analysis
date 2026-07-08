package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.model.MallV3Cache;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0w6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767910w6f {
    public static final C1767910w6f LIZ = new C1767910w6f();
    public static long LIZIZ;
    public static volatile TemplateData LIZJ;

    public static TemplateData LIZIZ() {
        C1570730qyd c1570730qyd = C1570730qyd.LIZ;
        String string = ((Keva) C1570730qyd.LIZIZ.getValue()).getString("ec_shop_main_cache_data_v3", null);
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<MallV3Cache>() { // from class: X.0w6g
            }.getType() : C2371409Qy.LIZJ(C13LE.LJ(MallV3Cache.class)));
            if (!(objFromJson instanceof MallV3Cache)) {
                objFromJson = null;
            }
            MallV3Cache mallV3Cache = (MallV3Cache) objFromJson;
            if (mallV3Cache != null) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShopTabV3 getCache success log_id: ");
                sbLIZ.append(mallV3Cache.logId);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Object> map = mallV3Cache.data;
                if (map != null) {
                    linkedHashMap.put("data", map);
                }
                String str = mallV3Cache.logId;
                if (str != null) {
                    linkedHashMap.put("log_id", str);
                }
                EnumC1770920wBW enumC1770920wBW = EnumC1770920wBW.PREFETCH_CACHE;
                linkedHashMap.put("type", enumC1770920wBW.getValue());
                TemplateData templateData = new TemplateData();
                templateData.LJIILIIL("data", mallV3Cache.data);
                templateData.LJIILIIL("log_id", mallV3Cache.logId);
                templateData.LJIILIIL("type", enumC1770920wBW.getValue());
                LIZ.getClass();
                LIZ("getTemplateData cache disk");
                return templateData;
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static void LIZ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - LIZIZ;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("native_appear_directly ");
        sbLIZ.append(str);
        sbLIZ.append(" curr=");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(" ,clickToNow= ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
    }
}

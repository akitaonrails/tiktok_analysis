package X;

import com.ss.android.ugc.aweme.ml.infra.PitayaMLConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511870pRh {
    public static final Map<Long, C1511870pRh> LIZJ = new LinkedHashMap();
    public final long LIZ;
    public C1512110pS5 LIZIZ;

    public C1511870pRh(long j) {
        this.LIZ = j;
    }

    public final void LIZ(final Function1<? super C1512110pS5, Unit> function1) {
        C1512110pS5 c1512110pS5 = this.LIZIZ;
        if (c1512110pS5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("already predicted: ");
            sbLIZ.append(c1512110pS5);
            C2188811AlT.LIZIZ(sbLIZ);
            function1.invoke(c1512110pS5);
            return;
        }
        C1510230pP3 c1510230pP3 = new C1510230pP3("gecc_live_shop_bag_prerender");
        SmartSceneConfig smartSceneConfig = new SmartSceneConfig();
        smartSceneConfig.setScene("gecc_live_shop_bag_prerender");
        SmartSdkConfig smartSdkConfig = new SmartSdkConfig();
        smartSdkConfig.setEngineType("pitaya_ml");
        PitayaMLConfig pitayaMLConfig = new PitayaMLConfig();
        pitayaMLConfig.setBusinessName("gecc_live_shop_bag_prerender");
        smartSdkConfig.setPitayaMLConfig(pitayaMLConfig);
        smartSceneConfig.setSdkConfig(smartSdkConfig);
        c1510230pP3.LIZIZ = smartSceneConfig;
        AbstractC1511510pR7 abstractC1511510pR7LIZ = C1511420pQy.LIZ().LIZ("gecc_live_shop_bag_prerender", c1510230pP3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("room_id", Long.valueOf(this.LIZ));
        C1509310pNZ c1509310pNZ = new C1509310pNZ(0);
        c1509310pNZ.LIZIZ().putAll(linkedHashMap);
        if (abstractC1511510pR7LIZ != null) {
            abstractC1511510pR7LIZ.runAsyncDelay(0L, c1509310pNZ, new InterfaceC1511740pRU() { // from class: X.0pRi
                @Override // X.InterfaceC1511740pRU
                public final void LIZ(C1512100pS4 c1512100pS4) throws JSONException {
                    Integer numValueOf;
                    Object obj;
                    long jLongValue;
                    Object obj2;
                    Object obj3;
                    boolean zBooleanValue;
                    Object obj4;
                    Boolean bool;
                    Boolean bool2;
                    Long l;
                    Map<String, Object> map;
                    C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                    JSONObject jSONObject = new JSONObject();
                    String str = null;
                    if (c1512100pS4 != null) {
                        numValueOf = Integer.valueOf(c1512100pS4.LIZ);
                    } else {
                        numValueOf = null;
                    }
                    jSONObject.put("code", numValueOf);
                    if (c1512100pS4 != null && (map = c1512100pS4.LJFF) != null) {
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                    }
                    c1507790pL7.getClass();
                    C1507790pL7.LIZLLL("rd_tiktokec_shopping_bag_prerender_client_ai", jSONObject);
                    boolean zBooleanValue2 = false;
                    if (c1512100pS4 != null) {
                        C1511870pRh c1511870pRh = this.LIZ;
                        Function1<C1512110pS5, Unit> function12 = function1;
                        Map<String, Object> map2 = c1512100pS4.LJFF;
                        if (map2 != null) {
                            obj = map2.get("delay");
                        } else {
                            obj = null;
                        }
                        if ((obj instanceof Long) && (l = (Long) obj) != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        Map<String, Object> map3 = c1512100pS4.LJFF;
                        if (map3 != null) {
                            obj2 = map3.get("pre_render");
                        } else {
                            obj2 = null;
                        }
                        if ((obj2 instanceof Boolean) && (bool2 = (Boolean) obj2) != null) {
                            zBooleanValue2 = bool2.booleanValue();
                        }
                        Map<String, Object> map4 = c1512100pS4.LJFF;
                        if (map4 != null) {
                            obj3 = map4.get("preview_preload");
                        } else {
                            obj3 = null;
                        }
                        if ((obj3 instanceof Boolean) && (bool = (Boolean) obj3) != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = true;
                        }
                        Map<String, Object> map5 = c1512100pS4.LJFF;
                        if (map5 != null) {
                            obj4 = map5.get("package_name");
                        } else {
                            obj4 = null;
                        }
                        if (obj4 instanceof String) {
                            str = (String) obj4;
                        }
                        if (c1512100pS4.LIZIZ()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Shop bag predict success: packageName=");
                            sbLIZ2.append(str);
                            sbLIZ2.append(",delay=");
                            sbLIZ2.append(jLongValue);
                            sbLIZ2.append(",pre_render=");
                            sbLIZ2.append(zBooleanValue2);
                            sbLIZ2.append(",preview_preload=");
                            sbLIZ2.append(zBooleanValue);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Shop bag predict failed: packageName=");
                            sbLIZ3.append(str);
                            sbLIZ3.append(",errorCode=");
                            sbLIZ3.append(c1512100pS4.LIZ);
                            C2188811AlT.LIZIZ(sbLIZ3);
                        }
                        C1512110pS5 c1512110pS52 = new C1512110pS5(c1512100pS4.LIZIZ(), c1512100pS4.LJFF, jLongValue, zBooleanValue2, zBooleanValue);
                        function12.invoke(c1512110pS52);
                        c1511870pRh.LIZIZ = c1512110pS52;
                        return;
                    }
                    function1.invoke(new C1512110pS5(0));
                }
            });
        }
    }
}

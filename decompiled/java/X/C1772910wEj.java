package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772910wEj extends AbstractC1771860wD2 implements InterfaceC1164530gPT {
    public InterfaceC599750Nfh LLILLL;

    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        this.LLILLL = LIZIZ().LIZLLL().LJIIJJI;
        LIZIZ().getEventCenter().LJIIIIZZ("ec_mix_mall_feed_click_item", new InterfaceC606370NqN() { // from class: X.0wEi
            @Override // X.InterfaceC606370NqN
            public final void LIZ(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
                EnumC1772700wEO enumC1772700wEO;
                Map map3;
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShopMallLogicComponent data=");
                sbLIZ.append(map);
                sbLIZ.append(",extra=");
                sbLIZ.append(map2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    if (Intrinsics.LJFF(linkedHashMap.get("version"), 2)) {
                        enumC1772700wEO = EnumC1772700wEO.V2;
                    } else {
                        enumC1772700wEO = EnumC1772700wEO.V1;
                    }
                    if (!linkedHashMap.isEmpty()) {
                        Object obj = linkedHashMap.get("click_item");
                        if (C19719512Dh.LJII(obj) && (map3 = (Map) obj) != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                            linkedHashMap2.put("clicked_timestamp", Long.valueOf(System.currentTimeMillis()));
                            Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(linkedHashMap2);
                            if (mapLJIIZILJ != null) {
                                int i = C1772870wEf.LIZ[enumC1772700wEO.ordinal()];
                                if (i != 1) {
                                    if (i == 2) {
                                        ((C1772890wEh) C1772880wEg.LJI.getValue()).LIZ(mapLJIIZILJ, EnumC1772920wEk.REMOVE_AND_ADD_LAST);
                                    } else {
                                        throw new C1954807lC();
                                    }
                                } else {
                                    ((C1772890wEh) C1772880wEg.LJFF.getValue()).LIZ(mapLJIIZILJ, EnumC1772920wEk.REMOVE_AND_ADD_LAST);
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("MMKDynamicParams updateClickItemExposure version=");
                                sbLIZ2.append(enumC1772700wEO);
                                C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        }
                    }
                }
            }
        });
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_page_quit", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_page_show", this);
        LIZIZ().getEventCenter().LJFF("ecMixMallGetDataForDeduplication", new InterfaceC1775150wIL() { // from class: X.0wEv
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                List list;
                Object obj = map.get("key_list");
                String str = null;
                if (obj instanceof List) {
                    list = (List) obj;
                } else {
                    list = null;
                }
                Object obj2 = map.get("tab_id");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                }
                c21175917tt.LIZ(1, "success", C1772880wEg.LIZJ(str, list));
            }
        });
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        this.LLILLL = LIZIZ().LIZLLL().LJIIJJI;
        if (Intrinsics.LJFF(str, "ec_page_show")) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MMKDynamicParams EC_PAGE_SHOW params=");
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            try {
                JSONObject jSONObject = new JSONObject(str2);
                C1772880wEg.LIZ(null, jSONObject.optString("product_id"), jSONObject.optString("enter_from_merge"));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (Intrinsics.LJFF(str, "ec_page_quit")) {
            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MMKDynamicParams EC_PAGE_QUIT params=");
            sbLIZ2.append(str2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c2341109Fh2.getClass();
            C2341109Fh.LIZ(strLIZIZ2);
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                C1772880wEg.LIZLLL(Long.valueOf(jSONObject2.optLong("duration")), jSONObject2.optString("product_id"));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}

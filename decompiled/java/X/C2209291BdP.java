package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.traffic.model.MallExtraInfo;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209291BdP {
    public static final List<InterfaceC2209391BdZ> LIZ = C1697810uHb.LJIIJJI(new InterfaceC2209391BdZ() { // from class: X.1BdO
        public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("normal_red_dot", "special_red_dot", "bubble");

        @Override // X.InterfaceC2209391BdZ
        public final boolean LIZIZ(MallExtraInfo mallExtraInfo, String str) {
            String str2 = mallExtraInfo.mallOutSource;
            if (str2 == null || str2.length() == 0 || !Intrinsics.LJFF(mallExtraInfo.LIZ(), "1")) {
                return false;
            }
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(mallExtraInfo.mallOutSource, new String[]{e3.d}, 0, 6);
            return C13LP.LJJJJ(C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL), LIZIZ);
        }

        @Override // X.InterfaceC2209391BdZ
        public final Map LIZ(MallExtraInfo mallExtraInfo, String str, String str2) {
            String str3 = mallExtraInfo.mallOutSource;
            String str4 = mallExtraInfo.campaignId;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            String str6 = mallExtraInfo.materialId;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = mallExtraInfo.vtScores;
            if (str7 != null) {
                str5 = str7;
            }
            Map<String, String> map = C2209351BdV.LIZ;
            return C2209351BdV.LIZIZ(str3, str6, str4, C2209351BdV.LIZLLL(mallExtraInfo, null), str5);
        }
    }, new InterfaceC2209391BdZ() { // from class: X.1BdW
        @Override // X.InterfaceC2209391BdZ
        public final boolean LIZIZ(MallExtraInfo mallExtraInfo, String str) {
            if (Intrinsics.LJFF(mallExtraInfo.mallOutSource, "homepage_hot_video") && Intrinsics.LJFF(mallExtraInfo.LIZ(), "2")) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC2209391BdZ
        public final Map LIZ(MallExtraInfo mallExtraInfo, String str, String str2) {
            Map<String, String> map = C2209351BdV.LIZ;
            String strLJ = C2209351BdV.LJ(mallExtraInfo.mallOutSource, str2);
            String str3 = mallExtraInfo.groupId;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            String str5 = mallExtraInfo.vtScores;
            if (str5 != null) {
                str4 = str5;
            }
            return C2209351BdV.LIZIZ(strLJ, str3, null, C2209351BdV.LIZLLL(mallExtraInfo, null), str4);
        }
    }, new InterfaceC2209391BdZ() { // from class: X.1BdQ
        @Override // X.InterfaceC2209391BdZ
        public final boolean LIZIZ(MallExtraInfo mallExtraInfo, String str) {
            if (Intrinsics.LJFF(mallExtraInfo.mallOutSource, "homepage_hot_no_anchor_video") && Intrinsics.LJFF(mallExtraInfo.LIZ(), "2")) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC2209391BdZ
        public final Map LIZ(MallExtraInfo mallExtraInfo, String str, String str2) {
            String str3 = mallExtraInfo.groupId;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            String str5 = mallExtraInfo.mallDirectType;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = mallExtraInfo.mallDirectTrigger;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = mallExtraInfo.vtScores;
            if (str7 != null) {
                str4 = str7;
            }
            Map<String, String> map = C2209351BdV.LIZ;
            String strLJ = C2209351BdV.LJ(mallExtraInfo.mallOutSource, str2);
            List listLJIJI = C13LQ.LJIJI(new String[]{str5, str6, C2209351BdV.LIZLLL(mallExtraInfo, null)});
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLJIJI) {
                if (C123100dR.LIZ((String) obj)) {
                    arrayList.add(obj);
                }
            }
            return C2209351BdV.LIZIZ(strLJ, str3, null, C13LP.LJJLIIIJ(arrayList, e3.d, null, null, 0, null, null, 62), str4);
        }
    }, new InterfaceC2209391BdZ() { // from class: X.1BdR
        @Override // X.InterfaceC2209391BdZ
        public final boolean LIZIZ(MallExtraInfo mallExtraInfo, String str) {
            if (mallExtraInfo.mallOutSource != null && C1697810uHb.LJIIJJI("fyp_ecom_card_page_claim", "fyp_ecom_card_page_see_more").contains(mallExtraInfo.mallOutSource) && Intrinsics.LJFF(mallExtraInfo.LIZ(), "2")) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC2209391BdZ
        public final Map LIZ(MallExtraInfo mallExtraInfo, String str, String str2) {
            Map<String, String> map = C2209351BdV.LIZ;
            String strLJ = C2209351BdV.LJ(mallExtraInfo.mallOutSource, str2);
            String str3 = mallExtraInfo.awemeId;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            String str5 = mallExtraInfo.vtScores;
            if (str5 != null) {
                str4 = str5;
            }
            return C2209351BdV.LIZIZ(strLJ, str3, null, C2209351BdV.LIZLLL(mallExtraInfo, Collections.singletonList(mallExtraInfo.mallDirectTrigger)), str4);
        }
    }, new InterfaceC2209391BdZ() { // from class: X.1BdN
        public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("out_app_push", "inbox", "whatsapp", "email");

        @Override // X.InterfaceC2209391BdZ
        public final boolean LIZIZ(MallExtraInfo mallExtraInfo, String str) {
            if (C13LP.LJJJJ(mallExtraInfo.mallOutSource, LIZIZ) && Intrinsics.LJFF(mallExtraInfo.LIZ(), "2") && C123100dR.LIZ(mallExtraInfo.templateId)) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC2209391BdZ
        public final Map LIZ(MallExtraInfo mallExtraInfo, String str, String str2) {
            String str3;
            String str4 = mallExtraInfo.mallOutSource;
            String str5 = mallExtraInfo.templateId;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = mallExtraInfo.campaignId;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = mallExtraInfo.vtScores;
            if (str7 == null) {
                str7 = "";
            }
            if (Intrinsics.LJFF(str4, "inbox")) {
                str3 = "in_app";
            } else {
                str3 = "out_of_app";
            }
            String[] strArr = new String[3];
            if (str4 == null) {
                str4 = "";
            }
            if (Intrinsics.LJFF(str4, "out_app_push")) {
                str4 = "push";
            }
            strArr[0] = str4;
            strArr[1] = str5;
            strArr[2] = str3;
            List listLJIJI = C13LQ.LJIJI(strArr);
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLJIJI) {
                if (C123100dR.LIZ((String) obj)) {
                    arrayList.add(obj);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, e3.d, null, null, 0, null, null, 62);
            Map<String, String> map = C2209351BdV.LIZ;
            return C2209351BdV.LIZIZ(C2209351BdV.LIZ(strLJJLIIIJ, str2), str5, str6, C2209351BdV.LIZLLL(mallExtraInfo, null), str7);
        }
    }, new InterfaceC2209391BdZ() { // from class: X.1BdU
        @Override // X.InterfaceC2209391BdZ
        public final boolean LIZIZ(MallExtraInfo mallExtraInfo, String str) {
            if (Intrinsics.LJFF(mallExtraInfo.mallOutSource, "webtoapp") && Intrinsics.LJFF(mallExtraInfo.LIZ(), "2")) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC2209391BdZ
        public final Map LIZ(MallExtraInfo mallExtraInfo, String str, String str2) {
            String str3 = mallExtraInfo.mallOutSource;
            String str4 = mallExtraInfo.creativeId;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            String str6 = mallExtraInfo.campaignId;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = mallExtraInfo.vtScores;
            if (str7 != null) {
                str5 = str7;
            }
            Map<String, String> map = C2209351BdV.LIZ;
            return C2209351BdV.LIZIZ(C2209351BdV.LJ(str3, str2), str4, str6, C2209351BdV.LIZLLL(mallExtraInfo, null), str5);
        }
    }, new InterfaceC2209391BdZ() { // from class: X.1BdT
        @Override // X.InterfaceC2209391BdZ
        public final boolean LIZIZ(MallExtraInfo mallExtraInfo, String str) {
            if (Intrinsics.LJFF(mallExtraInfo.mallOutSource, "pdp_banner") && Intrinsics.LJFF(mallExtraInfo.LIZ(), "2")) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC2209391BdZ
        public final Map LIZ(MallExtraInfo mallExtraInfo, String str, String str2) {
            String str3 = mallExtraInfo.mallOutSource;
            String str4 = mallExtraInfo.productId;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            String str6 = mallExtraInfo.campaignId;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = mallExtraInfo.vtScores;
            if (str7 != null) {
                str5 = str7;
            }
            Map<String, String> map = C2209351BdV.LIZ;
            return C2209351BdV.LIZIZ(C2209351BdV.LJ(str3, str2), str4, str6, C2209351BdV.LIZLLL(mallExtraInfo, null), str5);
        }
    }, new InterfaceC2209391BdZ() { // from class: X.1BdX
        @Override // X.InterfaceC2209391BdZ
        public final boolean LIZIZ(MallExtraInfo mallExtraInfo, String str) {
            if (Intrinsics.LJFF(mallExtraInfo.mallOutSource, "shop_similar_product_module") && Intrinsics.LJFF(mallExtraInfo.LIZ(), "2")) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC2209391BdZ
        public final Map LIZ(MallExtraInfo mallExtraInfo, String str, String str2) {
            String str3 = mallExtraInfo.mallOutSource;
            String str4 = mallExtraInfo.sellerId;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            String str6 = mallExtraInfo.vtScores;
            if (str6 != null) {
                str5 = str6;
            }
            Map<String, String> map = C2209351BdV.LIZ;
            return C2209351BdV.LIZIZ(C2209351BdV.LJ(str3, str2), str4, null, C2209351BdV.LIZLLL(mallExtraInfo, null), str5);
        }
    }, new InterfaceC2209391BdZ() { // from class: X.1BdY
        @Override // X.InterfaceC2209391BdZ
        public final boolean LIZIZ(MallExtraInfo mallExtraInfo, String str) {
            if (Intrinsics.LJFF(mallExtraInfo.mallOutSource, "showcase_similar_product_module") && Intrinsics.LJFF(mallExtraInfo.LIZ(), "2")) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC2209391BdZ
        public final Map LIZ(MallExtraInfo mallExtraInfo, String str, String str2) {
            String str3 = mallExtraInfo.mallOutSource;
            String str4 = mallExtraInfo.authorId;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            String str6 = mallExtraInfo.vtScores;
            if (str6 != null) {
                str5 = str6;
            }
            Map<String, String> map = C2209351BdV.LIZ;
            return C2209351BdV.LIZIZ(C2209351BdV.LJ(str3, str2), str4, null, C2209351BdV.LIZLLL(mallExtraInfo, null), str5);
        }
    }, new InterfaceC2209391BdZ() { // from class: X.1BdM
        public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("coupon_popup", "mall_browse_task");

        @Override // X.InterfaceC2209391BdZ
        public final boolean LIZIZ(MallExtraInfo mallExtraInfo, String str) {
            if (C13LP.LJJJJ(mallExtraInfo.mallOutSource, C1697810uHb.LJIIJJI("tt_task_page", "tt_task_page_claim"))) {
                if (C13LP.LJJJJ(mallExtraInfo.mallDirectType, LIZIZ) && Intrinsics.LJFF(mallExtraInfo.LIZ(), "2")) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // X.InterfaceC2209391BdZ
        public final Map LIZ(MallExtraInfo mallExtraInfo, String str, String str2) {
            String str3 = mallExtraInfo.mallDirectType;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            String str5 = mallExtraInfo.couponTypeId;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = mallExtraInfo.vtScores;
            if (str6 != null) {
                str4 = str6;
            }
            Map<String, String> map = C2209351BdV.LIZ;
            String strLIZLLL = C2209351BdV.LIZLLL(mallExtraInfo, null);
            if (Intrinsics.LJFF(str3, "coupon_popup")) {
                return C2209351BdV.LIZIZ(C2209351BdV.LIZ("tt_task_page.coupon_popup.in_app_buy", str2), str5, null, strLIZLLL, str4);
            }
            if (Intrinsics.LJFF(str3, "mall_browse_task")) {
                return C2209351BdV.LIZIZ(C2209351BdV.LIZ("tt_task_page.mall_browse_task.in_app_buy", str2), null, null, strLIZLLL, str4);
            }
            return C2209351BdV.LIZ;
        }
    }, new InterfaceC2209391BdZ() { // from class: X.1BdL
        public static Map LIZJ(String str) {
            boolean z;
            Object obj = "";
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, ""), new Pair("sub_scene", ""));
            }
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"_"}, 0, 6);
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(4, listLJJLIIIJILLIZJL);
            if (objLJJJLZIJ == null) {
                objLJJJLZIJ = "";
            }
            Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(5, listLJJLIIIJILLIZJL);
            if (objLJJJLZIJ2 != null) {
                obj = objLJJJLZIJ2;
            }
            return C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, objLJJJLZIJ), new Pair("sub_scene", obj));
        }

        @Override // X.InterfaceC2209391BdZ
        public final boolean LIZIZ(MallExtraInfo mallExtraInfo, String str) {
            if (str == null || str.length() == 0) {
                return false;
            }
            return C123100dR.LIZ((String) LIZJ(C018G.LIZIZ(str, "previous_page")).get(Scene.SCENE_SERVICE));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC2209391BdZ
        public final Map LIZ(MallExtraInfo mallExtraInfo, String str, String str2) {
            String strLIZIZ;
            if (str != null && str.length() != 0) {
                String strLIZIZ2 = C018G.LIZIZ(str, "previous_page");
                Object obj = "";
                if (strLIZIZ2 == null) {
                    strLIZIZ2 = "";
                }
                String strLIZIZ3 = C018G.LIZIZ(str, "campaign_id");
                if (strLIZIZ3 == null) {
                    strLIZIZ3 = "";
                }
                String strLIZIZ4 = C018G.LIZIZ(str, "creative_id");
                if (strLIZIZ4 == null) {
                    strLIZIZ4 = "";
                }
                String str3 = mallExtraInfo.mallOutSource;
                String strLIZ = mallExtraInfo.LIZ();
                String str4 = mallExtraInfo.campaignId;
                String str5 = mallExtraInfo.materialId;
                String str6 = mallExtraInfo.trackId;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = mallExtraInfo.vtScores;
                if (str7 == null) {
                    str7 = "";
                }
                Map mapLIZJ = LIZJ(strLIZIZ2);
                String str8 = (String) mapLIZJ.get(Scene.SCENE_SERVICE);
                if (str8 == null) {
                    str8 = "";
                }
                Object obj2 = mapLIZJ.get("sub_scene");
                if (obj2 != null) {
                    obj = obj2;
                }
                List listLJIJI = C13LQ.LJIJI(new String[]{str6, obj, String.valueOf(System.currentTimeMillis())});
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (ArrayList) listLJIJI) {
                    if (C123100dR.LIZ((String) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, e3.d, null, null, 0, null, null, 62);
                if (C123100dR.LIZ(str4)) {
                    strLIZIZ3 = str4;
                }
                if (C123100dR.LIZ(str5)) {
                    strLIZIZ4 = str5;
                }
                if (str3 != null && Intrinsics.LJFF(strLIZ, "2")) {
                    Map<String, String> map = C2209351BdV.LIZ;
                    return C2209351BdV.LIZIZ(C2209351BdV.LIZ(str3, str2), strLIZIZ4, strLIZIZ3, strLJJLIIIJ, str7);
                }
                if (str8.length() == 0) {
                    return C2209351BdV.LIZ;
                }
                Map<String, String> map2 = C2209351BdV.LIZ;
                if (C1697810uHb.LJIIJJI("tt", "ttvsa").contains(str8)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str8);
                    sbLIZ.append(".link.in_app_buy");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str8);
                    sbLIZ2.append(".link.out_of_app_buy");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                return C2209351BdV.LIZIZ(C2209351BdV.LIZ(strLIZIZ, str2), strLIZIZ4, strLIZIZ3, strLJJLIIIJ, str7);
            }
            return C2209351BdV.LIZ;
        }
    });

    public static Map LIZ(String str, String str2, String str3) {
        MallExtraInfo mallExtraInfo;
        if (str != null) {
            String strLIZIZ = C018G.LIZIZ(str, "mall_extra_info");
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            mallExtraInfo = (MallExtraInfo) JsonParseUtils.LIZLLL(MallExtraInfo.class, strLIZIZ);
            if (mallExtraInfo == null) {
                mallExtraInfo = new MallExtraInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            }
        } else if (str2 == null || (mallExtraInfo = (MallExtraInfo) JsonParseUtils.LIZLLL(MallExtraInfo.class, str2)) == null) {
            mallExtraInfo = new MallExtraInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mallExtraInfo: ");
        sbLIZ.append(mallExtraInfo);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("TrafficDiversionInfoGenerator", strLIZIZ2);
        for (InterfaceC2209391BdZ interfaceC2209391BdZ : LIZ) {
            if (interfaceC2209391BdZ.LIZIZ(mallExtraInfo, str)) {
                C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("hit convert: ");
                sbLIZ2.append(interfaceC2209391BdZ);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
                c599820Nfo2.getClass();
                C599820Nfo.LIZ("TrafficDiversionInfoGenerator", strLIZIZ3);
                return interfaceC2209391BdZ.LIZ(mallExtraInfo, str, str3);
            }
        }
        return C2209321BdS.LIZ.LIZ(mallExtraInfo, str, str3);
    }
}

package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorite.NearbyFavoriteListViewModel;
import com.ss.android.ugc.aweme.favorite.NearbyFavoritePageParams;
import com.ss.android.ugc.aweme.favorite.assem.NearbyFavoriteListCell;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimListCellAssem;
import com.ss.android.ugc.aweme.poi.detail.guides.PoiDetailGuidesCell;
import com.ss.android.ugc.aweme.poi.search.creator.tag.PoiSearchCreatorCategoryLabelCell;
import com.ss.android.ugc.aweme.poi.search.data.PoiSearchFilterDataItem;
import com.ss.android.ugc.nearby.container.model.NearbyTool;
import com.ss.android.ugc.nearby.container.model.NearbyToolZoneModel;
import com.ss.android.ugc.nearby.feedcard.NearbyFeedCellAssem;
import com.ss.android.ugc.nearby.locationpermission.NearbyFeedAskLocationChangeCell;
import com.ss.android.ugc.nearby.toolzone.NearbyToolBaseCell;
import com.ss.android.ugc.nearby.toolzone.NearbyToolZoneCell;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hZ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208900hZ2 implements InterfaceC2211931Bhf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2211931Bhf
    public final void LIZ(View view, String str) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view, str);
                break;
            case 1:
                LIZ$1(this, view, str);
                break;
            case 2:
                LIZ$2(this, view, str);
                break;
            case 3:
                LIZ$3(this, view, str);
                break;
            case 4:
                LIZ$4(this, view, str);
                break;
            case 5:
                LIZ$5(this, view, str);
                break;
            case 6:
                LIZ$6(this, view, str);
                break;
            case 7:
                LIZ$7(this, view, str);
                break;
            case 8:
                LIZ$8(this, view, str);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view, str);
                break;
        }
    }

    public C1208900hZ2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1208900hZ2 c1208900hZ2, View view, String str) {
        String str2;
        String str3;
        String str4;
        C1201930hNn c1201930hNn = C1201930hNn.LIZ;
        C1172110gbh item = ((NearbyFavoriteListCell) c1208900hZ2.l0).getItem();
        EnumC1157530gEB scene = null;
        if (item == null || (str2 = item.LLILLL) == null) {
            str2 = "";
        }
        AssemVMLazy assemVMLazy = ((NearbyFavoriteListCell) c1208900hZ2.l0).LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = NearbyFavoriteListCell.LLILZIL;
        boolean z = ((NearbyFavoriteListViewModel) assemVMLazy.getValue()).LL;
        NearbyFavoritePageParams nearbyFavoritePageParams = ((NearbyFavoriteListCell) c1208900hZ2.l0).LLILLJJLI;
        if (nearbyFavoritePageParams != null) {
            scene = nearbyFavoritePageParams.getScene();
        }
        if (scene == EnumC1157530gEB.RE_VISIT) {
            str3 = "poi_favorite_places_carousel";
        } else {
            str3 = "poi_favorite_places_toast";
        }
        c1201930hNn.getClass();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("poi_id", str2);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("enable_location", str4);
        pairArr[2] = new Pair("previous_page", str3);
        C20684815ws.LJIILLIIL("poi_collection_show", C2097608Jq.LJIIJ(pairArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$1(X.C1208900hZ2 r20, android.view.View r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208900hZ2.LIZ$1(X.0hZ2, android.view.View, java.lang.String):void");
    }

    public static final void LIZ$2(C1208900hZ2 c1208900hZ2, View view, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        HashMap<String, String> mapI5 = ((PoiDetailGuidesCell) c1208900hZ2.l0).I5();
        C1185050gwZ c1185050gwZ = new C1185050gwZ((PageFinder) ((PoiDetailGuidesCell) c1208900hZ2.l0).LLJIJIL.getValue());
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_guide_card", mapI5, c1185050gwZ);
    }

    public static final void LIZ$3(C1208900hZ2 c1208900hZ2, View view, String str) {
        String filterId;
        C1197870hHF c1197870hHF = C1197870hHF.LIZ;
        JSONObject jSONObjectI5 = ((PoiSearchCreatorCategoryLabelCell) c1208900hZ2.l0).I5();
        PoiSearchFilterDataItem poiSearchFilterDataItem = ((PoiSearchCreatorCategoryLabelCell) c1208900hZ2.l0).LLILZIL;
        if (poiSearchFilterDataItem != null) {
            filterId = poiSearchFilterDataItem.getFilterId();
        } else {
            filterId = null;
        }
        String strValueOf = String.valueOf(filterId);
        c1197870hHF.getClass();
        C2365509Or.LIZLLL(jSONObjectI5, "filter_name", strValueOf);
        C1185040gwY.LIZ.getClass();
        C1185040gwY.LIZJ("ttls_add_location_filter_show", jSONObjectI5, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$4(C1208900hZ2 c1208900hZ2, View view, String str) {
        NearbyTool nearbyTool;
        T item = ((NearbyToolBaseCell) c1208900hZ2.l0).getItem();
        if ((item instanceof NearbyTool) && (nearbyTool = (NearbyTool) item) != null) {
            NearbyToolBaseCell nearbyToolBaseCell = (NearbyToolBaseCell) c1208900hZ2.l0;
            C1204900hSa c1204900hSa = C1204900hSa.LIZ;
            String componentKey = nearbyTool.getComponentKey();
            Integer numValueOf = Integer.valueOf(nearbyToolBaseCell.getBindingAdapterPosition());
            Boolean boolValueOf = Boolean.valueOf(nearbyTool.isCacheData());
            c1204900hSa.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1189060h32.LJIJJLI(c2344009Gk, "item_name", componentKey);
            C1189060h32.LJIJJLI(c2344009Gk, "item_index", numValueOf);
            C1189060h32.LJIJJLI(c2344009Gk, "nearby_tab_city_id", C1204880hSY.LIZIZ());
            C1189060h32.LJIJJLI(c2344009Gk, "is_cache", Integer.valueOf(Intrinsics.LJFF(Boolean.TRUE, boolValueOf) ? 1 : 0));
            C20684815ws.LJIILLIIL("ttls_nearby_toolzone_item_show", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$5(C1208900hZ2 c1208900hZ2, View view, String str) {
        Integer numValueOf;
        String strLIZ;
        List<NearbyTool> list;
        C1204900hSa c1204900hSa = C1204900hSa.LIZ;
        NearbyToolZoneModel nearbyToolZoneModel = (NearbyToolZoneModel) ((NearbyToolZoneCell) c1208900hZ2.l0).getItem();
        Boolean boolValueOf = null;
        if (nearbyToolZoneModel != null && (list = nearbyToolZoneModel.tools) != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        NearbyToolZoneModel nearbyToolZoneModel2 = (NearbyToolZoneModel) ((NearbyToolZoneCell) c1208900hZ2.l0).getItem();
        if (nearbyToolZoneModel2 != null) {
            strLIZ = nearbyToolZoneModel2.LIZ();
        } else {
            strLIZ = null;
        }
        NearbyToolZoneModel nearbyToolZoneModel3 = (NearbyToolZoneModel) ((NearbyToolZoneCell) c1208900hZ2.l0).getItem();
        if (nearbyToolZoneModel3 != null) {
            boolValueOf = Boolean.valueOf(nearbyToolZoneModel3.LL);
        }
        c1204900hSa.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1189060h32.LJIJJLI(c2344009Gk, "all_item_cnt", numValueOf);
        C1189060h32.LJIJJLI(c2344009Gk, "all_item_name", strLIZ);
        C1189060h32.LJIJJLI(c2344009Gk, "nearby_tab_city_id", C1204880hSY.LIZIZ());
        C1189060h32.LJIJJLI(c2344009Gk, "is_cache", Integer.valueOf(Intrinsics.LJFF(Boolean.TRUE, boolValueOf) ? 1 : 0));
        C20684815ws.LJIILLIIL("ttls_nearby_toolzone_show", c2344009Gk.LIZ);
    }

    public static final void LIZ$6(C1208900hZ2 c1208900hZ2, View view, String str) {
        ((Function2) c1208900hZ2.l0).invoke(view, str);
    }

    public static final void LIZ$7(C1208900hZ2 c1208900hZ2, View view, String str) {
        C1200540hLY c1200540hLY = C1200540hLY.LIZ;
        PoiClaimListCellAssem poiClaimListCellAssem = (PoiClaimListCellAssem) c1208900hZ2.l0;
        C1200050hKl c1200050hKl = poiClaimListCellAssem.LLJLILLLLZIIL;
        C1200780hLw c1200780hLw = poiClaimListCellAssem.op().LLILZLL;
        c1200540hLY.getClass();
        C1200560hLa c1200560hLaLIZ = C1200540hLY.LIZ(c1200050hKl, c1200780hLw);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_cache_search", CardStruct.IStatusCode.DEFAULT);
        C1189060h32.LIZ(c1200560hLaLIZ.LIZ, linkedHashMap);
        linkedHashMap.putAll(C1200530hLX.LIZIZ(null, "search_poi_show_al"));
        C1189060h32.LJJ("search_id", c1200560hLaLIZ.LIZIZ, linkedHashMap);
        linkedHashMap.put("is_success", "1");
        String str2 = c1200560hLaLIZ.LIZJ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("key_word", str2);
        linkedHashMap.put("enter_method", c1200560hLaLIZ.LIZLLL);
        String str4 = c1200560hLaLIZ.LJ;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("log_id", str4);
        String str5 = c1200560hLaLIZ.LJFF;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("index", str5);
        String str6 = c1200560hLaLIZ.LJI;
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("poi_id", str6);
        String str7 = c1200560hLaLIZ.LJII;
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMap.put("session_id", str7);
        String str8 = c1200560hLaLIZ.LJIIIIZZ;
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMap.put("page_order", str8);
        linkedHashMap.put("enter_from", "claim_poi_page");
        String str9 = c1200560hLaLIZ.LJIIIZ;
        if (str9 == null) {
            str9 = "";
        }
        linkedHashMap.put("use_session_cache", str9);
        String str10 = c1200560hLaLIZ.LJIIJ;
        if (str10 != null) {
            str3 = str10;
        }
        linkedHashMap.put("local_service_key_category", str3);
        C20684815ws.LJIILLIIL("search_poi_show_al", linkedHashMap);
    }

    public static final void LIZ$8(C1208900hZ2 c1208900hZ2, View view, String str) {
        int iIntValue;
        long jCurrentTimeMillis;
        String sourceStr;
        NearbyFeedCellAssem nearbyFeedCellAssem = (NearbyFeedCellAssem) c1208900hZ2.l0;
        C1205240hT8 c1205240hT8 = nearbyFeedCellAssem.LLLFZ;
        if (c1205240hT8 != null) {
            C1205150hSz c1205150hSz = C1205150hSz.LIZ;
            TuxTextView tuxTextView = nearbyFeedCellAssem.LLL;
            c1205150hSz.getClass();
            int iLIZ = C1205150hSz.LIZ(tuxTextView);
            nearbyFeedCellAssem.LLLJIL = iLIZ;
            c1205240hT8.LJIILJJIL = iLIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mob expose,index = ");
            sbLIZ.append(nearbyFeedCellAssem.tp());
            sbLIZ.append(",isPoiNameFolded = ");
            sbLIZ.append(c1205240hT8.LJIILJJIL);
            C2188811AlT.LIZIZ(sbLIZ);
            C1205260hTA c1205260hTA = C1205260hTA.LIZ;
            PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(nearbyFeedCellAssem));
            c1205260hTA.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "homepage_nearby");
            c2344009Gk.LJIIIIZZ("group_id", c1205240hT8.LIZ);
            c2344009Gk.LJIIIIZZ("author_id", c1205240hT8.LIZIZ);
            c2344009Gk.LJIIIIZZ("request_id", c1205240hT8.LIZJ);
            c2344009Gk.LJIIIIZZ("aweme_type", c1205240hT8.LIZLLL);
            c2344009Gk.LJIIIIZZ("displayed_title", c1205240hT8.LJ);
            C1189060h32.LJJIFFI(c2344009Gk, "poi_id", c1205240hT8.LJFF);
            C1189060h32.LJJIFFI(c2344009Gk, "collect_info", c1205240hT8.LJI);
            c2344009Gk.LIZJ(c1205240hT8.LJII ? 1 : 0, "is_poi_anchor_shown");
            c2344009Gk.LIZJ(C1205260hTA.LIZIZ(c1205240hT8.LJIIIIZZ, c1205240hT8.LJIIIZ), "is_distance_shown");
            C1189060h32.LJJIFFI(c2344009Gk, "device_poi_location_relationship", c1205240hT8.LJIIJ);
            c2344009Gk.LJIIIIZZ("device_tabcity_location_relationship", C1204880hSY.LIZJ());
            c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
            c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
            c2344009Gk.LJIIIIZZ("like_cnt", String.valueOf(c1205240hT8.LJIIJJI));
            c2344009Gk.LIZJ(c1205240hT8.LJIIL, "nearby_rank");
            c2344009Gk.LIZJ(c1205240hT8.LJIILIIL, "is_cache");
            c2344009Gk.LIZJ(c1205240hT8.LJIILJJIL, "is_poi_name_folded");
            if (c1205240hT8.LJIILLIIL == null) {
                jCurrentTimeMillis = -1;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis() - c1205240hT8.LJIILLIIL.longValue();
            }
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "request_to_show_duration");
            C1189060h32.LIZJ(c2344009Gk, c1205240hT8.LJI);
            C1189060h32.LJJIFFI(c2344009Gk, "nearby_tab_enter_from", C1205100hSu.LIZ);
            C1189060h32.LJJIFFI(c2344009Gk, "nearby_tab_enter_method", C1205100hSu.LIZIZ);
            EnumC1204410hRn enumC1204410hRn = c1205240hT8.LJIIZILJ;
            if (enumC1204410hRn != null) {
                sourceStr = enumC1204410hRn.getSourceStr();
            } else {
                sourceStr = null;
            }
            c2344009Gk.LJIIIIZZ("data_source", sourceStr);
            C1189060h32.LJJIFFI(c2344009Gk, "data_type", c1205240hT8.LJIJ);
            String str2 = c1205240hT8.LJIILL;
            if (str2 != null && !Intrinsics.LJFF(str2, "")) {
                c2344009Gk.LJFF("geo_expansion_type", c1205240hT8.LJIILL);
            }
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            Map<String, String> map = c2344009Gk.LIZ;
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
            c1185040gwY.getClass();
            C1185040gwY.LJFF("show_nearby_card", map, c1185050gwZ);
            C1205260hTA.LJFF(c1205240hT8.LIZ);
        }
        int iTp = ((NearbyFeedCellAssem) c1208900hZ2.l0).tp();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("currentPosition = ");
        sbLIZ2.append(iTp);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (iTp >= NearbyFeedCellAssem.LLLLII) {
            C1204530hRz c1204530hRz = C1204530hRz.LIZ;
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ((NearbyFeedCellAssem) c1208900hZ2.l0);
            c1204530hRz.getClass();
            Integer num = C1205040hSo.LIZ().expGroup;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("group = ");
            sbLIZ3.append(iIntValue);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (iIntValue == 1) {
                boolean zLJIIJ = C1204590hS5.LIZIZ.LJIIJ("card exposure");
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("business:");
                C1207450hWh c1207450hWh = C1207450hWh.LIZ;
                sbLIZ4.append(c1207450hWh.LJI("Content Discovery", "Nearby"));
                sbLIZ4.append(",havePermission:");
                sbLIZ4.append(c1207450hWh.LJII(0, C1BWL.LIZ()));
                sbLIZ4.append(",hitExp:");
                sbLIZ4.append(true);
                sbLIZ4.append(",hitFre:");
                sbLIZ4.append(zLJIIJ);
                sbLIZ4.append(",clickCard:");
                sbLIZ4.append(C1204530hRz.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ4);
                if (!zLJIIJ && !C1204530hRz.LIZIZ && c1207450hWh.LJI("Content Discovery", "Nearby") && !c1207450hWh.LJII(0, C1BWL.LIZ())) {
                    C1204590hS5.LIZIZ.LJIIL(EnumC586410MzH.CLICKTYPE);
                    C1204530hRz.LIZ(EnumC993950byL.CARD_EXPOSE, fragmentLJIIJ, null);
                }
            }
        }
    }

    public static final void LIZ$9(C1208900hZ2 c1208900hZ2, View view, String str) {
        C1204940hSe c1204940hSe = C1204940hSe.LIZ;
        int iI5 = ((NearbyFeedAskLocationChangeCell) c1208900hZ2.l0).I5();
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((NearbyFeedAskLocationChangeCell) c1208900hZ2.l0);
        c1204940hSe.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("card_type", "location_change_feedback");
        c2344009Gk.LIZJ(iI5, "nearby_rank");
        c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
        c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(fragmentLJIIJ));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_nearby_functional_card_show", map, c1185050gwZ);
    }
}

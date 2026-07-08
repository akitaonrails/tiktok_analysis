package X;

import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ghA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175500ghA {
    /* JADX WARN: Multi-variable type inference failed */
    public static SlashRequestParam LIZ(InterfaceC1181010gq3 interfaceC1181010gq3, String str, String str2, long j, int i, int i2) {
        C1185600gxS c1185600gxS;
        String fromGroupId;
        String enterFrom;
        String adClickId;
        List<String> sourceMerchantIds;
        C1185410gx9 c1185410gx9;
        C1185410gx9 c1185410gx92;
        C1185410gx9 c1185410gx93;
        C1185410gx9 c1185410gx94;
        C1173300gdc c1173300gdcQr0;
        List<String> sourceProductIds = null;
        if (interfaceC1181010gq3 != null && (c1173300gdcQr0 = interfaceC1181010gq3.qr0()) != null) {
            c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
        } else {
            c1185600gxS = null;
        }
        Pair[] pairArr = new Pair[13];
        pairArr[0] = new Pair("poi_id", str);
        if (c1185600gxS != null && (c1185410gx94 = c1185600gxS.LJFF) != null) {
            fromGroupId = c1185410gx94.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        pairArr[1] = new Pair("group_id", fromGroupId);
        if (c1185600gxS != null && (c1185410gx93 = c1185600gxS.LJFF) != null) {
            enterFrom = c1185410gx93.getEnterFrom();
        } else {
            enterFrom = null;
        }
        pairArr[2] = new Pair("enter_from", enterFrom);
        if (c1185600gxS != null && (c1185410gx92 = c1185600gxS.LJFF) != null) {
            adClickId = c1185410gx92.getAdClickId();
        } else {
            adClickId = null;
        }
        pairArr[3] = new Pair("ad_click_id", adClickId);
        pairArr[4] = new Pair("poi_review_scene", String.valueOf(EnumC1175520ghC.POI_DETAIL_PAGE.getValue()));
        pairArr[5] = new Pair("poi_review_count", "20");
        pairArr[6] = new Pair("region_discovery_scene", String.valueOf(EnumC1175380ggy.SCENE_REGION_POI_DETAIL.getScene()));
        pairArr[7] = new Pair("region_discovery_sub_scene", null);
        pairArr[8] = new Pair("region_discovery_tab_code", null);
        pairArr[9] = new Pair("amusement_cursor", String.valueOf(j));
        pairArr[10] = new Pair("poi_video_list_search_id", null);
        pairArr[11] = new Pair("poi_merged_list_count", String.valueOf(i));
        pairArr[12] = new Pair("has_more_aweme", String.valueOf(i2));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        if (c1185600gxS != null && (c1185410gx9 = c1185600gxS.LJFF) != null) {
            sourceMerchantIds = c1185410gx9.getSourceMerchantIds();
        } else {
            sourceMerchantIds = null;
            if (c1185600gxS != null) {
            }
            return new SlashRequestParam("poi", "main", str2, mapLJIIIIZZ, new C1183450gtz(sourceMerchantIds, sourceProductIds), null);
        }
        C1185410gx9 c1185410gx95 = c1185600gxS.LJFF;
        if (c1185410gx95 != null) {
            sourceProductIds = c1185410gx95.getSourceProductIds();
        }
        return new SlashRequestParam("poi", "main", str2, mapLJIIIIZZ, new C1183450gtz(sourceMerchantIds, sourceProductIds), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SlashRequestParam LIZIZ(InterfaceC1181010gq3 interfaceC1181010gq3, String str, String str2, long j, long j2, String str3, int i, int i2, int i3, String str4, String str5) {
        C1185600gxS c1185600gxS;
        String fromGroupId;
        String enterFrom;
        String adClickId;
        List<String> sourceMerchantIds;
        C1185410gx9 c1185410gx9;
        C1185410gx9 c1185410gx92;
        C1185410gx9 c1185410gx93;
        C1185410gx9 c1185410gx94;
        C1173300gdc c1173300gdcQr0;
        List<String> sourceProductIds = null;
        if (interfaceC1181010gq3 != null && (c1173300gdcQr0 = interfaceC1181010gq3.qr0()) != null) {
            c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
        } else {
            c1185600gxS = null;
        }
        Pair[] pairArr = new Pair[17];
        pairArr[0] = new Pair("poi_id", str);
        if (c1185600gxS != null && (c1185410gx94 = c1185600gxS.LJFF) != null) {
            fromGroupId = c1185410gx94.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        pairArr[1] = new Pair("group_id", fromGroupId);
        if (c1185600gxS != null && (c1185410gx93 = c1185600gxS.LJFF) != null) {
            enterFrom = c1185410gx93.getEnterFrom();
        } else {
            enterFrom = null;
        }
        pairArr[2] = new Pair("enter_from", enterFrom);
        if (c1185600gxS != null && (c1185410gx92 = c1185600gxS.LJFF) != null) {
            adClickId = c1185410gx92.getAdClickId();
        } else {
            adClickId = null;
        }
        pairArr[3] = new Pair("ad_click_id", adClickId);
        pairArr[4] = new Pair("poi_review_scene", String.valueOf(EnumC1175520ghC.POI_DETAIL_PAGE.getValue()));
        pairArr[5] = new Pair("poi_review_count", "20");
        pairArr[6] = new Pair("poi_review_cursor", String.valueOf(j));
        pairArr[7] = new Pair("region_discovery_scene", String.valueOf(EnumC1175380ggy.SCENE_REGION_POI_DETAIL.getScene()));
        pairArr[8] = new Pair("region_discovery_sub_scene", null);
        pairArr[9] = new Pair("region_discovery_tab_code", null);
        pairArr[10] = new Pair("poi_video_list_cursor", String.valueOf(j2));
        pairArr[11] = new Pair("poi_video_list_search_id", str3);
        pairArr[12] = new Pair("poi_merged_list_count", String.valueOf(i));
        pairArr[13] = new Pair("has_more_aweme", String.valueOf(i2));
        pairArr[14] = new Pair("has_more_review", String.valueOf(i3));
        pairArr[15] = new Pair("post_tab_code", str4);
        pairArr[16] = new Pair("post_tag_code", str5);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        if (c1185600gxS != null && (c1185410gx9 = c1185600gxS.LJFF) != null) {
            sourceMerchantIds = c1185410gx9.getSourceMerchantIds();
        } else {
            sourceMerchantIds = null;
            if (c1185600gxS != null) {
            }
            return new SlashRequestParam("poi", "main", str2, mapLJIIIIZZ, new C1183450gtz(sourceMerchantIds, sourceProductIds), null);
        }
        C1185410gx9 c1185410gx95 = c1185600gxS.LJFF;
        if (c1185410gx95 != null) {
            sourceProductIds = c1185410gx95.getSourceProductIds();
        }
        return new SlashRequestParam("poi", "main", str2, mapLJIIIIZZ, new C1183450gtz(sourceMerchantIds, sourceProductIds), null);
    }
}

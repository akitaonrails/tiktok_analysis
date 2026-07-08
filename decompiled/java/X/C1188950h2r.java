package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.poi.PoiAddressInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188950h2r {
    public static final C1188950h2r LIZ = new C1188950h2r();

    public static void LIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        String ttclid;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getEnableTtclidForPoi() == 1 && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
            ttclid = awemeRawAd2.getTtclid();
        } else {
            ttclid = null;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "click_id", ttclid);
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2344009Gk LIZJ(X.C2344009Gk r13, com.ss.android.ugc.aweme.feed.model.Aweme r14) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1188950h2r.LIZJ(X.09Gk, com.ss.android.ugc.aweme.feed.model.Aweme):X.09Gk");
    }

    public static void LIZLLL(C2344009Gk c2344009Gk, Aweme aweme) {
        PoiAddressInfo poiAddressInfo;
        String str;
        String str2;
        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
        String str3 = null;
        if (poiDataStruct != null) {
            poiAddressInfo = poiDataStruct.addressInfo;
            if (poiAddressInfo != null) {
                str3 = poiAddressInfo.lng;
            }
        } else {
            poiAddressInfo = null;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("poi_longitude_wgs84", str3);
        if (poiAddressInfo == null || (str = poiAddressInfo.lat) == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("poi_latitude_wgs84", str);
        if (poiAddressInfo != null && (str2 = poiAddressInfo.geohash) != null) {
            str4 = str2;
        }
        c2344009Gk.LJFF("poi_geohash_wgs84", str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C2344009Gk r3, X.C1188440h22 r4) {
        /*
            r2 = 0
            if (r4 == 0) goto L82
            java.lang.String r1 = r4.getPoiCityCode()
        L7:
            java.lang.String r0 = "poi_city"
            X.C1189060h32.LJIJJLI(r3, r0, r1)
            if (r4 == 0) goto L80
            java.lang.String r1 = r4.getPoiRegionCode()
        L12:
            java.lang.String r0 = "poi_region_code"
            X.C1189060h32.LJIJJLI(r3, r0, r1)
            if (r4 == 0) goto L7e
            java.lang.String r1 = r4.getPoiInfoSource()
        L1d:
            java.lang.String r0 = "poi_info_source"
            X.C1189060h32.LJIJJLI(r3, r0, r1)
            if (r4 == 0) goto L7c
            java.lang.String r1 = r4.getPoiDetailType()
        L28:
            java.lang.String r0 = "poi_detail_type"
            X.C1189060h32.LJIJJLI(r3, r0, r1)
            if (r4 == 0) goto L7a
            java.lang.Boolean r0 = r4.isClaimed()
            if (r0 == 0) goto L7a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L77
            java.lang.String r1 = "1"
        L3d:
            java.lang.String r0 = "is_claimed"
            X.C1189060h32.LJIJJLI(r3, r0, r1)
            if (r4 == 0) goto L75
            java.lang.String r1 = r4.getPoiId()
            if (r1 == 0) goto L75
            X.0h24 r0 = X.C1188460h24.LIZ
            r0.getClass()
            X.0h22 r0 = X.C1188460h24.LIZIZ(r1)
            if (r0 == 0) goto L75
            java.lang.String r1 = r0.getFromGroupId()
        L59:
            java.lang.String r0 = "from_group_id"
            X.C1189060h32.LJIJJLI(r3, r0, r1)
            if (r4 == 0) goto L73
            java.lang.String r1 = r4.getPoiId()
        L64:
            java.lang.String r0 = "poi_id"
            X.C1189060h32.LJJIFFI(r3, r0, r1)
            if (r4 == 0) goto L6f
            java.lang.String r2 = r4.getCollectInfo()
        L6f:
            X.C1189060h32.LIZJ(r3, r2)
            return
        L73:
            r1 = r2
            goto L64
        L75:
            r1 = r2
            goto L59
        L77:
            java.lang.String r1 = "0"
            goto L3d
        L7a:
            r1 = r2
            goto L3d
        L7c:
            r1 = r2
            goto L28
        L7e:
            r1 = r2
            goto L1d
        L80:
            r1 = r2
            goto L12
        L82:
            r1 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1188950h2r.LJ(X.09Gk, X.0h22):void");
    }

    public static void LJFF(C2344009Gk c2344009Gk, Aweme aweme) {
        String strLJJLIIIJ;
        String str;
        List<String> list;
        List<String> list2;
        if (aweme == null) {
            return;
        }
        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
        Integer numValueOf = null;
        if (poiDataStruct != null && (list2 = poiDataStruct.productIds) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        PoiDataStruct poiDataStruct2 = aweme.getPoiDataStruct();
        if (poiDataStruct2 != null && true == poiDataStruct2.isProductAnchor()) {
            str = "product";
        } else {
            str = "poi";
        }
        PoiDataStruct poiDataStruct3 = aweme.getPoiDataStruct();
        if (poiDataStruct3 != null && (list = poiDataStruct3.productIds) != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        C1189060h32.LJJIFFI(c2344009Gk, "product_ids", strLJJLIIIJ);
        C1189060h32.LJJIFFI(c2344009Gk, "ttls_anchor_type", str);
        C1189060h32.LJJIFFI(c2344009Gk, "ttls_anchor_product_cnt", String.valueOf(numValueOf));
    }

    public static void LJI(C2344009Gk c2344009Gk, String str) {
        if (!Intrinsics.LJFF(str, "general_search") && !Intrinsics.LJFF(str, "search_result") && !Intrinsics.LJFF(str, "search_places")) {
            return;
        }
        C0PRC c0prc = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
        C1189060h32.LJJIFFI(c2344009Gk, "search_keyword", c0prc.LLIZLLLIL);
        C1189060h32.LJJIFFI(c2344009Gk, "search_id", c0prc.LLILLL);
    }

    public static String LJII(String str, String str2) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String strOptString = "";
        if (z) {
            return "";
        }
        try {
            strOptString = new JSONObject(str).optString(str2, "");
            return strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strOptString;
        }
    }
}

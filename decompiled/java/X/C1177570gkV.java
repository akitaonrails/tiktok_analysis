package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitFragment;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177570gkV {
    public static final C1177570gkV LIZ = new C1177570gkV();

    public static String LIZIZ() {
        InterfaceC1207490hWl interfaceC1207490hWl = (InterfaceC1207490hWl) PluggableExtentionKt.pluggableSpi$default(ILocationService.class, false, false, false, 14, null);
        return (interfaceC1207490hWl == null || !interfaceC1207490hWl.LJII(0, C1BWL.LIZ())) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[PHI: r2
      0x004d: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:22:0x004a, B:8:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility r10) {
        /*
            r5 = 0
            if (r10 == 0) goto L49
            X.0e6j r0 = r10.DT1()
            if (r0 == 0) goto L49
            java.lang.String r2 = r0.LLILLJJLI
        Lb:
            X.0e6j r0 = r10.dG0()
            if (r0 == 0) goto L4d
            java.lang.String r1 = r0.LLILLJJLI
        L13:
            r10.Oy2()
        L16:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r0 = X.C1200890hM7.LIZ(r2)
            if (r0 == 0) goto L26
            java.lang.String r0 = "area"
            r3.add(r0)
        L26:
            boolean r0 = X.C1200890hM7.LIZ(r1)
            if (r0 == 0) goto L31
            java.lang.String r0 = "category"
            r3.add(r0)
        L31:
            java.lang.String r0 = "sorting_type"
            r3.add(r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L48
            java.lang.String r4 = ","
            r7 = 0
            r10 = 62
            r6 = r5
            r8 = r5
            r9 = r5
            java.lang.String r5 = X.C13LP.LJJLIIIJ(r3, r4, r5, r6, r7, r8, r9, r10)
        L48:
            return r5
        L49:
            r2 = r5
            if (r10 == 0) goto L4d
            goto Lb
        L4d:
            r1 = r5
            if (r10 == 0) goto L16
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1177570gkV.LIZ(com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility):java.lang.String");
    }

    public static void LJFF(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "ttsocial_collection_detail_page");
        c2344009Gk.LJFF("current_page", "ttls_collection_poi_list_page");
        LIZ.getClass();
        c2344009Gk.LJFF("enable_location", LIZIZ());
        C1189060h32.LJIJJLI(c2344009Gk, "ttls_filter_type", str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(str));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_map_filter_apply_click", map, c1185050gwZ);
    }

    public static void LJI(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "ttsocial_collection_detail_page");
        c2344009Gk.LJFF("current_page", "ttls_collection_poi_list_page");
        LIZ.getClass();
        c2344009Gk.LJFF("enable_location", LIZIZ());
        C1189060h32.LJIJJLI(c2344009Gk, "ttls_filter_type", str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(str));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_map_filter_click", map, c1185050gwZ);
    }

    public static void LJII(Fragment fragment, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "ttsocial_collection_detail_page");
        c2344009Gk.LJFF("current_page", "ttls_collection_poi_list_page");
        LIZ.getClass();
        c2344009Gk.LJFF("enable_location", LIZIZ());
        C1189060h32.LJIJJLI(c2344009Gk, "poi_list_type", str);
        C1189060h32.LJIJJLI(c2344009Gk, "ttls_filter_type_list", str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(fragment));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_map_list_drag", map, c1185050gwZ);
    }

    public static void LIZJ(String str, String str2, String str3, String str4) {
        if (Intrinsics.LJFF(str4, "Others")) {
            str4 = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "ttsocial_collection_detail_page");
        c2344009Gk.LJFF("current_page", "ttls_collection_poi_list_page");
        LIZ.getClass();
        c2344009Gk.LJFF("enable_location", LIZIZ());
        C1189060h32.LJIJJLI(c2344009Gk, "ttls_filter_type_list", str2);
        C1189060h32.LJIJJLI(c2344009Gk, "poi_id", str3);
        C1189060h32.LJIJJLI(c2344009Gk, "local_service_key_category", str4);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(str));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("click_route", map, c1185050gwZ);
    }

    public static void LIZLLL(PoiRevisitFragment poiRevisitFragment, String str, String str2, String str3) {
        PageFinder pageFinderVia;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "ttsocial_collection_detail_page");
        c2344009Gk.LJFF("current_page", "ttls_collection_poi_list_page");
        LIZ.getClass();
        c2344009Gk.LJFF("enable_location", LIZIZ());
        C1189060h32.LJIJJLI(c2344009Gk, "ttls_filter_type_list", str);
        C1189060h32.LJIJJLI(c2344009Gk, "action_type", str2);
        if (poiRevisitFragment != null) {
            pageFinderVia = PageFinder.via((Fragment) poiRevisitFragment);
        } else {
            pageFinderVia = PageFinder.via(str3);
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("discovery_map_action", map, c1185050gwZ);
    }

    public static void LJ(String str, String str2, String str3, String str4, String str5) {
        if (Intrinsics.LJFF(str5, "Others")) {
            str5 = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "ttsocial_collection_detail_page");
        c2344009Gk.LJFF("current_page", "ttls_collection_poi_list_page");
        LIZ.getClass();
        c2344009Gk.LJFF("enable_location", LIZIZ());
        C1189060h32.LJIJJLI(c2344009Gk, "ttls_filter_type_list", str2);
        C1189060h32.LJIJJLI(c2344009Gk, "ttls_poi_card_list_type", str3);
        C1189060h32.LJIJJLI(c2344009Gk, "poi_id", str4);
        C1189060h32.LJIJJLI(c2344009Gk, "local_service_key_category", str5);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(str));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("show_poi_card", map, c1185050gwZ);
    }
}

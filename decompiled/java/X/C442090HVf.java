package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0HVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442090HVf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJFF(String str, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJJ("authorize_type", str, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_permission_authorize_result", linkedHashMap, c1185050gwZ);
    }

    public static void LIZJ(PageFinder pageFinder, String str, Map map) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && (!map.isEmpty())) {
            linkedHashMap.putAll(map);
        }
        C1189060h32.LJJ("error_msg", str, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_album_select_image_monitor", linkedHashMap, c1185050gwZ);
    }

    public static void LIZLLL(PageFinder pageFinder, String str, String str2, Map map) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && (!map.isEmpty())) {
            linkedHashMap.putAll(map);
        }
        C1189060h32.LJJ("step", str, linkedHashMap);
        C1189060h32.LJJ("is_first", str2, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_album_trace", linkedHashMap, c1185050gwZ);
    }

    public static void LJ(long j, int i, PageFinder pageFinder, Map map) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && (!map.isEmpty())) {
            linkedHashMap.putAll(map);
        }
        C1189060h32.LJJ("image_cnt", String.valueOf(i), linkedHashMap);
        C1189060h32.LJJ("duration", String.valueOf(j), linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_album_select_image_show", linkedHashMap, c1185050gwZ);
    }

    public static void LIZ(int i, boolean z, String str, PageFinder pageFinder, Map map) {
        String str2;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && (!map.isEmpty())) {
            linkedHashMap.putAll(map);
        }
        C1189060h32.LJJ("eligible_post_image_cnt", String.valueOf(i), linkedHashMap);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJ("is_camera_available", str2, linkedHashMap);
        C1189060h32.LJJ("album_available_type", str, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_album_authorize_click", linkedHashMap, c1185050gwZ);
    }

    public static void LIZIZ(int i, boolean z, String str, PageFinder pageFinder, Map map) {
        String str2;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && (!map.isEmpty())) {
            linkedHashMap.putAll(map);
        }
        C1189060h32.LJJ("eligible_post_image_cnt", String.valueOf(i), linkedHashMap);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJ("is_camera_available", str2, linkedHashMap);
        C1189060h32.LJJ("album_available_type", str, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_album_authorize_show", linkedHashMap, c1185050gwZ);
    }
}

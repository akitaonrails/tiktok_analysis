package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0gyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186360gyg {
    public static final C1186360gyg LIZ = new C1186360gyg();
    public static volatile Map<String, String> LIZIZ;

    public static void LIZJ(String str, String str2, long j, String str3, Integer num, String str4, Map map, Map map2, InterfaceC665370Q7z interfaceC665370Q7z) {
        String string;
        if (str != null) {
            try {
                if (str.length() != 0 && a0.LJJIIZI(str, "product_shelf_lynx", false)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
                    linkedHashMap.put("key", "lynx_render_end");
                    if (str == null) {
                        str = "";
                    }
                    linkedHashMap.put("instance_id", str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    linkedHashMap.put("poi_id", str2);
                    linkedHashMap.put("stay_time", String.valueOf(j));
                    linkedHashMap.put("refresh_code", str3);
                    if (num == null || (string = num.toString()) == null) {
                        string = "";
                    }
                    linkedHashMap.put("page_left", string);
                    if (str4 == null) {
                        str4 = "";
                    }
                    linkedHashMap.put("log_id", str4);
                    linkedHashMap.put("biz_common_params", C2365509Or.LJ(map));
                    linkedHashMap.put("tech_common_params", C2365509Or.LJ(map2));
                    LIZIZ = linkedHashMap;
                    C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                    Map<String, String> map3 = LIZIZ;
                    c1185040gwY.getClass();
                    C1185040gwY.LIZIZ("ttls_rd_poi_shelf_stage_track", map3, null);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LIZLLL(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, long j, Boolean bool, Boolean bool2) {
        String string;
        Object obj;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("key", "route_to_page");
            linkedHashMap.put("biz", "poi_detail");
            String str8 = "";
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("poi_id", str);
            if (num == null || (string = num.toString()) == null) {
                string = "";
            }
            linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, string);
            linkedHashMap.put("error_reason", str3);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("collect_info", str2);
            linkedHashMap.put("stay_time", String.valueOf(System.currentTimeMillis() - j));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (str4 == null) {
                str4 = "";
            }
            linkedHashMap2.put("enter_from", str4);
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap2.put("enter_method", str5);
            if (str6 == null) {
                str6 = "";
            }
            linkedHashMap2.put("initial_poi_enter_from", str6);
            if (str7 == null) {
                str7 = "";
            }
            linkedHashMap2.put("initial_poi_enter_method", str7);
            linkedHashMap.put("biz_common_params", C2365509Or.LJ(linkedHashMap2));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Boolean bool3 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool3)) {
                obj = CardStruct.IStatusCode.DEFAULT;
            } else if (!Intrinsics.LJFF(bool, Boolean.FALSE)) {
                obj = "";
            } else {
                obj = "1";
            }
            linkedHashMap3.put("is_first_enter_page", obj);
            if (Intrinsics.LJFF(bool2, bool3)) {
                str8 = CardStruct.IStatusCode.DEFAULT;
            } else if (Intrinsics.LJFF(bool2, Boolean.FALSE)) {
                str8 = "1";
            }
            linkedHashMap3.put("is_first_enter_same_poi_page", str8);
            linkedHashMap.put("tech_common_params", C2365509Or.LJ(linkedHashMap3));
            LIZIZ = linkedHashMap;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d A[PHI: r2
      0x005d: PHI (r2v24 java.lang.String) = (r2v1 java.lang.String), (r2v25 java.lang.String) binds: [B:46:0x0074, B:36:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0062 A[PHI: r2 r16
      0x0062: PHI (r2v23 java.lang.String) = (r2v2 java.lang.String), (r2v24 java.lang.String) binds: [B:49:0x0080, B:39:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r16v3 java.lang.String) = (r16v1 java.lang.String), (r16v4 java.lang.String) binds: [B:49:0x0080, B:39:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082 A[Catch: all -> 0x01b6, TryCatch #0 {all -> 0x01b6, blocks: (B:4:0x0008, B:6:0x000e, B:10:0x0018, B:12:0x001e, B:16:0x0028, B:18:0x002e, B:22:0x0038, B:24:0x003e, B:28:0x0048, B:30:0x004e, B:51:0x0086, B:55:0x00a1, B:59:0x00af, B:62:0x00b7, B:64:0x00d0, B:67:0x00d8, B:70:0x00ed, B:73:0x00f4, B:76:0x00fb, B:79:0x0102, B:82:0x0117, B:90:0x013a, B:97:0x0153, B:100:0x016c, B:103:0x017d, B:105:0x0191, B:107:0x019c, B:108:0x01b0, B:93:0x0149, B:86:0x012e, B:48:0x007a, B:50:0x0082, B:45:0x006e, B:47:0x0076, B:42:0x0064, B:44:0x006a), top: B:113:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e A[Catch: all -> 0x01b6, TRY_ENTER, TryCatch #0 {all -> 0x01b6, blocks: (B:4:0x0008, B:6:0x000e, B:10:0x0018, B:12:0x001e, B:16:0x0028, B:18:0x002e, B:22:0x0038, B:24:0x003e, B:28:0x0048, B:30:0x004e, B:51:0x0086, B:55:0x00a1, B:59:0x00af, B:62:0x00b7, B:64:0x00d0, B:67:0x00d8, B:70:0x00ed, B:73:0x00f4, B:76:0x00fb, B:79:0x0102, B:82:0x0117, B:90:0x013a, B:97:0x0153, B:100:0x016c, B:103:0x017d, B:105:0x0191, B:107:0x019c, B:108:0x01b0, B:93:0x0149, B:86:0x012e, B:48:0x007a, B:50:0x0082, B:45:0x006e, B:47:0x0076, B:42:0x0064, B:44:0x006a), top: B:113:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0149 A[Catch: all -> 0x01b6, TryCatch #0 {all -> 0x01b6, blocks: (B:4:0x0008, B:6:0x000e, B:10:0x0018, B:12:0x001e, B:16:0x0028, B:18:0x002e, B:22:0x0038, B:24:0x003e, B:28:0x0048, B:30:0x004e, B:51:0x0086, B:55:0x00a1, B:59:0x00af, B:62:0x00b7, B:64:0x00d0, B:67:0x00d8, B:70:0x00ed, B:73:0x00f4, B:76:0x00fb, B:79:0x0102, B:82:0x0117, B:90:0x013a, B:97:0x0153, B:100:0x016c, B:103:0x017d, B:105:0x0191, B:107:0x019c, B:108:0x01b0, B:93:0x0149, B:86:0x012e, B:48:0x007a, B:50:0x0082, B:45:0x006e, B:47:0x0076, B:42:0x0064, B:44:0x006a), top: B:113:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r20, java.lang.String r21, java.lang.Long r22, java.lang.Long r23, java.lang.Integer r24, java.lang.String r25, java.util.Map r26, long r27, java.lang.String r29, java.lang.String r30, boolean r31, int r32, X.InterfaceC665370Q7z r33) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1186360gyg.LIZ(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.Map, long, java.lang.String, java.lang.String, boolean, int, X.0Q7z):void");
    }
}

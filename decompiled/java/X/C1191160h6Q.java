package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiReviewFrequencyControl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h6Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191160h6Q {
    public static final C1191160h6Q LIZ = new C1191160h6Q();

    public static void LIZ(Map map) {
        map.put("app_lang", C786410Ut5.t2(Locale.getDefault()));
    }

    public static void LJJ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_method", str, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_show_poi_review_pics", linkedHashMap, c1185050gwZ);
    }

    public static void LJJIFFI(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_method", str, linkedHashMap);
        C1189060h32.LJJ("enter_from", "poi_reviews", linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_review_tabelog_webview_show", linkedHashMap, c1185050gwZ);
    }

    public static void LJIL(String str, String str2, Long l, PageFinder pageFinder) {
        String string;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        C1189060h32.LJJ("duration", string, linkedHashMap);
        C1189060h32.LJJ(Scene.SCENE_SERVICE, str, linkedHashMap);
        C1189060h32.LJJ("action", str2, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_review_btn_touch_duration", linkedHashMap, c1185050gwZ);
    }

    public static void LJJII(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, C1184710gw1 c1184710gw1, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("entrance_name", str);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJII("poi_reviews_read_entrance_show", linkedHashMap, c1185050gwZ, c1184710gw1);
    }

    public static void LJJIIJ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, C1184710gw1 c1184710gw1, String str) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("entrance_name", str);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJII("poi_reviews_write_entrance_show", linkedHashMap, c1185050gwZ, c1184710gw1);
    }

    public static void LJJIIZ(boolean z, Integer num, int i, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String str;
        String str2;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        if (z) {
            str = "reviews_center_entrance_show";
        } else {
            str = "reviews_center_entrance_click";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", "poi_reviews");
        linkedHashMap.put("enter_method", "icon");
        if (num != null) {
            linkedHashMap.put("badge_review_cnt", String.valueOf(num.intValue()));
        }
        if (i != 1) {
            if (i != 2) {
                str2 = "no_tooltip";
            } else {
                str2 = "review_here";
            }
        } else {
            str2 = "find_reviews";
        }
        linkedHashMap.put("tooltip", str2);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF(str, linkedHashMap, c1185050gwZ);
    }

    public static void LJJIJLIJ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str, String str2, String str3) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("review_id", String.valueOf(str));
        if (str2 != null) {
            linkedHashMap.put("picture_id", str2);
        }
        linkedHashMap.put("current_page", str3);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_image_show", linkedHashMap, c1185050gwZ);
    }

    public static void LJJIZ(String str, String str2, Double d, String str3, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "poi_reviews");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("poi_id", str);
        C1189060h32.LIZ(str2, linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(d));
        linkedHashMap.put("action_type", str3);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_rating_rules_prompt", linkedHashMap, c1185050gwZ);
    }

    public static void LJJI(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str, String str2, String str3) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", "poi_detail");
        if (str != null) {
            linkedHashMap.put("poi_id", str);
        }
        if (num != null) {
            linkedHashMap.put("review_cnt", String.valueOf(num.intValue()));
        }
        if (str2 != null) {
            C1189060h32.LIZ(str2, linkedHashMap);
        }
        C1189060h32.LJJ("module_type", str3, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_reviews_section", linkedHashMap, c1185050gwZ);
    }

    public static void LJFF(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str, String str2, String str3, String str4) {
        String string;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", str, linkedHashMap);
        C1189060h32.LJJ("poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("review_id", str3, linkedHashMap);
        C1189060h32.LJJ("author_id", str4, linkedHashMap);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        C1189060h32.LJJ("pendant_level", string, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("review_head_pendant_click", linkedHashMap, c1185050gwZ);
    }

    public static void LJJIJ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str, String str2, String str3, String str4) {
        String string;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        C1189060h32.LJJ("enter_from", str, linkedHashMap);
        C1189060h32.LJJ("poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("review_id", str3, linkedHashMap);
        C1189060h32.LJJ("author_id", str4, linkedHashMap);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        C1189060h32.LJJ("pendant_level", string, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("review_head_pendant_show", linkedHashMap, c1185050gwZ);
    }

    public static void LJJIL(String str, String str2, String str3, String str4, String str5, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", "poi_reviews");
        linkedHashMap.put("action_type", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("poi_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("review_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("author_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("local_explorer_level", str5);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_local_explorer_level_consum_popup_click", linkedHashMap, c1185050gwZ);
    }

    public static void LJJIJL(String str, String str2, float f, int i, Integer num, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder, C1184710gw1 c1184710gw1) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", "poi_detail");
        linkedHashMap.put("poi_id", str);
        C1189060h32.LIZ(str2, linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        C1189060h32.LJJ("review_cnt", String.valueOf(i), linkedHashMap);
        C1189060h32.LJJ("source", String.valueOf(num), linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJII("show_reviews_summary", linkedHashMap, c1185050gwZ, c1184710gw1);
    }

    public static void LJJIIZI(String str, String str2, String str3, Double d, long j, int i, boolean z, String str4, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String str5;
        if (z) {
            str5 = "show_single_reviews_summary";
        } else {
            str5 = "click_single_reviews_summary";
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("poi_id", str2);
        C1189060h32.LIZ(str3, linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(d));
        linkedHashMap.put("review_cnt", String.valueOf(j));
        linkedHashMap.put("source", String.valueOf(i));
        if (str4 != null) {
            linkedHashMap.put("bcm_chain", str4);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF(str5, linkedHashMap, c1185050gwZ);
    }

    public static void LJJIJIL(String str, String str2, String str3, String str4, String str5, int i, String str6, Integer num, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("poi_id", str2);
        C1189060h32.LIZ(str3, linkedHashMap);
        linkedHashMap.put("label_name", str4);
        linkedHashMap.put("label_name_translate", str5);
        linkedHashMap.put("review_cnt", String.valueOf(i));
        linkedHashMap.put("label_type", str6);
        linkedHashMap.put("label_rank", String.valueOf(num));
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_review_filter_label", linkedHashMap, c1185050gwZ);
    }

    public static void LJIIIZ(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, Integer num, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("poi_id", str2);
        C1189060h32.LIZ(str3, linkedHashMap);
        linkedHashMap.put("click_type", str4);
        linkedHashMap.put("label_name", str5);
        linkedHashMap.put("label_name_translate", str6);
        linkedHashMap.put("review_cnt", String.valueOf(i));
        linkedHashMap.put("label_type", str7);
        linkedHashMap.put("label_rank", String.valueOf(num));
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("click_review_filter_label", linkedHashMap, c1185050gwZ);
    }

    public static void LJIIL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, int i, int i2, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        Map mapLIZ = C308370C6x.LIZ(null);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.putAll(mapLIZ);
        C1189060h32.LJJ("initial_poi_id", str, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str2, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str3, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str4, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str5, linkedHashMap);
        linkedHashMap.put("enter_from", "poi_detail");
        linkedHashMap.put("enter_method", str6);
        linkedHashMap.put("poi_id", str7);
        C1189060h32.LIZ(str8, linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("review_cnt", String.valueOf(i));
        linkedHashMap.put("source", String.valueOf(i2));
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("click_reviews_summary", linkedHashMap, c1185050gwZ);
    }

    public static void LJIILL(String str, String str2, String str3, String str4, String str5, float f, int i, int i2, int i3, int i4, int i5, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("review_id", str2);
        linkedHashMap.put("author_id", str3);
        linkedHashMap.put("poi_id", str4);
        C1189060h32.LIZ(str5, linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(i));
        linkedHashMap.put("order", String.valueOf(i2));
        linkedHashMap.put("like_cnt", String.valueOf(i3));
        linkedHashMap.put("image_cnt", String.valueOf(i4));
        linkedHashMap.put("char_len", String.valueOf(i5));
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("delete_poi_review", linkedHashMap, c1185050gwZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[PHI: r1
      0x0050: PHI (r1v8 java.lang.String) = (r1v2 java.lang.String), (r1v9 java.lang.String) binds: [B:22:0x004e, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[PHI: r1
      0x0056: PHI (r1v7 java.lang.String) = (r1v2 java.lang.String), (r1v8 java.lang.String) binds: [B:22:0x004e, B:24:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad A[PHI: r1
      0x00ad: PHI (r1v10 java.lang.String) = (r1v0 java.lang.String), (r1v11 java.lang.String) binds: [B:15:0x003b, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, X.InterfaceC665370Q7z r20, java.lang.String r21, com.bytedance.android.btm.api.model.PageFinder r22) {
        /*
            r6 = r17
            r5 = r18
            r4 = r19
            r3 = r21
            X.0gwY r9 = X.C1185040gwY.LIZ
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0 = r20
            X.C1182410gsJ.LIZ(r2, r0)
            if (r10 == 0) goto L1b
            java.lang.String r0 = "enter_from"
            r2.put(r0, r10)
        L1b:
            java.lang.String r0 = "enter_method"
            r2.put(r0, r11)
            if (r12 == 0) goto L27
            java.lang.String r0 = "to_user_id"
            r2.put(r0, r12)
        L27:
            if (r13 == 0) goto L2e
            java.lang.String r0 = "review_id"
            r2.put(r0, r13)
        L2e:
            X.1D0F r8 = X.C1D0F.LIZ
            java.lang.String r7 = ""
            if (r8 == 0) goto L3a
            java.lang.String r1 = r8.LIZ()
            if (r1 != 0) goto Lad
        L3a:
            r1 = r7
            if (r8 != 0) goto Lad
            r0 = 0
        L3e:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.put(r1, r0)
            if (r8 == 0) goto L4d
            java.lang.String r1 = r8.LIZIZ()
            if (r1 != 0) goto L50
        L4d:
            r1 = r7
            if (r8 == 0) goto L56
        L50:
            java.lang.String r0 = r8.LIZJ()
            if (r0 != 0) goto L57
        L56:
            r0 = r7
        L57:
            r2.put(r1, r0)
            if (r14 != 0) goto L5d
            r14 = r7
        L5d:
            java.lang.String r0 = "log_id"
            r2.put(r0, r14)
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "source"
            r2.put(r0, r1)
            if (r6 != 0) goto L6e
            r6 = r7
        L6e:
            java.lang.String r0 = "from_group_id"
            r2.put(r0, r6)
            if (r5 != 0) goto L76
            r5 = r7
        L76:
            java.lang.String r0 = "poi_id"
            r2.put(r0, r5)
            r0 = r16
            X.C1189060h32.LIZ(r0, r2)
            if (r4 != 0) goto L83
            r4 = r7
        L83:
            java.lang.String r0 = "enter_position"
            r2.put(r0, r4)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "profile_entrance_id"
            r2.put(r0, r1)
            if (r3 != 0) goto L98
            r3 = r7
        L98:
            java.lang.String r0 = "review_tags"
            r2.put(r0, r3)
            X.0gwZ r1 = new X.0gwZ
            r0 = r22
            r1.<init>(r0)
            r9.getClass()
            java.lang.String r0 = "enter_personal_detail"
            X.C1185040gwY.LJFF(r0, r2, r1)
            return
        Lad:
            boolean r0 = r8.isConnected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1191160h6Q.LJIIZILJ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0Q7z, java.lang.String, com.bytedance.android.btm.api.model.PageFinder):void");
    }

    public static void LJ(String str, String str2, String str3, String str4, String str5, String str6, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str7, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("source", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("enter_from", str2);
        linkedHashMap.put("from_group_id", str3);
        linkedHashMap.put("author_id", str4);
        linkedHashMap.put("poi_id", str6);
        linkedHashMap.put("review_id", str5);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(num));
        linkedHashMap.put("order", String.valueOf(num2));
        linkedHashMap.put("like_cnt", String.valueOf(num3));
        linkedHashMap.put("image_cnt", String.valueOf(num4));
        linkedHashMap.put("char_len", String.valueOf(num5));
        C1189060h32.LIZ(str7, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("cannot_reply_reviews_toast_show", linkedHashMap, c1185050gwZ);
    }

    public static void LJJJ(String str, Integer num, String str2, int i, String str3, String str4, String str5, Float f, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String string;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("is_top", string);
        linkedHashMap.put("review_id", str2);
        linkedHashMap.put("source", String.valueOf(i));
        linkedHashMap.put("author_id", str3);
        linkedHashMap.put("poi_id", str4);
        C1189060h32.LIZ(str5, linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(num2));
        linkedHashMap.put("order", String.valueOf(num3));
        linkedHashMap.put("like_cnt", String.valueOf(num4));
        linkedHashMap.put("image_cnt", String.valueOf(num5));
        linkedHashMap.put("char_len", String.valueOf(num6));
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_reviews_folding_entrance_click", linkedHashMap, c1185050gwZ);
    }

    public static void LJJJI(String str, Integer num, String str2, int i, String str3, String str4, String str5, Float f, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String string;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("is_top", string);
        linkedHashMap.put("review_id", str2);
        linkedHashMap.put("source", String.valueOf(i));
        linkedHashMap.put("author_id", str3);
        linkedHashMap.put("poi_id", str4);
        C1189060h32.LIZ(str5, linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(num2));
        linkedHashMap.put("order", String.valueOf(num3));
        linkedHashMap.put("like_cnt", String.valueOf(num4));
        linkedHashMap.put("image_cnt", String.valueOf(num5));
        linkedHashMap.put("char_len", String.valueOf(num6));
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_reviews_folding_entrance_show", linkedHashMap, c1185050gwZ);
    }

    public static void LIZIZ(float f, int i, int i2, int i3, int i4, int i5, PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        String str9;
        int value;
        String str10 = str7;
        String str11 = str6;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("review_id", str2);
        linkedHashMap.put("author_id", str3);
        linkedHashMap.put("poi_id", str4);
        C1189060h32.LIZ(str5, linkedHashMap);
        LIZ.getClass();
        LIZ(linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(i));
        linkedHashMap.put("order", String.valueOf(i2));
        linkedHashMap.put("like_cnt", String.valueOf(i3));
        linkedHashMap.put("image_cnt", String.valueOf(i4));
        linkedHashMap.put("char_len", String.valueOf(i5));
        String str12 = "";
        if (str11 == null) {
            str11 = "";
        }
        linkedHashMap.put("log_id", str11);
        if (str10 == null) {
            str10 = "";
        }
        linkedHashMap.put("review_lang", str10);
        if (z) {
            str9 = "translated";
        } else {
            str9 = "original";
        }
        linkedHashMap.put("translate_status", str9);
        if (num != null) {
            value = num.intValue();
        } else {
            value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
        }
        linkedHashMap.put("source", String.valueOf(value));
        if (str8 != null) {
            str12 = str8;
        }
        linkedHashMap.put("from_group_id", str12);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("cancel_dislike_poi_review", linkedHashMap, c1185050gwZ);
    }

    public static void LJIILLIIL(float f, int i, int i2, int i3, int i4, int i5, PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        String str9;
        int value;
        String str10 = str7;
        String str11 = str6;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("review_id", str2);
        linkedHashMap.put("author_id", str3);
        linkedHashMap.put("poi_id", str4);
        C1189060h32.LIZ(str5, linkedHashMap);
        LIZ.getClass();
        LIZ(linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(i));
        linkedHashMap.put("order", String.valueOf(i2));
        linkedHashMap.put("like_cnt", String.valueOf(i3));
        linkedHashMap.put("image_cnt", String.valueOf(i4));
        linkedHashMap.put("char_len", String.valueOf(i5));
        String str12 = "";
        if (str11 == null) {
            str11 = "";
        }
        linkedHashMap.put("log_id", str11);
        if (str10 == null) {
            str10 = "";
        }
        linkedHashMap.put("review_lang", str10);
        if (z) {
            str9 = "translated";
        } else {
            str9 = "original";
        }
        linkedHashMap.put("translate_status", str9);
        if (num != null) {
            value = num.intValue();
        } else {
            value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
        }
        linkedHashMap.put("source", String.valueOf(value));
        if (str8 != null) {
            str12 = str8;
        }
        linkedHashMap.put("from_group_id", str12);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("dislike_poi_review", linkedHashMap, c1185050gwZ);
    }

    public static void LJIJJ(C1191160h6Q c1191160h6Q, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Integer num2, PoiData poiData, String str12, InterfaceC665370Q7z interfaceC665370Q7z, String str13, PageFinder pageFinder, int i) {
        String string;
        String string2;
        String str14 = str13;
        String str15 = str12;
        PoiData poiData2 = poiData;
        InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
        String str16 = str11;
        String str17 = null;
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str16 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num = null;
        }
        if ((i & 8192) != 0) {
            num2 = null;
        }
        if ((i & 16384) != 0) {
            poiData2 = null;
        }
        if ((32768 & i) != 0) {
            str15 = null;
        }
        if ((65536 & i) != 0) {
            interfaceC665370Q7z2 = null;
        }
        if ((i & 131072) != 0) {
            str14 = null;
        }
        c1191160h6Q.getClass();
        Map mapLIZ = C308370C6x.LIZ(null);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z2);
        linkedHashMap.putAll(mapLIZ);
        C1189060h32.LJ(str6, linkedHashMap);
        C1189060h32.LJJ("initial_poi_id", str, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str2, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str3, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str4, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str5, linkedHashMap);
        if (str7 != null) {
            linkedHashMap.put("enter_from", str7);
        }
        if (str8 != null) {
            linkedHashMap.put("enter_method", str8);
        }
        if (str9 != null) {
            linkedHashMap.put("poi_id", str9);
            PoiReviewFrequencyControl.LIZ.getClass();
            long jLJIIIIZZ = PoiReviewFrequencyControl.LJIIIIZZ(str9);
            int iLJIIIZ = PoiReviewFrequencyControl.LJIIIZ(str9);
            linkedHashMap.put("show_index", String.valueOf(jLJIIIIZZ));
            linkedHashMap.put("time_int", String.valueOf(iLJIIIZ));
        }
        if (str10 != null) {
            C1189060h32.LIZ(str10, linkedHashMap);
        }
        C1189060h32.LJJ("display_info", str16, linkedHashMap);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        C1189060h32.LJJ("user_show_cnt_7d", string, linkedHashMap);
        if (num2 != null) {
            string2 = num2.toString();
        } else {
            string2 = null;
        }
        C1189060h32.LJJ("user_show_cnt_1d", string2, linkedHashMap);
        linkedHashMap.put("is_enter", String.valueOf(1));
        if (poiData2 != null) {
            str17 = poiData2.logId;
        }
        C1189060h32.LJJ("poi_log_id", str17, linkedHashMap);
        C1189060h32.LJJ("from_group_id", str15, linkedHashMap);
        C1189060h32.LJJ("incentive_type", str14, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("poi_review_post_entrance_click", linkedHashMap, c1185050gwZ);
    }

    public static void LJI(String str, String str2, String str3, String str4, String str5, float f, int i, int i2, int i3, int i4, int i5, String str6, int i6, String str7, String str8, int i7, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, Integer num2, String str9, PageFinder pageFinder) {
        String string;
        String string2;
        String str10 = str8;
        String str11 = str7;
        String str12 = str6;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("media_type", "image");
        linkedHashMap.put("review_id", str2);
        linkedHashMap.put("author_id", str3);
        linkedHashMap.put("poi_id", str4);
        C1189060h32.LIZ(str5, linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(i));
        linkedHashMap.put("order", String.valueOf(i2));
        linkedHashMap.put("like_cnt", String.valueOf(i3));
        linkedHashMap.put("image_cnt", String.valueOf(i4));
        linkedHashMap.put("char_len", String.valueOf(i5));
        String str13 = "";
        if (str12 == null) {
            str12 = "";
        }
        linkedHashMap.put("log_id", str12);
        linkedHashMap.put("source", String.valueOf(i6));
        if (str11 == null) {
            str11 = "";
        }
        linkedHashMap.put("from_group_id", str11);
        if (str10 == null) {
            str10 = "";
        }
        linkedHashMap.put("enter_position", str10);
        linkedHashMap.put("is_anonymous", String.valueOf(i7));
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("is_top", string);
        if (num2 == null || (string2 = num2.toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("review_status", string2);
        if (str9 != null) {
            str13 = str9;
        }
        linkedHashMap.put("review_tags", str13);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("click_poi_review_media", linkedHashMap, c1185050gwZ);
    }

    public static void LJIJJLI(C1191160h6Q c1191160h6Q, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Integer num2, PoiData poiData, String str12, InterfaceC665370Q7z interfaceC665370Q7z, String str13, PageFinder pageFinder, C1184710gw1 c1184710gw1, int i) {
        String string;
        String string2;
        String str14;
        C1184710gw1 c1184710gw12 = c1184710gw1;
        String str15 = str13;
        String str16 = str12;
        PoiData poiData2 = poiData;
        InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
        String str17 = str11;
        if ((i & 1024) != 0) {
            str17 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num2 = null;
        }
        if ((i & 8192) != 0) {
            poiData2 = null;
        }
        if ((i & 16384) != 0) {
            str16 = null;
        }
        if ((32768 & i) != 0) {
            interfaceC665370Q7z2 = null;
        }
        if ((65536 & i) != 0) {
            str15 = null;
        }
        if ((i & 262144) != 0) {
            c1184710gw12 = null;
        }
        c1191160h6Q.getClass();
        Map mapLIZ = C308370C6x.LIZ(null);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z2);
        linkedHashMap.putAll(mapLIZ);
        C1189060h32.LJ(str6, linkedHashMap);
        C1189060h32.LJJ("initial_poi_id", str, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_from", str2, linkedHashMap);
        C1189060h32.LJJ("initial_poi_enter_method", str3, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_method", str4, linkedHashMap);
        C1189060h32.LJJ("poi_detail_enter_from", str5, linkedHashMap);
        if (str7 != null) {
            linkedHashMap.put("enter_from", str7);
        }
        linkedHashMap.put("enter_method", str8);
        if (str9 != null) {
            linkedHashMap.put("poi_id", str9);
            PoiReviewFrequencyControl.LIZ.getClass();
            PoiReviewFrequencyControl.LJIIJ(str9);
            PoiReviewFrequencyControl.LIZIZ.storeLong(PoiReviewFrequencyControl.LIZLLL("ts_poi_review_post_entrance_show_index", str9), PoiReviewFrequencyControl.LJIIIIZZ(str9) + 1);
            long jLJIIIIZZ = PoiReviewFrequencyControl.LJIIIIZZ(str9);
            int iLJIIIZ = PoiReviewFrequencyControl.LJIIIZ(str9);
            linkedHashMap.put("show_index", String.valueOf(jLJIIIIZZ));
            linkedHashMap.put("time_int", String.valueOf(iLJIIIZ));
        }
        C1189060h32.LJJ("display_info", str17, linkedHashMap);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        C1189060h32.LJJ("user_show_cnt_7d", string, linkedHashMap);
        if (num2 != null) {
            string2 = num2.toString();
        } else {
            string2 = null;
        }
        C1189060h32.LJJ("user_show_cnt_1d", string2, linkedHashMap);
        if (str10 != null) {
            C1189060h32.LIZ(str10, linkedHashMap);
        }
        if (poiData2 != null) {
            str14 = poiData2.logId;
        } else {
            str14 = null;
        }
        C1189060h32.LJJ("poi_log_id", str14, linkedHashMap);
        C1189060h32.LJJ("from_group_id", str16, linkedHashMap);
        C1189060h32.LJJ("incentive_type", str15, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJII("poi_review_post_entrance_show", linkedHashMap, c1185050gwZ, c1184710gw12);
    }

    public static void LJII(String str, String str2, String str3, String str4, String str5, float f, int i, int i2, int i3, int i4, int i5, String str6, int i6, String str7, String str8, boolean z, String str9, String str10, int i7, InterfaceC665370Q7z interfaceC665370Q7z, String str11, PageFinder pageFinder) {
        String str12;
        String str13 = str10;
        String str14 = str8;
        String str15 = str7;
        String str16 = str9;
        String str17 = str6;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("review_id", str2);
        linkedHashMap.put("author_id", str3);
        linkedHashMap.put("poi_id", str4);
        C1189060h32.LIZ(str5, linkedHashMap);
        LIZ.getClass();
        LIZ(linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(i));
        linkedHashMap.put("order", String.valueOf(i2));
        linkedHashMap.put("like_cnt", String.valueOf(i3));
        linkedHashMap.put("image_cnt", String.valueOf(i4));
        linkedHashMap.put("char_len", String.valueOf(i5));
        if (str17 == null) {
            str17 = "normal";
        }
        linkedHashMap.put("author_status", str17);
        linkedHashMap.put("source", String.valueOf(i6));
        String str18 = "";
        if (str15 == null) {
            str15 = "";
        }
        linkedHashMap.put("log_id", str15);
        if (str14 == null) {
            str14 = "";
        }
        linkedHashMap.put("review_lang", str14);
        if (z) {
            str12 = "translated";
        } else {
            str12 = "original";
        }
        linkedHashMap.put("translate_status", str12);
        if (str16 == null) {
            str16 = "";
        }
        linkedHashMap.put("from_group_id", str16);
        if (str13 == null) {
            str13 = "";
        }
        linkedHashMap.put("enter_position", str13);
        if (str11 != null) {
            str18 = str11;
        }
        linkedHashMap.put("review_tags", str18);
        linkedHashMap.put("is_anonymous", String.valueOf(i7));
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("report_review", linkedHashMap, c1185050gwZ);
    }

    public static void LJIILIIL(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z) {
        String str12;
        String string;
        String string2;
        String str13 = str10;
        String str14 = str9;
        String str15 = str8;
        String str16 = str7;
        String str17 = str6;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("review_id", str2);
        linkedHashMap.put("author_id", str3);
        linkedHashMap.put("poi_id", str4);
        C1189060h32.LIZ(str5, linkedHashMap);
        LIZ.getClass();
        LIZ(linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(i));
        linkedHashMap.put("order", String.valueOf(i2));
        linkedHashMap.put("like_cnt", String.valueOf(i3));
        linkedHashMap.put("image_cnt", String.valueOf(i4));
        linkedHashMap.put("char_len", String.valueOf(i5));
        if (str17 == null) {
            str17 = "normal";
        }
        linkedHashMap.put("author_status", str17);
        String str18 = "";
        if (str16 == null) {
            str16 = "";
        }
        linkedHashMap.put("log_id", str16);
        if (str15 == null) {
            str15 = "";
        }
        linkedHashMap.put("review_lang", str15);
        if (z) {
            str12 = "long_press";
        } else {
            str12 = "click_text";
        }
        linkedHashMap.put("enter_method", str12);
        linkedHashMap.put("source", String.valueOf(i6));
        if (str14 == null) {
            str14 = "";
        }
        linkedHashMap.put("from_group_id", str14);
        if (str13 == null) {
            str13 = "";
        }
        linkedHashMap.put("enter_position", str13);
        linkedHashMap.put("is_anonymous", String.valueOf(i7));
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("is_top", string);
        if (num2 == null || (string2 = num2.toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("review_status", string2);
        if (str11 != null) {
            str18 = str11;
        }
        linkedHashMap.put("review_tags", str18);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("see_original_review", linkedHashMap, c1185050gwZ);
    }

    public static void LJIILJJIL(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z) {
        String str12;
        String string;
        String string2;
        String str13 = str10;
        String str14 = str9;
        String str15 = str8;
        String str16 = str7;
        String str17 = str6;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("review_id", str2);
        linkedHashMap.put("author_id", str3);
        linkedHashMap.put("poi_id", str4);
        C1189060h32.LIZ(str5, linkedHashMap);
        LIZ.getClass();
        LIZ(linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(i));
        linkedHashMap.put("order", String.valueOf(i2));
        linkedHashMap.put("like_cnt", String.valueOf(i3));
        linkedHashMap.put("image_cnt", String.valueOf(i4));
        linkedHashMap.put("char_len", String.valueOf(i5));
        if (str17 == null) {
            str17 = "normal";
        }
        linkedHashMap.put("author_status", str17);
        linkedHashMap.put("source", String.valueOf(i6));
        String str18 = "";
        if (str16 == null) {
            str16 = "";
        }
        linkedHashMap.put("log_id", str16);
        if (str15 == null) {
            str15 = "";
        }
        linkedHashMap.put("review_lang", str15);
        if (z) {
            str12 = "long_press";
        } else {
            str12 = "click_text";
        }
        linkedHashMap.put("enter_method", str12);
        if (str14 == null) {
            str14 = "";
        }
        linkedHashMap.put("from_group_id", str14);
        if (str13 == null) {
            str13 = "";
        }
        linkedHashMap.put("enter_position", str13);
        linkedHashMap.put("is_anonymous", String.valueOf(i7));
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("is_top", string);
        if (num2 == null || (string2 = num2.toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("review_status", string2);
        if (str11 != null) {
            str18 = str11;
        }
        linkedHashMap.put("review_tags", str18);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("translate_review", linkedHashMap, c1185050gwZ);
    }

    public static void LJJIJIIJI(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z) {
        String str12;
        String string;
        String string2;
        String str13 = str10;
        String str14 = str9;
        String str15 = str8;
        String str16 = str7;
        String str17 = str6;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("review_id", str2);
        linkedHashMap.put("author_id", str3);
        linkedHashMap.put("poi_id", str4);
        C1189060h32.LIZ(str5, linkedHashMap);
        LIZ.getClass();
        LIZ(linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(i));
        linkedHashMap.put("order", String.valueOf(i2));
        linkedHashMap.put("like_cnt", String.valueOf(i3));
        linkedHashMap.put("image_cnt", String.valueOf(i4));
        linkedHashMap.put("char_len", String.valueOf(i5));
        if (str17 == null) {
            str17 = "normal";
        }
        linkedHashMap.put("author_status", str17);
        linkedHashMap.put("source", String.valueOf(i6));
        String str18 = "";
        if (str16 == null) {
            str16 = "";
        }
        linkedHashMap.put("log_id", str16);
        if (str15 == null) {
            str15 = "";
        }
        linkedHashMap.put("review_lang", str15);
        if (z) {
            str12 = "translated";
        } else {
            str12 = "original";
        }
        linkedHashMap.put("translate_status", str12);
        if (str14 == null) {
            str14 = "";
        }
        linkedHashMap.put("from_group_id", str14);
        if (str13 == null) {
            str13 = "";
        }
        linkedHashMap.put("enter_position", str13);
        linkedHashMap.put("is_anonymous", String.valueOf(i7));
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("is_top", string);
        if (num2 == null || (string2 = num2.toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("review_status", string2);
        if (str11 != null) {
            str18 = str11;
        }
        linkedHashMap.put("review_tags", str18);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_poi_review_item", linkedHashMap, c1185050gwZ);
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5, String str6, float f, int i, int i2, int i3, int i4, int i5, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, int i6, InterfaceC665370Q7z interfaceC665370Q7z, Integer num, Integer num2, String str13, PageFinder pageFinder) {
        String str14;
        String string;
        String string2;
        String str15 = str10;
        String str16 = str9;
        String str17 = str8;
        String str18 = str11;
        String str19 = str7;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", str2);
        linkedHashMap.put("review_id", str3);
        linkedHashMap.put("author_id", str4);
        linkedHashMap.put("poi_id", str5);
        C1189060h32.LIZ(str6, linkedHashMap);
        LIZ.getClass();
        LIZ(linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(i));
        linkedHashMap.put("order", String.valueOf(i2));
        linkedHashMap.put("like_cnt", String.valueOf(i3));
        linkedHashMap.put("image_cnt", String.valueOf(i4));
        linkedHashMap.put("char_len", String.valueOf(i5));
        String str20 = "";
        if (str19 == null) {
            str19 = "";
        }
        linkedHashMap.put("log_id", str19);
        if (str17 == null) {
            str17 = "";
        }
        linkedHashMap.put("review_lang", str17);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str14 = "translated";
        } else {
            str14 = "original";
        }
        linkedHashMap.put("translate_status", str14);
        linkedHashMap.put("source", String.valueOf(str12));
        if (str16 == null) {
            str16 = "";
        }
        linkedHashMap.put("from_group_id", str16);
        if (str15 == null) {
            str15 = "";
        }
        linkedHashMap.put("enter_position", str15);
        if (str18 == null) {
            str18 = "";
        }
        linkedHashMap.put("section", str18);
        linkedHashMap.put("is_anonymous", String.valueOf(i6));
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("is_top", string);
        if (num2 == null || (string2 = num2.toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("review_status", string2);
        if (str13 != null) {
            str20 = str13;
        }
        linkedHashMap.put("review_tags", str20);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("cancel_like_poi_review", linkedHashMap, c1185050gwZ);
    }

    public static void LJIJ(String str, String str2, String str3, String str4, String str5, String str6, float f, int i, int i2, int i3, int i4, int i5, String str7, String str8, boolean z, Integer num, String str9, String str10, String str11, int i6, InterfaceC665370Q7z interfaceC665370Q7z, Integer num2, Integer num3, String str12, PageFinder pageFinder) {
        String str13;
        String string;
        String string2;
        String str14 = str9;
        String str15 = str11;
        String str16 = str8;
        String str17 = str10;
        String str18 = str7;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", str2);
        linkedHashMap.put("review_id", str3);
        linkedHashMap.put("author_id", str4);
        linkedHashMap.put("poi_id", str5);
        C1189060h32.LIZ(str6, linkedHashMap);
        LIZ.getClass();
        LIZ(linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(i));
        linkedHashMap.put("order", String.valueOf(i2));
        linkedHashMap.put("like_cnt", String.valueOf(i3));
        linkedHashMap.put("image_cnt", String.valueOf(i4));
        linkedHashMap.put("char_len", String.valueOf(i5));
        String str19 = "";
        if (str18 == null) {
            str18 = "";
        }
        linkedHashMap.put("log_id", str18);
        if (str16 == null) {
            str16 = "";
        }
        linkedHashMap.put("review_lang", str16);
        linkedHashMap.put("source", String.valueOf(num));
        if (z) {
            str13 = "translated";
        } else {
            str13 = "original";
        }
        linkedHashMap.put("translate_status", str13);
        if (str14 == null) {
            str14 = "";
        }
        linkedHashMap.put("from_group_id", str14);
        if (str17 == null) {
            str17 = "";
        }
        linkedHashMap.put("enter_position", str17);
        if (str15 == null) {
            str15 = "";
        }
        linkedHashMap.put("section", str15);
        linkedHashMap.put("is_anonymous", String.valueOf(i6));
        if (num2 == null || (string = num2.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("is_top", string);
        if (num3 == null || (string2 = num3.toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("review_status", string2);
        if (str12 != null) {
            str19 = str12;
        }
        linkedHashMap.put("review_tags", str19);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("like_poi_review", linkedHashMap, c1185050gwZ);
    }

    public static void LJIIJ(String str, String str2, String str3, String str4, String str5, String str6, float f, int i, Integer num, int i2, int i3, int i4, String str7, int i5, String str8, String str9, boolean z, String str10, String str11, String str12, int i6, InterfaceC665370Q7z interfaceC665370Q7z, Integer num2, Integer num3, String str13, PageFinder pageFinder) {
        String str14;
        String string;
        String string2;
        String str15 = str11;
        String str16 = str9;
        String str17 = str8;
        String str18 = str10;
        String str19 = str7;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", str2);
        linkedHashMap.put("review_id", str3);
        linkedHashMap.put("author_id", str4);
        linkedHashMap.put("poi_id", str5);
        C1189060h32.LIZ(str6, linkedHashMap);
        LIZ.getClass();
        LIZ(linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(f));
        linkedHashMap.put("has_text", String.valueOf(i));
        String string3 = null;
        if (num != null) {
            string3 = num.toString();
        }
        String str20 = "";
        if (string3 == null) {
            string3 = "";
        }
        linkedHashMap.put("order", string3);
        linkedHashMap.put("like_cnt", String.valueOf(i2));
        linkedHashMap.put("image_cnt", String.valueOf(i3));
        linkedHashMap.put("char_len", String.valueOf(i4));
        if (str19 == null) {
            str19 = "normal";
        }
        linkedHashMap.put("author_status", str19);
        linkedHashMap.put("source", String.valueOf(i5));
        if (str17 == null) {
            str17 = "";
        }
        linkedHashMap.put("log_id", str17);
        if (str16 == null) {
            str16 = "";
        }
        linkedHashMap.put("review_lang", str16);
        if (z) {
            str14 = "translated";
        } else {
            str14 = "original";
        }
        linkedHashMap.put("translate_status", str14);
        if (str18 == null) {
            str18 = "";
        }
        linkedHashMap.put("from_group_id", str18);
        if (str15 == null) {
            str15 = "";
        }
        linkedHashMap.put("enter_position", str15);
        linkedHashMap.put("section", str12);
        linkedHashMap.put("is_anonymous", String.valueOf(i6));
        if (num2 == null || (string = num2.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("is_top", string);
        if (num3 == null || (string2 = num3.toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("review_status", string2);
        if (str13 != null) {
            str20 = str13;
        }
        linkedHashMap.put("review_tags", str20);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("review_click_more", linkedHashMap, c1185050gwZ);
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0hLY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200540hLY {
    public static final C1200540hLY LIZ = new C1200540hLY();

    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033 A[PHI: r8 r9
      0x0033: PHI (r8v4 java.lang.String) = (r8v1 java.lang.String), (r8v5 java.lang.String) binds: [B:49:0x006d, B:24:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:49:0x006d, B:24:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[PHI: r12
      0x0066: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String) binds: [B:43:0x0063, B:36:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0070 A[PHI: r8 r9
      0x0070: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:49:0x006d, B:26:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:49:0x006d, B:26:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0079 A[PHI: r4
      0x0079: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:54:0x0076, B:15:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0081 A[Catch: Exception -> 0x0098, TRY_LEAVE, TryCatch #0 {Exception -> 0x0098, blocks: (B:58:0x007d, B:60:0x0081), top: B:65:0x007d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1200560hLa LIZ(X.C1200050hKl r15, X.C1200780hLw r16) {
        /*
            r14 = 0
            if (r15 == 0) goto L7b
            X.0hIR r0 = r15.LLILZ
            if (r0 == 0) goto L7b
            java.lang.String r6 = r0.LIZJ
        L9:
            X.0hLa r3 = new X.0hLa
            if (r15 == 0) goto L75
            com.ss.android.ugc.aweme.poi.PoiData r0 = r15.LL
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.poi.PoiDetails r0 = r0.getPoiDetails()
            if (r0 == 0) goto L75
            java.lang.String r4 = r0.collectInfo
        L19:
            X.0hIR r0 = r15.LLILZ
            if (r0 == 0) goto L79
            java.lang.String r5 = r0.LIZIZ
        L1f:
            if (r6 == 0) goto L72
            int r0 = r6.length()
            if (r0 == 0) goto L72
            java.lang.String r7 = "search_poi"
        L29:
            if (r15 == 0) goto L6b
            java.lang.String r8 = r15.LLILLL
            X.0hIR r0 = r15.LLILZ
            if (r0 == 0) goto L6c
            java.lang.String r9 = r0.LJ
        L33:
            com.ss.android.ugc.aweme.poi.PoiData r0 = r15.LL
            if (r0 == 0) goto L70
            java.lang.String r10 = r0.poiId
        L39:
            r0 = r16
            if (r0 == 0) goto L69
            java.lang.String r11 = r0.LIZIZ
        L3f:
            if (r15 == 0) goto L62
            X.0hIR r0 = r15.LLILZ
            if (r0 == 0) goto L62
            int r0 = r0.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r12 = r0.toString()
        L4f:
            java.lang.Boolean r1 = r15.LLILZIL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L66
            java.lang.String r13 = "1"
        L5b:
            if (r15 == 0) goto Laf
            com.ss.android.ugc.aweme.poi.PoiData r0 = r15.LL
            if (r0 == 0) goto Laf
            goto L7d
        L62:
            r12 = r14
            if (r15 == 0) goto L66
            goto L4f
        L66:
            java.lang.String r13 = "0"
            goto L5b
        L69:
            r11 = r14
            goto L3f
        L6b:
            r8 = r14
        L6c:
            r9 = r14
            if (r15 == 0) goto L70
            goto L33
        L70:
            r10 = r14
            goto L39
        L72:
            java.lang.String r7 = "default_search_poi"
            goto L29
        L75:
            r4 = r14
            if (r15 == 0) goto L79
            goto L19
        L79:
            r5 = r14
            goto L1f
        L7b:
            r6 = r14
            goto L9
        L7d:
            java.lang.String r0 = r0.details     // Catch: java.lang.Exception -> L98
            if (r0 == 0) goto Laf
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L98
            r1.<init>(r0)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = "collect_info"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Exception -> L98
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L98
            r1.<init>(r0)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = "local_service_key_category"
            java.lang.String r14 = r1.optString(r0)     // Catch: java.lang.Exception -> L98
            goto Laf
        L98:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "something was wrong with parseLocalServiceKeyCategory, e="
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        Laf:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1200540hLY.LIZ(X.0hKl, X.0hLw):X.0hLa");
    }

    public static void LIZIZ(C1200050hKl c1200050hKl, C1200780hLw c1200780hLw) {
        C1200560hLa c1200560hLaLIZ = LIZ(c1200050hKl, c1200780hLw);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_cache_search", CardStruct.IStatusCode.DEFAULT);
        C1189060h32.LIZ(c1200560hLaLIZ.LIZ, linkedHashMap);
        linkedHashMap.putAll(C1200530hLX.LIZIZ(null, "search_poi_show_al"));
        C1189060h32.LJJ("search_id", c1200560hLaLIZ.LIZIZ, linkedHashMap);
        linkedHashMap.put("is_success", "1");
        String str = c1200560hLaLIZ.LIZJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("key_word", str);
        linkedHashMap.put("enter_method", c1200560hLaLIZ.LIZLLL);
        String str3 = c1200560hLaLIZ.LJ;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("log_id", str3);
        String str4 = c1200560hLaLIZ.LJFF;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("index", str4);
        String str5 = c1200560hLaLIZ.LJI;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("poi_id", str5);
        String str6 = c1200560hLaLIZ.LJII;
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("session_id", str6);
        String str7 = c1200560hLaLIZ.LJIIIIZZ;
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMap.put("page_order", str7);
        linkedHashMap.put("enter_from", "claim_poi_page");
        String str8 = c1200560hLaLIZ.LJIIIZ;
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMap.put("use_session_cache", str8);
        String str9 = c1200560hLaLIZ.LJIIJ;
        if (str9 != null) {
            str2 = str9;
        }
        linkedHashMap.put("local_service_key_category", str2);
        C20684815ws.LJIILLIIL("delete_poi", linkedHashMap);
    }
}

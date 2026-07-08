package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pYG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515940pYG {
    public static final ConcurrentHashMap<Long, ConcurrentHashMap<String, C1515950pYH>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, Boolean> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:97:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LIZ(long r17, java.util.Map r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1515940pYG.LIZ(long, java.util.Map):org.json.JSONObject");
    }

    public static C1515950pYH LIZIZ(Long l, String str) {
        ConcurrentHashMap<String, C1515950pYH> concurrentHashMap;
        if (l == null) {
            return null;
        }
        l.longValue();
        if (str == null || (concurrentHashMap = LIZ.get(l)) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.Long r10, java.lang.String r11) throws org.json.JSONException {
        /*
            if (r10 == 0) goto L9f
            r10.longValue()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Boolean> r0 = X.C1515940pYG.LIZIZ
            boolean r0 = r0.containsKey(r10)
            if (r0 == 0) goto Le
            return
        Le:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0pYH>> r0 = X.C1515940pYG.LIZ
            java.lang.Object r6 = r0.get(r10)
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            if (r6 != 0) goto L1b
            if (r11 != 0) goto L1b
            return
        L1b:
            r5 = 1
            if (r6 == 0) goto L48
            java.util.Collection r0 = r6.values()
            java.util.Iterator r9 = r0.iterator()
            r8 = 1
            r7 = 0
        L28:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r1 = r9.next()
            X.0pYH r1 = (X.C1515950pYH) r1
            boolean r0 = r1.LJIIJ
            if (r0 == 0) goto L39
            r7 = 1
        L39:
            long r3 = r1.LJIIIIZZ
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
            r8 = 0
            goto L28
        L43:
            if (r7 == 0) goto L48
            if (r8 == 0) goto L48
            goto L4a
        L48:
            if (r11 == 0) goto L9f
        L4a:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Boolean> r1 = X.C1515940pYG.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r1.putIfAbsent(r10, r0)
            if (r0 != 0) goto L9f
            long r1 = r10.longValue()
            if (r6 != 0) goto L5e
            java.util.Map r6 = X.C2097608Jq.LJ()
        L5e:
            org.json.JSONObject r3 = LIZ(r1, r6)     // Catch: java.lang.Exception -> L63
            goto L76
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r3 = "exception_msg"
            java.lang.String r0 = r0.getMessage()
            org.json.JSONObject r3 = r4.put(r3, r0)
        L76:
            java.lang.String r0 = "start_time"
            r3.put(r0, r1)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = "mall"
            r3.put(r1, r0)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "homepage_mall"
            r3.put(r1, r0)
            java.lang.String r0 = "rd_mix_page"
            r3.put(r0, r5)
            if (r11 == 0) goto L95
            java.lang.String r0 = "error_msg"
            r3.put(r0, r11)
        L95:
            java.lang.String r0 = "rd_mixmall_perf_chunk"
            X.C1018703yb.LJFF(r0, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0pYH>> r0 = X.C1515940pYG.LIZ
            r0.remove(r10)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1515940pYG.LIZJ(java.lang.Long, java.lang.String):void");
    }
}

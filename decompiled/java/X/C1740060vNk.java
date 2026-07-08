package X;

import Y.ARunnableS119S0100000_19;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.ug.datamerge.manager.CacheDataResult;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740060vNk {
    public static final C1740060vNk LIZ = new C1740060vNk();
    public static final ConcurrentHashMap<String, C1740070vNl> LIZIZ = new ConcurrentHashMap<>();
    public static PthreadTimer LIZJ;

    public static Map LIZ(CacheDataResult cacheDataResult) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ?> mapLJ = cacheDataResult.data;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        linkedHashMap.put("data", mapLJ);
        Integer num = cacheDataResult.code;
        if (num != null) {
            linkedHashMap.put("code", Integer.valueOf(num.intValue()));
        }
        Map<String, ?> mapLJ2 = cacheDataResult.header;
        if (mapLJ2 == null) {
            mapLJ2 = C2097608Jq.LJ();
        }
        linkedHashMap.put("header", mapLJ2);
        String str = cacheDataResult.aweLogId;
        String str2 = "";
        if (str == null && (str = cacheDataResult.logId) == null) {
            str = "";
        }
        linkedHashMap.put("_AME_Header_RequestID", str);
        String str3 = cacheDataResult.logId;
        if (str3 == null && (str3 = cacheDataResult.aweLogId) == null) {
            str3 = "";
        }
        linkedHashMap.put("_Header_RequestID", str3);
        String str4 = cacheDataResult.message;
        if (str4 != null) {
            str2 = str4;
        }
        linkedHashMap.put("message", str2);
        Long l = cacheDataResult.timestamp;
        if (l != null) {
            linkedHashMap.put("timestamp", Long.valueOf(l.longValue()));
        }
        linkedHashMap.put("dataFrom", "merge");
        return linkedHashMap;
    }

    public static void LIZJ(String str, Map map) {
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        String strLIZLLL = C314470CUj.LIZLLL(C2097608Jq.LJIIIIZZ(new Pair("response", map), new Pair("eventTimeStamp", Long.valueOf(System.currentTimeMillis()))));
        if (strLIZLLL == null) {
            strLIZLLL = "{}";
        }
        iEventCenter.LIZ(str, strLIZLLL);
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00f0: INVOKE 
      (r11v0 ?? I:X.0pus)
      (r12v0 ?? I:java.lang.String)
      (r13v0 ?? I:java.lang.String)
      (r14 I:java.lang.String)
      (r15 I:java.lang.String)
      (r16 I:java.lang.String)
      (r17 I:java.lang.Long)
      (r18 I:int)
     STATIC call: X.0pus.LIZ(X.0pus, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, int):void A[MD:(X.0pus, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, int):void (m)] (LINE:33554672), block:B:38:0x00df */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: Exception -> 0x00de, TryCatch #0 {Exception -> 0x00de, blocks: (B:4:0x0005, B:6:0x000b, B:7:0x000e, B:9:0x0034, B:11:0x003e, B:14:0x004d, B:24:0x0081, B:26:0x0085, B:27:0x0088, B:29:0x008c, B:30:0x0094, B:32:0x0098, B:33:0x00a5, B:19:0x0066, B:20:0x0071, B:35:0x00b5), top: B:41:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[Catch: Exception -> 0x00de, TryCatch #0 {Exception -> 0x00de, blocks: (B:4:0x0005, B:6:0x000b, B:7:0x000e, B:9:0x0034, B:11:0x003e, B:14:0x004d, B:24:0x0081, B:26:0x0085, B:27:0x0088, B:29:0x008c, B:30:0x0094, B:32:0x0098, B:33:0x00a5, B:19:0x0066, B:20:0x0071, B:35:0x00b5), top: B:41:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.String r17, X.C1739920vNW r18) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1740060vNk.LJFF(java.lang.String, X.0vNW):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r18 = r21
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0vNl> r2 = X.C1740060vNk.LIZIZ
            r0 = r19
            java.lang.Object r4 = r2.remove(r0)
            X.0vNl r4 = (X.C1740070vNl) r4
            r8 = r20
            if (r8 == 0) goto L4b
            r3 = r22
            if (r3 == 0) goto L69
            boolean r1 = kotlin.text.a0.LJJJIL(r3)
            if (r1 != 0) goto L69
            r10 = 0
            if (r4 == 0) goto L67
            java.lang.String r1 = r4.LJI
        L1f:
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r1)
            if (r1 == 0) goto L69
            if (r4 == 0) goto L69
            java.lang.Boolean r3 = r4.LIZIZ
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r1)
            if (r1 == 0) goto L69
            if (r4 == 0) goto L61
            java.lang.Boolean r11 = r4.LIZIZ
            X.0qEH r12 = r4.LIZJ
            java.lang.String r13 = r4.LIZLLL
            java.lang.Long r15 = r4.LJFF
            java.lang.String r1 = r4.LJI
        L3d:
            X.0vNl r3 = new X.0vNl
            r17 = 1
            r9 = r3
            r14 = r8
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
        L48:
            r2.put(r0, r3)
        L4b:
            X.0pus r14 = X.C1529960pus.LIZ
            if (r18 != 0) goto L51
            java.lang.String r18 = "unknown"
        L51:
            java.lang.String r15 = "clear_data"
            java.lang.String r16 = "success"
            r19 = 0
            r21 = 48
            r20 = r19
            r17 = r0
            X.C1529960pus.LIZ(r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L61:
            r11 = r10
            r12 = r10
            r13 = r10
            r15 = r10
            r1 = r10
            goto L3d
        L67:
            r1 = r10
            goto L1f
        L69:
            X.0vNl r3 = new X.0vNl
            r4 = 0
            r11 = 111(0x6f, float:1.56E-43)
            r5 = r4
            r6 = r4
            r7 = r4
            r9 = r4
            r10 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1740060vNk.LIZLLL(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2 A[Catch: Exception -> 0x0144, TryCatch #1 {Exception -> 0x0144, blocks: (B:3:0x0002, B:5:0x0008, B:15:0x0049, B:17:0x004f, B:19:0x005a, B:20:0x005c, B:22:0x0062, B:24:0x006a, B:26:0x0074, B:31:0x0086, B:40:0x00b7, B:42:0x00bb, B:43:0x00be, B:45:0x00c2, B:46:0x00ca, B:48:0x00ce, B:49:0x00db, B:53:0x00e4, B:59:0x011b, B:36:0x009f, B:37:0x00aa, B:54:0x00ef, B:58:0x010f, B:61:0x0125, B:65:0x012e, B:8:0x0017, B:12:0x0023, B:6:0x000b), top: B:75:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce A[Catch: Exception -> 0x0144, TryCatch #1 {Exception -> 0x0144, blocks: (B:3:0x0002, B:5:0x0008, B:15:0x0049, B:17:0x004f, B:19:0x005a, B:20:0x005c, B:22:0x0062, B:24:0x006a, B:26:0x0074, B:31:0x0086, B:40:0x00b7, B:42:0x00bb, B:43:0x00be, B:45:0x00c2, B:46:0x00ca, B:48:0x00ce, B:49:0x00db, B:53:0x00e4, B:59:0x011b, B:36:0x009f, B:37:0x00aa, B:54:0x00ef, B:58:0x010f, B:61:0x0125, B:65:0x012e, B:8:0x0017, B:12:0x0023, B:6:0x000b), top: B:75:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LJ(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1740060vNk.LJ(java.lang.String, java.lang.String, java.lang.String, java.lang.String):kotlin.Pair");
    }

    public static Map LIZIZ(final String str, final InterfaceC1541990qEH interfaceC1541990qEH, String str2, Long l, String str3) {
        String str4;
        long jLongValue;
        Long lValueOf;
        ConcurrentHashMap<String, C1740070vNl> concurrentHashMap = LIZIZ;
        C1740070vNl c1740070vNl = concurrentHashMap.get(str);
        if (c1740070vNl != null && c1740070vNl.LIZ != null) {
            C1740070vNl c1740070vNlRemove = concurrentHashMap.remove(str);
            if (c1740070vNlRemove == null) {
                return null;
            }
            Long l2 = c1740070vNlRemove.LJFF;
            if (l2 != null) {
                lValueOf = Long.valueOf(System.currentTimeMillis() - l2.longValue());
            } else {
                lValueOf = null;
            }
            C1529960pus.LIZ(C1529960pus.LIZ, "get_data", "success", str, null, null, lValueOf, 24);
            CacheDataResult cacheDataResult = c1740070vNlRemove.LIZ;
            if (cacheDataResult == null) {
                return null;
            }
            LIZ.getClass();
            return LIZ(cacheDataResult);
        }
        C1740070vNl c1740070vNl2 = concurrentHashMap.get(str);
        if (c1740070vNl2 != null) {
            str4 = c1740070vNl2.LJ;
        } else {
            str4 = null;
        }
        concurrentHashMap.put(str, new C1740070vNl(null, Boolean.TRUE, interfaceC1541990qEH, str2, str4, Long.valueOf(System.currentTimeMillis()), str3, 1));
        PthreadTimer pthreadTimer = LIZJ;
        if (pthreadTimer != null) {
            C0W9W c0w9w = new C0W9W() { // from class: X.0pup
                public final void LIZ() {
                    C1740060vNk.LIZIZ.remove(str);
                    InterfaceC1541990qEH interfaceC1541990qEH2 = interfaceC1541990qEH;
                    Thread threadU3 = C786410Ut5.u3();
                    BPEAHandler bPEAHandler = C1529940puq.LIZ;
                    if (!Intrinsics.LJFF(threadU3, bPEAHandler.getLooper().getThread())) {
                        C786410Ut5.LJL(bPEAHandler, new ARunnableS119S0100000_19(interfaceC1541990qEH2, 193));
                    } else if (interfaceC1541990qEH2 != null) {
                        interfaceC1541990qEH2.updateData(C2097608Jq.LJIIJ(new Pair("dataFrom", "merge"), new Pair("data", C2097608Jq.LJ())));
                    }
                    C1529960pus.LIZ(C1529960pus.LIZ, "get_data", "timeout", str, null, null, null, 56);
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("PrefetchDataMergeManager@153f.getCachedData$1");
                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                    try {
                        LIZ();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("PrefetchDataMergeManager@153f.getCachedData$1");
                }
            };
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 15000;
            }
            pthreadTimer.schedule(c0w9w, jLongValue);
        }
        C1529960pus.LIZ(C1529960pus.LIZ, "get_data", "waiting", str, null, null, null, 56);
        return null;
    }
}

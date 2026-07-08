package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.network.EcommerceBystander;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0p0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495280p0w {
    public static final C1495280p0w LIZ = new C1495280p0w();

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZLLL(java.lang.String r6) {
        /*
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "source_stream"
            org.json.JSONObject r4 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L3b
            java.lang.String r0 = "duration"
            java.lang.Number r0 = X.C1336330ksZ.LIZJ(r0, r4)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L2a
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L3e
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "ttnet_decompress_time"
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L3e
        L2a:
            java.lang.String r0 = "raw_bytes"
            java.lang.Number r1 = X.C1336330ksZ.LIZJ(r0, r4)     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L3b
            java.lang.String r0 = "ttnet_decompress_byte"
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L3e
        L37:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L3e
            goto L3d
        L3b:
            r1 = 0
            goto L37
        L3d:
            return r5
        L3e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1495280p0w.LIZLLL(java.lang.String):java.util.Map");
    }

    public static int LJI(String str) {
        Object c098200Yq;
        int iIntValue;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"="}, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
        }
        if (arrayList.size() == 2) {
            try {
                c098200Yq = Integer.valueOf(CastIntegerProtector.parseInt((String) arrayList.get(1)));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            if (num != null && (iIntValue = num.intValue()) >= 0) {
                return iIntValue;
            }
            return -1;
        }
        return -1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x008a. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d A[Catch: all -> 0x0154, TryCatch #0 {all -> 0x0154, blocks: (B:13:0x004b, B:14:0x0062, B:16:0x0068, B:17:0x007a, B:18:0x008a, B:19:0x008d, B:21:0x0093, B:22:0x00b3, B:23:0x00b5, B:24:0x00b9, B:26:0x00c1, B:27:0x00d6, B:29:0x00de, B:30:0x00f3, B:35:0x011b, B:38:0x0122, B:41:0x0128, B:34:0x0110, B:42:0x0136, B:44:0x013e, B:32:0x00fb), top: B:48:0x004b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[Catch: all -> 0x0154, TryCatch #0 {all -> 0x0154, blocks: (B:13:0x004b, B:14:0x0062, B:16:0x0068, B:17:0x007a, B:18:0x008a, B:19:0x008d, B:21:0x0093, B:22:0x00b3, B:23:0x00b5, B:24:0x00b9, B:26:0x00c1, B:27:0x00d6, B:29:0x00de, B:30:0x00f3, B:35:0x011b, B:38:0x0122, B:41:0x0128, B:34:0x0110, B:42:0x0136, B:44:0x013e, B:32:0x00fb), top: B:48:0x004b, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(java.lang.String r8, java.util.Map r9) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1495280p0w.LJ(java.lang.String, java.util.Map):void");
    }

    public static void LJFF(String str, Map map) {
        if (str.length() == 0) {
            return;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            try {
                List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it3.next(), new String[]{"="}, 0, 6);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL2, 10));
                Iterator it4 = listLJJLIIIJILLIZJL2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(a0.LJLIIIL((String) it4.next()).toString());
                }
                if (arrayList2.size() == 2) {
                    map.put((String) arrayList2.get(0), (String) arrayList2.get(1));
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.util.Map r10, X.C1494570ozn r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1495280p0w.LIZ(java.util.Map, X.0ozn, boolean):void");
    }

    public static Map LIZIZ(Object obj, List list, Long l, Long l2, boolean z) {
        C1494850p0F c1494850p0F;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            try {
                EcommerceBystander.LIZ.getClass();
                linkedHashMap.putAll(EcommerceBystander.LJIILLIIL("ttnet_", list));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return linkedHashMap;
            }
        }
        Unit unit = null;
        if (obj instanceof C1494850p0F) {
            c1494850p0F = (C1494850p0F) obj;
        } else {
            c1494850p0F = null;
        }
        if (c1494850p0F != null) {
            linkedHashMap.put("ttnet_total_time", Long.valueOf(c1494850p0F.LJIILLIIL));
            linkedHashMap.put("ttnet_receive_byte", Long.valueOf(c1494850p0F.LJIJJ));
            long j = c1494850p0F.LJIIJ;
            if (j >= 0) {
                linkedHashMap.put("ttnet_dns_time", Long.valueOf(j));
            }
            long j2 = c1494850p0F.LJIIL;
            if (j2 > 0) {
                linkedHashMap.put("ttnet_ssl_time", Long.valueOf(j2));
            }
            long j3 = c1494850p0F.LJIIJJI;
            if (j3 >= 0) {
                linkedHashMap.put("ttnet_connect_time", Long.valueOf(j3));
            }
            linkedHashMap.put("ttnet_receive_time", Long.valueOf(c1494850p0F.LJIILL));
            linkedHashMap.put("ttnet_send_time", Long.valueOf(c1494850p0F.LJIILIIL));
            linkedHashMap.put("ttnet_ttfb_time", Long.valueOf(c1494850p0F.LJIILJJIL));
            linkedHashMap.put("ttnet_socket_reused", Integer.valueOf(c1494850p0F.LJJI ? 1 : 0));
            C1494570ozn c1494570ozn = c1494850p0F.LIZLLL;
            if (c1494570ozn != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.uptimeMillis();
                long j4 = c1494570ozn.LJJIJIIJIL + jCurrentTimeMillis;
                long j5 = c1494570ozn.LJJIJIL + jCurrentTimeMillis;
                linkedHashMap.put("ttnet_start_time", Long.valueOf(j4));
                linkedHashMap.put("ttnet_end_time", Long.valueOf(j5));
                if (l != null && l2 != null) {
                    linkedHashMap.put("native_request_preparation_duration", Long.valueOf(j4 - l.longValue()));
                    linkedHashMap.put("native_response_processing_duration", Long.valueOf(l2.longValue() - j5));
                }
                LIZ.getClass();
                LIZ(linkedHashMap, c1494570ozn, z);
                linkedHashMap.putAll(LIZLLL(c1494850p0F.LJJIIJ));
                unit = Unit.LIZ;
            }
        }
        C189200o6.m2constructorimpl(unit);
        return linkedHashMap;
    }
}

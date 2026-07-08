package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09Uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2381909Uz {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair<java.lang.Integer, java.lang.String> LIZ(org.json.JSONObject r4) {
        /*
            java.lang.String r1 = "code"
            boolean r0 = r4.has(r1)
            r3 = -1
            if (r0 == 0) goto L1b
            int r3 = r4.optInt(r1, r3)
        Ld:
            if (r3 != 0) goto L28
            java.lang.String r2 = "success"
        L11:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.<init>(r0, r2)
            return r1
        L1b:
            java.lang.String r1 = "status_code"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L28
            int r3 = r4.optInt(r1, r3)
            goto Ld
        L28:
            java.lang.String r1 = "message"
            boolean r0 = r4.has(r1)
            java.lang.String r2 = "unknown"
            if (r0 == 0) goto L37
            java.lang.String r2 = r4.optString(r1, r2)
            goto L11
        L37:
            java.lang.String r1 = "msg"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L44
            java.lang.String r2 = r4.optString(r1, r2)
            goto L11
        L44:
            java.lang.String r1 = "status_msg"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L11
            java.lang.String r2 = r4.optString(r1, r2)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2381909Uz.LIZ(org.json.JSONObject):kotlin.Pair");
    }

    public static final String LIZIZ(C0X52<?> c0x52) {
        List<C080U> listLIZIZ;
        try {
            C2175508fh c2175508fh = c0x52.LIZ;
            if (c2175508fh != null) {
                listLIZIZ = c2175508fh.LIZIZ("X-Tt-Logid");
            } else {
                listLIZIZ = null;
            }
            if (listLIZIZ != null && listLIZIZ.size() > 0) {
                String str = listLIZIZ.get(0).LIZIZ;
                if (str != null) {
                    return str;
                }
            }
            return "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(java.lang.String r14, java.util.Map r15, X.InterfaceC1364105Vn r16, kotlin.jvm.functions.Function1 r17) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2381909Uz.LIZJ(java.lang.String, java.util.Map, X.05Vn, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static void LIZLLL(String str, int i, String str2, C0X52 c0x52, C1494690ozz c1494690ozz, Map map, int i2) {
        Object c098200Yq;
        Map map2 = map;
        C1494690ozz c1494690ozz2 = c1494690ozz;
        C0X52 c0x522 = c0x52;
        if ((i2 & 8) != 0) {
            c0x522 = null;
        }
        if ((i2 & 16) != 0) {
            c1494690ozz2 = null;
        }
        if ((i2 & 32) != 0) {
            map2 = null;
        }
        C2380309Uj c2380309Uj = new C2380309Uj(i, c1494690ozz2, c0x522, str2, str, map2);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LOG_API_ASYNC before async: ");
        sbLIZ.append(C786410Ut5.u3().getName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        if (map2 != null && Intrinsics.LJFF(map2.get("log_api_async"), Boolean.TRUE)) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C473701st(c2380309Uj, null), 3);
            return;
        }
        try {
            c2380309Uj.invoke();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m1boximpl(c098200Yq);
    }
}

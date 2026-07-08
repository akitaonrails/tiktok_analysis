package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725880v0s {
    public final Map<String, C1725970v11> LIZ = new LinkedHashMap();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 15));
    public final C1725860v0q LIZJ = new C1725860v0q();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZJ(android.net.Uri r23) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725880v0s.LIZJ(android.net.Uri):java.lang.String");
    }

    public final synchronized String LIZIZ(String str, String str2) {
        Map.Entry<C1556200qbC, C1725960v10> next;
        C1725960v10 value;
        C1725970v11 c1725970v11 = (C1725970v11) ((LinkedHashMap) this.LIZ).get(str);
        String str3 = null;
        if (c1725970v11 == null) {
            return null;
        }
        Iterator<Map.Entry<C1556200qbC, C1725960v10>> it2 = c1725970v11.LIZLLL.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (!Intrinsics.LJFF(next.getKey().LIZ, str2)) {
                    next = null;
                }
                if (next != null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next != null && (value = next.getValue()) != null) {
            str3 = value.LIZJ;
        }
        return str3;
    }

    public final synchronized C1725990v13 LIZ(String str, String str2, boolean z) {
        C09AE c09ae;
        C1725970v11 c1725970v11 = (C1725970v11) ((LinkedHashMap) this.LIZ).get(str);
        if (c1725970v11 == null) {
            return new C1725990v13(EnumC1725940v0y.NONE, null, null);
        }
        for (Map.Entry<C1556200qbC, C1725960v10> entry : c1725970v11.LIZLLL.entrySet()) {
            if (Intrinsics.LJFF(entry.getKey().LIZIZ, str2)) {
                C1725960v10 value = entry.getValue();
                EnumC1725940v0y enumC1725940v0y = value.LIZ;
                EnumC1725940v0y enumC1725940v0y2 = EnumC1725940v0y.PENDING;
                if (enumC1725940v0y == enumC1725940v0y2 && (c09ae = value.LIZLLL) != null) {
                    if (z) {
                        return new C1725990v13(enumC1725940v0y2, null, null);
                    }
                    c09ae.LIZIZ(null);
                }
                c1725970v11.LIZLLL.remove(entry.getKey());
                if (c1725970v11.LIZLLL.isEmpty()) {
                    this.LIZ.remove(str);
                }
                return new C1725990v13(value.LIZ, value.LIZIZ, value.LIZJ);
            }
        }
        return new C1725990v13(EnumC1725940v0y.NONE, null, null);
    }

    public final synchronized void LJ(EnumC1548140qOC enumC1548140qOC, String str, C1556200qbC c1556200qbC) {
        C1725970v11 c1725970v11 = (C1725970v11) ((LinkedHashMap) this.LIZ).get(str);
        if (c1725970v11 != null) {
            Map<C1556200qbC, C1725960v10> map = c1725970v11.LIZLLL;
            EnumC1725940v0y enumC1725940v0y = EnumC1725940v0y.FAIL;
            enumC1548140qOC.getMessage();
            map.put(c1556200qbC, new C1725960v10(enumC1725940v0y, null, null, null, 22));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    /* JADX WARN: Type inference failed for: r0v64, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v10, types: [T, java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0uul] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(final java.lang.String r22, final android.net.Uri r23, java.lang.String r24, java.lang.String r25, com.ss.android.ugc.aweme.pipo.hybrid.prefetch.PipoPrefetchApi r26, java.lang.String r27) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725880v0s.LIZLLL(java.lang.String, android.net.Uri, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.pipo.hybrid.prefetch.PipoPrefetchApi, java.lang.String):void");
    }
}

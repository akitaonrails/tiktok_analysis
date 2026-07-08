package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QVZ {
    public static final C0QVZ LIZ = new C0QVZ();

    public static String LIZJ(C669560QOc c669560QOc) {
        Object c098200Yq;
        String str;
        Object obj = null;
        if (c669560QOc != null && (str = c669560QOc.trafficDiversionInfo) != null) {
            if (!C123100dR.LIZ(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String strLIZIZ = C848530XQl.LIZIZ(C848530XQl.LIZ, null, "{}");
        if (strLIZIZ != null) {
            try {
                c098200Yq = new JSONObject(strLIZIZ).optString("traffic_diversion_info");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            String str2 = (String) obj;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C671380QVc LIZ(X.C0QER r15, com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew r16, boolean r17, java.util.Map r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QVZ.LIZ(X.0QER, com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew, boolean, java.util.Map, java.lang.String):X.0QVc");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(boolean r3, boolean r4, boolean r5, java.lang.String r6, com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew r7) {
        /*
            java.lang.String r2 = ""
            if (r3 == 0) goto L5
            return r2
        L5:
            r1 = 0
            if (r5 == 0) goto Ld
            if (r4 == 0) goto L19
            if (r7 == 0) goto L1d
            goto Lf
        Ld:
            r6 = r2
            goto L19
        Lf:
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r7.y3()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1d
            java.lang.String r6 = r0.getEnterMethod()     // Catch: java.lang.Throwable -> L1f
        L19:
            X.C189200o6.m2constructorimpl(r6)     // Catch: java.lang.Throwable -> L1f
            goto L2b
        L1d:
            r6 = r1
            goto L19
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r6 = new X.00Yq
            r6.<init>(r0)
            X.C189200o6.m2constructorimpl(r6)
        L2b:
            boolean r0 = X.C189200o6.m7isFailureimpl(r6)
            if (r0 != 0) goto L32
            r1 = r6
        L32:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L37
            return r1
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QVZ.LIZIZ(boolean, boolean, boolean, java.lang.String, com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew):java.lang.String");
    }
}

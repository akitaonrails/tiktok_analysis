package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0S4Q, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S4Q {
    public static Map LIZIZ() {
        ArrayList arrayList = new ArrayList(C0S4S.getEntries());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (Map.Entry entry : ((LinkedHashMap) LIZ(arrayList)).entrySet()) {
                C0S4S c0s4s = (C0S4S) entry.getKey();
                String str = (String) entry.getValue();
                String key = c0s4s.getKey();
                if (!(str == null || str.length() == 0)) {
                    linkedHashMap.put(key, str);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(java.util.List r8) {
        /*
            X.0mCc r4 = X.C1906580ziK.LJ()
            r7 = 0
            if (r4 == 0) goto L81
            android.app.Activity r0 = r4.LIZIZ()
            if (r0 == 0) goto L81
            android.app.Activity r1 = X.C06MM.LIZ(r0)
        L11:
            boolean r0 = r1 instanceof X.C19EG
            if (r0 == 0) goto L7f
            X.19EG r1 = (X.C19EG) r1
            if (r1 == 0) goto L7f
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C0S4U.LIZJ(r1)
            if (r0 == 0) goto L7f
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r6 = X.C0DMM.LIZ(r0)
        L23:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r5 = r8.iterator()
        L2c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r2 = r5.next()
            X.0S4S r2 = (X.C0S4S) r2
            int[] r1 = X.C0S4R.LIZ
            int r0 = r2.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L6e
            r0 = 2
            if (r1 == r0) goto L67
            r0 = 3
            if (r1 == r0) goto L60
            r0 = 4
            if (r1 != r0) goto L83
            if (r4 == 0) goto L7d
            com.bytedance.scene.Scene r0 = r4.LJII()
            if (r0 == 0) goto L7d
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L5c:
            r3.put(r2, r0)
            goto L2c
        L60:
            if (r6 == 0) goto L7d
            java.lang.String r0 = r6.Zj2()
            goto L5c
        L67:
            if (r6 == 0) goto L7d
            java.lang.String r0 = r6.Ct0()
            goto L5c
        L6e:
            if (r4 == 0) goto L7d
            java.lang.Object r0 = r4.LIZ
            if (r0 == 0) goto L7d
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            goto L5c
        L7d:
            r0 = r7
            goto L5c
        L7f:
            r6 = r7
            goto L23
        L81:
            r1 = r7
            goto L11
        L83:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L89:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0S4Q.LIZ(java.util.List):java.util.Map");
    }

    public static void LIZJ(JSONObject jSONObject) {
        try {
            for (Map.Entry entry : ((LinkedHashMap) LIZ(new ArrayList(C0S4S.getEntries()))).entrySet()) {
                C0S4S c0s4s = (C0S4S) entry.getKey();
                String str = (String) entry.getValue();
                String key = c0s4s.getKey();
                if (str != null && str.length() != 0) {
                    jSONObject.put(key, str);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

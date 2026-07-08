package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0dTF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051550dTF {
    public static boolean LIZIZ(String str) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) C1024630clp.LLILLL;
        Boolean bool = (Boolean) linkedHashMap.get(str);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean bool2 = (Boolean) linkedHashMap.get(C1529860pui.LIZ(str));
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        if (!zBooleanValue && !zBooleanValue2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[PHI: r1
      0x0092: PHI (r1v5 boolean) = (r1v4 boolean), (r1v7 boolean) binds: [B:34:0x008f, B:25:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(X.InterfaceC1541990qEH r4, boolean r5, boolean r6) {
        /*
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "handle block back press by spark:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", by bullet:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            r2 = 0
            if (r4 == 0) goto L94
            X.0q70 r1 = r4.getHybridContext()
        L1f:
            boolean r0 = r1 instanceof com.bytedance.hybrid.spark.SparkContext
            if (r0 != 0) goto L24
            r1 = r2
        L24:
            java.lang.String r0 = "SparkActivity"
            X.C1530030puz.LIZIZ(r0, r3, r1)
            java.lang.String r2 = "containerID"
            if (r5 == 0) goto L46
            if (r4 == 0) goto L46
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            X.0q70 r0 = r4.getHybridContext()
            java.lang.String r0 = r0.containerId
            r1.put(r2, r0)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r0 = "sparkOnBackPressAction"
            r4.X0(r0, r1)
        L46:
            if (r6 == 0) goto L61
            if (r4 == 0) goto L61
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            X.0q70 r0 = r4.getHybridContext()
            java.lang.String r0 = r0.containerId
            r1.put(r2, r0)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r0 = "bulletOnBackPressAction"
            r4.X0(r0, r1)
        L61:
            r2 = 0
            if (r4 == 0) goto L8e
            android.view.View r0 = r4.e1()
            if (r0 == 0) goto L8e
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L8e
            boolean r0 = r1 instanceof X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB
            if (r0 == 0) goto L8e
            X.0qEB r1 = (X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) r1
            boolean r1 = r1.LIZIZ()
        L7a:
            boolean r0 = r4 instanceof X.C1537720q7O
            if (r0 == 0) goto L92
            X.0q7O r4 = (X.C1537720q7O) r4
            boolean r0 = r4.LIZIZ()
        L84:
            if (r5 != 0) goto L8c
            if (r6 == 0) goto L8d
            if (r1 != 0) goto L8c
            if (r0 == 0) goto L8d
        L8c:
            r2 = 1
        L8d:
            return r2
        L8e:
            r1 = 0
            if (r4 == 0) goto L92
            goto L7a
        L92:
            r0 = 0
            goto L84
        L94:
            r1 = r2
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1051550dTF.LIZ(X.0qEH, boolean, boolean):boolean");
    }
}

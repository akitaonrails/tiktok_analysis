package X;

import android.util.Log;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07oB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1973307oB {
    public static final C1973307oB LIZ = new C1973307oB();
    public static final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS189S0000000_3.get$arr$(821));

    public static final Map<String, String> LIZ() {
        LIZ.getClass();
        return C2097608Jq.LJII(new Pair("enter_from_merge", LIZIZ("getEnterFromMerge")), new Pair("enter_method", LIZIZ("getEnterMethod")), new Pair("request_id", LIZIZ("getRequestId")), new Pair("video_id", LIZIZ("getVideoId")));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r9) {
        /*
            X.01GW r0 = X.C1973307oB.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r4 = ""
            if (r0 != 0) goto Ld
            return r4
        Ld:
            java.lang.reflect.Method[] r8 = r0.getMethods()     // Catch: java.lang.Throwable -> L59
            int r7 = r8.length     // Catch: java.lang.Throwable -> L59
            r6 = 0
            r2 = 0
        L14:
            r3 = 0
            if (r2 >= r7) goto L38
            r5 = r8[r2]     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> L59
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L2e
            java.lang.Class[] r0 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L59
            int r0 = r0.length     // Catch: java.lang.Throwable -> L59
            r1 = 1
            if (r0 != 0) goto L2c
            goto L30
        L2c:
            r0 = 0
            goto L31
        L2e:
            r1 = 0
            goto L33
        L30:
            r0 = 1
        L31:
            if (r0 == 0) goto L2e
        L33:
            if (r1 != 0) goto L39
            int r2 = r2 + 1
            goto L14
        L38:
            r5 = r3
        L39:
            if (r5 == 0) goto L3c
            goto L3e
        L3c:
            r1 = r3
            goto L4b
        L3e:
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L59
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0+UwS1ZghKfCnoR3cvZQp8JOwP8="
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = X.C2204961BRm.a0(r5, r3, r2, r1)     // Catch: java.lang.Throwable -> L59
        L4b:
            boolean r0 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L52
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L59
        L52:
            if (r3 != 0) goto L55
            r3 = r4
        L55:
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L59
            goto L65
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L65:
            boolean r0 = X.C189200o6.m7isFailureimpl(r3)
            if (r0 != 0) goto L6c
            r4 = r3
        L6c:
            java.lang.String r4 = (java.lang.String) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1973307oB.LIZIZ(java.lang.String):java.lang.String");
    }

    public static void LIZJ(int i, String str, String str2, Throwable th, Map map) {
        if (a0.LJJJIL(str)) {
            str = "PGCSubsLog";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        if (!map.isEmpty()) {
            sb.append(" | params=");
            LIZ.getClass();
            sb.append(C13LP.LJJLIIIJ(map.entrySet(), null, "{", "}", 0, null, AnonymousClass0207.get$arr$(72), 25));
        }
        String string = sb.toString();
        if (i != 3 && i != 4 && i != 5 && i != 6) {
            if (th != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append('\n');
                sbLIZ.append(Log.getStackTraceString(th));
                string = C2188811AlT.LIZIZ(sbLIZ);
            }
            Log.println(i, str, string);
        }
    }
}

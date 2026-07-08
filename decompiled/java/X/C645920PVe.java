package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645920PVe {
    public static boolean LIZJ(View view, String str) {
        String strKz0 = null;
        if (view != null) {
            try {
                FirstScreenHelperAbility firstScreenHelperAbility = (FirstScreenHelperAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), FirstScreenHelperAbility.class, null);
                if (firstScreenHelperAbility != null) {
                    strKz0 = firstScreenHelperAbility.Kz0(str, null);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return Intrinsics.LJFF(strKz0, "1");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(android.view.View r3, java.lang.String r4, java.lang.String r5, java.util.Map r6) {
        /*
            if (r3 == 0) goto L17
            r2 = 0
            X.0Q7z r1 = X.C1558360qeg.LJ(r3, r2)     // Catch: java.lang.Throwable -> L25
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility> r0 = com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)     // Catch: java.lang.Throwable -> L25
            com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility r0 = (com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility) r0     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L17
            java.lang.String r1 = r0.Kz0(r4, r5)     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L19
        L17:
            java.lang.String r1 = "0"
        L19:
            java.lang.String r0 = "is_first_screen"
            java.lang.Object r0 = r6.put(r0, r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L25
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645920PVe.LIZ(android.view.View, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.AbstractC1386130mAt<?> r3, android.view.View r4, java.lang.String r5, java.lang.String r6) {
        /*
            if (r4 == 0) goto L18
            r2 = 0
            X.0Q7z r1 = X.C1558360qeg.LJ(r4, r2)     // Catch: java.lang.Exception -> L20
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility> r0 = com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)     // Catch: java.lang.Exception -> L20
            com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility r0 = (com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility) r0     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.Kz0(r5, r6)     // Catch: java.lang.Exception -> L20
            if (r1 == 0) goto L18
            goto L1a
        L18:
            java.lang.String r1 = "0"
        L1a:
            java.lang.String r0 = "is_first_screen"
            r3.LJ(r0, r1)     // Catch: java.lang.Exception -> L20
            return
        L20:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645920PVe.LIZIZ(X.0mAt, android.view.View, java.lang.String, java.lang.String):void");
    }
}

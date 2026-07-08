package X;

import Y.AComparatorS22S0000000_3;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09HJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09HJ {
    public static ArrayList LIZIZ() {
        Object c098200Yq;
        C675950QfJ.LIZ.getClass();
        boolean z = false;
        String[] stringArray = C675950QfJ.LIZ().getStringArray("photo_search_history_record", new String[0]);
        if (stringArray != null) {
            if (!(stringArray.length == 0)) {
                z = true;
            }
        }
        if (!z) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        C089E c089e = new C089E(stringArray);
        while (c089e.hasNext()) {
            try {
                c098200Yq = Boolean.valueOf(arrayList.add((C09HE) C19748512Ol.LIZIZ.LJII((String) c089e.next(), C09HE.class)));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
        }
        return new ArrayList(C13LP.LJLLLL(new AComparatorS22S0000000_3(46), arrayList));
    }

    public static boolean LIZ(String str) {
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str2 = File.separator;
            sbLIZ.append(str2);
            sbLIZ.append("photo_search");
            sbLIZ.append(str2);
            if (a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ), true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:3:0x0005, B:5:0x000e, B:7:0x0023, B:10:0x004c, B:9:0x0040, B:11:0x004f), top: B:16:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.util.ArrayList r8) {
        /*
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r0 = r8.size()     // Catch: java.lang.Throwable -> L55
            r6 = -1
            int r5 = r0 + (-1)
        Lc:
            if (r6 >= r5) goto L4f
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L55
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "ec_photo_search_history_count"
            r0.getClass()     // Catch: java.lang.Throwable -> L55
            r0 = 60
            int r0 = com.bytedance.ies.abmock.SettingsManager.LJ(r1, r0)     // Catch: java.lang.Throwable -> L55
            if (r2 > r0) goto L40
            X.09HJ r1 = X.C09HI.LIZ     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = r8.get(r5)     // Catch: java.lang.Throwable -> L55
            X.09HE r0 = (X.C09HE) r0     // Catch: java.lang.Throwable -> L55
            r1.getClass()     // Catch: java.lang.Throwable -> L55
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L55
            long r0 = r0.getTimeStamp()     // Catch: java.lang.Throwable -> L55
            long r3 = r3 - r0
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4c
        L40:
            java.lang.Object r0 = r8.get(r5)     // Catch: java.lang.Throwable -> L55
            X.09HE r0 = (X.C09HE) r0     // Catch: java.lang.Throwable -> L55
            r8.remove(r0)     // Catch: java.lang.Throwable -> L55
            r7.add(r0)     // Catch: java.lang.Throwable -> L55
        L4c:
            int r5 = r5 + (-1)
            goto Lc
        L4f:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L55
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L55
            return
        L55:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09HJ.LIZJ(java.util.ArrayList):void");
    }
}

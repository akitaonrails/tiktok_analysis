package X;

import android.text.TextUtils;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0V1N, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V1N {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LockInfo{timestamp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rawAtrace='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", topActivityName='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", blockStackInfo='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", completeBlockStackInfo='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", ownerStackInfo='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", ownerThreadName='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:13:0x0031, B:18:0x0043, B:20:0x0047, B:21:0x0049, B:23:0x0051, B:24:0x0054, B:26:0x0056, B:17:0x0040), top: B:43:0x0031, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0V1N LIZ(java.lang.String r10) {
        /*
            r2 = 0
            if (r10 == 0) goto L88
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L88
            java.lang.String r0 = "&#&"
            java.lang.String[] r3 = r10.split(r0)
            int r1 = r3.length
            r0 = 3
            if (r1 == r0) goto L14
            return r2
        L14:
            r0 = 0
            r0 = r3[r0]
            long r6 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            r0 = 1
            r0 = r3[r0]
            long r8 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            r0 = 2
            r10 = r3[r0]
            X.0V1N r5 = new X.0V1N
            r5.<init>(r6, r8, r10)
            boolean r0 = com.bytedance.monitor.collector.LockMonitorManager.openFetchStack
            if (r0 == 0) goto L83
            java.util.concurrent.BlockingQueue<java.lang.String> r4 = com.bytedance.monitor.collector.LockMonitorManager.sStackBlockingQueue
            monitor-enter(r4)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L3f java.lang.Throwable -> L59
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Object r0 = r4.poll(r0, r3)     // Catch: java.lang.InterruptedException -> L3f java.lang.Throwable -> L59
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InterruptedException -> L3f java.lang.Throwable -> L59
            r2 = r0
            if (r0 != 0) goto L56
            goto L43
        L3f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L59
        L43:
            java.lang.String r0 = com.bytedance.monitor.collector.LockMonitorManager.lastJavaStack     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L56
            java.lang.String r2 = com.bytedance.monitor.collector.LockMonitorManager.lastJavaStack     // Catch: java.lang.Throwable -> L59
        L49:
            java.util.concurrent.BlockingQueue<java.lang.String> r1 = com.bytedance.monitor.collector.LockMonitorManager.sStackBlockingQueue     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L54
            r1.clear()     // Catch: java.lang.Throwable -> L59
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L59
            goto L5f
        L56:
            com.bytedance.monitor.collector.LockMonitorManager.lastJavaStack = r2     // Catch: java.lang.Throwable -> L59
            goto L49
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L59
            throw r0
        L5f:
            if (r2 == 0) goto L83
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L84
            java.lang.String r0 = "at "
            int r0 = r2.indexOf(r0)
            int r1 = r0 + 3
            r0 = 40
            int r0 = r2.indexOf(r0)
            if (r1 >= r0) goto L84
            java.lang.String r0 = r2.substring(r1, r0)
        L7b:
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L83
            r5.LJFF = r2
        L83:
            return r5
        L84:
            java.lang.String r0 = "unknownMethodName"
            goto L7b
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0V1N.LIZ(java.lang.String):X.0V1N");
    }

    public C0V1N(long j, long j2, String str) {
        String strSubstring;
        String strSubstring2;
        this.LIZLLL = "unknown";
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        String strSubstring3 = str.substring(str.indexOf("monitor contention with owner"));
        this.LJII = strSubstring3.substring(30, strSubstring3.indexOf(e3.h) - 1);
        int iIndexOf = strSubstring3.indexOf(" at ");
        if (iIndexOf != -1 && (strSubstring = strSubstring3.substring(iIndexOf + 5, strSubstring3.indexOf("waiters=", iIndexOf))) != null && (strSubstring2 = strSubstring.substring(strSubstring.indexOf(" "))) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strSubstring2.substring(1, strSubstring2.indexOf(e3.h)));
            sbLIZ.append(strSubstring2.substring(strSubstring2.indexOf(")") + 1, strSubstring2.lastIndexOf(")") + 1));
            this.LJI = C2188811AlT.LIZIZ(sbLIZ);
        }
        String strSubstring4 = strSubstring3.substring(strSubstring3.indexOf("blocking from") + 14);
        String strSubstring5 = strSubstring4.substring(strSubstring4.indexOf(" ") + 1);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strSubstring5.substring(0, strSubstring5.indexOf(e3.h)));
        sbLIZ2.append(strSubstring5.substring(strSubstring5.indexOf(")") + 1, strSubstring5.lastIndexOf(")") + 1));
        this.LJ = C2188811AlT.LIZIZ(sbLIZ2);
        C0V7R c0v7r = (C0V7R) C792590V7h.LIZ(C0V7R.class);
        if (c0v7r != null) {
            String strLIZLLL = c0v7r.LIZLLL();
            if (!TextUtils.isEmpty(strLIZLLL)) {
                this.LIZLLL = strLIZLLL;
            }
        }
    }
}

package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0LHL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LHL {
    public static final C0LHL LIZ = new C0LHL();
    public static final Map<String, Integer> LIZIZ = new LinkedHashMap();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(394));

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(java.lang.String r12, X.C0LHU r13, java.util.List<java.lang.String> r14, com.ss.android.socialbase.downloader.depend.AbsDownloadListener r15, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.socialbase.downloader.model.DownloadInfo>> r16) {
        /*
            r3 = r16
            boolean r0 = r3 instanceof X.C0LHO
            if (r0 == 0) goto L55
            r11 = r3
            X.0LHO r11 = (X.C0LHO) r11
            int r2 = r11.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r11.LLILLJJLI = r2
        L14:
            java.lang.Object r1 = r11.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r11.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L5b
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L2a:
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            X.0LpX r2 = X.C554890LpX.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[Retry] Starting retry download for URL: "
            r1.append(r0)
            r6 = r12
            r1.append(r6)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "EoyResourceDownloader"
            X.C201955140j.LJIILL(r2, r0, r1)
            X.0LHL r5 = X.C0LHL.LIZ
            r10 = 1
            r11.LLILLJJLI = r3
            r9 = r15
            r8 = r14
            r7 = r13
            java.lang.Object r0 = r5.LIZJ(r6, r7, r8, r9, r10, r11)
            if (r0 != r4) goto L2a
            return r4
        L55:
            X.0LHO r11 = new X.0LHO
            r11.<init>(r3)
            goto L14
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LHL.LIZ(java.lang.String, X.0LHU, java.util.List, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, X.05Vn):java.lang.Object");
    }

    public static final Pair<Boolean, Boolean> LIZIZ(String str, String str2, String str3, C0LHU c0lhu, String str4) throws Throwable {
        int iIntValue;
        C0VSJ c0vsj = new C0VSJ(str, str2);
        C0VSJ c0vsj2 = new C0VSJ(str, str3);
        if (!c0vsj.exists()) {
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Temp file not found: ");
            sbLIZ.append(str2);
            C201955140j.LIZLLL(c554890LpX, "EoyResourceDownloader", C2188811AlT.LIZIZ(sbLIZ));
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        }
        if (c0lhu == C0LHU.LOTTIE) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0LBG.LIZ.getClass();
            boolean zLJFF = C0LBG.LJFF(c0vsj);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[JSON Validation] Validation completed in ");
            sbLIZ2.append(jCurrentTimeMillis2);
            sbLIZ2.append("ms, valid: ");
            sbLIZ2.append(zLJFF);
            sbLIZ2.append(", file: ");
            sbLIZ2.append(str2);
            C201955140j.LJIILL(c554890LpX2, "EoyResourceDownloader", C2188811AlT.LIZIZ(sbLIZ2));
            if (!zLJFF) {
                c0vsj.delete();
                if (c0vsj2.exists()) {
                    c0vsj2.delete();
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str4);
                sbLIZ3.append(':');
                sbLIZ3.append(c0lhu);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                Map<String, Integer> map = LIZIZ;
                Integer num = (Integer) ((LinkedHashMap) map).get(strLIZIZ);
                if (num != null) {
                    iIntValue = num.intValue();
                    if (iIntValue >= 1) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("[Lottie] Invalid JSON after retry, giving up. URL: ");
                        sbLIZ4.append(str4);
                        C201955140j.LIZLLL(c554890LpX2, "EoyResourceDownloader", C2188811AlT.LIZIZ(sbLIZ4));
                        map.remove(strLIZIZ);
                        Boolean bool2 = Boolean.FALSE;
                        return new Pair<>(bool2, bool2);
                    }
                } else {
                    iIntValue = 0;
                }
                map.put(strLIZIZ, Integer.valueOf(iIntValue + 1));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("[Lottie] Invalid JSON detected (likely incomplete), will retry once. URL: ");
                sbLIZ5.append(str4);
                C201955140j.LJIILL(c554890LpX2, "EoyResourceDownloader", C2188811AlT.LIZIZ(sbLIZ5));
                return new Pair<>(Boolean.FALSE, Boolean.TRUE);
            }
        }
        if (c0vsj2.exists()) {
            c0vsj2.delete();
        }
        if (c0vsj.renameTo(c0vsj2)) {
            C554890LpX c554890LpX3 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("File renamed successfully: ");
            sbLIZ6.append(str2);
            sbLIZ6.append(" -> ");
            sbLIZ6.append(str3);
            C201955140j.LJIILL(c554890LpX3, "EoyResourceDownloader", C2188811AlT.LIZIZ(sbLIZ6));
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(str4);
            sbLIZ7.append(':');
            sbLIZ7.append(c0lhu);
            LIZIZ.remove(C2188811AlT.LIZIZ(sbLIZ7));
            return new Pair<>(Boolean.TRUE, Boolean.FALSE);
        }
        C554890LpX c554890LpX4 = C554890LpX.LIZIZ;
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("Failed to rename file: ");
        sbLIZ8.append(str2);
        sbLIZ8.append(" -> ");
        sbLIZ8.append(str3);
        C201955140j.LIZLLL(c554890LpX4, "EoyResourceDownloader", C2188811AlT.LIZIZ(sbLIZ8));
        Boolean bool3 = Boolean.FALSE;
        return new Pair<>(bool3, bool3);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r22, final X.C0LHU r23, java.util.List<java.lang.String> r24, final com.ss.android.socialbase.downloader.depend.AbsDownloadListener r25, boolean r26, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.socialbase.downloader.model.DownloadInfo>> r27) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LHL.LIZJ(java.lang.String, X.0LHU, java.util.List, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, boolean, X.05Vn):java.lang.Object");
    }
}

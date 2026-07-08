package X;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.ropa.encrypt.RopaEncrypt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0wty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798480wty {
    public final List<C1798460wtw> LIZ;
    public final List<C1798460wtw> LIZIZ;
    public final WifiManager LIZJ;
    public final C1798470wtx LIZLLL;
    public long LJ;
    public long LJFF;

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1699500uKK LIZIZ() {
        /*
            r17 = this;
            r2 = 0
            r0 = r17
            android.net.wifi.WifiManager r1 = r0.LIZJ     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L2a
            boolean r0 = X.C786420Ut6.LJIIIZ     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = "dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oLr9ns6Lz5q1GqZ9qhHEew0="
            if (r0 == 0) goto L1a
            boolean r0 = X.C786420Ut6.LIZ()     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L1a
            android.net.wifi.WifiInfo r0 = X.C786420Ut6.LJIIJ     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L1a
            android.net.wifi.WifiInfo r6 = X.C786420Ut6.LJIIJ     // Catch: java.lang.Throwable -> L6c
            goto L27
        L1a:
            X.0WZX r0 = new X.0WZX     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r7, r2)     // Catch: java.lang.Throwable -> L6c
            android.net.wifi.WifiInfo r0 = X.C2204961BRm.LJZ(r1, r0)     // Catch: java.lang.Throwable -> L6c
            X.C786420Ut6.LJIIJ = r0     // Catch: java.lang.Throwable -> L6c
            android.net.wifi.WifiInfo r6 = X.C786420Ut6.LJIIJ     // Catch: java.lang.Throwable -> L6c
        L27:
            if (r6 == 0) goto L2a
            goto L2c
        L2a:
            r8 = r2
            goto L68
        L2c:
            X.0uKK r8 = new X.0uKK     // Catch: java.lang.Throwable -> L6c
            X.0WZX r0 = new X.0WZX     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r7, r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = X.C2204961BRm.LJLZ(r6, r0)     // Catch: java.lang.Throwable -> L6c
            r5 = 1
            char[] r0 = new char[r5]     // Catch: java.lang.Throwable -> L6c
            r4 = 34
            r3 = 0
            r0[r3] = r4     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = kotlin.text.a0.LJLJJLL(r1, r0)     // Catch: java.lang.Throwable -> L6c
            char[] r0 = new char[r5]     // Catch: java.lang.Throwable -> L6c
            r0[r3] = r4     // Catch: java.lang.Throwable -> L6c
            java.lang.String r10 = kotlin.text.a0.LJLJJI(r1, r0)     // Catch: java.lang.Throwable -> L6c
            X.0WZX r0 = new X.0WZX     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r7, r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r13 = X.C2204961BRm.LJLLL(r6, r0)     // Catch: java.lang.Throwable -> L6c
            X.0WZX r0 = new X.0WZX     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r7, r2)     // Catch: java.lang.Throwable -> L6c
            int r9 = X.C2204961BRm.LJLLLLLL(r6, r0)     // Catch: java.lang.Throwable -> L6c
            r15 = 0
            r14 = 1
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6c
            r16 = 24
            r8.<init>(r9, r10, r11, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L6c
        L68:
            X.C189200o6.m2constructorimpl(r8)     // Catch: java.lang.Throwable -> L6c
            goto L78
        L6c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r8 = new X.00Yq
            r8.<init>(r0)
            X.C189200o6.m2constructorimpl(r8)
        L78:
            boolean r0 = X.C189200o6.m7isFailureimpl(r8)
            if (r0 != 0) goto L7f
            r2 = r8
        L7f:
            X.0uKK r2 = (X.C1699500uKK) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1798480wty.LIZIZ():X.0uKK");
    }

    public final void LIZJ(C1699500uKK c1699500uKK, List<String> list) {
        String str;
        String str2;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryMatchSsid: ");
        sbLIZ.append(c1699500uKK.LIZ());
        C1798620wuC.LIZIZ("WifiClientImpl", C2188811AlT.LIZIZ(sbLIZ));
        for (C1798460wtw c1798460wtw : this.LIZIZ) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean zFind = c1798460wtw.LIZ.matcher(c1699500uKK.LIZ).find();
            C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryMatchSsid skip: cost ");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C1798620wuC.LIZLLL("WifiClientImpl", C2188811AlT.LIZIZ(sbLIZ2));
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            C185100nR c185100nR = C185100nR.LIZ;
            if (zFind) {
                str2 = "block matched";
            } else {
                str2 = "block skipped";
            }
            C185200nS.LIZIZ(str2, c1798460wtw.LIZIZ, Long.valueOf(jCurrentTimeMillis2));
            if (zFind) {
                return;
            }
        }
        for (C1798460wtw c1798460wtw2 : this.LIZ) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            boolean zFind2 = c1798460wtw2.LIZ.matcher(c1699500uKK.LIZ).find();
            long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
            C1798620wuC c1798620wuC3 = C1798620wuC.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("tryMatchSsid pick: cost ");
            sbLIZ3.append(jCurrentTimeMillis4);
            C1798620wuC.LIZLLL("WifiClientImpl", C2188811AlT.LIZIZ(sbLIZ3));
            C185100nR c185100nR2 = C185100nR.LIZ;
            if (zFind2) {
                str = "pick matched";
            } else {
                str = "pick skipped";
            }
            C185200nS.LIZIZ(str, c1798460wtw2.LIZIZ, Long.valueOf(jCurrentTimeMillis4));
            if (zFind2) {
                c1699500uKK.LIZLLL = Collections.singletonList(c1798460wtw2.LIZIZ);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("tryMatchSsid matched ");
                sbLIZ4.append(c1699500uKK.LIZ());
                C1798620wuC.LIZIZ("WifiClientImpl", C2188811AlT.LIZIZ(sbLIZ4));
                String data = RopaEncrypt.getEncryptSeq(c1699500uKK.LIZ(), true).getData();
                ArrayList arrayList = (ArrayList) list;
                arrayList.add(data);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("tryMatchSsid matched: ");
                sbLIZ5.append(data);
                sbLIZ5.append(", count: ");
                sbLIZ5.append(arrayList.size());
                C1798620wuC.LIZLLL("WifiClientImpl", C2188811AlT.LIZIZ(sbLIZ5));
                return;
            }
        }
    }

    public final void LIZ(InterfaceC1685420txc<? super List<String>, ? super Long, ? super Long, ? super Boolean, ? super Boolean, Unit> interfaceC1685420txc, boolean z, boolean z2) throws Throwable {
        List listLJZL;
        int size;
        String strLJLJJI;
        String str;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WifiManager wifiManager = this.LIZJ;
        Integer numValueOf = null;
        if (wifiManager != null) {
            listLJZL = C2204961BRm.LJZL(wifiManager, new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oLr9ns6Lz5q1GqZ9qhHEew0=", null));
        } else {
            listLJZL = null;
        }
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchAndParseScanResult: total wifi count: ");
        if (listLJZL != null) {
            numValueOf = Integer.valueOf(listLJZL.size());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", scanTriggered=");
        sbLIZ.append(z);
        sbLIZ.append(", scanSucceeded=");
        sbLIZ.append(z2);
        C1798620wuC.LIZLLL("WifiClientImpl", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C185100nR c185100nR = C185100nR.LIZ;
        char c = 0;
        if (listLJZL != null) {
            size = listLJZL.size();
        } else {
            size = 0;
        }
        C185100nR.LJIJ(Integer.valueOf(size), jCurrentTimeMillis2, "scan");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1699500uKK c1699500uKKLIZIZ = LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetchAndParseScanResult: currentWifi: ");
        sbLIZ2.append(c1699500uKKLIZIZ);
        C1798620wuC.LIZIZ("WifiClientImpl", C2188811AlT.LIZIZ(sbLIZ2));
        this.LJFF = System.currentTimeMillis();
        if (listLJZL != null) {
            int i = 0;
            for (Object obj : listLJZL) {
                int i2 = i + 1;
                if (i >= 0) {
                    ScanResult scanResult = (ScanResult) obj;
                    if (Build.VERSION.SDK_INT >= 33) {
                        String strValueOf = String.valueOf(scanResult.getWifiSsid());
                        char[] cArr = new char[1];
                        cArr[c] = '\"';
                        String strLJLJJLL = a0.LJLJJLL(strValueOf, cArr);
                        char[] cArr2 = new char[1];
                        cArr2[c] = '\"';
                        strLJLJJI = a0.LJLJJI(strLJLJJLL, cArr2);
                    } else {
                        strLJLJJI = scanResult.SSID;
                    }
                    if (strLJLJJI != null && !linkedHashSet.contains(strLJLJJI)) {
                        String str2 = scanResult.BSSID;
                        int i3 = scanResult.level;
                        if (c1699500uKKLIZIZ != null) {
                            str = c1699500uKKLIZIZ.LIZ;
                        } else {
                            str = null;
                        }
                        C1699500uKK c1699500uKK = new C1699500uKK(i3, strLJLJJI, (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (scanResult.timestamp / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), str2, strLJLJJI.equals(str), i, 8);
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        LIZJ(c1699500uKK, arrayList);
                        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
                        C185100nR c185100nR2 = C185100nR.LIZ;
                        C185200nS.LIZIZ("na", "all", Long.valueOf(jCurrentTimeMillis4));
                        linkedHashSet.add(strLJLJJI);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fetchAndParseScanResult: ");
                        sbLIZ3.append(c1699500uKK);
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    i = i2;
                    c = 0;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C185100nR c185100nR3 = C185100nR.LIZ;
        C185100nR.LJIJ(Integer.valueOf(arrayList.size()), System.currentTimeMillis() - this.LJFF, "match");
        C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("fetchAndParseScanResult: matched ");
        sbLIZ4.append(arrayList.size());
        sbLIZ4.append(" totally cost ");
        sbLIZ4.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C1798620wuC.LIZLLL("WifiClientImpl", C2188811AlT.LIZIZ(sbLIZ4));
        interfaceC1685420txc.invoke(arrayList, Long.valueOf(this.LJ), Long.valueOf(this.LJFF), Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public C1798480wty(List<C1798460wtw> list, List<C1798460wtw> list2, Context context, long j) {
        WifiManager wifiManager;
        this.LIZ = list;
        this.LIZIZ = list2;
        Context contextN3 = C786410Ut5.N3(context);
        Object objH2 = C786410Ut5.H2(contextN3, "wifi");
        if (objH2 instanceof WifiManager) {
            wifiManager = (WifiManager) objH2;
        } else {
            wifiManager = null;
        }
        this.LIZJ = wifiManager;
        this.LIZLLL = new C1798470wtx(contextN3, wifiManager, j);
    }
}

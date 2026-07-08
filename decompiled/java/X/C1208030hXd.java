package X;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208030hXd {
    public final Activity LIZ;
    public final C1207520hWo LIZIZ;
    public final Cert LIZJ;
    public final C1208130hXn LIZLLL;

    public static void LIZIZ(int i) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("key", "location_permission_v3_callback");
            linkedHashMap.put("value_int1", String.valueOf(i));
            C20684815ws.LJIILLIIL("location_power_track", linkedHashMap);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public C1208030hXd(Activity activity, C1207520hWo c1207520hWo, Cert cert) {
        this.LIZ = activity;
        this.LIZIZ = c1207520hWo;
        this.LIZJ = cert;
        C1208440hYI.LIZ.getClass();
        this.LIZLLL = C1208440hYI.LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0hWs] */
    public final void LIZ(final InterfaceC1207030hW1 interfaceC1207030hW1, final InterfaceC1207440hWg interfaceC1207440hWg, InterfaceC19359210oY interfaceC19359210oY) {
        List<String> listLJIIZILJ;
        EnumC2192761Arq enumC2192761Arq;
        C1208210hXv c1208210hXvLJJJI;
        InterfaceC1235640iGA interfaceC1235640iGALJJJJ;
        final boolean z;
        Pair pair;
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        Activity activity = this.LIZ;
        c19741112Lp.getClass();
        if (C19741112Lp.LIZLLL(activity, "android.permission.ACCESS_COARSE_LOCATION")) {
            if (interfaceC1207030hW1 != null) {
                interfaceC1207030hW1.LIZ();
                return;
            }
            return;
        }
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT != null && (listLJIIZILJ = iLocationBaseServiceForMT.LJIIZILJ()) != null) {
            C1208130hXn c1208130hXn = this.LIZLLL;
            Activity activity2 = this.LIZ;
            String[] strArr = (String[]) listLJIIZILJ.toArray(new String[0]);
            Cert cert = this.LIZJ;
            ?? r1 = new InterfaceC1207170hWF(interfaceC1207030hW1, interfaceC1207440hWg) { // from class: X.0hWs
                public final InterfaceC1207030hW1 LIZ;
                public final InterfaceC1207440hWg LIZIZ;
                public final long LIZJ = System.currentTimeMillis();

                @Override // X.InterfaceC1207170hWF
                public final void LIZ(C1208240hXy c1208240hXy) {
                    String str;
                    String str2;
                    String str3;
                    Boolean boolValueOf;
                    C1207400hWc c1207400hWc = C1207400hWc.LIZ;
                    EnumC1207420hWe enumC1207420hWe = c1208240hXy.LIZ;
                    C1207520hWo c1207520hWo = this.LIZLLL.LIZIZ;
                    Map<String, ? extends Object> map = null;
                    if (c1207520hWo != null) {
                        str = c1207520hWo.LIZ;
                        str2 = c1207520hWo.LIZIZ;
                        str3 = c1207520hWo.LIZLLL;
                        boolValueOf = Boolean.valueOf(c1207520hWo.LJFF);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                        boolValueOf = null;
                    }
                    C1207520hWo c1207520hWo2 = this.LIZLLL.LIZIZ;
                    if (c1207520hWo2 != null) {
                        map = c1207520hWo2.LIZJ;
                    }
                    c1207400hWc.getClass();
                    int i = C1207410hWd.LIZ[enumC1207420hWe.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3 && i != 4) {
                                throw new C1954807lC();
                            }
                            return;
                        }
                        C1207400hWc.LJIILL(str, str2, str3, map);
                        return;
                    }
                    C1207400hWc.LJIIL(boolValueOf, str, str2, str3, map);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x0157  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x0168  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x0178  */
                @Override // X.InterfaceC1207170hWF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(X.C1208000hXa r24) {
                    /*
                        Method dump skipped, instruction units count: 428
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1207560hWs.LIZIZ(X.0hXa):void");
                }

                {
                    this.LIZ = interfaceC1207030hW1;
                    this.LIZIZ = interfaceC1207440hWg;
                }
            };
            c1208130hXn.getClass();
            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestPermissions(new): ");
            sbLIZ.append(cert);
            sbLIZ.append(' ');
            sbLIZ.append(C13LQ.LJJLL(strArr));
            C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
            long jUptimeMillis = SystemClock.uptimeMillis();
            C1208160hXq c1208160hXqLIZ = C1208130hXn.LIZLLL.LIZ(cert);
            if (c1208160hXqLIZ == null || (enumC2192761Arq = c1208160hXqLIZ.LJ) == null) {
                enumC2192761Arq = EnumC2192761Arq.Active;
            }
            String strCertToken = cert.certToken();
            if (strCertToken == null) {
                strCertToken = "unknown";
            }
            C1208130hXn.LJJJLIIL(C1208130hXn.LJJJ(enumC2192761Arq), strCertToken, "system", "biz");
            if (C1208130hXn.LJIIIZ.get() && C1208130hXn.LJFF != null) {
                if (!C1208130hXn.LJJJJL(cert)) {
                    C1798620wuC.LIZJ("LocationController", "requestPermissions(new): cert invalid", null);
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    String strCertToken2 = cert.certToken();
                    if (strCertToken2 == null) {
                        strCertToken2 = "unknown";
                    }
                    int iLJJJ = C1208130hXn.LJJJ(enumC2192761Arq);
                    c1208130hXn.getClass();
                    C1208130hXn.LJJJJZ(iLJJJ, -2001, jUptimeMillis2, jUptimeMillis2, strCertToken2, "system", "fail", "cert_invalid", "biz");
                    r1.LIZIZ(new C1208000hXa(EnumC1207930hXT.CertInvalid, EnumC1207420hWe.System, null, null, 12));
                    return;
                }
                C1208420hYG c1208420hYGLJJJIL = C1208130hXn.LJJJIL();
                if (c1208420hYGLJJJIL == null || (c1208210hXvLJJJI = C1208130hXn.LJJJI()) == null || (interfaceC1235640iGALJJJJ = C1208130hXn.LJJJJ()) == null) {
                    return;
                }
                int iLIZIZ = c1208420hYGLJJJIL.LIZIZ(cert);
                if (iLIZIZ != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("requestPermissions(new): not allowed by freqManager, result=");
                    sbLIZ2.append(iLIZIZ);
                    C1798620wuC.LIZJ("LocationController", C2188811AlT.LIZIZ(sbLIZ2), null);
                    long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis;
                    if (iLIZIZ == 1 || iLIZIZ != 2) {
                        pair = new Pair(-3001, "global_over_limit");
                    } else {
                        pair = new Pair(-3002, "cert_over_limit");
                    }
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    String str = (String) pair.getSecond();
                    String strCertToken3 = cert.certToken();
                    if (strCertToken3 == null) {
                        strCertToken3 = "unknown";
                    }
                    int iLJJJ2 = C1208130hXn.LJJJ(enumC2192761Arq);
                    c1208130hXn.getClass();
                    C1208130hXn.LJJJJZ(iLJJJ2, iIntValue, jUptimeMillis3, jUptimeMillis3, strCertToken3, "system", "fail", str, "biz");
                    r1.LIZIZ(new C1208000hXa(EnumC1207930hXT.OverLimit, EnumC1207420hWe.System, null, null, 12));
                    return;
                }
                if (c1208160hXqLIZ == null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("requestPermissions(new): no permission config for ");
                    sbLIZ3.append(cert.certToken());
                    C1798620wuC.LIZJ("LocationController", C2188811AlT.LIZIZ(sbLIZ3), null);
                    long jUptimeMillis4 = SystemClock.uptimeMillis() - jUptimeMillis;
                    String strCertToken4 = cert.certToken();
                    if (strCertToken4 == null) {
                        strCertToken4 = "unknown";
                    }
                    int iLJJJ3 = C1208130hXn.LJJJ(enumC2192761Arq);
                    c1208130hXn.getClass();
                    C1208130hXn.LJJJJZ(iLJJJ3, -2003, jUptimeMillis4, jUptimeMillis4, strCertToken4, "system", "fail", "no_permission_config", "biz");
                    r1.LIZIZ(new C1208000hXa(EnumC1207930hXT.CertInvalid, EnumC1207420hWe.System, null, null, 12));
                    return;
                }
                C1208170hXr c1208170hXr = C1208130hXn.LJII;
                if (c1208170hXr == null) {
                    C1798620wuC.LIZJ("LocationController", "requestPermissions(new): dialogManager is null", null);
                    long jUptimeMillis5 = SystemClock.uptimeMillis() - jUptimeMillis;
                    String strCertToken5 = cert.certToken();
                    if (strCertToken5 == null) {
                        strCertToken5 = "unknown";
                    }
                    int iLJJJ4 = C1208130hXn.LJJJ(enumC2192761Arq);
                    c1208130hXn.getClass();
                    C1208130hXn.LJJJJZ(iLJJJ4, -10000, jUptimeMillis5, jUptimeMillis5, strCertToken5, "system", "fail", "dialogManager_null", "biz");
                    r1.LIZIZ(C1207290hWR.LIZIZ(EnumC1207420hWe.System));
                    return;
                }
                C185100nR c185100nR = C185100nR.LIZ;
                C185100nR.LJ(cert.certToken(), c1208160hXqLIZ.LIZ());
                C1208040hXe c1208040hXe = new C1208040hXe(r1, cert, enumC2192761Arq, jUptimeMillis);
                final C1208140hXo c1208140hXo = new C1208140hXo(interfaceC1235640iGALJJJJ, activity2, strArr, cert, c1208160hXqLIZ, c1208040hXe, c1208170hXr, c1208210hXvLJJJI.LJI, c1208210hXvLJJJI.LJII, interfaceC19359210oY, new AwS384S0200000_18(c1208040hXe, cert, 171), new AwS384S0200000_18(cert, enumC2192761Arq, 172));
                C1208350hY9 c1208350hY9 = c1208160hXqLIZ.LIZ;
                final C1208350hY9 c1208350hY92 = c1208160hXqLIZ.LIZIZ;
                for (String str2 : strArr) {
                    if (C838410Wul.LIZ(c1208140hXo.LIZIZ, str2) != 0) {
                        if (!c1208350hY9.LIZ() && c1208350hY9.LIZ != EnumC1216870hlt.Cover) {
                            C1798620wuC.LIZLLL("LocationController", "requestPermissions(new): skipping rationale, requesting permissions directly");
                            c1208140hXo.LIZIZ(c1208350hY92);
                            return;
                        }
                        C1798620wuC.LIZLLL("LocationController", "requestPermissions(new): showing rationale dialog");
                        EnumC1216870hlt enumC1216870hlt = c1208350hY9.LIZ;
                        EnumC1216870hlt enumC1216870hlt2 = EnumC1216870hlt.Cover;
                        if (enumC1216870hlt == enumC1216870hlt2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C12Q8 c12q8LJ = c1208140hXo.LJ(new C1207950hXV(z), new AwS419S0200000_18(c1208140hXo, c1208350hY92, 114));
                        if (c12q8LJ == null) {
                            return;
                        }
                        C12QB c12qb = new C12QB() { // from class: X.0hXh
                            @Override // X.C12QB
                            public final String LIZIZ() {
                                return "";
                            }

                            @Override // X.C12QB
                            public final void LIZ() {
                                if (z) {
                                    return;
                                }
                                c1208140hXo.LIZIZ(c1208350hY92);
                            }

                            @Override // X.C12QB
                            public final C12QJ type() {
                                return C12QJ.OK;
                            }
                        };
                        if (c1208350hY9.LIZ == enumC1216870hlt2) {
                            c1208140hXo.LJIIL = c12q8LJ;
                            c12q8LJ.LIZJ(c1208350hY9.LIZIZ, c1208350hY9.LIZJ, c12qb, null, null, new AwS562S0100000_18(c1208140hXo, 2432));
                            if (!z) {
                                return;
                            }
                            c1208140hXo.LIZIZ(c1208350hY92);
                            return;
                        }
                        c12q8LJ.LIZJ(c1208350hY9.LIZIZ, c1208350hY9.LIZJ, c12qb, null, null, new AwS562S0100000_18(c1208140hXo, 2433));
                        return;
                    }
                }
                C1798620wuC.LIZLLL("LocationController", "requestPermissions(new): all permissions already granted, returning success");
                String[] strArr2 = c1208140hXo.LIZJ;
                ArrayList arrayList = new ArrayList(strArr2.length);
                for (String str3 : strArr2) {
                    arrayList.add(new Pair(str3, EnumC1207930hXT.Granted));
                }
                c1208140hXo.LJFF.LIZIZ(new C1208000hXa(EnumC1207930hXT.Granted, EnumC1207420hWe.System, null, arrayList, 4));
                return;
            }
            C1798620wuC.LIZJ("LocationController", "requestPermissions(new): controller not initialized", null);
            Pair pairLJJIL = C1208130hXn.LJJIL();
            int iIntValue2 = ((Number) pairLJJIL.getFirst()).intValue();
            String str4 = (String) pairLJJIL.getSecond();
            long jUptimeMillis6 = SystemClock.uptimeMillis() - jUptimeMillis;
            String strCertToken6 = cert.certToken();
            if (strCertToken6 == null) {
                strCertToken6 = "unknown";
            }
            int iLJJJ5 = C1208130hXn.LJJJ(enumC2192761Arq);
            c1208130hXn.getClass();
            C1208130hXn.LJJJJZ(iLJJJ5, iIntValue2, jUptimeMillis6, jUptimeMillis6, strCertToken6, "system", "fail", str4, "biz");
            r1.LIZIZ(C1207290hWR.LIZIZ(EnumC1207420hWe.System));
            return;
        }
        if (interfaceC1207030hW1 != null) {
            interfaceC1207030hW1.LIZIZ(0, "No LocationService Implementation");
        }
    }
}

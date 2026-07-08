package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13N5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13N5 {
    public static final /* synthetic */ int LJI = 0;
    public final C13NB LIZ;
    public final C13M6 LIZIZ;
    public final C13ND LIZJ;
    public final EnumC356380Dy8 LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(918));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(901));

    public final long LIZ(String str, C13N3 c13n3) throws Exception {
        boolean zLJI = MethodIDManager.LJI(137389);
        C13M6 c13m6 = this.LIZIZ;
        boolean zLJI2 = MethodIDManager.LJI(137389);
        long jLIZIZ = LIZIZ(str, true, null, c13m6, c13n3);
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return jLIZIZ;
    }

    public final void LIZLLL(long j, String str) {
        String strName;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        EnumC356380Dy8 enumC356380Dy8 = this.LIZLLL;
        if (enumC356380Dy8 != null) {
            strName = enumC356380Dy8.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        sbLIZ.append("-->");
        sbLIZ.append(str);
        sbLIZ.append(" , cost ");
        sbLIZ.append(j);
        sbLIZ.append(" mills.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("DownloadManager", strLIZIZ);
    }

    public C13N5(C13NB c13nb, C13M6 c13m6, C13ND c13nd, EnumC356380Dy8 enumC356380Dy8) {
        this.LIZ = c13nb;
        this.LIZIZ = c13m6;
        this.LIZJ = c13nd;
        this.LIZLLL = enumC356380Dy8;
    }

    public final long LIZIZ(String str, boolean z, StringBuffer stringBuffer, C13M6 c13m6, C13N3 c13n3) throws Exception {
        char c;
        boolean zLJI = MethodIDManager.LJI(137389);
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadUrl=");
        sbLIZ.append(str);
        sbLIZ.append(" start");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("DownloadManager", strLIZIZ);
        C19999313Mx c19999313Mx = new C19999313Mx();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (stringBuffer != null) {
            stringBuffer.append(" begin check url ");
        }
        long j = -1;
        if (!C504670Jqj.LIZIZ(str)) {
            c13n3.onStart();
            C13N8 c13n8FetchFromNetwork = null;
            Integer numValueOf = null;
            try {
                c13n8FetchFromNetwork = this.LIZ.fetchFromNetwork(new C0XSU(str, null, C0XSV.GET, null, null, false, null, null, 954));
                if (c13n8FetchFromNetwork != null && c13n8FetchFromNetwork.LIZ == 200) {
                    c19999313Mx.LIZIZ = System.currentTimeMillis() - jCurrentTimeMillis;
                    LIZLLL(c19999313Mx.LIZIZ, "fetchInputStream success! url: " + str);
                    if (stringBuffer != null) {
                        stringBuffer.append("begin write to disk ");
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    try {
                        String strLIZ = c13m6.LIZ(new C20008713Qn(c13n8FetchFromNetwork.LIZIZ), c13n8FetchFromNetwork.LIZJ, c13n3);
                        if (strLIZ == null) {
                            if (stringBuffer != null) {
                                stringBuffer.append("zip path is null ");
                            }
                            if (zLJI) {
                                MethodIDManager.LJ();
                            }
                            return -1L;
                        }
                        long jLJIIJ = C20012413Ry.LJIIJ(strLIZ);
                        c19999313Mx.LJ = jLJIIJ;
                        c19999313Mx.LIZJ = System.currentTimeMillis() - jCurrentTimeMillis2;
                        if (stringBuffer != null) {
                            StringBuilder sb = new StringBuilder("download fileSize: ");
                            sb.append(jLJIIJ);
                            c = ' ';
                            sb.append(' ');
                            stringBuffer.append(sb.toString());
                        } else {
                            c = ' ';
                        }
                        if (jLJIIJ > 0) {
                            LIZLLL(c19999313Mx.LIZJ, "writeToDisk success! url: " + str);
                            C13ND c13nd = this.LIZJ;
                            if (c13nd == null) {
                                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                                c19999313Mx.LIZ = jCurrentTimeMillis3;
                                LIZLLL(jCurrentTimeMillis3, "unnecessary to unzip, download success ");
                                c13n3.LIZ(c19999313Mx);
                                if (stringBuffer != null) {
                                    stringBuffer.append("unnecessary to unzip, download success ");
                                }
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                                return jLJIIJ;
                            }
                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                            try {
                                c19999313Mx.LJFF = "zip";
                                boolean z2 = false;
                                if (((Boolean) this.LJFF.getValue()).booleanValue()) {
                                    String strLJI = C20012413Ry.LJI(strLIZ);
                                    c19999313Mx.LJFF = strLJI;
                                    if (Intrinsics.LJFF(strLJI, "zstd")) {
                                        String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(strLIZ, "_zip", "_zst", false), ".zip", "_zst", false);
                                        C20012413Ry.LJIIL(strLIZ, strLJJIFFI, true);
                                        strLIZ = strLJJIFFI;
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                }
                                boolean zLIZ = c13nd.LIZ(strLIZ, z);
                                c19999313Mx.LIZLLL = System.currentTimeMillis() - jCurrentTimeMillis4;
                                c19999313Mx.LIZ = System.currentTimeMillis() - jCurrentTimeMillis;
                                if (stringBuffer != null) {
                                    stringBuffer.append("available space: " + C20012413Ry.LJII() + c);
                                }
                                if (zLIZ) {
                                    String str2 = "unzip success! url: " + str + c;
                                    LIZLLL(c19999313Mx.LIZLLL, str2);
                                    LIZLLL(c19999313Mx.LIZ, "download success! url: " + str);
                                    c13n3.LIZ(c19999313Mx);
                                    if (stringBuffer != null) {
                                        stringBuffer.append(str2);
                                    }
                                    j = jLJIIJ;
                                } else {
                                    c19999313Mx.LJI = new C1662020tLs("download:unzip file failed! format: " + c19999313Mx.LJFF + ", zstdEnable: " + z2);
                                    StringBuilder sb2 = new StringBuilder("unzip failed! url: ");
                                    sb2.append(str);
                                    sb2.append(c);
                                    String string = sb2.toString();
                                    LIZLLL(c19999313Mx.LIZLLL, string);
                                    LIZLLL(c19999313Mx.LIZ, "download failed! url: " + str);
                                    c13n3.LIZ(c19999313Mx);
                                    if (stringBuffer != null) {
                                        stringBuffer.append(string);
                                    }
                                }
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                                return j;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                if (!(e instanceof C13NG) && !(e instanceof C19997413Me) && !(e instanceof C564610MCl) && !(e instanceof C1662020tLs)) {
                                    C1662020tLs c1662020tLs = new C1662020tLs("download " + C13LE.LIZ(e.getClass()).LIZLLL() + ':' + e.getMessage());
                                    if (zLJI) {
                                        MethodIDManager.LJ();
                                        throw c1662020tLs;
                                    }
                                    throw c1662020tLs;
                                }
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                                throw e;
                            }
                        }
                        String str3 = "writeToDisk failed! url: " + str + c;
                        LIZLLL(c19999313Mx.LIZJ, str3);
                        c19999313Mx.LIZ = System.currentTimeMillis() - jCurrentTimeMillis;
                        c19999313Mx.LJI = new C564610MCl("write file to disk failed!");
                        c13n3.LIZ(c19999313Mx);
                        if (stringBuffer != null) {
                            stringBuffer.append(str3 + " available space: " + C20012413Ry.LJII() + c);
                        }
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                        return jLJIIJ;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (!(e2 instanceof C13NG) && !(e2 instanceof C19997413Me) && !(e2 instanceof C564610MCl)) {
                            C564610MCl c564610MCl = new C564610MCl(C13LE.LIZ(e2.getClass()).LIZLLL() + ':' + e2.getMessage());
                            if (zLJI) {
                                MethodIDManager.LJ();
                                throw c564610MCl;
                            }
                            throw c564610MCl;
                        }
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                        throw e2;
                    }
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C13LE.LIZ(e3.getClass()).LIZLLL());
                sbLIZ2.append(':');
                sbLIZ2.append(e3.getMessage());
                c19999313Mx.LJI = new C1633840scQ(400, C2188811AlT.LIZIZ(sbLIZ2));
            }
            c19999313Mx.LIZ = System.currentTimeMillis() - jCurrentTimeMillis;
            if (c13n8FetchFromNetwork != null) {
                int i = c13n8FetchFromNetwork.LIZ;
                String str4 = c13n8FetchFromNetwork.LIZLLL;
                if (str4 == null) {
                    str4 = "status code is " + c13n8FetchFromNetwork.LIZ;
                }
                c19999313Mx.LJI = new C1633840scQ(i, str4);
            }
            StringBuilder sb3 = new StringBuilder("fetchFromNetwork failed! url: ");
            sb3.append(str);
            sb3.append(" rsp code: ");
            if (c13n8FetchFromNetwork != null) {
                numValueOf = Integer.valueOf(c13n8FetchFromNetwork.LIZ);
            }
            sb3.append(numValueOf);
            sb3.append(' ');
            String string2 = sb3.toString();
            LIZLLL(c19999313Mx.LIZ, string2);
            if (stringBuffer != null) {
                stringBuffer.append(string2);
            }
            c13n3.LIZ(c19999313Mx);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return -1L;
        }
        c19999313Mx.LIZ = System.currentTimeMillis() - jCurrentTimeMillis;
        c19999313Mx.LJI = new C1663050tNX("invalid url");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("download failed! url: ");
        sbLIZ3.append(str);
        sbLIZ3.append(' ');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        LIZLLL(c19999313Mx.LIZ, strLIZIZ2);
        c13n3.LIZ(c19999313Mx);
        if (stringBuffer != null) {
            stringBuffer.append(strLIZIZ2);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return -1L;
    }

    public final C13N8 LIZJ(String str, String str2, List<String> list, String str3, C13N3 c13n3, Map<String, ? extends Object> map) throws Exception {
        C13N8 c13n8;
        long jLJIIJ;
        boolean z;
        String str4 = str2;
        boolean zLJI = MethodIDManager.LJI(137777);
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadUrl=");
        sbLIZ.append(str);
        sbLIZ.append(" start");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("DownloadManager", strLIZIZ);
        C19999313Mx c19999313Mx = new C19999313Mx();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str4 == null) {
            str4 = null;
        }
        if ((!C504670Jqj.LIZIZ(str)) && !C504670Jqj.LIZIZ(str4)) {
            c13n3.onStart();
            C0XSU c0xsu = new C0XSU(str, list, C0XSV.GET, null, null, false, map, null, 696);
            Regex regex = C13SG.LJJ;
            String strLIZJ = C13SJ.LIZJ(C20012413Ry.LJIIIZ(str4));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C20012413Ry.LJIIJJI(str4));
            sbLIZ2.append(C13SB.LIZ);
            sbLIZ2.append(strLIZJ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            try {
                C13NB c13nb = this.LIZ;
                if (c13nb instanceof C13N1) {
                    c13n8 = ((C13N1) c13nb).LJJIIJZLJL(c0xsu, strLIZIZ2, str3, c13n3);
                } else {
                    c13n8 = c13nb.fetchFromNetwork(c0xsu);
                }
                boolean z2 = false;
                if (c13n8 != null) {
                    if (c13n8.LIZ == 206) {
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                        return c13n8;
                    }
                    if (c13n8.LIZ == 600) {
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                        return c13n8;
                    }
                    if (c13n8.LIZ == 200) {
                        c19999313Mx.LIZIZ = System.currentTimeMillis() - jCurrentTimeMillis;
                        LIZLLL(c19999313Mx.LIZIZ, "fetchInputStream success! url: " + str);
                        try {
                            this.LIZIZ.LIZ(new C20008713Qn(c13n8.LIZIZ), c13n8.LIZJ, c13n3);
                            if (((Boolean) this.LJ.getValue()).booleanValue()) {
                                jLJIIJ = C08QQ.LIZ(strLIZIZ2);
                            } else {
                                jLJIIJ = C20012413Ry.LJIIJ(strLIZIZ2);
                            }
                            c19999313Mx.LJ = jLJIIJ;
                            c19999313Mx.LIZJ = System.currentTimeMillis() - jCurrentTimeMillis;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("writeToDisk success! url: ");
                            sbLIZ3.append(str);
                            LIZLLL(c19999313Mx.LIZJ, C2188811AlT.LIZIZ(sbLIZ3));
                            C13ND c13nd = this.LIZJ;
                            if (c13nd == null) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                c19999313Mx.LIZ = jCurrentTimeMillis2;
                                LIZLLL(jCurrentTimeMillis2, "unnecessary to unzip, download success");
                                c13n3.LIZ(c19999313Mx);
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                                return c13n8;
                            }
                            c19999313Mx.LJFF = "zip";
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            if (((Boolean) this.LJFF.getValue()).booleanValue()) {
                                String strLJI = C20012413Ry.LJI(strLIZIZ2);
                                c19999313Mx.LJFF = strLJI;
                                if (Intrinsics.LJFF(strLJI, "zstd")) {
                                    String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(strLIZIZ2, "_zip", "_zst", false), ".zip", "_zst", false);
                                    z = true;
                                    C20012413Ry.LJIIL(strLIZIZ2, strLJJIFFI, true);
                                    strLIZIZ2 = strLJJIFFI;
                                } else {
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                z = true;
                            }
                            try {
                                boolean zLIZ = c13nd.LIZ(strLIZIZ2, z);
                                C13SB.LJIIZILJ(strLIZIZ2);
                                c19999313Mx.LIZLLL = System.currentTimeMillis() - jCurrentTimeMillis3;
                                c19999313Mx.LIZ = System.currentTimeMillis() - jCurrentTimeMillis;
                                if (zLIZ) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("unzip success! url: ");
                                    sbLIZ4.append(str);
                                    LIZLLL(c19999313Mx.LIZLLL, C2188811AlT.LIZIZ(sbLIZ4));
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("download success! url: ");
                                    sbLIZ5.append(str);
                                    LIZLLL(c19999313Mx.LIZ, C2188811AlT.LIZIZ(sbLIZ5));
                                    c13n3.LIZ(c19999313Mx);
                                } else {
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append("download2: unzip file failed! format: ");
                                    sbLIZ6.append(c19999313Mx.LJFF);
                                    sbLIZ6.append(" zstdEnable: ");
                                    sbLIZ6.append(z2);
                                    c19999313Mx.LJI = new C1662020tLs(C2188811AlT.LIZIZ(sbLIZ6));
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append("unzip failed! url: ");
                                    sbLIZ7.append(str);
                                    LIZLLL(c19999313Mx.LIZLLL, C2188811AlT.LIZIZ(sbLIZ7));
                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                    sbLIZ8.append("download failed! url: ");
                                    sbLIZ8.append(str);
                                    LIZLLL(c19999313Mx.LIZ, C2188811AlT.LIZIZ(sbLIZ8));
                                    c13n3.LIZ(c19999313Mx);
                                    c13n8.LIZJ = -1L;
                                }
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                                return c13n8;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                if (!(e instanceof C13NG) && !(e instanceof C19997413Me) && !(e instanceof C564610MCl) && !(e instanceof C1662020tLs)) {
                                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                    sbLIZ9.append("download2 ");
                                    sbLIZ9.append(C13LE.LIZ(e.getClass()).LIZLLL());
                                    sbLIZ9.append(':');
                                    sbLIZ9.append(e.getMessage());
                                    C1662020tLs c1662020tLs = new C1662020tLs(C2188811AlT.LIZIZ(sbLIZ9));
                                    if (zLJI) {
                                        MethodIDManager.LJ();
                                        throw c1662020tLs;
                                    }
                                    throw c1662020tLs;
                                }
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                                throw e;
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            if (!(e2 instanceof C13NG) && !(e2 instanceof C19997413Me) && !(e2 instanceof C564610MCl)) {
                                C564610MCl c564610MCl = new C564610MCl(C13LE.LIZ(e2.getClass()).LIZLLL() + ':' + e2.getMessage());
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                    throw c564610MCl;
                                }
                                throw c564610MCl;
                            }
                            if (zLJI) {
                                MethodIDManager.LJ();
                            }
                            throw e2;
                        }
                    }
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append(C13LE.LIZ(e3.getClass()).LIZLLL());
                sbLIZ10.append(':');
                sbLIZ10.append(e3.getMessage());
                c19999313Mx.LJI = new C1633840scQ(400, C2188811AlT.LIZIZ(sbLIZ10));
                c13n8 = null;
            }
            c19999313Mx.LIZ = System.currentTimeMillis() - jCurrentTimeMillis;
            if (c13n8 != null) {
                int i = c13n8.LIZ;
                String str5 = c13n8.LIZLLL;
                if (str5 == null) {
                    str5 = "status code is " + c13n8.LIZ;
                }
                c19999313Mx.LJI = new C1633840scQ(i, str5);
            }
            LIZLLL(c19999313Mx.LIZ, "fetchFromNetwork failed! url: " + str);
            c13n3.LIZ(c19999313Mx);
            if (c13n8 == null) {
                c13n8 = new C13N8(-1, new C0XSW());
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c13n8;
        }
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("[Error][Download][DownloadUrl:");
        sbLIZ11.append(str);
        sbLIZ11.append("][DownloadPath:");
        sbLIZ11.append(str4);
        sbLIZ11.append(']');
        C13SS.LIZIZ("JKL", C2188811AlT.LIZIZ(sbLIZ11), null);
        c19999313Mx.LIZ = System.currentTimeMillis() - jCurrentTimeMillis;
        c19999313Mx.LJI = new C1663050tNX("invalid url");
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append("download failed! url: ");
        sbLIZ12.append(str);
        LIZLLL(c19999313Mx.LIZ, C2188811AlT.LIZIZ(sbLIZ12));
        c13n3.LIZ(c19999313Mx);
        C13N8 c13n82 = new C13N8(-1, new C0XSW());
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c13n82;
    }
}

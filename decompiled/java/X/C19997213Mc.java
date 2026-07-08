package X;

import com.bytedance.compression.zstd.ZstdDecompress;
import com.bytedance.libarchive.Archive;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS644S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19997213Mc implements InterfaceC19997313Md {
    public final C13RD LIZ;

    public C19997213Mc(C13RD c13rd) {
        this.LIZ = c13rd;
    }

    @Override // X.InterfaceC19997313Md
    public final C13NN<C13NR> LIZ(final C13NQ c13nq) {
        C19996513Lv c19996513Lv = new C19996513Lv();
        final C13RD c13rd = this.LIZ;
        c19996513Lv.LIZIZ = c13rd.LJIJJ;
        c19996513Lv.LIZLLL = new C13ND(c13nq, c13rd) { // from class: X.13MZ
            public final C13NQ LIZ;
            public final C13RD LIZIZ;
            public final Effect LIZJ;

            {
                this.LIZ = c13nq;
                this.LIZIZ = c13rd;
                this.LIZJ = c13nq.LIZ;
            }

            @Override // X.C13ND
            public final boolean LIZ(String str, boolean z) throws Exception {
                String strLIZIZ;
                boolean zLJIJJ;
                boolean z2;
                String unzipPath;
                String strLIZIZ2;
                boolean z3;
                boolean zLJIJJ2;
                InterfaceC1633730scF interfaceC1633730scF;
                String strLJIIJJI = C20012413Ry.LJIIJJI(str);
                if (strLJIIJJI == null) {
                    return false;
                }
                String str2 = this.LIZ.LIZJ;
                if (str2 != null && !Intrinsics.LJFF(str2, strLJIIJJI) && (interfaceC1633730scF = this.LIZIZ.LJIJJLI) != null) {
                    HashMap map = new HashMap();
                    String str3 = this.LIZIZ.LJIIJ;
                    if (str3 == null) {
                        str3 = "";
                    }
                    map.put("app_id", str3);
                    map.put("effect_id", this.LIZJ.getEffect_id());
                    map.put("EffectDir", str2);
                    map.put("zippath", strLJIIJJI);
                    interfaceC1633730scF.monitorStatusRate("effect_download_error", 1, map);
                }
                InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(strLJIIJJI);
                if (interfaceC20004513OxLIZ instanceof C13MX) {
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchEffect ");
                    sbLIZ.append(this.LIZJ.getEffect_id());
                    sbLIZ.append(", name: ");
                    sbLIZ.append(this.LIZJ.getName());
                    sbLIZ.append(" unzip in EffectDiskLruCache");
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
                    c13ss.getClass();
                    C13SS.LIZ("EffectUnZipper", strLIZIZ3);
                    C13MX c13mx = (C13MX) interfaceC20004513OxLIZ;
                    Effect effect = this.LIZJ;
                    c13mx.getClass();
                    boolean zLJIIZILJ = u.LJIIZILJ(str, "_zst", false);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("decompress and unarchive: ");
                    sbLIZ2.append(str);
                    C13SS.LIZ("EffectDiskLruCache", C2188811AlT.LIZIZ(sbLIZ2));
                    if (EffectKt.containDiffInfo(effect)) {
                        if (!zLJIIZILJ) {
                            if (u.LJIIZILJ(str, "_zip", false)) {
                                unzipPath = a0.LJJJLL("_zip", str);
                            } else if (u.LJIIZILJ(str, ".zip", false)) {
                                unzipPath = a0.LJJJLL(".zip", str);
                            } else {
                                unzipPath = str;
                            }
                        } else {
                            unzipPath = a0.LJJJLL("_zst", str);
                        }
                    } else {
                        unzipPath = effect.getUnzipPath();
                        if (unzipPath != null) {
                        }
                        return false;
                    }
                    String strLIZ = C20012413Ry.LIZ(unzipPath);
                    if (strLIZ != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("zst:");
                        sbLIZ3.append(zLJIIZILJ);
                        sbLIZ3.append(" supportZstd:");
                        sbLIZ3.append(((Boolean) c13mx.LJIIJ.getValue()).booleanValue());
                        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ3);
                        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("unzip_solution", c13mx.LJIIIZ.LJIILIIL.toString()));
                        try {
                            C13SB.LJIIZILJ(strLIZ);
                            c13mx.LJIIIZ.getClass();
                            try {
                                if (!zLJIIZILJ && !Intrinsics.LJFF(C20012413Ry.LJI(str), "_zst")) {
                                    EffectConfiguration.UnZipSolution unZipSolution = c13mx.LJIIIZ.LJIILIIL;
                                    if (unZipSolution == EffectConfiguration.UnZipSolution.UNZIP3) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append(strLIZIZ4);
                                        sbLIZ4.append(" unzip3");
                                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                                        C13SB.LJIL(str, strLIZ);
                                        zLJIJJ2 = true;
                                    } else if (unZipSolution == EffectConfiguration.UnZipSolution.NEW_SOLUTION) {
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append(strLIZIZ4);
                                        sbLIZ5.append(" unzip2");
                                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
                                        zLJIJJ2 = C13SB.LJIJJLI(str, strLIZ);
                                    } else if (unZipSolution == EffectConfiguration.UnZipSolution.MINI_ZIP) {
                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                        sbLIZ6.append(strLIZIZ4);
                                        sbLIZ6.append(" unzipWithMiniZip");
                                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ6);
                                        zLJIJJ2 = C13MR.LIZIZ(str, strLIZ, mapLJIIJ);
                                    } else {
                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                        sbLIZ7.append(strLIZIZ4);
                                        sbLIZ7.append(" unzip");
                                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                                        zLJIJJ2 = C13SB.LJIJJ(str, strLIZ);
                                    }
                                } else {
                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                    sbLIZ8.append(strLIZIZ4);
                                    sbLIZ8.append(" decompress");
                                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ8);
                                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                    sbLIZ9.append(strLIZ);
                                    sbLIZ9.append(".tar");
                                    String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ9);
                                    boolean zDecompressZstdFile = ZstdDecompress.decompressZstdFile(str, strLIZIZ5);
                                    int iLIZ = Archive.LIZ(strLIZIZ5, strLIZ);
                                    if (zDecompressZstdFile && iLIZ == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    C20012413Ry.LJFF(strLIZIZ5);
                                    if (z3) {
                                        zLJIJJ2 = true;
                                    } else {
                                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                        sbLIZ10.append("EffectDiskLruCache: zstd decompress error! decompress suc: ");
                                        sbLIZ10.append(zDecompressZstdFile);
                                        sbLIZ10.append(", untar error code: ");
                                        sbLIZ10.append(iLIZ);
                                        throw new Exception(C2188811AlT.LIZIZ(sbLIZ10));
                                    }
                                }
                                if (zLJIJJ2) {
                                    if (z) {
                                        try {
                                            try {
                                                if (C0C64.LJIILLIIL().LJIIIZ(31744, "ep_need_verify_effect_package", true, false)) {
                                                    Pair<Boolean, String> verifySignatureExemptionWithReason = effect.getVerifySignatureExemptionWithReason();
                                                    boolean zBooleanValue = verifySignatureExemptionWithReason.getFirst().booleanValue();
                                                    String second = verifySignatureExemptionWithReason.getSecond();
                                                    if (zBooleanValue) {
                                                        C13SS.LIZ("EffectDiskLruCache", "VerifySignature verify effect skipped, reason: " + second + ", effect details: " + effect.toLogDetails());
                                                    } else {
                                                        int iLIZ2 = C847190XLh.LIZ(strLIZ);
                                                        if (iLIZ2 != 0) {
                                                            C13SS.LIZIZ("EffectDiskLruCache", "VerifySignature verify effect failed, verifyResult: " + iLIZ2 + ", effect details: " + effect.toLogDetails(), null);
                                                            C13RD c13rd2 = c13mx.LJIIIZ;
                                                            InterfaceC1633730scF interfaceC1633730scF2 = c13rd2.LJIJJLI;
                                                            if (interfaceC1633730scF2 != null) {
                                                                C19997513Mf.LJ(effect, c13rd2, interfaceC1633730scF2, "verify failed! result: " + iLIZ2, C2097608Jq.LJ(), false);
                                                            }
                                                            C20012413Ry.LJFF(strLIZ);
                                                            C20012413Ry.LJFF(unzipPath);
                                                        } else {
                                                            C13SS.LIZ("EffectDiskLruCache", "VerifySignature verify effect success, verifyResult: " + iLIZ2 + ", effect details: " + effect.toLogDetails());
                                                        }
                                                    }
                                                }
                                                if (((Boolean) c13mx.LJIIJJI.getValue()).booleanValue()) {
                                                    C08RK.LIZ(strLIZ);
                                                } else {
                                                    C13MX.LJIJI(effect, strLIZ);
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                        }
                                    }
                                    boolean zLJIIL = C20012413Ry.LJIIL(strLIZ, unzipPath, true);
                                    String str4 = strLIZIZ2 + " rename";
                                    if (!zLJIIL) {
                                        C13RD c13rd3 = c13mx.LJIIIZ;
                                        InterfaceC1633730scF interfaceC1633730scF3 = c13rd3.LJIJJLI;
                                        if (interfaceC1633730scF3 != null) {
                                            C19997513Mf.LJ(effect, c13rd3, interfaceC1633730scF3, "EffectDiskLruCache unzip failed! " + str4, mapLJIIJ, false);
                                        }
                                        C20012413Ry.LJFF(strLIZ);
                                        return zLJIIL;
                                    }
                                    String strLJI = C13SB.LJI(unzipPath);
                                    if (strLJI != null) {
                                        if (z) {
                                            Regex regex = C13SG.LJJ;
                                            c13mx.LJI(C13SJ.LIZJ(strLJI), effect.getPanel());
                                        }
                                        c13mx.remove(strLJI.concat(".zip"));
                                        C1798710wuL c1798710wuL = C13MX.LJIIL;
                                        if (c1798710wuL != null) {
                                            c1798710wuL.LIZIZ(effect.getId(), effect.getEffect_id());
                                        }
                                    }
                                    C13RD c13rd4 = c13mx.LJIIIZ;
                                    InterfaceC1633730scF interfaceC1633730scF4 = c13rd4.LJIJJLI;
                                    if (interfaceC1633730scF4 != null) {
                                        C19997513Mf.LJ(effect, c13rd4, interfaceC1633730scF4, "", mapLJIIJ, true);
                                        return zLJIIL;
                                    }
                                    return zLJIIL;
                                }
                                C13RD c13rd5 = c13mx.LJIIIZ;
                                InterfaceC1633730scF interfaceC1633730scF5 = c13rd5.LJIJJLI;
                                if (interfaceC1633730scF5 != null) {
                                    C19997513Mf.LJ(effect, c13rd5, interfaceC1633730scF5, "EffectDiskLruCache unzip failed! " + strLIZIZ2, mapLJIIJ, false);
                                }
                                C20012413Ry.LJFF(strLIZ);
                                return zLJIJJ2;
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } catch (Exception e4) {
                            e = e4;
                        }
                        TryCatchGuardChecker.doCheck(e);
                        C13SS c13ss2 = C13SS.LIZ;
                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                        sbLIZ11.append("fetch effect: ");
                        sbLIZ11.append(effect.getEffect_id());
                        sbLIZ11.append(", name: ");
                        sbLIZ11.append(effect.getName());
                        sbLIZ11.append(" unzip failed!");
                        String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ11);
                        c13ss2.getClass();
                        C13SS.LIZIZ("EffectDiskLruCache", strLIZIZ6, e);
                        C20012413Ry.LJFF(strLIZ);
                        String strLJI2 = C13SB.LJI(unzipPath);
                        if (strLJI2 != null) {
                            c13mx.remove(strLJI2);
                        }
                        C20012413Ry.LJFF(unzipPath);
                        C13RD c13rd6 = c13mx.LJIIIZ;
                        InterfaceC1633730scF interfaceC1633730scF6 = c13rd6.LJIJJLI;
                        if (interfaceC1633730scF6 != null) {
                            C19997513Mf.LJ(effect, c13rd6, interfaceC1633730scF6, e.getMessage(), mapLJIIJ, false);
                        }
                        throw e;
                    }
                    return false;
                }
                C13SS c13ss3 = C13SS.LIZ;
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append("fetchEffect ");
                sbLIZ12.append(this.LIZJ.getEffect_id());
                sbLIZ12.append(", name: ");
                sbLIZ12.append(this.LIZJ.getName());
                sbLIZ12.append(" unzip in old cache");
                String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ12);
                c13ss3.getClass();
                C13SS.LIZ("EffectUnZipper", strLIZIZ7);
                String unzipPath2 = this.LIZJ.getUnzipPath();
                String strLIZ2 = C20012413Ry.LIZ(this.LIZJ.getUnzipPath());
                if (strLIZ2 == null) {
                    return false;
                }
                boolean zLJIIZILJ2 = u.LJIIZILJ(str, "_zst", false);
                Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("unzip_solution", this.LIZIZ.LJIILIIL.toString()));
                try {
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append("zst:");
                    sbLIZ13.append(zLJIIZILJ2);
                    String strLIZIZ8 = C2188811AlT.LIZIZ(sbLIZ13);
                    C13SB.LJIIZILJ(strLIZ2);
                    if (zLJIIZILJ2) {
                        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                        sbLIZ14.append(strLIZIZ8);
                        sbLIZ14.append(" decompress_untar");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ14);
                        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                        sbLIZ15.append(strLIZ2);
                        sbLIZ15.append(".tar");
                        String strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ15);
                        boolean zDecompressZstdFile2 = ZstdDecompress.decompressZstdFile(str, strLIZIZ9);
                        int iLIZ3 = Archive.LIZ(strLIZIZ9, strLIZ2);
                        if (zDecompressZstdFile2 && iLIZ3 == 0 && C20012413Ry.LJIIL(strLIZ2, unzipPath2, true)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C20012413Ry.LJFF(strLIZIZ9);
                        if (!z2) {
                            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                            sbLIZ16.append("EffectUnZipper: zstd decompress error! decompress suc: ");
                            sbLIZ16.append(zDecompressZstdFile2);
                            sbLIZ16.append(", untar error code: ");
                            sbLIZ16.append(iLIZ3);
                            throw new Exception(C2188811AlT.LIZIZ(sbLIZ16));
                        }
                    } else {
                        this.LIZIZ.getClass();
                        EffectConfiguration.UnZipSolution unZipSolution2 = this.LIZIZ.LJIILIIL;
                        if (unZipSolution2 == EffectConfiguration.UnZipSolution.NEW_SOLUTION) {
                            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                            sbLIZ17.append(strLIZIZ8);
                            sbLIZ17.append(" unzip2");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ17);
                            zLJIJJ = C13SB.LJIJJLI(str, strLIZ2);
                        } else if (unZipSolution2 == EffectConfiguration.UnZipSolution.MINI_ZIP) {
                            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                            sbLIZ18.append(strLIZIZ8);
                            sbLIZ18.append(" unzipWithMiniZip");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ18);
                            zLJIJJ = C13MR.LIZIZ(str, strLIZ2, mapLJIIJ2);
                        } else {
                            StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                            sbLIZ19.append(strLIZIZ8);
                            sbLIZ19.append(" unzip");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ19);
                            zLJIJJ = C13SB.LJIJJ(str, strLIZ2);
                        }
                        if (zLJIJJ && C20012413Ry.LJIIL(strLIZ2, unzipPath2, true)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    C13SB.LJIIZILJ(str);
                    if (!z2) {
                        C13SB.LJIIZILJ(strLIZ2);
                        C13SB.LJIIZILJ(unzipPath2);
                        C13RD c13rd7 = this.LIZIZ;
                        InterfaceC1633730scF interfaceC1633730scF7 = c13rd7.LJIJJLI;
                        if (interfaceC1633730scF7 != null) {
                            C19997513Mf.LJ(this.LIZJ, c13rd7, interfaceC1633730scF7, "EffectUnZipper unzip failed " + strLIZIZ, mapLJIIJ2, false);
                            return z2;
                        }
                        return z2;
                    }
                    C13RD c13rd8 = this.LIZIZ;
                    InterfaceC1633730scF interfaceC1633730scF8 = c13rd8.LJIJJLI;
                    if (interfaceC1633730scF8 != null) {
                        C19997513Mf.LJ(this.LIZJ, c13rd8, interfaceC1633730scF8, "", mapLJIIJ2, true);
                        return z2;
                    }
                    return z2;
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    C13SS c13ss4 = C13SS.LIZ;
                    StringBuilder sbLIZ20 = C2188811AlT.LIZ();
                    sbLIZ20.append("fetch effect: ");
                    sbLIZ20.append(this.LIZJ.getEffect_id());
                    sbLIZ20.append(", name: ");
                    sbLIZ20.append(this.LIZJ.getName());
                    sbLIZ20.append(" unzip failed!");
                    String strLIZIZ10 = C2188811AlT.LIZIZ(sbLIZ20);
                    c13ss4.getClass();
                    C13SS.LIZIZ("EffectUnZipper", strLIZIZ10, e5);
                    C13SB.LJIIZILJ(strLIZ2);
                    C13SB.LJIIZILJ(unzipPath2);
                    C13RD c13rd9 = this.LIZIZ;
                    InterfaceC1633730scF interfaceC1633730scF9 = c13rd9.LJIJJLI;
                    if (interfaceC1633730scF9 != null) {
                        C19997513Mf.LJ(this.LIZJ, c13rd9, interfaceC1633730scF9, e5.getMessage(), mapLJIIJ2, false);
                    }
                    throw e5;
                }
            }
        };
        final Effect effect = c13nq.LIZ;
        c19996513Lv.LIZ = new C13M6(effect) { // from class: X.13MT
            public final Effect LIZ;

            {
                this.LIZ = effect;
            }

            @Override // X.C13M6
            public final String LIZ(C20008713Qn c20008713Qn, long j, C13N3 c13n3) throws Exception {
                String uri;
                C1798710wuL c1798710wuL;
                String strLJIIJJI = C20012413Ry.LJIIJJI(this.LIZ.getZipPath());
                if (strLJIIJJI == null) {
                    return null;
                }
                InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(strLJIIJJI);
                if (interfaceC20004513OxLIZ instanceof C13MX) {
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "ep_support_effect_extra_zstd_decompression", true, false) && this.LIZ.isZstdDownload()) {
                        uri = this.LIZ.getExtraZstUri();
                    } else {
                        Integer url_sub_type = this.LIZ.getFile_url().getUrl_sub_type();
                        if (url_sub_type != null && url_sub_type.intValue() == 1) {
                            uri = this.LIZ.getFile_url().getMd5();
                        } else {
                            uri = this.LIZ.getFile_url().getUri();
                        }
                    }
                    C20004613Oy c20004613Oy = (C20004613Oy) interfaceC20004513OxLIZ;
                    Effect effect2 = this.LIZ;
                    AwS644S0100000_30 awS644S0100000_30 = new AwS644S0100000_30(c13n3, 33);
                    c20004613Oy.getClass();
                    Regex regex = C13SG.LJJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(effect2.getId());
                    sbLIZ.append(".zip");
                    String strLIZJ = C13SJ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    try {
                        Pair<String, Boolean> pairLJIIIZ = c20004613Oy.LJIIIZ(strLIZJ, c20008713Qn, uri, j, effect2.getPanel(), awS644S0100000_30);
                        if (pairLJIIIZ.getSecond().booleanValue() && (c1798710wuL = C13MX.LJIIL) != null) {
                            c1798710wuL.LIZIZ(effect2.getId(), effect2.getEffect_id());
                        }
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("effect ");
                        sbLIZ2.append(effect2.getEffect_id());
                        sbLIZ2.append(", name: ");
                        sbLIZ2.append(effect2.getName());
                        sbLIZ2.append(", key: ");
                        sbLIZ2.append(strLIZJ);
                        sbLIZ2.append(" end in disklrucache, result: ");
                        sbLIZ2.append(pairLJIIIZ.getSecond().booleanValue());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        c13ss.getClass();
                        C13SS.LIZ("EffectDiskLruCache", strLIZIZ);
                        return pairLJIIIZ.getFirst();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C13SS c13ss2 = C13SS.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fetch effect: ");
                        sbLIZ3.append(effect2.getEffect_id());
                        sbLIZ3.append(", name: ");
                        sbLIZ3.append(effect2.getName());
                        sbLIZ3.append(" key: ");
                        sbLIZ3.append(strLIZJ);
                        sbLIZ3.append(" write to disk failed!");
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        c13ss2.getClass();
                        C13SS.LIZIZ("EffectDiskLruCache", strLIZIZ2, e);
                        if (!(e instanceof C19997413Me)) {
                            c20004613Oy.remove(strLIZJ);
                        }
                        throw e;
                    }
                }
                Regex regex2 = C13SG.LJJ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(this.LIZ.getId());
                sbLIZ4.append(".zip");
                String strLIZJ2 = C13SJ.LIZJ(C2188811AlT.LIZIZ(sbLIZ4));
                if (interfaceC20004513OxLIZ != null) {
                    interfaceC20004513OxLIZ.LJII(strLIZJ2, c20008713Qn, this.LIZ.getPanel());
                }
                return this.LIZ.getZipPath();
            }
        };
        c19996513Lv.LIZJ = EnumC356380Dy8.EFFECT;
        return new C19998913Mt(c13nq, c19996513Lv.LIZ(), this.LIZ);
    }
}

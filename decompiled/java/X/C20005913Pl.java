package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.model.FetchModelType;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.common.model.SingleAlgorithmModelResponse;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Pl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20005913Pl {
    public static final ConcurrentHashMap<String, C20006713Pt> LJII = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, ModelInfo> LJIIIIZZ = new ConcurrentHashMap<>();
    public static C20005913Pl LJIIIZ;
    public static boolean LJIIJ;
    public final C13RD LIZ;
    public final C20008613Qm LIZIZ;
    public final ConcurrentHashMap<String, Exception> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C20006013Pm> LIZLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Integer> LJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C13PX> LJFF = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Boolean> LJI = new ConcurrentHashMap<>();

    public C20005913Pl(C13RD c13rd) {
        this.LIZ = c13rd;
        this.LIZIZ = new C20008613Qm(c13rd.LJJIIZI, c13rd.LJJIJIIJI, c13rd.LJJJJJL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.13Pn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.C20006713Pt LIZ(int r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20005913Pl.LIZ(int, boolean):X.13Pt");
    }

    public final C20006713Pt LIZIZ(final int i, boolean z) {
        boolean z2;
        C20001113Np c20001113Np;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("biz_");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C20006713Pt c20006713Pt = LJII.get(strLIZIZ);
        if (LJIIJ && Intrinsics.LJFF(this.LJI.get(strLIZIZ), Boolean.TRUE)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (c20006713Pt == null && z && z2 && (c20001113Np = this.LIZ.LJJIIJ) != null) {
            final String strLIZ = C1528550psb.LIZ();
            c20001113Np.LIZIZ(new AbstractC20000013Ne(strLIZ) { // from class: X.13Q1
                @Override // X.AbstractC20000013Ne
                public final void onCancel() {
                }

                @Override // X.AbstractC20000013Ne
                public final void execute() {
                    try {
                        C189200o6.m2constructorimpl(this.LIZ.LIZ(i, false));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            });
        }
        return c20006713Pt;
    }

    public final synchronized ModelInfo LIZJ(final int i, final String str) {
        ModelInfo modelInfo = null;
        if (str == null) {
            return null;
        }
        ConcurrentHashMap<String, ModelInfo> concurrentHashMap = LJIIIIZZ;
        ModelInfo modelInfo2 = concurrentHashMap.get(str);
        if (modelInfo2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ConcurrentHashMap<String, C13PX> concurrentHashMap2 = this.LJFF;
            InterfaceC20001313Nr interfaceC20001313Nr = concurrentHashMap2.get(strLIZIZ);
            if (interfaceC20001313Nr == null) {
                final C13RD c13rd = this.LIZ;
                interfaceC20001313Nr = new AbstractC20000013Ne(c13rd, str, i) { // from class: X.13PX
                    public final C13RD LIZ;
                    public final String LIZIZ;
                    public final int LIZJ;
                    public final String LIZLLL;

                    public final SingleAlgorithmModelResponse LIZJ() {
                        SingleAlgorithmModelResponse singleAlgorithmModelResponse;
                        Pair[] pairArr = new Pair[4];
                        String str2 = this.LIZ.LIZIZ;
                        if (str2 == null) {
                            str2 = "";
                        }
                        pairArr[0] = new Pair("sdk_version", str2);
                        String str3 = this.LIZ.LJI;
                        pairArr[1] = new Pair("device_type", str3 != null ? str3 : "");
                        pairArr[2] = new Pair("device_platform", "android");
                        pairArr[3] = new Pair("name", this.LIZIZ);
                        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                        if (this.LIZ.LJJIJ == FetchModelType.ZIP) {
                            mapLJIIJ.put("url_type", "zip");
                        } else {
                            mapLJIIJ.put("url_type", "source");
                        }
                        EnumC19364410pO enumC19364410pO = this.LIZ.LJJIJIIJIL;
                        if (enumC19364410pO != null) {
                            mapLJIIJ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(Integer.valueOf(enumC19364410pO.ordinal())));
                        }
                        int i2 = this.LIZJ;
                        if (i2 > 0) {
                            mapLJIIJ.put("busi_id", String.valueOf(i2));
                        }
                        mapLJIIJ.putAll(C13RE.LIZ(this.LIZ, false));
                        String str4 = this.LIZLLL;
                        if (str4 != null && (!a0.LJJJIL(str4))) {
                            mapLJIIJ.put("big_version", str4);
                        }
                        String str5 = this.LIZ.LJJIIJZLJL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str5);
                        sbLIZ2.append("/model/api/model");
                        C0XSU c0xsu = new C0XSU(C1535105zh.LIZ(mapLJIIJ, C2188811AlT.LIZIZ(sbLIZ2)), null, C0XSV.GET, null, null, false, null, null, 1018);
                        C13SQ c13sq = this.LIZ.LJIJJ;
                        if (c13sq == null) {
                            LIZ(new C1662010tLr(10011));
                            return null;
                        }
                        try {
                            String strLIZ = C20009013Qq.LIZ(c13sq.fetchFromNetwork(c0xsu).LIZIZ);
                            if (strLIZ.length() == 0) {
                                LIZ(new C1662010tLr(10002));
                                return null;
                            }
                            C13R7 c13r7 = this.LIZ.LJIJI;
                            if (c13r7 != null) {
                                singleAlgorithmModelResponse = (SingleAlgorithmModelResponse) c13r7.LIZ.convertJsonToObj(strLIZ, SingleAlgorithmModelResponse.class);
                                if (singleAlgorithmModelResponse != null && singleAlgorithmModelResponse.status_code == 0) {
                                    if (singleAlgorithmModelResponse.data == null) {
                                        LIZ(new C1662010tLr(10008));
                                        return null;
                                    }
                                    LIZIZ();
                                    return singleAlgorithmModelResponse;
                                }
                            } else {
                                singleAlgorithmModelResponse = null;
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("fetch failed, server error code: ");
                            sbLIZ3.append(singleAlgorithmModelResponse != null ? Integer.valueOf(singleAlgorithmModelResponse.status_code) : null);
                            LIZ(new C1662010tLr(10002, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3))));
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C13SS.LIZ.getClass();
                            C13SS.LIZIZ("FetchModelInfoByNameTask", "fetch single model info failed!", e);
                            LIZ(new C1662010tLr(e));
                            return null;
                        }
                    }

                    @Override // X.AbstractC20000013Ne
                    public final void onCancel() {
                    }

                    public final void LIZIZ() {
                        C13RD c13rd2 = this.LIZ;
                        InterfaceC1633730scF interfaceC1633730scF = c13rd2.LJIJJLI;
                        if (interfaceC1633730scF != null) {
                            C19997513Mf.LIZ(interfaceC1633730scF, true, "single_model_info", c13rd2, C2097608Jq.LJIIIIZZ(new Pair("model_name", this.LIZIZ), new Pair("url_path", "/model/api/model")), "");
                        }
                    }

                    @Override // X.AbstractC20000013Ne
                    public final void execute() {
                        LIZJ();
                    }

                    public final void LIZ(C1662010tLr c1662010tLr) {
                        String message;
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fetch single model info failed!, ");
                        sbLIZ2.append(c1662010tLr.LIZIZ);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c13ss.getClass();
                        C13SS.LIZIZ("FetchModelInfoByNameTask", strLIZIZ2, null);
                        int i2 = c1662010tLr.LIZ;
                        Exception exc = c1662010tLr.LIZLLL;
                        if (exc == null || (message = exc.getMessage()) == null) {
                            message = "";
                        }
                        C13RD c13rd2 = this.LIZ;
                        InterfaceC1633730scF interfaceC1633730scF = c13rd2.LJIJJLI;
                        if (interfaceC1633730scF != null) {
                            C19997513Mf.LIZ(interfaceC1633730scF, false, "single_model_info", c13rd2, C2097608Jq.LJIIIIZZ(new Pair("error_code", Integer.valueOf(i2)), new Pair("model_name", this.LIZIZ), new Pair("url_path", "/model/api/model")), message);
                        }
                    }

                    {
                        super(null, c13rd.LJJJIL);
                        this.LIZ = c13rd;
                        this.LIZIZ = str;
                        this.LIZJ = i;
                        this.LIZLLL = null;
                    }
                };
                InterfaceC20001313Nr interfaceC20001313NrPutIfAbsent = concurrentHashMap2.putIfAbsent(strLIZIZ, (C13PX) interfaceC20001313Nr);
                if (interfaceC20001313NrPutIfAbsent != null) {
                    interfaceC20001313Nr = interfaceC20001313NrPutIfAbsent;
                }
            }
            SingleAlgorithmModelResponse singleAlgorithmModelResponseLIZJ = ((C13PX) interfaceC20001313Nr).LIZJ();
            if (singleAlgorithmModelResponseLIZJ != null && (modelInfo = singleAlgorithmModelResponseLIZJ.data) != null) {
                concurrentHashMap.put(str, modelInfo);
            }
            this.LJFF.remove(strLIZIZ);
            modelInfo2 = modelInfo;
        }
        return modelInfo2;
    }

    public final ModelInfo LIZLLL(final int i, final String str, boolean z) {
        C20001113Np c20001113Np;
        if (str == null) {
            return null;
        }
        ModelInfo modelInfo = LJIIIIZZ.get(str);
        if (modelInfo == null && z && (c20001113Np = this.LIZ.LJJIIJ) != null) {
            final String strLIZ = C1528550psb.LIZ();
            c20001113Np.LIZIZ(new AbstractC20000013Ne(strLIZ) { // from class: X.13Q7
                @Override // X.AbstractC20000013Ne
                public final void onCancel() {
                }

                @Override // X.AbstractC20000013Ne
                public final void execute() {
                    this.LIZ.LIZJ(i, str);
                }
            });
        }
        return modelInfo;
    }
}

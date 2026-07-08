package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectFilterReq;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse;
import com.ss.ugc.effectplatform.model.net.PanelInfoResponse;
import com.ss.ugc.effectplatform.task.CategoryVersion;
import com.ss.ugc.effectplatform.task.Version;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import v2p.c2;

/* JADX INFO: renamed from: X.13Oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20002413Oc {
    public final C13RD LIZ;

    public C20002413Oc(C13RD c13rd) {
        this.LIZ = c13rd;
    }

    public final void LIZIZ(String str, C13MA c13ma) {
        String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            this.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        C19996713Lx c19996713Lx = new C19996713Lx(this.LIZ, str, strLIZ);
        C20001113Np c20001113Np = this.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c19996713Lx);
        }
    }

    public final void LIZJ(String str, boolean z, Map map, C13MA c13ma) {
        InterfaceC20001313Nr c20003913Or;
        boolean zLJI = MethodIDManager.LJI(202056);
        String strLIZ = C1528550psb.LIZ();
        this.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        if (z) {
            c20003913Or = new c2(this.LIZ, str, strLIZ);
        } else {
            c20003913Or = new C20003913Or(this.LIZ, str, strLIZ, map);
        }
        C20001113Np c20001113Np = this.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c20003913Or);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LIZLLL(String str, boolean z, Map map, C13MA c13ma) {
        InterfaceC20001313Nr c20003813Oq;
        String strLIZ = C1528550psb.LIZ();
        this.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        if (z) {
            c20003813Oq = new C20004013Os(this.LIZ, str, strLIZ);
        } else {
            c20003813Oq = new C20003813Oq(this.LIZ, str, strLIZ, map);
        }
        C20001113Np c20001113Np = this.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c20003813Oq);
        }
    }

    public final void LJ(final String str, final boolean z, final String str2, final int i, final int i2, boolean z2, final int i3, final Map map, C13MA c13ma) {
        InterfaceC20001313Nr c13og;
        final String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            this.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        if (z2) {
            C13SS.LIZ.getClass();
            C13SS.LIZ("EffectListRepository", "fetchPanelInfo FetchPanelInfoCacheTask");
            c13og = new C13OG(this.LIZ, str, strLIZ, z, str2, i, i2, i3);
        } else {
            C13SS.LIZ.getClass();
            C13SS.LIZ("EffectListRepository", "fetchPanelInfo FetchPanelInfoTask");
            final C13RD c13rd = this.LIZ;
            c13og = new C13OD<PanelInfoModel, PanelInfoResponse>(c13rd, str, strLIZ, z, str2, i, i2, i3, map) { // from class: X.13OL
                public final C13RD LIZ;
                public final String LIZIZ;
                public final boolean LIZJ;
                public final String LIZLLL;
                public final int LJ;
                public final int LJFF;
                public final int LJI;
                public final Map<String, String> LJII;
                public long LJIIIIZZ;

                @Override // X.C13OD
                public final int getFailCode() {
                    return 10002;
                }

                @Override // X.C13OD
                public final C0XSU buildRequest() throws Throwable {
                    C0D99 c0d99;
                    String strConvertObjToJson;
                    HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                    mapLIZ.put("panel", this.LIZIZ);
                    if (this.LIZJ) {
                        mapLIZ.put("has_category_effects", "true");
                        String str3 = this.LIZLLL;
                        if (str3 == null) {
                            str3 = "default";
                        }
                        mapLIZ.put("category", str3);
                        mapLIZ.put("cursor", String.valueOf(this.LJFF));
                        mapLIZ.put("count", String.valueOf(this.LJ));
                    }
                    int i4 = this.LJI;
                    if (i4 != 0) {
                        EffectFilterReq effectFilterReqLIZJ = C1630480sX0.LIZJ(i4);
                        C13R7 c13r7 = this.LIZ.LJIJI;
                        if (c13r7 == null || (strConvertObjToJson = c13r7.LIZ.convertObjToJson(effectFilterReqLIZJ)) == null) {
                            strConvertObjToJson = "";
                        }
                        mapLIZ.put("allow_list", strConvertObjToJson);
                    }
                    String str4 = this.LIZ.LJJIII;
                    if (str4 != null) {
                        mapLIZ.put("test_status", str4);
                    }
                    Map<String, String> map2 = this.LJII;
                    if (map2 != null) {
                        mapLIZ.putAll(map2);
                    }
                    C296610Bjv.LIZ.getClass();
                    if (C296610Bjv.LIZ()) {
                        String str5 = this.LIZIZ;
                        if (Intrinsics.LJFF(str5, "default")) {
                            c0d99 = C0D99.CAMERA_PANEL;
                        } else if (Intrinsics.LJFF(str5, "editingeffect")) {
                            c0d99 = C0D99.EDIT_PANEL;
                        }
                        if (c0d99 != null && mapLIZ.get("effect_recommend_scenario") == null) {
                            mapLIZ.put("effect_recommend_scenario", c0d99.getValue());
                        }
                    }
                    C0XSV c0xsv = C0XSV.GET;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ.LJJIIJZLJL);
                    this.LIZ.getClass();
                    sbLIZ.append("/effect/api");
                    sbLIZ.append(this.LIZ.LJIJ == 2 ? "/panel/info/v2" : "/panel/info");
                    return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, c0xsv, null, null, false, null, null, 1018);
                }

                @Override // X.C13OD
                public final int getRetryCount() {
                    return this.LIZ.LJIILL;
                }

                public final void LIZ(String str3, PanelInfoResponse panelInfoResponse) {
                    String strConvertObjToJson;
                    InterfaceC20004513Ox interfaceC20004513Ox;
                    boolean z3;
                    String strConvertObjToJson2;
                    String strLJIILIIL = C13OQ.LJIILIIL(this.LJFF, this.LJ, this.LIZ.LJ, this.LIZIZ, this.LJI, this.LIZJ, this.LIZLLL);
                    String version = null;
                    try {
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("panel request success, saveEffectList key: ");
                        sbLIZ.append(strLJIILIIL);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c13ss.getClass();
                        C13SS.LIZ("effect_request_chine_tag", strLIZIZ);
                        if (str3.length() <= 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        long jLJIIJ = 0;
                        if (z3 && this.isJsonOptimize) {
                            InterfaceC20004513Ox interfaceC20004513Ox2 = this.LIZ.LJJIFFI;
                            if (interfaceC20004513Ox2 != null) {
                                jLJIIJ = interfaceC20004513Ox2.LJIIJ(strLJIILIIL, str3, "");
                            }
                            this.LJIIIIZZ = jLJIIJ / ((long) 1024);
                        } else {
                            C13R7 c13r7 = this.LIZ.LJIJI;
                            if (c13r7 != null) {
                                strConvertObjToJson2 = c13r7.LIZ.convertObjToJson(panelInfoResponse);
                            } else {
                                strConvertObjToJson2 = null;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("panel request success, saveEffectList: ");
                            sbLIZ2.append(strConvertObjToJson2);
                            C13SS.LIZ("effect_request_chine_tag", C2188811AlT.LIZIZ(sbLIZ2));
                            if (strConvertObjToJson2 != null) {
                                InterfaceC20004513Ox interfaceC20004513Ox3 = this.LIZ.LJJIFFI;
                                if (interfaceC20004513Ox3 != null) {
                                    jLJIIJ = interfaceC20004513Ox3.LJIIJ(strLJIILIIL, strConvertObjToJson2, "");
                                }
                                this.LJIIIIZZ = jLJIIJ / ((long) 1024);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C13SS c13ss2 = C13SS.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Exception: ");
                        sbLIZ3.append(e);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        c13ss2.getClass();
                        C13SS.LIZIZ("NewFetchPanelInfoTask", strLIZIZ2, null);
                    }
                    try {
                        PanelInfoModel responseData = panelInfoResponse.getResponseData();
                        if (responseData != null) {
                            version = responseData.getVersion();
                        }
                        Version version2 = new Version(version, this.logId);
                        C13R7 c13r72 = this.LIZ.LJIJI;
                        if (c13r72 != null && (strConvertObjToJson = c13r72.LIZ.convertObjToJson(version2)) != null && (interfaceC20004513Ox = this.LIZ.LJJIFFI) != null) {
                            interfaceC20004513Ox.LJIIJ(C13OQ.LJIILL(this.LIZIZ), strConvertObjToJson, "");
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C13SS c13ss3 = C13SS.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Json Exception: ");
                        sbLIZ4.append(e2);
                        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                        c13ss3.getClass();
                        C13SS.LIZIZ("FetchPanelInfoTask", strLIZIZ3, null);
                    }
                }

                @Override // X.C13OD
                public final C13OE parseResponse(C13R7 c13r7, String str3) {
                    return (C13OE) c13r7.LIZ.convertJsonToObj(str3, PanelInfoResponse.class);
                }

                @Override // X.C13OD
                public final void onFailure(String str3, String str4, C1662010tLr c1662010tLr) {
                    String str5;
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed: ");
                    sbLIZ.append(c1662010tLr);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c13ss.getClass();
                    C13SS.LIZIZ("FetchPanelInfoTask", strLIZIZ, null);
                    c1662010tLr.LIZ(str3, this.LIZ.LJJIIJZLJL, str4);
                    super.onFailure(str3, str4, c1662010tLr);
                    Pair[] pairArr = new Pair[4];
                    pairArr[0] = new Pair("log_id", this.logId);
                    pairArr[1] = new Pair("panel", this.LIZIZ);
                    pairArr[2] = new Pair("error_code", Integer.valueOf(c1662010tLr.LIZ));
                    if (this.LIZ.LJIJ == 2) {
                        str5 = "/panel/info/v2";
                    } else {
                        str5 = "/panel/info";
                    }
                    pairArr[3] = new Pair("url_path", str5);
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                    C13RD c13rd2 = this.LIZ;
                    InterfaceC1633730scF interfaceC1633730scF = c13rd2.LJIJJLI;
                    if (interfaceC1633730scF != null) {
                        C19997513Mf.LIZ(interfaceC1633730scF, false, "panel", c13rd2, mapLJIIIIZZ, c1662010tLr.LIZIZ);
                    }
                }

                @Override // X.C13OD
                public final void onSuccess(long j, long j2, long j3, String str3, C13OE c13oe) {
                    long jCurrentTimeMillis;
                    String str4;
                    PanelInfoResponse panelInfoResponse = (PanelInfoResponse) c13oe;
                    PanelInfoModel data = panelInfoResponse.getData();
                    if (data != null) {
                        C13LD.LJ(C13LD.LIZ, this.LIZ, this.LIZIZ, data, false, this.logId, 8);
                        if (this.isJsonOptimize) {
                            super.onSuccess(j, j2, j3, panelInfoResponse);
                            jCurrentTimeMillis = System.currentTimeMillis();
                            LIZ(str3, panelInfoResponse);
                        } else {
                            LIZ(str3, panelInfoResponse);
                            super.onSuccess(j, j2, j3, panelInfoResponse);
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        Pair[] pairArr = new Pair[9];
                        pairArr[0] = new Pair("log_id", this.logId);
                        pairArr[1] = new Pair("panel", this.LIZIZ);
                        String str5 = this.LIZLLL;
                        if (str5 == null) {
                            str5 = "";
                        }
                        pairArr[2] = new Pair("category", str5);
                        pairArr[3] = new Pair("duration", Long.valueOf(jCurrentTimeMillis - j));
                        pairArr[4] = new Pair("network_time", Long.valueOf(j2 - j));
                        pairArr[5] = new Pair("json_time", Long.valueOf(j3 - j2));
                        pairArr[6] = new Pair("io_time", Long.valueOf(jCurrentTimeMillis - j3));
                        pairArr[7] = new Pair("size", Long.valueOf(this.LJIIIIZZ));
                        if (this.LIZ.LJIJ == 2) {
                            str4 = "/panel/info/v2";
                        } else {
                            str4 = "/panel/info";
                        }
                        pairArr[8] = new Pair("url_path", str4);
                        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                        C13RD c13rd2 = this.LIZ;
                        InterfaceC1633730scF interfaceC1633730scF = c13rd2.LJIJJLI;
                        if (interfaceC1633730scF != null) {
                            C19997513Mf.LIZ(interfaceC1633730scF, true, "panel", c13rd2, mapLJIIIIZZ, "");
                        }
                    }
                }

                {
                    super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, c13rd);
                    this.LIZ = c13rd;
                    this.LIZIZ = str;
                    this.LIZJ = z;
                    this.LIZLLL = str2;
                    this.LJ = i;
                    this.LJFF = i2;
                    this.LJI = i3;
                    this.LJII = map;
                }
            };
        }
        C20001113Np c20001113Np = this.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13og);
        }
    }

    public final void LIZ(final String str, final String str2, final int i, final int i2, final int i3, final String str3, boolean z, final int i4, final Map map, C13MA c13ma) {
        InterfaceC20001313Nr c13op;
        final String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            this.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        if (z) {
            c13op = new C13OP(this.LIZ, str, strLIZ, str2, i, i2, i3, i4);
        } else {
            final C13RD c13rd = this.LIZ;
            c13op = new C13OD<CategoryPageModel, CategoryEffectListResponse>(c13rd, str, strLIZ, str2, i, i2, i3, str3, i4, map) { // from class: X.13OM
                public final C13RD LIZ;
                public final String LIZIZ;
                public final String LIZJ;
                public final int LIZLLL;
                public final int LJ;
                public final int LJFF;
                public final String LJI;
                public final int LJII;
                public final Map<String, String> LJIIIIZZ;

                @Override // X.C13OD
                public final int getFailCode() {
                    return 10002;
                }

                @Override // X.C13OD
                public final C0XSU buildRequest() throws Throwable {
                    C0D99 c0d99;
                    String strConvertObjToJson;
                    HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                    mapLIZ.put("panel", this.LIZIZ);
                    String str4 = this.LIZJ;
                    if (str4 == null) {
                        str4 = "hot";
                    }
                    mapLIZ.put("category", str4);
                    mapLIZ.put("cursor", String.valueOf(this.LJ));
                    mapLIZ.put("count", String.valueOf(this.LIZLLL));
                    mapLIZ.put("sorting_position", String.valueOf(this.LJFF));
                    String str5 = this.LJI;
                    if (str5 == null) {
                        str5 = CardStruct.IStatusCode.DEFAULT;
                    }
                    mapLIZ.put("version", str5);
                    String str6 = this.LIZ.LJJIII;
                    if (str6 != null) {
                        mapLIZ.put("test_status", str6);
                    }
                    int i5 = this.LJII;
                    if (i5 != 0) {
                        EffectFilterReq effectFilterReqLIZJ = C1630480sX0.LIZJ(i5);
                        C13R7 c13r7 = this.LIZ.LJIJI;
                        if (c13r7 == null || (strConvertObjToJson = c13r7.LIZ.convertObjToJson(effectFilterReqLIZJ)) == null) {
                            strConvertObjToJson = "";
                        }
                        mapLIZ.put("allow_list", strConvertObjToJson);
                    }
                    Map<String, String> map2 = this.LJIIIIZZ;
                    if (map2 != null) {
                        mapLIZ.putAll(map2);
                    }
                    C296610Bjv.LIZ.getClass();
                    if (C296610Bjv.LIZ()) {
                        String str7 = this.LIZIZ;
                        if (Intrinsics.LJFF(str7, "default")) {
                            c0d99 = C0D99.CAMERA_PANEL;
                        } else if (Intrinsics.LJFF(str7, "editingeffect")) {
                            c0d99 = C0D99.EDIT_PANEL;
                        }
                        if (c0d99 != null && mapLIZ.get("effect_recommend_scenario") == null) {
                            mapLIZ.put("effect_recommend_scenario", c0d99.getValue());
                        }
                    }
                    C0XSV c0xsv = C0XSV.GET;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ.LJJIIJZLJL);
                    this.LIZ.getClass();
                    sbLIZ.append("/effect/api");
                    sbLIZ.append(this.LIZ.LJIJ == 2 ? "/category/effects/v2" : "/category/effects");
                    return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, c0xsv, null, null, false, null, null, 1018);
                }

                @Override // X.C13OD
                public final int getRetryCount() {
                    return this.LIZ.LJIILL;
                }

                @Override // X.C13OD
                public final C13OE parseResponse(C13R7 c13r7, String str4) {
                    return (C13OE) c13r7.LIZ.convertJsonToObj(str4, CategoryEffectListResponse.class);
                }

                public final long LIZ(String str4, CategoryEffectListResponse categoryEffectListResponse, CategoryVersion categoryVersion) {
                    String strConvertObjToJson;
                    InterfaceC20004513Ox interfaceC20004513Ox;
                    boolean z2;
                    String strConvertObjToJson2;
                    long jLJIIJ;
                    long jLJIIJ2;
                    String strLJ = C13OQ.LJ(this.LIZLLL, this.LJ, this.LJFF, this.LJII, this.LIZIZ, this.LIZJ);
                    long j = 0;
                    try {
                        if (str4.length() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 && this.isJsonOptimize) {
                            InterfaceC20004513Ox interfaceC20004513Ox2 = this.LIZ.LJJIFFI;
                            if (interfaceC20004513Ox2 != null) {
                                jLJIIJ2 = interfaceC20004513Ox2.LJIIJ(strLJ, str4, "");
                            } else {
                                jLJIIJ2 = 0;
                            }
                            j = jLJIIJ2 / ((long) 1024);
                        } else {
                            C13R7 c13r7 = this.LIZ.LJIJI;
                            if (c13r7 != null && (strConvertObjToJson2 = c13r7.LIZ.convertObjToJson(categoryEffectListResponse)) != null) {
                                InterfaceC20004513Ox interfaceC20004513Ox3 = this.LIZ.LJJIFFI;
                                if (interfaceC20004513Ox3 != null) {
                                    jLJIIJ = interfaceC20004513Ox3.LJIIJ(strLJ, strConvertObjToJson2, "");
                                } else {
                                    jLJIIJ = 0;
                                }
                                j = jLJIIJ / ((long) 1024);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Json Exception: ");
                        sbLIZ.append(e);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c13ss.getClass();
                        C13SS.LIZIZ("FetchCategoryEffectTask", strLIZIZ, null);
                    }
                    try {
                        C13R7 c13r72 = this.LIZ.LJIJI;
                        if (c13r72 != null && (strConvertObjToJson = c13r72.LIZ.convertObjToJson(categoryVersion)) != null && (interfaceC20004513Ox = this.LIZ.LJJIFFI) != null) {
                            interfaceC20004513Ox.LJIIJ(C13OQ.LJFF(this.LIZIZ, this.LIZJ), strConvertObjToJson, "");
                            return j;
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C13SS c13ss2 = C13SS.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Json Exception: ");
                        sbLIZ2.append(e2);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c13ss2.getClass();
                        C13SS.LIZIZ("FetchCategoryEffectTask", strLIZIZ2, null);
                    }
                    return j;
                }

                @Override // X.C13OD
                public final void onFailure(String str4, String str5, C1662010tLr c1662010tLr) {
                    String str6;
                    String str7;
                    c1662010tLr.LIZ(str4, this.LIZ.LJJIIJZLJL, str5);
                    super.onFailure(str4, str5, c1662010tLr);
                    C13RD c13rd2 = this.LIZ;
                    InterfaceC1633730scF interfaceC1633730scF = c13rd2.LJIJJLI;
                    if (interfaceC1633730scF != null) {
                        Pair[] pairArr = new Pair[6];
                        pairArr[0] = new Pair("log_id", this.logId);
                        pairArr[1] = new Pair("panel", this.LIZIZ);
                        String str8 = this.LIZJ;
                        String str9 = "";
                        if (str8 == null) {
                            str8 = "";
                        }
                        pairArr[2] = new Pair("category", str8);
                        pairArr[3] = new Pair("error_code", Integer.valueOf(c1662010tLr.LIZ));
                        Map<String, String> map2 = this.LJIIIIZZ;
                        if (map2 != null && (str7 = map2.get("source")) != null) {
                            str9 = str7;
                        }
                        pairArr[4] = new Pair("source", str9);
                        if (this.LIZ.LJIJ == 2) {
                            str6 = "/category/effects/v2";
                        } else {
                            str6 = "/category/effects";
                        }
                        pairArr[5] = new Pair("url_path", str6);
                        C19997513Mf.LIZ(interfaceC1633730scF, false, "category", c13rd2, C2097608Jq.LJIIIIZZ(pairArr), c1662010tLr.LIZIZ);
                    }
                }

                @Override // X.C13OD
                public final void onSuccess(long j, long j2, long j3, String str4, C13OE c13oe) {
                    String version;
                    int cursor;
                    int sorting_position;
                    long jLIZ;
                    long jCurrentTimeMillis;
                    String str5;
                    String str6;
                    CategoryEffectModel category_effects;
                    CategoryEffectModel category_effects2;
                    CategoryEffectModel category_effects3;
                    CategoryEffectListResponse categoryEffectListResponse = (CategoryEffectListResponse) c13oe;
                    CategoryPageModel data = categoryEffectListResponse.getData();
                    if (data != null) {
                        C13LD c13ld = C13LD.LIZ;
                        C13RD c13rd2 = this.LIZ;
                        String str7 = this.LIZIZ;
                        String str8 = this.logId;
                        c13ld.getClass();
                        C13LD.LIZJ(c13rd2, str7, data, false, str8);
                        CategoryPageModel data2 = categoryEffectListResponse.getData();
                        if (data2 == null || (category_effects3 = data2.getCategory_effects()) == null || (version = category_effects3.getVersion()) == null) {
                            version = CardStruct.IStatusCode.DEFAULT;
                        }
                        CategoryPageModel data3 = categoryEffectListResponse.getData();
                        if (data3 != null && (category_effects2 = data3.getCategory_effects()) != null) {
                            cursor = category_effects2.getCursor();
                        } else {
                            cursor = 0;
                        }
                        CategoryPageModel data4 = categoryEffectListResponse.getData();
                        if (data4 != null && (category_effects = data4.getCategory_effects()) != null) {
                            sorting_position = category_effects.getSorting_position();
                        } else {
                            sorting_position = 0;
                        }
                        CategoryVersion categoryVersion = new CategoryVersion(version, cursor, sorting_position, this.logId);
                        if (this.isJsonOptimize) {
                            super.onSuccess(j, j2, j3, categoryEffectListResponse);
                            jCurrentTimeMillis = System.currentTimeMillis();
                            jLIZ = LIZ(str4, categoryEffectListResponse, categoryVersion);
                        } else {
                            jLIZ = LIZ(str4, categoryEffectListResponse, categoryVersion);
                            super.onSuccess(j, j2, j3, categoryEffectListResponse);
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        C13RD c13rd3 = this.LIZ;
                        InterfaceC1633730scF interfaceC1633730scF = c13rd3.LJIJJLI;
                        if (interfaceC1633730scF != null) {
                            Pair[] pairArr = new Pair[10];
                            pairArr[0] = new Pair("log_id", this.logId);
                            pairArr[1] = new Pair("panel", this.LIZIZ);
                            String str9 = this.LIZJ;
                            if (str9 == null) {
                                str9 = "";
                            }
                            pairArr[2] = new Pair("category", str9);
                            pairArr[3] = new Pair("duration", Long.valueOf(jCurrentTimeMillis - j));
                            pairArr[4] = new Pair("network_time", Long.valueOf(j2 - j));
                            pairArr[5] = new Pair("json_time", Long.valueOf(j3 - j2));
                            pairArr[6] = new Pair("io_time", Long.valueOf(jCurrentTimeMillis - j3));
                            pairArr[7] = new Pair("size", Long.valueOf(jLIZ));
                            Map<String, String> map2 = this.LJIIIIZZ;
                            if (map2 == null || (str5 = map2.get("source")) == null) {
                                str5 = "";
                            }
                            pairArr[8] = new Pair("source", str5);
                            if (this.LIZ.LJIJ == 2) {
                                str6 = "/category/effects/v2";
                            } else {
                                str6 = "/category/effects";
                            }
                            pairArr[9] = new Pair("url_path", str6);
                            C19997513Mf.LIZ(interfaceC1633730scF, true, "category", c13rd3, C2097608Jq.LJIIIIZZ(pairArr), "");
                        }
                    }
                }

                {
                    super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, c13rd);
                    this.LIZ = c13rd;
                    this.LIZIZ = str;
                    this.LIZJ = str2;
                    this.LIZLLL = i;
                    this.LJ = i2;
                    this.LJFF = i3;
                    this.LJI = str3;
                    this.LJII = i4;
                    this.LJIIIIZZ = map;
                }
            };
        }
        C20001113Np c20001113Np = this.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13op);
        }
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.CheckUpdateVersionModel;
import com.ss.ugc.effectplatform.model.net.EffectCheckUpdateResponse;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13OO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13OO extends C13OD<Boolean, EffectCheckUpdateResponse> {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final Map<String, String> LJ;
    public String LJFF;
    public final C01GW LJI;

    public final String LIZ() {
        return (String) this.LJI.getValue();
    }

    @Override // X.C13OD
    public final C0XSU buildRequest() throws Throwable {
        String strLIZIZ;
        if (C504670Jqj.LIZIZ("")) {
            strLIZIZ = "version";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(C13SB.LIZ);
            sbLIZ.append("version");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C1798710wuL c1798710wuLLIZ = C1798720wuM.LIZ(this.LIZ.LJJIIZI, strLIZIZ);
        String string = c1798710wuLLIZ.LIZ.getString("app_version", "");
        if (string == null) {
            string = "";
        }
        boolean z = !Intrinsics.LJFF(string, this.LIZ.LIZJ);
        if (z) {
            String str = this.LIZ.LIZJ;
            if (str == null) {
                str = "";
            }
            c1798710wuLLIZ.LIZIZ("app_version", str);
        }
        HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
        String str2 = this.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        mapLIZ.put("panel", str2);
        if (this.LIZLLL == 1) {
            String str3 = this.LIZJ;
            if (str3 == null) {
                str3 = "";
            }
            mapLIZ.put("category", str3);
        }
        String strLIZ = LIZ();
        if (z) {
            mapLIZ.put("version", "");
        } else {
            String str4 = this.LJFF;
            mapLIZ.put("version", str4 != null ? str4 : "");
        }
        Map<String, String> map = this.LJ;
        if (map != null) {
            mapLIZ.putAll(map);
        }
        String str5 = this.LIZ.LJJIII;
        if (str5 != null) {
            mapLIZ.put("test_status", str5);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ.LJJIIJZLJL);
        this.LIZ.getClass();
        sb.append("/effect/api");
        sb.append(strLIZ);
        return new C0XSU(C1535105zh.LIZ(mapLIZ, sb.toString()), null, C0XSV.GET, null, null, false, null, null, 1018);
    }

    @Override // X.C13OD, X.AbstractC20000013Ne
    public final void execute() {
        String strLIZIZ;
        C13N8 c13n8FetchFromNetwork;
        C13R7 c13r7;
        EffectCheckUpdateResponse effectCheckUpdateResponse;
        int i = this.LIZLLL;
        if (i == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("effect_version");
            sbLIZ.append(this.LIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else if (i == 1) {
            strLIZIZ = C13OQ.LJFF(this.LIZIZ, this.LIZJ);
        } else if (i == 2) {
            strLIZIZ = C13OQ.LJIILL(this.LIZIZ);
        } else if (i != 3) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("effect_version");
            sbLIZ2.append(this.LIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            String str = this.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append(C13SB.LIZ);
            sbLIZ3.append("info_sticker_version");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
        String strLJFF = interfaceC20004513Ox != null ? interfaceC20004513Ox.LJFF(strLIZIZ) : null;
        if (strLJFF != null) {
            try {
                C13R7 c13r72 = this.LIZ.LJIJI;
                if (c13r72 != null) {
                    CheckUpdateVersionModel checkUpdateVersionModel = (CheckUpdateVersionModel) c13r72.LIZ.convertJsonToObj(strLJFF, CheckUpdateVersionModel.class);
                    if (checkUpdateVersionModel != null) {
                        this.LJFF = checkUpdateVersionModel.getVersion();
                        if (this.isCanceled) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            C0XSU c0xsuBuildRequest = buildRequest();
                            C13SQ c13sq = this.LIZ.LJIJJ;
                            if (c13sq != null && (c13n8FetchFromNetwork = c13sq.fetchFromNetwork(c0xsuBuildRequest)) != null) {
                                String strLIZ = C20009013Qq.LIZ(c13n8FetchFromNetwork.LIZIZ);
                                if (!C504670Jqj.LIZIZ(strLIZ) && (c13r7 = this.LIZ.LJIJI) != null && (effectCheckUpdateResponse = (EffectCheckUpdateResponse) c13r7.LIZ.convertJsonToObj(strLIZ, EffectCheckUpdateResponse.class)) != null) {
                                    LIZJ(System.currentTimeMillis() - jCurrentTimeMillis, effectCheckUpdateResponse.getUpdated());
                                    onSuccess(0L, 0L, 0L, effectCheckUpdateResponse);
                                    return;
                                }
                            }
                            LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "server data is empty or json convert error");
                            onFailure(null, null, new C1662010tLr(10002));
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            String message = e.getMessage();
                            if (message == null) {
                                message = "exception caught but no message";
                            }
                            LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, message);
                            onFailure(null, null, new C1662010tLr(e));
                            C13SS c13ss = C13SS.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("checkUpdate Failed: ");
                            sbLIZ4.append(e);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                            c13ss.getClass();
                            C13SS.LIZIZ("CheckUpdateTask", strLIZIZ2, null);
                            return;
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Json Parse Exception: ");
                sbLIZ5.append(e2);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                c13ss2.getClass();
                C13SS.LIZIZ("CheckUpdateTask", strLIZIZ3, null);
            }
        }
        onSuccess(0L, 0L, 0L, new EffectCheckUpdateResponse(true, null, 0));
    }

    public final void LIZIZ(long j, String str) {
        C13RD c13rd = this.LIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            Pair[] pairArr = new Pair[4];
            String str2 = this.LIZJ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            pairArr[0] = new Pair("category", str2);
            String str4 = this.LIZIZ;
            if (str4 != null) {
                str3 = str4;
            }
            pairArr[1] = new Pair("panel", str3);
            pairArr[2] = new Pair("duration", Long.valueOf(j));
            pairArr[3] = new Pair("url_path", LIZ());
            C19997513Mf.LIZ(interfaceC1633730scF, false, "", c13rd, C2097608Jq.LJIIIIZZ(pairArr), str);
        }
    }

    public final void LIZJ(long j, boolean z) {
        C13RD c13rd = this.LIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            Pair[] pairArr = new Pair[5];
            String str = this.LIZJ;
            if (str == null) {
                str = "";
            }
            pairArr[0] = new Pair("category", str);
            String str2 = this.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            pairArr[1] = new Pair("panel", str2);
            pairArr[2] = new Pair("need_update", Boolean.valueOf(z));
            pairArr[3] = new Pair("duration", Long.valueOf(j));
            pairArr[4] = new Pair("url_path", LIZ());
            C19997513Mf.LIZ(interfaceC1633730scF, true, "", c13rd, C2097608Jq.LJIIIIZZ(pairArr), "");
        }
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        return (C13OE) c13r7.LIZ.convertJsonToObj(str, EffectCheckUpdateResponse.class);
    }

    public C13OO(C13RD c13rd, String str, String str2, String str3, int i, Map<String, String> map) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str, null);
        this.LIZ = c13rd;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = map;
        this.LJI = C452501pT.LIZIZ(new AwS574S0100000_30(this, 411));
    }
}

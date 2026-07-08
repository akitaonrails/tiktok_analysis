package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.net.EffectNetListResponse;
import com.ss.ugc.effectplatform.task.Version;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS431S0200000_30;

/* JADX INFO: renamed from: X.13Or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20003913Or extends C13OD<EffectChannelModel, EffectNetListResponse> {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    @Override // X.C13OD
    public final int getFailCode() {
        return 10002;
    }

    @Override // X.C13OD
    public final C0XSU buildRequest() throws Throwable {
        HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
        mapLIZ.put("panel", this.LIZIZ);
        Map<String, String> map = this.LIZJ;
        if (map != null) {
            mapLIZ.putAll(map);
        }
        C0XSV c0xsv = C0XSV.GET;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJJIIJZLJL);
        this.LIZ.getClass();
        sbLIZ.append("/effect/api");
        sbLIZ.append(this.LJ ? "/effects/v4" : "/v3/effects");
        return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, c0xsv, null, null, false, null, null, 1018);
    }

    @Override // X.C13OD
    public final int getRetryCount() {
        return this.LIZ.LJIILL;
    }

    public final long LIZ(String str, EffectChannelModel effectChannelModel) {
        String strConvertObjToJson;
        InterfaceC20004513Ox interfaceC20004513Ox;
        boolean z;
        String strConvertObjToJson2;
        long jLJIIJ;
        long jLJIIJ2;
        String strLJIILLIIL = C13OQ.LJIILLIIL(this.LIZ, this.LIZIZ);
        long j = 0;
        try {
            if (str.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z && this.isJsonOptimize) {
                InterfaceC20004513Ox interfaceC20004513Ox2 = this.LIZ.LJJIFFI;
                if (interfaceC20004513Ox2 != null) {
                    jLJIIJ2 = interfaceC20004513Ox2.LJIIJ(strLJIILLIIL, str, "");
                } else {
                    jLJIIJ2 = 0;
                }
                j = jLJIIJ2 / ((long) 1024);
            } else {
                C13R7 c13r7 = this.LIZ.LJIJI;
                if (c13r7 != null && (strConvertObjToJson2 = c13r7.LIZ.convertObjToJson(effectChannelModel)) != null) {
                    InterfaceC20004513Ox interfaceC20004513Ox3 = this.LIZ.LJJIFFI;
                    if (interfaceC20004513Ox3 != null) {
                        jLJIIJ = interfaceC20004513Ox3.LJIIJ(strLJIILLIIL, strConvertObjToJson2, "");
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
            sbLIZ.append("Exception: ");
            sbLIZ.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("FetchPanelEffectListTask", strLIZIZ, null);
        }
        try {
            Version version = new Version(effectChannelModel.getVersion(), "");
            C13R7 c13r72 = this.LIZ.LJIJI;
            if (c13r72 != null && (strConvertObjToJson = c13r72.LIZ.convertObjToJson(version)) != null && (interfaceC20004513Ox = this.LIZ.LJJIFFI) != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("effect_version");
                sbLIZ2.append(this.LIZIZ);
                interfaceC20004513Ox.LJIIJ(C2188811AlT.LIZIZ(sbLIZ2), strConvertObjToJson, "");
                return j;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C13SS c13ss2 = C13SS.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Json Exception: ");
            sbLIZ3.append(e2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            c13ss2.getClass();
            C13SS.LIZIZ("FetchPanelInfoTask", strLIZIZ2, null);
        }
        return j;
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        return (C13OE) c13r7.LIZ.convertJsonToObj(str, EffectNetListResponse.class);
    }

    @Override // X.C13OD
    public final void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
        String str3;
        c1662010tLr.LIZ(str, this.LIZ.LJJIIJZLJL, str2);
        super.onFailure(str, str2, c1662010tLr);
        C13RD c13rd = this.LIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("log_id", this.logId);
            pairArr[1] = new Pair("panel", this.LIZIZ);
            pairArr[2] = new Pair("error_code", Integer.valueOf(c1662010tLr.LIZ));
            if (this.LJ) {
                str3 = "/effects/v4";
            } else {
                str3 = "/v3/effects";
            }
            pairArr[3] = new Pair("url_path", str3);
            C19997513Mf.LIZ(interfaceC1633730scF, false, "all_effect", c13rd, C2097608Jq.LJIIIIZZ(pairArr), c1662010tLr.LIZIZ);
        }
    }

    public C20003913Or(C13RD c13rd, String str, String str2, Map map) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str2, c13rd);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LIZLLL = str2;
        this.LJ = c13rd.LJJJJZI;
    }

    @Override // X.C13OD
    public final void onSuccess(long j, long j2, long j3, String str, C13OE c13oe) {
        long jLIZ;
        long jCurrentTimeMillis;
        String str2;
        EffectChannelModel data = ((EffectNetListResponse) c13oe).getData();
        if (data != null) {
            if (this.LJ) {
                C13LD.LIZ.getClass();
                C13LD.LIZIZ(data);
            }
            EffectChannelResponse effectChannelResponseLIZ = new C1643810ssV(this.LIZIZ, this.LIZ.LJII, false).LIZ(data);
            effectChannelResponseLIZ.setLogId(this.logId);
            if (this.isJsonOptimize) {
                C13MA c13maLIZ = this.LIZ.LJJJIL.LIZ(this.LIZLLL);
                if (c13maLIZ != null) {
                    c13maLIZ.preProcess(effectChannelResponseLIZ);
                }
                runOnMainThread(new AwS431S0200000_30(this, effectChannelResponseLIZ, 71));
                jCurrentTimeMillis = System.currentTimeMillis();
                jLIZ = LIZ(str, data);
            } else {
                jLIZ = LIZ(str, data);
                C13MA c13maLIZ2 = this.LIZ.LJJJIL.LIZ(this.LIZLLL);
                if (c13maLIZ2 != null) {
                    c13maLIZ2.preProcess(effectChannelResponseLIZ);
                }
                runOnMainThread(new AwS431S0200000_30(this, effectChannelResponseLIZ, 73));
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            C13RD c13rd = this.LIZ;
            InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
            if (interfaceC1633730scF != null) {
                Pair[] pairArr = new Pair[8];
                pairArr[0] = new Pair("log_id", this.logId);
                pairArr[1] = new Pair("panel", this.LIZIZ);
                pairArr[2] = new Pair("duration", Long.valueOf(jCurrentTimeMillis - j));
                pairArr[3] = new Pair("network_time", Long.valueOf(j2 - j));
                pairArr[4] = new Pair("json_time", Long.valueOf(j3 - j2));
                pairArr[5] = new Pair("io_time", Long.valueOf(jCurrentTimeMillis - j3));
                pairArr[6] = new Pair("size", Long.valueOf(jLIZ));
                if (this.LJ) {
                    str2 = "/effects/v4";
                } else {
                    str2 = "/v3/effects";
                }
                pairArr[7] = new Pair("url_path", str2);
                C19997513Mf.LIZ(interfaceC1633730scF, true, "all_effect", c13rd, C2097608Jq.LJIIIIZZ(pairArr), "");
            }
        }
    }
}

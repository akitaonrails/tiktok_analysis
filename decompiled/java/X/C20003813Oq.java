package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.net.EffectNetListCheckedResponse;
import com.ss.ugc.effectplatform.task.Version;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS1S0100300_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20003813Oq extends C13OD<EffectChannelModel, EffectNetListCheckedResponse> {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final String LIZLLL;

    @Override // X.C13OD
    public final int getFailCode() {
        return 10002;
    }

    @Override // X.C13OD
    public final C0XSU buildRequest() throws Throwable {
        String strLJFF;
        String str;
        HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
        mapLIZ.put("panel", this.LIZIZ);
        Map<String, String> map = this.LIZJ;
        if (map != null) {
            mapLIZ.putAll(map);
        }
        String strLJII = C13OQ.LJII(this.LIZ, this.LIZIZ);
        InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
        if (interfaceC20004513Ox != null && (strLJFF = interfaceC20004513Ox.LJFF(strLJII)) != null) {
            try {
                C13R7 c13r7 = this.LIZ.LJIJI;
                if (c13r7 != null) {
                    Version version = (Version) c13r7.LIZ.convertJsonToObj(strLJFF, Version.class);
                    if (version != null && (str = version.version) != null) {
                        mapLIZ.put("version", str);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Json Parse Exception: ");
                sbLIZ.append(e);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZIZ("FetchEffectListCheckedTask", strLIZIZ, null);
            }
        }
        C0XSV c0xsv = C0XSV.GET;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ.LJJIIJZLJL);
        this.LIZ.getClass();
        sbLIZ2.append("/effect/api");
        sbLIZ2.append("/effects/v5");
        return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ2)), null, c0xsv, null, null, false, null, null, 1018);
    }

    @Override // X.C13OD
    public final int getRetryCount() {
        return this.LIZ.LJIILL;
    }

    public final void LIZ(C1662010tLr c1662010tLr) {
        C13RD c13rd = this.LIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            C19997513Mf.LIZ(interfaceC1633730scF, false, "all_effect_checked", c13rd, C2097608Jq.LJIIIIZZ(new Pair("log_id", this.logId), new Pair("error_code", Integer.valueOf(c1662010tLr.LIZ)), new Pair("url_path", "/effects/v5")), c1662010tLr.LIZIZ);
        }
    }

    public final long LIZJ(String str, EffectChannelModel effectChannelModel) {
        String strConvertObjToJson;
        boolean z;
        String strConvertObjToJson2;
        long jLJIIJ;
        long jLJIIJ2;
        String strLJI = C13OQ.LJI(this.LIZ, this.LIZIZ);
        long j = 0;
        try {
            if (str.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z && this.isJsonOptimize) {
                InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
                if (interfaceC20004513Ox != null) {
                    jLJIIJ2 = interfaceC20004513Ox.LJIIJ(strLJI, str, "");
                } else {
                    jLJIIJ2 = 0;
                }
                j = jLJIIJ2 / ((long) 1024);
            } else {
                C13R7 c13r7 = this.LIZ.LJIJI;
                if (c13r7 != null && (strConvertObjToJson2 = c13r7.LIZ.convertObjToJson(effectChannelModel)) != null) {
                    InterfaceC20004513Ox interfaceC20004513Ox2 = this.LIZ.LJJIFFI;
                    if (interfaceC20004513Ox2 != null) {
                        jLJIIJ = interfaceC20004513Ox2.LJIIJ(strLJI, strConvertObjToJson2, "");
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
            C13SS.LIZIZ("FetchEffectListCheckedTask", strLIZIZ, null);
        }
        try {
            Version version = new Version(effectChannelModel.getVersion(), "");
            C13R7 c13r72 = this.LIZ.LJIJI;
            if (c13r72 != null && (strConvertObjToJson = c13r72.LIZ.convertObjToJson(version)) != null) {
                String strLJII = C13OQ.LJII(this.LIZ, this.LIZIZ);
                InterfaceC20004513Ox interfaceC20004513Ox3 = this.LIZ.LJJIFFI;
                if (interfaceC20004513Ox3 != null) {
                    interfaceC20004513Ox3.LJIIJ(strLJII, strConvertObjToJson, "");
                    return j;
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C13SS c13ss2 = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Json Exception: ");
            sbLIZ2.append(e2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss2.getClass();
            C13SS.LIZIZ("FetchEffectListCheckedTask", strLIZIZ2, null);
        }
        return j;
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        return (C13OE) c13r7.LIZ.convertJsonToObj(str, EffectNetListCheckedResponse.class);
    }

    @Override // X.C13OD
    public final void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
        c1662010tLr.LIZ(str, this.LIZ.LJJIIJZLJL, str2);
        super.onFailure(str, str2, c1662010tLr);
        LIZ(c1662010tLr);
    }

    public C20003813Oq(C13RD c13rd, String str, String str2, Map map) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str2, c13rd);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LIZLLL = str2;
    }

    public final void LIZIZ(long j, long j2, long j3, long j4, long j5) {
        C13RD c13rd = this.LIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            C19997513Mf.LIZ(interfaceC1633730scF, true, "all_effect_checked", c13rd, C2097608Jq.LJIIIIZZ(new Pair("log_id", this.logId), new Pair("panel", this.LIZIZ), new Pair("duration", Long.valueOf(j5 - j)), new Pair("network_time", Long.valueOf(j2 - j)), new Pair("json_time", Long.valueOf(j3 - j2)), new Pair("io_time", Long.valueOf(j5 - j3)), new Pair("size", Long.valueOf(j4)), new Pair("url_path", "/effects/v5")), "");
        }
    }

    @Override // X.C13OD
    public final void onSuccess(long j, long j2, long j3, String str, C13OE c13oe) {
        long jLIZJ;
        long jCurrentTimeMillis;
        EffectNetListCheckedResponse effectNetListCheckedResponse = (EffectNetListCheckedResponse) c13oe;
        if (Intrinsics.LJFF(effectNetListCheckedResponse.getUpdated(), Boolean.FALSE)) {
            new C20004013Os(this.LIZ, this.LIZIZ, this.LIZLLL).LIZ(new AwS1S0100300_30(this, j, j2, j3, 0), new AwS609S0100000_30(this, 316));
            return;
        }
        EffectChannelModel data = effectNetListCheckedResponse.getData();
        if (data == null) {
            return;
        }
        C13LD.LIZ.getClass();
        C13LD.LIZIZ(data);
        C1643810ssV c1643810ssV = new C1643810ssV(this.LIZIZ, this.LIZ.LJII, false);
        if (this.isJsonOptimize) {
            EffectChannelResponse effectChannelResponseLIZ = c1643810ssV.LIZ(data);
            C13MA c13maLIZ = this.LIZ.LJJJIL.LIZ(this.LIZLLL);
            if (c13maLIZ != null) {
                c13maLIZ.preProcess(effectChannelResponseLIZ);
            }
            runOnMainThread(new AwS431S0200000_30(this, effectChannelResponseLIZ, 79));
            jCurrentTimeMillis = System.currentTimeMillis();
            jLIZJ = LIZJ(str, data);
        } else {
            EffectChannelResponse effectChannelResponseLIZ2 = c1643810ssV.LIZ(data);
            jLIZJ = LIZJ(str, data);
            C13MA c13maLIZ2 = this.LIZ.LJJJIL.LIZ(this.LIZLLL);
            if (c13maLIZ2 != null) {
                c13maLIZ2.preProcess(effectChannelResponseLIZ2);
            }
            runOnMainThread(new AwS431S0200000_30(this, effectChannelResponseLIZ2, 84));
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        LIZIZ(j, j2, j3, jLIZJ, jCurrentTimeMillis);
    }
}

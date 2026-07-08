package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.PanelInfoCheckedResponse;
import com.ss.ugc.effectplatform.task.Version;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS1S0100300_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13OW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13OW extends C13OD<PanelInfoModel, PanelInfoCheckedResponse> {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
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
        String strLJFF;
        String str;
        HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
        mapLIZ.put("panel", this.LIZIZ);
        String strLJIIL = C13OQ.LJIIL(this.LJI, this.LJFF, this.LIZ.LJ, this.LIZIZ, this.LJ, this.LIZLLL);
        InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
        if (interfaceC20004513Ox != null && (strLJFF = interfaceC20004513Ox.LJFF(strLJIIL)) != null) {
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
                C13SS.LIZIZ("FetchPanelInfoCheckedTask", strLIZIZ, null);
            }
        }
        if (this.LIZLLL) {
            mapLIZ.put("has_category_effects", "true");
            String str2 = this.LJ;
            if (str2 == null) {
                str2 = "default";
            }
            mapLIZ.put("category", str2);
            mapLIZ.put("cursor", String.valueOf(this.LJI));
            mapLIZ.put("count", String.valueOf(this.LJFF));
        }
        String str3 = this.LIZ.LJJIII;
        if (str3 != null) {
            mapLIZ.put("test_status", str3);
        }
        Map<String, String> map = this.LJII;
        if (map != null) {
            mapLIZ.putAll(map);
        }
        C0XSV c0xsv = C0XSV.GET;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ.LJJIIJZLJL);
        this.LIZ.getClass();
        sbLIZ2.append("/effect/api");
        sbLIZ2.append("/panel/tryGetInfo");
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
            C19997513Mf.LIZ(interfaceC1633730scF, false, "panel_checked", c13rd, C2097608Jq.LJIIIIZZ(new Pair("log_id", this.logId), new Pair("panel", this.LIZIZ), new Pair("error_code", Integer.valueOf(c1662010tLr.LIZ)), new Pair("url_path", "/panel/tryGetInfo")), c1662010tLr.LIZIZ);
        }
    }

    public final void LIZJ(String str, PanelInfoCheckedResponse panelInfoCheckedResponse) {
        String strConvertObjToJson;
        boolean z;
        String strConvertObjToJson2;
        String strLJIIJJI = C13OQ.LJIIJJI(this.LJI, this.LJFF, this.LIZ.LJ, this.LIZIZ, this.LJ, this.LIZLLL);
        try {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            long jLJIIJ = 0;
            if (z && this.isJsonOptimize) {
                InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
                if (interfaceC20004513Ox != null) {
                    jLJIIJ = interfaceC20004513Ox.LJIIJ(strLJIIJJI, str, "");
                }
                this.LJIIIIZZ = jLJIIJ / ((long) 1024);
            } else {
                C13R7 c13r7 = this.LIZ.LJIJI;
                if (c13r7 != null && (strConvertObjToJson2 = c13r7.LIZ.convertObjToJson(panelInfoCheckedResponse)) != null) {
                    InterfaceC20004513Ox interfaceC20004513Ox2 = this.LIZ.LJJIFFI;
                    if (interfaceC20004513Ox2 != null) {
                        jLJIIJ = interfaceC20004513Ox2.LJIIJ(strLJIIJJI, strConvertObjToJson2, "");
                    }
                    this.LJIIIIZZ = jLJIIJ / ((long) 1024);
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
            C13SS.LIZIZ("FetchPanelInfoCheckedTask", strLIZIZ, null);
        }
        PanelInfoModel data = panelInfoCheckedResponse.getData();
        if (data == null) {
            return;
        }
        try {
            Version version = new Version(data.getVersion(), "");
            C13R7 c13r72 = this.LIZ.LJIJI;
            if (c13r72 != null && (strConvertObjToJson = c13r72.LIZ.convertObjToJson(version)) != null) {
                String strLJIIL = C13OQ.LJIIL(this.LJI, this.LJFF, this.LIZ.LJ, this.LIZIZ, this.LJ, this.LIZLLL);
                InterfaceC20004513Ox interfaceC20004513Ox3 = this.LIZ.LJJIFFI;
                if (interfaceC20004513Ox3 != null) {
                    interfaceC20004513Ox3.LJIIJ(strLJIIL, strConvertObjToJson, "");
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C13SS.LIZ.getClass();
            C13SS.LIZIZ("FetchPanelInfoCheckedTask", "Json Exception: " + e2, null);
        }
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        return (C13OE) c13r7.LIZ.convertJsonToObj(str, PanelInfoCheckedResponse.class);
    }

    @Override // X.C13OD
    public final void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed: ");
        sbLIZ.append(c1662010tLr);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZIZ("FetchPanelInfoCheckedTask", strLIZIZ, null);
        c1662010tLr.LIZ(str, this.LIZ.LJJIIJZLJL, str2);
        super.onFailure(str, str2, c1662010tLr);
        LIZ(c1662010tLr);
    }

    public final void LIZIZ(long j, long j2, long j3, long j4) {
        C13RD c13rd = this.LIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            C19997513Mf.LIZ(interfaceC1633730scF, true, "panel_checked", c13rd, C2097608Jq.LJIIIIZZ(new Pair("log_id", this.logId), new Pair("panel", this.LIZIZ), new Pair("duration", Long.valueOf(j4 - j)), new Pair("network_time", Long.valueOf(j2 - j)), new Pair("json_time", Long.valueOf(j3 - j2)), new Pair("io_time", Long.valueOf(j4 - j3)), new Pair("size", Long.valueOf(this.LJIIIIZZ)), new Pair("url_path", "/panel/tryGetInfo")), "");
        }
    }

    @Override // X.C13OD
    public final void onSuccess(long j, long j2, long j3, String str, C13OE c13oe) {
        long jCurrentTimeMillis;
        PanelInfoCheckedResponse panelInfoCheckedResponse = (PanelInfoCheckedResponse) c13oe;
        if (Intrinsics.LJFF(panelInfoCheckedResponse.getUpdated(), Boolean.FALSE)) {
            new C20002213Oa(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI).LIZ(new AwS1S0100300_30(this, j, j2, j3, 1), new AwS609S0100000_30(this, 317));
            return;
        }
        C13SS.LIZ.getClass();
        C13SS.LIZ("FetchPanelInfoCheckedTask", "Suc: load data from server");
        PanelInfoModel data = panelInfoCheckedResponse.getData();
        if (data == null) {
            return;
        }
        C13LD.LJ(C13LD.LIZ, this.LIZ, this.LIZIZ, data, true, null, 16);
        if (this.isJsonOptimize) {
            super.onSuccess(j, j2, j3, panelInfoCheckedResponse);
            jCurrentTimeMillis = System.currentTimeMillis();
            LIZJ(str, panelInfoCheckedResponse);
        } else {
            LIZJ(str, panelInfoCheckedResponse);
            super.onSuccess(j, j2, j3, panelInfoCheckedResponse);
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        LIZIZ(j, j2, j3, jCurrentTimeMillis);
    }

    public C13OW(C13RD c13rd, String str, String str2, boolean z, String str3, int i, int i2, Map<String, String> map) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str2, c13rd);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = str3;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = map;
    }
}

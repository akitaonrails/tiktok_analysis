package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.PanelInfoCheckedResponse;
import com.ss.ugc.effectplatform.model.net.PanelInfoPagingCheckedResponse;
import com.ss.ugc.effectplatform.task.Version;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS1S0100300_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13OX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13OX extends C13OD<PanelInfoModel, PanelInfoPagingCheckedResponse> {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final String LJII;
    public final Map<String, String> LJIIIIZZ;
    public long LJIIIZ;
    public final boolean LJIIJ;

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
        String str2 = this.LIZ.LJ;
        String str3 = this.LIZIZ;
        boolean z = this.LJIIJ;
        String str4 = this.LIZLLL;
        int i = this.LJFF;
        int i2 = this.LJ;
        int i3 = this.LJI;
        String str5 = this.LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13OQ.LJIILJJIL(i, i2, i3, str2, str3, str4, str5, z));
        sbLIZ.append("effect_version");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
        if (interfaceC20004513Ox != null && (strLJFF = interfaceC20004513Ox.LJFF(strLIZIZ)) != null) {
            try {
                C13R7 c13r7 = this.LIZ.LJIJI;
                if (c13r7 != null) {
                    Version version = (Version) c13r7.LIZ.convertJsonToObj(strLJFF, Version.class);
                    if (version != null && (str = version.version) != null) {
                        mapLIZ.put("panel_version", str);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Json Parse Exception: ");
                sbLIZ2.append(e);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss.getClass();
                C13SS.LIZIZ("FetchPanelInfoPagingCheckedTask", strLIZIZ2, null);
            }
        }
        String str6 = this.LIZLLL;
        if (str6 == null) {
            str6 = "all";
        }
        mapLIZ.put("category", str6);
        mapLIZ.put("cursor", String.valueOf(this.LJFF));
        mapLIZ.put("count", String.valueOf(this.LJ));
        mapLIZ.put("sorting_position", String.valueOf(this.LJI));
        String str7 = this.LJII;
        if (str7 == null) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLIZ.put("version", str7);
        String str8 = this.LIZ.LJJIII;
        if (str8 != null) {
            mapLIZ.put("test_status", str8);
        }
        Map<String, String> map = this.LJIIIIZZ;
        if (map != null) {
            mapLIZ.putAll(map);
        }
        C0XSV c0xsv = C0XSV.GET;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LIZ.LJJIIJZLJL);
        this.LIZ.getClass();
        sbLIZ3.append("/effect/api");
        sbLIZ3.append("/panel/infoAndCategoryEffectsPaged");
        return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ3)), null, c0xsv, null, null, false, null, null, 1018);
    }

    @Override // X.C13OD
    public final int getRetryCount() {
        return this.LIZ.LJIILL;
    }

    public final void LIZ(C1662010tLr c1662010tLr) {
        C13RD c13rd = this.LIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            C19997513Mf.LIZ(interfaceC1633730scF, false, "panel_paged", c13rd, C2097608Jq.LJIIIIZZ(new Pair("log_id", this.logId), new Pair("panel", this.LIZIZ), new Pair("error_code", Integer.valueOf(c1662010tLr.LIZ)), new Pair("url_path", "/panel/infoAndCategoryEffectsPaged")), c1662010tLr.LIZIZ);
        }
    }

    public final void LIZJ(String str, PanelInfoPagingCheckedResponse panelInfoPagingCheckedResponse) {
        boolean z;
        String strConvertObjToJson;
        String strLJIILJJIL = C13OQ.LJIILJJIL(this.LJFF, this.LJ, this.LJI, this.LIZ.LJ, this.LIZIZ, this.LIZLLL, this.LJII, this.LJIIJ);
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
                    jLJIIJ = interfaceC20004513Ox.LJIIJ(strLJIILJJIL, str, "");
                }
                this.LJIIIZ = jLJIIJ / ((long) 1024);
                return;
            }
            C13R7 c13r7 = this.LIZ.LJIJI;
            if (c13r7 != null && (strConvertObjToJson = c13r7.LIZ.convertObjToJson(panelInfoPagingCheckedResponse)) != null) {
                InterfaceC20004513Ox interfaceC20004513Ox2 = this.LIZ.LJJIFFI;
                if (interfaceC20004513Ox2 != null) {
                    jLJIIJ = interfaceC20004513Ox2.LJIIJ(strLJIILJJIL, strConvertObjToJson, "");
                }
                this.LJIIIZ = jLJIIJ / ((long) 1024);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception: ");
            sbLIZ.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("FetchPanelInfoPagingCheckedTask", strLIZIZ, null);
        }
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        return (C13OE) c13r7.LIZ.convertJsonToObj(str, PanelInfoPagingCheckedResponse.class);
    }

    @Override // X.C13OD
    public final void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed: ");
        sbLIZ.append(c1662010tLr);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZIZ("FetchPanelInfoPagingCheckedTask", strLIZIZ, null);
        c1662010tLr.LIZ(str, this.LIZ.LJJIIJZLJL, str2);
        super.onFailure(str, str2, c1662010tLr);
        LIZ(c1662010tLr);
    }

    public final void LIZIZ(long j, long j2, long j3, long j4) {
        C13RD c13rd = this.LIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            C19997513Mf.LIZ(interfaceC1633730scF, true, "panel_paged", c13rd, C2097608Jq.LJIIIIZZ(new Pair("log_id", this.logId), new Pair("panel", this.LIZIZ), new Pair("duration", Long.valueOf(j4 - j)), new Pair("network_time", Long.valueOf(j2 - j)), new Pair("json_time", Long.valueOf(j3 - j2)), new Pair("io_time", Long.valueOf(j4 - j3)), new Pair("size", Long.valueOf(this.LJIIIZ)), new Pair("url_path", "/panel/infoAndCategoryEffectsPaged")), "");
        }
    }

    @Override // X.C13OD
    public final void onSuccess(long j, long j2, long j3, String str, C13OE c13oe) {
        PanelInfoPagingCheckedResponse panelInfoPagingCheckedResponse = (PanelInfoPagingCheckedResponse) c13oe;
        PanelInfoCheckedResponse panelInfoResponse = panelInfoPagingCheckedResponse.getPanelInfoResponse();
        if (panelInfoResponse != null && Intrinsics.LJFF(panelInfoResponse.getUpdated(), Boolean.FALSE)) {
            new C13OZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII).LIZ(new AwS1S0100300_30(this, j, j2, j3, 2), new AwS609S0100000_30(this, 318));
            return;
        }
        C13SS.LIZ.getClass();
        C13SS.LIZ("FetchPanelInfoPagingCheckedTask", "Suc: load data from server");
        PanelInfoModel responseData = panelInfoPagingCheckedResponse.getResponseData();
        if (responseData == null) {
            return;
        }
        CategoryEffectModel category_effects = responseData.getCategory_effects();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (category_effects != null) {
            C13LD.LJ(C13LD.LIZ, this.LIZ, this.LIZIZ, responseData, true, null, 16);
            if (this.isJsonOptimize) {
                super.onSuccess(j, j2, j3, panelInfoPagingCheckedResponse);
                jCurrentTimeMillis = System.currentTimeMillis();
                LIZJ(str, panelInfoPagingCheckedResponse);
            } else {
                LIZJ(str, panelInfoPagingCheckedResponse);
                super.onSuccess(j, j2, j3, panelInfoPagingCheckedResponse);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        LIZIZ(j, j2, j3, jCurrentTimeMillis);
    }

    public C13OX(int i, int i2, int i3, C13RD c13rd, String str, String str2, String str3, String str4, Map map) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str2, c13rd);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = str4;
        this.LJIIIIZZ = map;
        this.LJIIJ = true;
    }
}

package X;

import Y.AComparatorS32S0000000_13;
import Y.AComparatorS512S0100000_13;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import com.bytedance.pumbaa.hybrid.governance.router.settings.ModifyConfigModel;
import com.bytedance.pumbaa.hybrid.governance.router.settings.PnsMigrateItem;
import com.bytedance.pumbaa.hybrid.governance.router.settings.PnsSchemaModifierModel;
import com.bytedance.pumbaa.hybrid.governance.router.settings.PnsSparkPureShutdownModel;
import com.bytedance.pumbaa.hybrid.governance.router.settings.PnsWebRouterOfflineHitModel;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822110WMv extends C0WMA<C0WNH> {
    public final C0WNM LIZ;
    public boolean LIZIZ;
    public final List<C0WNH> LIZJ = new ArrayList();
    public final List<C0WNH> LIZLLL = new ArrayList();
    public final List<C0WNH> LJ = new ArrayList();
    public final List<C0WNH> LJFF = new ArrayList();

    public final void LJ() {
        AComparatorS512S0100000_13 aComparatorS512S0100000_13 = new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(13), 3);
        C08XD.LJJ(this.LIZJ, aComparatorS512S0100000_13);
        C08XD.LJJ(this.LIZLLL, aComparatorS512S0100000_13);
        C08XD.LJJ(this.LJ, aComparatorS512S0100000_13);
        C08XD.LJJ(this.LJFF, aComparatorS512S0100000_13);
    }

    public C822110WMv(C0WNM c0wnm) {
        this.LIZ = c0wnm;
        Iterator it2 = C1697810uHb.LJIIJJI(new C0WNH() { // from class: X.0WMy
            @Override // X.C0WNH
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("OneLinkMigrateAction", C0WN8.ROUTER, C0WNE.L3, 50010, 16);
            }

            @Override // X.C0WMB
            public final BaseGovernanceModel LIZIZ() {
                return C0WNB.LIZ();
            }

            @Override // X.C0WNH
            public final List<C0WND> LIZ() {
                return C0WLN.LIZ;
            }

            @Override // X.C0WMB
            public final C0WM1 LJ(C0WMD c0wmd) throws JSONException {
                C0WN7 c0wn7;
                PnsMigrateItem next;
                Pair pair;
                Object objLIZ = c0wmd.LIZ();
                if (!(objLIZ instanceof C0WN7) || (c0wn7 = (C0WN7) objLIZ) == null || !C0WNB.LIZ().enable) {
                    return null;
                }
                int i = c0wn7.LJI;
                String host = c0wn7.LJ.getHost();
                String path = c0wn7.LJ.getPath();
                if (host == null) {
                    pair = new Pair(Boolean.FALSE, "cct");
                } else {
                    Iterator<PnsMigrateItem> it3 = C0WNB.LIZ().items.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            PnsMigrateItem pnsMigrateItem = next;
                            boolean zLIZIZ = C1942007j8.LIZIZ(host, Collections.singletonList(pnsMigrateItem.host));
                            if (pnsMigrateItem.path.length() == 0) {
                                if (zLIZIZ) {
                                    break;
                                }
                            } else if (path != null && u.LJJIIJZLJL(path, pnsMigrateItem.path, false) && zLIZIZ) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    PnsMigrateItem pnsMigrateItem2 = next;
                    if (pnsMigrateItem2 == null) {
                        pair = new Pair(Boolean.FALSE, "cct");
                    } else {
                        Iterator<String> it4 = pnsMigrateItem2.dfidAllowList.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            String next2 = it4.next();
                            if (Intrinsics.LJFF(next2, String.valueOf(i))) {
                                if (next2 != null) {
                                    pair = new Pair(Boolean.FALSE, "cct");
                                }
                            }
                        }
                        if (C1942007j8.LIZIZ(host, pnsMigrateItem2.hostAllowList)) {
                            pair = new Pair(Boolean.FALSE, "cct");
                        } else {
                            pair = new Pair(Boolean.TRUE, pnsMigrateItem2.type);
                        }
                    }
                }
                if (!((Boolean) pair.getFirst()).booleanValue()) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, "onelink");
                jSONObject.put("blocked", C0WNB.LIZ().blockEnable ? 1 : 0);
                jSONObject.put("path", c0wn7.LJ.getPath());
                jSONObject.put("host", c0wn7.LJ.getHost());
                jSONObject.put("dataflowId", c0wn7.LJI);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", c0wn7.LIZLLL);
                jSONObject2.put("dataflowId", c0wn7.LJI);
                boolean z = C0WNB.LIZ().blockEnable;
                C822060WMq.LIZ(this, z);
                if (z) {
                    if (Intrinsics.LJFF(pair.getSecond(), "cct")) {
                        C822100WMu.LIZ(c0wn7.LJII, c0wn7.LJI, c0wn7.LIZLLL, false);
                    } else {
                        C0VZK.LIZIZ().LIZ().LIZIZ(c0wn7.LJII, c0wn7.LJI, c0wn7.LIZLLL);
                    }
                    return new C0WM1(true, jSONObject, jSONObject2, new C821850WLv(true, C2097908Jt.LIZJ(new Pair("error", new C821880WLy(102, "uses CCT container to open instead")))));
                }
                return new C0WM1(false, jSONObject, jSONObject2, null);
            }
        }, new C0WNH() { // from class: X.0WMz
            @Override // X.C0WNH
            public final List<C0WND> LIZ() {
                return C1697810uHb.LJIIJJI(C0WND.RAW, C0WND.SPARK);
            }

            @Override // X.C0WNH
            public final boolean LIZJ() {
                return false;
            }

            public static PnsWebRouterOfflineHitModel LJFF() {
                PnsWebRouterOfflineHitModel pnsWebRouterOfflineHitModel = (PnsWebRouterOfflineHitModel) C821960WMg.LIZ(PnsWebRouterOfflineHitModel.class, "pns_webrouter_offline_hit", C0WNG.LIZ);
                return pnsWebRouterOfflineHitModel == null ? new PnsWebRouterOfflineHitModel(false, 402685958, C1697810uHb.LJIIJJI("snssdk1233.onelink.me", "snssdk1180.onelink.me", "snssdk473824.onelink.me")) : pnsWebRouterOfflineHitModel;
            }

            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("WithoutDataflowIdAction", C0WN8.ROUTER, C0WNE.L3, 50020, 16);
            }

            @Override // X.C0WMB
            public final /* bridge */ /* synthetic */ BaseGovernanceModel LIZIZ() {
                return LJFF();
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
            @Override // X.C0WMB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0WM1 LJ(X.C0WMD r11) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 234
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C822150WMz.LJ(X.0WMD):X.0WM1");
            }
        }, new C0WNH() { // from class: X.0WN0
            @Override // X.C0WNH
            public final boolean LIZJ() {
                return true;
            }

            @Override // X.C0WNH
            public final List<C0WND> LIZ() {
                return Collections.singletonList(C0WND.SPARK);
            }

            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("FirstPartyCCTAction", C0WN8.ROUTER, C0WNE.L3, 50030, 16);
            }

            @Override // X.C0WMB
            public final BaseGovernanceModel LIZIZ() {
                return C1589106Kb.LIZIZ();
            }

            @Override // X.C0WMB
            public final C0WM1 LJ(C0WMD c0wmd) {
                C0WN7 c0wn7;
                Unit unit;
                if (C1589106Kb.LIZIZ().enable) {
                    try {
                        Object objLIZ = c0wmd.LIZ();
                        if (!(objLIZ instanceof C0WN7) || (c0wn7 = (C0WN7) objLIZ) == null) {
                            return null;
                        }
                        Integer numLIZ = C1589106Kb.LIZ(c0wn7.LJ);
                        if (numLIZ != null) {
                            int iIntValue = numLIZ.intValue();
                            if (c0wn7.LJFF == EnumC822170WNb.Spark.ordinal()) {
                                C822100WMu.LIZ(c0wn7.LJII, iIntValue, c0wn7.LIZLLL, true);
                                C821850WLv c821850WLv = new C821850WLv(true, C2097908Jt.LIZJ(new Pair("error", new C821880WLy(102, "uses CCT container to open instead"))));
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(Scene.SCENE_SERVICE, "first_party_cct");
                                jSONObject.put("url", c0wn7.LIZLLL);
                                jSONObject.put("host", c0wn7.LJ.getHost());
                                jSONObject.put("dataflowId", c0wn7.LJI);
                                return new C0WM1(true, jSONObject, jSONObject, c821850WLv);
                            }
                            unit = Unit.LIZ;
                        } else {
                            unit = null;
                        }
                        C189200o6.m2constructorimpl(unit);
                        return null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                return null;
            }
        }, new C0WNH() { // from class: X.0WMw
            @Override // X.C0WNH
            public final boolean LIZJ() {
                return false;
            }

            public static PnsSparkPureShutdownModel LJFF() {
                PnsSparkPureShutdownModel pnsSparkPureShutdownModel = (PnsSparkPureShutdownModel) C821960WMg.LIZ(PnsSparkPureShutdownModel.class, "pns_sparkpure_shutdown", C1201204mw.LIZ);
                return pnsSparkPureShutdownModel == null ? new PnsSparkPureShutdownModel(false, null, null, 7, null) : pnsSparkPureShutdownModel;
            }

            @Override // X.C0WNH
            public final List<C0WND> LIZ() {
                return Collections.singletonList(C0WND.SPARK);
            }

            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("SparkPureShutdownAction", C0WN8.ROUTER, C0WNE.L3, 50040, 16);
            }

            @Override // X.C0WMB
            public final /* bridge */ /* synthetic */ BaseGovernanceModel LIZIZ() {
                return LJFF();
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
            @Override // X.C0WMB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0WM1 LJ(X.C0WMD r11) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 271
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C822120WMw.LJ(X.0WMD):X.0WM1");
            }
        }, new C0WNH() { // from class: X.0WN2
            @Override // X.C0WNH
            public final boolean LIZJ() {
                return false;
            }

            public static PnsSchemaModifierModel LJFF() {
                PnsSchemaModifierModel pnsSchemaModifierModel = (PnsSchemaModifierModel) C821960WMg.LIZ(PnsSchemaModifierModel.class, "pns_router_schema_modifier", C1277104zB.LIZ);
                if (pnsSchemaModifierModel == null) {
                    pnsSchemaModifierModel = new PnsSchemaModifierModel(false, null, 3, null);
                }
                if (pnsSchemaModifierModel.enable) {
                    pnsSchemaModifierModel.third.isEmpty();
                }
                return pnsSchemaModifierModel;
            }

            @Override // X.C0WNH
            public final List<C0WND> LIZ() {
                return Collections.singletonList(C0WND.SPARK);
            }

            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("SchemaModifyAction", C0WN8.ROUTER, C0WNE.L2, 10010, 16);
            }

            @Override // X.C0WMB
            public final /* bridge */ /* synthetic */ BaseGovernanceModel LIZIZ() {
                return LJFF();
            }

            @Override // X.C0WMB
            public final C0WM1 LJ(C0WMD c0wmd) throws JSONException {
                C0WN7 c0wn7;
                PnsSchemaModifierModel pnsSchemaModifierModelLJFF = LJFF();
                Object objLIZ = c0wmd.LIZ();
                if ((objLIZ instanceof C0WN7) && (c0wn7 = (C0WN7) objLIZ) != null && pnsSchemaModifierModelLJFF.enable && (!pnsSchemaModifierModelLJFF.third.isEmpty())) {
                    String str = c0wn7.LIZLLL;
                    int i = c0wn7.LJI;
                    Iterator<ModifyConfigModel> it3 = pnsSchemaModifierModelLJFF.third.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        ModifyConfigModel next = it3.next();
                        String str2 = next.dataflowId;
                        String strValueOf = String.valueOf(i);
                        if (str2 == null || str2.length() == 0 || Intrinsics.LJFF(str2, strValueOf)) {
                            String str3 = next.source;
                            if (str3 == null || str3.length() == 0 || Intrinsics.LJFF(str3, null)) {
                                if (C1277104zB.LIZ(next.sourceUrl, null) && C1277104zB.LIZ(next.targetUrl, str)) {
                                    if (next.params != null) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put(Scene.SCENE_SERVICE, "schemaModify");
                                        jSONObject.put("blocked", 1);
                                        jSONObject.put("host", c0wn7.LJ.getHost());
                                        jSONObject.put("path", c0wn7.LJ.getPath());
                                        jSONObject.put("dataflowId", c0wn7.LJI);
                                        Pair[] pairArr = new Pair[1];
                                        Map<String, String> mapLJ = next.params.params;
                                        if (mapLJ == null) {
                                            mapLJ = C2097608Jq.LJ();
                                        }
                                        pairArr[0] = new Pair("add_params", mapLJ);
                                        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                                        C821850WLv c821850WLv = new C821850WLv(false, null);
                                        c821850WLv.LJ = new C821780WLo(EnumC821690WLf.WEB_ROUTER_SCHEME_MODIFY, mapLJIIJ);
                                        return new C0WM1(false, jSONObject, null, c821850WLv);
                                    }
                                }
                            }
                        }
                    }
                }
                return null;
            }
        }, new C0WNH() { // from class: X.0WN3
            @Override // X.C0WNH
            public final boolean LIZJ() {
                return true;
            }

            @Override // X.C0WNH
            public final List<C0WND> LIZ() {
                return Collections.singletonList(C0WND.ALL);
            }

            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("GlobalSeclinkAction", C0WN8.ROUTER, C0WNE.L2, 10020, 16);
            }

            @Override // X.C0WMB
            public final BaseGovernanceModel LIZIZ() {
                return C1589306Kd.LIZ();
            }

            @Override // X.C0WMB
            public final C0WM1 LJ(C0WMD c0wmd) {
                C0WN7 c0wn7;
                Map map;
                Object obj;
                Object obj2;
                String str;
                String next;
                Object objLIZ = c0wmd.LIZ();
                if (!(objLIZ instanceof C0WN7) || (c0wn7 = (C0WN7) objLIZ) == null || !C1589306Kd.LIZ().enable) {
                    return null;
                }
                Object obj3 = c0wn7.LIZ.LJFF.get("web_params");
                if (obj3 instanceof Map) {
                    map = (Map) obj3;
                } else {
                    map = null;
                }
                if (map != null) {
                    obj = map.get("need_sec_link");
                } else {
                    obj = null;
                }
                if (!(obj instanceof Boolean)) {
                    obj = null;
                }
                if (map != null) {
                    obj2 = map.get("sec_link_scene");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(obj, Boolean.FALSE)) {
                    return null;
                }
                int i = c0wn7.LJI;
                List<String> list = C1589306Kd.LIZ().dfidWhiteList;
                if (list != null) {
                    Iterator<String> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(next, String.valueOf(i))) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                } else {
                    next = null;
                }
                if (next != null) {
                    return null;
                }
                String host = c0wn7.LJ.getHost();
                if (host == null) {
                    host = "";
                }
                List list2 = C1589306Kd.LIZ().urlWhiteList;
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                if (C1942007j8.LIZIZ(host, list2)) {
                    return null;
                }
                Pair[] pairArr = new Pair[1];
                Pair[] pairArr2 = new Pair[2];
                pairArr2[0] = new Pair("need_sec_link", "1");
                if (str == null || str.length() == 0) {
                    str = "spark_default";
                }
                pairArr2[1] = new Pair("sec_link_scene", str);
                pairArr[0] = new Pair("add_params", C2097608Jq.LJIIJ(pairArr2));
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                C821850WLv c821850WLv = new C821850WLv(false, null);
                c821850WLv.LJ = new C821780WLo(EnumC821690WLf.WEB_ROUTER_SECLINK_OPEN_DEFAULT_GLOBALLY, mapLJIIJ);
                return new C0WM1(false, null, null, c821850WLv);
            }
        }).iterator();
        while (it2.hasNext()) {
            LIZLLL((C0WNH) it2.next());
        }
        LJ();
    }

    @Override // X.C0WMA, X.C0WMC
    public final C0WM1 LIZ(C0WMD c0wmd) throws JSONException {
        C821850WLv c821850WLv;
        String str;
        C0WNX c0wnx;
        C0WM1 c0wm1LIZ = super.LIZ(c0wmd);
        C0WN7 c0wn7 = ((C822330WNr) c0wmd).LIZ;
        if (!(c0wn7 instanceof C0WN7)) {
            c0wn7 = null;
        }
        if (c0wm1LIZ != null && c0wn7 != null && (c821850WLv = c0wm1LIZ.LIZLLL) != null && c821850WLv.LIZ && (str = c0wn7.LJIIIZ) != null && str.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "anti_deterioration");
            jSONObject.put("uiType", c0wn7.LJIIJ);
            String strSubstring = c0wn7.LIZLLL;
            List<String> list = C2348209Ia.LIZ;
            int iLJJIZ = a0.LJJIZ(strSubstring, '?', 0, false, 6);
            if (iLJJIZ != -1) {
                strSubstring = strSubstring.substring(0, iLJJIZ);
            }
            jSONObject.put("host", strSubstring);
            C0VZK.LIZIZ().monitorEvent("pns_hybrid_dm_shutdown", jSONObject, null, null);
            C0WNM c0wnm = this.LIZ;
            if (c0wnm != null && (c0wnx = c0wnm.LIZIZ) != null) {
                c0wnx.LIZ(c0wn7.LJIIIZ);
            }
        }
        return c0wm1LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    @Override // X.C0WMA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C0WNH> LIZIZ(X.C0WMD r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C822110WMv.LIZIZ(X.0WMD):java.util.List");
    }

    public final void LIZLLL(C0WNH c0wnh) {
        C0WMA.LIZJ(c0wnh);
        Iterator<C0WND> it2 = c0wnh.LIZ().iterator();
        while (it2.hasNext()) {
            int i = C0WNC.LIZ[it2.next().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                ((ArrayList) this.LIZJ).add(c0wnh);
                                ((ArrayList) this.LIZLLL).add(c0wnh);
                                ((ArrayList) this.LJ).add(c0wnh);
                                ((ArrayList) this.LJFF).add(c0wnh);
                            }
                        } else {
                            ((ArrayList) this.LIZJ).add(c0wnh);
                        }
                    } else {
                        ((ArrayList) this.LJFF).add(c0wnh);
                    }
                } else {
                    ((ArrayList) this.LJ).add(c0wnh);
                }
            } else {
                ((ArrayList) this.LIZLLL).add(c0wnh);
            }
        }
    }
}

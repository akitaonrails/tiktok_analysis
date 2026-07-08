package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModel;
import com.ss.android.ugc.effectmanager.effect.model.AssetParentType;
import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13R4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13R4 extends C13OD<AssetPanelModel, AssetPanelResponse> {
    public final C13RD LIZ;
    public final MixedAssetsQueryAdditionalParameters LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final MixedAssetsRequestBodyInfo LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final C01GW LJIIIZ;

    @Override // X.C13OD
    public final int getFailCode() {
        return 10002;
    }

    public final boolean LIZIZ() {
        return ((Boolean) this.LJIIIZ.getValue()).booleanValue();
    }

    @Override // X.C13OD
    public final C0XSU buildRequest() throws Throwable {
        String strLIZIZ;
        String strLIZIZ2;
        C20008813Qo c20008813QoLJIILIIL;
        HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
        if (LIZIZ()) {
            mapLIZ.remove("access_key");
            String str = this.LIZIZ.creation_id;
            if (str == null) {
                str = "";
            }
            mapLIZ.put("creation_id", str);
            String str2 = this.LIZIZ.category_key;
            if (str2 != null && str2.length() > 0) {
                mapLIZ.put("category_key", str2);
            }
        } else {
            mapLIZ.putAll(C13RC.LIZIZ(this.LIZIZ));
        }
        if (LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/asset/api/");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append("/panel/");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "/asset/panel/";
        }
        C13DA c13da = new C13DA();
        c13da.put("panel", this.LIZLLL);
        c13da.put("cursor", Integer.valueOf(this.LJ));
        c13da.put("count", Integer.valueOf(this.LJFF));
        try {
            if (LIZIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LIZLLL);
                sbLIZ2.append("__api");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ2 = this.LIZLLL;
            }
            String strLIZLLL = C13OQ.LIZLLL(this.LJ, this.LJFF, strLIZIZ2, this.LJI.defaultCategoryKey);
            InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
            if (interfaceC20004513Ox != null && (c20008813QoLJIILIIL = interfaceC20004513Ox.LJIILIIL(strLIZLLL)) != null) {
                String strLJIIIZ = C13SB.LJIIIZ(c20008813QoLJIILIIL);
                if (strLJIIIZ != null) {
                    c13da.put("loki_version", strLJIIIZ);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C13RB c13rb = this.LIZ.LJJJLL;
        if (c13rb != null) {
            c13da.put("effective_connection_type", Integer.valueOf(c13rb.LIZ()));
        }
        try {
            c13da.putAll(C13RC.LIZJ(this.LJI));
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            cancel();
            runOnMainThread(new AwS431S0200000_30(this.LIZ.LJJJIL.LIZ(this.LJII), (C13MA<AssetPanelResponse>) e2, (CancellationException) 107));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("cancel request task \n ");
            sbLIZ3.append(Log.getStackTraceString(e2));
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (LIZIZ()) {
            String str3 = this.LIZ.LIZ;
            c13da.put("access_key", str3 != null ? str3 : "");
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(this.LIZIZ.protocol_version);
            c13da.put("protocol_version", Integer.valueOf(numLJIIJJI != null ? numLJIIJJI.intValue() : 0));
            c13da.put("feature_codes", C13RC.LIZ(this.LIZIZ.feature_list.getSecond()));
            c13da.put("feature_list", C13RC.LIZ(this.LIZIZ.feature_list.getFirst()));
            String str4 = this.LJI.accountType;
            if (str4 != null) {
                Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(str4);
                c13da.put("account_type", Integer.valueOf(numLJIIJJI2 != null ? numLJIIJJI2.intValue() : 0));
            }
        }
        Map mapBuild = c13da.build();
        Object obj = mapBuild.get("zip_binary");
        Map mapLIZJ = obj != null ? C2097908Jt.LIZJ(new Pair("zip_binary", obj)) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapBuild.entrySet()) {
            if (!Intrinsics.LJFF(entry.getKey(), "zip_binary")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(this.LIZ.LJJIIJZLJL);
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append(this.LIZLLL);
        return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ4)), null, C0XSV.POST, linkedHashMap, mapLIZJ != null ? "multipart/form-data" : "application/json", true, null, mapLIZJ, 330);
    }

    @Override // X.C13OD, X.AbstractC20000013Ne
    public final void execute() {
        Object c098200Yq;
        if (this.LJIIIIZZ) {
            try {
                c098200Yq = LIZ();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            AssetPanelResponse assetPanelResponse = (AssetPanelResponse) c098200Yq;
            if (assetPanelResponse != null) {
                runOnMainThread(new AwS431S0200000_30(this, assetPanelResponse, 103));
                return;
            }
        }
        super.execute();
    }

    @Override // X.C13OD
    public final int getRetryCount() {
        return this.LIZ.LJIILL;
    }

    public final AssetPanelResponse LIZ() {
        String strLIZIZ;
        if (LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append("__api");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = this.LIZLLL;
        }
        return C13O2.LIZIZ(strLIZIZ, this.LJI.defaultCategoryKey, this.LJ, this.LJFF, this.LIZ);
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        List<Asset> list;
        AssetPanelResponse assetPanelResponse = (AssetPanelResponse) c13r7.LIZ.convertJsonToObj(str, AssetPanelResponse.class);
        AssetPanelModel data = assetPanelResponse.getData();
        if (data != null && (list = data.asset_list) != null) {
            ArrayList arrayList = new ArrayList();
            for (Asset asset : list) {
                if (asset.getAsset_parent_type() == AssetParentType.EFFECT.getValue()) {
                    arrayList.add(asset);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C13O2.LIZJ(this.LIZ.LJII, this.LIZLLL, (Asset) it2.next());
            }
        }
        return assetPanelResponse;
    }

    @Override // X.C13OD
    public final void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
        c1662010tLr.LIZ(str, this.LIZ.LJJIIJZLJL, str2);
        super.onFailure(str, str2, c1662010tLr);
    }

    @Override // X.C13OD
    public final void onSuccess(long j, long j2, long j3, String str, C13OE c13oe) {
        String strLIZIZ;
        String str2;
        String strLIZIZ2;
        AssetPanelModel data;
        List<CategoryInfo> list;
        AssetPanelResponse assetPanelResponse = (AssetPanelResponse) c13oe;
        boolean z = true;
        if (Intrinsics.LJFF(this.LIZLLL, "tt_template") && assetPanelResponse.getStatus_code() == 0 && (data = assetPanelResponse.getData()) != null && (list = data.category_list) != null && (!list.isEmpty())) {
            z = false;
        }
        if (!Intrinsics.LJFF(assetPanelResponse.getUpdated(), Boolean.TRUE) && z) {
            try {
                AssetPanelResponse assetPanelResponseLIZ = LIZ();
                if (assetPanelResponseLIZ != null) {
                    assetPanelResponseLIZ.setUpdated(Boolean.FALSE);
                    runOnMainThread(new AwS431S0200000_30(this, assetPanelResponseLIZ, 59));
                    return;
                }
                throw new Exception("No cache result");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                runOnMainThread(new AwS431S0200000_30(this, e, 63));
                return;
            }
        }
        assetPanelResponse.setLogId(this.logId);
        runOnMainThread(new AwS431S0200000_30(this, assetPanelResponse, 109));
        if (LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append("__api");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = this.LIZLLL;
        }
        String strLIZJ = C13OQ.LIZJ(this.LJ, this.LJFF, strLIZIZ, this.LJI.defaultCategoryKey);
        try {
            C13R7 c13r7 = this.LIZ.LJIJI;
            if (c13r7 != null) {
                String strConvertObjToJson = c13r7.LIZ.convertObjToJson(assetPanelResponse);
                if (strConvertObjToJson != null) {
                    InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
                    if (interfaceC20004513Ox != null) {
                        interfaceC20004513Ox.LJIIJ(strLIZJ, strConvertObjToJson, "");
                    }
                    AssetPanelModel data2 = assetPanelResponse.getData();
                    if (data2 != null && (str2 = data2.loki_version) != null) {
                        if (LIZIZ()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(this.LIZLLL);
                            sbLIZ2.append("__api");
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        } else {
                            strLIZIZ2 = this.LIZLLL;
                        }
                        String strLIZLLL = C13OQ.LIZLLL(this.LJ, this.LJFF, strLIZIZ2, this.LJI.defaultCategoryKey);
                        InterfaceC20004513Ox interfaceC20004513Ox2 = this.LIZ.LJJIFFI;
                        if (interfaceC20004513Ox2 != null) {
                            interfaceC20004513Ox2.LJIIJ(strLIZLLL, str2, "");
                        }
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public C13R4(C13RD c13rd, MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, String str3, boolean z) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str3, c13rd);
        this.LIZ = c13rd;
        this.LIZIZ = mixedAssetsQueryAdditionalParameters;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = mixedAssetsRequestBodyInfo;
        this.LJII = str3;
        this.LJIIIIZZ = z;
        this.LJIIIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 432));
    }
}

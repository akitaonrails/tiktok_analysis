package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.AssetParentType;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13R5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13R5 extends C13OD<AssetCategoryModel, AssetCategoryResponse> {
    public static final Set<String> LJIIJ = C13LQ.LJLIIL(new String[]{"celebration", "feature_celebration"});
    public final C13RD LIZ;
    public final MixedAssetsQueryAdditionalParameters LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;
    public final MixedAssetsRequestBodyInfo LJII;
    public final String LJIIIIZZ;
    public final C01GW LJIIIZ;

    @Override // X.C13OD
    public final int getFailCode() {
        return 10002;
    }

    public final boolean LIZ() {
        return ((Boolean) this.LJIIIZ.getValue()).booleanValue();
    }

    @Override // X.C13OD
    public final C0XSU buildRequest() throws Throwable {
        String strLIZIZ;
        String strLIZIZ2;
        C20008813Qo c20008813QoLJIILIIL;
        HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
        if (LIZ()) {
            mapLIZ.remove("access_key");
            String str = this.LIZIZ.creation_id;
            if (str == null) {
                str = "";
            }
            mapLIZ.put("creation_id", str);
        } else {
            mapLIZ.putAll(C13RC.LIZIZ(this.LIZIZ));
        }
        if (LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/asset/api/");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append("/panel/");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "/asset/panel/";
        }
        C0XSV c0xsv = C0XSV.POST;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ.LJJIIJZLJL);
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(this.LIZLLL);
        sbLIZ2.append("/category/");
        sbLIZ2.append(this.LJ);
        String strLIZ = C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ2));
        C13DA c13da = new C13DA();
        c13da.put("panel", this.LIZLLL);
        c13da.put("category_key", this.LJ);
        c13da.put("cursor", Integer.valueOf(this.LJFF));
        c13da.put("count", Integer.valueOf(this.LJI));
        try {
            if (LIZ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LIZLLL);
                sbLIZ3.append("__api");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                strLIZIZ2 = this.LIZLLL;
            }
            String strLIZIZ3 = C13OQ.LIZIZ(this.LJFF, this.LJI, strLIZIZ2, this.LJ);
            InterfaceC20004513Ox interfaceC20004513Ox = this.LIZ.LJJIFFI;
            if (interfaceC20004513Ox != null && (c20008813QoLJIILIIL = interfaceC20004513Ox.LJIILIIL(strLIZIZ3)) != null) {
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
        c13da.putAll(C13RC.LIZJ(this.LJII));
        if (LIZ()) {
            String str2 = this.LIZ.LIZ;
            c13da.put("access_key", str2 != null ? str2 : "");
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(this.LIZIZ.protocol_version);
            c13da.put("protocol_version", Integer.valueOf(numLJIIJJI != null ? numLJIIJJI.intValue() : 0));
            c13da.put("feature_codes", C13RC.LIZ(this.LIZIZ.feature_list.getSecond()));
            c13da.put("feature_list", C13RC.LIZ(this.LIZIZ.feature_list.getFirst()));
        }
        return new C0XSU(strLIZ, null, c0xsv, c13da.build(), "application/json", true, null, null, 842);
    }

    @Override // X.C13OD
    public final int getRetryCount() {
        if (LJIIJ.contains(this.LIZLLL)) {
            return 1;
        }
        return this.LIZ.LJIILL;
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        List<Asset> list;
        AssetCategoryResponse assetCategoryResponse = (AssetCategoryResponse) c13r7.LIZ.convertJsonToObj(str, AssetCategoryResponse.class);
        AssetCategoryModel data = assetCategoryResponse.getData();
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
        return assetCategoryResponse;
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
        String str3;
        String strLIZIZ3;
        InterfaceC20004513Ox interfaceC20004513Ox;
        String str4;
        AssetCategoryModel data;
        AssetCategoryResponse assetCategoryResponse = (AssetCategoryResponse) c13oe;
        if (Intrinsics.LJFF(assetCategoryResponse.getUpdated(), Boolean.TRUE)) {
            assetCategoryResponse.setLogId(this.logId);
            runOnMainThread(new AwS431S0200000_30(this, assetCategoryResponse, 72));
            String strConvertObjToJson = null;
            if (this.LJII.defaultCategoryKey != null) {
                AssetCategoryModel data2 = assetCategoryResponse.getData();
                if (data2 != null) {
                    str4 = data2.category_key;
                } else {
                    str4 = null;
                }
                if (Intrinsics.LJFF(str4, this.LJ) || (data = assetCategoryResponse.getData()) == null || (str2 = data.category_key) == null) {
                    str2 = this.LJ;
                }
            } else {
                str2 = this.LJ;
            }
            if (LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append("__api");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ2 = this.LIZLLL;
            }
            String strLIZ = C13OQ.LIZ(this.LJFF, this.LJI, strLIZIZ2, str2);
            try {
                C13R7 c13r7 = this.LIZ.LJIJI;
                if (c13r7 != null) {
                    strConvertObjToJson = c13r7.LIZ.convertObjToJson(assetCategoryResponse);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (strConvertObjToJson != null && (interfaceC20004513Ox = this.LIZ.LJJIFFI) != null) {
                interfaceC20004513Ox.LJIIJ(strLIZ, strConvertObjToJson, "");
            }
            AssetCategoryModel data3 = assetCategoryResponse.getData();
            if (data3 != null && (str3 = data3.loki_version) != null) {
                if (LIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LIZLLL);
                    sbLIZ2.append("__api");
                    strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    strLIZIZ3 = this.LIZLLL;
                }
                String strLIZIZ4 = C13OQ.LIZIZ(this.LJFF, this.LJI, strLIZIZ3, this.LJ);
                InterfaceC20004513Ox interfaceC20004513Ox2 = this.LIZ.LJJIFFI;
                if (interfaceC20004513Ox2 != null) {
                    interfaceC20004513Ox2.LJIIJ(strLIZIZ4, str3, "");
                    return;
                }
                return;
            }
            return;
        }
        try {
            if (LIZ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LIZLLL);
                sbLIZ3.append("__api");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                strLIZIZ = this.LIZLLL;
            }
            AssetCategoryResponse assetCategoryResponseLIZ = C13O2.LIZ(strLIZIZ, this.LJ, this.LJFF, this.LJI, this.LIZ);
            if (assetCategoryResponseLIZ != null) {
                runOnMainThread(new AwS431S0200000_30(this, assetCategoryResponseLIZ, 75));
                return;
            }
            throw new Exception("No cache result");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            runOnMainThread(new AwS431S0200000_30(this, e2, 77));
        }
    }

    public C13R5(C13RD c13rd, MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, String str3, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, String str4) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str4, c13rd);
        this.LIZ = c13rd;
        this.LIZIZ = mixedAssetsQueryAdditionalParameters;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = mixedAssetsRequestBodyInfo;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 413));
    }
}

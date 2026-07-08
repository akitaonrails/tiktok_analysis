package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.effectmanager.effect.model.AssetItemModel;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedItemAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS431S0200000_30;

/* JADX INFO: renamed from: X.13R6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13R6 extends C13OD<AssetItemModel, AssetItemResponse> {
    public final C13RD LIZ;
    public final MixedAssetsQueryAdditionalParameters LIZIZ;
    public final String LIZJ;
    public final MixedItemAssetsRequestBodyInfo LIZLLL;
    public final String LJ;

    @Override // X.C13OD
    public final int getFailCode() {
        return 10002;
    }

    @Override // X.C13OD
    public final int getRetryCount() {
        return this.LIZ.LJIILL;
    }

    @Override // X.C13OD
    public final C0XSU buildRequest() throws Throwable {
        String strLIZIZ;
        Map mapBuild;
        boolean z = C296620Bjw.LIZ() || (this.LIZIZ.forceApiUpgrade && ((Boolean) C260640AJi.LIZ.getValue()).booleanValue());
        HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
        if (z) {
            mapLIZ.remove("access_key");
            String str = this.LIZIZ.creation_id;
            if (str == null) {
                str = "";
            }
            mapLIZ.put("creation_id", str);
            String str2 = this.LIZIZ.panel_key;
            if (str2 != null && str2.length() > 0) {
                mapLIZ.put("panel_key", str2);
            }
            String str3 = this.LIZIZ.scene;
            if (str3 != null && str3.length() > 0) {
                mapLIZ.put(Scene.SCENE_SERVICE, str3);
            }
            String str4 = this.LIZIZ.subScene;
            if (str4 != null && str4.length() > 0) {
                mapLIZ.put("sub_scene", str4);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/asset/api/");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append("/item");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            mapLIZ.putAll(C13RC.LIZIZ(this.LIZIZ));
            strLIZIZ = "/asset/item";
        }
        C0XSV c0xsv = C0XSV.POST;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ.LJJIIJZLJL);
        sbLIZ2.append(strLIZIZ);
        String strLIZ = C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ2));
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C13RC.LIZLLL(this.LIZLLL));
            String str5 = this.LIZ.LIZ;
            linkedHashMap.put("access_key", str5 != null ? str5 : "");
            linkedHashMap.put("feature_list", C13RC.LIZ(this.LIZIZ.feature_list.getFirst()));
            linkedHashMap.put("feature_codes", C13RC.LIZ(this.LIZIZ.feature_list.getSecond()));
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(this.LIZIZ.protocol_version);
            linkedHashMap.put("protocol_version", Integer.valueOf(numLJIIJJI != null ? numLJIIJJI.intValue() : 0));
            linkedHashMap.put("asset_condition_list", this.LIZLLL.assetConditionList);
            mapBuild = linkedHashMap;
        } else {
            C13DA c13da = new C13DA();
            c13da.putAll(C13RC.LIZLLL(this.LIZLLL));
            mapBuild = c13da.build();
        }
        return new C0XSU(strLIZ, null, c0xsv, mapBuild, "application/json", true, null, null, 842);
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        return (C13OE) c13r7.LIZ.convertJsonToObj(str, AssetItemResponse.class);
    }

    @Override // X.C13OD
    public final void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
        c1662010tLr.LIZ(str, this.LIZ.LJJIIJZLJL, str2);
        super.onFailure(str, str2, c1662010tLr);
    }

    public C13R6(C13RD c13rd, MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, MixedItemAssetsRequestBodyInfo mixedItemAssetsRequestBodyInfo, String str2) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str2, c13rd);
        this.LIZ = c13rd;
        this.LIZIZ = mixedAssetsQueryAdditionalParameters;
        this.LIZJ = str;
        this.LIZLLL = mixedItemAssetsRequestBodyInfo;
        this.LJ = str2;
    }

    @Override // X.C13OD
    public final void onSuccess(long j, long j2, long j3, String str, C13OE c13oe) {
        runOnMainThread(new AwS431S0200000_30((AssetItemResponse) c13oe, this, 93));
    }
}

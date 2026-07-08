package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.CommerceFeatureCenter;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IFeatureSchema;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import kotlin.jvm.internal.AFwS190S0000000_4;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0y4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843670y4r {
    public final CommerceFeatureCenter LIZ;
    public IFeatureCore LIZIZ;
    public IFeatureSchema LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(763));

    public final String LIZ() throws Exception {
        IFeatureCore iFeatureCore = this.LIZIZ;
        if (iFeatureCore != null) {
            String strTryGetValuesForRequest = iFeatureCore.createInMemoryKVStore("tiktok_ad_feature_center").tryGetValuesForRequest(Collections.singletonList("tiktok_ad_upload_features"));
            if (!(strTryGetValuesForRequest == null || strTryGetValuesForRequest.length() == 0)) {
                try {
                    return new JSONObject(strTryGetValuesForRequest).optString("tiktok_ad_upload_features", "");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1022620cia.LIZ("PitayaFeatureCenter", "[fetchUploadFeatures] parse error");
                    throw e;
                }
            }
        }
        return "";
    }

    public C1843670y4r(CommerceFeatureCenter commerceFeatureCenter) {
        this.LIZ = commerceFeatureCenter;
    }
}

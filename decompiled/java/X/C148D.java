package X;

import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IFeatureSchema;
import com.bytedance.pitaya.api.feature.IKVStore;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.pitaya.api.mutilinstance.PreHostSetupWatcher;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148D, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C148D {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1869250yk7());

    public static IFeatureCore LIZIZ() {
        if (!PreHostSetupWatcher.INSTANCE.isPreHostSetup() && !HostSetupWatcher.INSTANCE.isHostSetup()) {
            return null;
        }
        FeatureCoreFactory featureCoreFactory = FeatureCoreFactory.INSTANCE;
        C844470XAv.LIZ.getClass();
        return featureCoreFactory.getFeatureCore(String.valueOf(C844470XAv.LJIIJ));
    }

    public static void LIZ(final String str) {
        FeatureServiceManager.Companion.getClass();
        if (!C1510050pOl.LIZ().containProducer(str, 1)) {
            C1510050pOl.LIZ().addProducer(str, new FeatureProducer(str) { // from class: X.148C
                @Override // com.ss.ugc.clientai.core.api.FeatureProducer
                public final void enableProducer(List<FeatureItem> list) {
                }

                {
                    setProducerName(str);
                }

                @Override // com.ss.ugc.clientai.core.api.FeatureProducer
                public final Object getFeatureInternal(String str2, JSONObject jSONObject, String str3, ReturnCode returnCode) {
                    Object objOpt;
                    IFeatureSchema iFeatureSchemaSharedFeatureSchema;
                    JSONObject jSONObjectLIZIZ;
                    JSONObject jSONObjectLIZJ;
                    if (returnCode != null) {
                        returnCode.code = 200;
                    }
                    if (!HostSetupWatcher.INSTANCE.isHostSetup() && !PreHostSetupWatcher.INSTANCE.isPreHostSetup() && returnCode != null) {
                        returnCode.code = 4;
                    }
                    if (jSONObject != null && (objOpt = jSONObject.opt("op_type")) != null) {
                        if (!(objOpt instanceof Integer)) {
                            return null;
                        }
                        int iIntValue = ((Number) objOpt).intValue();
                        if (iIntValue != 0) {
                            if (iIntValue != 1 || (jSONObjectLIZJ = C148D.LIZJ(getProducerName(), C1697810uHb.LJIILJJIL(str2))) == null) {
                                return null;
                            }
                            return jSONObjectLIZJ.opt(str2);
                        }
                        String producerName = getProducerName();
                        List<String> listLJIILJJIL = C1697810uHb.LJIILJJIL(str2);
                        IFeatureCore iFeatureCoreLIZIZ = C148D.LIZIZ();
                        if (iFeatureCoreLIZIZ == null || (iFeatureSchemaSharedFeatureSchema = iFeatureCoreLIZIZ.sharedFeatureSchema()) == null || (jSONObjectLIZIZ = iFeatureSchemaSharedFeatureSchema.LIZIZ(producerName, listLJIILJJIL, jSONObject)) == null) {
                            return null;
                        }
                        return jSONObjectLIZIZ.opt(str2);
                    }
                    JSONObject jSONObjectLIZJ2 = C148D.LIZJ(getProducerName(), C1697810uHb.LJIILJJIL(str2));
                    if (jSONObjectLIZJ2 == null) {
                        return null;
                    }
                    return jSONObjectLIZJ2.opt(str2);
                }
            }, 1);
        }
        C1510050pOl.LIZ().getProducer(str, 1);
    }

    public static JSONObject LIZJ(String str, List list) {
        IKVStore iKVStoreCreateInMemoryKVStore;
        IFeatureCore iFeatureCoreLIZIZ = LIZIZ();
        if (iFeatureCoreLIZIZ != null && (iKVStoreCreateInMemoryKVStore = iFeatureCoreLIZIZ.createInMemoryKVStore(str)) != null) {
            return iKVStoreCreateInMemoryKVStore.getValueForKeys(list);
        }
        return null;
    }
}

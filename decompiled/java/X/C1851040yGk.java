package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IKVStore;

/* JADX INFO: renamed from: X.0yGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851040yGk {
    public static IKVStore LIZ;
    public static Integer LIZIZ = -1;
    public static Integer LIZJ = -1;

    public static IKVStore LIZ() {
        if (LIZ == null) {
            IFeatureCore featureCore = FeatureCoreFactory.INSTANCE.getFeatureCore(String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId()));
            LIZ = featureCore != null ? featureCore.createKVStore("live_disk_cleanup") : null;
        }
        return LIZ;
    }
}

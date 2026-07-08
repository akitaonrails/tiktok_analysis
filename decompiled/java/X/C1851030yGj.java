package X;

import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851030yGj extends C09AY implements Function0<InterfaceC1610880s1O> {
    public C1851030yGj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1610880s1O invoke() {
        FeatureCoreFactory featureCoreFactory = FeatureCoreFactory.INSTANCE;
        C844470XAv.LIZ.getClass();
        IFeatureCore featureCore = featureCoreFactory.getFeatureCore(String.valueOf(C844470XAv.LJIIJ));
        if (featureCore != null) {
            return featureCore.getCepCore();
        }
        return null;
    }
}

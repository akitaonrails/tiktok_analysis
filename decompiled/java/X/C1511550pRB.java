package X;

import com.ss.android.ugc.aweme.ml.ab.SmartLivePreviewStreamConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartLivePreviewStreamExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pRB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511550pRB extends C09AY implements Function0<SmartLivePreviewStreamConfig> {
    public C1511550pRB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ml.ab.SmartLivePreviewStreamConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SmartLivePreviewStreamConfig invoke() {
        return C0C64.LJIILLIIL().LJJII(SmartLivePreviewStreamConfig.class, SmartLivePreviewStreamExperiment.DEFAULT_MODEL, SmartLivePreviewStreamExperiment.SCENE, true);
    }
}

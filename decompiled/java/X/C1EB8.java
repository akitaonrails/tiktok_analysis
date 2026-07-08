package X;

import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EB8, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EB8 extends C09AY implements Function0<Boolean> {
    public C1EB8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((GuideOutPushExperiment.LIZ().featureExp & 4) != 0);
    }
}

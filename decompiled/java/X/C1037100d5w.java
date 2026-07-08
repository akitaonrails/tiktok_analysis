package X;

import com.ss.android.ugc.aweme.ad.preload.prewarm.LandPageWarmV2Experiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0d5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037100d5w extends C09AY implements Function0<Long> {
    public C1037100d5w() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(LandPageWarmV2Experiment.LIZ().taskInterval > 0 ? LandPageWarmV2Experiment.LIZ().taskInterval : 2000L);
    }
}

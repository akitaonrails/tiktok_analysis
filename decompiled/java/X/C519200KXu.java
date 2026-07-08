package X;

import com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade.LiveInnerFlowDowngradePipeline;
import com.bytedance.android.livesdk.performancetune.strategy.model.CommonDecisionConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519200KXu extends C09AY implements Function0<CommonDecisionConfig> {
    public C519200KXu() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CommonDecisionConfig invoke() {
        LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline = LiveInnerFlowDowngradePipeline.LIZ;
        return LiveInnerFlowDowngradePipeline.LIZJ().activeDecisionConfig;
    }
}

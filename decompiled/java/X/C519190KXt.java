package X;

import com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade.LiveInnerFlowDowngradePipeline;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519190KXt extends C09AY implements Function0<Set<? extends String>> {
    public C519190KXt() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline = LiveInnerFlowDowngradePipeline.LIZ;
        return C13LP.LLIIJI(LiveInnerFlowDowngradePipeline.LIZJ().activeDecisionBizList);
    }
}

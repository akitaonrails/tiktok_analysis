package X;

import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogMonitorExperiment;
import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogMonitorExperimentModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Bfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210681Bfe extends C09AY implements Function0<AppLogMonitorExperimentModel> {
    public C2210681Bfe() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.ugc.statisticlogger.experiment.AppLogMonitorExperimentModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AppLogMonitorExperimentModel invoke() {
        ?? LJJII = C0C64.LJIILLIIL().LJJII(AppLogMonitorExperimentModel.class, AppLogMonitorExperiment.DEFAULT_GROUP, "applog_monitor", true);
        return LJJII == 0 ? AppLogMonitorExperiment.INSTANCE.getDEFAULT_GROUP() : LJJII;
    }
}

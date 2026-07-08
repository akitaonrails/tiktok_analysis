package X;

import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogFilterOptExperiment;
import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogFilterOptExperimentModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211151BgP extends C09AY implements Function0<AppLogFilterOptExperimentModel> {
    public C2211151BgP() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.ugc.statisticlogger.experiment.AppLogFilterOptExperimentModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AppLogFilterOptExperimentModel invoke() {
        ?? LJJII = C0C64.LJIILLIIL().LJJII(AppLogFilterOptExperimentModel.class, AppLogFilterOptExperiment.DEFAULT_GROUP, "applog_filter_opt_config", true);
        return LJJII == 0 ? AppLogFilterOptExperiment.INSTANCE.getDEFAULT_GROUP() : LJJII;
    }
}

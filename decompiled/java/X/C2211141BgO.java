package X;

import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogDBOptExperiment;
import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogDBOptExperimentModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211141BgO extends C09AY implements Function0<AppLogDBOptExperimentModel> {
    public C2211141BgO() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.ugc.statisticlogger.experiment.AppLogDBOptExperimentModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AppLogDBOptExperimentModel invoke() {
        ?? LJJII = C0C64.LJIILLIIL().LJJII(AppLogDBOptExperimentModel.class, AppLogDBOptExperiment.DEFAULT_GROUP, "applog_db_opt_config", true);
        return LJJII == 0 ? AppLogDBOptExperiment.INSTANCE.getDEFAULT_GROUP() : LJJII;
    }
}

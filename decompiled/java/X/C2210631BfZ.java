package X;

import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogNetworkLaunchOptExperiment;
import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogNetworkLaunchOptExperimentModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210631BfZ extends C09AY implements Function0<AppLogNetworkLaunchOptExperimentModel> {
    public C2210631BfZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.ugc.statisticlogger.experiment.AppLogNetworkLaunchOptExperimentModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AppLogNetworkLaunchOptExperimentModel invoke() {
        ?? LJJII = C0C64.LJIILLIIL().LJJII(AppLogNetworkLaunchOptExperimentModel.class, AppLogNetworkLaunchOptExperiment.DEFAULT_GROUP, "applog_network_launch_opt_config", true);
        return LJJII == 0 ? AppLogNetworkLaunchOptExperiment.INSTANCE.getDEFAULT_GROUP() : LJJII;
    }
}

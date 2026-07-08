package X;

import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogBlockListExp;
import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogBlockListExpModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Bfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210671Bfd extends C09AY implements Function0<AppLogBlockListExpModel> {
    public C2210671Bfd() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.ugc.statisticlogger.experiment.AppLogBlockListExpModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AppLogBlockListExpModel invoke() {
        ?? LJJII = C0C64.LJIILLIIL().LJJII(AppLogBlockListExpModel.class, AppLogBlockListExp.DEFAULT_GROUP, "applog_block_config", true);
        return LJJII == 0 ? AppLogBlockListExp.INSTANCE.getDEFAULT_GROUP() : LJJII;
    }
}

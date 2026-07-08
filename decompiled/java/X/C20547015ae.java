package X;

import com.ss.android.ugc.aweme.experiment.ApplogEventAllowKeysModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20547015ae extends C09AY implements Function0<ApplogEventAllowKeysModel> {
    public C20547015ae() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.ApplogEventAllowKeysModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ApplogEventAllowKeysModel invoke() {
        ?? LJJIIJ = C0C64.LJIILLIIL().LJJIIJ(true, "applog_event_allow_keys_config", 31744, ApplogEventAllowKeysModel.class, C20546915ad.LIZ, 2);
        return LJJIIJ == 0 ? new ApplogEventAllowKeysModel(true, true, true, 100, C2097608Jq.LJ(), null) : LJJIIJ;
    }
}

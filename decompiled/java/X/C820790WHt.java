package X;

import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysExp;
import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WHt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820790WHt extends C09AY implements Function0<ApplogAllowKeysModel> {
    public C820790WHt() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.ApplogAllowKeysModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ApplogAllowKeysModel invoke() {
        ?? LJJIIJ = C0C64.LJIILLIIL().LJJIIJ(true, "applog_allow_keys_config", 31744, ApplogAllowKeysModel.class, ApplogAllowKeysExp.LIZ, 2);
        return LJJIIJ == 0 ? new ApplogAllowKeysModel(false, null, null, null, 15, null) : LJJIIJ;
    }
}

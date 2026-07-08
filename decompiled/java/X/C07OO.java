package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07OO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07OO extends C09AY implements Function0<Integer> {
    public C07OO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int i;
        if (((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJFF()) {
            i = -1;
        } else {
            C2503209rS.LIZ.getClass();
            i = C2503209rS.LIZ().getInt("hybridkit_config_opt", 0);
        }
        return Integer.valueOf(i);
    }
}

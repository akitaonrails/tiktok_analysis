package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.070S, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C070S extends C09AY implements Function0<Boolean> {
    public C070S() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJJIJIL() && C070Q.LIZ());
    }
}

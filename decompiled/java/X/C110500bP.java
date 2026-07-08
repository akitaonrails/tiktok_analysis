package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00bP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C110500bP extends C09AY implements Function0<IStrategyApi> {
    public C110500bP() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.strategy.api.IStrategyApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IStrategyApi invoke() {
        return ServiceManager.get().getService(IStrategyApi.class);
    }
}

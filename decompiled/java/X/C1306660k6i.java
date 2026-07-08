package X;

import com.bytedance.android.starship.strategy.repository.StrategyApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306660k6i extends C09AY implements Function0<StrategyApi> {
    public C1306660k6i() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.starship.strategy.repository.StrategyApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final StrategyApi invoke() {
        return C1307940k8m.LIZ.getNetworkService().LIZIZ(StrategyApi.class);
    }
}

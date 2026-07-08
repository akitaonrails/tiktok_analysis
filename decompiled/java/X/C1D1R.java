package X;

import com.bytedance.android.starship.strategy.option.StrategyStabilityConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1D1R, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D1R extends C09AY implements Function0<Boolean> {
    public C1D1R() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(!(((StrategyStabilityConfig[]) C1D1Q.LIZIZ.getValue()).length == 0));
    }
}

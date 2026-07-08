package X;

import com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategyNodeConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.0j6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1268360j6w {
    public final StrategyNodeConfig LIZ;
    public InterfaceC1268370j6x LIZIZ;

    public void LIZ() {
    }

    public abstract C1268290j6p LIZJ(Map<String, Object> map);

    public final String LIZIZ() {
        StrategyNodeConfig strategyNodeConfig = this.LIZ;
        return strategyNodeConfig != null ? strategyNodeConfig.name : "";
    }

    public AbstractC1268360j6w(StrategyNodeConfig strategyNodeConfig) {
        this.LIZ = strategyNodeConfig;
    }
}

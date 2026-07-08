package X;

import com.bytedance.android.btm.api.config.BcmChainEventConfig;
import com.bytedance.android.btm.api.config.BcmChainInLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18BN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BN extends C09AY implements Function0<Map<String, ? extends BcmChainEventConfig>> {
    public final /* synthetic */ C18BM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18BN(C18BM c18bm) {
        super(0);
        this.LL = c18bm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends BcmChainEventConfig> invoke() {
        BcmChainInLogger bcmChainInLoggerLIZ = C21244618Bw.LIZ();
        if (!this.LL.LIZIZ) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (BcmChainEventConfig bcmChainEventConfig : bcmChainInLoggerLIZ.LJFF()) {
            if (bcmChainEventConfig.LIZJ() < 0) {
                bcmChainEventConfig.LJFF(bcmChainInLoggerLIZ.LIZLLL());
            }
            linkedHashMap.put(bcmChainEventConfig.LJ(), bcmChainEventConfig);
        }
        return linkedHashMap;
    }
}

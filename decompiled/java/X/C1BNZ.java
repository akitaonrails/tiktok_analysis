package X;

import com.bytedance.pia.core.setting.Config;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BNZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BNZ extends C09AY implements Function0<Set<? extends String>> {
    public final /* synthetic */ Config LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BNZ(Config config) {
        super(0);
        this.LL = config;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        Config config = this.LL;
        return config.isFromMock ? config.expectedFeatures : C13LP.LJJL(C2203961BNq.LIZ().enabledFeatures, this.LL.expectedFeatures);
    }
}

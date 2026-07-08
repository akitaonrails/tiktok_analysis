package X;

import com.bytedance.pia.core.setting.Settings;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203951BNp extends C09AY implements Function0<Map<String, ? extends Boolean>> {
    public final /* synthetic */ Settings LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2203951BNp(Settings settings) {
        super(0);
        this.LL = settings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends Boolean> invoke() {
        return C2097608Jq.LJIIIIZZ(new Pair("main", Boolean.valueOf(this.LL.isPiaEnabled)), new Pair("boot", Boolean.valueOf(this.LL.isBootEnabled)), new Pair("worker", Boolean.valueOf(this.LL.isWorkerEnabled)), new Pair("cache", Boolean.valueOf(this.LL.isCacheEnabled)));
    }
}

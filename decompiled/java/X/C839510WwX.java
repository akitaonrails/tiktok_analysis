package X;

import com.bytedance.crash.Npth;
import com.bytedance.pumbaa.ruler.adapter.api.RuleEngineConfig;
import com.google.gson.n;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839510WwX extends C09AY implements Function0<C839590Wwf> {
    public final /* synthetic */ RuleEngineConfig LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C839510WwX(RuleEngineConfig ruleEngineConfig) {
        super(0);
        this.LL = ruleEngineConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C839590Wwf invoke() {
        n nVar = C308500C7k.LIZ;
        n nVar2 = C308500C7k.LIZ;
        n nVar3 = (n) C308480C7i.LIZLLL(n.class, "rule_engine_strategy_sets_android_from_msc", nVar2);
        if (nVar3 != null) {
            nVar2 = nVar3;
        }
        Npth.addTag("GPCP_version", C2399609ak.LIZJ(nVar2, "signature"));
        return new C839590Wwf(this.LL, nVar2);
    }
}

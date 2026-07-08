package X;

import com.bytedance.helios.network.api.config.NetworkConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840810Wyd extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC823460WSa LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ NetworkConfig LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C840810Wyd(InterfaceC823460WSa interfaceC823460WSa, String str, NetworkConfig networkConfig) {
        super(0);
        this.LL = interfaceC823460WSa;
        this.LLILLJJLI = str;
        this.LLILLL = networkConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" \n========================================================(RuleEngineManger)\nRuleEngineManger handleEvent(skip) id:");
        sbLIZ.append(this.LL.LIZ().LIZ.LIZ);
        sbLIZ.append(" uuid:");
        sbLIZ.append(this.LL.LIZ().LJJIII);
        sbLIZ.append(" pipelineType:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" enableFuseEngineControl:");
        NetworkConfig networkConfig = this.LLILLL;
        sbLIZ.append(networkConfig != null ? Boolean.valueOf(networkConfig.enableFuseEngineControl) : null);
        sbLIZ.append(" enableGuardEngineControl:");
        NetworkConfig networkConfig2 = this.LLILLL;
        sbLIZ.append(networkConfig2 != null ? Boolean.valueOf(networkConfig2.enableGuardEngineControl) : null);
        sbLIZ.append(" isFilter:");
        sbLIZ.append(this.LL.LIZ().LJJIFFI.LIZ);
        sbLIZ.append("\n ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

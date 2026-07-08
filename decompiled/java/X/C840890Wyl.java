package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840890Wyl extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC823460WSa LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C840890Wyl(InterfaceC823460WSa interfaceC823460WSa, String str, Map<String, Object> map) {
        super(0);
        this.LL = interfaceC823460WSa;
        this.LLILLJJLI = str;
        this.LLILLL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" \n========================================================(RuleEngineManger)\nRuleEngineManger id:");
        sbLIZ.append(this.LL.LIZ().LIZ.LIZ);
        sbLIZ.append(" uuid:");
        sbLIZ.append(this.LL.LIZ().LJJIII);
        sbLIZ.append(" pipelineType:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("\nparams:");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

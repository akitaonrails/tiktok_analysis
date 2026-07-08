package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840910Wyn extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC823460WSa LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C840910Wyn(InterfaceC823460WSa interfaceC823460WSa, String str) {
        super(0);
        this.LL = interfaceC823460WSa;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RuleEngineManger id:");
        sbLIZ.append(this.LL.LIZ().LIZ.LIZ);
        sbLIZ.append(" uuid:");
        sbLIZ.append(this.LL.LIZ().LJJIII);
        sbLIZ.append(" pipelineType:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("\nhandleResult:");
        sbLIZ.append(this.LL.LIZ().LJJIFFI);
        sbLIZ.append("\n========================================================");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

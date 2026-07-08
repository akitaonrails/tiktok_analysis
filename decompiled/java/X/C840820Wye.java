package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840820Wye extends C09AY implements Function0<String> {
    public final /* synthetic */ C840710WyT LL;
    public final /* synthetic */ InterfaceC823460WSa LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C840820Wye(C840710WyT c840710WyT, InterfaceC823460WSa interfaceC823460WSa, String str) {
        super(0);
        this.LL = c840710WyT;
        this.LLILLJJLI = interfaceC823460WSa;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkReportManager.handleReport isReport:");
        sbLIZ.append(!this.LL.LJIJI.isEmpty());
        sbLIZ.append(" id:");
        sbLIZ.append(this.LLILLJJLI.LIZ().LIZ.LIZ);
        sbLIZ.append(" uuid:");
        sbLIZ.append(this.LLILLJJLI.LIZ().LJJIII);
        sbLIZ.append(" pipelineType:");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" reportTags:");
        sbLIZ.append(this.LL.LJIJI);
        sbLIZ.append(" monitorScenes:");
        sbLIZ.append(this.LL.LJIJ);
        sbLIZ.append(" \nhandleResult:");
        sbLIZ.append(this.LL.LJJIFFI);
        sbLIZ.append(" sampleRateModel:");
        sbLIZ.append(this.LL.LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

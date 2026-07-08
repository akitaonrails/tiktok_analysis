package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841100Wz6 extends C09AY implements Function0<String> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ C840660WyO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C841100Wz6(C238400w2 c238400w2, C840660WyO c840660WyO) {
        super(0);
        this.LL = c238400w2;
        this.LLILLJJLI = c840660WyO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" \n========================================================(CostTimeline)\nTTNet_intercept(cost = ");
        sbLIZ.append(this.LL.element / ((long) 1000000));
        sbLIZ.append(" millisecond)\n");
        C840660WyO c840660WyO = this.LLILLJJLI;
        sbLIZ.append(c840660WyO != null ? c840660WyO.LJIILL() : null);
        sbLIZ.append("\n========================================================");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

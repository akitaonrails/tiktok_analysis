package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701520RfS extends C09AY implements Function0<String> {
    public final /* synthetic */ C701370RfD LL;
    public final /* synthetic */ C700260RdQ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701520RfS(C701370RfD c701370RfD, C700260RdQ c700260RdQ) {
        super(0);
        this.LL = c701370RfD;
        this.LLILLJJLI = c700260RdQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpMaker --- ");
        sbLIZ.append(this.LL.LLILZIL);
        sbLIZ.append(" -- MakerRuntime ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" end count: ");
        sbLIZ.append(this.LL.LLJLIL.get());
        sbLIZ.append(" thread: ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

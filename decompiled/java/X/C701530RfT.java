package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701530RfT extends C09AY implements Function0<String> {
    public final /* synthetic */ C701370RfD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701530RfT(C701370RfD c701370RfD) {
        super(0);
        this.LL = c701370RfD;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpMaker --- ");
        sbLIZ.append(this.LL.LLILZIL);
        sbLIZ.append(" -- MakerRuntime fullTrigger start count: ");
        sbLIZ.append(this.LL.LLJLIL.incrementAndGet());
        sbLIZ.append(" thread: ");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(", currentState: is first do fcp policy.");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

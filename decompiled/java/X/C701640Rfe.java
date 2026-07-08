package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701640Rfe extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C701370RfD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701640Rfe(long j, C701370RfD c701370RfD) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = c701370RfD;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" --- ");
        sbLIZ.append(this.LLILLJJLI.LLILZIL);
        sbLIZ.append(" --- doExchangeWithCallback start --- ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

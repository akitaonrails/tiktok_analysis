package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1CdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234661CdE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2234011CcB LL;
    public final /* synthetic */ C2234651CdD LLILLJJLI;
    public final /* synthetic */ InterfaceC968200bIo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234661CdE(C2234011CcB c2234011CcB, C2234651CdD c2234651CdD, C966240bFe c966240bFe) {
        super(0);
        this.LL = c2234011CcB;
        this.LLILLJJLI = c2234651CdD;
        this.LLILLL = c966240bFe;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try to changeLayout to ");
        sbLIZ.append(this.LL.LIZIZ);
        C1304630k3R.LIZLLL(7, C2188811AlT.LIZIZ(sbLIZ), null);
        this.LLILLJJLI.LIZ.LJIIZILJ(this.LL, this.LLILLL);
        return Unit.LIZ;
    }
}

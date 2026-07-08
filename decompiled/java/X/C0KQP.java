package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KQP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KQP extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C501470JlZ LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KQP(C501470JlZ c501470JlZ, int i) {
        super(0);
        this.LL = c501470JlZ;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strLJIJI;
        C501470JlZ c501470JlZ = this.LL;
        if (c501470JlZ == null || (strLJIJI = c501470JlZ.getPrompt()) == null || strLJIJI.length() <= 0) {
            strLJIJI = C497740JfY.LJIJI(this.LLILLJJLI);
        }
        C766270U4b.LJIIJJI(strLJIJI);
        return Unit.LIZ;
    }
}

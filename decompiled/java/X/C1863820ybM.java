package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ybM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863820ybM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1863240yaQ LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863820ybM(boolean z, C1863240yaQ c1863240yaQ, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c1863240yaQ;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL) {
            this.LLILLJJLI.LLJJ = true;
            C325080Cok.LIZ.getClass();
            C325080Cok.LIZIZ();
            this.LLILLJJLI.LJIJ();
        } else if (this.LLILLL) {
            this.LLILLJJLI.LJIJJ();
            this.LLILLJJLI.getConversationConfig().getOperator().refresh();
        }
        return Unit.LIZ;
    }
}

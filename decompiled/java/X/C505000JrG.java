package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JrG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505000JrG extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C504840Jr0 LL;
    public final /* synthetic */ C504920Jr8 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505000JrG(C504840Jr0 c504840Jr0, C504920Jr8 c504920Jr8) {
        super(1);
        this.LL = c504840Jr0;
        this.LLILLJJLI = c504920Jr8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C501540Jlg.LIZJ(this.LL.LL.getContext(), th);
        this.LL.U5(this.LLILLJJLI);
        return Unit.LIZ;
    }
}

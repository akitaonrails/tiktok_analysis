package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0trm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681800trm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C05P1<Function1<Long, Unit>> LL;
    public final /* synthetic */ C1147640fyE LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681800trm(C05P0 c05p0, C1147640fyE c1147640fyE) {
        super(0);
        this.LL = c05p0;
        this.LLILLJJLI = c1147640fyE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.getValue().invoke(Long.valueOf(this.LLILLJJLI.LIZ));
        return Unit.LIZ;
    }
}

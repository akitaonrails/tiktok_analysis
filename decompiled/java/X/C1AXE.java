package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AXE, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2180891AWx LL;
    public final /* synthetic */ Function1<String, C1AYF> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1AXE(C2180891AWx c2180891AWx, Function1<? super String, C1AYF> function1) {
        super(0);
        this.LL = c2180891AWx;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIIJJI(new C1AYI(), this.LLILLJJLI);
        return Unit.LIZ;
    }
}

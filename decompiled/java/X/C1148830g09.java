package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0g09, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1148830g09 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<Long, Unit> LL;
    public final /* synthetic */ C1147620fyC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1148830g09(Function1<? super Long, Unit> function1, C1147620fyC c1147620fyC) {
        super(0);
        this.LL = function1;
        this.LLILLJJLI = c1147620fyC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke(Long.valueOf(this.LLILLJJLI.LIZ));
        return Unit.LIZ;
    }
}

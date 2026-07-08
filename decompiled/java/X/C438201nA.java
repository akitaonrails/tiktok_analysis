package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01nA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C438201nA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<Long, Unit> LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ C11NJ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C438201nA(Function1<? super Long, Unit> function1, C238400w2 c238400w2, C11NJ c11nj) {
        super(0);
        this.LL = function1;
        this.LLILLJJLI = c238400w2;
        this.LLILLL = c11nj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<Long, Unit> function1 = this.LL;
        C238400w2 c238400w2 = this.LLILLJJLI;
        C11NJ c11nj = this.LLILLL;
        function1.invoke(Long.valueOf(c238400w2.element));
        c11nj.dispose();
        new C5182020e(c238400w2, 598);
        return Unit.LIZ;
    }
}

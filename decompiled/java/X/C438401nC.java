package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01nC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C438401nC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C259800zU<Long> LL;
    public final /* synthetic */ Function1<Long, Unit> LLILLJJLI;
    public final /* synthetic */ C11NJ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C438401nC(C259800zU<Long> c259800zU, Function1<? super Long, Unit> function1, C11NJ c11nj) {
        super(0);
        this.LL = c259800zU;
        this.LLILLJJLI = function1;
        this.LLILLL = c11nj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C438101n9.LIZ(this.LL, this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}

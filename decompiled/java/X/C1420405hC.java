package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05hC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1420405hC extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ C1147340fxk LL;
    public final /* synthetic */ Function1<Long, Unit> LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1420405hC(C1147340fxk c1147340fxk, Function1<? super Long, Unit> function1, C05P0<Boolean> c05p0) {
        super(1);
        this.LL = c1147340fxk;
        this.LLILLJJLI = function1;
        this.LLILLL = c05p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        this.LLILLL.setValue(Boolean.FALSE);
        if (jLongValue != this.LL.LJFF) {
            this.LLILLJJLI.invoke(Long.valueOf(jLongValue));
        }
        return Unit.LIZ;
    }
}

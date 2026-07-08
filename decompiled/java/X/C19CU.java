package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.19CU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19CU extends C09AY implements Function1<C19CP, Unit> {
    public final /* synthetic */ Function0<Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19CU(Function0<Unit> function0) {
        super(1);
        this.LL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C19CP c19cp) {
        this.LL.invoke();
        return Unit.LIZ;
    }
}

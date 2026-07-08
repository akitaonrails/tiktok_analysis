package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515190KIj extends C09AY implements Function1<C514600KGc, Unit> {
    public final /* synthetic */ Function1<C514600KGc, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C515190KIj(Function1<? super C514600KGc, Unit> function1) {
        super(1);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C514600KGc c514600KGc) {
        this.LL.invoke(c514600KGc);
        return Unit.LIZ;
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Kbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520970Kbv extends C09AY implements Function2<AbstractC498550Jgr<C1113930f5r>, Boolean, Unit> {
    public final /* synthetic */ C520950Kbt LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C520970Kbv(C520950Kbt c520950Kbt, Function0<Unit> function0, boolean z) {
        super(2);
        this.LL = c520950Kbt;
        this.LLILLJJLI = function0;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AbstractC498550Jgr<C1113930f5r> abstractC498550Jgr, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.LL.LJIIL(abstractC498550Jgr, this.LLILLJJLI, this.LLILLL, zBooleanValue);
        return Unit.LIZ;
    }
}

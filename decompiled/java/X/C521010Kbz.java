package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Kbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521010Kbz extends C09AY implements Function2<AbstractC498550Jgr<C521210KcJ>, Boolean, Unit> {
    public final /* synthetic */ C520950Kbt LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C521010Kbz(C520950Kbt c520950Kbt, Function0<Unit> function0, boolean z, Function0<Unit> function02) {
        super(2);
        this.LL = c520950Kbt;
        this.LLILLJJLI = function0;
        this.LLILLL = z;
        this.LLILZ = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AbstractC498550Jgr<C521210KcJ> abstractC498550Jgr, Boolean bool) {
        AbstractC498550Jgr<C521210KcJ> abstractC498550Jgr2 = abstractC498550Jgr;
        boolean zBooleanValue = bool.booleanValue();
        C521210KcJ c521210KcJLIZJ = abstractC498550Jgr2.LIZJ();
        if (c521210KcJLIZJ != null) {
            c521210KcJLIZJ.LJJLIIIJ = new C521020Kc0(this.LLILZ);
        }
        this.LL.LJIIL(abstractC498550Jgr2, this.LLILLJJLI, this.LLILLL, zBooleanValue);
        return Unit.LIZ;
    }
}

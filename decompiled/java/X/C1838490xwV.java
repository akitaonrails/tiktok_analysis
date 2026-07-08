package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838490xwV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1838450xwR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838490xwV(C1838450xwR c1838450xwR) {
        super(0);
        this.LL = c1838450xwR;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.getRenderCallback().invoke();
        return Unit.LIZ;
    }
}

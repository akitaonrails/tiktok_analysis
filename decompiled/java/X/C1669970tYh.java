package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669970tYh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<C941240abK, Unit> LL;
    public final /* synthetic */ C941240abK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1669970tYh(Function1<? super C941240abK, Unit> function1, C941240abK c941240abK) {
        super(0);
        this.LL = function1;
        this.LLILLJJLI = c941240abK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke(this.LLILLJJLI);
        return Unit.LIZ;
    }
}

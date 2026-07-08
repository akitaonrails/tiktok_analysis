package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669940tYe extends C09AY implements Function1<C941240abK, Unit> {
    public final /* synthetic */ Function2<C941240abK, Integer, Unit> LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669940tYe(int i, Function2 function2) {
        super(1);
        this.LL = function2;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C941240abK c941240abK) {
        this.LL.invoke(c941240abK, Integer.valueOf(this.LLILLJJLI));
        return Unit.LIZ;
    }
}

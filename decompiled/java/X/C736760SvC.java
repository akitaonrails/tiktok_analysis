package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736760SvC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function2<C03H5, Object, Unit> LL;
    public final /* synthetic */ C03H5 LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C736760SvC(Function2<C03H5, Object, Unit> function2, C03H5 c03h5, Object obj) {
        super(0);
        this.LL = function2;
        this.LLILLJJLI = c03h5;
        this.LLILLL = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}

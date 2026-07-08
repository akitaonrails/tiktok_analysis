package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698530Rad extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<Function1<C698680Ras, C698680Ras>> LL;
    public final /* synthetic */ Function1<C698680Ras, C698680Ras> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C698530Rad(List<Function1<C698680Ras, C698680Ras>> list, Function1<? super C698680Ras, C698680Ras> function1) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.remove(this.LLILLJJLI);
        return Unit.LIZ;
    }
}

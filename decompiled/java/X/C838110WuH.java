package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0WuH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838110WuH extends C09AY implements Function0<Object> {
    public final /* synthetic */ Function1<C838040WuA, Object> LL;
    public final /* synthetic */ C838040WuA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C838110WuH(Function1<? super C838040WuA, ? extends Object> function1, C838040WuA c838040WuA) {
        super(0);
        this.LL = function1;
        this.LLILLJJLI = c838040WuA;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.LL.invoke(this.LLILLJJLI);
    }
}

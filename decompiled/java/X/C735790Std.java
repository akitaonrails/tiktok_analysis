package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Std, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735790Std extends C09AY implements Function0<InterfaceC0148002o> {
    public final /* synthetic */ Function1<InterfaceC0148002o, InterfaceC0148002o> LL;
    public final /* synthetic */ InterfaceC0148002o LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C735790Std(Function1<InterfaceC0148002o, InterfaceC0148002o> function1, InterfaceC0148002o interfaceC0148002o) {
        super(0);
        this.LL = function1;
        this.LLILLJJLI = interfaceC0148002o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC0148002o invoke() {
        return this.LL.invoke(this.LLILLJJLI);
    }
}

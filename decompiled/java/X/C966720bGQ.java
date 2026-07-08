package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966720bGQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<InterfaceC965990bFF, Unit> LL;
    public final /* synthetic */ InterfaceC965990bFF LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C966720bGQ(Function1<? super InterfaceC965990bFF, Unit> function1, InterfaceC965990bFF interfaceC965990bFF) {
        super(0);
        this.LL = function1;
        this.LLILLJJLI = interfaceC965990bFF;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke(this.LLILLJJLI);
        return Unit.LIZ;
    }
}

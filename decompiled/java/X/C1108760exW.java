package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0exW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108760exW extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1108560exC LL;
    public final /* synthetic */ Function1<C512740K8y, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1108760exW(C1108560exC c1108560exC, Function1<? super C512740K8y, Unit> function1) {
        super(1);
        this.LL = c1108560exC;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        this.LL.LJIILLIIL(this.LLILLJJLI, true);
        return Unit.LIZ;
    }
}

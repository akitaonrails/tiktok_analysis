package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0J3K, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J3K extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0J3K(C118300cf c118300cf, Function1<? super Boolean, Unit> function1, C013C c013c) {
        super(0);
        this.LL = c118300cf;
        this.LLILLJJLI = function1;
        this.LLILLL = c013c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C118300cf c118300cf = this.LL;
        int i = c118300cf.element - 1;
        c118300cf.element = i;
        if (i == 0) {
            this.LLILLJJLI.invoke(Boolean.valueOf(!this.LLILLL.element));
        }
        return Unit.LIZ;
    }
}

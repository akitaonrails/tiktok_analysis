package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491800JQk extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ Function1<Throwable, Unit> LL;
    public final /* synthetic */ C491740JQe LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491800JQk(C491790JQj c491790JQj, C491740JQe c491740JQe) {
        super(1);
        this.LL = c491790JQj;
        this.LLILLJJLI = c491740JQe;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.invoke(th);
        this.LLILLJJLI.LIZIZ = false;
        return Unit.LIZ;
    }
}

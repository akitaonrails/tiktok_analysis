package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C143300gh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C143300gh(Function1<? super Boolean, Unit> function1, boolean z) {
        super(0);
        this.LL = function1;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke(Boolean.valueOf(this.LLILLJJLI));
        return Unit.LIZ;
    }
}

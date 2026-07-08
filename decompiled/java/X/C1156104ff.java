package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1156104ff extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1156104ff(Function1<? super Boolean, Unit> function1) {
        super(0);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke(Boolean.FALSE);
        return Unit.LIZ;
    }
}

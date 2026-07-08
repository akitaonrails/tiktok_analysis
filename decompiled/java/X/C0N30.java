package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N30, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N30 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0N30(Function0<Unit> function0) {
        super(0);
        this.LL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke();
        return Unit.LIZ;
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KI4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KI4 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C259800zU<Function1<C0KIP, Unit>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KI4(C259800zU<Function1<C0KIP, Unit>> c259800zU) {
        super(0);
        this.LL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.element = null;
        return Unit.LIZ;
    }
}

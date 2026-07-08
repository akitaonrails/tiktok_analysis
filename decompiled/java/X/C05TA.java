package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05TA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05TA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C05P0<Boolean> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05TA(C05P0<Boolean> c05p0) {
        super(0);
        this.LL = c05p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.setValue(Boolean.FALSE);
        return Unit.LIZ;
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05T8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05T8 extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ C05P0<Boolean> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05T8(C05P0<Boolean> c05p0) {
        super(1);
        this.LL = c05p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        l.longValue();
        this.LL.setValue(Boolean.TRUE);
        return Unit.LIZ;
    }
}

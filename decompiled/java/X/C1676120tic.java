package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676120tic extends C09AY implements Function1<C1692150u8T, Unit> {
    public final /* synthetic */ C05P0<C1692150u8T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1676120tic(C05P0<C1692150u8T> c05p0) {
        super(1);
        this.LL = c05p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1692150u8T c1692150u8T) {
        this.LL.setValue(c1692150u8T);
        return Unit.LIZ;
    }
}

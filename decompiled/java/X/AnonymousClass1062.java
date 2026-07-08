package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1062, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class AnonymousClass1062 extends C2217421BqW implements Function1<Integer, Unit> {
    public AnonymousClass1062(C104X c104x) {
        super(1, c104x, C191904105u.class, "updateLoading", "updateLoading(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C191904105u) this.receiver).LJIJJLI(num.intValue());
        return Unit.LIZ;
    }
}

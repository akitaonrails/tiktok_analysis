package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1065, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class AnonymousClass1065 extends C2217421BqW implements Function1<Boolean, Unit> {
    public AnonymousClass1065(C104X c104x) {
        super(1, c104x, C191905105v.class, "updateEnable", "updateEnable(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C191905105v) this.receiver).LJIJJ(bool.booleanValue());
        return Unit.LIZ;
    }
}

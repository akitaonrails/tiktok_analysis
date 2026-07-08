package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0F3R, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0F3R extends C2217421BqW implements Function1<Boolean, Unit> {
    public C0F3R(C0F3Q c0f3q) {
        super(1, c0f3q, C0F3Q.class, "onGridListInitFinish", "onGridListInitFinish(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C0F3Q) this.receiver).K4(bool.booleanValue());
        return Unit.LIZ;
    }
}

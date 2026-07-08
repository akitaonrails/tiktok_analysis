package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12QR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C12QR extends C2217421BqW implements Function1<Boolean, Unit> {
    public C12QR(C12QQ c12qq) {
        super(1, c12qq, C12QQ.class, "onEnableTouchEvent", "onEnableTouchEvent(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C12QQ) this.receiver).k5(bool.booleanValue());
        return Unit.LIZ;
    }
}

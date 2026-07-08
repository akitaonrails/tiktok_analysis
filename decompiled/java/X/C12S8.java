package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12S8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C12S8 extends C2217421BqW implements Function1<Boolean, Unit> {
    public C12S8(C19756812Rq c19756812Rq) {
        super(1, c19756812Rq, C19756812Rq.class, "onPlay", "onPlay(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C19756812Rq) this.receiver).d6(bool.booleanValue());
        return Unit.LIZ;
    }
}

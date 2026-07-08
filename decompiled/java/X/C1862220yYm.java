package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1862220yYm extends C2217421BqW implements Function1<Throwable, Unit> {
    public C1862220yYm(C1862130yYd c1862130yYd) {
        super(1, c1862130yYd, C1862130yYd.class, "onEventEndResponseException", "onEventEndResponseException(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        ((C1862130yYd) this.receiver).onEventEndResponseException(th);
        return Unit.LIZ;
    }
}

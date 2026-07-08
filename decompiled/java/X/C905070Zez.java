package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Zez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C905070Zez extends C2217421BqW implements Function1<AbstractC1702506lb, Unit> {
    public C905070Zez(C11RK c11rk) {
        super(1, c11rk, C11RK.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1702506lb abstractC1702506lb) {
        ((C11RK) this.receiver).onNext(abstractC1702506lb);
        return Unit.LIZ;
    }
}

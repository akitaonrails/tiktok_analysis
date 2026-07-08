package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Zf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C905080Zf0 extends C2217421BqW implements Function1<InterfaceC904740ZeS, Unit> {
    public C905080Zf0(C11RK c11rk) {
        super(1, c11rk, C11RK.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC904740ZeS interfaceC904740ZeS) {
        ((C11RK) this.receiver).onNext(interfaceC904740ZeS);
        return Unit.LIZ;
    }
}

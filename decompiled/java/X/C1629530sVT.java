package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sVT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1629530sVT extends C2217421BqW implements Function0<Unit> {
    public C1629530sVT(C1629630sVd c1629630sVd) {
        super(0, c1629630sVd, InterfaceC1629540sVU.class, "onFailed", "onFailed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((InterfaceC1629540sVU) this.receiver).onFailed();
        return Unit.LIZ;
    }
}

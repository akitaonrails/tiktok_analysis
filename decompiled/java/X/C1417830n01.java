package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0n01, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1417830n01 extends C2217421BqW implements Function0<Unit> {
    public C1417830n01(C1417330mzD c1417330mzD) {
        super(0, c1417330mzD, C1417330mzD.class, "cancel", "cancel()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((C1417330mzD) this.receiver).cancel();
        return Unit.LIZ;
    }
}

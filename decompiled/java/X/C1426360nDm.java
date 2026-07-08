package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1426360nDm extends C2217421BqW implements Function0<Unit> {
    public C1426360nDm(C1426320nDi c1426320nDi) {
        super(0, c1426320nDi, C1426320nDi.class, "cancel", "cancel()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((C1426320nDi) this.receiver).cancel();
        return Unit.LIZ;
    }
}

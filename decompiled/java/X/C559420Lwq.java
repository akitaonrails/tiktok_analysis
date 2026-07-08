package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Lwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C559420Lwq extends C2217421BqW implements Function0<Unit> {
    public C559420Lwq(C559200LwU c559200LwU) {
        super(0, c559200LwU, C559200LwU.class, "cancel", "cancel()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((C559200LwU) this.receiver).cancel();
        return Unit.LIZ;
    }
}

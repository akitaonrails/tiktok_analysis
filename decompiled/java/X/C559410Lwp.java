package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Lwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C559410Lwp extends C2217421BqW implements Function0<Unit> {
    public C559410Lwp(C559190LwT c559190LwT) {
        super(0, c559190LwT, C559190LwT.class, "cancel", "cancel()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((C559190LwT) this.receiver).cancel();
        return Unit.LIZ;
    }
}

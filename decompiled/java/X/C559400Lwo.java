package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Lwo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C559400Lwo extends C2217421BqW implements Function2<Boolean, Integer, Unit> {
    public C559400Lwo(C559190LwT c559190LwT) {
        super(2, c559190LwT, C559190LwT.class, "showRetryUI", "showRetryUI(ZI)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        ((C559190LwT) this.receiver).S6(bool.booleanValue(), num.intValue());
        return Unit.LIZ;
    }
}

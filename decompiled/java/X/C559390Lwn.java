package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Lwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C559390Lwn extends C2217421BqW implements Function2<Boolean, Integer, Unit> {
    public C559390Lwn(C559200LwU c559200LwU) {
        super(2, c559200LwU, C559200LwU.class, "showRetryUI", "showRetryUI(ZI)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        ((C559200LwU) this.receiver).k7(bool.booleanValue(), num.intValue());
        return Unit.LIZ;
    }
}

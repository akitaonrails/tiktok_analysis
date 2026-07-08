package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11uN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19650111uN extends C2217421BqW implements Function1<Boolean, Unit> {
    public C19650111uN(C19650211uO c19650211uO) {
        super(1, c19650211uO, C19650211uO.class, "onFirstImageLoaded", "onFirstImageLoaded(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C19650211uO) this.receiver).O4(bool.booleanValue());
        return Unit.LIZ;
    }
}

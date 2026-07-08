package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BeP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293190BeP extends C09AY implements Function0<C293230BeT> {
    public final /* synthetic */ C293180BeO LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C293190BeP(C293180BeO c293180BeO) {
        super(0);
        this.LL = c293180BeO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C293230BeT invoke() {
        C293180BeO c293180BeO = this.LL;
        c293180BeO.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("__extra_for_");
        sbLIZ.append(c293180BeO.LIZ);
        return new C293230BeT(new C293200BeQ(C2188811AlT.LIZIZ(sbLIZ)));
    }
}

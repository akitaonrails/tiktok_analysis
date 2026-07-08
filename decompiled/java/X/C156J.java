package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.156J, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C156J extends C09AY implements Function1<C156U, C156U> {
    public final /* synthetic */ float LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156J(float f) {
        super(1);
        this.LL = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C156U invoke(C156U c156u) {
        return C156U.LIZ(c156u, false, null, false, 0, new C156K(C156O.STRIPPING, (int) this.LL), false, false, false, 239);
    }
}

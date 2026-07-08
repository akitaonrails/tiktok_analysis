package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Y5B, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y5B extends C09AY implements Function0<C0Y3S> {
    public final /* synthetic */ C0Y59 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y5B(C0Y59 c0y59) {
        super(0);
        this.LL = c0y59;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0Y3S invoke() {
        C0Y59 c0y59 = this.LL;
        return new C0Y3S(c0y59.LIZIZ, c0y59.LIZ);
    }
}

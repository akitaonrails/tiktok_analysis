package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Y5D, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y5D extends C09AY implements Function0<C0YMY> {
    public final /* synthetic */ C0Y59 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y5D(C0Y59 c0y59) {
        super(0);
        this.LL = c0y59;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0YMY invoke() {
        C0Y59 c0y59 = this.LL;
        return new C0YMY(c0y59.LIZ, c0y59.LIZIZ);
    }
}

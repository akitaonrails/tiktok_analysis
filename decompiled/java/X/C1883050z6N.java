package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z6N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883050z6N extends C09AY implements Function0<C1883060z6O> {
    public final /* synthetic */ C1882980z6G LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883050z6N(C1882980z6G c1882980z6G) {
        super(0);
        this.LL = c1882980z6G;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1883060z6O invoke() {
        C1882980z6G c1882980z6G = this.LL;
        return new C1883060z6O(c1882980z6G.LIZ, c1882980z6G.LJJI(), this.LL);
    }
}

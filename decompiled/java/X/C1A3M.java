package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1A3M, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A3M extends C09AY implements Function1<C1A3K, C1A3K> {
    public final /* synthetic */ float LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A3M(float f) {
        super(1);
        this.LL = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1A3K invoke(C1A3K c1a3k) {
        return C1A3K.LIZ(c1a3k, this.LL, 0, 5);
    }
}

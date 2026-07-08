package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xt8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836400xt8 extends C09AY implements Function0<Integer> {
    public final /* synthetic */ C1836370xt5 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1836400xt8(C1836370xt5 c1836370xt5) {
        super(0);
        this.LL = c1836370xt5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.LL.getWidth());
    }
}

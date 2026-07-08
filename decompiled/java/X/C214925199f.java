package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.199f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214925199f extends C09AY implements Function0<C199Z> {
    public final /* synthetic */ C199Y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C214925199f(C199Y c199y) {
        super(0);
        this.LL = c199y;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C199Z invoke() {
        return new C199Z(this.LL.getActivityName(), 16382);
    }
}

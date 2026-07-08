package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AZ5 extends C09AY implements Function0<Long> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AZ5(C1AXM c1axm) {
        super(0);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(this.LL.LLL);
    }
}

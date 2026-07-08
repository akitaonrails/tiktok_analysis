package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gG3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158690gG3 extends C09AY implements Function1<C1156510gCX, C1156510gCX> {
    public final /* synthetic */ C07YJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158690gG3(C07YJ c07yj) {
        super(1);
        this.LL = c07yj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1156510gCX invoke(C1156510gCX c1156510gCX) {
        C521420Kce c521420Kce = new C521420Kce(1005000, new Exception(this.LL.LIZIZ));
        c1156510gCX.getClass();
        return new C1156510gCX(c521420Kce);
    }
}

package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gG2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158680gG2 extends C09AY implements Function1<C1156510gCX, C1156510gCX> {
    public final /* synthetic */ Throwable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158680gG2(Throwable th) {
        super(1);
        this.LL = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1156510gCX invoke(C1156510gCX c1156510gCX) {
        C521420Kce c521420Kce = new C521420Kce(C328030CtV.LIZIZ(this.LL), this.LL);
        c1156510gCX.getClass();
        return new C1156510gCX(c521420Kce);
    }
}

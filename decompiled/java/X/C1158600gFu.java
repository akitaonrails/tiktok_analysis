package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158600gFu extends C09AY implements Function1<C1158550gFp, C1158550gFp> {
    public final /* synthetic */ Throwable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158600gFu(Throwable th) {
        super(1);
        this.LL = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1158550gFp invoke(C1158550gFp c1158550gFp) {
        C1156470gCT c1156470gCT = new C1156470gCT(this.LL);
        c1158550gFp.getClass();
        return new C1158550gFp(c1156470gCT);
    }
}

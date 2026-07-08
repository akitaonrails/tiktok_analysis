package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158590gFt extends C09AY implements Function1<C1158550gFp, C1158550gFp> {
    public final /* synthetic */ C1158720gG6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158590gFt(C1158720gG6 c1158720gG6) {
        super(1);
        this.LL = c1158720gG6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1158550gFp invoke(C1158550gFp c1158550gFp) {
        C1156480gCU c1156480gCU = new C1156480gCU(this.LL);
        c1158550gFp.getClass();
        return new C1158550gFp(c1156480gCU);
    }
}

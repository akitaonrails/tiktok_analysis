package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158610gFv extends C09AY implements Function1<C1158550gFp, C1158550gFp> {
    public C1158610gFv() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1158550gFp invoke(C1158550gFp c1158550gFp) {
        C1156470gCT c1156470gCT = new C1156470gCT(new Exception("Sku schema is not valid"));
        c1158550gFp.getClass();
        return new C1158550gFp(c1156470gCT);
    }
}

package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gCY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156520gCY extends C09AY implements Function1<C1156510gCX, C1156510gCX> {
    public final /* synthetic */ C1158720gG6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1156520gCY(C1158720gG6 c1158720gG6) {
        super(1);
        this.LL = c1158720gG6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1156510gCX invoke(C1156510gCX c1156510gCX) {
        C1156490gCV c1156490gCV = new C1156490gCV(this.LL, null);
        c1156510gCX.getClass();
        return new C1156510gCX(c1156490gCV);
    }
}

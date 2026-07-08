package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158640gFy extends C09AY implements Function1<C1156510gCX, C1156510gCX> {
    public final /* synthetic */ AbstractC509020Jxk LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158640gFy(AbstractC509020Jxk abstractC509020Jxk, C238400w2 c238400w2) {
        super(1);
        this.LL = abstractC509020Jxk;
        this.LLILLJJLI = c238400w2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1156510gCX invoke(C1156510gCX c1156510gCX) {
        C1156490gCV c1156490gCV = new C1156490gCV(((C509030Jxl) this.LL).LIZ, Long.valueOf(System.currentTimeMillis() - this.LLILLJJLI.element));
        c1156510gCX.getClass();
        return new C1156510gCX(c1156490gCV);
    }
}

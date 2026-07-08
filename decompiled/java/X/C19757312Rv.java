package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12Rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19757312Rv extends C09AY implements Function1<C12TN, C12TN> {
    public final /* synthetic */ C817403Hg LL;
    public final /* synthetic */ C817403Hg LLILLJJLI;
    public final /* synthetic */ C817403Hg LLILLL;
    public final /* synthetic */ C19756812Rq LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19757312Rv(C817403Hg c817403Hg, C817403Hg c817403Hg2, C817403Hg c817403Hg3, C19756812Rq c19756812Rq, boolean z, boolean z2, String str) {
        super(1);
        this.LL = c817403Hg;
        this.LLILLJJLI = c817403Hg2;
        this.LLILLL = c817403Hg3;
        this.LLILZ = c19756812Rq;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C12TN invoke(C12TN c12tn) {
        float f = 100;
        int i = (int) (this.LL.element * f);
        int i2 = (int) (this.LLILLJJLI.element * f);
        int i3 = (int) (this.LLILLL.element * f);
        C375830EoP c375830EoP = new C375830EoP(Boolean.valueOf(this.LLILZ.Z4()));
        C375830EoP c375830EoP2 = new C375830EoP(Boolean.valueOf(this.LLILZIL));
        C375830EoP c375830EoP3 = new C375830EoP(Boolean.valueOf(this.LLILZLL));
        String str = this.LLIZ;
        c12tn.getClass();
        return new C12TN(i, i2, i3, c375830EoP, c375830EoP2, c375830EoP3, str);
    }
}

package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12S9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12S9 extends C09AY implements Function1<C12TZ, C12TZ> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C19756712Rp LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12S9(int i, C19756712Rp c19756712Rp, int i2, boolean z, boolean z2, String str) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c19756712Rp;
        this.LLILLL = i2;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C12TZ invoke(C12TZ c12tz) {
        int i = this.LL;
        C19756712Rp c19756712Rp = this.LLILLJJLI;
        int i2 = c19756712Rp.LLJZ;
        int i3 = this.LLILLL;
        C375830EoP c375830EoP = new C375830EoP(Boolean.valueOf(c19756712Rp.k5()));
        C375830EoP c375830EoP2 = new C375830EoP(Boolean.valueOf(this.LLILZ));
        C375830EoP c375830EoP3 = new C375830EoP(Boolean.valueOf(this.LLILZIL));
        String str = this.LLILZLL;
        c12tz.getClass();
        return new C12TZ(i, i2, i3, c375830EoP, c375830EoP2, c375830EoP3, str);
    }
}

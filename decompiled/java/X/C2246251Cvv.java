package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246251Cvv extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ InterfaceC2245651Cux LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2246251Cvv(String str, String str2, int i, int i2, String str3, int i3, InterfaceC2245651Cux interfaceC2245651Cux, long j, long j2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = str3;
        this.LLILZLL = i3;
        this.LLIZ = interfaceC2245651Cux;
        this.LLIZLLLIL = j;
        this.LLJ = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2246271Cvx.LIZ.getClass();
        c1023640ckE2.withParam(C2246271Cvx.LIZLLL, this.LL);
        c1023640ckE2.withParam(C2246271Cvx.LIZJ, this.LLILLJJLI);
        c1023640ckE2.withParam(C2246271Cvx.LIZIZ, Long.valueOf(this.LLILLL));
        c1023640ckE2.withParam(C2246271Cvx.LJ, Long.valueOf(this.LLILZ));
        c1023640ckE2.withParam(C2246271Cvx.LJFF, this.LLILZIL);
        c1023640ckE2.withParam(C2246271Cvx.LJIIIIZZ, Long.valueOf(this.LLILZLL));
        InterfaceC2245651Cux interfaceC2245651Cux = this.LLIZ;
        if (interfaceC2245651Cux instanceof C2190051AnT) {
            c1023640ckE2.withParam(C2246271Cvx.LJII, Long.valueOf(this.LLIZLLLIL));
        } else if (interfaceC2245651Cux instanceof C2190071AnV) {
            c1023640ckE2.withParam(C2246271Cvx.LJII, Long.valueOf(this.LLIZLLLIL));
            c1023640ckE2.withParam(C2246271Cvx.LJI, Long.valueOf(this.LLJ));
        } else if (interfaceC2245651Cux instanceof C2190061AnU) {
            c1023640ckE2.withParam(C2246271Cvx.LJI, Long.valueOf(this.LLJ));
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}

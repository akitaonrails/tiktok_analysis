package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Dlm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2265441Dlm extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2265441Dlm(String str, String str2, String str3, String str4, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2265421Dlk.LIZ.getClass();
        c1023640ckE2.withParam(C2265421Dlk.LJIIZILJ, this.LL);
        c1023640ckE2.withParam(C2265421Dlk.LJIJ, this.LLILLJJLI);
        c1023640ckE2.withParam(C2265421Dlk.LJIJI, this.LLILLL);
        c1023640ckE2.withParam(C2265421Dlk.LJIJJ, this.LLILZ);
        c1023640ckE2.withParam(C2265421Dlk.LJIJJLI, Integer.valueOf(this.LLILZIL));
        c1023640ckE2.withParam(C2265421Dlk.LJIL, 1);
        return Unit.LIZ;
    }
}

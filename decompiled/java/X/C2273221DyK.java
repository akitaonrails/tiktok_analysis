package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273221DyK extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2273221DyK(String str, String str2, String str3, Long l, Long l2, String str4, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = l;
        this.LLILZIL = l2;
        this.LLILZLL = str4;
        this.LLIZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        c1023640ckE2.withParam(C2273201DyI.LJIILL, this.LL);
        c1023640ckE2.withParam(C2273201DyI.LJIILLIIL, this.LLILLJJLI);
        c1023640ckE2.withParam(C2273201DyI.LJIIZILJ, this.LLILLL);
        c1023640ckE2.withParam(C2273201DyI.LJIJ, this.LLILZ);
        c1023640ckE2.withParam(C2273201DyI.LJIJI, this.LLILZIL);
        c1023640ckE2.withParam(C2273201DyI.LJIJJ, this.LLILZLL);
        c1023640ckE2.withParam(C2273201DyI.LJIJJLI, Integer.valueOf(this.LLIZ));
        return Unit.LIZ;
    }
}

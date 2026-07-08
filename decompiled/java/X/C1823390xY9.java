package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xY9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823390xY9 extends C09AY implements Function1<C20248814Kw, Unit> {
    public final /* synthetic */ C1822930xXP LL;
    public final /* synthetic */ C1822910xXN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823390xY9(C1822930xXP c1822930xXP, C1822910xXN c1822910xXN) {
        super(1);
        this.LL = c1822930xXP;
        this.LLILLJJLI = c1822910xXN;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20248814Kw c20248814Kw) {
        C20248814Kw c20248814Kw2 = c20248814Kw;
        c20248814Kw2.LIZ = new C1823380xY8(this.LL);
        c20248814Kw2.LIZIZ(new C1823150xXl(this.LL, this.LLILLJJLI));
        C20248814Kw.LIZJ(c20248814Kw2, true, false, 0.0f, 0, EnumC2211841BhW.CUSTOMIZE, new C1091320eVO(this.LLILLJJLI), null, 78);
        return Unit.LIZ;
    }
}

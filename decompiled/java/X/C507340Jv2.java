package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507340Jv2 extends C09AY implements Function1<C20248814Kw, Unit> {
    public final /* synthetic */ C499090Jhj LL;
    public final /* synthetic */ C507650JvX LLILLJJLI;
    public final /* synthetic */ C507140Jui LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507340Jv2(C507650JvX c507650JvX, C499090Jhj c499090Jhj, C507140Jui c507140Jui) {
        super(1);
        this.LL = c499090Jhj;
        this.LLILLJJLI = c507650JvX;
        this.LLILLL = c507140Jui;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20248814Kw c20248814Kw) {
        C20248814Kw c20248814Kw2 = c20248814Kw;
        c20248814Kw2.LIZ = new C507350Jv3(this.LL);
        c20248814Kw2.LIZIZ(new C499150Jhp(this.LLILLJJLI, this.LL, this.LLILLL));
        return Unit.LIZ;
    }
}

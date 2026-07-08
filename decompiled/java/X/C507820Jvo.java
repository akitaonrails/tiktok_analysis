package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507820Jvo extends C09AY implements Function1<C20248814Kw, Unit> {

    /* JADX INFO: Incorrect field signature: TITEM; */
    public final /* synthetic */ C507580JvQ LL;
    public final /* synthetic */ AbstractC508030Jw9<ITEM> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TITEM;LX/0Jw9<TITEM;>;)V */
    public C507820Jvo(C507580JvQ c507580JvQ, AbstractC508030Jw9 abstractC508030Jw9) {
        super(1);
        this.LL = c507580JvQ;
        this.LLILLJJLI = abstractC508030Jw9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20248814Kw c20248814Kw) {
        C20248814Kw c20248814Kw2 = c20248814Kw;
        c20248814Kw2.LIZ = new C507570JvP(this.LL);
        c20248814Kw2.LIZIZ(new C499160Jhq(this.LL, this.LLILLJJLI));
        return Unit.LIZ;
    }
}

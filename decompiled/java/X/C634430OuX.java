package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634430OuX extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C05P1<C631220OpM> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C634430OuX(C05P1<C631220OpM> c05p1, String str, int i) {
        super(2);
        this.LL = c05p1;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668890tWx.LJ(this.LL, this.LLILLJJLI, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILLL | 1));
        return Unit.LIZ;
    }
}

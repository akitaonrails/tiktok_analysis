package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0kUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321660kUu extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1320770kTT<C1331070kk5> LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1671600tbK LLILZ;
    public final /* synthetic */ InterfaceC1668050tVb LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1321660kUu(C1320770kTT<C1331070kk5> c1320770kTT, InterfaceC1685750ty9 interfaceC1685750ty9, String str, InterfaceC1671600tbK interfaceC1671600tbK, InterfaceC1668050tVb interfaceC1668050tVb, int i, int i2) {
        super(2);
        this.LL = c1320770kTT;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = str;
        this.LLILZ = interfaceC1671600tbK;
        this.LLILZIL = interfaceC1668050tVb;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668810tWp.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1), this.LLIZ);
        return Unit.LIZ;
    }
}

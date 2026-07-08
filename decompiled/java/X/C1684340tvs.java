package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684340tvs extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1631620sYq<Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>, InterfaceC1680500tpg, Integer, Unit> LL;
    public final /* synthetic */ C1691930u87 LLILLJJLI;
    public final /* synthetic */ C1693430uAX LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C1684240tvi LLILZLL;
    public final /* synthetic */ C1686970u07 LLIZ;
    public final /* synthetic */ InterfaceC1679160tnW LLIZLLLIL;
    public final /* synthetic */ InterfaceC1685750ty9 LLJ;
    public final /* synthetic */ InterfaceC1685750ty9 LLJI;
    public final /* synthetic */ InterfaceC1685750ty9 LLJIJIL;
    public final /* synthetic */ InterfaceC1685750ty9 LLJILJIL;
    public final /* synthetic */ InterfaceC1684400tvy LLJILJILJ;
    public final /* synthetic */ C1692140u8S LLJILLL;
    public final /* synthetic */ boolean LLJJ;
    public final /* synthetic */ boolean LLJJI;
    public final /* synthetic */ Function1<C1692150u8T, Unit> LLJJIII;
    public final /* synthetic */ InterfaceC1692600u9C LLJJIJI;
    public final /* synthetic */ InterfaceC1690500u5o LLJJIJIIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1684340tvs(InterfaceC1631620sYq<? super Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, C1691930u87 c1691930u87, C1693430uAX c1693430uAX, int i, int i2, C1684240tvi c1684240tvi, C1686970u07 c1686970u07, InterfaceC1679160tnW interfaceC1679160tnW, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1685750ty9 interfaceC1685750ty92, InterfaceC1685750ty9 interfaceC1685750ty93, InterfaceC1685750ty9 interfaceC1685750ty94, InterfaceC1684400tvy interfaceC1684400tvy, C1692140u8S c1692140u8S, boolean z, boolean z2, Function1<? super C1692150u8T, Unit> function1, InterfaceC1692600u9C interfaceC1692600u9C, InterfaceC1690500u5o interfaceC1690500u5o) {
        super(2);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = c1691930u87;
        this.LLILLL = c1693430uAX;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = c1684240tvi;
        this.LLIZ = c1686970u07;
        this.LLIZLLLIL = interfaceC1679160tnW;
        this.LLJ = interfaceC1685750ty9;
        this.LLJI = interfaceC1685750ty92;
        this.LLJIJIL = interfaceC1685750ty93;
        this.LLJILJIL = interfaceC1685750ty94;
        this.LLJILJILJ = interfaceC1684400tvy;
        this.LLJILLL = c1692140u8S;
        this.LLJJ = z;
        this.LLJJI = z2;
        this.LLJJIII = function1;
        this.LLJJIJI = interfaceC1692600u9C;
        this.LLJJIJIIJIL = interfaceC1690500u5o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue = num.intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg2.LJIJJLI(iIntValue & 1, z)) {
            this.LL.invoke(C13Z4.LIZJ(-1835647873, new C1684320tvq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL), interfaceC1680500tpg2), interfaceC1680500tpg2, 6);
        } else {
            interfaceC1680500tpg2.LIZJ();
        }
        return Unit.LIZ;
    }
}

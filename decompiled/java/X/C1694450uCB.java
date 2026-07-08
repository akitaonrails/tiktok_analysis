package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0uCB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694450uCB extends C09AY implements InterfaceC1631620sYq<InterfaceC1685750ty9, InterfaceC1680500tpg, Integer, InterfaceC1685750ty9> {
    public final /* synthetic */ C1691930u87 LL;
    public final /* synthetic */ C1692140u8S LLILLJJLI;
    public final /* synthetic */ C1686970u07 LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC1692600u9C LLILZLL;
    public final /* synthetic */ C1694630uCT LLIZ;
    public final /* synthetic */ Function1<C1686970u07, Unit> LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1694450uCB(C1691930u87 c1691930u87, C1692140u8S c1692140u8S, C1686970u07 c1686970u07, boolean z, boolean z2, InterfaceC1692600u9C interfaceC1692600u9C, C1694630uCT c1694630uCT, AwS604S0100000_25 awS604S0100000_25, int i) {
        super(3);
        this.LL = c1691930u87;
        this.LLILLJJLI = c1692140u8S;
        this.LLILLL = c1686970u07;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = interfaceC1692600u9C;
        this.LLIZ = c1694630uCT;
        this.LLIZLLLIL = awS604S0100000_25;
        this.LLJ = i;
    }

    @Override // X.InterfaceC1631620sYq
    public final InterfaceC1685750ty9 invoke(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        num.intValue();
        interfaceC1680500tpg2.LJJIIJZLJL(851809892);
        Object objLJJ = interfaceC1680500tpg2.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = new C1694460uCC();
            interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
        }
        C1694460uCC c1694460uCC = (C1694460uCC) objLJJ;
        Object objLJJ2 = interfaceC1680500tpg2.LJJ();
        if (objLJJ2 == c1680520tpi) {
            objLJJ2 = new C1694470uCD();
            interfaceC1680500tpg2.LJJIJIIJI(objLJJ2);
        }
        C1694620uCS c1694620uCS = new C1694620uCS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, c1694460uCC, this.LLILZLL, this.LLIZ, (C1694470uCD) objLJJ2, this.LLIZLLLIL, this.LLJ);
        C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
        boolean zLJII = interfaceC1680500tpg2.LJII(c1694620uCS);
        Object objLJJ3 = interfaceC1680500tpg2.LJJ();
        if (zLJII || objLJJ3 == c1680520tpi) {
            objLJJ3 = new C1694600uCQ(c1694620uCS);
            interfaceC1680500tpg2.LJJIJIIJI(objLJJ3);
        }
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1692960u9m.LIZ(c1685760tyA, (Function1) ((InterfaceC2217451BqZ) objLJJ3));
        interfaceC1680500tpg2.LJ();
        return interfaceC1685750ty9LIZ;
    }
}

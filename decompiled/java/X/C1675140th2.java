package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS131S1000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0th2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675140th2 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ InterfaceC1675090tgx LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675140th2(long j, int i, InterfaceC1675090tgx interfaceC1675090tgx, String str) {
        super(2);
        this.LL = j;
        this.LLILLJJLI = interfaceC1675090tgx;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 11) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1678620tme.LIZIZ(new AwS569S0100000_25(this.LLILLJJLI, 48), null, C1678600tmc.LIZ(this.LL, interfaceC1680500tpg2, 5), C13Z4.LIZIZ(interfaceC1680500tpg2, -929149933, new AwS131S1000000_25(this.LLILLL, 0)), interfaceC1680500tpg2, 805306368, 382);
        }
        return Unit.LIZ;
    }
}

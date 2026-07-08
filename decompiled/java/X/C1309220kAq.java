package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0kAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309220kAq extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC1671930tbr, InterfaceC1680500tpg, Integer, Unit> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1309220kAq(boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, int i) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = interfaceC1631620sYq;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1671940tbs.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZ | 1));
        return Unit.LIZ;
    }
}

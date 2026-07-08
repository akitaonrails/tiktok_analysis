package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0trs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681860trs extends C09AY implements InterfaceC1631620sYq<InterfaceC1669590tY5, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681860trs(boolean z) {
        super(3);
        this.LL = z;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1669590tY5 interfaceC1669590tY5, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 17) == 16 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1681530trL.LJII(0, 2, interfaceC1680500tpg2, null, this.LL);
        }
        return Unit.LIZ;
    }
}

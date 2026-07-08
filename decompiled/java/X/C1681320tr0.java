package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681320tr0 extends C09AY implements InterfaceC1631620sYq<InterfaceC1689940u4u, InterfaceC1673370teB, C1682380tsi, InterfaceC1690350u5Z> {
    public final /* synthetic */ Function0<Float> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681320tr0(Function0<Float> function0) {
        super(3);
        this.LL = function0;
    }

    @Override // X.InterfaceC1631620sYq
    public final InterfaceC1690350u5Z invoke(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, C1682380tsi c1682380tsi) {
        InterfaceC1689940u4u interfaceC1689940u4u2 = interfaceC1689940u4u;
        long j = c1682380tsi.LIZ;
        float f = C1681540trM.LJ;
        int iLJ = C13LZ.LJ(interfaceC1689940u4u2.LJLLJ(f + ((C1681540trM.LJFF - f) * this.LL.invoke().floatValue())), 0, C1682380tsi.LJII(j));
        int iLJII = C1682380tsi.LJII(j) - iLJ;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(C1682380tsi.LIZ(C1682380tsi.LJIIIIZZ(j), C1682380tsi.LJIIIIZZ(j), iLJII, iLJII));
        return interfaceC1689940u4u2.LJLJJL(C1682380tsi.LJIIIIZZ(j), C1682380tsi.LJII(j), C2097608Jq.LJ(), new C1681340tr2(iLJ, abstractC1686530tzPLJJJJZ));
    }
}

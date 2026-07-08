package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS199S1100000_25;
import kotlin.jvm.internal.AwS460S0200000_25;

/* JADX INFO: renamed from: X.0tcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672290tcR extends C09AY implements Function2<InterfaceC1672350tcX, C1682380tsi, InterfaceC1690350u5Z> {
    public final /* synthetic */ C1691540u7U LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1693430uAX LLILLL;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLILZ;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1672290tcR(C1691540u7U c1691540u7U, String str, C1693430uAX c1693430uAX, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22) {
        super(2);
        this.LL = c1691540u7U;
        this.LLILLJJLI = str;
        this.LLILLL = c1693430uAX;
        this.LLILZ = function2;
        this.LLILZIL = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final InterfaceC1690350u5Z invoke(InterfaceC1672350tcX interfaceC1672350tcX, C1682380tsi c1682380tsi) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int iMax;
        InterfaceC1672350tcX interfaceC1672350tcX2 = interfaceC1672350tcX;
        long j = c1682380tsi.LIZ;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = ((InterfaceC1673370teB) C13LP.LJJJJZI(interfaceC1672350tcX2.LJJLIL("badges", new C19719212De(1794826491, new AwS460S0200000_25(this.LLILZ, this.LLILZIL, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) 5), true)))).LJJJJZ(C1682390tsj.LIZ(0, C1682380tsi.LJIIIIZZ(j), 0, Integer.MAX_VALUE));
        int i = (int) (C1691540u7U.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, 1, 0L, 1004).LIZJ >> 32);
        int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j) - abstractC1686530tzPLJJJJZ.LL;
        if (iLJIIIIZZ < 0) {
            iLJIIIIZZ = 0;
        }
        if (((int) (C1691540u7U.LIZ(this.LL, C13LN.LJZL(5, this.LLILLJJLI), this.LLILLL, 1, 0L, 1004).LIZJ >> 32)) > iLJIIIIZZ) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILLJJLI.length() < 5 && i <= iLJIIIIZZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !z2) {
            z3 = true;
            iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        } else {
            z3 = false;
        }
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ2 = ((InterfaceC1673370teB) C13LP.LJJJJZI(interfaceC1672350tcX2.LJJLIL("title", new C19719212De(1672592672, new AwS199S1100000_25(this.LLILLJJLI, this.LLILLL, 0), true)))).LJJJJZ(C1682390tsj.LIZ(0, iLJIIIIZZ, 0, Integer.MAX_VALUE));
        if (!z3 && i + abstractC1686530tzPLJJJJZ.LL <= C1682380tsi.LJIIIIZZ(j)) {
            z4 = true;
        } else {
            z4 = false;
            if (z3) {
                iMax = abstractC1686530tzPLJJJJZ2.LLILLJJLI + abstractC1686530tzPLJJJJZ.LLILLJJLI;
            }
            return interfaceC1672350tcX2.LJLJJL(C1682380tsi.LJIIIIZZ(j), iMax, C2097608Jq.LJ(), new C1672310tcT(z3, abstractC1686530tzPLJJJJZ2, abstractC1686530tzPLJJJJZ, iMax, z4, j));
        }
        iMax = Math.max(abstractC1686530tzPLJJJJZ2.LLILLJJLI, abstractC1686530tzPLJJJJZ.LLILLJJLI);
        return interfaceC1672350tcX2.LJLJJL(C1682380tsi.LJIIIIZZ(j), iMax, C2097608Jq.LJ(), new C1672310tcT(z3, abstractC1686530tzPLJJJJZ2, abstractC1686530tzPLJJJJZ, iMax, z4, j));
    }
}

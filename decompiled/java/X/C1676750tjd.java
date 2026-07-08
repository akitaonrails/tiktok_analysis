package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS56S0100100_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS6S0200200_25;

/* JADX INFO: renamed from: X.0tjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676750tjd extends AbstractC1676570tjL {
    public C1676910tjt<EnumC1676720tja> LLJJ;
    public C1676910tjt<EnumC1676720tja>.a<C1682900ttY, C1677270tkT> LLJJI;
    public C1676910tjt<EnumC1676720tja>.a<C1676820tjk, C1677270tkT> LLJJIII;
    public C1676910tjt<EnumC1676720tja>.a<C1676820tjk, C1677270tkT> LLJJIJI;
    public AbstractC1676640tjS LLJJIJIIJIL;
    public AbstractC1676650tjT LLJJIJIL;
    public Function0<Boolean> LLJJJ;
    public InterfaceC1676780tjg LLJJJIL;
    public long LLJJJJ = C1672150tcD.LIZ;
    public InterfaceC1668050tVb LLJJJJJIL;
    public final AwS604S0100000_25 LLJJJJLIIL;
    public final AwS604S0100000_25 LLJJL;

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        this.LLJJJJ = C1672150tcD.LIZ;
    }

    public final InterfaceC1668050tVb LLJJ() {
        InterfaceC1668050tVb interfaceC1668050tVb;
        if (this.LLJJ.LJFF().LIZ(EnumC1676720tja.PreEnter, EnumC1676720tja.Visible)) {
            C1676760tje c1676760tje = this.LLJJIJIIJIL.LIZ().LIZJ;
            if (c1676760tje == null || (interfaceC1668050tVb = c1676760tje.LIZ) == null) {
                C1676760tje c1676760tje2 = this.LLJJIJIL.LIZ().LIZJ;
                if (c1676760tje2 != null) {
                    return c1676760tje2.LIZ;
                }
                return null;
            }
        } else {
            C1676760tje c1676760tje3 = this.LLJJIJIL.LIZ().LIZJ;
            if (c1676760tje3 == null || (interfaceC1668050tVb = c1676760tje3.LIZ) == null) {
                C1676760tje c1676760tje4 = this.LLJJIJIIJIL.LIZ().LIZJ;
                if (c1676760tje4 != null) {
                    return c1676760tje4.LIZ;
                }
                return null;
            }
        }
        return interfaceC1668050tVb;
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        long j2;
        long j3;
        long j4;
        long jLIZ;
        C1676850tjn c1676850tjnLIZ;
        if (this.LLJJ.LIZJ() == this.LLJJ.LJI()) {
            this.LLJJJJJIL = null;
        } else if (this.LLJJJJJIL == null) {
            InterfaceC1668050tVb interfaceC1668050tVbLLJJ = LLJJ();
            if (interfaceC1668050tVbLLJJ == null) {
                InterfaceC1668050tVb.LIZ.getClass();
                interfaceC1668050tVbLLJJ = C1668040tVa.LIZIZ;
            }
            this.LLJJJJJIL = interfaceC1668050tVbLLJJ;
        }
        if (interfaceC1689940u4u.LLIILII()) {
            AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(j);
            long j5 = (((long) abstractC1686530tzPLJJJJZ.LL) << 32) | (((long) abstractC1686530tzPLJJJJZ.LLILLJJLI) & 4294967295L);
            this.LLJJJJ = j5;
            return interfaceC1689940u4u.LJLJJL((int) (j5 >> 32), (int) (j5 & 4294967295L), C2097608Jq.LJ(), new AwS604S0100000_25(abstractC1686530tzPLJJJJZ, 552));
        }
        if (this.LLJJJ.invoke().booleanValue()) {
            AwS234S0300000_25 awS234S0300000_25Init = this.LLJJJIL.init();
            AbstractC1686530tzP abstractC1686530tzPLJJJJZ2 = interfaceC1673370teB.LJJJJZ(j);
            long j6 = (((long) abstractC1686530tzPLJJJJZ2.LL) << 32) | (((long) abstractC1686530tzPLJJJJZ2.LLILLJJLI) & 4294967295L);
            if (!C1682900ttY.LIZIZ(this.LLJJJJ, C1672150tcD.LIZ)) {
                j2 = this.LLJJJJ;
            } else {
                j2 = j6;
            }
            C1676910tjt<EnumC1676720tja>.a<C1682900ttY, C1677270tkT> aVar = this.LLJJI;
            if (aVar != null && (c1676850tjnLIZ = aVar.LIZ(this.LLJJJJLIIL, new AwS56S0100100_25(this, j2, 6))) != null) {
                j6 = ((C1682900ttY) c1676850tjnLIZ.getValue()).LIZ;
            }
            long jLIZLLL = C1682390tsj.LIZLLL(j, j6);
            C1676910tjt<EnumC1676720tja>.a<C1676820tjk, C1677270tkT> aVar2 = this.LLJJIII;
            if (aVar2 != null) {
                j3 = ((C1676820tjk) aVar2.LIZ(AFwS266S0000000_25.get$arr$(392), new AwS56S0100100_25(this, j2, 7)).getValue()).LIZ;
            } else {
                j3 = 0;
            }
            C1676910tjt<EnumC1676720tja>.a<C1676820tjk, C1677270tkT> aVar3 = this.LLJJIJI;
            if (aVar3 != null) {
                j4 = ((C1676820tjk) aVar3.LIZ(this.LLJJL, new AwS56S0100100_25(this, j2, 8)).getValue()).LIZ;
            } else {
                j4 = 0;
            }
            InterfaceC1668050tVb interfaceC1668050tVb = this.LLJJJJJIL;
            if (interfaceC1668050tVb != null) {
                jLIZ = interfaceC1668050tVb.LIZ(j2, jLIZLLL, EnumC1671200tag.Ltr);
            } else {
                jLIZ = 0;
            }
            return interfaceC1689940u4u.LJLJJL((int) (jLIZLLL >> 32), (int) (4294967295L & jLIZLLL), C2097608Jq.LJ(), new AwS6S0200200_25(abstractC1686530tzPLJJJJZ2, (AbstractC1686530tzP) C1676820tjk.LJ(jLIZ, j4), j3, (long) awS234S0300000_25Init, (Function1<? super InterfaceC1679550to9, Unit>) 1));
        }
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ3 = interfaceC1673370teB.LJJJJZ(j);
        return interfaceC1689940u4u.LJLJJL(abstractC1686530tzPLJJJJZ3.LL, abstractC1686530tzPLJJJJZ3.LLILLJJLI, C2097608Jq.LJ(), new AwS604S0100000_25(abstractC1686530tzPLJJJJZ3, 553));
    }

    public C1676750tjd(C1676910tjt<EnumC1676720tja> c1676910tjt, C1676910tjt<EnumC1676720tja>.a<C1682900ttY, C1677270tkT> aVar, C1676910tjt<EnumC1676720tja>.a<C1676820tjk, C1677270tkT> aVar2, C1676910tjt<EnumC1676720tja>.a<C1676820tjk, C1677270tkT> aVar3, AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT, Function0<Boolean> function0, InterfaceC1676780tjg interfaceC1676780tjg) {
        this.LLJJ = c1676910tjt;
        this.LLJJI = aVar;
        this.LLJJIII = aVar2;
        this.LLJJIJI = aVar3;
        this.LLJJIJIIJIL = abstractC1676640tjS;
        this.LLJJIJIL = abstractC1676650tjT;
        this.LLJJJ = function0;
        this.LLJJJIL = interfaceC1676780tjg;
        C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.LLJJJJLIIL = new AwS604S0100000_25(this, 554);
        this.LLJJL = new AwS604S0100000_25(this, 555);
    }
}

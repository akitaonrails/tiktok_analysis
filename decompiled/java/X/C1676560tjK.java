package X;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import kotlin.jvm.internal.AwS33S0200100_25;
import kotlin.jvm.internal.AwS56S0100100_25;

/* JADX INFO: renamed from: X.0tjK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676560tjK<S> extends AbstractC1676570tjL {
    public C1676910tjt<S>.a<C1682900ttY, C1677270tkT> LLJJ;
    public C05P1<? extends InterfaceC1671880tbm> LLJJI;
    public AnimatedContentTransitionScopeImpl<S> LLJJIII;
    public long LLJJIJI = C1671870tbl.LIZ;

    @Override // X.AbstractC20055413dY
    public final void LLJ() {
        this.LLJJIJI = C1671870tbl.LIZ;
    }

    public C1676560tjK(C1676910tjt<S>.a<C1682900ttY, C1677270tkT> aVar, C05P1<? extends InterfaceC1671880tbm> c05p1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
        this.LLJJ = aVar;
        this.LLJJI = c05p1;
        this.LLJJIII = animatedContentTransitionScopeImpl;
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        long j2;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(j);
        if (interfaceC1689940u4u.LLIILII()) {
            j2 = (((long) abstractC1686530tzPLJJJJZ.LL) << 32) | (((long) abstractC1686530tzPLJJJJZ.LLILLJJLI) & 4294967295L);
        } else {
            C1676910tjt<S>.a<C1682900ttY, C1677270tkT> aVar = this.LLJJ;
            if (aVar == null) {
                j2 = (((long) abstractC1686530tzPLJJJJZ.LL) << 32) | (((long) abstractC1686530tzPLJJJJZ.LLILLJJLI) & 4294967295L);
                this.LLJJIJI = j2;
            } else {
                int i = abstractC1686530tzPLJJJJZ.LL;
                long j3 = (((long) abstractC1686530tzPLJJJJZ.LLILLJJLI) & 4294967295L) | (((long) i) << 32);
                C1676850tjn c1676850tjnLIZ = aVar.LIZ(new AwS56S0100100_25(this, j3, 0), new AwS56S0100100_25(this, j3, 1));
                this.LLJJIII.LJFF = c1676850tjnLIZ;
                j2 = ((C1682900ttY) c1676850tjnLIZ.getValue()).LIZ;
                this.LLJJIJI = ((C1682900ttY) c1676850tjnLIZ.getValue()).LIZ;
            }
        }
        return interfaceC1689940u4u.LJLJJL((int) (j2 >> 32), (int) (4294967295L & j2), C2097608Jq.LJ(), new AwS33S0200100_25((C1676560tjK) this, abstractC1686530tzPLJJJJZ, (AbstractC1686530tzP) j2, 0L));
    }
}

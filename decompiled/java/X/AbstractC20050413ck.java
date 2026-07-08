package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: renamed from: X.13ck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20050413ck extends AbstractC20048613cS implements InterfaceC1673370teB {
    public final j1 LLJILJILJ;
    public Map<C115T, Integer> LLJJ;
    public InterfaceC1690350u5Z LLJJIII;
    public long LLJILLL = 0;
    public final C20050713cn LLJJI = new C20050713cn(this);
    public final C20028313Yb<C115T> LLJJIJI = C1691440u7K.LIZ();

    @Override // X.InterfaceC1676340tiy
    public abstract int LJJII(int i);

    @Override // X.InterfaceC1676340tiy
    public abstract int LJJIIZ(int i);

    @Override // X.InterfaceC1676340tiy
    public abstract int LJJIJ(int i);

    @Override // X.InterfaceC1676340tiy
    public abstract int LJJIL(int i);

    @Override // X.AbstractC20048613cS, X.InterfaceC1676350tiz
    public final boolean LLIILII() {
        return true;
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return this.LLJILJILJ.LJJ();
    }

    @Override // X.AbstractC1686530tzP, X.InterfaceC1676340tiy
    public final Object LJJJ() {
        return this.LLJILJILJ.LJJJ();
    }

    @Override // X.AbstractC20048613cS, X.InterfaceC20048313cP
    public final C20053713dH LJJLIIIJL() {
        return this.LLJILJILJ.LLJILJILJ;
    }

    @Override // X.AbstractC20048613cS
    public final AbstractC20048613cS LJJZZI() {
        j1 j1Var = this.LLJILJILJ.LLJJI;
        if (j1Var != null) {
            return j1Var.LLIIII();
        }
        return null;
    }

    @Override // X.AbstractC20048613cS
    public final boolean LJL() {
        return this.LLJJIII != null;
    }

    @Override // X.AbstractC20048613cS
    public final InterfaceC1690350u5Z LJLIIL() {
        InterfaceC1690350u5Z interfaceC1690350u5Z = this.LLJJIII;
        if (interfaceC1690350u5Z != null) {
            return interfaceC1690350u5Z;
        }
        C1696250uF5.LIZJ("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new C2197108jB();
    }

    @Override // X.AbstractC20048613cS
    public final AbstractC20048613cS LJLIL() {
        j1 j1Var = this.LLJILJILJ.LLJJIII;
        if (j1Var != null) {
            return j1Var.LLIIII();
        }
        return null;
    }

    @Override // X.AbstractC20048613cS
    public final void LJLJJLL() {
        LJJLIIIJJIZ(this.LLJILLL, 0.0f, null);
    }

    public final long LJLLI() {
        int i = this.LL;
        return (((long) this.LLILLJJLI) & 4294967295L) | (((long) i) << 32);
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return this.LLJILJILJ.getDensity();
    }

    @Override // X.InterfaceC1676350tiz
    public final EnumC1671200tag getLayoutDirection() {
        return this.LLJILJILJ.LLJILJILJ.LLJJL;
    }

    public void LJLLLL() {
        LJLIIL().LJIILLIIL();
    }

    @Override // X.AbstractC20048613cS
    public final InterfaceC1692950u9l LJJZZIII() {
        return this.LLJJI;
    }

    @Override // X.AbstractC20048613cS
    public final long LJLILLLLZI() {
        return this.LLJILLL;
    }

    public AbstractC20050413ck(j1 j1Var) {
        this.LLJILJILJ = j1Var;
    }

    public final void LJLLLLLL(long j) {
        if (!C1676820tjk.LIZIZ(this.LLJILLL, j)) {
            this.LLJILLL = j;
            C20053613dG c20053613dG = this.LLJILJILJ.LLJILJILJ.LLJLLL.LJIILLIIL;
            if (c20053613dG != null) {
                c20053613dG.LJJZZIII();
            }
            AbstractC20048613cS.LJLJJI(this.LLJILJILJ);
        }
        if (!this.LLIZLLLIL) {
            LJJZ(new C20048813cU(LJLIIL(), this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJLL(X.AbstractC20050413ck r6, X.InterfaceC1690350u5Z r7) {
        /*
            r6.getClass()
            if (r7 == 0) goto L20
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            long r4 = (long) r0
            r0 = 32
            long r4 = r4 << r0
            long r2 = (long) r1
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            long r2 = r2 | r4
            r6.LJJLIIJ(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L25
        L20:
            r0 = 0
            r6.LJJLIIJ(r0)
        L25:
            X.0u5Z r0 = r6.LLJJIII
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 != 0) goto L73
            if (r7 == 0) goto L73
            java.util.Map<X.115T, java.lang.Integer> r0 = r6.LLJJ
            if (r0 == 0) goto L39
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L45
        L39:
            java.util.Map r0 = r7.LJIILL()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L73
        L45:
            java.util.Map r1 = r7.LJIILL()
            java.util.Map<X.115T, java.lang.Integer> r0 = r6.LLJJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L73
            p2.j1 r0 = r6.LLJILJILJ
            X.13dH r0 = r0.LLJILJILJ
            X.13dK r0 = r0.LLJLLL
            X.13dG r0 = r0.LJIILLIIL
            X.13cl r0 = r0.LLJJIJIIJIL
            r0.LJI()
            java.util.Map<X.115T, java.lang.Integer> r1 = r6.LLJJ
            if (r1 != 0) goto L69
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r6.LLJJ = r1
        L69:
            r1.clear()
            java.util.Map r0 = r7.LJIILL()
            r1.putAll(r0)
        L73:
            r6.LLJJIII = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20050413ck.LJLL(X.13ck, X.0u5Z):void");
    }

    public final long LJZ(AbstractC20050413ck abstractC20050413ck, boolean z) {
        long jLJ = 0;
        for (AbstractC20050413ck abstractC20050413ckLLIIII = this; !Intrinsics.LJFF(abstractC20050413ckLLIIII, abstractC20050413ck); abstractC20050413ckLLIIII = abstractC20050413ckLLIIII.LLJILJILJ.LLJJIII.LLIIII()) {
            if (!abstractC20050413ckLLIIII.LLILZLL || !z) {
                jLJ = C1676820tjk.LJ(jLJ, abstractC20050413ckLLIIII.LLJILLL);
            }
        }
        return jLJ;
    }

    @Override // X.AbstractC1686530tzP
    public final void LJJLIIIJJIZ(long j, float f, Function1<? super InterfaceC1679550to9, Unit> function1) {
        LJLLLLLL(j);
        if (this.LLIZ) {
            return;
        }
        LJLLLL();
    }
}

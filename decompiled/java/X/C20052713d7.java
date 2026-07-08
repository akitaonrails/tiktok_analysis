package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: renamed from: X.13d7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20052713d7 extends j1 {
    public static final C1695150uDJ LLLIL;
    public InterfaceC20052813d8 LLLIIIIL;
    public C1682380tsi LLLIIIL;
    public AbstractC20050413ck LLLIIL;
    public C20048413cQ LLLIILIL;

    @Override // p2.j1
    public final void LLFF() {
        if (this.LLLIIL == null) {
            this.LLLIIL = new C20052613d6(this);
        }
    }

    @Override // p2.j1
    public final AbstractC20055413dY LLIIIL() {
        return this.LLLIIIIL.LJIJJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJIJI() {
        /*
            r7 = this;
            boolean r0 = r7.LLIZ
            if (r0 == 0) goto L5
            return
        L5:
            r7.LLILZLL()
            X.13cQ r1 = r7.LLLIILIL
            r5 = 0
            if (r1 == 0) goto L4d
            X.13d9 r0 = r1.LLILLJJLI
            boolean r0 = r0.LLFFF()
            if (r0 != 0) goto L5b
            boolean r0 = r1.LLILLL
            if (r0 != 0) goto L5b
            long r3 = r7.LLILLL
            X.13ck r1 = r7.LLLIIL
            r0 = 0
            if (r1 == 0) goto L59
            long r1 = r1.LJLLI()
            X.0ttY r6 = new X.0ttY
            r6.<init>(r1)
        L29:
            boolean r1 = X.C1682900ttY.LIZ(r3, r6)
            if (r1 == 0) goto L5b
            p2.j1 r1 = r7.LLJJI
            long r3 = r1.LLILLL
            X.13ck r1 = r1.LLIIII()
            if (r1 == 0) goto L42
            long r1 = r1.LJLLI()
            X.0ttY r0 = new X.0ttY
            r0.<init>(r1)
        L42:
            boolean r0 = X.C1682900ttY.LIZ(r3, r0)
            if (r0 == 0) goto L5b
            r1 = 1
        L49:
            p2.j1 r0 = r7.LLJJI
            r0.LLJILLL = r1
        L4d:
            X.0u5Z r0 = r7.LJLIIL()
            r0.LJIILLIIL()
            p2.j1 r0 = r7.LLJJI
            r0.LLJILLL = r5
            return
        L59:
            r6 = r0
            goto L29
        L5b:
            r1 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20052713d7.LLJJIJI():void");
    }

    static {
        C1695150uDJ c1695150uDJLIZ = C1695550uDx.LIZ();
        c1695150uDJLIZ.LJIIIZ(C1685910tyP.LJII);
        c1695150uDJLIZ.LJI(1.0f);
        c1695150uDJLIZ.LJFF(1);
        LLLIL = c1695150uDJLIZ;
    }

    @Override // p2.j1
    public final AbstractC20050413ck LLIIII() {
        return this.LLLIIL;
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJII(int i) {
        C20048413cQ c20048413cQ = this.LLLIILIL;
        if (c20048413cQ != null) {
            return c20048413cQ.LLILLJJLI.LJJJIL();
        }
        return this.LLLIIIIL.LJIJJLI(this, this.LLJJI, i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIIZ(int i) {
        C20048413cQ c20048413cQ = this.LLLIILIL;
        if (c20048413cQ != null) {
            return c20048413cQ.LLILLJJLI.LLFZ();
        }
        return this.LLLIIIIL.LJIIL(this, this.LLJJI, i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIJ(int i) {
        C20048413cQ c20048413cQ = this.LLLIILIL;
        if (c20048413cQ != null) {
            return c20048413cQ.LLILLJJLI.LJJIJ();
        }
        return this.LLLIIIIL.LIZLLL(this, this.LLJJI, i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIL(int i) {
        C20048413cQ c20048413cQ = this.LLLIILIL;
        if (c20048413cQ != null) {
            return c20048413cQ.LLILLJJLI.LJJLIIIJJI();
        }
        return this.LLLIIIIL.LJIL(this, this.LLJJI, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    @Override // X.InterfaceC1673370teB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1686530tzP LJJJJZ(long r8) {
        /*
            r7 = this;
            boolean r0 = r7.LLJJ
            if (r0 == 0) goto La
            X.0tsi r0 = r7.LLLIIIL
            if (r0 == 0) goto L95
            long r8 = r0.LIZ
        La:
            r7.LJJLJ(r8)
            X.13cQ r3 = r7.LLLIILIL
            if (r3 == 0) goto L8c
            X.13d9 r6 = r3.LLILLJJLI
            X.13d7 r0 = r3.LL
            X.13ck r0 = r0.LLLIIL
            X.0u5Z r0 = r0.LJLIIL()
            r0.getWidth()
            r0.getHeight()
            boolean r0 = r6.LLIL()
            r5 = 1
            r4 = 0
            if (r0 != 0) goto L8a
            X.0tsi r1 = r7.LLLIIIL
            boolean r0 = r1 instanceof X.C1682380tsi
            if (r0 == 0) goto L8a
            long r1 = r1.LIZ
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L8a
            r0 = 0
        L36:
            r3.LLILLL = r0
            if (r0 != 0) goto L3e
            p2.j1 r0 = r7.LLJJI
            r0.LLJJ = r5
        L3e:
            X.0u5Z r6 = r6.LJLLI()
            p2.j1 r0 = r7.LLJJI
            r0.LLJJ = r4
            int r1 = r6.getWidth()
            X.13ck r0 = r7.LLLIIL
            int r0 = r0.LL
            if (r1 != r0) goto L88
            int r1 = r6.getHeight()
            X.13ck r0 = r7.LLLIIL
            int r0 = r0.LLILLJJLI
            if (r1 != r0) goto L88
        L5a:
            boolean r0 = r3.LLILLL
            if (r0 != 0) goto L7f
            p2.j1 r0 = r7.LLJJI
            long r3 = r0.LLILLL
            X.13ck r0 = r0.LLIIII()
            if (r0 == 0) goto L86
            long r1 = r0.LJLLI()
            X.0ttY r0 = new X.0ttY
            r0.<init>(r1)
        L71:
            boolean r0 = X.C1682900ttY.LIZ(r3, r0)
            if (r0 == 0) goto L7f
            if (r5 != 0) goto L7f
            X.13cX r0 = new X.13cX
            r0.<init>(r7)
            r6 = r0
        L7f:
            r7.LLJIJIL(r6)
            r7.LLILZIL()
            return r7
        L86:
            r0 = 0
            goto L71
        L88:
            r5 = 0
            goto L5a
        L8a:
            r0 = 1
            goto L36
        L8c:
            X.13d8 r1 = r7.LLLIIIIL
            p2.j1 r0 = r7.LLJJI
            X.0u5Z r6 = r1.LJIILL(r7, r0, r8)
            goto L7f
        L95:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Lookahead constraints cannot be null in approach pass."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20052713d7.LJJJJZ(long):X.0tzP");
    }

    @Override // X.AbstractC20048613cS
    public final int LJJLJLI(C115T c115t) {
        AbstractC20050413ck abstractC20050413ck = this.LLLIIL;
        if (abstractC20050413ck != null) {
            C20028313Yb<C115T> c20028313Yb = abstractC20050413ck.LLJJIJI;
            int iLIZ = c20028313Yb.LIZ(c115t);
            if (iLIZ >= 0) {
                return c20028313Yb.LIZJ[iLIZ];
            }
            return Integer.MIN_VALUE;
        }
        return C20048713cT.LIZ(this, c115t);
    }

    public final void LLJJIJIIJIL(InterfaceC20052813d8 interfaceC20052813d8) {
        if (!Intrinsics.LJFF(interfaceC20052813d8, this.LLLIIIIL)) {
            if ((interfaceC20052813d8.LJIJJ().LLILLL & 512) != 0) {
                InterfaceC20052913d9 interfaceC20052913d9 = (InterfaceC20052913d9) interfaceC20052813d8;
                C20048413cQ c20048413cQ = this.LLLIILIL;
                if (c20048413cQ != null) {
                    c20048413cQ.LLILLJJLI = interfaceC20052913d9;
                } else {
                    c20048413cQ = new C20048413cQ(this, interfaceC20052913d9);
                }
                this.LLLIILIL = c20048413cQ;
            } else {
                this.LLLIILIL = null;
            }
        }
        this.LLLIIIIL = interfaceC20052813d8;
    }

    public C20052713d7(C20053713dH c20053713dH, InterfaceC20052813d8 interfaceC20052813d8) {
        C20052613d6 c20052613d6;
        super(c20053713dH);
        this.LLLIIIIL = interfaceC20052813d8;
        if (c20053713dH.LLIZLLLIL != null) {
            c20052613d6 = new C20052613d6(this);
        } else {
            c20052613d6 = null;
        }
        this.LLLIIL = c20052613d6;
        this.LLLIILIL = (interfaceC20052813d8.LJIJJ().LLILLL & 512) != 0 ? new C20048413cQ(this, (InterfaceC20052913d9) interfaceC20052813d8) : null;
    }

    @Override // p2.j1
    public final void LLIZLLLIL(InterfaceC1686290tz1 interfaceC1686290tz1, C1695970uEd c1695970uEd) {
        this.LLJJI.LJZ(interfaceC1686290tz1, c1695970uEd);
        if (C1696120uEs.LIZ(this.LLJILJILJ).getShowLayoutBounds()) {
            LJZL(interfaceC1686290tz1, LLLIL);
        }
    }

    @Override // p2.j1, X.AbstractC1686530tzP
    public final void LJJLIIIJJI(long j, float f, C1695970uEd c1695970uEd) {
        super.LJJLIIIJJI(j, f, c1695970uEd);
        LLJJIJI();
    }

    @Override // p2.j1, X.AbstractC1686530tzP
    public final void LJJLIIIJJIZ(long j, float f, Function1<? super InterfaceC1679550to9, Unit> function1) {
        super.LJJLIIIJJIZ(j, f, function1);
        LLJJIJI();
    }
}

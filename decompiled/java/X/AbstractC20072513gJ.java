package X;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13gJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20072513gJ extends AbstractC20055313dX implements InterfaceC20056213dg, InterfaceC20062113ed, InterfaceC20051113cr, InterfaceC1697480uH4 {
    public static final C20078413hG LLJLLL = new Object() { // from class: X.13hG
    };
    public InterfaceC595010NVj LLJJIII;
    public InterfaceC1693230uAD LLJJIJI;
    public String LLJJIJIIJIL;
    public C20279814Wu LLJJIJIL;
    public boolean LLJJJ;
    public Function0<Unit> LLJJJIL;
    public final C1697400uGw LLJJJJ;
    public InterfaceC20079413hQ LLJJJJJIL;
    public InterfaceC1691470u7N LLJJJJLIIL;
    public C0NW2 LLJJL;
    public C595170NVz LLJJLIIIJLLLLLLLZ;
    public final C13L7<C0NW2> LLJL;
    public long LLJLIL;
    public InterfaceC595010NVj LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C20078413hG LLJLLIL;

    public AbstractC20072513gJ() {
        throw null;
    }

    @Override // X.InterfaceC20056213dg
    public final /* synthetic */ void LJJIIZ() {
    }

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LJJJJ() {
        return false;
    }

    @Override // X.InterfaceC20056213dg
    public final /* synthetic */ boolean LJL() {
        return false;
    }

    @Override // X.InterfaceC20062113ed
    public final boolean LJLIL(KeyEvent keyEvent) {
        return false;
    }

    @Override // X.InterfaceC20051113cr
    public final boolean LLIIJI() {
        return true;
    }

    @Override // X.AbstractC20055413dY
    public final boolean LLILLJJLI() {
        return false;
    }

    public void LLJJIJI(InterfaceC1692460u8y interfaceC1692460u8y) {
    }

    public abstract Object LLJJIJIIJIL(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public void LLJJJIL() {
    }

    public abstract boolean LLJJJJ(KeyEvent keyEvent);

    public abstract void LLJJJJJIL(KeyEvent keyEvent);

    @Override // X.InterfaceC20056213dg
    public final void LLIIIILZ() {
        C595170NVz c595170NVz;
        InterfaceC595010NVj interfaceC595010NVj = this.LLJJIII;
        if (interfaceC595010NVj != null && (c595170NVz = this.LLJJLIIIJLLLLLLLZ) != null) {
            interfaceC595010NVj.LIZJ(new C0NW0(c595170NVz));
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        InterfaceC20079413hQ interfaceC20079413hQ = this.LLJJJJJIL;
        if (interfaceC20079413hQ != null) {
            interfaceC20079413hQ.LLIIIILZ();
        }
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        if (!this.LLJLL) {
            LLJJJ();
        }
        if (this.LLJJJ) {
            LLJJ(this.LLJJJJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJIJIL() {
        /*
            r17 = this;
            r10 = r17
            X.0NVj r11 = r10.LLJJIII
            if (r11 == 0) goto L69
            X.0NW2 r1 = r10.LLJJL
            if (r1 == 0) goto L12
            X.0NVl r0 = new X.0NVl
            r0.<init>(r1)
            r11.LIZJ(r0)
        L12:
            X.0NVz r1 = r10.LLJJLIIIJLLLLLLLZ
            if (r1 == 0) goto L1e
            X.0NW0 r0 = new X.0NW0
            r0.<init>(r1)
            r11.LIZJ(r0)
        L1e:
            X.13L7<X.0NW2> r0 = r10.LLJL
            java.lang.Object[] r9 = r0.LIZJ
            long[] r8 = r0.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L69
            r6 = 0
        L2a:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L64
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r5 = 8 - r0
            r2 = 0
        L44:
            if (r2 >= r5) goto L62
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r3
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L5e
            int r0 = r6 << 3
            int r0 = r0 + r2
            r1 = r9[r0]
            X.0NW2 r1 = (X.C0NW2) r1
            X.0NVl r0 = new X.0NVl
            r0.<init>(r1)
            r11.LIZJ(r0)
        L5e:
            long r3 = r3 >> r12
            int r2 = r2 + 1
            goto L44
        L62:
            if (r5 != r12) goto L69
        L64:
            if (r6 == r7) goto L69
            int r6 = r6 + 1
            goto L2a
        L69:
            r0 = 0
            r10.LLJJL = r0
            r10.LLJJLIIIJLLLLLLLZ = r0
            X.13L7<X.0NW2> r0 = r10.LLJL
            r0.LIZJ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20072513gJ.LLJJIJIL():void");
    }

    public final void LLJJJ() {
        InterfaceC1693230uAD interfaceC1693230uAD;
        if (this.LLJJJJLIIL == null && (interfaceC1693230uAD = this.LLJJIJI) != null) {
            if (this.LLJJIII == null) {
                this.LLJJIII = new C612270Nzt();
            }
            this.LLJJJJ.LLJJIJIL(this.LLJJIII);
            InterfaceC1691470u7N interfaceC1691470u7NLIZIZ = interfaceC1693230uAD.LIZIZ(this.LLJJIII);
            LLJJ(interfaceC1691470u7NLIZIZ);
            this.LLJJJJLIIL = interfaceC1691470u7NLIZIZ;
        }
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        LLJJIJIL();
        if (this.LLJLILLLLZIIL == null) {
            this.LLJJIII = null;
        }
        InterfaceC1691470u7N interfaceC1691470u7N = this.LLJJJJLIIL;
        if (interfaceC1691470u7N != null) {
            LLJJI(interfaceC1691470u7N);
        }
        this.LLJJJJLIIL = null;
    }

    @Override // X.InterfaceC1697480uH4
    public final Object LJJIJLIJ() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJJZ() {
        LLIIIILZ();
    }

    @Override // X.InterfaceC20056213dg
    public final long LJJLIIIJ() {
        return C20082213hs.LIZ;
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZLL() {
        LLIIIILZ();
    }

    @Override // X.InterfaceC20062113ed
    public final boolean LJJZZI(KeyEvent keyEvent) {
        C0NW2 c0nw2LJFF;
        boolean z;
        LLJJJ();
        long jLIZ = C634390OuT.LIZ(keyEvent.getKeyCode());
        if (this.LLJJJ && C1692670u9J.LIZ(keyEvent) == 2 && C634380OuS.LJFF(keyEvent)) {
            if (!this.LLJL.LIZ(jLIZ)) {
                C0NW2 c0nw2 = new C0NW2(this.LLJLIL);
                this.LLJL.LJI(jLIZ, c0nw2);
                if (this.LLJJIII != null) {
                    C23250099c.LIZLLL(LLILLIZIL(), null, null, new C595120NVu(this, c0nw2, null), 3);
                }
                z = true;
            } else {
                z = false;
            }
            if (LLJJJJ(keyEvent) || z) {
                return true;
            }
            return false;
        }
        if (this.LLJJJ && C1692670u9J.LIZ(keyEvent) == 1 && C634380OuS.LJFF(keyEvent) && (c0nw2LJFF = this.LLJL.LJFF(jLIZ)) != null) {
            if (this.LLJJIII != null) {
                C23250099c.LIZLLL(LLILLIZIL(), null, null, new C595110NVt(this, c0nw2LJFF, null), 3);
            }
            LLJJJJJIL(keyEvent);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC20051113cr
    public final void LLF(InterfaceC1692460u8y interfaceC1692460u8y) {
        C20279814Wu c20279814Wu = this.LLJJIJIL;
        if (c20279814Wu != null) {
            C1696490uFT.LJI(interfaceC1692460u8y, c20279814Wu.LIZ);
        }
        C1696490uFT.LIZLLL(interfaceC1692460u8y, this.LLJJIJIIJIL, new AwS574S0100000_30(this, 323));
        if (this.LLJJJ) {
            this.LLJJJJ.LLF(interfaceC1692460u8y);
        } else {
            interfaceC1692460u8y.LIZJ(C1696500uFU.LJIIIZ, Unit.LIZ);
        }
        LLJJIJI(interfaceC1692460u8y);
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJZ(C20067313fT c20067313fT, EnumC20065813fE enumC20065813fE, long j) {
        boolean z;
        this.LLJLIL = (((long) Float.floatToRawIntBits((int) (r6 >> 32))) << 32) | (((long) Float.floatToRawIntBits(C1676820tjk.LIZJ((((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32)))) & 4294967295L);
        LLJJJ();
        if (this.LLJJJ && enumC20065813fE == EnumC20065813fE.Main) {
            int i = c20067313fT.LIZLLL;
            if (i == 4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C23250099c.LIZLLL(LLILLIZIL(), null, null, new C595160NVy(this, null), 3);
            } else if (i == 5) {
                C23250099c.LIZLLL(LLILLIZIL(), null, null, new C595150NVx(this, null), 3);
            }
        }
        if (this.LLJJJJJIL == null) {
            PointerInputEventHandler pointerInputEventHandler = new PointerInputEventHandler() { // from class: X.0NW1
                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    Object objLLJJIJIIJIL = this.LL.LLJJIJIIJIL(interfaceC1369205Xm, interfaceC1364105Vn);
                    if (objLLJJIJIIJIL == C099R.LJFF()) {
                        return objLLJJIJIIJIL;
                    }
                    return Unit.LIZ;
                }
            };
            C20067313fT c20067313fT2 = C1679720toQ.LIZ;
            C20065413fA c20065413fA = new C20065413fA(null, null, null, pointerInputEventHandler);
            LLJJ(c20065413fA);
            this.LLJJJJJIL = c20065413fA;
        }
        InterfaceC20079413hQ interfaceC20079413hQ = this.LLJJJJJIL;
        if (interfaceC20079413hQ != null) {
            interfaceC20079413hQ.LJJJZ(c20067313fT, enumC20065813fE, j);
        }
    }

    public AbstractC20072513gJ(InterfaceC595010NVj interfaceC595010NVj, InterfaceC1693230uAD interfaceC1693230uAD, boolean z, String str, C20279814Wu c20279814Wu, Function0 function0) {
        this.LLJJIII = interfaceC595010NVj;
        this.LLJJIJI = interfaceC1693230uAD;
        this.LLJJIJIIJIL = str;
        this.LLJJIJIL = c20279814Wu;
        this.LLJJJ = z;
        this.LLJJJIL = function0;
        boolean z2 = false;
        this.LLJJJJ = new C1697400uGw(this.LLJJIII, 0, new C20072913gN(this));
        int i = C20078313hF.LIZ;
        this.LLJL = new C13L7<>(6);
        this.LLJLIL = 0L;
        InterfaceC595010NVj interfaceC595010NVj2 = this.LLJJIII;
        this.LLJLILLLLZIIL = interfaceC595010NVj2;
        if (interfaceC595010NVj2 == null && this.LLJJIJI != null) {
            z2 = true;
        }
        this.LLJLL = z2;
        this.LLJLLIL = LLJLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJJLIIL(X.InterfaceC595010NVj r6, X.InterfaceC1693230uAD r7, boolean r8, java.lang.String r9, X.C20279814Wu r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11) {
        /*
            r5 = this;
            X.0NVj r0 = r5.LLJLILLLLZIIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            r3 = 0
            if (r0 != 0) goto L98
            r5.LLJJIJIL()
            r5.LLJLILLLLZIIL = r6
            r5.LLJJIII = r6
            r4 = 1
        L11:
            X.0uAD r0 = r5.LLJJIJI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 != 0) goto L1c
            r5.LLJJIJI = r7
            r4 = 1
        L1c:
            boolean r0 = r5.LLJJJ
            if (r0 == r8) goto L30
            if (r8 == 0) goto L8f
            X.0uGw r0 = r5.LLJJJJ
            r5.LLJJ(r0)
        L27:
            X.13dH r0 = X.C20052513d5.LJFF(r5)
            r0.LJJJJIZL()
            r5.LLJJJ = r8
        L30:
            java.lang.String r0 = r5.LLJJIJIIJIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)
            if (r0 != 0) goto L41
            r5.LLJJIJIIJIL = r9
            X.13dH r0 = X.C20052513d5.LJFF(r5)
            r0.LJJJJIZL()
        L41:
            X.14Wu r0 = r5.LLJJIJIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r10)
            if (r0 != 0) goto L52
            r5.LLJJIJIL = r10
            X.13dH r0 = X.C20052513d5.LJFF(r5)
            r0.LJJJJIZL()
        L52:
            r5.LLJJJIL = r11
            boolean r2 = r5.LLJLL
            X.0NVj r1 = r5.LLJLILLLLZIIL
            if (r1 != 0) goto L8d
            X.0uAD r0 = r5.LLJJIJI
            if (r0 == 0) goto L8d
            r0 = 1
        L5f:
            if (r2 == r0) goto L8a
            if (r1 != 0) goto L68
            X.0uAD r0 = r5.LLJJIJI
            if (r0 == 0) goto L68
            r3 = 1
        L68:
            r5.LLJLL = r3
            if (r3 != 0) goto L8a
            X.0u7N r0 = r5.LLJJJJLIIL
            if (r0 != 0) goto L8a
        L70:
            X.0u7N r0 = r5.LLJJJJLIIL
            if (r0 != 0) goto L86
            boolean r0 = r5.LLJLL
            if (r0 != 0) goto L7e
        L78:
            r0 = 0
            r5.LLJJJJLIIL = r0
            r5.LLJJJ()
        L7e:
            X.0uGw r1 = r5.LLJJJJ
            X.0NVj r0 = r5.LLJJIII
            r1.LLJJIJIL(r0)
            return
        L86:
            r5.LLJJI(r0)
            goto L78
        L8a:
            if (r4 == 0) goto L7e
            goto L70
        L8d:
            r0 = 0
            goto L5f
        L8f:
            X.0uGw r0 = r5.LLJJJJ
            r5.LLJJI(r0)
            r5.LLJJIJIL()
            goto L27
        L98:
            r4 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20072513gJ.LLJJJJLIIL(X.0NVj, X.0uAD, boolean, java.lang.String, X.14Wu, kotlin.jvm.functions.Function0):void");
    }
}

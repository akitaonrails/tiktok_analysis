package X;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13gX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20073913gX extends AbstractC20072513gJ implements InterfaceC1693210uAB {
    public String LLJZ;
    public Function0<Unit> LLJZIJLIL;
    public Function0<Unit> LLL;
    public boolean LLLF;
    public final C13L7<C09AE> LLLFF;
    public final C13L7<C20076913h1> LLLFFI;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJL() {
        /*
            r20 = this;
            r11 = r20
            X.13L7<X.09AE> r9 = r11.LLLFF
            java.lang.Object[] r8 = r9.LIZJ
            long[] r7 = r9.LIZ
            int r0 = r7.length
            int r6 = r0 + (-2)
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r17 = 7
            r10 = 8
            if (r6 < 0) goto L4d
            r5 = 0
        L17:
            r2 = r7[r5]
            long r0 = ~r2
            long r0 = r0 << r17
            long r0 = r0 & r2
            long r0 = r0 & r18
            int r4 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r4 == 0) goto L48
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            int r12 = 8 - r0
            r4 = 0
        L2b:
            if (r4 >= r12) goto L46
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r2 & r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L42
            int r0 = r5 << 3
            int r0 = r0 + r4
            r1 = r8[r0]
            X.09AE r1 = (X.C09AE) r1
            r0 = 0
            r1.LIZIZ(r0)
        L42:
            long r2 = r2 >> r10
            int r4 = r4 + 1
            goto L2b
        L46:
            if (r12 != r10) goto L4d
        L48:
            if (r5 == r6) goto L4d
            int r5 = r5 + 1
            goto L17
        L4d:
            r9.LIZJ()
            X.13L7<X.13h1> r9 = r11.LLLFFI
            java.lang.Object[] r8 = r9.LIZJ
            long[] r7 = r9.LIZ
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L94
            r5 = 0
        L5c:
            r2 = r7[r5]
            long r0 = ~r2
            long r0 = r0 << r17
            long r0 = r0 & r2
            long r0 = r0 & r18
            int r4 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r4 == 0) goto L8f
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            int r11 = 8 - r0
            r4 = 0
        L70:
            if (r4 >= r11) goto L8d
            r0 = 255(0xff, double:1.26E-321)
            long r14 = r2 & r0
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L89
            int r0 = r5 << 3
            int r0 = r0 + r4
            r0 = r8[r0]
            X.13h1 r0 = (X.C20076913h1) r0
            X.09AE r1 = r0.LIZ
            r0 = 0
            r1.LIZIZ(r0)
        L89:
            long r2 = r2 >> r10
            int r4 = r4 + 1
            goto L70
        L8d:
            if (r11 != r10) goto L94
        L8f:
            if (r5 == r6) goto L94
            int r5 = r5 + 1
            goto L5c
        L94:
            r9.LIZJ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20073913gX.LLJJL():void");
    }

    @Override // X.AbstractC20055413dY
    public final void LLJ() {
        LLJJL();
    }

    @Override // X.AbstractC20072513gJ
    public final void LLJJJIL() {
        LLJJL();
    }

    @Override // X.AbstractC20072513gJ
    public final void LLJJIJI(InterfaceC1692460u8y interfaceC1692460u8y) {
        if (this.LLJZIJLIL != null) {
            String str = this.LLJZ;
            AwS574S0100000_30 awS574S0100000_30 = new AwS574S0100000_30(this, 324);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
            interfaceC1692460u8y.LIZJ(C1694480uCE.LIZJ, new C1697110uGT(str, awS574S0100000_30));
        }
    }

    @Override // X.AbstractC20072513gJ
    public final boolean LLJJJJ(KeyEvent keyEvent) {
        boolean z;
        long jLIZ = C634390OuT.LIZ(keyEvent.getKeyCode());
        if (this.LLJZIJLIL != null && this.LLLFF.LIZIZ(jLIZ) == null) {
            this.LLLFF.LJI(jLIZ, C23250099c.LIZLLL(LLILLIZIL(), null, null, new C20074113gZ(this, null), 3));
            z = true;
        } else {
            z = false;
        }
        C20076913h1 c20076913h1LIZIZ = this.LLLFFI.LIZIZ(jLIZ);
        if (c20076913h1LIZIZ != null) {
            if (c20076913h1LIZIZ.LIZ.isActive()) {
                c20076913h1LIZIZ.LIZ.LIZIZ(null);
                if (!c20076913h1LIZIZ.LIZIZ) {
                    this.LLJJJIL.invoke();
                    this.LLLFFI.LJFF(jLIZ);
                }
            } else {
                this.LLLFFI.LJFF(jLIZ);
                return z;
            }
        }
        return z;
    }

    @Override // X.AbstractC20072513gJ
    public final void LLJJJJJIL(KeyEvent keyEvent) {
        Function0<Unit> function0;
        long jLIZ = C634390OuT.LIZ(keyEvent.getKeyCode());
        boolean z = false;
        if (this.LLLFF.LIZIZ(jLIZ) != null) {
            C09AE c09aeLIZIZ = this.LLLFF.LIZIZ(jLIZ);
            if (c09aeLIZIZ != null) {
                if (c09aeLIZIZ.isActive()) {
                    c09aeLIZIZ.LIZIZ(null);
                } else {
                    z = true;
                }
            }
            this.LLLFF.LJFF(jLIZ);
        }
        if (this.LLL != null) {
            if (this.LLLFFI.LIZIZ(jLIZ) == null) {
                if (!z) {
                    this.LLLFFI.LJI(jLIZ, new C20076913h1(C23250099c.LIZLLL(LLILLIZIL(), null, null, new C20074013gY(this, jLIZ, null), 3)));
                    return;
                }
                return;
            } else {
                if (!z && (function0 = this.LLL) != null) {
                    function0.invoke();
                }
                this.LLLFFI.LJFF(jLIZ);
                return;
            }
        }
        if (z) {
            return;
        }
        this.LLJJJIL.invoke();
    }

    @Override // X.AbstractC20072513gJ
    public final Object LLJJIJIIJIL(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        AwS609S0100000_30 awS609S0100000_30;
        AwS609S0100000_30 awS609S0100000_302;
        if (this.LLJJJ && this.LLL != null) {
            awS609S0100000_30 = new AwS609S0100000_30(this, 180);
        } else {
            awS609S0100000_30 = null;
        }
        if (this.LLJJJ && this.LLJZIJLIL != null) {
            awS609S0100000_302 = new AwS609S0100000_30(this, 181);
        } else {
            awS609S0100000_302 = null;
        }
        Object objLJ = C1374405Zm.LJ(interfaceC1369205Xm, interfaceC1364105Vn, awS609S0100000_30, awS609S0100000_302, new AwS588S0100000_9(this, 497), new C595140NVw(this, null));
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    public C20073913gX(InterfaceC1693230uAD interfaceC1693230uAD, InterfaceC595010NVj interfaceC595010NVj, C20279814Wu c20279814Wu, String str, String str2, Function0 function0, Function0 function02, Function0 function03, boolean z, boolean z2) {
        super(interfaceC595010NVj, interfaceC1693230uAD, z2, str2, c20279814Wu, function0);
        this.LLJZ = str;
        this.LLJZIJLIL = function02;
        this.LLL = function03;
        this.LLLF = z;
        int i = C20078313hF.LIZ;
        this.LLLFF = new C13L7<>(6);
        this.LLLFFI = new C13L7<>(6);
    }
}

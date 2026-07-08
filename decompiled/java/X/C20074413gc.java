package X;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusTargetNode;
import k0.f2;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13gc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20074413gc extends AbstractC20074613ge implements InterfaceC20062113ed, InterfaceC20051113cr, InterfaceC1693210uAB {
    public InterfaceC1681290tqx LLJJJJLIIL;
    public InterfaceC633750OtR LLJJL;
    public final C20085913iT LLJJLIIIJLLLLLLLZ;
    public final C20076413gw LLJL;
    public final C1686560tzS LLJLIL;
    public final C20082713hx LLJLILLLLZIIL;
    public final C20083013i0 LLJLL;
    public final C20063313ep LLJLLIL;
    public AwS643S0100000_29 LLJLLL;
    public C112M LLJZ;
    public C20083813i8 LLJZIJLIL;

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LJJJJ() {
        return false;
    }

    @Override // X.InterfaceC20062113ed
    public final boolean LJLIL(KeyEvent keyEvent) {
        return false;
    }

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LLIIJI() {
        return false;
    }

    @Override // X.AbstractC20055413dY
    public final boolean LLILLJJLI() {
        return false;
    }

    @Override // X.AbstractC20074613ge
    public final void LLJJJJ(long j) {
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        if (this.LLJILLL) {
            InterfaceC1690500u5o interfaceC1690500u5o = C20052513d5.LJFF(this).LLJJJJLIIL;
            C1686560tzS c1686560tzS = this.LLJLIL;
            c1686560tzS.getClass();
            c1686560tzS.LIZ = new C1677900tlU(new C2255691DQp(interfaceC1690500u5o));
        }
        C20083813i8 c20083813i8 = this.LLJZIJLIL;
        if (c20083813i8 != null) {
            c20083813i8.LIZLLL = C20052513d5.LJFF(this).LLJJJJLIIL;
        }
    }

    @Override // X.AbstractC20074613ge
    public final boolean LLJJJJLIIL() {
        InterfaceC1681290tqx interfaceC1681290tqx;
        C20082713hx c20082713hx = this.LLJLILLLLZIIL;
        return c20082713hx.LIZ.LIZIZ() || ((interfaceC1681290tqx = c20082713hx.LIZIZ) != null && interfaceC1681290tqx.LIZ());
    }

    @Override // X.AbstractC20074613ge, X.AbstractC20055413dY
    public final void LLILZLL() {
        LLIIIILZ();
        if (this.LLJILLL) {
            InterfaceC1690500u5o interfaceC1690500u5o = C20052513d5.LJFF(this).LLJJJJLIIL;
            C1686560tzS c1686560tzS = this.LLJLIL;
            c1686560tzS.getClass();
            c1686560tzS.LIZ = new C1677900tlU(new C2255691DQp(interfaceC1690500u5o));
        }
        C20083813i8 c20083813i8 = this.LLJZIJLIL;
        if (c20083813i8 != null) {
            c20083813i8.LIZLLL = C20052513d5.LJFF(this).LLJJJJLIIL;
        }
    }

    @Override // X.InterfaceC20062113ed
    public final boolean LJJZZI(KeyEvent keyEvent) {
        float f;
        long jFloatToRawIntBits;
        float f2;
        boolean z = false;
        if (!this.LLJJIJIIJIL) {
            return false;
        }
        if ((!C20069013fk.LIZ(C634390OuT.LIZ(keyEvent.getKeyCode()), C20069013fk.LJIIJJI) && !C20069013fk.LIZ(C634390OuT.LIZ(keyEvent.getKeyCode()), C20069013fk.LJIIJ)) || C1692670u9J.LIZ(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        if (this.LLJLILLLLZIIL.LIZLLL == EnumC1684030tvN.Vertical) {
            z = true;
        }
        if (z) {
            int i = (int) (this.LLJLLIL.LLJJJJ & 4294967295L);
            if (C20069013fk.LIZ(C634390OuT.LIZ(keyEvent.getKeyCode()), C20069013fk.LJIIJ)) {
                f2 = i;
            } else {
                f2 = -i;
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2)));
        } else {
            int i2 = (int) (this.LLJLLIL.LLJJJJ >> 32);
            if (C20069013fk.LIZ(C634390OuT.LIZ(keyEvent.getKeyCode()), C20069013fk.LJIIJ)) {
                f = i2;
            } else {
                f = -i2;
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        }
        C23250099c.LIZLLL(LLILLIZIL(), null, null, new C112N(this, jFloatToRawIntBits, null), 3);
        return true;
    }

    @Override // X.InterfaceC20051113cr
    public final void LLF(InterfaceC1692460u8y interfaceC1692460u8y) {
        if (this.LLJJIJIIJIL && (this.LLJLLL == null || this.LLJZ == null)) {
            this.LLJLLL = new AwS643S0100000_29(this, 94);
            this.LLJZ = new C112M(this, null);
        }
        AwS643S0100000_29 awS643S0100000_29 = this.LLJLLL;
        if (awS643S0100000_29 != null) {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
            interfaceC1692460u8y.LIZJ(C1694480uCE.LIZLLL, new C1697110uGT(null, awS643S0100000_29));
        }
        C112M c112m = this.LLJZ;
        if (c112m != null) {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1696490uFT.LIZ;
            interfaceC1692460u8y.LIZJ(C1694480uCE.LJ, c112m);
        }
    }

    @Override // X.AbstractC20074613ge
    public final void LLJJJJJIL(long j) {
        C23250099c.LIZLLL(this.LLJJLIIIJLLLLLLLZ.LIZLLL(), null, null, new C112L(this, j, null), 3);
    }

    @Override // X.AbstractC20074613ge
    public final Object LLJJJIL(C1394205cy c1394205cy, C1394305cz c1394305cz) {
        C20082713hx c20082713hx = this.LLJLILLLLZIIL;
        Object objLJFF = c20082713hx.LJFF(EnumC1384205bM.UserInput, new C112Q(c20082713hx, null, c1394205cy), c1394305cz);
        if (objLJFF == C099R.LJFF()) {
            return objLJFF;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.13gR] */
    @Override // X.AbstractC20074613ge, X.InterfaceC20056213dg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJZ(X.C20067313fT r11, X.EnumC20065813fE r12, long r13) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20074413gc.LJJJZ(X.13fT, X.13fE, long):void");
    }

    public C20074413gc(InterfaceC1681290tqx interfaceC1681290tqx, InterfaceC20063613es interfaceC20063613es, InterfaceC633750OtR interfaceC633750OtR, EnumC1684030tvN enumC1684030tvN, InterfaceC1420105h9 interfaceC1420105h9, InterfaceC595010NVj interfaceC595010NVj, boolean z, boolean z2) {
        super(f2.LIZ, z, interfaceC595010NVj, enumC1684030tvN);
        this.LLJJJJLIIL = interfaceC1681290tqx;
        this.LLJJL = interfaceC633750OtR;
        C20085913iT c20085913iT = new C20085913iT();
        this.LLJJLIIIJLLLLLLLZ = c20085913iT;
        C20076413gw c20076413gw = new C20076413gw(z);
        LLJJ(c20076413gw);
        this.LLJL = c20076413gw;
        C1686560tzS c1686560tzS = new C1686560tzS(new C1677900tlU(new C2255691DQp(f2.LIZLLL)));
        this.LLJLIL = c1686560tzS;
        InterfaceC1681290tqx interfaceC1681290tqx2 = this.LLJJJJLIIL;
        InterfaceC633750OtR interfaceC633750OtR2 = this.LLJJL;
        C20082713hx c20082713hx = new C20082713hx(interfaceC1420105h9, interfaceC1681290tqx2, interfaceC633750OtR2 != null ? interfaceC633750OtR2 : c1686560tzS, enumC1684030tvN, z2, c20085913iT, new AwS573S0100000_29(this, 898));
        this.LLJLILLLLZIIL = c20082713hx;
        C20083013i0 c20083013i0 = new C20083013i0(c20082713hx, z);
        this.LLJLL = c20083013i0;
        C20063313ep c20063313ep = new C20063313ep(enumC1684030tvN, c20082713hx, z2, interfaceC20063613es);
        LLJJ(c20063313ep);
        this.LLJLLIL = c20063313ep;
        LLJJ(new C20086013iU(c20083013i0, c20085913iT));
        LLJJ(new FocusTargetNode(2, null, 4));
        LLJJ(new C13WM(c20063313ep));
        LLJJ(new C1697500uH6(new AwS609S0100000_30(this, 207)));
    }

    public final void LLJJLIIIJLLLLLLLZ(InterfaceC1681290tqx interfaceC1681290tqx, InterfaceC20063613es interfaceC20063613es, InterfaceC633750OtR interfaceC633750OtR, EnumC1684030tvN enumC1684030tvN, InterfaceC1420105h9 interfaceC1420105h9, InterfaceC595010NVj interfaceC595010NVj, boolean z, boolean z2) {
        boolean z3;
        InterfaceC633750OtR interfaceC633750OtR2;
        boolean z4;
        if (this.LLJJIJIIJIL != z) {
            this.LLJLL.LLILLJJLI = z;
            this.LLJL.LLJJI = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (interfaceC633750OtR == null) {
            interfaceC633750OtR2 = this.LLJLIL;
        } else {
            interfaceC633750OtR2 = interfaceC633750OtR;
        }
        C20082713hx c20082713hx = this.LLJLILLLLZIIL;
        C20085913iT c20085913iT = this.LLJJLIIIJLLLLLLLZ;
        if (!Intrinsics.LJFF(c20082713hx.LIZ, interfaceC1420105h9)) {
            c20082713hx.LIZ = interfaceC1420105h9;
            z4 = true;
        } else {
            z4 = false;
        }
        c20082713hx.LIZIZ = interfaceC1681290tqx;
        if (c20082713hx.LIZLLL != enumC1684030tvN) {
            c20082713hx.LIZLLL = enumC1684030tvN;
            z4 = true;
        }
        if (c20082713hx.LJ != z2) {
            c20082713hx.LJ = z2;
            z4 = true;
        }
        c20082713hx.LIZJ = interfaceC633750OtR2;
        c20082713hx.LJFF = c20085913iT;
        C20063313ep c20063313ep = this.LLJLLIL;
        c20063313ep.LLJJ = enumC1684030tvN;
        c20063313ep.LLJJIII = z2;
        c20063313ep.LLJJIJI = interfaceC20063613es;
        this.LLJJJJLIIL = interfaceC1681290tqx;
        this.LLJJL = interfaceC633750OtR;
        AFwS274S0000000_30 aFwS274S0000000_30 = f2.LIZ;
        EnumC1684030tvN enumC1684030tvN2 = this.LLJLILLLLZIIL.LIZLLL;
        EnumC1684030tvN enumC1684030tvN3 = EnumC1684030tvN.Vertical;
        if (enumC1684030tvN2 != enumC1684030tvN3) {
            enumC1684030tvN3 = EnumC1684030tvN.Horizontal;
        }
        LLJJL(aFwS274S0000000_30, z, interfaceC595010NVj, enumC1684030tvN3, z4);
        if (z3) {
            this.LLJLLL = null;
            this.LLJZ = null;
            C20052513d5.LJFF(this).LJJJJIZL();
        }
    }
}

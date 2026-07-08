package X;

import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uAA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693200uAA extends AbstractC20055313dX implements InterfaceC1693210uAB, InterfaceC20062713ej {
    public InterfaceC1420105h9 LLJJIII;
    public EnumC1684030tvN LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public InterfaceC633750OtR LLJJJ;
    public InterfaceC595010NVj LLJJJIL;
    public InterfaceC20063613es LLJJJJ;
    public boolean LLJJJJJIL;
    public InterfaceC1681290tqx LLJJJJLIIL;
    public C20074413gc LLJJL;
    public InterfaceC1691470u7N LLJJLIIIJLLLLLLLZ;
    public InterfaceC1670300tZE LLJL;
    public InterfaceC1681290tqx LLJLIL;
    public boolean LLJLILLLLZIIL;

    @Override // X.AbstractC20055413dY
    public final boolean LLILLJJLI() {
        return false;
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZLLLIL() {
        boolean zLLJJIJIIJIL = LLJJIJIIJIL();
        if (this.LLJLILLLLZIIL != zLLJJIJIIJIL) {
            this.LLJLILLLLZIIL = zLLJJIJIIJIL;
            InterfaceC1420105h9 interfaceC1420105h9 = this.LLJJIII;
            EnumC1684030tvN enumC1684030tvN = this.LLJJIJI;
            boolean z = this.LLJJJJJIL;
            InterfaceC1681290tqx interfaceC1681290tqx = z ? this.LLJLIL : this.LLJJJJLIIL;
            LLJJIJIL(interfaceC1681290tqx, this.LLJJJJ, this.LLJJJ, enumC1684030tvN, interfaceC1420105h9, this.LLJJJIL, z, this.LLJJIJIIJIL, this.LLJJIJIL);
        }
    }

    @Override // X.InterfaceC20062713ej
    public final void LLIILZL() {
        InterfaceC1670300tZE interfaceC1670300tZE = (InterfaceC1670300tZE) C20061513eX.LIZ(this, C1670290tZD.LIZ);
        if (Intrinsics.LJFF(interfaceC1670300tZE, this.LLJL)) {
            return;
        }
        this.LLJL = interfaceC1670300tZE;
        this.LLJLIL = null;
        InterfaceC1691470u7N interfaceC1691470u7N = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1691470u7N != null) {
            LLJJI(interfaceC1691470u7N);
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        LLJJIJI();
        C20074413gc c20074413gc = this.LLJJL;
        if (c20074413gc != null) {
            InterfaceC1420105h9 interfaceC1420105h9 = this.LLJJIII;
            EnumC1684030tvN enumC1684030tvN = this.LLJJIJI;
            InterfaceC1681290tqx interfaceC1681290tqx = this.LLJJJJJIL ? this.LLJLIL : this.LLJJJJLIIL;
            c20074413gc.LLJJLIIIJLLLLLLLZ(interfaceC1681290tqx, this.LLJJJJ, this.LLJJJ, enumC1684030tvN, interfaceC1420105h9, this.LLJJJIL, this.LLJJIJIIJIL, this.LLJLILLLLZIIL);
        }
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        InterfaceC1691470u7N interfaceC1691470u7N = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1691470u7N != null) {
            LLJJI(interfaceC1691470u7N);
        }
    }

    public final void LLJJIJI() {
        InterfaceC1691470u7N interfaceC1691470u7N = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1691470u7N != null) {
            if (interfaceC1691470u7N.LJIJJ().LLJILLL) {
                return;
            }
            LLJJ(interfaceC1691470u7N);
            return;
        }
        if (this.LLJJJJJIL) {
            C20060813eQ.LIZ(this, new AwS569S0100000_25(this, 824));
        }
        InterfaceC1681290tqx interfaceC1681290tqx = this.LLJJJJJIL ? this.LLJLIL : this.LLJJJJLIIL;
        if (interfaceC1681290tqx != null) {
            InterfaceC1691470u7N interfaceC1691470u7NLJIJJ = interfaceC1681290tqx.LJIJJ();
            if (interfaceC1691470u7NLJIJJ.LJIJJ().LLJILLL) {
                return;
            }
            LLJJ(interfaceC1691470u7NLJIJJ);
            this.LLJJLIIIJLLLLLLLZ = interfaceC1691470u7NLJIJJ;
        }
    }

    public final boolean LLJJIJIIJIL() {
        EnumC1671200tag enumC1671200tag = EnumC1671200tag.Ltr;
        if (this.LLJILLL) {
            enumC1671200tag = C20052513d5.LJFF(this).LLJJL;
        }
        EnumC1684030tvN enumC1684030tvN = this.LLJJIJI;
        boolean z = !this.LLJJIJIL;
        return (enumC1671200tag != EnumC1671200tag.Rtl || enumC1684030tvN == EnumC1684030tvN.Vertical) ? z : !z;
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        this.LLJLILLLLZIIL = LLJJIJIIJIL();
        LLJJIJI();
        if (this.LLJJL == null) {
            InterfaceC1420105h9 interfaceC1420105h9 = this.LLJJIII;
            InterfaceC1681290tqx interfaceC1681290tqx = this.LLJJJJJIL ? this.LLJLIL : this.LLJJJJLIIL;
            C20074413gc c20074413gc = new C20074413gc(interfaceC1681290tqx, this.LLJJJJ, this.LLJJJ, this.LLJJIJI, interfaceC1420105h9, this.LLJJJIL, this.LLJJIJIIJIL, this.LLJLILLLLZIIL);
            LLJJ(c20074413gc);
            this.LLJJL = c20074413gc;
        }
    }

    public C1693200uAA(InterfaceC1681290tqx interfaceC1681290tqx, InterfaceC20063613es interfaceC20063613es, InterfaceC633750OtR interfaceC633750OtR, EnumC1684030tvN enumC1684030tvN, InterfaceC1420105h9 interfaceC1420105h9, InterfaceC595010NVj interfaceC595010NVj, boolean z, boolean z2, boolean z3) {
        this.LLJJIII = interfaceC1420105h9;
        this.LLJJIJI = enumC1684030tvN;
        this.LLJJIJIIJIL = z;
        this.LLJJIJIL = z2;
        this.LLJJJ = interfaceC633750OtR;
        this.LLJJJIL = interfaceC595010NVj;
        this.LLJJJJ = interfaceC20063613es;
        this.LLJJJJJIL = z3;
        this.LLJJJJLIIL = interfaceC1681290tqx;
    }

    public final void LLJJIJIL(InterfaceC1681290tqx interfaceC1681290tqx, InterfaceC20063613es interfaceC20063613es, InterfaceC633750OtR interfaceC633750OtR, EnumC1684030tvN enumC1684030tvN, InterfaceC1420105h9 interfaceC1420105h9, InterfaceC595010NVj interfaceC595010NVj, boolean z, boolean z2, boolean z3) {
        boolean z4;
        InterfaceC1681290tqx interfaceC1681290tqx2;
        this.LLJJIII = interfaceC1420105h9;
        this.LLJJIJI = enumC1684030tvN;
        boolean z5 = true;
        if (this.LLJJJJJIL != z) {
            this.LLJJJJJIL = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (!Intrinsics.LJFF(this.LLJJJJLIIL, interfaceC1681290tqx)) {
            this.LLJJJJLIIL = interfaceC1681290tqx;
        } else {
            z5 = false;
        }
        if (z4 || (z5 && !z)) {
            InterfaceC1691470u7N interfaceC1691470u7N = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC1691470u7N != null) {
                LLJJI(interfaceC1691470u7N);
            }
            this.LLJJLIIIJLLLLLLLZ = null;
            LLJJIJI();
        }
        this.LLJJIJIIJIL = z2;
        this.LLJJIJIL = z3;
        this.LLJJJ = interfaceC633750OtR;
        this.LLJJJIL = interfaceC595010NVj;
        this.LLJJJJ = interfaceC20063613es;
        boolean zLLJJIJIIJIL = LLJJIJIIJIL();
        this.LLJLILLLLZIIL = zLLJJIJIIJIL;
        C20074413gc c20074413gc = this.LLJJL;
        if (c20074413gc != null) {
            if (this.LLJJJJJIL) {
                interfaceC1681290tqx2 = this.LLJLIL;
            } else {
                interfaceC1681290tqx2 = this.LLJJJJLIIL;
            }
            c20074413gc.LLJJLIIIJLLLLLLLZ(interfaceC1681290tqx2, interfaceC20063613es, interfaceC633750OtR, enumC1684030tvN, interfaceC1420105h9, interfaceC595010NVj, z2, zLLJJIJIIJIL);
        }
    }
}

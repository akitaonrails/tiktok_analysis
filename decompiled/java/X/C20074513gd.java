package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS574S0100000_30;
import p2.j1;

/* JADX INFO: renamed from: X.13gd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20074513gd extends AbstractC20055413dY implements InterfaceC20051913cz, InterfaceC1695680uEA, InterfaceC20051113cr, InterfaceC20062713ej {
    public Function1<? super InterfaceC1690500u5o, C1378605aS> LLJJ;
    public Function1<? super InterfaceC1690500u5o, C1378605aS> LLJJI;
    public Function1<? super C1679680toM, Unit> LLJJIII;
    public float LLJJIJI;
    public boolean LLJJIJIIJIL;
    public long LLJJIJIL;
    public float LLJJJ;
    public float LLJJJIL;
    public boolean LLJJJJ;
    public InterfaceC20076313gv LLJJJJJIL;
    public View LLJJJJLIIL;
    public InterfaceC1690500u5o LLJJL;
    public InterfaceC1850740yGG LLJJLIIIJLLLLLLLZ;
    public C13YZ LLJLIL;
    public C1682900ttY LLJLL;
    public C1DEK LLJLLIL;
    public final C05P0 LLJL = C20028913Yh.LJFF(null, C13FT.LIZ);
    public long LLJLILLLLZIIL = 9205357640488583168L;

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LJJJJ() {
        return false;
    }

    @Override // X.InterfaceC1695680uEA
    public final /* synthetic */ void LJJLIIIJJIZ() {
    }

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LLIIJI() {
        return false;
    }

    @Override // X.InterfaceC20062713ej
    public final void LLIILZL() {
        C20060813eQ.LIZ(this, new AwS574S0100000_30(this, 327));
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        InterfaceC1850740yGG interfaceC1850740yGG = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1850740yGG != null) {
            interfaceC1850740yGG.dismiss();
        }
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    public final long LLJJ() {
        if (this.LLJLIL == null) {
            this.LLJLIL = C20028913Yh.LJ(new AwS574S0100000_30(this, 325));
        }
        C13YZ c13yz = this.LLJLIL;
        if (c13yz != null) {
            return ((C1378605aS) c13yz.getValue()).LIZ;
        }
        return 9205357640488583168L;
    }

    public final void LLJJI() {
        InterfaceC1850740yGG interfaceC1850740yGG = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1850740yGG != null) {
            interfaceC1850740yGG.dismiss();
        }
        View viewLIZ = this.LLJJJJLIIL;
        if (viewLIZ == null) {
            viewLIZ = C20051613cw.LIZ(this);
        }
        this.LLJJJJLIIL = viewLIZ;
        InterfaceC1690500u5o interfaceC1690500u5o = this.LLJJL;
        if (interfaceC1690500u5o == null) {
            interfaceC1690500u5o = C20052513d5.LJFF(this).LLJJJJLIIL;
        }
        this.LLJJL = interfaceC1690500u5o;
        this.LLJJLIIIJLLLLLLLZ = this.LLJJJJJIL.LIZ(viewLIZ, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, this.LLJJJJ, interfaceC1690500u5o, this.LLJJIJI);
        LLJJIJI();
    }

    public final void LLJJIII() {
        InterfaceC1690500u5o interfaceC1690500u5o = this.LLJJL;
        if (interfaceC1690500u5o == null) {
            interfaceC1690500u5o = C20052513d5.LJFF(this).LLJJJJLIIL;
            this.LLJJL = interfaceC1690500u5o;
        }
        long j = this.LLJJ.invoke(interfaceC1690500u5o).LIZ;
        long jLJI = 9205357640488583168L;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (LLJJ() & 9223372034707292159L) == 9205357640488583168L) {
            this.LLJLILLLLZIIL = 9205357640488583168L;
            InterfaceC1850740yGG interfaceC1850740yGG = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC1850740yGG != null) {
                interfaceC1850740yGG.dismiss();
                return;
            }
            return;
        }
        this.LLJLILLLLZIIL = C1378605aS.LJI(LLJJ(), j);
        Function1<? super InterfaceC1690500u5o, C1378605aS> function1 = this.LLJJI;
        if (function1 != null) {
            long j2 = function1.invoke(interfaceC1690500u5o).LIZ;
            C1378605aS c1378605aS = new C1378605aS(j2);
            if ((j2 & 9223372034707292159L) != 9205357640488583168L) {
                jLJI = C1378605aS.LJI(LLJJ(), c1378605aS.LIZ);
            }
        }
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            LLJJI();
        }
        InterfaceC1850740yGG interfaceC1850740yGG2 = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1850740yGG2 != null) {
            interfaceC1850740yGG2.LIZJ(this.LLJJIJI, this.LLJLILLLLZIIL, jLJI);
        }
        LLJJIJI();
    }

    public final void LLJJIJI() {
        InterfaceC1690500u5o interfaceC1690500u5o;
        InterfaceC1850740yGG interfaceC1850740yGG = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1850740yGG == null || (interfaceC1690500u5o = this.LLJJL) == null || C1682900ttY.LIZ(interfaceC1850740yGG.LIZ(), this.LLJLL)) {
            return;
        }
        Function1<? super C1679680toM, Unit> function1 = this.LLJJIII;
        if (function1 != null) {
            function1.invoke(new C1679680toM(interfaceC1690500u5o.LJLI(C1296570jqR.LIZIZ(interfaceC1850740yGG.LIZ()))));
        }
        this.LLJLL = new C1682900ttY(interfaceC1850740yGG.LIZ());
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        LLIILZL();
        this.LLJLLIL = C095G.LIZ(0, null, 7);
        C23250099c.LIZLLL(LLILLIZIL(), null, C099V.UNDISPATCHED, new C1842350y2j(this, null), 1);
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        interfaceC1669010tX9.LLIIJLIL();
        C1DEK c1dek = this.LLJLLIL;
        if (c1dek != null) {
            c1dek.LJIIIIZZ(Unit.LIZ);
        }
    }

    @Override // X.InterfaceC20051113cr
    public final void LLF(InterfaceC1692460u8y interfaceC1692460u8y) {
        interfaceC1692460u8y.LIZJ(C1696580uFc.LIZ, new AwS574S0100000_30(this, 326));
    }

    @Override // X.InterfaceC20051913cz
    public final void LLIIII(j1 j1Var) {
        ((C13FE) this.LLJL).setValue(j1Var);
    }

    public C20074513gd(Function1 function1, Function1 function12, Function1 function13, float f, boolean z, long j, float f2, float f3, boolean z2, InterfaceC20076313gv interfaceC20076313gv) {
        this.LLJJ = function1;
        this.LLJJI = function12;
        this.LLJJIII = function13;
        this.LLJJIJI = f;
        this.LLJJIJIIJIL = z;
        this.LLJJIJIL = j;
        this.LLJJJ = f2;
        this.LLJJJIL = f3;
        this.LLJJJJ = z2;
        this.LLJJJJJIL = interfaceC20076313gv;
    }
}

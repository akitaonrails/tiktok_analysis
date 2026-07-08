package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.jvm.internal.AwS666S0100000_17;

/* JADX INFO: renamed from: X.0em0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101620em0 extends AbstractC1101760emE {
    public final InterfaceC1101720emA LLIZ;
    public final InterfaceC1085330eLj LLIZLLLIL;

    @Override // X.AbstractC1101760emE
    public final String LIZIZ() {
        return "";
    }

    @Override // X.AbstractC1101760emE
    public final long LJ() {
        return -1L;
    }

    @Override // X.AbstractC1101760emE
    public final String LIZJ() {
        return this.LLIZLLLIL.dT1();
    }

    @Override // X.AbstractC1101760emE
    public final boolean LIZLLL() {
        InterfaceC1101720emA interfaceC1101720emA = this.LLIZ;
        return interfaceC1101720emA != null && interfaceC1101720emA.Ur();
    }

    @Override // X.AbstractC1101760emE
    public final View LJFF() {
        InterfaceC1101720emA interfaceC1101720emA = this.LLIZ;
        if (interfaceC1101720emA != null) {
            return interfaceC1101720emA.LLLILZJ();
        }
        return null;
    }

    @Override // X.AbstractC1101760emE
    public final String LJII() {
        return this.LLIZLLLIL.Sr();
    }

    @Override // X.AbstractC1101760emE
    public final void LJIIIZ() {
        InterfaceC1101720emA interfaceC1101720emA = this.LLIZ;
        if (interfaceC1101720emA != null) {
            interfaceC1101720emA.LLLZI();
        }
        this.LLIZLLLIL.LLLZI();
    }

    @Override // X.AbstractC1101760emE
    public final int LJIIL() {
        InterfaceC1101720emA interfaceC1101720emA = this.LLIZ;
        if (interfaceC1101720emA != null) {
            return interfaceC1101720emA.Vr();
        }
        return 0;
    }

    @Override // X.AbstractC1101760emE
    public final void LJIILJJIL() {
        InterfaceC1101720emA interfaceC1101720emA = this.LLIZ;
        if (interfaceC1101720emA != null) {
            interfaceC1101720emA.LJLJL();
        }
    }

    @Override // X.AbstractC1101760emE
    public final String LJIILL() {
        return this.LLIZLLLIL.mP0();
    }

    @Override // X.AbstractC1101760emE
    public final void LJIIJ() {
        super.LJIIJ();
        InterfaceC1085330eLj interfaceC1085330eLj = this.LLILZIL;
        if (interfaceC1085330eLj != null) {
            interfaceC1085330eLj.LJLJL();
        }
        InterfaceC1101720emA interfaceC1101720emA = this.LLIZ;
        if (interfaceC1101720emA != null) {
            interfaceC1101720emA.LJLJL();
        }
    }

    @Override // X.AbstractC1101760emE
    public final void LJIILIIL() {
        super.LJIILIIL();
        InterfaceC1101720emA interfaceC1101720emA = this.LLIZ;
        if (interfaceC1101720emA != null) {
            interfaceC1101720emA.LJLJL();
        }
    }

    @Override // X.AbstractC1101760emE
    public final InterfaceC1101940emW LIZ(ViewGroup viewGroup, boolean z) {
        InterfaceC1101720emA interfaceC1101720emA = this.LLIZ;
        if (interfaceC1101720emA != null) {
            return interfaceC1101720emA.Tr(viewGroup, z);
        }
        return null;
    }

    public C1101620em0(InterfaceC1101720emA interfaceC1101720emA, InterfaceC1085330eLj interfaceC1085330eLj, Map map, AwS666S0100000_17 awS666S0100000_17) {
        super(map, awS666S0100000_17);
        this.LLIZ = interfaceC1101720emA;
        this.LLIZLLLIL = interfaceC1085330eLj;
        this.LLILZIL = interfaceC1085330eLj;
    }
}

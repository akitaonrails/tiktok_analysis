package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978680bZi implements InterfaceC978740bZo {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Function1<EnumC919170a1j, Unit> LIZLLL;

    @Override // X.InterfaceC978740bZo
    public final void LIZ() {
        C20337914i1<Integer> c20337914i1 = InterfaceC960800b6s.LLLIIIIL;
        c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
    }

    @Override // X.InterfaceC978740bZo
    public final C978700bZk LIZIZ() {
        return new C978700bZk(C497740JfY.LJIJI(2131853333), C497740JfY.LJIJI(2131851798), "ttlive_icon_competition_choose_mode_team.png", C497740JfY.LJIJI(2131853337), LJIIIZ(), false, false, 0L, null, new AwS559S0100000_15(this, 587), 4064);
    }

    @Override // X.InterfaceC978740bZo
    public final boolean LIZJ() {
        return InterfaceC960800b6s.LLLIIIIL.LIZIZ().intValue() < 3;
    }

    @Override // X.InterfaceC978740bZo
    public final boolean LIZLLL() {
        return C915980Zwa.LJII().LLILZLL(true).size() >= 3 && this.LIZ;
    }

    @Override // X.InterfaceC978740bZo
    public final EnumC919170a1j LJIIIZ() {
        return C915980Zwa.LJII().LLILZLL(true).size() == 3 ? EnumC919170a1j.MATCH_TYPE_1VN : EnumC919170a1j.MATCH_TYPE_2V2;
    }

    @Override // X.InterfaceC978740bZo
    public final boolean shouldShow() {
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        if (!this.LIZ || size <= 2) {
            return false;
        }
        return this.LIZIZ || !this.LIZJ;
    }

    public C978680bZi(boolean z, boolean z2, boolean z3, AwS594S0100000_15 awS594S0100000_15) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = awS594S0100000_15;
    }
}

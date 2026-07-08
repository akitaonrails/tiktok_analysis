package X;

import android.view.View;
import java.util.Map;

/* JADX INFO: renamed from: X.0KYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC519380KYm implements InterfaceC1102120emo {
    public long LIZ;
    public long LIZIZ;

    public abstract long LIZ();

    @Override // X.InterfaceC1102120emo
    public String LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC1102120emo
    public final void LJI() {
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public C1099880ejC LJIIIZ() {
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final Boolean LJIIL() {
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public View LJIILJJIL() {
        return null;
    }

    public abstract long LJIILLIIL();

    public abstract long LJIJ();

    @Override // X.InterfaceC1102120emo
    public final Map<String, String> getExtras() {
        return null;
    }

    public final int LJIILL() {
        if (this.LIZ < 0) {
            C20441214yg.LJ("DurationControllable", "LENGTH_NONE");
            return 0;
        }
        if (LJIJ() <= this.LIZ) {
            C20441214yg.LJ("DurationControllable", "LENGTH_SHORT_NOTIFY");
            return 1;
        }
        C20441214yg.LJ("DurationControllable", "LENGTH_LONG_NOTIFY");
        return 2;
    }

    @Override // X.InterfaceC1102120emo
    public final EnumC245600xC LIZLLL() {
        return C245700xD.LIZ(this);
    }

    public final long LJIIZILJ() {
        String str;
        long jLJIJ;
        if (LJIILL() == 0) {
            jLJIJ = LIZ();
            str = "No length definition";
        } else if (LJIILL() == 1) {
            jLJIJ = LJIJ();
            str = "Short notify resume as total active duration";
        } else if (LJIILLIIL() < this.LIZIZ) {
            jLJIJ = LJIJ();
            str = "Long notify not reach maxRecoverRemainMs, resume as total active duration";
        } else if (LJIJ() - LJIILLIIL() >= this.LIZIZ) {
            jLJIJ = LJIJ() - LJIILLIIL();
            str = "Long notify remain duration more than maxRecoverRemainMs, resume as remain duration";
        } else {
            str = "Long notify remain duration less than maxRecoverRemainMs, remain duration 0";
            jLJIJ = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", total active: ");
        sbLIZ.append(LJIJ());
        sbLIZ.append(", elapsed: ");
        sbLIZ.append(LJIILLIIL());
        sbLIZ.append(", remaining: ");
        sbLIZ.append(jLJIJ);
        sbLIZ.append(", default remaining: ");
        sbLIZ.append(LIZ());
        C20441214yg.LJ("DurationControllable", C2188811AlT.LIZIZ(sbLIZ));
        return jLJIJ;
    }

    public final boolean LJIJI() {
        if (LJIILL() != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Not long notify, not end, total active: ");
            sbLIZ.append(LJIJ());
            sbLIZ.append(", elapsed: ");
            sbLIZ.append(LJIILLIIL());
            sbLIZ.append(", remaining: ");
            sbLIZ.append(LJIIZILJ());
            sbLIZ.append(", default remaining: ");
            sbLIZ.append(LIZ());
            C20441214yg.LJ("DurationControllable", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (LJIIZILJ() < this.LIZIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Long notify, remaining duration less than maxRecoverRemainMs, end, total active duration: ");
            sbLIZ2.append(LJIJ());
            sbLIZ2.append(", elapsed duration: ");
            sbLIZ2.append(LJIILLIIL());
            sbLIZ2.append(", remaining: ");
            sbLIZ2.append(LJIIZILJ());
            sbLIZ2.append(", default remaining: ");
            sbLIZ2.append(LIZ());
            C20441214yg.LJ("DurationControllable", C2188811AlT.LIZIZ(sbLIZ2));
            return true;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Default, not end, total active: ");
        sbLIZ3.append(LJIJ());
        sbLIZ3.append(", elapsed: ");
        sbLIZ3.append(LJIILLIIL());
        sbLIZ3.append(", remaining: ");
        sbLIZ3.append(LJIIZILJ());
        sbLIZ3.append(", default remaining: ");
        sbLIZ3.append(LIZ());
        C20441214yg.LJ("DurationControllable", C2188811AlT.LIZIZ(sbLIZ3));
        return false;
    }

    @Override // X.InterfaceC1102120emo
    public final int getComponentType() {
        return LJII().getComponentType();
    }
}

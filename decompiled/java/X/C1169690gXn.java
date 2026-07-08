package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.0gXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169690gXn {
    public final EnumC1154600g9S LIZ;
    public final EnumC1154590g9R LIZIZ;
    public final EnumC1261800iwM LIZJ;
    public final EnumC1261820iwO LIZLLL;
    public final EnumC1261810iwN LJ;
    public final int LJFF;
    public boolean LJI;
    public boolean LJII;

    public static String LIZJ(Enum r1) {
        return r1.name().toLowerCase(Locale.ROOT);
    }

    public final void LIZ(C2344009Gk c2344009Gk) {
        EnumC1154600g9S enumC1154600g9S = this.LIZ;
        if (enumC1154600g9S != null) {
            c2344009Gk.LIZJ(enumC1154600g9S.getValue(), "avatar_only_flow");
        }
        EnumC1154590g9R enumC1154590g9R = this.LIZIZ;
        if (enumC1154590g9R != null) {
            c2344009Gk.LIZJ(enumC1154590g9R.getValue(), "nickname_only_flow");
        }
        c2344009Gk.LJFF("enter_from", LIZJ(this.LIZJ));
        EnumC1261820iwO enumC1261820iwO = this.LIZLLL;
        if (enumC1261820iwO != null) {
            c2344009Gk.LJFF("position", LIZJ(enumC1261820iwO));
        }
        c2344009Gk.LJFF("show_reason", LIZJ(this.LJ));
        c2344009Gk.LIZJ(this.LJFF, "show_cnt");
    }

    public final boolean LIZIZ(EnumC1169700gXo enumC1169700gXo) {
        if (this.LJII) {
            return true;
        }
        if (enumC1169700gXo == EnumC1169700gXo.CANCEL || enumC1169700gXo == EnumC1169700gXo.NOT_NOW || enumC1169700gXo == EnumC1169700gXo.X_SIGN || enumC1169700gXo == EnumC1169700gXo.ELSEWHERE) {
            if (this.LJI) {
                return true;
            }
            this.LJI = true;
        }
        return false;
    }

    public final void LIZLLL(EnumC1169700gXo enumC1169700gXo) {
        if (LIZIZ(enumC1169700gXo)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("click_what", LIZJ(enumC1169700gXo));
        LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("click_update_avatar_toast", c2344009Gk.LIZ);
    }

    public final void LJ(EnumC1169700gXo enumC1169700gXo) {
        if (LIZIZ(enumC1169700gXo)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("click_what", LIZJ(enumC1169700gXo));
        LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("click_update_nickname_toast", c2344009Gk.LIZ);
    }

    public C1169690gXn(EnumC1154600g9S enumC1154600g9S, EnumC1154590g9R enumC1154590g9R, EnumC1261800iwM enumC1261800iwM, EnumC1261820iwO enumC1261820iwO, EnumC1261810iwN enumC1261810iwN, int i) {
        this.LIZ = enumC1154600g9S;
        this.LIZIZ = enumC1154590g9R;
        this.LIZJ = enumC1261800iwM;
        this.LIZLLL = enumC1261820iwO;
        this.LJ = enumC1261810iwN;
        this.LJFF = i;
    }
}

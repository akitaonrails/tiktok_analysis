package X;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: X.0dzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071700dzk extends AbstractC1071760dzq {
    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return "authorize_finish";
    }

    @Override // X.AbstractC1223210hw7
    public final Map<String, String> LIZIZ() {
        String str;
        C1071220dyy c1071220dyy = this.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", c1071220dyy.LIZ.LJ.LIZ);
        c2344009Gk.LJIIIIZZ("enter_method", c1071220dyy.LIZ.LJ.LIZIZ);
        c2344009Gk.LJIIIIZZ("previous_page", c1071220dyy.LIZ.LJ.LIZJ);
        c2344009Gk.LJIIIIZZ("platform", c1071220dyy.LIZ.LIZLLL.LIZ.getStr());
        Bundle bundle = this.LIZIZ.LIZ.LJI;
        c2344009Gk.LJIIIIZZ("followed_another", AbstractC1223210hw7.LIZJ(bundle != null ? bundle.getBoolean("is_followed_pop_up") : false));
        int i = C1071610dzb.LIZ[this.LIZIZ.LIZ.LIZLLL.LIZ.ordinal()];
        if (i == 1 || i == 2) {
            str = "user";
        } else {
            if (i != 3) {
                "wrong relationAuthPlatform".toString();
                throw new IllegalStateException("wrong relationAuthPlatform");
            }
            C1071220dyy c1071220dyy2 = this.LIZIZ;
            C1071260dz2 c1071260dz2 = c1071220dyy2.LIZIZ.LIZ;
            if (c1071260dz2.LIZ) {
                if (c1071260dz2.LIZIZ) {
                    "wrong initStatus for auth pipeline".toString();
                    throw new IllegalStateException("wrong initStatus for auth pipeline");
                }
                str = "user";
            } else {
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                C19EG c19egLIZIZ = C1071190dyv.LIZIZ(c1071220dyy2.LIZ);
                c19741112Lp.getClass();
                str = C19741112Lp.LJI(c19egLIZIZ, "android.permission.READ_CONTACTS", false) ? "guide" : "system";
            }
        }
        c2344009Gk.LJIIIIZZ("pop_up_type", str);
        c2344009Gk.LJIIIIZZ("auth_type", LJFF());
        c2344009Gk.LJII(LJ());
        c2344009Gk.LJII(LJI());
        c2344009Gk.LJII(LJII());
        return c2344009Gk.LIZ;
    }

    public C1071700dzk(C1071220dyy c1071220dyy) {
        super(c1071220dyy, null);
    }

    public C1071700dzk(C1071220dyy c1071220dyy, Integer num) {
        super(c1071220dyy, num);
    }
}

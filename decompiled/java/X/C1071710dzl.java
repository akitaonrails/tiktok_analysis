package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0dzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071710dzl extends AbstractC1071760dzq {
    public final boolean LJFF;
    public final Boolean LJI;

    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return "authorize_fail_after_allow";
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
        C1071260dz2 c1071260dz2 = this.LIZIZ.LIZIZ.LIZ;
        if (!c1071260dz2.LIZ) {
            str = "system";
        } else {
            if (c1071260dz2.LIZIZ) {
                "wrong initStatus for auth pipeline".toString();
                throw new IllegalStateException("wrong initStatus for auth pipeline");
            }
            str = "user";
        }
        c2344009Gk.LJIIIIZZ("pop_up_type", str);
        c2344009Gk.LJIIIIZZ("auth_type", LJFF());
        c2344009Gk.LJ(Boolean.valueOf(this.LJFF), "has_uid_errorcode");
        c2344009Gk.LJII(LJ());
        c2344009Gk.LJII(LJI());
        c2344009Gk.LJII(LJII());
        return c2344009Gk.LIZ;
    }

    @Override // X.AbstractC1071760dzq
    public final Map<String, String> LJ() {
        if (this.LIZIZ.LIZ.LIZLLL.LIZ != EnumC1070340dxY.FACEBOOK) {
            return null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        c2344009Gk.LJIIIIZZ("has_token", c1076010e6h.LJII().LJIIIIZZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()).length() == 0 ? AbstractC1223210hw7.LIZJ(false) : AbstractC1223210hw7.LIZJ(true));
        Boolean boolLJII = c1076010e6h.LJII().LJII(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("fb_token_expired", boolLJII != null ? AbstractC1223210hw7.LIZJ(boolLJII.booleanValue()) : null);
        c2344009Gk.LJ(this.LIZJ, "server_fb_token");
        Boolean bool = this.LJI;
        c2344009Gk.LJIIIIZZ("has_fbsdk_errorcode", bool != null ? AbstractC1223210hw7.LIZJ(bool.booleanValue()) : null);
        return c2344009Gk.LIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1071710dzl(C1071220dyy c1071220dyy, Integer num, int i) {
        boolean z;
        num = (i & 2) != 0 ? null : num;
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        this(c1071220dyy, num, z, null);
    }

    public C1071710dzl(C1071220dyy c1071220dyy, Integer num, boolean z, Boolean bool) {
        super(c1071220dyy, num);
        this.LJFF = z;
        this.LJI = bool;
    }
}

package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0Sst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735330Sst extends AbstractC1386140mAu<C735330Sst> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;

    public C735330Sst() {
        super("unlogin_like");
        this.LJI = true;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LJJLIIIJ;
        C1210890hcF c1210890hcF = InterfaceC1210900hcG.LIZIZ;
        LJFF("group_id", str, c1210890hcF);
        LJFF("author_id", this.LJJLIIIJILLIZJL, c1210890hcF);
        LJFF("request_id", this.LJJLIIIJJI, c1210890hcF);
        if (C735370Ssx.LJJIJL(this.LIZLLL)) {
            LIZJ(this.LJJLIIIJJI);
        }
        if (!TextUtils.equals(this.LIZ, "like_cancel")) {
            TextUtils.equals(this.LIZ, "unlogin_like");
        }
        if (C1355510lNV.LIZ().LIZIZ(this.LJJLIIIJ)) {
            LJFF("previous_page", "push", InterfaceC1210900hcG.LIZ);
        }
        int iLIZJ = C720360SNm.LIZJ(this.LJJJJZ);
        if (iLIZJ >= 0) {
            LIZLLL(iLIZJ + 1, "pic_location");
        }
        Aweme aweme = this.LJJJJZ;
        if (aweme != null) {
            LIZLLL(AwemeExtKt.getPromoteAdTypeForReport(aweme), "promote_ad_type");
        }
        C1380890m2R.LJ(this.LJJJJZ, this);
        if (!TextUtils.isEmpty(this.LJJLIIIJJIZ)) {
            LJFF("enter_method", this.LJJLIIIJJIZ, InterfaceC1210900hcG.LIZ);
        }
        String strValueOf = String.valueOf(this.LJJLIIIJL);
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("is_first", strValueOf, c2082308Dt);
        LJFF("is_login_notify", String.valueOf(this.LJJLIIIJLJLI), c2082308Dt);
        LJ("homepage_uid", this.LJJLIIJ);
        LJ("profile_entrance_id", this.LJJLIL);
    }

    @Override // X.AbstractC1386140mAu
    /* JADX INFO: renamed from: LJJIJIL, reason: merged with bridge method [inline-methods] */
    public final void LJIJI(Aweme aweme) {
        String strLJIJ;
        super.LJIJI(aweme);
        if (aweme != null) {
            this.LJJLIIIJ = aweme.getAid();
            this.LJJLIIIJILLIZJL = AbstractC1386130mAt.LJIIJ(aweme);
            if (TextUtils.isEmpty(C735370Ssx.LJIJ(this.LJJLIIIJLLLLLLLZ, aweme))) {
                strLJIJ = aweme.getRequestId();
            } else {
                strLJIJ = C735370Ssx.LJIJ(this.LJJLIIIJLLLLLLLZ, aweme);
            }
            this.LJJLIIIJJI = strLJIJ;
        }
    }
}

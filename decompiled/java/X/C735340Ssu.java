package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0Ssu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735340Ssu extends AbstractC1386140mAu<C735340Ssu> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;

    public C735340Ssu() {
        super("unlogin_follow");
        this.LJI = true;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LJJLIIIJ;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("previous_page", str, c2082308Dt);
        LJFF("previous_page_position", this.LJJLIIIJILLIZJL, c2082308Dt);
        LJFF("enter_method", this.LJJLIIIJLJLI, c2082308Dt);
        String str2 = this.LJJLIIIJJI;
        C1210890hcF c1210890hcF = InterfaceC1210900hcG.LIZIZ;
        LJFF("to_user_id", str2, c1210890hcF);
        LJFF("group_id", this.LJJLIIIJJIZ, c1210890hcF);
        LJFF("author_id", this.LJJLIIIJJI, c1210890hcF);
        LJFF("aweme_type", this.LJJLIIJ, c2082308Dt);
        LJFF("request_id", this.LJJLIIIJL, c1210890hcF);
        LJFF("enter_type", null, c2082308Dt);
        LJFF("text_post_content", this.LJJLIL, c2082308Dt);
        Aweme aweme = this.LJJJJZ;
        if (aweme != null) {
            C1380890m2R.LJ(aweme, this);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("enter_from_request", null, c1210890hcF);
        }
        if (C735370Ssx.LJJIJL(this.LIZLLL) || "homepage_hot".equals(this.LJJLIIIJ)) {
            LIZJ(this.LJJLIIIJL);
        }
        if (!TextUtils.equals(this.LIZ, "follow_cancel")) {
            TextUtils.equals(this.LIZ, "unlogin_follow");
        }
        if (C1355510lNV.LIZ().LIZIZ(this.LJJLIIIJJIZ)) {
            LJFF("previous_page", "push", c2082308Dt);
        }
        if (TextUtils.isEmpty(this.LJJLIIIJLLLLLLLZ)) {
            return;
        }
        LJFF("impr_type", this.LJJLIIIJLLLLLLLZ, c2082308Dt);
    }

    public final void LJJIJIL(int i, Aweme aweme) {
        LJIJI(aweme);
        if (aweme != null) {
            this.LJJLIIIJJIZ = aweme.getAid();
            this.LJJLIIIJL = AbstractC1386130mAt.LJIIL(i, aweme);
            this.LJJLIIIJJI = AwemeExtKt.getAuthorUid(aweme);
            this.LJJLIIIJLLLLLLLZ = C735370Ssx.LJI(aweme);
            this.LJJLIIJ = String.valueOf(aweme.getAwemeType());
            this.LJJLIL = String.valueOf(C735370Ssx.LJJ(aweme));
        }
    }
}

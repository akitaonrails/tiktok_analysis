package X;

import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0mBB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386310mBB extends AbstractC1386130mAt<C1386310mBB> {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public Long LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public Integer LJJ;
    public Integer LJJI;

    public C1386310mBB() {
        super("profile_tab_client_show");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LIZLLL;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("enter_from", str, c2082308Dt);
        String str2 = this.LJIILLIIL;
        C1210890hcF c1210890hcF = InterfaceC1210900hcG.LIZIZ;
        LJFF("group_id", str2, c1210890hcF);
        LJFF("author_id", this.LJIIZILJ, c1210890hcF);
        if (!TextUtils.isEmpty(this.LJIJJLI)) {
            LJFF("tab_name", this.LJIJJLI, c2082308Dt);
        }
        TextUtils.equals(this.LIZLLL, "homepage_fresh");
        if (TextUtils.equals(this.LIZLLL, "sticker_profile_detail")) {
            LJFF("tab_name", "effect", c2082308Dt);
        }
        LJFF("request_id", this.LJIJJ, c1210890hcF);
        LJFF("content", this.LJIJI, c2082308Dt);
        if (Intrinsics.LJFF("prop_page", this.LIZLLL)) {
            LJFF("log_pb", C584850Mwl.LIZ.LIZIZ(this.LJIJJ), c1210890hcF);
        } else {
            LJFF("music_id", String.valueOf(this.LJIJ), c1210890hcF);
            if (Intrinsics.LJFF("homepage_fresh", this.LIZLLL) || u.LJIJI("homepage_channel", this.LIZLLL, true)) {
                LIZJ(this.LJIJJ);
            }
        }
        if (C735370Ssx.LJJIIZ(this.LIZLLL)) {
            LJ("tag_id", null);
        }
        String str3 = this.LJIL;
        if (str3 != null && str3.length() != 0 && str3 != null) {
            LJ("prop_id", str3);
        }
        Integer num = this.LJJ;
        if (num != null) {
            LIZLLL(num.intValue(), "effect_source");
        }
        Integer num2 = this.LJJI;
        if (num2 != null) {
            LIZLLL(num2.intValue(), "effect_status");
        }
    }
}

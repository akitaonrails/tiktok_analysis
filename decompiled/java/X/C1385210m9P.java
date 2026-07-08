package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;

/* JADX INFO: renamed from: X.0m9P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385210m9P extends AbstractC1386130mAt<AbstractC1386130mAt<?>> {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public int LJIJJ;

    public C1385210m9P() {
        super("shoot");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LJIILLIIL;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("shoot_way", str, c2082308Dt);
        if (!TextUtils.isEmpty(this.LIZLLL)) {
            LJ("enter_from", this.LIZLLL);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("music_id", null, InterfaceC1210900hcG.LIZIZ);
        }
        if (!TextUtils.isEmpty(this.LJIIZILJ)) {
            LJFF("group_id", this.LJIIZILJ, InterfaceC1210900hcG.LIZIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("tag_id", null, InterfaceC1210900hcG.LIZIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("sticker_id", null, InterfaceC1210900hcG.LIZIZ);
        }
        String str2 = this.LJIJ;
        if (str2 != null) {
            LJFF("content_type", str2, c2082308Dt);
        }
        LJFF("content_cnt", String.valueOf(this.LJIJJ), c2082308Dt);
        LJFF("creation_id", this.LJII, c2082308Dt);
        LJFF("content_source", this.LJIJI, c2082308Dt);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(0);
        sbLIZ.append("");
        LJ("is_reposted", C2188811AlT.LIZIZ(sbLIZ));
        LJ("repost_from_group_id", null);
        LJ("repost_from_user_id", null);
        if (!TextUtils.isEmpty(this.LJIIIIZZ)) {
            LJ("sdk_source_app", this.LJIIIIZZ);
        }
        if (C1355510lNV.LIZ().LIZIZ(this.LJIIZILJ)) {
            LJFF("previous_page", "push", c2082308Dt);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("coupon_code", null);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("supplier_id", null);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("order_id", null);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_hot")) {
            LJ("play_mode", ((FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class)).LJI());
        }
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LIZLLL();
        C836440Wra.LIZJ("shoot", "");
    }
}

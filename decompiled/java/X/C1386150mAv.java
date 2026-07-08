package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;

/* JADX INFO: renamed from: X.0mAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386150mAv extends AbstractC1386130mAt {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public Long LJIJJLI;
    public String LJIL;
    public String LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public String LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZ;

    public C1386150mAv() {
        super("client_show");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        if (!TextUtils.isEmpty(this.LJIILLIIL)) {
            LJ("content_type", this.LJIILLIIL);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("rank_index", null, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("banner_id", null, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("previous_page", null, InterfaceC1210900hcG.LIZ);
        }
        String str = this.LIZLLL;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("enter_from", str, c2082308Dt);
        String str2 = this.LJIIZILJ;
        C1210890hcF c1210890hcF = InterfaceC1210900hcG.LIZIZ;
        LJFF("group_id", str2, c1210890hcF);
        LJFF("author_id", this.LJIJ, c1210890hcF);
        if (!TextUtils.isEmpty(this.LJJIIZ)) {
            LJFF("topic_name", this.LJJIIZ, c2082308Dt);
        }
        if (!TextUtils.isEmpty(this.LJJIIJZLJL)) {
            LJFF("tab_name", this.LJJIIJZLJL, c2082308Dt);
        }
        if (!TextUtils.isEmpty(this.LJIJI)) {
            LJ("repost_from_group_id", this.LJIJI);
        }
        if (!TextUtils.isEmpty(this.LJIJJ)) {
            LJ("repost_from_user_id", this.LJIJJ);
        }
        TextUtils.equals(this.LIZLLL, "homepage_fresh");
        if (TextUtils.equals(this.LIZLLL, "sticker_profile_detail")) {
            LJFF("tab_name", "effect", c2082308Dt);
        }
        LJFF("request_id", this.LJJI, c1210890hcF);
        LJFF("content", this.LJIL, c2082308Dt);
        if ("prop_page".equals(this.LIZLLL)) {
            LJFF("prop_id", null, c1210890hcF);
            LJFF("log_pb", C584850Mwl.LIZ.LIZIZ(this.LJJI), c1210890hcF);
        } else {
            LJFF("music_id", String.valueOf(this.LJIJJLI), c1210890hcF);
            if ("homepage_fresh".equals(this.LIZLLL) || "homepage_channel".equalsIgnoreCase(this.LIZLLL)) {
                LIZJ(this.LJJI);
            }
        }
        LJFF("display", this.LJJ, c2082308Dt);
        if (!TextUtils.isEmpty(null)) {
            LJFF("distance_km", null, c2082308Dt);
        }
        String str3 = this.LIZLLL;
        String str4 = this.LJJIFFI;
        String str5 = this.LJJIII;
        String str6 = this.LJJII;
        if (C735370Ssx.LJJIIZ(str3)) {
            LJ("process_id", str4);
            LJ("tag_id", str5);
            LJ("rank_index", str6);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("parent_tag_id", this.LJJIIJ, c2082308Dt);
        }
        if (TextUtils.isEmpty(null)) {
            return;
        }
        LJFF("page_type", null, c2082308Dt);
    }

    public final void LJIILLIIL(int i, Aweme aweme) {
        String str;
        long id;
        if (aweme != null) {
            this.LJIILLIIL = aweme.getLiveType();
            this.LJIIZILJ = aweme.getAid();
            this.LJIJ = AbstractC1386130mAt.LJIIJ(aweme);
            this.LJJI = AbstractC1386130mAt.LJIIL(i, aweme);
            int awemeType = aweme.getAwemeType();
            if (awemeType != 2) {
                if (awemeType != 101) {
                    str = "video";
                } else {
                    str = "live";
                }
            } else {
                str = "photo";
            }
            this.LJIL = str;
            if (aweme.getMusic() == null) {
                id = 0;
            } else {
                id = aweme.getMusic().getId();
            }
            this.LJIJJLI = Long.valueOf(id);
            aweme.getAid();
            if (AwemeSaaSExtKt.isForwardAweme(aweme)) {
                this.LJIJI = AwemeExtKt.getRepostFromGroupId(aweme);
                this.LJIJJ = AwemeExtKt.getRepostFromUserId(aweme);
            }
            if (aweme.getHotListStruct() != null && aweme.getHotListStruct().getType() == 9) {
                this.LJJIIZ = aweme.getHotListStruct().getTitile();
            }
        }
    }
}

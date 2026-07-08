package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;

/* JADX INFO: renamed from: X.0mBR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386470mBR extends AbstractC1386140mAu<C1386470mBR> {
    public String LJJLIIIJ;
    public Aweme LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public int LJJLJ;
    public final String LJJLJLI;
    public String LJJLL;
    public final String LJJZ;
    public final String LJJZZI;
    public final String LJJZZIII;
    public String LJL;
    public String LJLI;
    public String LJLIIIL;

    public C1386470mBR() {
        super("stay_time");
        this.LJJLJLI = "";
        this.LJJZ = "";
        this.LJJZZI = "";
        this.LJJZZIII = "";
        this.LJI = true;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String strValueOf = String.valueOf(this.LJJLJ);
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("video_consumed", strValueOf, c2082308Dt);
        LJFF("duration", this.LJJLIIIJ, c2082308Dt);
        LJFF("enter_from", this.LIZLLL, c2082308Dt);
        LJFF("enter_method", this.LJL, c2082308Dt);
        LJFF("group_id", this.LJJLIIIJJI, c2082308Dt);
        LJFF("author_id", C735370Ssx.LIZLLL(this.LJJLIIIJILLIZJL), c2082308Dt);
        LJFF("city_info", "", c2082308Dt);
        LJFF("page_uid", this.LJJLIIIJLJLI, c2082308Dt);
        if (!TextUtils.isEmpty(this.LJJLIIIJL)) {
            LJFF("previous_page", this.LJJLIIIJL, c2082308Dt);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("page_type", null, c2082308Dt);
        }
        if (TextUtils.equals(this.LJJLIIIJL, "homepage_hot") || TextUtils.equals(this.LJJLIIIJL, "homepage_follow")) {
            int i = !TextUtils.equals(this.LJJLIIIJL, "homepage_hot") ? 1 : 0;
            LJFF("feeds_group_id", this.LJJLIIIJJIZ, c2082308Dt);
            LJFF("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJI(i, this.LJJLIIIJJIZ)), c2082308Dt);
        }
        if (C735370Ssx.LJJIJ(this.LIZLLL)) {
            C1386210mB1.LIZ.getClass();
            LJ("notice_type", C1386210mB1.LIZIZ);
            LJ("show_cnt", String.valueOf(0));
            LJ("yellow_dot_logid", C1386210mB1.LIZJ);
        }
        if (C735370Ssx.LJJIIZ(this.LIZLLL)) {
            String str = this.LJJLIIIJLLLLLLLZ;
            String str2 = this.LJJLIIJ;
            LJ("process_id", str);
            LJ("tag_id", str2);
        }
        if (!TextUtils.isEmpty(this.LJJLIL)) {
            LJ("playlist_id", this.LJJLIL);
        }
        if (C735370Ssx.LJJIJIIJIL(this.LIZLLL)) {
            C1205250hT9.LIZIZ.LJIIJ("stay_time", this.LIZIZ);
        }
        if ("personal_homepage".equals(this.LIZLLL) || "others_homepage".equals(this.LIZLLL)) {
            LJ("profile_entrance_id", String.valueOf(C1256070in7.LIZ));
        }
        String str3 = this.LJJLJLI;
        if (str3 != null && !str3.isEmpty()) {
            LJ("music_id", this.LJJLJLI);
        }
        String str4 = this.LJJZ;
        if (str4 != null && !str4.isEmpty()) {
            LJ("single_song_shoot_previous_page", this.LJJZ);
        }
        String str5 = this.LJJZZI;
        if (str5 != null && !str5.isEmpty()) {
            LJ("single_song_shoot_previous_enter_method", this.LJJZZI);
        }
        String str6 = this.LJJZZIII;
        if (str6 != null && !str6.isEmpty()) {
            LJ("previous_search_query", this.LJJZZIII);
        }
        String str7 = this.LJJLL;
        if (str7 != null && !str7.isEmpty()) {
            LJ("shared_feed_id", this.LJJLL);
        }
        String str8 = this.LIZLLL;
        if (TextUtils.equals(str8, "trending_post") || TextUtils.equals(str8, "trending_creator") || TextUtils.equals(str8, "trending_topic") || TextUtils.equals(this.LIZLLL, "others_homepage") || TextUtils.equals(this.LIZLLL, "creator_inspiration_feed") || TextUtils.equals(this.LIZLLL, "creator_analytics")) {
            LJFF("page_name", this.LJLI, c2082308Dt);
            LJFF("sub_page_name", this.LJLIIIL, c2082308Dt);
        }
        LJI("if_default", C1EE1.LIZIZ.LJJIII());
    }

    @Override // X.AbstractC1386140mAu
    /* JADX INFO: renamed from: LJJIJIL, reason: merged with bridge method [inline-methods] */
    public final void LJIJI(Aweme aweme) {
        PlayListInfo playListInfo;
        super.LJIJI(aweme);
        this.LJJLIIIJILLIZJL = aweme;
        this.LJJLIIIJJI = C735370Ssx.LIZJ(aweme);
        if (aweme != null && (playListInfo = aweme.playlist_info) != null && playListInfo.getMixId() != null) {
            this.LJJLIL = aweme.playlist_info.getMixId();
        }
    }

    public final void LJJIJL(String str) {
        this.LIZLLL = str;
        if (TextUtils.equals(str, "others_homepage") || TextUtils.equals(str, "creator_inspiration_feed")) {
            this.LJLI = "homepage";
            this.LJLIIIL = this.LIZLLL;
        }
    }
}

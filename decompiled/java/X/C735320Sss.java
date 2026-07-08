package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Sss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735320Sss extends AbstractC735380Ssy<C735320Sss> {
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public Aweme LJJLL;
    public String LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public String LJL;
    public String LJLI;
    public boolean LJLIIIL;
    public String LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public int LJLLILLLL;

    public C735320Sss() {
        super("enter_tag_detail");
        this.LJLIIL = "";
        this.LJLLILLLL = -1;
        this.LJI = true;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LJJLIIIJL;
        C1210890hcF c1210890hcF = InterfaceC1210900hcG.LIZIZ;
        LJFF("group_id", str, c1210890hcF);
        LJFF("author_id", this.LJJLIIIJLJLI, c1210890hcF);
        LJFF("tag_id", this.LJJLIIIJLLLLLLLZ, c1210890hcF);
        String str2 = this.LJJLIIJ;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("request_id", str2, c2082308Dt);
        LJFF("category_name", this.LJLJLJ, c2082308Dt);
        if (!C2093608Ic.LJ(this.LJJLIL)) {
            LJFF("content_type", this.LJJLIL, c2082308Dt);
        }
        if (C1355510lNV.LIZ().LIZIZ(this.LJJLIIIJL)) {
            LJFF("previous_page", "push", c2082308Dt);
        } else if (!TextUtils.isEmpty(this.LJLJI)) {
            LJFF("previous_page", this.LJLJI, c2082308Dt);
            LJFF("previous_page_position", this.LJLJJI, c2082308Dt);
        }
        if (this.LJLJJL) {
            LJFF("is_instructive", "1", c2082308Dt);
            LJFF("bottom_bar_show", "1", c2082308Dt);
        }
        if (C735370Ssx.LJJIJL(this.LIZLLL)) {
            LIZJ(this.LJJLIIJ);
        }
        if (!TextUtils.isEmpty(this.LJJZZI)) {
            LJFF(this.LJJZZI, this.LJJZZIII, c2082308Dt);
        }
        if (!TextUtils.equals(this.LIZLLL, "homepage_fresh")) {
            TextUtils.equals(this.LIZLLL, "homepage_channel");
        }
        if (!TextUtils.isEmpty(this.LJJZ)) {
            LJFF("playlist_type", this.LJJZ, c2082308Dt);
        }
        if (!TextUtils.isEmpty(this.LJL)) {
            LJFF("impr_type", this.LJL, c2082308Dt);
        }
        if (!TextUtils.isEmpty(this.LJLI)) {
            LJFF("compilation_id", this.LJLI, c2082308Dt);
        }
        String str3 = this.LJLJLLL;
        if (str3 != null) {
            LJ("tt_template_type", str3);
        }
        String str4 = this.LJLL;
        if (str4 != null) {
            LJ("tt_template_id", str4);
        }
        LJ("impr_id", this.LJJLIIJ);
        if (C584460Mw8.LIZ) {
            LJ("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("search_keyword", null, c2082308Dt);
        }
        if (C735370Ssx.LJJIIZI(this.LIZLLL)) {
            LJ("relation_type", this.LJLIIIL ? "follow" : "unfollow");
            LJ("video_type", this.LJLIL);
            LJ("rec_uid", this.LJLILLLLZI);
        }
        String str5 = this.LJJLJ;
        if (!TextUtils.isEmpty(str5)) {
            LJ("process_id", str5);
        }
        if (!TextUtils.isEmpty(this.LJIIZILJ)) {
            LJ("tab_name", this.LJIIZILJ);
        }
        if (!TextUtils.isEmpty(this.LJLJL)) {
            LJ("hashtag", this.LJLJL);
        }
        if (!TextUtils.isEmpty(this.LJLJJLL)) {
            LJ("parent_tag_id", this.LJLJJLL);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("search_type", null);
        }
        if (!TextUtils.isEmpty(this.LJJLJLI)) {
            LJ("tag_line", this.LJJLJLI);
        }
        if (!TextUtils.isEmpty(this.LJIJ)) {
            LJ("order", this.LJIJ);
        }
        LIZLLL(!TextUtils.isEmpty(null) ? 1 : 0, "is_bundled");
        if (!TextUtils.isEmpty(null)) {
            LJ("prop_id", null);
        }
        if ("general_search".equals(this.LIZLLL) || "search_result".equals(this.LIZLLL)) {
            LJ("last_from_group_id", this.LJLLI);
        }
        LJ("follow_status", this.LJLIIL);
        Aweme aweme = this.LJJLL;
        if (aweme != null) {
            LIZLLL(aweme.getAwemeType(), "aweme_type");
            LIZLLL(C735370Ssx.LJJ(this.LJJLL), "text_post_content");
            LIZLLL(C735370Ssx.LJIILL(this.LJJLL), "pic_cnt");
            if (this.LJJJJZ.getMobParams() != null) {
                LIZIZ(this.LJJLL.getMobParams());
            }
            if (C735370Ssx.LJJIIJ(this.LJJJJZ) || C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_mode", "1");
            }
            if (C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_trans_pic", "1");
            }
            ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIILLIIL(this.LJJJJZ, this);
            C1606660rua.LIZIZ.LIZJ(this.LIZLLL, (HashMap) this.LIZIZ, this.LJJJJZ, true);
            C1367960lha.LIZ.getClass();
            Map mapLJIILJJIL = C1367960lha.LIZ().LJIILJJIL(this.LJJJJZ, null);
            if (!mapLJIILJJIL.isEmpty()) {
                LIZIZ(mapLJIILJJIL);
            }
            int i = this.LJLLILLLL;
            if (i != -1) {
                LIZLLL(i, "music_name");
            }
        }
    }

    public final void LJJIJLIJ(String str) {
        this.LJJLIIIJLJLI = str;
    }

    @Override // X.AbstractC1386140mAu
    /* JADX INFO: renamed from: LJJIL, reason: merged with bridge method [inline-methods] */
    public final void LJIJI(Aweme aweme) {
        String uid;
        super.LJIJI(aweme);
        if (aweme != null) {
            this.LJJLL = aweme;
            this.LJJLIIIJL = aweme.getAid();
            if (TextUtils.isEmpty(this.LJJLIIJ)) {
                this.LJJLIIJ = aweme.getRequestId();
            }
            if (aweme.getAuthor() != null) {
                uid = aweme.getAuthor().getUid();
            } else {
                uid = "";
            }
            this.LJJLIIIJLJLI = uid;
            this.LJJLIL = C735370Ssx.LJFF(aweme);
            this.LJL = C735370Ssx.LJI(aweme);
            if (aweme.getMixInfo() != null) {
                this.LJLI = aweme.getMixInfo().mixId;
            }
            this.LJLIIIL = C10EU.LJIIJJI(aweme);
            this.LJLIIL = C735370Ssx.LJIJJLI(aweme.getAuthor());
            this.LJLIL = C735370Ssx.LJIIIIZZ(aweme);
            this.LJLILLLLZI = C735370Ssx.LJII(aweme);
            IAnchorBusinessOutBridgeService iAnchorBusinessOutBridgeService = (IAnchorBusinessOutBridgeService) PluggableExtentionKt.pluggableSpi(IAnchorBusinessOutBridgeService.class);
            if (iAnchorBusinessOutBridgeService != null) {
                C1387380mCu c1387380mCuLIZLLL = iAnchorBusinessOutBridgeService.LIZLLL(aweme);
                this.LJLJLLL = c1387380mCuLIZLLL.LIZJ;
                this.LJLL = c1387380mCuLIZLLL.LIZLLL;
            }
        }
    }

    public final void LJJIZ(String str) {
        this.LJLJLJ = str;
    }

    public final void LJJJ(String str) {
        this.LIZLLL = str;
    }

    public final void LJJJI(String str) {
        this.LJJLIIIJL = str;
    }

    public final void LJJJIL(boolean z) {
        this.LJLJJL = z;
    }

    public final void LJJJJ(int i) {
        this.LJLLILLLL = i;
    }

    public final void LJJJJI(String str) {
        this.LJLJI = str;
    }

    public final void LJJJJIZL(String str) {
        this.LJLJJI = str;
    }

    public final void LJJJJJ(String str) {
        this.LJJLJ = str;
    }

    public final void LJJJJJL(String str) {
        if (!C2093608Ic.LJ(str)) {
            this.LJJLIIJ = str;
        }
    }

    public final void LJJJJL(String str) {
        this.LJJLIIIJLLLLLLLZ = str;
    }
}

package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0m62, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383120m62 extends AbstractC735380Ssy<C1383120m62> {
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public Aweme LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public boolean LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public boolean LJL;
    public String LJLI;
    public String LJLIIIL;
    public String LJLIIL;
    public boolean LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public Map<String, String> LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public String LJLLI;

    public C1383120m62() {
        super("enter_music_detail");
        this.LJLI = "";
        this.LJLJI = "";
        this.LJLJJL = -1;
        this.LJLJLJ = "";
        this.LJLJLLL = "";
        this.LJI = true;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        Aweme aweme;
        String str = this.LJJLIIIJL;
        C1210890hcF c1210890hcF = InterfaceC1210900hcG.LIZIZ;
        LJFF("group_id", str, c1210890hcF);
        LJFF("music_id", this.LJJLIIIJLLLLLLLZ, c1210890hcF);
        LJFF("author_id", this.LJJLIIIJLJLI, c1210890hcF);
        String str2 = this.LJLILLLLZI;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("category_name", str2, c2082308Dt);
        LJFF("request_id", this.LJJLIIJ, c1210890hcF);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        boolean z = false;
        sbLIZ.append(0);
        sbLIZ.append("");
        LJ("is_reposted", C2188811AlT.LIZIZ(sbLIZ));
        LJ("repost_from_group_id", null);
        LJ("repost_from_user_id", null);
        LJ("from_page", this.LJLJI);
        if ((!C2222691Bz1.LIZ().toUpperCase(Locale.ROOT).equals("US") || ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) && (aweme = this.LJJLJ) != null && aweme.getStickerEntranceInfo() != null && this.LJJJJZ.getStickerEntranceInfo().id != null) {
            LJ("from_prop_id", this.LJJLJ.getStickerEntranceInfo().id);
        }
        if (C1355510lNV.LIZ().LIZIZ(this.LJJLIIIJL)) {
            LJFF("previous_page", "push", c2082308Dt);
        } else if (!TextUtils.isEmpty(this.LJJLJLI)) {
            LJFF("previous_page", this.LJJLJLI, c2082308Dt);
            LJFF("previous_page_position", this.LJJLL, c2082308Dt);
        }
        if (this.LJJZ) {
            LJFF("is_instructive", "1", c2082308Dt);
            LJFF("bottom_bar_show", "1", c2082308Dt);
        }
        if (C735370Ssx.LJJIJL(this.LIZLLL)) {
            LIZJ(this.LJJLIIJ);
        }
        if (!TextUtils.equals(this.LIZLLL, "homepage_fresh")) {
            TextUtils.equals(this.LIZLLL, "homepage_channel");
        }
        if (!TextUtils.isEmpty(this.LJIIZILJ)) {
            LJ("tab_name", this.LJIIZILJ);
        }
        if (!TextUtils.isEmpty(this.LJLL)) {
            LJ("tt_template_type", this.LJLL);
        }
        if (!TextUtils.isEmpty(this.LJLLI)) {
            LJ("tt_template_id", this.LJLLI);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF(null, null, c2082308Dt);
        }
        if (!TextUtils.isEmpty(null)) {
            LJFF("playlist_type", null, c2082308Dt);
        }
        if (!TextUtils.isEmpty(this.LJJZZI)) {
            LJFF("impr_type", this.LJJZZI, c2082308Dt);
        }
        if (!TextUtils.isEmpty(this.LJJZZIII)) {
            LJFF("compilation_id", this.LJJZZIII, c2082308Dt);
        }
        if (!TextUtils.isEmpty(this.LJJLIL)) {
            LJFF("process_id", this.LJJLIL, c2082308Dt);
        }
        if (LJJ() && !TextUtils.isEmpty(null)) {
            LJ("enter_position", null);
        }
        Map<String, String> map = this.LJLJJLL;
        if (map != null) {
            LIZIZ(map);
        }
        LJ("impr_id", this.LJJLIIJ);
        if (C584460Mw8.LIZ) {
            LJ("is_fullscreen", "1");
        }
        if (C735370Ssx.LJJIIZI(this.LIZLLL)) {
            LJ("relation_type", this.LJL ? "follow" : "unfollow");
            LJ("video_type", this.LJLIIIL);
            LJ("rec_uid", this.LJLIIL);
        }
        LJ("ugc_to_pgc_meta", this.LJLIL ? "1" : CardStruct.IStatusCode.DEFAULT);
        if ("search_result".equals(this.LIZLLL) || "general_search".equals(this.LIZLLL)) {
            LJ("last_from_group_id", null);
            LJ("is_search_scene", "1");
        }
        LJ("follow_status", this.LJLI);
        Aweme aweme2 = this.LJJLJ;
        if (aweme2 != null) {
            LIZLLL(aweme2.getAwemeType(), "aweme_type");
            LIZLLL(C735370Ssx.LJJ(this.LJJLJ), "text_post_content");
            LIZLLL(C735370Ssx.LJIILL(this.LJJLJ), "pic_cnt");
            if (C735370Ssx.LJJIIJ(this.LJJJJZ) || C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_mode", "1");
            }
            if (C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_trans_pic", "1");
            }
            if (this.LJJJJZ.getMobParams() != null) {
                LIZIZ(this.LJJLJ.getMobParams());
            }
            ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIILLIIL(this.LJJJJZ, this);
            C1606660rua.LIZIZ.LIZJ(this.LIZLLL, (HashMap) this.LIZIZ, this.LJJJJZ, true);
            if (C1367960lha.LIZ != null && C1367960lha.LIZ() != null) {
                LIZIZ(C1367960lha.LIZ().LJIILJJIL(this.LJJJJZ, null));
            }
            Boolean boolValueOf = Boolean.valueOf((this.LJJLJ.getOriginVolume() == null || this.LJJLJ.getOriginVolume().isEmpty() || CastFloatProtector.parseFloat(this.LJJLJ.getOriginVolume()) <= 0.0f) ? false : true);
            if (this.LJJLJ.getMusicVolume() != null && !this.LJJLJ.getMusicVolume().isEmpty() && CastFloatProtector.parseFloat(this.LJJLJ.getMusicVolume()) > 0.0f) {
                z = true;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z);
            LJ("is_original_and_added_sound", (boolValueOf.booleanValue() && boolValueOf2.booleanValue()) ? "1" : CardStruct.IStatusCode.DEFAULT);
            LJ("original_sound_volume", boolValueOf.booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
            LJ("added_sound_volume", boolValueOf2.booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
            LIZLLL(this.LJJLJ.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
            C15WT.LIZIZ.LJIJJLI(this, this.LIZLLL, this.LJJLIIIJJIZ, this.LJJLJ.getAid());
            C1366720lfa.LIZIZ(this.LJJLJ, this, this.LIZLLL, this.LJJLIIIJJIZ);
        }
        LIZLLL(this.LJLJJI ? 1 : 0, "is_long_press");
        int i = this.LJLJJL;
        if (i != -1) {
            LIZLLL(i, "music_name");
        }
        String str3 = this.LJLJL;
        if (str3 != null) {
            LJ("search_enter_position", str3);
        }
        String str4 = this.LJLJLJ;
        if (str4 != null) {
            LJ("music_type", str4);
        }
        LJ("reference_tts_voice_ids", this.LJLJLLL);
        Map<String, String> contentRecReasonParams = C529890KqJ.LIZ().getContentRecReasonParams(this.LJJLJ, this.LIZLLL);
        if (contentRecReasonParams != null) {
            for (Map.Entry<String, String> entry : contentRecReasonParams.entrySet()) {
                LJ(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // X.AbstractC1386140mAu
    /* JADX INFO: renamed from: LJJIJLIJ, reason: merged with bridge method [inline-methods] */
    public final void LJIJI(Aweme aweme) {
        String strValueOf;
        super.LJIJI(aweme);
        if (aweme != null) {
            this.LJJLJ = aweme;
            this.LJJLIIJ = C735370Ssx.LJIJJ(aweme);
            this.LJJLIIIJL = aweme.getAid();
            this.LJJLIIIJLJLI = AwemeExtKt.getAuthorUid(aweme);
            if (aweme.getMusic() == null) {
                strValueOf = "";
            } else {
                strValueOf = String.valueOf(aweme.getMusic().getId());
            }
            this.LJJLIIIJLLLLLLLZ = strValueOf;
            this.LJJZZI = C735370Ssx.LJI(aweme);
            if (aweme.getMixInfo() != null) {
                this.LJJZZIII = aweme.getMixInfo().mixId;
            }
            this.LJL = C10EU.LJIIJJI(aweme);
            this.LJLI = C735370Ssx.LJIJJLI(aweme.getAuthor());
            this.LJLIIIL = C735370Ssx.LJIIIIZZ(aweme);
            this.LJLIIL = C735370Ssx.LJII(aweme);
            Music music = aweme.getMusic();
            if (music != null) {
                this.LJLJJLL = music.getLogExtraMap();
            }
            IAnchorBusinessOutBridgeService iAnchorBusinessOutBridgeService = (IAnchorBusinessOutBridgeService) PluggableExtentionKt.pluggableSpi(IAnchorBusinessOutBridgeService.class);
            if (iAnchorBusinessOutBridgeService != null) {
                C1387380mCu c1387380mCuLIZLLL = iAnchorBusinessOutBridgeService.LIZLLL(aweme);
                this.LJLL = c1387380mCuLIZLLL.LIZJ;
                this.LJLLI = c1387380mCuLIZLLL.LIZLLL;
            }
        }
    }

    public final void LJJIL(String str) {
        this.LJLILLLLZI = str;
    }

    public final void LJJIZ(String str) {
        this.LIZLLL = str;
    }

    public final void LJJJ(String str) {
        this.LJJLIIIJL = str;
    }

    public final void LJJJI(boolean z) {
        this.LJJZ = z;
    }

    public final void LJJJIL(boolean z) {
        this.LJLJJI = z;
    }

    public final void LJJJJ(String str) {
        this.LJJLIIIJLLLLLLLZ = str;
    }

    public final void LJJJJI(int i) {
        this.LJLJJL = i;
    }

    public final void LJJJJIZL(String str) {
        this.LJLJLJ = str;
    }

    public final void LJJJJJ(String str) {
        this.LJJLJLI = str;
    }

    public final void LJJJJJL(String str) {
        this.LJJLL = str;
    }

    public final void LJJJJL(String str) {
        this.LJJLIL = str;
    }

    public final void LJJJJLL(String str) {
        this.LJLJL = str;
    }

    public final void LJJJJZ(boolean z) {
        this.LJLIL = z;
    }

    public final void LJJJJLI(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        if (list2 != null && !list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        this.LJLJLLL = C188900o3.LIZ(arrayList);
    }
}

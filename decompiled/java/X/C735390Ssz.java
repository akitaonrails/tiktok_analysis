package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.anchor.service.EcommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ssz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735390Ssz extends AbstractC1386140mAu<C735390Ssz> {
    public Aweme LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public int LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public int LJJZZI;
    public final Gson LJJZZIII;
    public int LJL;
    public String LJLI;
    public String LJLIIIL;

    public C735390Ssz() {
        super("dislike");
        this.LJJLIIIJLJLI = "";
        this.LJJZZIII = new Gson();
        this.LJL = -1;
        this.LJLI = null;
        this.LJLIIIL = null;
        this.LJI = true;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        int iIsMeme;
        int i;
        String str = this.LJJLIIIJILLIZJL;
        InterfaceC1210900hcG interfaceC1210900hcG = InterfaceC1210900hcG.LIZIZ;
        LJFF("group_id", str, interfaceC1210900hcG);
        LJFF("author_id", this.LJJLIIIJJI, interfaceC1210900hcG);
        String str2 = this.LJJLIIIJJIZ;
        InterfaceC1210900hcG interfaceC1210900hcG2 = InterfaceC1210900hcG.LIZ;
        LJFF("enter_method", str2, interfaceC1210900hcG2);
        if (C1355510lNV.LIZ().LIZIZ(this.LJJLIIIJILLIZJL)) {
            LJFF("previous_page", "push", interfaceC1210900hcG2);
        }
        if (C735370Ssx.LJJIJL(this.LIZLLL)) {
            LIZJ(this.LJJLIIIJLJLI);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJLLLLLLLZ)) {
            LJFF("impr_type", this.LJJLIIIJLLLLLLLZ, interfaceC1210900hcG2);
        }
        if (!TextUtils.isEmpty(this.LJJLIIJ)) {
            LJFF("content_type", this.LJJLIIJ, interfaceC1210900hcG2);
        }
        if (!TextUtils.isEmpty(this.LJJLIL)) {
            LJFF("display_method", this.LJJLIL, interfaceC1210900hcG2);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJL)) {
            LJFF("panel_source", this.LJJLIIIJL, interfaceC1210900hcG2);
        }
        Aweme aweme = this.LJJLIIIJ;
        LIZLLL((aweme == null || !aweme.isAd()) ? 0 : 1, "is_ads");
        LIZLLL(C1017070cZd.LJJIIJ(this.LJJLIIIJ), "has_nova_like_effect");
        Aweme aweme2 = this.LJJLIIIJ;
        if (aweme2 == null || aweme2.getMemeRegInfo() == null) {
            iIsMeme = 0;
            i = 0;
        } else {
            iIsMeme = this.LJJLIIIJ.getMemeRegInfo().isMeme();
            i = this.LJJLIIIJ.getMemeRegInfo().canBoostMeme;
        }
        LIZLLL(iIsMeme, "is_meme");
        LIZLLL(i, "can_boost_meme");
        String str3 = this.LJLI;
        if (str3 != null) {
            LJ("tt_template_type", str3);
        }
        String str4 = this.LJLIIIL;
        if (str4 != null) {
            LJ("tt_template_id", str4);
        }
        if (C727520SgI.LJFF(this.LJJJJZ)) {
            LJ("relation_type", "");
        } else {
            LJ("rec_type", C727520SgI.LIZJ(this.LJJJJZ));
            LJ("relation_type", C727520SgI.LIZ(this.LJJJJZ));
        }
        if (!TextUtils.isEmpty(this.LJJZ)) {
            LJFF("follow_status", this.LJJZ, interfaceC1210900hcG2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJJLJ);
        sbLIZ.append("");
        LJ("is_reposted", C2188811AlT.LIZIZ(sbLIZ));
        LJ("repost_from_group_id", this.LJJLJLI);
        LJ("repost_from_user_id", this.LJJLL);
        LIZLLL(this.LJJZZI, "is_promoted");
        Aweme aweme3 = this.LJJLIIIJ;
        if (aweme3 != null) {
            LIZLLL(aweme3.getAwemeType(), "aweme_type");
            LIZLLL(C735370Ssx.LJJ(this.LJJLIIIJ), "text_post_content");
            LIZLLL(C735370Ssx.LJIILL(this.LJJLIIIJ), "pic_cnt");
            String strLIZ = C1381730m3n.LIZ(this.LJJLIIIJ);
            if (strLIZ != null && !strLIZ.isEmpty()) {
                LJ("photo_content_type", strLIZ);
            }
            if (C735370Ssx.LJJIIJ(this.LJJJJZ) || C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_mode", "1");
            }
            if (C735370Ssx.LJJIL(this.LJJJJZ)) {
                LJ("is_text_trans_pic", "1");
            }
            if (C735370Ssx.LJJIII(this.LJJJJZ)) {
                LJ("is_comment_to_post", "1");
            }
            Map mobParams = this.LJJLIIIJ.getMobParams();
            if (mobParams != null) {
                LIZIZ(mobParams);
            }
            Aweme aweme4 = this.LJJJJZ;
            if (aweme4 != null) {
                C1380890m2R.LJ(aweme4, this);
            }
            Map<String, Object> mapLIZIZ = EcommerceAnchorService.LIZJ().LIZIZ(this.LJJJJZ);
            if (mapLIZIZ != null) {
                for (Map.Entry<String, Object> entry : mapLIZIZ.entrySet()) {
                    LJ(entry.getKey(), entry.getValue().toString());
                }
            }
            LJ("req_id", this.LJJLIIIJLJLI);
            try {
                LJ("impr_id", ((LogPbBean) this.LJJZZIII.LJII(C584850Mwl.LIZ.LIZIZ(this.LJJLIIIJLJLI), LogPbBean.class)).getImprId());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJ("impr_id", "");
            }
            LIZLLL(this.LJJLIIIJ.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        }
        try {
            HashMap<String, String> map = new HashMap<>();
            C1606660rua.LIZIZ.LIZJ(this.LIZLLL, map, this.LJJJJZ, false);
            if (!map.isEmpty()) {
                LIZIZ(map);
            }
            if (C1367960lha.LIZ != null && C1367960lha.LIZ() != null && this.LJJJJZ != null) {
                LIZIZ(C1367960lha.LIZ().LJIILJJIL(this.LJJJJZ, C1367960lha.LIZ().LJLJL(this.LJJJJZ.getAid())));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZIZ(C735450St5.LIZ(this.LJJLIIIJ, this.LIZLLL));
        int i2 = this.LJL;
        if (i2 != -1) {
            LIZLLL(i2, "music_name");
        }
        LJ("redistribute_reason", "homepage_hot".equals(this.LIZLLL) ? C1383360m6Q.LIZ(this.LJJJJZ) : "");
        Map<String, String> contentRecReasonParams = C529890KqJ.LIZ().getContentRecReasonParams(this.LJJLIIIJ, this.LIZLLL);
        if (contentRecReasonParams != null) {
            for (Map.Entry<String, String> entry2 : contentRecReasonParams.entrySet()) {
                LJ(entry2.getKey(), entry2.getValue());
            }
        }
    }

    @Override // X.AbstractC1386140mAu
    /* JADX INFO: renamed from: LJJIJIL, reason: merged with bridge method [inline-methods] */
    public final void LJIJI(Aweme aweme) {
        super.LJIJI(aweme);
        this.LJJLIIIJ = aweme;
        this.LJJLIIIJLLLLLLLZ = C735370Ssx.LJI(aweme);
        if (aweme != null && aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().text)) {
            this.LJJZZI = 1;
        }
        C1365450ldX.LIZLLL(this, aweme.getAuthor());
        C735400St0 c735400St0LIZ = C1380820m2K.LIZ(aweme);
        this.LJLI = c735400St0LIZ.LIZ;
        this.LJLIIIL = c735400St0LIZ.LIZIZ;
    }
}

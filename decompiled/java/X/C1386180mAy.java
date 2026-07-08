package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1386180mAy extends AbstractC1386140mAu<C1386180mAy> {
    public String LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public long LJJLIIIJL;
    public final String LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public String LJJZZI;
    public final int LJJZZIII;
    public String LJL;
    public String LJLI;
    public int LJLIIIL;
    public boolean LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public final String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public final String LJLLL;
    public final int LJLLLL;
    public final String LJLLLLLL;
    public int LJLZ;
    public final String LJZ;
    public final String LJZI;
    public final String LJZL;
    public final String LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public String LLFFF;
    public String LLFII;
    public int LLFZ;
    public final String LLI;
    public final String LLIFFJFJJ;
    public String LLII;
    public final Integer LLIIII;
    public final String LLIIIILZ;
    public int LLIIIJ;

    public C1386180mAy() {
        super("play_time");
        this.LJJLIIIJLJLI = "";
        this.LJJLIIIJLLLLLLLZ = 1;
        this.LJJZZIII = -1;
        this.LJLJJL = -1;
        this.LJLL = "";
        this.LJLLJ = "";
        this.LJLLL = "";
        this.LJLLLL = -1;
        this.LJLLLLLL = "";
        this.LJZ = "";
        this.LJZI = "";
        this.LJZL = "";
        this.LL = "";
        this.LLFFF = null;
        this.LLFII = null;
        this.LLFZ = 0;
        this.LLI = "";
        this.LLIFFJFJJ = "";
        this.LLII = "";
        this.LLIIII = -1;
        this.LLIIIILZ = "";
        this.LLIIIJ = 0;
        this.LJI = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0886 A[LOOP:1: B:360:0x0880->B:362:0x0886, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x098b  */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.0mAt, X.0mAu, X.0mAy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v125 */
    /* JADX WARN: Type inference failed for: r1v126 */
    /* JADX WARN: Type inference failed for: r1v127 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67, types: [int] */
    @Override // X.AbstractC1386130mAt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 2750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1386180mAy.LJIIIIZZ():void");
    }

    @Override // X.AbstractC1386140mAu
    public final String LJJI() {
        return this.LJJLIIIJ;
    }

    public static String LJJIJL(Aweme aweme) {
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                if (anchorCommonStruct.getType() == 45) {
                    try {
                        return JSONObjectProtectorUtils.getString(new JSONObject(anchorCommonStruct.getExtra()), "poi_id");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return anchorCommonStruct.getId();
                    }
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIZ(Aweme aweme) {
        super.LJIIIZ(aweme);
        if (TextUtils.isEmpty(this.LJIIJ)) {
            this.LJIIJ = AbstractC1386130mAt.LJIIJJI(1, aweme);
        }
    }

    @Override // X.AbstractC1386140mAu
    /* JADX INFO: renamed from: LJJIJIL, reason: merged with bridge method [inline-methods] */
    public final void LJIJI(Aweme aweme) {
        int duration;
        super.LJIJI(aweme);
        if (aweme != null) {
            this.LJJLIIIJ = aweme.getAid();
            this.LJJLIIIJJIZ = AbstractC1386130mAt.LJIIJ(aweme);
            this.LJJLL = C735370Ssx.LJI(aweme);
            AwemeExtKt.isImage(aweme);
            this.LJLJJLL = AwemeSaaSExtKt.isForwardAweme(aweme) ? 1 : 0;
            this.LJJZ = AwemeExtKt.getRepostFromGroupId(aweme);
            this.LJJZZI = AwemeExtKt.getRepostFromUserId(aweme);
            if (aweme.getMemeRegInfo() != null) {
                this.LJJLIIIJJI = aweme.getMemeRegInfo().canBoostMeme;
                this.LJJLIIIJILLIZJL = aweme.getMemeRegInfo().isMeme();
            }
            if (aweme.getMixInfo() != null) {
                this.LJL = aweme.getMixInfo().mixId;
            }
            if (!C727520SgI.LJI(this.LJJJJZ)) {
                this.LJLJLJ = C727520SgI.LIZIZ(this.LJJJJZ).mutualType;
            }
            this.LJLIIL = C10EU.LJIIJJI(aweme);
            this.LJLIL = C735370Ssx.LJIIIIZZ(aweme);
            this.LJLILLLLZI = C735370Ssx.LJII(aweme);
            this.LJLJI = "";
            if (C1833407Ga.LIZ() && AwemeExtKt.isPhotoMode(aweme)) {
                this.LJLIIIL = C1EE2.LIZIZ.LJJIJIL(aweme);
            } else {
                if (aweme.getVideo() != null) {
                    duration = aweme.getVideo().getDuration();
                } else {
                    duration = 0;
                }
                this.LJLIIIL = duration;
            }
            if (aweme.getIsTikTokStory()) {
                this.LJLJJI = C735370Ssx.LJIJJLI(aweme.getAuthor());
            } else {
                this.LJLJJI = C735370Ssx.LJIIJ(aweme);
            }
            this.LJIJJ = C735370Ssx.LJIILLIIL(aweme);
            C727520SgI.LJFF(aweme);
            this.LJIJJLI = "";
            this.LLFZ = AwemeBizExtKt.getHasAd(aweme);
            if (TextUtils.isEmpty(this.LJIJ)) {
                this.LJIJ = AbstractC1386130mAt.LJIIJJI(1, aweme);
            }
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().text)) {
                this.LJLJLLL = 1;
            }
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && playListInfo.getMixId() != null) {
                this.LJLLJ = aweme.playlist_info.getMixId();
            }
            C1365450ldX.LIZLLL(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.LJLZ = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.LJLZ = 1;
            }
            IAnchorBusinessOutBridgeService iAnchorBusinessOutBridgeService = (IAnchorBusinessOutBridgeService) PluggableExtentionKt.pluggableSpi(IAnchorBusinessOutBridgeService.class);
            if (iAnchorBusinessOutBridgeService != null) {
                C1387380mCu c1387380mCuLIZLLL = iAnchorBusinessOutBridgeService.LIZLLL(aweme);
                this.LLFFF = c1387380mCuLIZLLL.LIZJ;
                this.LLFII = c1387380mCuLIZLLL.LIZLLL;
            }
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                this.LLII = commerceVideoAuthInfo.getBCHashtag();
            }
            List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
            if (interactStickerStructs != null && interactStickerStructs.size() > 0) {
                Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InteractStickerStruct next = it2.next();
                    if (next.getQaStruct() != null) {
                        this.LLFF = 1;
                        next.getQaStruct();
                        TextUtils.equals(aweme.getAid(), String.valueOf(next.getQaStruct().itemId));
                        break;
                    }
                }
            }
            if (aweme.getAnchors() != null) {
                Iterator<AnchorCommonStruct> it3 = aweme.getAnchors().iterator();
                while (it3.hasNext()) {
                    if (it3.next().getType() == EnumC1430380nKG.SUBSCRIPTION_ANCHOR.getTYPE()) {
                        this.LLIIIJ = 1;
                        return;
                    }
                }
            }
        }
    }
}

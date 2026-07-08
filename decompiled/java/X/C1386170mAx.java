package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1386170mAx extends AbstractC1386140mAu<C1386170mAx> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public final String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public int LJJLL;
    public String LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public boolean LJL;
    public String LJLI;
    public String LJLIIIL;
    public String LJLIIL;
    public String LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public final String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public final String LJLLILLLL;
    public final int LJLLJ;
    public final String LJLLL;
    public int LJLLLL;
    public final String LJLLLLLL;
    public final String LJLZ;
    public final String LJZ;
    public final String LJZI;
    public int LJZL;
    public final String LL;
    public final String LLD;
    public final String LLF;
    public String LLFF;
    public final Integer LLFFF;
    public final String LLFII;
    public RecReasonEntry LLFZ;
    public RecReasonsStruct LLI;
    public int LLIFFJFJJ;

    public C1386170mAx() {
        super("video_play_finish");
        this.LJJLIIIJJIZ = "";
        this.LJJLL = 1;
        this.LJLJLJ = "";
        this.LJLLI = "";
        this.LJLLILLLL = "";
        this.LJLLJ = -1;
        this.LJLLL = "";
        this.LJLLLLLL = "";
        this.LJLZ = "";
        this.LJZ = "";
        this.LJZI = "";
        this.LL = "";
        this.LLD = "";
        this.LLF = "";
        this.LLFF = "";
        this.LLFFF = -1;
        this.LLFII = "";
        this.LLFZ = null;
        this.LLI = null;
        this.LLIFFJFJJ = 0;
        this.LJI = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0630 A[LOOP:1: B:255:0x062a->B:257:0x0630, LOOP_END] */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.0mAt, X.0mAu, X.0mAx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    @Override // X.AbstractC1386130mAt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 2180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1386170mAx.LJIIIIZZ():void");
    }

    @Override // X.AbstractC1386140mAu
    public final String LJJI() {
        return this.LJJLIIIJ;
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
        int followStatus;
        super.LJIJI(aweme);
        if (aweme != null) {
            this.LJJLIIIJ = aweme.getAid();
            this.LJJLIIIJILLIZJL = AbstractC1386130mAt.LJIIJ(aweme);
            this.LJJLIIIJJI = C735370Ssx.LJIJJ(aweme);
            this.LJJLJ = C735370Ssx.LJI(aweme);
            AwemeExtKt.isImage(aweme);
            this.LJJZ = AwemeExtKt.getRepostFromGroupId(aweme);
            this.LJJZZI = AwemeExtKt.getRepostFromUserId(aweme);
            IAnchorBusinessOutBridgeService iAnchorBusinessOutBridgeService = (IAnchorBusinessOutBridgeService) PluggableExtentionKt.pluggableSpi(IAnchorBusinessOutBridgeService.class);
            if (iAnchorBusinessOutBridgeService != null) {
                C1387380mCu c1387380mCuLIZLLL = iAnchorBusinessOutBridgeService.LIZLLL(aweme);
                this.LJJLIIIJLLLLLLLZ = c1387380mCuLIZLLL.LIZJ;
                this.LJJLIIJ = c1387380mCuLIZLLL.LIZLLL;
            }
            if (aweme.getMixInfo() != null) {
                this.LJJZZIII = aweme.getMixInfo().mixId;
            }
            if (!C727520SgI.LJI(this.LJJJJZ)) {
                this.LJLILLLLZI = C727520SgI.LIZIZ(this.LJJJJZ).mutualType;
            }
            this.LJL = C10EU.LJIIJJI(aweme);
            this.LJLI = C735370Ssx.LJIIIIZZ(aweme);
            this.LJLIIIL = C735370Ssx.LJII(aweme);
            if (aweme.getIsTikTokStory()) {
                this.LJLIL = C735370Ssx.LJIJJLI(aweme.getAuthor());
            } else {
                this.LJLIL = C735370Ssx.LJIIJ(aweme);
            }
            this.LJIJJ = C735370Ssx.LJIILLIIL(aweme);
            C727520SgI.LJFF(aweme);
            this.LJIJJLI = "";
            if (aweme.getAuthor() != null) {
                followStatus = aweme.getAuthor().getFollowStatus();
            } else {
                followStatus = -2;
            }
            this.LJLJJL = followStatus;
            if (TextUtils.isEmpty(this.LJIJ)) {
                this.LJIJ = AbstractC1386130mAt.LJIIJJI(1, aweme);
            }
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().text)) {
                this.LJLJL = 1;
            }
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && playListInfo.getMixId() != null) {
                this.LJLLI = aweme.playlist_info.getMixId();
            }
            C1365450ldX.LIZLLL(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.LJLLLL = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.LJLLLL = 1;
            }
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                this.LLFF = commerceVideoAuthInfo.getBCHashtag();
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
                        this.LJZL = 1;
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
                        this.LLIFFJFJJ = 1;
                        return;
                    }
                }
            }
        }
    }
}

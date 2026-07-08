package X;

import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.GroupIdListStruct;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideo;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideoGates;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1386190mAz extends AbstractC1386140mAu<C1386190mAz> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public GroupIdListStruct LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public final String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public boolean LJJZZI;
    public boolean LJJZZIII;
    public String LJL;
    public int LJLI;
    public String LJLIIIL;
    public String LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public final int LJLJLLL;
    public String LJLL;
    public boolean LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public boolean LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public int LJZ;
    public List<AnchorCommonStruct> LJZI;
    public String LJZL;
    public String LL;
    public int LLD;
    public boolean LLF;
    public String LLFF;
    public final int LLFFF;
    public int LLFII;
    public int LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public String LLII;
    public String LLIIII;
    public String LLIIIILZ;
    public int LLIIIJ;
    public String LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public String LLIIL;
    public String LLIILII;
    public String LLIILZL;
    public String LLIIZ;
    public final String LLIL;
    public String LLILII;
    public Boolean LLILIL;
    public Boolean LLILL;
    public String LLILLIZIL;
    public final float LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public int LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public String LLIZLLLIL;
    public final Integer LLJ;
    public final Integer LLJI;
    public final Integer LLJIJIL;
    public final Integer LLJILJIL;
    public final Integer LLJILJILJ;
    public final Integer LLJILLL;
    public String LLJJ;
    public Integer LLJJI;
    public int LLJJIII;
    public Integer LLJJIJI;
    public final String LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final Integer LLJJJ;
    public final Integer LLJJJIL;
    public final Boolean LLJJJJ;
    public final Long LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final Integer LLJJL;
    public final Integer LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public String LLLFF;
    public Integer LLLFFI;
    public Long LLLFZ;
    public Long LLLI;
    public String LLLII;
    public String LLLIIII;
    public String LLLIIIIL;

    public C1386190mAz() {
        super("video_play");
        this.LJJLIIJ = CardStruct.IStatusCode.DEFAULT;
        this.LJJLIL = CardStruct.IStatusCode.DEFAULT;
        this.LJJLJ = "";
        this.LJLI = 1;
        this.LJLJLLL = -1;
        this.LLFFF = -1;
        this.LLII = "";
        this.LLIIII = "";
        this.LLIIIILZ = "";
        this.LLIIIJ = -1;
        this.LLIIIL = "";
        this.LLIIIZ = 1;
        this.LLIIL = "";
        this.LLIILII = "";
        this.LLIILZL = "";
        this.LLIIZ = "";
        this.LLIL = "";
        this.LLILII = "";
        Boolean bool = Boolean.FALSE;
        this.LLILIL = bool;
        this.LLILL = bool;
        this.LLILLIZIL = "";
        this.LLILLJJLI = -1.0f;
        this.LLILLL = "normal";
        this.LLILZ = "normal";
        this.LLILZIL = 0;
        this.LLILZLL = "";
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        this.LLJ = 0;
        this.LLJI = 0;
        this.LLJIJIL = 0;
        this.LLJILJIL = 0;
        this.LLJILJILJ = 0;
        this.LLJILLL = -1;
        this.LLJJ = "";
        this.LLJJI = 0;
        this.LLJJIII = 0;
        this.LLJJIJI = 0;
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = false;
        this.LLJJJ = -1;
        this.LLJJJIL = -1;
        this.LLJJJJ = bool;
        this.LLJJJJJIL = -1L;
        this.LLJJJJLIIL = "";
        this.LLJJL = -1;
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLJLLIL = 0;
        this.LLJLLL = 0;
        this.LLJZ = 0;
        this.LLJZIJLIL = CardStruct.IStatusCode.DEFAULT;
        this.LLL = CardStruct.IStatusCode.DEFAULT;
        this.LLLF = CardStruct.IStatusCode.DEFAULT;
        this.LLLFF = null;
        this.LLLFFI = -1;
        this.LLLFZ = -1L;
        this.LLLI = -1L;
        this.LLLII = null;
        this.LLLIIII = null;
        this.LLLIIIIL = null;
        this.LJI = true;
    }

    public final void LJJIL() {
        try {
            C844470XAv.LIZ.getClass();
            if (Settings.System.getInt(C844470XAv.LIZ().getContentResolver(), "accelerometer_rotation") == 0) {
                this.LJLJJL = 0;
            } else {
                this.LJLJJL = 1;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0b06 A[LOOP:2: B:480:0x0b00->B:482:0x0b06, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0c5d  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0c69  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x1056  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x1059  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x105c  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x105f  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x1062  */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v733 */
    /* JADX WARN: Type inference failed for: r0v734 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [int] */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.0mAt, X.0mAu, X.0mAz, java.lang.Object] */
    @Override // X.AbstractC1386130mAt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 4197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1386190mAz.LJIIIIZZ():void");
    }

    @Override // X.AbstractC1386140mAu
    public final String LJJI() {
        return this.LJJLIIIJILLIZJL;
    }

    public C1386190mAz(int i) {
        super("video_play_from_push");
        this.LJJLIIJ = CardStruct.IStatusCode.DEFAULT;
        this.LJJLIL = CardStruct.IStatusCode.DEFAULT;
        this.LJJLJ = "";
        this.LJLI = 1;
        this.LJLJLLL = -1;
        this.LLFFF = -1;
        this.LLII = "";
        this.LLIIII = "";
        this.LLIIIILZ = "";
        this.LLIIIJ = -1;
        this.LLIIIL = "";
        this.LLIIIZ = 1;
        this.LLIIL = "";
        this.LLIILII = "";
        this.LLIILZL = "";
        this.LLIIZ = "";
        this.LLIL = "";
        this.LLILII = "";
        Boolean bool = Boolean.FALSE;
        this.LLILIL = bool;
        this.LLILL = bool;
        this.LLILLIZIL = "";
        this.LLILLJJLI = -1.0f;
        this.LLILLL = "normal";
        this.LLILZ = "normal";
        this.LLILZIL = 0;
        this.LLILZLL = "";
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        this.LLJ = 0;
        this.LLJI = 0;
        this.LLJIJIL = 0;
        this.LLJILJIL = 0;
        this.LLJILJILJ = 0;
        this.LLJILLL = -1;
        this.LLJJ = "";
        this.LLJJI = 0;
        this.LLJJIII = 0;
        this.LLJJIJI = 0;
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = false;
        this.LLJJJ = -1;
        this.LLJJJIL = -1;
        this.LLJJJJ = bool;
        this.LLJJJJJIL = -1L;
        this.LLJJJJLIIL = "";
        this.LLJJL = -1;
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLJLLIL = 0;
        this.LLJLLL = 0;
        this.LLJZ = 0;
        this.LLJZIJLIL = CardStruct.IStatusCode.DEFAULT;
        this.LLL = CardStruct.IStatusCode.DEFAULT;
        this.LLLF = CardStruct.IStatusCode.DEFAULT;
        this.LLLFF = null;
        this.LLLFFI = -1;
        this.LLLFZ = -1L;
        this.LLLI = -1L;
        this.LLLII = null;
        this.LLLIIII = null;
        this.LLLIIIIL = null;
        this.LJI = true;
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
        super.LJIJI(aweme);
        if (aweme != null) {
            LJJIJLIJ(aweme);
            this.LJJIIZ = C735370Ssx.LJIJJ(aweme);
        }
        LJJIL();
    }

    public final void LJJIJLIJ(Aweme aweme) {
        String str;
        if (aweme == null) {
            return;
        }
        this.LJJLIIIJ = aweme.getLiveType();
        this.LJJLIIIJILLIZJL = aweme.getAid();
        this.LJJLIIIJJI = aweme.getGroupIdList();
        this.LJJLIIIJJIZ = AbstractC1386130mAt.LJIIJ(aweme);
        String str2 = "1";
        if (AwemeExtKt.isImage(aweme)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        this.LJJLIIJ = str;
        if (!AwemeExtKt.isPhotoMode(aweme)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        this.LJJLIL = str2;
        this.LJJZZIII = C735370Ssx.LJJIJIL(aweme);
        AwemeExtKt.isImage(aweme);
        this.LJLIL = C735370Ssx.LJI(aweme);
        this.LJLJJLL = AwemeExtKt.getRepostFromGroupId(aweme);
        this.LJLJL = AwemeExtKt.getRepostFromUserId(aweme);
        if (aweme.getMemeRegInfo() != null) {
            this.LJJLIIIJLJLI = aweme.getMemeRegInfo().canBoostMeme;
            this.LJJLIIIJL = aweme.getMemeRegInfo().isMeme();
        }
        if (C1157804fw.LIZ()) {
            if (((InterfaceC1386220mB2) ServiceManager.get().getService(ISearchServiceLowEnd.class)).LLLLIILLL(aweme)) {
                this.LLJLLIL = 1;
            }
            if (((InterfaceC1386220mB2) ServiceManager.get().getService(ISearchServiceLowEnd.class)).LLZL(aweme)) {
                this.LLJLLL = 1;
            }
        } else {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            if (c1er1.LLLLIILLL(aweme)) {
                this.LLJLLIL = 1;
            }
            if (c1er1.LLZL(aweme)) {
                this.LLJLLL = 1;
            }
        }
        this.LJLJLJ = C0S77.LIZ(aweme);
        if (aweme.getMixInfo() != null) {
            this.LJLL = aweme.getMixInfo().mixId;
        }
        if (!C727520SgI.LJI(this.LJJJJZ)) {
            this.LLD = C727520SgI.LIZIZ(this.LJJJJZ).mutualType;
        }
        this.LJLLI = C10EU.LJIIJJI(aweme);
        this.LJLLILLLL = C735370Ssx.LJIIIIZZ(aweme);
        this.LJLLJ = C735370Ssx.LJII(aweme);
        this.LJLLL = "";
        if (aweme.getIsTikTokStory()) {
            this.LJLZ = C735370Ssx.LJIJJLI(aweme.getAuthor());
        } else {
            this.LJLZ = C735370Ssx.LJIIJ(aweme);
        }
        this.LJIJJ = C735370Ssx.LJIILLIIL(aweme);
        C727520SgI.LJFF(aweme);
        this.LJIJJLI = "";
        this.LLIFFJFJJ = aweme.isAd() ? 1 : 0;
        this.LLILIL = Boolean.valueOf(aweme.getAllowGift());
        this.LLILL = Boolean.valueOf(AwemeExtKt.isOnThisDayVideo(aweme));
        if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().text)) {
            this.LLFII = 1;
        }
        this.LLILZIL = AwemeBizExtKt.getHasAd(aweme);
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null && interactStickerStructs.size() > 0) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getQaStruct() != null) {
                    this.LLFZ = 1;
                    interactStickerStruct.getQaStruct();
                    TextUtils.equals(aweme.getAid(), String.valueOf(interactStickerStruct.getQaStruct().itemId));
                }
                if (interactStickerStruct.getMusicStickerStruct() != null) {
                    this.LLJJ = interactStickerStruct.getMusicStickerStruct().musicStickerFrom;
                }
            }
        }
        if (this.LJJJJZ.getTextExtra() != null && this.LJJJJZ.getTextExtra().size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (TextExtraStruct textExtraStruct : this.LJJJJZ.getTextExtra()) {
                if (this.LLI == 0 && textExtraStruct.getSubtype() == 2) {
                    this.LLI = 1;
                }
                if (textExtraStruct.getType() == 1) {
                    if (sb.length() != 0) {
                        sb.append(",");
                    }
                    sb.append(textExtraStruct.getHashTagName());
                }
            }
            this.LLILII = sb.toString();
        }
        C1365450ldX.LIZLLL(this, aweme.getAuthor());
        if (this.LJJJJZ.getShareOperationInfo() != null && !TextUtils.isEmpty(this.LJJJJZ.getShareOperationInfo().operationId)) {
            this.LLILLIZIL = this.LJJJJZ.getShareOperationInfo().operationId;
        }
        if (!TextUtils.isEmpty(aweme.partN)) {
            this.LLIIJLIL = 2;
        } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
            this.LLIIJLIL = 1;
        }
        IAnchorBusinessOutBridgeService iAnchorBusinessOutBridgeService = (IAnchorBusinessOutBridgeService) PluggableExtentionKt.pluggableSpi(IAnchorBusinessOutBridgeService.class);
        if (iAnchorBusinessOutBridgeService != null) {
            C1387380mCu c1387380mCuLIZLLL = iAnchorBusinessOutBridgeService.LIZLLL(aweme);
            this.LLJLILLLLZIIL = c1387380mCuLIZLLL.LIZJ;
            this.LLJLL = c1387380mCuLIZLLL.LIZLLL;
            this.LLJLIL = c1387380mCuLIZLLL.LIZIZ;
            this.LLJL = c1387380mCuLIZLLL.LIZ;
        }
        AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null) {
            this.LLIZLLLIL = commerceVideoAuthInfo.getBCHashtag();
        }
        GScope gScope = GScope.LL;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(gScope, "ug_deeplink_params_key", C1234650iEZ.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            C1234650iEZ c1234650iEZ = (C1234650iEZ) interfaceC1555100qZQLIZIZ.getSource();
            if (aweme.getAid() != null && c1234650iEZ != null && TextUtils.equals(aweme.getAid(), c1234650iEZ.LL)) {
                this.LLLFF = c1234650iEZ.LLILLJJLI;
                Integer numValueOf = Integer.valueOf(c1234650iEZ.LLILLL);
                this.LLLFFI = numValueOf;
                boolean z = c1234650iEZ.LLJ;
                if (numValueOf != null && numValueOf.intValue() == 2 && z) {
                    this.LLLI = Long.valueOf(SystemClock.uptimeMillis() - C202094145s.LJII);
                }
            }
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(gScope, "ug_deeplink_insert_feed_key", C1234680iEc.class, null);
        if (interfaceC1555100qZQLIZIZ2 != null) {
            C1234680iEc c1234680iEc = (C1234680iEc) interfaceC1555100qZQLIZIZ2.getSource();
            Long lValueOf = Long.valueOf(c1234680iEc.LLILLL);
            if (aweme.getAid() != null && TextUtils.equals(aweme.getAid(), c1234680iEc.LL) && c1234680iEc.LLILLJJLI != null && lValueOf != null) {
                this.LLLFZ = Long.valueOf(System.currentTimeMillis() - lValueOf.longValue());
            }
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ3 = C1554960qZC.LIZIZ(gScope, "link_share_params_key", C1234710iEf.class, null);
        if (interfaceC1555100qZQLIZIZ3 != null) {
            C1234710iEf c1234710iEf = (C1234710iEf) interfaceC1555100qZQLIZIZ3.getSource();
            if (aweme.getAid() != null && c1234710iEf != null && TextUtils.equals(aweme.getAid(), c1234710iEf.LL)) {
                this.LLLII = c1234710iEf.LLILLJJLI;
                this.LLLIIII = c1234710iEf.LLILLL;
                this.LLLIIIIL = c1234710iEf.LLILZ;
            }
        }
    }

    public final void LJJIJL(int i, Aweme aweme) {
        Boolean shouldShowPaywall;
        boolean z;
        Video video;
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        SubOnlyVideoGates subOnlyVideoGates;
        StandardBusinessModel standardBusinessModel2;
        SubOnlyVideo subOnlyVideo2;
        super.LJIJI(aweme);
        if (aweme != null) {
            LJJIJLIJ(aweme);
            this.LJJIIZ = AbstractC1386130mAt.LJIIL(i, aweme);
            String strLJIIJJI = AbstractC1386130mAt.LJIIJJI(i, aweme);
            this.LJIJ = strLJIIJJI;
            if (TextUtils.isEmpty(strLJIIJJI)) {
                this.LJIJ = AbstractC1386130mAt.LJIIJJI(1, aweme);
            }
            this.LJJLJLI = String.valueOf(AwemeBizExtKt.getFeedCount(aweme));
            this.LLJJIJI = Integer.valueOf(AwemeBizExtKt.getBehindTheSongVideoType(aweme));
            if (aweme.getAnchors() != null) {
                this.LJZI = aweme.getAnchors();
                Iterator<AnchorCommonStruct> it2 = aweme.getAnchors().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (it2.next().getType() == EnumC1430380nKG.SUBSCRIPTION_ANCHOR.getTYPE()) {
                        this.LLJZ = 1;
                        break;
                    }
                }
            }
            ContentModel contentModel = aweme.getContentModel();
            Boolean boolIsSovUrllessEnabled = null;
            if (contentModel != null && (standardBusinessModel2 = contentModel.standardBusinessModel) != null && (subOnlyVideo2 = standardBusinessModel2.getSubOnlyVideo()) != null) {
                shouldShowPaywall = subOnlyVideo2.getShouldShowPaywall();
            } else {
                shouldShowPaywall = null;
            }
            this.LLJZIJLIL = C0OAL.LIZIZ(shouldShowPaywall);
            ContentModel contentModel2 = aweme.getContentModel();
            if (contentModel2 != null && (standardBusinessModel = contentModel2.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null && (subOnlyVideoGates = subOnlyVideo.getSubOnlyVideoGates()) != null) {
                boolIsSovUrllessEnabled = subOnlyVideoGates.isSovUrllessEnabled();
            }
            this.LLL = C0OAL.LIZIZ(boolIsSovUrllessEnabled);
            if (aweme.getVideo() != null && ((video = aweme.getVideo()) == null || video.getPlayAddr() == null)) {
                z = true;
            } else {
                z = false;
            }
            this.LLLF = C0OAL.LIZIZ(Boolean.valueOf(z));
            if (aweme.isPinnedByArtist()) {
                this.LLJJI = 1;
            }
            if (aweme.getPickedUsers() != null && aweme.getPickedUsers().size() > 0) {
                this.LLJJIII = 1;
            }
            if (!TextUtils.isEmpty(aweme.transParams)) {
                LJ("trans_params", aweme.transParams);
            }
            if (!TextUtils.isEmpty(AwemeBizExtKt.isIntextOccludeTab(aweme))) {
                LJ("is_intext_occlude_tab", AwemeBizExtKt.isIntextOccludeTab(aweme));
            }
            if (!TextUtils.isEmpty(AwemeBizExtKt.isIntextOccludeInteraction(aweme))) {
                LJ("is_intext_occlude_interaction", AwemeBizExtKt.isIntextOccludeInteraction(aweme));
            }
            if (!TextUtils.isEmpty(AwemeBizExtKt.isIntextOut(aweme))) {
                LJ("is_intext_out", AwemeBizExtKt.isIntextOut(aweme));
            }
            if (!TextUtils.isEmpty(AwemeBizExtKt.isIntextOccludeDesc(aweme))) {
                LJ("is_intext_occlude_desc", AwemeBizExtKt.isIntextOccludeDesc(aweme));
            }
        }
        LJJIL();
    }
}

package X;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.ab.SubsPaywallSingleBindKillSwitch;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.iap.component.IPgcPaymentService;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.subscription.model.PaywallResponse;
import com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SC0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SC0 implements C0S87<PaywallResponse> {
    public final Context LIZ;
    public final InterfaceC717360SBy LIZIZ;
    public Function0<Unit> LIZJ;
    public final C05P0 LIZLLL = C20028913Yh.LJI(null);
    public final C05P0 LJ;
    public final C05P0 LJFF;
    public final C05P0 LJI;
    public final C13YZ LJII;
    public final C13YZ LJIIIIZZ;
    public final C05P0 LJIIIZ;
    public final C05P0 LJIIJ;
    public final C13YZ LJIIJJI;
    public final C05P0 LJIIL;
    public final C05P0 LJIILIIL;
    public final C05P0 LJIILJJIL;
    public final C05P0 LJIILL;
    public final C05P0 LJIILLIIL;
    public final C05P0 LJIIZILJ;
    public final C05P0 LJIJ;
    public final C05P0 LJIJI;
    public final C05P0 LJIJJ;
    public final C05P0 LJIJJLI;
    public boolean LJIL;
    public Long LJJ;
    public Long LJJI;
    public Long LJJIFFI;
    public Long LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public final C05P0 LJJIIJZLJL;
    public final C05P0 LJJIIZ;
    public final C05P0 LJJIIZI;
    public final C05P0 LJJIJ;
    public final C01GW LJJIJIIJI;
    public final C01GW LJJIJIIJIL;
    public AwS447S0200000_11 LJJIJIL;
    public IPhotoSlidesAbility LJJIJL;
    public IPhotoSlidesEventDispatchAbility LJJIJLIJ;
    public InterfaceC665370Q7z LJJIL;
    public final C0SC2 LJJIZ;

    @Override // X.C0S87
    public final void LIZIZ() {
        ((C13FE) this.LJI).setValue(Boolean.FALSE);
    }

    public final Aweme LJI() {
        return (Aweme) this.LIZLLL.getValue();
    }

    public final boolean LJII() {
        return ((Boolean) this.LJJIJ.getValue()).booleanValue();
    }

    public final boolean LJIIIIZZ() {
        return ((Boolean) this.LJ.getValue()).booleanValue();
    }

    public final String LJIIIZ() {
        String previousPageWithPlaylistScene = C0SUC.LIZ(this.LIZ).getPreviousPageWithPlaylistScene();
        if (previousPageWithPlaylistScene == null || !(!a0.LJJJIL(previousPageWithPlaylistScene))) {
            return null;
        }
        return previousPageWithPlaylistScene;
    }

    public final ComposeView LJIIJ() {
        ComposeView composeView = new ComposeView(this.LIZ, null, 6);
        composeView.setTag(this);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(427713246, new AwS460S0200000_25(this, composeView, 32), true));
        return composeView;
    }

    public final Boolean LJIIJJI() {
        return (Boolean) this.LJIIIIZZ.getValue();
    }

    public final void LJIILJJIL() {
        boolean z = false;
        IMixFeedService iMixFeedService = (IMixFeedService) PluggableExtentionKt.pluggableSpi$default(IMixFeedService.class, false, false, false, 14, null);
        boolean z2 = iMixFeedService != null && iMixFeedService.LJIILJJIL();
        if (!((Boolean) C261390AMf.LIZ.getValue()).booleanValue() || z2) {
            return;
        }
        String enterFrom = this.LIZIZ.getEnterFrom();
        String from = this.LIZIZ.getFrom();
        if ((Intrinsics.LJFF(enterFrom, "playlist") || Intrinsics.LJFF(from, "click_profile_card") || Intrinsics.LJFF(from, "click_profile_list") || Intrinsics.LJFF(from, "favourite_playlist")) && Intrinsics.LJFF(LJIIJJI(), Boolean.FALSE)) {
            Aweme awemeLJI = LJI();
            if ((awemeLJI == null || !awemeLJI.getIsTikTokStory()) && !((Boolean) ((C13FE) this.LJJIIJZLJL).getValue()).booleanValue()) {
                z = true;
            }
            if (!LJII() || z || !((Boolean) ((C13FE) this.LJJIIZ).getValue()).booleanValue() || ((Boolean) ((C13FE) this.LJJIIZI).getValue()).booleanValue()) {
                return;
            }
            C05P0 c05p0 = this.LJJIIZI;
            Boolean bool = Boolean.TRUE;
            ((C13FE) c05p0).setValue(bool);
            AwS447S0200000_11 awS447S0200000_11 = this.LJJIJIL;
            if (awS447S0200000_11 != null) {
                awS447S0200000_11.invoke(this.LIZ, bool);
            }
        }
    }

    @Override // X.C0S87
    public final void LJJLJLI() {
        ((C13FE) this.LJJIJ).setValue(Boolean.TRUE);
        LJIILJJIL();
        Aweme awemeLJI = LJI();
        if ((awemeLJI == null || !AwemeExtKt.isPhotoMode(awemeLJI)) && !this.LJIL) {
            if (LJI() != null) {
                LJIIL(LJI());
            } else {
                this.LJJIII = true;
            }
        }
    }

    @Override // X.C0S87
    public final void LJLJLJ() {
        ((C13FE) this.LJIJ).setValue(EnumC716470S8n.LOADING);
    }

    @Override // X.C0S87
    public final void g2() {
        ((C13FE) this.LJJIJ).setValue(Boolean.FALSE);
        LJIILL(true);
    }

    @Override // X.C0S87
    public final C717180SBg getType() {
        return (C717180SBg) ((C13FE) this.LJIJJLI).getValue();
    }

    @Override // X.C0S87
    public final void LJ() {
        Aweme awemeLJI = LJI();
        if (awemeLJI == null || !awemeLJI.getIsTikTokStory()) {
            return;
        }
        if (LJI() == null) {
            this.LJJIIJ = true;
        } else if (((C13FE) this.LJIIZILJ).getValue() == null) {
            this.LJJIIJ = true;
        } else {
            LJIIL(LJI());
        }
    }

    @Override // X.C0S87
    public final void LIZJ(AwS253S0300000_9 awS253S0300000_9) {
        this.LIZJ = awS253S0300000_9;
        ((C13FE) this.LJIJ).setValue(EnumC716470S8n.ERROR_PAYWALL);
    }

    @Override // X.C0S87
    public final void LIZLLL(Aweme aweme) {
        String aid;
        boolean zLJFF;
        int iK91;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        Long generatedPreviewStartTime;
        Long lValueOf;
        long jLongValue;
        StandardBusinessModel standardBusinessModel2;
        CMPreviewInfo cmPreviewInfo2;
        Long generatedPreviewDuration;
        StandardBusinessModel standardBusinessModel3;
        CMPreviewInfo cmPreviewInfo3;
        Aweme awemeLJI = LJI();
        if (awemeLJI != null) {
            aid = awemeLJI.getAid();
        } else {
            aid = null;
        }
        boolean zLJFF2 = Intrinsics.LJFF(aid, aweme.getAid());
        ((C13FE) this.LIZLLL).setValue(aweme);
        if (!zLJFF2) {
            LJIILL(false);
        }
        ContentModel contentModel = aweme.getContentModel();
        if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) != null) {
            zLJFF = Intrinsics.LJFF(cmPreviewInfo.getShouldShowPreview(), Boolean.TRUE);
            if (zLJFF) {
                ContentModel contentModel2 = aweme.getContentModel();
                if (contentModel2 != null && (standardBusinessModel3 = contentModel2.standardBusinessModel) != null && (cmPreviewInfo3 = standardBusinessModel3.getCmPreviewInfo()) != null) {
                    generatedPreviewStartTime = cmPreviewInfo3.getGeneratedPreviewStartTime();
                } else {
                    generatedPreviewStartTime = null;
                }
                this.LJJ = generatedPreviewStartTime;
                if (generatedPreviewStartTime != null) {
                    long jLongValue2 = generatedPreviewStartTime.longValue();
                    ContentModel contentModel3 = aweme.getContentModel();
                    if (contentModel3 != null && (standardBusinessModel2 = contentModel3.standardBusinessModel) != null && (cmPreviewInfo2 = standardBusinessModel2.getCmPreviewInfo()) != null && (generatedPreviewDuration = cmPreviewInfo2.getGeneratedPreviewDuration()) != null) {
                        jLongValue = generatedPreviewDuration.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    lValueOf = Long.valueOf(jLongValue2 + jLongValue);
                } else {
                    lValueOf = null;
                }
                this.LJJI = lValueOf;
            }
        } else {
            zLJFF = false;
        }
        Long l = this.LJJ;
        if (l != null) {
            l.longValue();
            ((C13FE) this.LJI).setValue(Boolean.TRUE);
        } else {
            ((C13FE) this.LJI).setValue(Boolean.FALSE);
        }
        if (LJII() && !zLJFF) {
            this.LJJIII = true;
        }
        this.LJIL = zLJFF;
        this.LJJIL = this.LIZIZ.LLIIJLIL();
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = this.LJJIJLIJ;
        if (iPhotoSlidesEventDispatchAbility != null) {
            iPhotoSlidesEventDispatchAbility.IL1(this.LJJIZ);
        }
        this.LJJIJL = (IPhotoSlidesAbility) C1558520qew.LIZ(this.LIZIZ.LLIIJLIL(), IPhotoSlidesAbility.class, null);
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility2 = (IPhotoSlidesEventDispatchAbility) C1558520qew.LIZ(this.LIZIZ.LLIIJLIL(), IPhotoSlidesEventDispatchAbility.class, null);
        this.LJJIJLIJ = iPhotoSlidesEventDispatchAbility2;
        if (iPhotoSlidesEventDispatchAbility2 != null) {
            iPhotoSlidesEventDispatchAbility2.u52(this.LJJIZ);
        }
        IPhotoSlidesAbility iPhotoSlidesAbility = this.LJJIJL;
        if (iPhotoSlidesAbility != null) {
            iK91 = iPhotoSlidesAbility.K91();
        } else {
            iK91 = 0;
        }
        ((C13FE) this.LJIJI).setValue(Integer.valueOf(iK91));
        ((C13FE) this.LJIJJ).setValue(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x01b1  */
    @Override // X.C0S87
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(long r11) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SC0.LJFF(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.09Gk] */
    public final void LJIIL(Aweme aweme) {
        Integer subsStatus;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        String aid;
        String authorUid;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        ContentModel contentModel2;
        StandardBusinessModel standardBusinessModel2;
        CMPreviewInfo cmPreviewInfo;
        Long previewSettingsDuration;
        ContentModel contentModel3;
        StandardBusinessModel standardBusinessModel3;
        CMPreviewInfo cmPreviewInfo2;
        Long generatedPreviewDuration;
        ContentModel contentModel4;
        StandardBusinessModel standardBusinessModel4;
        CMPreviewInfo cmPreviewInfo3;
        Long previewSettingsStartTime;
        ContentModel contentModel5;
        StandardBusinessModel standardBusinessModel5;
        CMPreviewInfo cmPreviewInfo4;
        Long generatedPreviewDuration2;
        ContentModel contentModel6;
        StandardBusinessModel standardBusinessModel6;
        CMPreviewInfo cmPreviewInfo5;
        Integer numValueOf;
        Integer numValueOf2;
        String authorUid2;
        IPgcPaymentService iPgcPaymentService;
        if (!((Boolean) ((C13FE) this.LJFF).getValue()).booleanValue()) {
            return;
        }
        ((C13FE) this.LJFF).setValue(Boolean.FALSE);
        C05P0 c05p0 = this.LJJIIJZLJL;
        Boolean bool = Boolean.TRUE;
        ((C13FE) c05p0).setValue(bool);
        LJIILJJIL();
        String aid2 = null;
        if (aweme != null && (authorUid2 = AwemeExtKt.getAuthorUid(aweme)) != null && (!a0.LJJJIL(authorUid2)) && (iPgcPaymentService = (IPgcPaymentService) PluggableExtentionKt.pluggableSpi$default(IPgcPaymentService.class, false, false, false, 14, null)) != null) {
            iPgcPaymentService.LIZJ(new C1616880sB4(EnumC1616780sAu.SUBSCRIPTION, null, authorUid2, this.LIZIZ.getEnterFrom(), 20));
        }
        String lowerCase = (String) ((C13FE) this.LJIIZILJ).getValue();
        ?? LJFF = 0;
        LJFF = 0;
        LJFF = 0;
        LJFF = 0;
        if (lowerCase == null || lowerCase.length() <= 0) {
            CMPreviewInfo.SubsStatus.Companion companion = CMPreviewInfo.SubsStatus.Companion;
            if (aweme != null && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null) {
                subsStatus = subOnlyVideo.getSubsStatus();
            } else {
                subsStatus = null;
            }
            lowerCase = companion.fromInt(subsStatus).name().toLowerCase(Locale.ROOT);
        }
        String strLJIILLIIL = LJIILLIIL(this.LIZIZ.getEnterFrom(), this.LIZIZ.getFrom(), LJIIIZ());
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (SubsPaywallSingleBindKillSwitch.INSTANCE.isEnabled()) {
            if (aweme != null) {
                numValueOf = Integer.valueOf(aweme.getIsTikTokStory() ? 1 : 0);
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "is_story");
            if (aweme != null) {
                numValueOf2 = Integer.valueOf(aweme.getAwemeType());
            } else {
                numValueOf2 = null;
            }
            c2344009Gk.LJ(numValueOf2, "aweme_type");
        }
        c2344009Gk.LJIIIIZZ("subscribe_state", lowerCase);
        c2344009Gk.LJIIIIZZ("show_entrance", strLJIILLIIL);
        c2344009Gk.LJIIIIZZ("enter_method", "paywall");
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        C20684815ws.LJIILLIIL("livesdk_subscribe_icon_show", c2344009Gk.LIZ);
        ?? c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LIZJ(0, "is_vhs");
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        c2344009Gk2.LJIIIIZZ("group_id", aid2);
        c2344009Gk2.LJIIIIZZ("subscribe_state", lowerCase);
        c2344009Gk2.LJIIIIZZ("show_entrance", strLJIILLIIL);
        c2344009Gk2.LJIIIIZZ("enter_from", String.valueOf(this.LIZIZ.getEnterFrom()));
        if (aweme != null && (contentModel6 = aweme.getContentModel()) != null && (standardBusinessModel6 = contentModel6.standardBusinessModel) != null && (cmPreviewInfo5 = standardBusinessModel6.getCmPreviewInfo()) != null) {
            LJFF = Intrinsics.LJFF(cmPreviewInfo5.getShouldShowPreview(), bool);
        }
        c2344009Gk2.LIZJ(LJFF, "should_show_preview");
        long jLongValue4 = 0;
        if (aweme != null && (contentModel5 = aweme.getContentModel()) != null && (standardBusinessModel5 = contentModel5.standardBusinessModel) != null && (cmPreviewInfo4 = standardBusinessModel5.getCmPreviewInfo()) != null && (generatedPreviewDuration2 = cmPreviewInfo4.getGeneratedPreviewDuration()) != null) {
            jLongValue = generatedPreviewDuration2.longValue();
        } else {
            jLongValue = 0;
        }
        c2344009Gk2.LIZLLL(jLongValue, "generated_preview_start_time");
        if (aweme != null && (contentModel4 = aweme.getContentModel()) != null && (standardBusinessModel4 = contentModel4.standardBusinessModel) != null && (cmPreviewInfo3 = standardBusinessModel4.getCmPreviewInfo()) != null && (previewSettingsStartTime = cmPreviewInfo3.getPreviewSettingsStartTime()) != null) {
            jLongValue2 = previewSettingsStartTime.longValue();
        } else {
            jLongValue2 = 0;
        }
        c2344009Gk2.LIZLLL(jLongValue2, "preview_settings_start_time");
        if (aweme != null && (contentModel3 = aweme.getContentModel()) != null && (standardBusinessModel3 = contentModel3.standardBusinessModel) != null && (cmPreviewInfo2 = standardBusinessModel3.getCmPreviewInfo()) != null && (generatedPreviewDuration = cmPreviewInfo2.getGeneratedPreviewDuration()) != null) {
            jLongValue3 = generatedPreviewDuration.longValue();
        } else {
            jLongValue3 = 0;
        }
        c2344009Gk2.LIZLLL(jLongValue3, "generated_preview_duration");
        if (aweme != null && (contentModel2 = aweme.getContentModel()) != null && (standardBusinessModel2 = contentModel2.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel2.getCmPreviewInfo()) != null && (previewSettingsDuration = cmPreviewInfo.getPreviewSettingsDuration()) != null) {
            jLongValue4 = previewSettingsDuration.longValue();
        }
        c2344009Gk2.LIZLLL(jLongValue4, "preview_settings_duration");
        C20684815ws.LJIILLIIL("livesdk_subscribe_paywall_fetch", c2344009Gk2.LIZ);
    }

    public final void LJIILIIL(long j) {
        String aid;
        String uid;
        Long generatedPreviewDuration;
        Integer numValueOf;
        Integer numValueOf2;
        Video video;
        Video video2;
        Video video3;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        User author;
        this.LJJIFFI = Long.valueOf(j);
        String enterFrom = this.LIZIZ.getEnterFrom();
        String from = this.LIZIZ.getFrom();
        String strValueOf = String.valueOf(enterFrom);
        int i = 0;
        if (Intrinsics.LJFF(enterFrom, "playlist") || Intrinsics.LJFF(from, "click_profile_card") || Intrinsics.LJFF(from, "click_profile_list") || Intrinsics.LJFF(from, "favourite_playlist")) {
            strValueOf = "playlist";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        Aweme awemeLJI = LJI();
        Integer numValueOf3 = null;
        if (awemeLJI != null) {
            aid = awemeLJI.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("item_id", aid);
        Aweme awemeLJI2 = LJI();
        if (awemeLJI2 != null && (author = awemeLJI2.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJIIIIZZ("enter_from", strValueOf);
        Aweme awemeLJI3 = LJI();
        if (awemeLJI3 != null && (contentModel = awemeLJI3.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) != null) {
            generatedPreviewDuration = cmPreviewInfo.getGeneratedPreviewDuration();
        } else {
            generatedPreviewDuration = null;
        }
        c2344009Gk.LJIIIIZZ("preview_duration", String.valueOf(generatedPreviewDuration));
        Aweme awemeLJI4 = LJI();
        if (awemeLJI4 != null && AwemeExtKt.getFollowStatus(awemeLJI4) == 1) {
            i = 1;
        }
        c2344009Gk.LJIIIIZZ("is_follow", String.valueOf(i));
        Aweme awemeLJI5 = LJI();
        if (awemeLJI5 != null && (video3 = awemeLJI5.getVideo()) != null) {
            numValueOf = Integer.valueOf(video3.getDuration());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("video_duration", String.valueOf(numValueOf));
        Aweme awemeLJI6 = LJI();
        if (awemeLJI6 != null && (video2 = awemeLJI6.getVideo()) != null) {
            numValueOf2 = Integer.valueOf(video2.getHeight());
        } else {
            numValueOf2 = null;
        }
        c2344009Gk.LJIIIIZZ("video_height", String.valueOf(numValueOf2));
        Aweme awemeLJI7 = LJI();
        if (awemeLJI7 != null && (video = awemeLJI7.getVideo()) != null) {
            numValueOf3 = Integer.valueOf(video.getWidth());
        }
        c2344009Gk.LJIIIIZZ("video_width", String.valueOf(numValueOf3));
        C20684815ws.LJIILLIIL("sov_preview_video_play", c2344009Gk.LIZ);
    }

    public final void LJIILL(boolean z) {
        if (z) {
            ((C13FE) this.LIZLLL).setValue(null);
        }
        C05P0 c05p0 = this.LJ;
        Boolean bool = Boolean.FALSE;
        ((C13FE) c05p0).setValue(bool);
        ((C13FE) this.LJFF).setValue(Boolean.TRUE);
        ((C13FE) this.LJI).setValue(null);
        this.LJIL = false;
        this.LJJ = null;
        this.LJJI = null;
        this.LJJIFFI = null;
        this.LJJII = null;
        this.LJJIII = false;
        this.LJJIIJ = false;
        ((C13FE) this.LJJIIJZLJL).setValue(bool);
        ((C13FE) this.LJJIIZ).setValue(bool);
        ((C13FE) this.LJJIIZI).setValue(bool);
        ((C13FE) this.LJIJI).setValue(0);
        ((C13FE) this.LJIJJ).setValue(0);
        this.LJJIJIL = null;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.0SC2] */
    public C0SC0(Context context, InterfaceC717360SBy interfaceC717360SBy) {
        this.LIZ = context;
        this.LIZIZ = interfaceC717360SBy;
        Boolean bool = Boolean.FALSE;
        this.LJ = C20028913Yh.LJI(bool);
        this.LJFF = C20028913Yh.LJI(Boolean.TRUE);
        this.LJI = C20028913Yh.LJI(null);
        this.LJII = C20028913Yh.LJ(new AwS555S0100000_11(this, 1655));
        this.LJIIIIZZ = C20028913Yh.LJ(new AwS555S0100000_11(this, 1656));
        this.LJIIIZ = C20028913Yh.LJI(null);
        this.LJIIJ = C20028913Yh.LJI(null);
        this.LJIIJJI = C20028913Yh.LJ(new AwS555S0100000_11(this, 1657));
        this.LJIIL = C20028913Yh.LJI(null);
        this.LJIILIIL = C20028913Yh.LJI("");
        this.LJIILJJIL = C20028913Yh.LJI(null);
        this.LJIILL = C20028913Yh.LJI(null);
        this.LJIILLIIL = C20028913Yh.LJI(null);
        this.LJIIZILJ = C20028913Yh.LJI(null);
        this.LJIJ = C20028913Yh.LJI(EnumC716470S8n.LOADING);
        this.LJIJI = C20028913Yh.LJI(0);
        this.LJIJJ = C20028913Yh.LJI(0);
        this.LJIJJLI = C20028913Yh.LJI(C717120SBa.LIZJ);
        this.LJJIIJZLJL = C20028913Yh.LJI(bool);
        this.LJJIIZ = C20028913Yh.LJI(bool);
        this.LJJIIZI = C20028913Yh.LJI(bool);
        this.LJJIJ = C20028913Yh.LJI(bool);
        this.LJJIJIIJI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(510));
        this.LJJIJIIJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(509));
        this.LJJIZ = new C0SOB() { // from class: X.0SC2
            @Override // X.C0SOB
            public final void Aa() {
            }

            @Override // X.C0SOB
            public final void onPageSelected(int i) {
                ((C13FE) this.LL.LJIJJ).setValue(Integer.valueOf(i));
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    @Override // X.C0S87
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r8, com.ss.android.ugc.aweme.subscription.model.PaywallResponse r9) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SC0.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Object):void");
    }

    public final String LJIILLIIL(String str, String str2, String str3) {
        String strLIZLLL;
        IPaidContentFullAwemeService iPaidContentFullAwemeService = (IPaidContentFullAwemeService) PluggableExtentionKt.pluggableSpi$default(IPaidContentFullAwemeService.class, false, false, false, 14, null);
        if (iPaidContentFullAwemeService == null || (strLIZLLL = iPaidContentFullAwemeService.LIZLLL(str, str2, str3, LJI())) == null) {
            return "";
        }
        return strLIZLLL;
    }
}

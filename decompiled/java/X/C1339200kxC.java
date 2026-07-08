package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.xelement.LynxBounceView;
import com.bytedance.ies.xelement.LynxImpressionView;
import com.bytedance.ies.xelement.LynxNestedScrollView;
import com.bytedance.ies.xelement.LynxPullRefreshView;
import com.bytedance.ies.xelement.LynxRefreshFooter;
import com.bytedance.ies.xelement.LynxRefreshHeader;
import com.bytedance.ies.xelement.LynxScrollView;
import com.bytedance.ies.xelement.LynxSeekerManager;
import com.bytedance.ies.xelement.LynxVideoManager;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.bytedance.ies.xelement.banner.LynxSwiperItemView;
import com.bytedance.ies.xelement.banner.LynxSwiperView;
import com.bytedance.ies.xelement.blockevent.LynxBlockTouchView;
import com.bytedance.ies.xelement.blur.UIBlurView;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.bytedance.ies.xelement.input.AutoHeightInputShadowNode;
import com.bytedance.ies.xelement.input.LynxInputView;
import com.bytedance.ies.xelement.input.LynxInputViewLegacy;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.bytedance.ies.xelement.overlay.LynxOverlayViewProxy;
import com.bytedance.ies.xelement.overlay.ng.LynxOverlayViewProxyNG;
import com.bytedance.ies.xelement.overlay.ng.OverlayShadowNodeNG;
import com.bytedance.ies.xelement.pickview.LynxPickView;
import com.bytedance.ies.xelement.pickview.LynxPickerViewColumn;
import com.bytedance.ies.xelement.reveal.LynxRevealInnerLeft;
import com.bytedance.ies.xelement.reveal.LynxRevealInnerRight;
import com.bytedance.ies.xelement.reveal.LynxRevealView;
import com.bytedance.ies.xelement.text.inlineimage.LynxInlineImageShadowNode;
import com.bytedance.ies.xelement.text.inlinetext.LynxInlineTextShadowNode;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.bytedance.ies.xelement.text.text.LynxTextShadowNode;
import com.bytedance.ies.xelement.text.text.LynxTextUI;
import com.bytedance.ies.xelement.viewpager.LynxFoldView;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.LynxViewPager;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldHeader;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldSlot;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldSlotDrag;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldToolbar;
import com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG;
import com.bytedance.ies.xelement.viewpager.viewpager.LynxViewPagerNG;
import com.bytedance.lynx.hybrid.LynxSkeletonUI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.xelement.markdown.Markdown;
import com.bytedance.xelement.markdown.MarkdownShadowNode;
import com.bytedance.xelement.markdown.MarkdownUI;
import com.lynx.animax.util.LynxAnimaX;
import com.lynx.base.log.LynxLog;
import com.lynx.canvas.UICanvas;
import com.lynx.canvas.UISurfaceCanvas;
import com.lynx.component.svg.UISvg;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTruncationShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.frame.FrameShadowNode;
import com.lynx.tasm.behavior.ui.frame.UIFrame;
import com.lynx.tasm.behavior.ui.image.InlineImageShadowNode;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.list.UIListItem;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;
import com.lynx.tasm.behavior.ui.scroll.LynxUIScrollView;
import com.lynx.tasm.behavior.ui.scroll.UIBounceView;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.lynx.tasm.behavior.ui.swiper.SwiperShadowNode;
import com.lynx.tasm.behavior.ui.swiper.XSwiperUI;
import com.lynx.tasm.behavior.ui.text.FlattenUIText;
import com.lynx.tasm.behavior.ui.text.UIText;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.ui.view.UIView;
import com.lynx.tasm.image.AutoSizeImage;
import com.lynx.tasm.ui.image.FlattenUIImage;
import com.lynx.tasm.ui.image.FrescoInlineImageShadowNode;
import com.lynx.tasm.ui.image.UIFilterImage;
import com.lynx.tasm.ui.image.UIImage;
import com.lynx.xelement.overlay.LynxUIOverlayNG;
import com.lynx.xelement.overlay.LynxUIOverlayNGShadowNode;
import com.lynx.xelement.scroll.coordinator.LynxUIScrollCoordinator;
import com.lynx.xelement.scroll.coordinator.childitem.LynxUIScrollCoordinatorHeader;
import com.lynx.xelement.scroll.coordinator.childitem.LynxUIScrollCoordinatorSlot;
import com.lynx.xelement.scroll.coordinator.childitem.LynxUIScrollCoordinatorSlotDrag;
import com.lynx.xelement.scroll.coordinator.childitem.LynxUIScrollCoordinatorToolbar;
import com.lynx.xelement.viewpager.LynxUIViewPagerNG;
import com.lynx.xelement.viewpager.childitem.LynxUIViewPagerItemNG;
import com.ss.android.ugc.aweme.base.xelements.LynxUILive;
import com.ss.android.ugc.aweme.base.xelements.UISingleVideo;
import com.ss.android.ugc.aweme.ecommerce.player.live.lynx.ECLynxLiveView;
import com.ss.android.ugc.aweme.ecommerce.player.live.lynx.LynxMMKLiveView;
import com.ss.android.ugc.aweme.ecommerce.player.video.lynx.LynxMMKVideoTimeView;
import com.ss.android.ugc.aweme.ecommerce.player.video.lynx.LynxMMKVideoView;
import com.ss.android.ugc.aweme.ecommerce.showcase.view.XStoreHeaderToolbarView;
import com.ss.android.ugc.aweme.ecommerce.showcase.view.XStoreMixHeaderView;
import com.ss.android.ugc.aweme.ecommerce.ui.EcomFlattenUIImage;
import com.ss.android.ugc.aweme.ecommerce.ui.EcomUIImage;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.LynxDragListUIView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.poi.hybrid.behavior.LsFlattenUIImage;
import com.ss.android.ugc.aweme.poi.hybrid.behavior.LsUIImage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import j27.s;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0kxC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339200kxC extends C1311670kEn {
    public final int $t;

    @Override // X.C1311670kEn
    public final InterfaceC1210760hc2 LIZ() {
        return 56 - this.$t != 0 ? super.LIZ() : LIZ$0(this);
    }

    @Override // X.C1311670kEn
    public final LynxFlattenUI LIZIZ(s sVar) {
        switch (this.$t) {
            case 67:
                return LIZIZ$0(this, sVar);
            case 90:
                return LIZIZ$1(this, sVar);
            case 115:
                return LIZIZ$2(this, sVar);
            default:
                return super.LIZIZ(sVar);
        }
    }

    @Override // X.C1311670kEn
    public final LynxFlattenUI LIZJ(s sVar, Object obj) {
        switch (this.$t) {
            case 56:
                return LIZJ$0(this, sVar, obj);
            case 79:
                return LIZJ$1(this, sVar, obj);
            case 80:
                return LIZJ$2(this, sVar, obj);
            case 86:
                return LIZJ$3(this, sVar, obj);
            case 88:
                return LIZJ$4(this, sVar, obj);
            default:
                return super.LIZJ(sVar, obj);
        }
    }

    @Override // X.C1311670kEn
    public final InterfaceC1311940kFE LIZLLL(s sVar) {
        switch (this.$t) {
            case 51:
                return LIZLLL$0(this, sVar);
            case 52:
                return LIZLLL$1(this, sVar);
            case 137:
                return LIZLLL$2(this, sVar);
            default:
                return super.LIZLLL(sVar);
        }
    }

    @Override // X.C1311670kEn
    public final ShadowNode LJ() {
        switch (this.$t) {
            case 8:
                return LJ$0(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LJ$1(this);
            case 14:
                return LJ$2(this);
            case 22:
                return LJ$3(this);
            case 23:
                return LJ$4(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return LJ$5(this);
            case 25:
                return LJ$6(this);
            case 47:
                return LJ$7(this);
            case 54:
                return LJ$8(this);
            case 55:
                return LJ$9(this);
            case 56:
                return LJ$10(this);
            case 58:
                return LJ$11(this);
            case 59:
                return LJ$12(this);
            case 67:
                return LJ$13(this);
            case 78:
                return LJ$14(this);
            case 80:
                return LJ$15(this);
            case 81:
                return LJ$16(this);
            case 82:
                return LJ$17(this);
            case 83:
                return LJ$18(this);
            case 88:
                return LJ$19(this);
            case 89:
                return LJ$20(this);
            case 90:
                return LJ$21(this);
            case 115:
                return LJ$22(this);
            case 121:
                return LJ$23(this);
            case 127:
                return LJ$24(this);
            case 130:
                return LJ$25(this);
            case 133:
                return LJ$26(this);
            case 139:
                return LJ$27(this);
            default:
                return super.LJ();
        }
    }

    @Override // X.C1311670kEn
    public final LynxUI LJFF(s sVar) {
        switch (this.$t) {
            case 1:
                return LJFF$0(this, sVar);
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 19:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 22:
            case 23:
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
            case 35:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case BaseNotice.CREATOR /* 62 */:
            case 63:
            case 64:
            case 65:
            case 66:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 121:
            case 127:
            case 130:
            case 133:
            default:
                return super.LJFF(sVar);
            case 4:
                return LJFF$1(this, sVar);
            case 6:
                return LJFF$2(this, sVar);
            case 21:
                return LJFF$3(this, sVar);
            case 53:
                return LJFF$4(this, sVar);
            case 67:
                return LJFF$5(this, sVar);
            case 68:
                return LJFF$6(this, sVar);
            case 69:
                return LJFF$7(this, sVar);
            case 70:
                return LJFF$8(this, sVar);
            case 71:
                return LJFF$9(this, sVar);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return LJFF$10(this, sVar);
            case 73:
                return LJFF$11(this, sVar);
            case 74:
                return LJFF$12(this, sVar);
            case 75:
                return LJFF$13(this, sVar);
            case 90:
                return LJFF$14(this, sVar);
            case 91:
                return LJFF$15(this, sVar);
            case 92:
                return LJFF$16(this, sVar);
            case 93:
                return LJFF$17(this, sVar);
            case 94:
                return LJFF$18(this, sVar);
            case 95:
                return LJFF$19(this, sVar);
            case 96:
                return LJFF$20(this, sVar);
            case 97:
                return LJFF$21(this, sVar);
            case 98:
                return LJFF$22(this, sVar);
            case 99:
                return LJFF$23(this, sVar);
            case 100:
                return LJFF$24(this, sVar);
            case 101:
                return LJFF$25(this, sVar);
            case 102:
                return LJFF$26(this, sVar);
            case 103:
                return LJFF$27(this, sVar);
            case 104:
                return LJFF$28(this, sVar);
            case 105:
                return LJFF$29(this, sVar);
            case 106:
                return LJFF$30(this, sVar);
            case 107:
                return LJFF$31(this, sVar);
            case 108:
                return LJFF$32(this, sVar);
            case 109:
                return LJFF$33(this, sVar);
            case 110:
                return LJFF$34(this, sVar);
            case 111:
                return LJFF$35(this, sVar);
            case 112:
                return LJFF$36(this, sVar);
            case 113:
                return LJFF$37(this, sVar);
            case 114:
                return LJFF$38(this, sVar);
            case 115:
                return LJFF$39(this, sVar);
            case 116:
                return LJFF$40(this, sVar);
            case 117:
                return LJFF$41(this, sVar);
            case 118:
                return LJFF$42(this, sVar);
            case 119:
                return LJFF$43(this, sVar);
            case 120:
                return LJFF$44(this, sVar);
            case 122:
                return LJFF$45(this, sVar);
            case 123:
                return LJFF$46(this, sVar);
            case 124:
                return LJFF$47(this, sVar);
            case 125:
                return LJFF$48(this, sVar);
            case 126:
                return LJFF$49(this, sVar);
            case 128:
                return LJFF$50(this, sVar);
            case 129:
                return LJFF$51(this, sVar);
            case 131:
                return LJFF$52(this, sVar);
            case 132:
                return LJFF$53(this, sVar);
            case 134:
                return LJFF$54(this, sVar);
            case 135:
                return LJFF$55(this, sVar);
            case 136:
                return LJFF$56(this, sVar);
            case 137:
                return LJFF$57(this, sVar);
            case 138:
                return LJFF$58(this, sVar);
            case 139:
                return LJFF$59(this, sVar);
            case 140:
                return LJFF$60(this, sVar);
            case 141:
                return LJFF$61(this, sVar);
            case 142:
                return LJFF$62(this, sVar);
            case 143:
                return LJFF$63(this, sVar);
            case 144:
                return LJFF$64(this, sVar);
            case 145:
                return LJFF$65(this, sVar);
            case 146:
                return LJFF$66(this, sVar);
            case 147:
                return LJFF$67(this, sVar);
            case 148:
                return LJFF$68(this, sVar);
            case 149:
                return LJFF$69(this, sVar);
            case 150:
                return LJFF$70(this, sVar);
            case 151:
                return LJFF$71(this, sVar);
            case 152:
                return LJFF$72(this, sVar);
            case 153:
                return LJFF$73(this, sVar);
            case 154:
                return LJFF$74(this, sVar);
            case 155:
                return LJFF$75(this, sVar);
            case 156:
                return LJFF$76(this, sVar);
            case 157:
                return LJFF$77(this, sVar);
            case 158:
                return LJFF$78(this, sVar);
            case 159:
                return LJFF$79(this, sVar);
            case 160:
                return LJFF$80(this, sVar);
        }
    }

    @Override // X.C1311670kEn
    public final LynxUI LJI(s sVar, Object obj) {
        switch (this.$t) {
            case 0:
                return LJI$0(this, sVar, obj);
            case 1:
            case 4:
            case 6:
            case 21:
            case 23:
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            case 25:
            case 53:
            case 58:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
            case 73:
            case 74:
            case 75:
            case 81:
            case 82:
            case 83:
            default:
                return super.LJI(sVar, obj);
            case 2:
                return LJI$1(this, sVar, obj);
            case 3:
                return LJI$2(this, sVar, obj);
            case 5:
                return LJI$3(this, sVar, obj);
            case 7:
                return LJI$4(this, sVar, obj);
            case 8:
                return LJI$5(this, sVar, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LJI$6(this, sVar, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LJI$7(this, sVar, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return LJI$8(this, sVar, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LJI$9(this, sVar, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return LJI$10(this, sVar, obj);
            case 14:
                return LJI$11(this, sVar, obj);
            case 15:
                return LJI$12(this, sVar, obj);
            case 16:
                return LJI$13(this, sVar, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return LJI$14(this, sVar, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return LJI$15(this, sVar, obj);
            case 19:
                return LJI$16(this, sVar, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return LJI$17(this, sVar, obj);
            case 22:
                return LJI$18(this, sVar, obj);
            case 26:
                return LJI$19(this, sVar, obj);
            case 27:
                return LJI$20(this, sVar, obj);
            case 28:
                return LJI$21(this, sVar, obj);
            case 29:
                return LJI$22(this, sVar, obj);
            case 30:
                return LJI$23(this, sVar, obj);
            case 31:
                return LJI$24(this, sVar, obj);
            case 32:
                return LJI$25(this, sVar, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return LJI$26(this, sVar, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return LJI$27(this, sVar, obj);
            case 35:
                return LJI$28(this, sVar, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return LJI$29(this, sVar, obj);
            case 37:
                return LJI$30(this, sVar, obj);
            case 38:
                return LJI$31(this, sVar, obj);
            case 39:
                return LJI$32(this, sVar, obj);
            case 40:
                return LJI$33(this, sVar, obj);
            case 41:
                return LJI$34(this, sVar, obj);
            case 42:
                return LJI$35(this, sVar, obj);
            case 43:
                return LJI$36(this, sVar, obj);
            case 44:
                return LJI$37(this, sVar, obj);
            case 45:
                return LJI$38(this, sVar, obj);
            case 46:
                return LJI$39(this, sVar, obj);
            case 47:
                return LJI$40(this, sVar, obj);
            case 48:
                return LJI$41(this, sVar, obj);
            case 49:
                return LJI$42(this, sVar, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return LJI$43(this, sVar, obj);
            case 51:
                return LJI$44(this, sVar, obj);
            case 52:
                return LJI$45(this, sVar, obj);
            case 54:
                return LJI$46(this, sVar, obj);
            case 55:
                return LJI$47(this, sVar, obj);
            case 56:
                return LJI$48(this, sVar, obj);
            case 57:
                return LJI$49(this, sVar, obj);
            case 59:
                return LJI$50(this, sVar, obj);
            case 60:
                return LJI$51(this, sVar, obj);
            case 61:
                return LJI$52(this, sVar, obj);
            case BaseNotice.CREATOR /* 62 */:
                return LJI$53(this, sVar, obj);
            case 63:
                return LJI$54(this, sVar, obj);
            case 64:
                return LJI$55(this, sVar, obj);
            case 65:
                return LJI$56(this, sVar, obj);
            case 66:
                return LJI$57(this, sVar, obj);
            case 76:
                return LJI$58(this, sVar, obj);
            case 77:
                return LJI$59(this, sVar, obj);
            case 78:
                return LJI$60(this, sVar, obj);
            case 79:
                return LJI$61(this, sVar, obj);
            case 80:
                return LJI$62(this, sVar, obj);
            case 84:
                return LJI$63(this, sVar, obj);
            case 85:
                return LJI$64(this, sVar, obj);
            case 86:
                return LJI$65(this, sVar, obj);
            case 87:
                return LJI$66(this, sVar, obj);
            case 88:
                return LJI$67(this, sVar, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1339200kxC(int i) {
        super("x-foldview-slot-drag-ng", false, true, false);
        this.$t = i;
        switch (i) {
            case 0:
                super("x-alpha-video", false, false, false);
                break;
            case 1:
                super("x-swiper", false, true, false);
                break;
            case 2:
                super("swiper-item", false, true, false);
                break;
            case 3:
                super("x-swiper-item", false, true, false);
                break;
            case 4:
                super("x-block-touch", false, true, false);
                break;
            case 5:
                super("x-blur-view", false, false, false);
                break;
            case 6:
                super("lottie-view", false, false, false);
                break;
            case 7:
                super("input", false, false, false);
                break;
            case 8:
                super("x-textarea", false, false, true);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                super("x-input", false, false, true);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case 47:
                super("x-markdown", false, true, false);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                super("x-nested-scroll-view", false, true, false);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                super("nested-scroll-view", false, true, false);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                super("x-overlay", false, false, false);
                break;
            case 14:
                super("x-overlay-ng", false, false, false);
                break;
            case 15:
                super("x-picker-view-column", false, true, false);
                break;
            case 16:
                super("x-picker-view", false, true, false);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                super("x-refresh-view", false, true, false);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                super("x-refresh-header", false, true, false);
                break;
            case 19:
                super("x-refresh-footer", false, true, false);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                super("x-scroll-view", false, true, false);
                break;
            case 21:
                super("x-bounce-view", false, true, false);
                break;
            case 22:
                super("x-text", false, true, false);
                break;
            case 23:
                super("x-inline-image", false, false, false);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                super("x-inline-truncation", false, false, false);
                break;
            case 25:
                super("x-inline-text", false, false, false);
                break;
            case 26:
                super("x-foldview-toolbar-ng", false, true, false);
                break;
            case 27:
                super("x-foldview-header", false, true, false);
                break;
            case 28:
                super("x-foldview-header-pro", false, true, false);
                break;
            case 29:
                super("x-foldview-header-ng", false, true, false);
                break;
            case 30:
                super("x-tabbar-item", false, true, false);
                break;
            case 31:
                super("x-tabbar-item-pro", false, true, false);
                break;
            case 32:
                super("x-viewpager", false, true, false);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                super("x-viewpager-pro", false, true, false);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                super("x-foldview-slot-drag-ng", false, true, false);
                break;
            case 35:
                super("x-viewpager-ng", false, true, false);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                super("x-viewpager-item-pro", false, true, false);
                break;
            case 37:
                super("x-tabbar", false, true, false);
                break;
            case 38:
                super("x-tabbar-pro", false, true, false);
                break;
            case 39:
                super("x-viewpager-item", false, true, false);
                break;
            case 40:
                super("x-viewpager-item-ng", false, true, false);
                break;
            case 41:
                super("x-foldview-ng", false, true, false);
                break;
            case 42:
                super("x-foldview-slot-ng", false, true, false);
                break;
            case 43:
                super("x-foldview", false, true, false);
                break;
            case 44:
                super("x-foldview-pro", false, true, false);
                break;
            case 45:
                super("x-foldview-toolbar", false, true, false);
                break;
            case 46:
                super("x-foldview-toolbar-pro", false, true, false);
                break;
            case 48:
                super("canvas", false, false, false);
                break;
            case 49:
                super("canvas-ng", false, false, false);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                super("surface-canvas-experiment", false, false, false);
                break;
            case 51:
                super("svg", false, true, false, true);
                break;
            case 52:
                super("x-svg", false, true, false, true);
                break;
            case 53:
                super("scroll-view-new-arch", false, false, false);
                break;
            case 54:
                super("frame", false, false, false);
                break;
            case 55:
                super("swiper", false, true, false);
                break;
            case 56:
            case 88:
                super("image", true, true, false);
                break;
            case 57:
                super("filter-image", false, true, false);
                break;
            case 58:
            case 89:
                super("inline-image", false, true, false);
                break;
            case 59:
                super("overlay", false, false, false);
                break;
            case 60:
                super("scroll-coordinator", false, true, false);
                break;
            case 61:
                super("scroll-coordinator-header", false, true, false);
                break;
            case BaseNotice.CREATOR /* 62 */:
                super("scroll-coordinator-slot", false, true, false);
                break;
            case 63:
                super("scroll-coordinator-toolbar", false, true, false);
                break;
            case 64:
                super("scroll-coordinator-slot-drag", false, true, false);
                break;
            case 65:
                super("viewpager", false, true, false);
                break;
            case 66:
                super("viewpager-item", false, true, false);
                break;
            case 67:
                super("gec-image", true, false, false);
                break;
            case 68:
                super("mmk-video", false, false, false);
                break;
            case 69:
                super("mmk-video-time", false, false, false);
                break;
            case 70:
                super("x-ecom-live", false, false, false);
                break;
            case 71:
                super("mmk-live", false, false, false);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                super("x-mix-store-header", false, false, false);
                break;
            case 73:
                super("x-mix-store-header-toolbar", false, false, false);
                break;
            case 74:
            case 75:
                super("list", false, false, false);
                break;
            case 76:
                super("list-item", false, true, false);
                break;
            case 77:
                super("list-container", false, true, false);
                break;
            case 78:
                super("frame", false, true, false);
                break;
            case 79:
                super("view", true, true, false);
                break;
            case 80:
                super("text", true, true, false);
                break;
            case 81:
                super("raw-text", false, true, false);
                break;
            case 82:
                super("inline-text", false, true, false);
                break;
            case 83:
                super("inline-truncation", false, true, false);
                break;
            case 84:
                super("scroll-view", false, true, false);
                break;
            case 85:
                super("bounce-view", false, true, false);
                break;
            case 86:
                super("component", true, true, false);
                break;
            case 87:
                super("list", false, true, false);
                break;
            case 90:
            case 159:
            default:
                break;
            case 91:
                super("x-video-seek", false, false, false);
                break;
            case 92:
                super("x-live-ng", false, false, false);
                break;
            case 93:
                super("x-picker-view-column", false, false, false);
                break;
            case 94:
                super("spark-skeleton", false, false, false);
                break;
            case 95:
                super("picker-view-column", false, false, false);
                break;
            case 96:
                super("animax-view", false, false, false);
                break;
            case 97:
            case 153:
                super("x-foldview-header-ng", false, true, false);
                break;
            case 98:
                super("x-picker-view", false, false, false);
                break;
            case 99:
                super("x-foldview-toolbar-ng", false, false, false);
                break;
            case 100:
                super("x-viewpager-pro", false, true, false);
                break;
            case 101:
                super("x-foldview-slot-drag-ng", false, false, false);
                break;
            case 102:
                super("x-foldview-header-pro", false, false, false);
                break;
            case 103:
            case 155:
                super("x-viewpager-ng", false, true, false);
                break;
            case 104:
                super("picker-view", false, false, false);
                break;
            case 105:
                super("x-viewpager-item-pro", false, true, false);
                break;
            case 106:
                super("x-block-touch", false, false, false);
                break;
            case 107:
            case 156:
                super("x-viewpager-item-ng", false, true, false);
                break;
            case 108:
                super("x-svg", false, true, false);
                break;
            case 109:
                super("x-tabbar-pro", false, true, false);
                break;
            case 110:
            case 160:
                super("x-foldview-ng", false, true, false);
                break;
            case 111:
            case 123:
                super("x-tabbar", false, false, false);
                break;
            case 112:
                super("x-tabbar-item-pro", false, true, false);
                break;
            case 113:
                super("x-swiper", false, true, false);
                break;
            case 114:
            case 125:
                super("x-tabbar-item", false, false, false);
                break;
            case 115:
                super("image", true, true, false);
                break;
            case 116:
                super("swiper", false, true, false);
                break;
            case 117:
            case 128:
                super("x-viewpager", false, false, false);
                break;
            case 118:
                super("filter-image", false, false, false);
                break;
            case 119:
                super("x-swiper-item", false, true, false);
                break;
            case 120:
            case 134:
                super("x-viewpager-item", false, false, false);
                break;
            case 121:
                super("inline-image", false, false, false);
                break;
            case 122:
                super("swiper-item", false, true, false);
                break;
            case 124:
                super("x-blur-view", false, false, false);
                break;
            case 126:
                super("x-scroll-view", false, true, false);
                break;
            case 127:
                super("x-inline-text", false, false, false);
                break;
            case 129:
                super("x-impression-view", false, false, false);
                break;
            case 130:
                super("x-inline-image", false, false, false);
                break;
            case 131:
                super("x-foldview-toolbar-pro", false, false, false);
                break;
            case 132:
                super("x-bounce-view", false, true, false);
                break;
            case 133:
                super("x-inline-truncation", false, false, false);
                break;
            case 135:
                super("x-video", false, false, false);
                break;
            case 136:
                super("x-overlay", false, false, false);
                break;
            case 137:
                super("svg", false, true, false, true);
                break;
            case 138:
            case 157:
                super("x-refresh-view", false, true, false);
                break;
            case 139:
                super("x-markdown", false, false, false);
                break;
            case 140:
            case 158:
                super("x-foldview-slot-ng", false, true, false);
                break;
            case 141:
                super("x-reveal-view", false, false, false);
                break;
            case 142:
                super("x-single-video", false, false, false);
                break;
            case 143:
                super("x-refresh-header", false, true, false);
                break;
            case 144:
                super("x-reveal-view-inner-left", false, false, false);
                break;
            case 145:
                super("canvas-ng", false, false, false);
                break;
            case 146:
                super("x-refresh-footer", false, true, false);
                break;
            case 147:
                super("x-reveal-view-inner-right", false, false, false);
                break;
            case 148:
                super("canvas", false, false, false);
                break;
            case 149:
                super("x-input", false, false, false);
                break;
            case 150:
                super("x-nested-scroll-view", false, false, false);
                break;
            case 151:
                super("input", false, false, false);
                break;
            case 152:
                super("x-foldview-pro", false, false, false);
                break;
            case 154:
                super("svg", false, true, false);
                break;
        }
    }

    public static final InterfaceC1210760hc2 LIZ$0(C1339200kxC c1339200kxC) {
        return new InterfaceC1210760hc2() { // from class: X.0kLq
            @Override // X.InterfaceC1210760hc2
            public final void LIZ() {
                try {
                    Class.forName(FlattenUIImage.class.getName());
                    Class.forName(C1315750kLN.class.getName());
                    Class.forName(UIImage.class.getName());
                    Class.forName(C1316390kMP.class.getName());
                    Class.forName(C1316170kM3.class.getName());
                    Class.forName(AutoSizeImage.class.getName());
                    Class.forName(C1316130kLz.class.getName());
                    Class.forName(AbstractC1316490kMZ.class.getName());
                    Class.forName(AbstractC1319960kSA.class.getName());
                    Class.forName(C1320010kSF.class.getName());
                    Class.forName(C1320030kSH.class.getName());
                    Class.forName(C1315710kLJ.class.getName());
                    Class.forName(C1315730kLL.class.getName());
                    Class.forName(C1315900kLc.class.getName());
                    Class.forName(C1315850kLX.class.getName());
                    Class.forName(EnumC1316020kLo.class.getName());
                    Class.forName(C089P.class.getName());
                    Class.forName(AbstractC1320720kTO.class.getName());
                    Class.forName(C1320810kTX.class.getName());
                    Class.forName(C1320700kTM.class.getName());
                    Class.forName(C1331090kk7.class.getName());
                    Class.forName(C1331100kk8.class.getName());
                    Class.forName(C1331070kk5.class.getName());
                    Class.forName(C1331050kk3.class.getName());
                    Class.forName(C1330970kjv.class.getName());
                    Class.forName(C1331180kkG.class.getName());
                    Class.forName(C1331080kk6.class.getName());
                    Class.forName(C1319910kS5.class.getName());
                    Class.forName(C1331060kk4.class.getName());
                    Class.forName(C1331110kk9.class.getName());
                    Class.forName(C440190HNx.class.getName());
                } catch (ClassNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }

    public static final ShadowNode LJ$0(C1339200kxC c1339200kxC) {
        return new AutoHeightInputShadowNode();
    }

    public static final ShadowNode LJ$1(C1339200kxC c1339200kxC) {
        return new MarkdownShadowNode();
    }

    public static final ShadowNode LJ$10(C1339200kxC c1339200kxC) {
        return new AutoSizeImage();
    }

    public static final ShadowNode LJ$11(C1339200kxC c1339200kxC) {
        return new FrescoInlineImageShadowNode();
    }

    public static final ShadowNode LJ$12(C1339200kxC c1339200kxC) {
        return new LynxUIOverlayNGShadowNode();
    }

    public static final ShadowNode LJ$13(C1339200kxC c1339200kxC) {
        return new AutoSizeImage();
    }

    public static final ShadowNode LJ$14(C1339200kxC c1339200kxC) {
        return new FrameShadowNode();
    }

    public static final ShadowNode LJ$15(C1339200kxC c1339200kxC) {
        return new TextShadowNode();
    }

    public static final ShadowNode LJ$16(C1339200kxC c1339200kxC) {
        return new RawTextShadowNode();
    }

    public static final ShadowNode LJ$17(C1339200kxC c1339200kxC) {
        return new InlineTextShadowNode();
    }

    public static final ShadowNode LJ$18(C1339200kxC c1339200kxC) {
        return new InlineTruncationShadowNode();
    }

    public static final ShadowNode LJ$19(C1339200kxC c1339200kxC) {
        return new AutoSizeImage();
    }

    public static final ShadowNode LJ$2(C1339200kxC c1339200kxC) {
        return new OverlayShadowNodeNG();
    }

    public static final ShadowNode LJ$20(C1339200kxC c1339200kxC) {
        return new InlineImageShadowNode();
    }

    public static final ShadowNode LJ$21(C1339200kxC c1339200kxC) {
        return new AutoSizeImage();
    }

    public static final ShadowNode LJ$22(C1339200kxC c1339200kxC) {
        return new AutoSizeImage();
    }

    public static final ShadowNode LJ$23(C1339200kxC c1339200kxC) {
        return new FrescoInlineImageShadowNode();
    }

    public static final ShadowNode LJ$24(C1339200kxC c1339200kxC) {
        return new LynxInlineTextShadowNode();
    }

    public static final ShadowNode LJ$25(C1339200kxC c1339200kxC) {
        return new LynxInlineImageShadowNode();
    }

    public static final ShadowNode LJ$26(C1339200kxC c1339200kxC) {
        return new LynxInlineTruncationShadowNode();
    }

    public static final ShadowNode LJ$27(C1339200kxC c1339200kxC) {
        return new MarkdownShadowNode();
    }

    public static final ShadowNode LJ$3(C1339200kxC c1339200kxC) {
        return new LynxTextShadowNode();
    }

    public static final ShadowNode LJ$4(C1339200kxC c1339200kxC) {
        return new LynxInlineImageShadowNode();
    }

    public static final ShadowNode LJ$5(C1339200kxC c1339200kxC) {
        return new LynxInlineTruncationShadowNode();
    }

    public static final ShadowNode LJ$6(C1339200kxC c1339200kxC) {
        return new LynxInlineTextShadowNode();
    }

    public static final ShadowNode LJ$7(C1339200kxC c1339200kxC) {
        return new MarkdownShadowNode();
    }

    public static final ShadowNode LJ$8(C1339200kxC c1339200kxC) {
        return new FrameShadowNode();
    }

    public static final ShadowNode LJ$9(C1339200kxC c1339200kxC) {
        return new SwiperShadowNode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1339200kxC(boolean z, int i) {
        super("image", z, false, false);
        this.$t = i;
    }

    public static final LynxFlattenUI LIZIZ$0(C1339200kxC c1339200kxC, s sVar) {
        return new EcomFlattenUIImage(sVar, null, null, false, false, null);
    }

    public static final LynxFlattenUI LIZIZ$1(C1339200kxC c1339200kxC, s sVar) {
        String str;
        if (sVar != null) {
            str = sVar.LLJJIII;
        } else {
            str = null;
        }
        return new LsFlattenUIImage(sVar, str);
    }

    public static final LynxFlattenUI LIZIZ$2(C1339200kxC c1339200kxC, s sVar) {
        return new FlattenUIImage(sVar);
    }

    public static final InterfaceC1311940kFE LIZLLL$0(C1339200kxC c1339200kxC, s sVar) {
        return new C1311960kFG(sVar);
    }

    public static final InterfaceC1311940kFE LIZLLL$1(C1339200kxC c1339200kxC, s sVar) {
        return new C1311960kFG(sVar);
    }

    public static final InterfaceC1311940kFE LIZLLL$2(C1339200kxC c1339200kxC, s sVar) {
        return new C1311960kFG(sVar);
    }

    public static final LynxUI LJFF$0(C1339200kxC c1339200kxC, s sVar) {
        return new LynxSwiperView(sVar);
    }

    public static final LynxUI LJFF$1(C1339200kxC c1339200kxC, s sVar) {
        return new LynxBlockTouchView(sVar);
    }

    public static final LynxUI LJFF$10(C1339200kxC c1339200kxC, s sVar) {
        return new XStoreMixHeaderView(sVar);
    }

    public static final LynxUI LJFF$11(C1339200kxC c1339200kxC, s sVar) {
        return new XStoreHeaderToolbarView(sVar);
    }

    public static final LynxUI LJFF$12(C1339200kxC c1339200kxC, s sVar) {
        return new LynxDragListUIView(sVar);
    }

    public static final LynxUI LJFF$13(C1339200kxC c1339200kxC, s sVar) {
        return new LynxDragListUIView(sVar);
    }

    public static final LynxUI LJFF$14(C1339200kxC c1339200kxC, s sVar) {
        String str;
        if (sVar != null) {
            str = sVar.LLJJIII;
        } else {
            str = null;
        }
        return new LsUIImage(sVar, str);
    }

    public static final LynxUI LJFF$15(C1339200kxC c1339200kxC, s sVar) {
        return new LynxSeekerManager(sVar);
    }

    public static final LynxUI LJFF$16(C1339200kxC c1339200kxC, s sVar) {
        return new LynxUILive(sVar);
    }

    public static final LynxUI LJFF$17(C1339200kxC c1339200kxC, s sVar) {
        return new LynxPickerViewColumn(sVar, new InterfaceC1305140k4G() { // from class: X.0juW
            @Override // X.InterfaceC1305140k4G
            public final Map<String, String> LIZ() {
                return C2097608Jq.LJIIIIZZ(new Pair("confirm", "confirm"), new Pair("cancel", "cancel"), new Pair("wheel_text_bound_text", "Week"));
            }
        }, null);
    }

    public static final LynxUI LJFF$18(C1339200kxC c1339200kxC, s sVar) {
        return new LynxSkeletonUI(sVar);
    }

    public static final LynxUI LJFF$19(C1339200kxC c1339200kxC, s sVar) {
        return new LynxPickerViewColumn(sVar, new InterfaceC1305140k4G() { // from class: X.0juV
            @Override // X.InterfaceC1305140k4G
            public final Map<String, String> LIZ() {
                return C2097608Jq.LJIIIIZZ(new Pair("confirm", "confirm"), new Pair("cancel", "cancel"), new Pair("wheel_text_bound_text", "Week"));
            }
        }, null);
    }

    public static final LynxUI LJFF$2(C1339200kxC c1339200kxC, s sVar) {
        return new LynxBytedLottieView(sVar);
    }

    public static final LynxUI LJFF$20(C1339200kxC c1339200kxC, s sVar) {
        LynxAnimaX.inst().init(null);
        return LynxAnimaX.inst().createUI(sVar);
    }

    public static final LynxUI LJFF$21(C1339200kxC c1339200kxC, s sVar) {
        return new LynxFoldHeader(sVar);
    }

    public static final LynxUI LJFF$22(C1339200kxC c1339200kxC, s sVar) {
        return new LynxPickView(sVar);
    }

    public static final LynxUI LJFF$23(C1339200kxC c1339200kxC, s sVar) {
        return new LynxFoldToolbar(sVar);
    }

    public static final LynxUI LJFF$24(C1339200kxC c1339200kxC, s sVar) {
        return new LynxViewPager(sVar);
    }

    public static final LynxUI LJFF$25(C1339200kxC c1339200kxC, s sVar) {
        return new LynxFoldSlotDrag(sVar);
    }

    public static final LynxUI LJFF$26(C1339200kxC c1339200kxC, s sVar) {
        return new LynxFoldHeader(sVar);
    }

    public static final LynxUI LJFF$27(C1339200kxC c1339200kxC, s sVar) {
        return new LynxViewPagerNG(sVar, null);
    }

    public static final LynxUI LJFF$28(C1339200kxC c1339200kxC, s sVar) {
        return new LynxPickView(sVar);
    }

    public static final LynxUI LJFF$29(C1339200kxC c1339200kxC, s sVar) {
        return new LynxViewpagerItem(sVar);
    }

    public static final LynxUI LJFF$3(C1339200kxC c1339200kxC, s sVar) {
        return new LynxBounceView(sVar);
    }

    public static final LynxUI LJFF$30(C1339200kxC c1339200kxC, s sVar) {
        return new LynxBlockTouchView(sVar);
    }

    public static final LynxUI LJFF$31(C1339200kxC c1339200kxC, s sVar) {
        return new LynxViewpagerItem(sVar);
    }

    public static final LynxUI LJFF$32(C1339200kxC c1339200kxC, s sVar) {
        return new UISvg(sVar, null);
    }

    public static final LynxUI LJFF$33(C1339200kxC c1339200kxC, s sVar) {
        return new LynxTabBarView(sVar, null);
    }

    public static final LynxUI LJFF$34(C1339200kxC c1339200kxC, s sVar) {
        return new LynxFoldViewNG(sVar, null);
    }

    public static final LynxUI LJFF$35(C1339200kxC c1339200kxC, s sVar) {
        return new LynxTabBarView(sVar, null);
    }

    public static final LynxUI LJFF$36(C1339200kxC c1339200kxC, s sVar) {
        return new LynxTabbarItem(sVar);
    }

    public static final LynxUI LJFF$37(C1339200kxC c1339200kxC, s sVar) {
        return new LynxSwiperView(sVar);
    }

    public static final LynxUI LJFF$38(C1339200kxC c1339200kxC, s sVar) {
        return new LynxTabbarItem(sVar);
    }

    public static final LynxUI LJFF$39(C1339200kxC c1339200kxC, s sVar) {
        return new UIImage(sVar);
    }

    public static final LynxUI LJFF$4(C1339200kxC c1339200kxC, s sVar) {
        return new LynxUIScrollView(sVar);
    }

    public static final LynxUI LJFF$40(C1339200kxC c1339200kxC, s sVar) {
        return new LynxSwiperView(sVar);
    }

    public static final LynxUI LJFF$41(C1339200kxC c1339200kxC, s sVar) {
        return new LynxViewPager(sVar);
    }

    public static final LynxUI LJFF$42(C1339200kxC c1339200kxC, s sVar) {
        return new UIFilterImage(sVar);
    }

    public static final LynxUI LJFF$43(C1339200kxC c1339200kxC, s sVar) {
        return new LynxSwiperItemView(sVar);
    }

    public static final LynxUI LJFF$44(C1339200kxC c1339200kxC, s sVar) {
        return new LynxViewpagerItem(sVar);
    }

    public static final LynxUI LJFF$45(C1339200kxC c1339200kxC, s sVar) {
        return new LynxSwiperItemView(sVar);
    }

    public static final LynxUI LJFF$46(C1339200kxC c1339200kxC, s sVar) {
        return new LynxTabBarView(sVar, null);
    }

    public static final LynxUI LJFF$47(C1339200kxC c1339200kxC, s sVar) {
        return new UIBlurView(sVar, null);
    }

    public static final LynxUI LJFF$48(C1339200kxC c1339200kxC, s sVar) {
        return new LynxTabbarItem(sVar);
    }

    public static final LynxUI LJFF$49(C1339200kxC c1339200kxC, s sVar) {
        return new LynxScrollView(sVar, null);
    }

    public static final LynxUI LJFF$5(C1339200kxC c1339200kxC, s sVar) {
        return new EcomUIImage(sVar, null, null, false, null);
    }

    public static final LynxUI LJFF$50(C1339200kxC c1339200kxC, s sVar) {
        return new LynxViewPager(sVar);
    }

    public static final LynxUI LJFF$51(C1339200kxC c1339200kxC, s sVar) {
        return new LynxImpressionView(sVar);
    }

    public static final LynxUI LJFF$52(C1339200kxC c1339200kxC, s sVar) {
        return new LynxFoldToolbar(sVar);
    }

    public static final LynxUI LJFF$53(C1339200kxC c1339200kxC, s sVar) {
        return new LynxBounceView(sVar);
    }

    public static final LynxUI LJFF$54(C1339200kxC c1339200kxC, s sVar) {
        return new LynxViewpagerItem(sVar);
    }

    public static final LynxUI LJFF$55(C1339200kxC c1339200kxC, s sVar) {
        return new LynxVideoManager(sVar);
    }

    public static final LynxUI LJFF$56(C1339200kxC c1339200kxC, s sVar) {
        return new LynxOverlayViewProxy(sVar, null);
    }

    public static final LynxUI LJFF$57(C1339200kxC c1339200kxC, s sVar) {
        return new UISvg(sVar, null);
    }

    public static final LynxUI LJFF$58(C1339200kxC c1339200kxC, s sVar) {
        return new LynxPullRefreshView(sVar, null);
    }

    public static final LynxUI LJFF$59(C1339200kxC c1339200kxC, s sVar) {
        Markdown.ensureInitialized();
        return new MarkdownUI(sVar);
    }

    public static final LynxUI LJFF$6(C1339200kxC c1339200kxC, s sVar) {
        return new LynxMMKVideoView(sVar);
    }

    public static final LynxUI LJFF$60(C1339200kxC c1339200kxC, s sVar) {
        return new LynxFoldSlot(sVar);
    }

    public static final LynxUI LJFF$61(C1339200kxC c1339200kxC, s sVar) {
        return new LynxRevealView(sVar);
    }

    public static final LynxUI LJFF$62(C1339200kxC c1339200kxC, s sVar) {
        return new UISingleVideo(sVar);
    }

    public static final LynxUI LJFF$63(C1339200kxC c1339200kxC, s sVar) {
        return new LynxRefreshHeader(sVar);
    }

    public static final LynxUI LJFF$64(C1339200kxC c1339200kxC, s sVar) {
        return new LynxRevealInnerLeft(sVar);
    }

    public static final LynxUI LJFF$65(C1339200kxC c1339200kxC, s sVar) {
        return new UICanvas(sVar);
    }

    public static final LynxUI LJFF$66(C1339200kxC c1339200kxC, s sVar) {
        return new LynxRefreshFooter(sVar);
    }

    public static final LynxUI LJFF$67(C1339200kxC c1339200kxC, s sVar) {
        return new LynxRevealInnerRight(sVar);
    }

    public static final LynxUI LJFF$68(C1339200kxC c1339200kxC, s sVar) {
        return new UICanvas(sVar);
    }

    public static final LynxUI LJFF$69(C1339200kxC c1339200kxC, s sVar) {
        return new LynxInputView(sVar);
    }

    public static final LynxUI LJFF$7(C1339200kxC c1339200kxC, s sVar) {
        return new LynxMMKVideoTimeView(sVar);
    }

    public static final LynxUI LJFF$70(C1339200kxC c1339200kxC, s sVar) {
        return new LynxNestedScrollView(sVar);
    }

    public static final LynxUI LJFF$71(C1339200kxC c1339200kxC, s sVar) {
        return new LynxInputView(sVar);
    }

    public static final LynxUI LJFF$72(C1339200kxC c1339200kxC, s sVar) {
        return new LynxFoldView(sVar, null);
    }

    public static final LynxUI LJFF$73(C1339200kxC c1339200kxC, s sVar) {
        return new LynxFoldHeader(sVar);
    }

    public static final LynxUI LJFF$74(C1339200kxC c1339200kxC, s sVar) {
        return new UISvg(sVar, null);
    }

    public static final LynxUI LJFF$75(C1339200kxC c1339200kxC, s sVar) {
        return new LynxViewPagerNG(sVar, null);
    }

    public static final LynxUI LJFF$76(C1339200kxC c1339200kxC, s sVar) {
        return new LynxViewpagerItem(sVar);
    }

    public static final LynxUI LJFF$77(C1339200kxC c1339200kxC, s sVar) {
        return new LynxPullRefreshView(sVar, null);
    }

    public static final LynxUI LJFF$78(C1339200kxC c1339200kxC, s sVar) {
        return new LynxFoldSlot(sVar);
    }

    public static final LynxUI LJFF$79(C1339200kxC c1339200kxC, s sVar) {
        return new LynxFoldSlotDrag(sVar);
    }

    public static final LynxUI LJFF$8(C1339200kxC c1339200kxC, s sVar) {
        return new ECLynxLiveView(sVar);
    }

    public static final LynxUI LJFF$80(C1339200kxC c1339200kxC, s sVar) {
        return new LynxFoldViewNG(sVar, null);
    }

    public static final LynxUI LJFF$9(C1339200kxC c1339200kxC, s sVar) {
        return new LynxMMKLiveView(sVar);
    }

    public static final LynxFlattenUI LIZJ$0(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new FlattenUIImage(sVar, obj);
    }

    public static final LynxFlattenUI LIZJ$1(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFlattenUI(sVar, obj);
    }

    public static final LynxFlattenUI LIZJ$2(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new FlattenUIText(sVar, obj);
    }

    public static final LynxFlattenUI LIZJ$3(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFlattenUI(sVar, obj);
    }

    public static final LynxFlattenUI LIZJ$4(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new com.lynx.tasm.behavior.ui.image.FlattenUIImage(sVar, obj);
    }

    public static final LynxUI LJI$0(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxAlphaVideo(sVar, obj);
    }

    public static final LynxUI LJI$1(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxSwiperItemView(sVar, obj);
    }

    public static final LynxUI LJI$10(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxOverlayViewProxy(sVar, obj);
    }

    public static final LynxUI LJI$11(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxOverlayViewProxyNG(sVar, obj);
    }

    public static final LynxUI LJI$12(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxPickerViewColumn(sVar, null, obj);
    }

    public static final LynxUI LJI$13(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxPickView(sVar, obj);
    }

    public static final LynxUI LJI$14(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxPullRefreshView(sVar, obj);
    }

    public static final LynxUI LJI$15(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxRefreshHeader(sVar, obj);
    }

    public static final LynxUI LJI$16(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxRefreshFooter(sVar, obj);
    }

    public static final LynxUI LJI$17(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxScrollView(sVar, obj);
    }

    public static final LynxUI LJI$18(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxTextUI(sVar, obj);
    }

    public static final LynxUI LJI$19(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFoldToolbar(sVar, obj);
    }

    public static final LynxUI LJI$2(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxSwiperItemView(sVar, obj);
    }

    public static final LynxUI LJI$20(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFoldHeader(sVar, obj);
    }

    public static final LynxUI LJI$21(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFoldHeader(sVar, obj);
    }

    public static final LynxUI LJI$22(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFoldHeader(sVar, obj);
    }

    public static final LynxUI LJI$23(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxTabbarItem(sVar, obj);
    }

    public static final LynxUI LJI$24(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxTabbarItem(sVar, obj);
    }

    public static final LynxUI LJI$25(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxViewPager(sVar, obj);
    }

    public static final LynxUI LJI$26(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxViewPager(sVar, obj);
    }

    public static final LynxUI LJI$27(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFoldSlotDrag(sVar, obj);
    }

    public static final LynxUI LJI$28(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxViewPagerNG(sVar, obj);
    }

    public static final LynxUI LJI$29(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxViewpagerItem(sVar, obj);
    }

    public static final LynxUI LJI$3(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIBlurView(sVar, obj);
    }

    public static final LynxUI LJI$30(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxTabBarView(sVar, obj);
    }

    public static final LynxUI LJI$31(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxTabBarView(sVar, obj);
    }

    public static final LynxUI LJI$32(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxViewpagerItem(sVar, obj);
    }

    public static final LynxUI LJI$33(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxViewpagerItem(sVar, obj);
    }

    public static final LynxUI LJI$34(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFoldViewNG(sVar, obj);
    }

    public static final LynxUI LJI$35(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFoldSlot(sVar, obj);
    }

    public static final LynxUI LJI$36(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFoldView(sVar, obj);
    }

    public static final LynxUI LJI$37(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFoldView(sVar, obj);
    }

    public static final LynxUI LJI$38(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFoldToolbar(sVar, obj);
    }

    public static final LynxUI LJI$39(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxFoldToolbar(sVar, obj);
    }

    public static final LynxUI LJI$4(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxInputViewLegacy(sVar, obj);
    }

    public static final LynxUI LJI$40(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new MarkdownUI(sVar, obj);
    }

    public static final LynxUI LJI$41(C1339200kxC c1339200kxC, s sVar, Object obj) {
        try {
            return new UICanvas(sVar, obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("canvas init error");
            sbLIZ.append(th.toString());
            LynxLog.e("KryptonCanvasManager", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static final LynxUI LJI$42(C1339200kxC c1339200kxC, s sVar, Object obj) {
        try {
            return new UICanvas(sVar, obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("canvas-ng createUI error");
            sbLIZ.append(th.toString());
            LynxLog.e("KryptonCanvasManager", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static final LynxUI LJI$43(C1339200kxC c1339200kxC, s sVar, Object obj) {
        try {
            return new UISurfaceCanvas(sVar, obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("surface-canvas createUI error");
            sbLIZ.append(th.toString());
            LynxLog.e("KryptonCanvasManager", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static final LynxUI LJI$44(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UISvg(sVar, obj);
    }

    public static final LynxUI LJI$45(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UISvg(sVar, obj);
    }

    public static final LynxUI LJI$46(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIFrame(sVar, obj);
    }

    public static final LynxUI LJI$47(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new XSwiperUI(sVar, obj);
    }

    public static final LynxUI LJI$48(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIImage(sVar, obj);
    }

    public static final LynxUI LJI$49(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIFilterImage(sVar, obj);
    }

    public static final LynxUI LJI$5(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxTextAreaView(sVar, obj);
    }

    public static final LynxUI LJI$50(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxUIOverlayNG(sVar, obj);
    }

    public static final LynxUI LJI$51(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxUIScrollCoordinator(sVar, obj);
    }

    public static final LynxUI LJI$52(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxUIScrollCoordinatorHeader(sVar, obj);
    }

    public static final LynxUI LJI$53(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxUIScrollCoordinatorSlot(sVar, obj);
    }

    public static final LynxUI LJI$54(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxUIScrollCoordinatorToolbar(sVar, obj);
    }

    public static final LynxUI LJI$55(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxUIScrollCoordinatorSlotDrag(sVar, obj);
    }

    public static final LynxUI LJI$56(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxUIViewPagerNG(sVar, obj);
    }

    public static final LynxUI LJI$57(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxUIViewPagerItemNG(sVar, obj);
    }

    public static final LynxUI LJI$58(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIListItem(sVar, obj);
    }

    public static final LynxUI LJI$59(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIListContainer(sVar, obj);
    }

    public static final LynxUI LJI$6(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxInputView(sVar, obj);
    }

    public static final LynxUI LJI$60(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIFrame(sVar, obj);
    }

    public static final LynxUI LJI$61(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIView(sVar, obj);
    }

    public static final LynxUI LJI$62(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIText(sVar, obj);
    }

    public static final LynxUI LJI$63(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIScrollView(sVar, obj);
    }

    public static final LynxUI LJI$64(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIBounceView(sVar, obj);
    }

    public static final LynxUI LJI$65(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIComponent(sVar, obj);
    }

    public static final LynxUI LJI$66(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new UIList(sVar, obj);
    }

    public static final LynxUI LJI$67(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new com.lynx.tasm.behavior.ui.image.UIImage(sVar, obj);
    }

    public static final LynxUI LJI$7(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new MarkdownUI(sVar, obj);
    }

    public static final LynxUI LJI$8(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxNestedScrollView(sVar, obj);
    }

    public static final LynxUI LJI$9(C1339200kxC c1339200kxC, s sVar, Object obj) {
        return new LynxNestedScrollView(sVar, obj);
    }
}

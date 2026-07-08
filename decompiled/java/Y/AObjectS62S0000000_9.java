package Y;

import X.C0NAP;
import X.C0NEO;
import X.C0ODG;
import X.C582130MsN;
import X.C584360Mvy;
import X.C584470Mw9;
import X.C615860ODo;
import X.C615950ODx;
import X.C615960ODy;
import X.C799890VZj;
import X.C799900VZk;
import X.C810890VrT;
import X.EnumC584340Mvw;
import X.InterfaceC2217461Bqa;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinPageFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.BulletinCommentSheetFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.assem.BulletinCommentSheetAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.assem.BulletinCommentSheetListAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentMoreCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentSheetCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell;
import com.ss.android.ugc.aweme.music.assem.EllipsisAssem;
import com.ss.android.ugc.aweme.music.assem.MusicHeaderAssem;
import com.ss.android.ugc.aweme.music.assem.MusicListArtistCertificationAssem;
import com.ss.android.ugc.aweme.music.assem.MusicPlayAssemBase;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.FanSpotlightBlockVideoAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.FanSpotlightEllipsisAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.MusicFanSpotlightBlockAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.MusicFanSpotlightTitleAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.MusicTitleAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellBaseAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellCollectIconAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellCoverAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellHighlightAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellPinIconAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellShootAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.assem.report.compose.ReportDetailsFragmentCompose;
import com.ss.android.ugc.aweme.music.assem.report.compose.ReportListFragmentCompose;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectBtnAssem;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListAssem;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;
import com.ss.android.ugc.aweme.music.highlight.cell.assem.HighlightSelectMusicBaseAssem;
import com.ss.android.ugc.aweme.music.highlight.cell.assem.HighlightSelectMusicSelectIconAssem;
import com.ss.android.ugc.aweme.music.highlight.cell.assem.HighlightSelectMusicSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.ss.android.ugc.aweme.music.search.cell.SearchMusicCellPinIconAssem;
import com.ss.android.ugc.aweme.music.search.cell.SearchMusicCellSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.search.title.SearchMusicTitleAssem;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.ss.android.ugc.aweme.music.v2.assem.story.StoryMusicCoverAssem;
import com.ss.android.ugc.aweme.music.v2.assem.story.StoryMusicIgnoreCopyRightCoverAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.StoryMusicCoverEntranceViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicCellCollectIconViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.music.vm.ReportListViewModel;
import com.ss.android.ugc.aweme.music.vm.ReportViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.awemepushlib.interaction.PushSheduler;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AObjectS62S0000000_9 implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            default:
                return null;
        }
    }

    public AObjectS62S0000000_9(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinBaseCell.LLJLLIL;
        return new BulletinCommentListViewModel();
    }

    public static final Object invoke$1(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = EllipsisAssem.LLJI;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$10(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HighlightSelectListAssem.LLJILJIL;
        return new HighlightSelectListViewModel(new C615860ODo());
    }

    public static final Object invoke$11(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HighlightSelectMusicBaseAssem.LLJLIL;
        return new HighlightSelectListViewModel(new C615860ODo());
    }

    public static final Object invoke$12(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HighlightSelectMusicSelectIconAssem.LLJLILLLLZIIL;
        return new HighlightSelectListViewModel(new C615860ODo());
    }

    public static final Object invoke$13(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HighlightSelectMusicSimilarSoundsAssem.LLJLLIL;
        return new HighlightSelectListViewModel(new C615860ODo());
    }

    public static final Object invoke$14(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        String str = MusicDetailFragment._pnsPageId;
        return new StoryMusicCoverEntranceViewModel();
    }

    public static final Object invoke$15(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        ICommonConfig commonConfig;
        ISimKitConfig config = C582130MsN.LIZ().getConfig();
        if (config != null && (commonConfig = config.getCommonConfig()) != null) {
            return commonConfig.getSuperResolutionStrategyConfigV2();
        }
        return null;
    }

    public static final Object invoke$16(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = StoryMusicCoverAssem.LLLFF;
        return new StoryMusicCoverEntranceViewModel();
    }

    public static final Object invoke$17(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = StoryMusicIgnoreCopyRightCoverAssem.LLJL;
        return new StoryMusicCoverEntranceViewModel();
    }

    public static final Object invoke$18(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FanSpotlightBlockVideoAssem.LLJLLIL;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$19(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FanSpotlightEllipsisAssem.LLJJLIIIJLLLLLLLZ;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$2(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicHeaderAssem.LLJJJJJIL;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$20(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FanSpotlightEllipsisAssem.LLJJLIIIJLLLLLLLZ;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$21(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicFanSpotlightBlockAssem.LLJLLIL;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$22(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicFanSpotlightTitleAssem.LLJLL;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$23(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicTitleAssem.LLJLL;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$24(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        C584470Mw9.LJ("three_vv");
        return null;
    }

    public static final Object invoke$25(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        C584470Mw9.LJII("three_vv", null);
        ((HashMap) C584470Mw9.LIZ).put("three_vv", EnumC584340Mvw.NOT_MONITORED);
        return null;
    }

    public static final Object invoke$26(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        return Boolean.valueOf(C584360Mvy.LIZ());
    }

    public static final Object invoke$27(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SearchMusicCellPinIconAssem.LLJLILLLLZIIL;
        return new SearchMusicListViewModel(new C615960ODy());
    }

    public static final Object invoke$28(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SearchMusicCellSimilarSoundsAssem.LLJLL;
        return new SearchMusicListViewModel(new C615960ODy());
    }

    public static final Object invoke$29(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        String str = BulletinCommentSheetFragment._pnsPageId;
        return new BulletinCommentListViewModel();
    }

    public static final Object invoke$3(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicListArtistCertificationAssem.LLJILJIL;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$30(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SearchMusicTitleAssem.LLJIJIL;
        return new SearchMusicListViewModel(new C615960ODy());
    }

    public static final Object invoke$31(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        int i = BulletinCommentSheetListAssem.LLJILJIL;
        return new BulletinCommentListViewModel();
    }

    public static final Object invoke$32(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        int i = BulletinCommentSheetAssem.LLJILJIL;
        return new BulletinCommentListViewModel();
    }

    public static final Object invoke$33(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellBaseAssem.LLJLILLLLZIIL;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$34(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellBaseAssem.LLJLILLLLZIIL;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$35(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellCollectIconAssem.LLJLLIL;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$36(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellCollectIconAssem.LLJLLIL;
        return new MusicCellCollectIconViewModel();
    }

    public static final Object invoke$37(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellCollectIconAssem.LLJLLIL;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$38(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellCoverAssem.LLJLLIL;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$39(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellHighlightAssem.LLJZ;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$4(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicPlayAssemBase.LLILLL;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$40(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellPinIconAssem.LLJLILLLLZIIL;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$41(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellShootAssem.LLLFF;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$42(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellShootAssem.LLLFF;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$43(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellSimilarSoundsAssem.LLJLLIL;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$44(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        return new C0NAP();
    }

    public static final Object invoke$45(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        int i = BulletinCommentMoreCell.LLJJI;
        return new BulletinCommentListViewModel();
    }

    public static final Object invoke$46(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        int i = BulletinCommentSheetCell.LLJJ;
        return new BulletinCommentListViewModel();
    }

    public static final Object invoke$47(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        String str = ReportDetailsFragmentCompose._pnsPageId;
        return new ReportViewModel(new C0ODG());
    }

    public static final Object invoke$48(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        String str = ReportDetailsFragmentCompose._pnsPageId;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$49(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        String str = ReportListFragmentCompose._pnsPageId;
        return new ReportListViewModel(new C0ODG());
    }

    public static final Object invoke$5(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        C810890VrT c810890VrT = C810890VrT.LIZIZ;
        c810890VrT.LJFF("initPushFully_execute_in_initPushByFlag");
        c810890VrT.LJIIL("initPushFully_execute_in_initPushByFlag");
        PushSheduler.LIZ.execute(new ARunnableS84S0000000_4(12));
        return null;
    }

    public static final Object invoke$50(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        String str = ReportListFragmentCompose._pnsPageId;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$51(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        return Boolean.valueOf(C582130MsN.LIZ().getConfig().getSimPlayerConfig().perfEventEnabled());
    }

    public static final Object invoke$52(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        return Boolean.valueOf(C582130MsN.LIZ().getConfig().getSimPlayerConfig().perfEventEnabledInPlayRequest());
    }

    public static final Object invoke$53(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        String str = BulletinPageFragment._pnsPageId;
        return new BulletinCommentListViewModel();
    }

    public static final Object invoke$6(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(new PushSheduler.InitPushFullyTask());
        c799890VZj.LIZIZ();
        return null;
    }

    public static final Object invoke$7(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        return new C0NEO();
    }

    public static final Object invoke$8(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        ICommonConfig commonConfig;
        ISimKitConfig config = C582130MsN.LIZ().getConfig();
        if (config != null && (commonConfig = config.getCommonConfig()) != null) {
            return commonConfig.getFeedCacheStrategyConfig();
        }
        return null;
    }

    public static final Object invoke$9(AObjectS62S0000000_9 aObjectS62S0000000_9) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HighlightSelectBtnAssem.LLJILJIL;
        return new HighlightSelectListViewModel(new C615860ODo());
    }

    public AObjectS62S0000000_9(BulletinPageFragment bulletinPageFragment, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(BulletinCommentSheetFragment bulletinCommentSheetFragment, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(BulletinCommentSheetAssem bulletinCommentSheetAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(BulletinCommentSheetListAssem bulletinCommentSheetListAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(BulletinCommentMoreCell bulletinCommentMoreCell, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(BulletinCommentSheetCell bulletinCommentSheetCell, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(BulletinBaseCell bulletinBaseCell, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(EllipsisAssem ellipsisAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicHeaderAssem musicHeaderAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicListArtistCertificationAssem musicListArtistCertificationAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicPlayAssemBase musicPlayAssemBase, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(FanSpotlightBlockVideoAssem fanSpotlightBlockVideoAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(FanSpotlightEllipsisAssem fanSpotlightEllipsisAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicFanSpotlightBlockAssem musicFanSpotlightBlockAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicFanSpotlightTitleAssem musicFanSpotlightTitleAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicTitleAssem musicTitleAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicCellBaseAssem musicCellBaseAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicCellCollectIconAssem musicCellCollectIconAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicCellCoverAssem musicCellCoverAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicCellHighlightAssem musicCellHighlightAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicCellPinIconAssem musicCellPinIconAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicCellShootAssem musicCellShootAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicCellSimilarSoundsAssem musicCellSimilarSoundsAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(ReportDetailsFragmentCompose reportDetailsFragmentCompose, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(ReportListFragmentCompose reportListFragmentCompose, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(HighlightSelectBtnAssem highlightSelectBtnAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(HighlightSelectListAssem highlightSelectListAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(HighlightSelectMusicBaseAssem highlightSelectMusicBaseAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(HighlightSelectMusicSelectIconAssem highlightSelectMusicSelectIconAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(HighlightSelectMusicSimilarSoundsAssem highlightSelectMusicSimilarSoundsAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(SearchMusicCellPinIconAssem searchMusicCellPinIconAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(SearchMusicCellSimilarSoundsAssem searchMusicCellSimilarSoundsAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(SearchMusicTitleAssem searchMusicTitleAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(MusicDetailFragment musicDetailFragment, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(StoryMusicCoverAssem storyMusicCoverAssem, int i) {
        this.$t = i;
    }

    public AObjectS62S0000000_9(StoryMusicIgnoreCopyRightCoverAssem storyMusicIgnoreCopyRightCoverAssem, int i) {
        this.$t = i;
    }
}

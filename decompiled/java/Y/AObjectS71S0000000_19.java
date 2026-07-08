package Y;

import X.C06W5;
import X.C1192870h9B;
import X.C1252190igr;
import X.C615950ODx;
import X.InterfaceC2217461Bqa;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.MusicFanSpotlightErrorAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellDetailIconAssem;
import com.ss.android.ugc.aweme.music.search.cell.SearchMusicCellBaseAssem;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.ss.android.ugc.profile.business.profile.menu.ProfilePageMenuFragment;
import com.ss.android.ugc.profile.business.profile.menu.business.content.search.SearchActionComponent;
import com.ss.android.ugc.profile.business.profile.menu.viewmodel.ProfileMenuViewModel;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.ss.android.ugc.profile.business.ur.entrances.ProfileAddFriendsRedPointsVM;
import com.ss.android.ugc.profile.business.ur.entrances.ProfileMafRedPointsVM;
import com.ss.android.ugc.profile.business.ur.follow.UserProfileFollowVM;
import com.ss.android.ugc.profile.business.ur.platform.HeaderRecommendUserCardMineComponent;
import com.ss.android.ugc.profile.business.ur.platform.addfriends.HeaderCTAAddFriendsComponent;
import com.ss.android.ugc.profile.business.ur.platform.follow.HeaderCTAFollowComponent;
import com.ss.android.ugc.profile.business.ur.user.HomepageRecommendVM;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble.ProfileHeaderAdvancedFeatureBaseComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.ProfileHeaderAdvancedFeatureViewModel;
import com.ss.android.ugc.ur.alias.IAliasService;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AObjectS71S0000000_19 implements Function0 {
    public final int $t;

    public static final Object invoke$3(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        return null;
    }

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
            default:
                return null;
        }
    }

    public AObjectS71S0000000_19(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        String str = ProfilePageMenuFragment._pnsPageId;
        return new ProfileMenuViewModel();
    }

    public static final Object invoke$1(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZLLL;
    }

    public static final Object invoke$10(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SearchMusicCellBaseAssem.LLJLIL;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$11(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellDetailIconAssem.LLJLILLLLZIIL;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public static final Object invoke$12(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellDetailIconAssem.LLJLILLLLZIIL;
        return new MusicPlayViewModel();
    }

    public static final Object invoke$13(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        return Unit.LIZ;
    }

    public static final Object invoke$14(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HeaderRecommendUserCardMineComponent.LLJLILLLLZIIL;
        return new HomepageRecommendVM();
    }

    public static final Object invoke$15(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        int i = HeaderCTAAddFriendsComponent.LLLFZ;
        return new ProfileAddFriendsRedPointsVM();
    }

    public static final Object invoke$16(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        int i = HeaderCTAAddFriendsComponent.LLLFZ;
        return new ProfileMafRedPointsVM();
    }

    public static final Object invoke$17(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        IAliasService iAliasService = (IAliasService) PluggableExtentionKt.pluggableSpi(IAliasService.class);
        if (iAliasService != null && iAliasService.LIZLLL()) {
            iAliasService.LJFF();
            return null;
        }
        return null;
    }

    public static final Object invoke$18(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HeaderCTAFollowComponent.LLLIL;
        return new UserProfileFollowVM(new C1252190igr((IUserService) ServiceManager.get().getService(IUserService.class)));
    }

    public static final Object invoke$2(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        return new C06W5(0);
    }

    public static final Object invoke$4(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SearchActionComponent.LLLIIII;
        return new ProfileMenuViewModel();
    }

    public static final Object invoke$5(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        String str = I18nMyProfileFragment._pnsPageId;
        return new ProfilePlatformViewModel();
    }

    public static final Object invoke$7(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ProfileHeaderAdvancedFeatureBaseComponent.LLLLLIL;
        return new ProfileHeaderAdvancedFeatureViewModel();
    }

    public static final Object invoke$8(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HeaderAdvancedFeatureBaseUIComponent.LLLIILIL;
        return new ProfileHeaderAdvancedFeatureViewModel();
    }

    public static final Object invoke$9(AObjectS71S0000000_19 aObjectS71S0000000_19) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicFanSpotlightErrorAssem.LLJLIL;
        return new OriginMusicListViewModel(new C615950ODx());
    }

    public AObjectS71S0000000_19(MusicFanSpotlightErrorAssem musicFanSpotlightErrorAssem, int i) {
        this.$t = i;
    }

    public AObjectS71S0000000_19(MusicCellDetailIconAssem musicCellDetailIconAssem, int i) {
        this.$t = i;
    }

    public AObjectS71S0000000_19(SearchMusicCellBaseAssem searchMusicCellBaseAssem, int i) {
        this.$t = i;
    }

    public AObjectS71S0000000_19(ProfilePageMenuFragment profilePageMenuFragment, int i) {
        this.$t = i;
    }

    public AObjectS71S0000000_19(SearchActionComponent searchActionComponent, int i) {
        this.$t = i;
    }

    public AObjectS71S0000000_19(I18nMyProfileFragment i18nMyProfileFragment, int i) {
        this.$t = i;
    }

    public AObjectS71S0000000_19(HeaderRecommendUserCardMineComponent headerRecommendUserCardMineComponent, int i) {
        this.$t = i;
    }

    public AObjectS71S0000000_19(HeaderCTAAddFriendsComponent headerCTAAddFriendsComponent, int i) {
        this.$t = i;
    }

    public AObjectS71S0000000_19(HeaderCTAFollowComponent headerCTAFollowComponent, int i) {
        this.$t = i;
    }

    public AObjectS71S0000000_19(ProfileHeaderAdvancedFeatureBaseComponent profileHeaderAdvancedFeatureBaseComponent, int i) {
        this.$t = i;
    }

    public AObjectS71S0000000_19(HeaderAdvancedFeatureBaseUIComponent headerAdvancedFeatureBaseUIComponent, int i) {
        this.$t = i;
    }
}

package X;

import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.hashtag.IHashTagService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.moderator.IModeratorService;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.userinfowidget.IUserInfoWidgetService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.message.IMessageService;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Ukn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781270Ukn {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(298));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(330));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(335));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(328));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(326));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(263));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(332));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(337));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(305));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(338));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(309));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(292));
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(296));
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(323));
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(293));
    public static final C01GW LJIILL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(303));
    public static final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(320));
    public static final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(322));
    public static final C01GW LJIJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(295));
    public static final C01GW LJIJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(314));
    public static final C01GW LJIJJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(312));
    public static final C01GW LJIJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(317));
    public static final C01GW LJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(302));
    public static final C01GW LJJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(327));
    public static final C01GW LJJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(311));
    public static final C01GW LJJIFFI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(315));
    public static final C01GW LJJII = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(324));
    public static final C01GW LJJIII = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(313));
    public static final C01GW LJJIIJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(301));
    public static final C01GW LJJIIJZLJL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(299));
    public static final C01GW LJJIIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(294));
    public static final C01GW LJJIIZI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(319));
    public static final C01GW LJJIJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(334));
    public static final C01GW LJJIJIIJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(331));
    public static final C01GW LJJIJIIJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(336));
    public static final C01GW LJJIJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(333));
    public static final C01GW LJJIJL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    public static final C01GW LJJIJLIJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(308));
    public static final C01GW LJJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(307));
    public static final C01GW LJJIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(321));
    public static final C01GW LJJJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(325));
    public static final C01GW LJJJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(304));
    public static final C01GW LJJJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(310));
    public static final C01GW LJJJJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(318));
    public static final C01GW LJJJJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(339));
    public static final C01GW LJJJJIZL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(329));
    public static final C01GW LJJJJJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(306));
    public static final C01GW LJJJJJL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(316));
    public static final C01GW LJJJJL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(297));
    public static final C01GW LJJJJLI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(262));

    public static final IActionHandlerService LIZ() {
        return (IActionHandlerService) LJIILJJIL.getValue();
    }

    public static final IAdminSettingService LIZIZ() {
        return (IAdminSettingService) LJIJ.getValue();
    }

    public static final IBannerService LIZJ() {
        return (IBannerService) LJJIIJZLJL.getValue();
    }

    public static final IBarrageService LIZLLL() {
        return (IBarrageService) LJJIIJ.getValue();
    }

    public static final IBroadcastService LJ() {
        return (IBroadcastService) LJIILL.getValue();
    }

    public static final IBrowserService LJFF() {
        return (IBrowserService) LJIIIIZZ.getValue();
    }

    public static final IEffectService LJI() {
        return (IEffectService) LJIJI.getValue();
    }

    public static final IGiftService LJII() {
        return (IGiftService) LJIILLIIL.getValue();
    }

    public static final IGoodyBagService LJIIIIZZ() {
        return (IGoodyBagService) LJIIZILJ.getValue();
    }

    public static final IHashTagService LJIIIZ() {
        return (IHashTagService) LJJII.getValue();
    }

    public static final IHostAction LJIIJ() {
        return (IHostAction) LJ.getValue();
    }

    public static final IHostAppContext LJIIJJI() {
        return (IHostAppContext) LIZIZ.getValue();
    }

    public static final IHostUser LJIIL() {
        return (IHostUser) LJII.getValue();
    }

    public static final IHybridContainerService LJIILIIL() {
        return (IHybridContainerService) LJJJJI.getValue();
    }

    public static final IInteractService LJIILJJIL() {
        return (IInteractService) LJIIJJI.getValue();
    }

    public static final ILoggerService LJIILL() {
        return (ILoggerService) LJIIL.getValue();
    }

    public static final IMessageService LJIILLIIL() {
        return (IMessageService) LIZ.getValue();
    }

    public static final IModeratorService LJIIZILJ() {
        return (IModeratorService) LJIL.getValue();
    }

    public static final IPcsService LJIJ() {
        return (IPcsService) LJJJI.getValue();
    }

    public static final IPublicScreenService LJIJI() {
        return (IPublicScreenService) LJJIJLIJ.getValue();
    }

    public static final IPullStreamService LJIJJ() {
        return (IPullStreamService) LJIIJ.getValue();
    }

    public static final IRankService LJIJJLI() {
        return (IRankService) LJJIII.getValue();
    }

    public static final IRoomFunctionService LJIL() {
        return (IRoomFunctionService) LJJIFFI.getValue();
    }

    public static final IRoomStickerOuterService LJJ() {
        return (IRoomStickerOuterService) LJIJJLI.getValue();
    }

    public static final IShareService LJJI() {
        return (IShareService) LJJIIZI.getValue();
    }

    public static final IShortTouchService LJJIFFI() {
        return (IShortTouchService) LJJIZ.getValue();
    }

    public static final ISlotService LJJII() {
        return (ISlotService) LJIILIIL.getValue();
    }

    public static final ISubscribeService LJJIII() {
        return (ISubscribeService) LJJJ.getValue();
    }

    public static final IToolbarService LJJIIJ() {
        return (IToolbarService) LJJ.getValue();
    }

    public static final ITreasureBoxService LJJIIJZLJL() {
        return (ITreasureBoxService) LJJJJIZL.getValue();
    }

    public static final ILiveProfileService LJJIIZ() {
        return (ILiveProfileService) LJJIJIIJI.getValue();
    }

    public static final IUserInfoWidgetService LJJIIZI() {
        return (IUserInfoWidgetService) LJJIJIL.getValue();
    }
}

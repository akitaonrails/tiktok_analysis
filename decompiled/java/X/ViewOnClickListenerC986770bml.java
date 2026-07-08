package X;

import Y.AAListenerS324S0100000_13;
import Y.ACListenerS118S0200000_15;
import Y.ACListenerS150S0100000_15;
import Y.ALAdapterS11S0100000_15;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS75S0200000_6;
import Y.ATListenerS448S0100000_15;
import Y.AUListenerS264S0100000_15;
import Y.AfS176S0100000_7;
import Y.AfS184S0100000_15;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import avg.f;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.BattleBottomLayoutShowChannel;
import com.bytedance.android.live.liveinteract.api.CohostGuestListChangeChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayRebindEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchStartAnimationShowing;
import com.bytedance.android.live.liveinteract.api.event.MatchVirtualTicketTrayVisibilityEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleCriticalDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleEnigmaWindowIconEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleHighScoreFormatUpdateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemCoHostWindowIconsPredictedOrder;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemCriticalDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemExtraTimeDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemGuideLayoutShowChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemSmokeDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemSpecialEffectDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateCriticalEffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateEffectEnterAnimationChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateExtraTimeEffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateSmokeEffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateSpecialEffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateTop2EffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateTop3EffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTop2DebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTop3DebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop2DebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop3DebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.MatchWinStreakLowAlphaChannel;
import com.bytedance.android.live.liveinteract.match.business.event.ScoreRevealStateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostAuxStreamMuteEvent;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostWindowViewStateChangeEvent;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiHostGuestWindowHeightEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiHostRefreshAnchorPos;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkRenderCallbackTimeOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostEnableMatchResumeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostAudienceReuseWindowViewSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostWidgetWindowLayoutCacheSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostWindowLayoutCacheDelayInSecondSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostTtsSkipAnchorInfoMarginFix;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWindowUserNameMatchAnimationOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestDisableAlphaChangeForBattleStart;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestOppositeAnchorInfoPosFix;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestWindowRetainMemoryFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.TakeStageWindowBgOutlineExpandSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDropOffSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchScoreTrackSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchItemCardLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeContinueAreaExpandAnchorSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeContinueAreaExpandAudienceSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleFeatureFlags;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS0S0320000_15;
import kotlin.jvm.internal.AwS155S0101000_15;
import kotlin.jvm.internal.AwS157S0101000_17;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import org.json.JSONObject;
import tikcast.linkmic.common.CohostStreamConfig;
import tikcast.linkmic.common.CohostTypeSpotExtra;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0bml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ViewOnClickListenerC986770bml extends ConstraintLayout implements InterfaceC956450azr, View.OnClickListener, C1AXB {
    public static boolean LLZZ;
    public static final int LLZZJLIL;
    public static final int LLZZLLIL;
    public static final float LLZZZIL;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public InterfaceC1085480eLy LLJIJIL;
    public boolean LLJILJIL;
    public C954460awe LLJILJILJ;
    public int LLJILLL;
    public EnumC918810a19 LLJJ;
    public boolean LLJJI;
    public long LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public String LLJJIJIL;
    public int LLJJJ;
    public DataChannel LLJJJIL;
    public Room LLJJJJ;
    public int LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public LinearLayout LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public List<C986810bmp> LLJLL;
    public List<C986810bmp> LLJLLIL;
    public List<C986810bmp> LLJLLL;
    public List<C986810bmp> LLJZ;
    public List<C986810bmp> LLJZIJLIL;
    public final List<C986810bmp> LLL;
    public List<C986810bmp> LLLF;
    public List<C986810bmp> LLLFF;
    public List<C986810bmp> LLLFFI;
    public List<C986810bmp> LLLFZ;
    public List<C986810bmp> LLLI;
    public final List<C986810bmp> LLLII;
    public final Map<ObjectAnimator, String> LLLIIII;
    public final String LLLIIIIL;
    public Pair<? extends SparkContext, Integer> LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C01GW LLLLIL;
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;
    public final C01GW LLLLJI;
    public C985820blE LLLLL;
    public AnimatorSet LLLLLIL;
    public AnimatorSet LLLLLILLIL;
    public AnimatorSet LLLLLJIL;
    public AnimatorSet LLLLLJLJLL;
    public boolean LLLLLL;
    public Long LLLLLLIL;
    public EnumC964170bCJ LLLLLLJ;
    public SparkContext LLLLLLL;
    public final C01GW LLLLLLLLL;
    public final C01GW LLLLLLLLLL;
    public final C01GW LLLLLLLZIL;
    public final C01GW LLLLLLZ;
    public final C01GW LLLLLLZZ;
    public final C01GW LLLLLZ;
    public final C01GW LLLLLZIL;
    public final C01GW LLLLLZL;
    public final C01GW LLLLZ;
    public final C01GW LLLLZI;
    public final C01GW LLLLZIL;
    public final C01GW LLLLZLL;
    public boolean LLLLZLLIL;
    public int LLLLZLLLI;
    public boolean LLLZ;
    public boolean LLLZI;
    public boolean LLLZIIL;
    public InterfaceC1059280dfi LLLZIL;
    public boolean LLLZL;
    public final Map<String, Object> LLLZLL;
    public final GestureDetector LLLZLZ;
    public final C01GW LLLZZ;
    public long LLLZZIL;
    public long LLZ;
    public long LLZIL;
    public Boolean LLZILL;
    public boolean LLZL;
    public boolean LLZLI;
    public float LLZLL;
    public int LLZLLIL;
    public ValueAnimator LLZLLLL;

    static {
        C439101nJ.LIZ(5);
        LLZZJLIL = C439101nJ.LIZ(8);
        C439101nJ.LIZ(24);
        LLZZLLIL = C439101nJ.LIZ(1);
        LLZZZIL = C418440Gaw.LIZIZ(8);
    }

    @Override // X.C1AXB
    public final boolean isEmpty() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DataChannel dataChannel;
        AnimatorSet animatorSet = this.LLLLLILLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLLLLILLIL = null;
        C990400bsc streakVisibilityController = getStreakVisibilityController();
        ValueAnimator valueAnimator = streakVisibilityController.LJI;
        streakVisibilityController.LJI = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("detach from window, linkMicId=");
        sbLIZ.append(getLinkMicId());
        sbLIZ.append(", this = ");
        sbLIZ.append(this);
        C20441214yg.LJ("SmokeTest", C2188811AlT.LIZIZ(sbLIZ));
        if (CohostWithGuestWindowRetainMemoryFixSetting.INSTANCE.isEnabled() && (dataChannel = this.LLJJJIL) != null) {
            dataChannel.zQ2(this);
        }
        C954460awe c954460awe = this.LLJILJILJ;
        if (C948770anT.LJ() && CoHostAudienceReuseWindowViewSetting.enable() && c954460awe != null) {
            boolean z = !LinkCoreModelKt.currentUserIsAnchor();
            boolean z2 = C943590af7.LIZ == 1;
            boolean z3 = C970370bMJ.LJI() && C970370bMJ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("shouldKeepWindowView isAllowedGuestJoin=");
            sbLIZ2.append(z2);
            sbLIZ2.append(", is1vs1MatchInProgress=");
            sbLIZ2.append(z3);
            C20441214yg.LJIIIZ("MultiCoHostWindowManager", C2188811AlT.LIZIZ(sbLIZ2));
            if (z2 && z3 && z) {
                MultiCoHostWindowManager.LJJ.put(c954460awe.LJIIJJI, this);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("checkAndKeepWindowView, added_to_map, linkMicId=");
                sbLIZ3.append(c954460awe.LJIIJJI);
                sbLIZ3.append(", view = ");
                sbLIZ3.append(hashCode());
                C20441214yg.LJIIIZ("MultiCoHostWindowManager", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
        }
        DataChannel dataChannel2 = this.LLJJJIL;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        boolean z4 = SettingsManager.INSTANCE.getBooleanValue("live_match_enlarge_keep_power_up_enable", true) && C915980Zwa.LJFF().QS0();
        if (C970370bMJ.LJIIIIZZ() && !z4) {
            this.LLJLL.clear();
            this.LLJLLIL.clear();
            this.LLJLLL.clear();
            ((ArrayList) this.LLL).clear();
            this.LLJZ.clear();
            this.LLJZIJLIL.clear();
            this.LLLF.clear();
            this.LLLFF.clear();
            this.LLLFFI.clear();
            ((ArrayList) this.LLLII).clear();
            this.LLLFZ.clear();
            this.LLLI.clear();
            this.LLJZ.clear();
            this.LLJZIJLIL.clear();
            if (!this.LLLIIII.isEmpty()) {
                for (Map.Entry entry : ((LinkedHashMap) this.LLLIIII).entrySet()) {
                    ValueAnimator valueAnimator2 = (ValueAnimator) entry.getKey();
                    entry.getValue();
                    valueAnimator2.cancel();
                }
            }
        }
        DataChannel dataChannel3 = this.LLJJJIL;
        if (dataChannel3 != null) {
            dataChannel3.LC0(MultiCoHostWindowViewStateChangeEvent.class, new C970900bNA(this, false));
        }
        if (this.LLJJIJIIJIL || !CoHostWidgetWindowLayoutCacheSetting.INSTANCE.isEnableWindowView()) {
            return;
        }
        C158G c158g = C158G.LL;
        C158G.LIZLLL(getContext(), "CoHostWindowViewLayout", this, 0L, CoHostWindowLayoutCacheDelayInSecondSetting.INSTANCE.getCacheDelayInSecond(), 8);
    }

    private final C16F5 getCrossArcTestTv() {
        return (C16F5) this.LLJI.getValue();
    }

    private final String getCurrentRoomAnchorDisplayName() {
        Room room;
        DataChannel dataChannel = this.LLJJJIL;
        String strLIZ = C0KVU.LIZ((dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? null : room.getOwner());
        return strLIZ == null ? "" : strLIZ;
    }

    private final C498540Jgq getIvTeamMatePowerUpSender() {
        return (C498540Jgq) this.LLJLIL.getValue();
    }

    private final int getPowerUpInsertIndex() {
        int i;
        Iterator<View> it2 = new C09RD(this.LLJJLIIIJLLLLLLLZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            View next = it2.next();
            if (Intrinsics.LJFF(next.getTag(), "enigma_side_icon")) {
                i = next != null ? 1 : 0;
            }
        }
        return this.LLJJLIIIJLLLLLLLZ.getChildCount() - i;
    }

    private final C941290abP getRippleHandler() {
        return (C941290abP) this.LLJ.getValue();
    }

    private final C990400bsc getStreakVisibilityController() {
        return (C990400bsc) this.LLLL.getValue();
    }

    private final View getTakeStageMarqueeContainer() {
        return (View) this.LLLLZI.getValue();
    }

    private final C1086750eO1 getTakeStageMarqueeTextView() {
        return (C1086750eO1) this.LLLLZIL.getValue();
    }

    private final View getTakeTheStageBottomShadowViewV2() {
        return (View) this.LLLLZ.getValue();
    }

    private final View getTakeTheStageLayout() {
        return (View) this.LLLLLLLLLL.getValue();
    }

    private final C994580bzM getTakeTheStageNextTurn() {
        return (C994580bzM) this.LLLLLZL.getValue();
    }

    private final View getTakeTheStageRankCrownImageView() {
        return (View) this.LLLLLZ.getValue();
    }

    private final ViewGroup getTakeTheStageRankLayout() {
        return (ViewGroup) this.LLLLLLLZIL.getValue();
    }

    private final View getTakeTheStageRankNoGiftImageView() {
        return (View) this.LLLLLLZZ.getValue();
    }

    private final C16F5 getTakeTheStageRankText() {
        return (C16F5) this.LLLLLLZ.getValue();
    }

    private final C2267791DpZ getTeamScoreVisibilityController() {
        return (C2267791DpZ) this.LLLLII.getValue();
    }

    private final C16F5 getTvTeamMatePowerUpEnter() {
        return (C16F5) this.LLJLILLLLZIIL.getValue();
    }

    private final View getViewCompactTag() {
        return (View) this.LLLLZLL.getValue();
    }

    private final View getViewContainerBg() {
        return (View) this.LLILZ.getValue();
    }

    private final View getViewContainerClickView() {
        return (View) this.LLILLL.getValue();
    }

    private final C16F5 getViewDisplayId() {
        return (C16F5) this.LLLLIIL.getValue();
    }

    private final C16FZ getViewLoading() {
        return (C16FZ) this.LLILZIL.getValue();
    }

    private final AppCompatImageView getViewMuteAudienceStatus() {
        return (AppCompatImageView) this.LLLLIIIILLL.getValue();
    }

    private final C956430azp getViewPauseContainer() {
        return (C956430azp) this.LLILZLL.getValue();
    }

    private final C1851760yHu getViewStartAnim() {
        return (C1851760yHu) this.LLLJIL.getValue();
    }

    private final View getViewVolumeBorder() {
        return (View) this.LLIZ.getValue();
    }

    private final C1091250eVH getWindowRoot() {
        return (C1091250eVH) this.LL.getValue();
    }

    public final boolean B0() {
        LinearLayout linearLayout;
        DataChannel dataChannel = this.LLJJJIL;
        if ((dataChannel != null ? dataChannel.gg0(BattleSmokeDebuffChannel.class) : null) != EnumC919030a1V.EFFECTING || (linearLayout = this.LLJJLIIIJLLLLLLLZ) == null || linearLayout.getChildCount() <= 0) {
            return false;
        }
        Iterator<View> it2 = new C09RD(this.LLJJLIIIJLLLLLLLZ).iterator();
        while (it2.hasNext()) {
            View next = it2.next();
            if (Intrinsics.LJFF(next.getTag(), "smoke_debuff")) {
                return next != null;
            }
        }
        return false;
    }

    public final boolean C0() {
        LinearLayout linearLayout;
        DataChannel dataChannel = this.LLJJJIL;
        if ((dataChannel != null ? dataChannel.gg0(BattleTop2DebuffChannel.class) : null) != EnumC919030a1V.EFFECTING || (linearLayout = this.LLJJLIIIJLLLLLLLZ) == null || linearLayout.getChildCount() <= 0) {
            return false;
        }
        Iterator<View> it2 = new C09RD(this.LLJJLIIIJLLLLLLLZ).iterator();
        while (it2.hasNext()) {
            View next = it2.next();
            if (Intrinsics.LJFF(next.getTag(), "top2_debuff")) {
                return next != null;
            }
        }
        return false;
    }

    public final View C1() {
        C20441214yg.LJIIIZ("CoHostWindowView", "top2 rival debuff container ");
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ht2, this.LLJJLIIIJLLLLLLLZ, false);
        viewTd.setTag("team_mate_top2_buff");
        C500260Jjc.LJIILIIL(viewTd);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        if (progressBar != null) {
            progressBar.setMax(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        this.LLJJLIIIJLLLLLLLZ.addView(viewTd, getPowerUpInsertIndex(), new C19ME(-1, -1));
        return viewTd;
    }

    public final boolean E0() {
        LinearLayout linearLayout;
        DataChannel dataChannel = this.LLJJJIL;
        if ((dataChannel != null ? dataChannel.gg0(BattleTop3DebuffChannel.class) : null) != EnumC919030a1V.EFFECTING || (linearLayout = this.LLJJLIIIJLLLLLLLZ) == null || linearLayout.getChildCount() <= 0) {
            return false;
        }
        Iterator<View> it2 = new C09RD(this.LLJJLIIIJLLLLLLLZ).iterator();
        while (it2.hasNext()) {
            View next = it2.next();
            if (Intrinsics.LJFF(next.getTag(), "top3_debuff")) {
                return next != null;
            }
        }
        return false;
    }

    public final void F0() {
        View view;
        C19ME c19me;
        C19ME c19me2;
        if (this.LLZLI) {
            return;
        }
        Object parent = getHostScoreLayout().getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) c19me).width = -2;
        c19me.constrainedWidth = false;
        c19me.rightToLeft = -1;
        c19me.endToStart = -1;
        C786410Ut5.W5(view, c19me);
        ViewGroup.LayoutParams layoutParams2 = getViewAnchorInfo().getLayoutParams();
        if (!(layoutParams2 instanceof C19ME) || (c19me2 = (C19ME) layoutParams2) == null) {
            return;
        }
        this.LLZLL = c19me2.matchConstraintPercentWidth;
        c19me2.matchConstraintPercentWidth = 1.0f;
        c19me2.leftToRight = view.getId();
        c19me2.startToEnd = -1;
        C786410Ut5.W5(getViewAnchorInfo(), c19me2);
        this.LLZLI = true;
    }

    public final View I0() {
        View next;
        Iterator<View> it2 = new C09RD(this.LLJJLIIIJLLLLLLLZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(next.getTag(), "special_effect_debuff")) {
                break;
            }
        }
        return next;
    }

    public final boolean O0() {
        Room room;
        DataChannel dataChannel = this.LLJJJIL;
        Long lValueOf = (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? null : Long.valueOf(room.getOwnerUserId());
        C954460awe c954460awe = this.LLJILJILJ;
        return c954460awe != null && c954460awe.LJIIIZ(lValueOf);
    }

    public final boolean P0() {
        C954460awe c954460awe = this.LLJILJILJ;
        return (c954460awe != null && c954460awe.LJI()) || O0();
    }

    public final boolean Q1() {
        boolean z;
        if (LiveMatchDropOffSetting.INSTANCE.isEnable() && C970370bMJ.LJIIIZ() && !S0()) {
            z = true;
            w2(8);
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldNotShowHostScoreAndHide: shouldNowShow ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public final void g1() {
        this.LLLZZIL = 0L;
        this.LLZ = 0L;
        this.LLZIL = 0L;
        this.LLZILL = null;
        this.LLZL = false;
        AnimatorSet animatorSet = this.LLLLLILLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLLLLILLIL = null;
        View viewFindViewById = getHostScoreLayout().findViewById(R.id.h6f);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View viewFindViewById2 = getHostScoreLayout().findViewById(R.id.h64);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View viewFindViewById3 = getHostScoreLayout().findViewById(R.id.h6g);
        if (viewFindViewById3 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
            C786410Ut5.T4(viewFindViewById3, 0.0f);
        }
        k1();
        getStreakVisibilityController().LIZLLL(C989030bqP.LIZ);
        C500260Jjc.LLFFF(getLnRivalPowerUpsNew());
        C500260Jjc.LJIILIIL(getTeamMatePowerUpEnterLayout());
        w2(8);
        getTeamScoreVisibilityController().LIZLLL(C2267901Dpk.LIZ);
        View viewFindViewById4 = getHostScoreLayout().findViewById(R.id.i9b);
        if (viewFindViewById4 != null) {
            C500260Jjc.LJIILIIL(viewFindViewById4);
        }
        C1324720kZq c1324720kZq = (C1324720kZq) getHostScoreLayout().findViewById(R.id.u22);
        C786410Ut5.h5(c1324720kZq, 1.0f);
        C500260Jjc.LLFFF(c1324720kZq);
        setRankBgLayoutWidth(22.0f);
        this.LLJLL.clear();
        this.LLJLLIL.clear();
        this.LLJLLL.clear();
        ((ArrayList) this.LLL).clear();
        this.LLJZ.clear();
        this.LLJZIJLIL.clear();
        this.LLLF.clear();
        this.LLLFF.clear();
        this.LLLFFI.clear();
        ((ArrayList) this.LLLII).clear();
        this.LLLFZ.clear();
        this.LLLI.clear();
        ((LinkedHashMap) this.LLLIIII).clear();
        this.LLLIIIL = null;
        this.LLLLL = new C985820blE(false, 0L);
        C962250b9D.LIZJ(this.LLLLLIL);
        this.LLLLLIL = null;
        C962250b9D.LIZJ(this.LLLLLJIL);
        this.LLLLLJIL = null;
        C962250b9D.LIZJ(this.LLLLLJLJLL);
        this.LLLLLJLJLL = null;
        this.LLLLLL = false;
        this.LLLLLLIL = null;
        this.LLLLLLJ = EnumC964170bCJ.NONE;
        C1811700xFI matchLayoutCoordinator = getMatchLayoutCoordinator();
        matchLayoutCoordinator.getClass();
        C20441214yg.LIZIZ("CoHostWindowMatchLayoutCoordinator", "onResetMatch");
        List<InterfaceC1811720xFK> list = matchLayoutCoordinator.LIZLLL;
        ArrayList<InterfaceC1811770xFP> arrayList = new ArrayList();
        for (InterfaceC1811720xFK interfaceC1811720xFK : list) {
            if (interfaceC1811720xFK instanceof InterfaceC1811770xFP) {
                arrayList.add(interfaceC1811720xFK);
            }
        }
        for (InterfaceC1811770xFP interfaceC1811770xFP : arrayList) {
            try {
                interfaceC1811770xFP.reset();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C1811700xFI.LIZIZ(interfaceC1811770xFP));
                sbLIZ.append(" reset failed");
                C20441214yg.LJFF("CoHostWindowMatchLayoutCoordinator", C2188811AlT.LIZIZ(sbLIZ), th);
            }
        }
    }

    public final C2267781DpY getAnchorInfoVisibilityController() {
        return (C2267781DpY) this.LLLLILI.getValue();
    }

    public final ScaleGestureDetector getContainerScaleDetector() {
        return (ScaleGestureDetector) this.LLLZZ.getValue();
    }

    public final View getEnlargeTeamScore() {
        return (View) this.LLLILZLLLI.getValue();
    }

    public final LinearLayout getHostScoreLayout() {
        return (LinearLayout) this.LLLIL.getValue();
    }

    public final LinearLayout getHostScoreLayoutContainer() {
        return (LinearLayout) this.LLLILZ.getValue();
    }

    public final LinearLayout getLnRivalPowerUpsNew() {
        return (LinearLayout) this.LLJJJJLIIL.getValue();
    }

    public final View getLoseStreakIcon() {
        return (View) this.LLLJL.getValue();
    }

    public final C1811700xFI getMatchLayoutCoordinator() {
        return (C1811700xFI) this.LLLJ.getValue();
    }

    public final C1121720fIQ getNewWinningStreakIcon() {
        return (C1121720fIQ) this.LLLIIL.getValue();
    }

    public final ConstraintLayout getProfileContainer() {
        return (ConstraintLayout) this.LLIZLLLIL.getValue();
    }

    public final C973130bQl getRankBadge() {
        return (C973130bQl) this.LLLIILIL.getValue();
    }

    public final C21578619ce getRivalPowerUpScrollNew() {
        return (C21578619ce) this.LLJJL.getValue();
    }

    public final C16F5 getTakeTheStageScoreText() {
        return (C16F5) this.LLLLLZIL.getValue();
    }

    public final AppCompatImageView getTakeTheStageTopLeftMuteStatusView() {
        return (AppCompatImageView) this.LLLLLLLLL.getValue();
    }

    public final LinearLayout getTeamMatePowerUpEnterLayout() {
        return (LinearLayout) this.LLJL.getValue();
    }

    public final C1324720kZq getTeamScoreIv() {
        return (C1324720kZq) this.LLLILZJ.getValue();
    }

    @Override // X.C1AXB
    public Long getUid() {
        C954460awe c954460awe = this.LLJILJILJ;
        if (c954460awe != null) {
            return Long.valueOf(c954460awe.LJ);
        }
        return null;
    }

    public final View getViewAnchorInfo() {
        return (View) this.LLLLIILLL.getValue();
    }

    public final View getViewAnchorLynxPlaceholder() {
        return (View) this.LLLLIL.getValue();
    }

    public final ConstraintLayout getViewContainerRoot() {
        return (ConstraintLayout) this.LLILLJJLI.getValue();
    }

    public final AppCompatImageView getViewFollowStatus() {
        return (AppCompatImageView) this.LLLLIILL.getValue();
    }

    public final View getViewScreenShareInfo() {
        return (View) this.LLLLJI.getValue();
    }

    public final C427330GpH getViewScreenShareText() {
        return (C427330GpH) this.LLLLJ.getValue();
    }

    public final View getVirtualTicketSpace() {
        return (View) this.LLLIZZ.getValue();
    }

    public final void h1() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        C20441214yg.LJIIIZ("CoHostWindowView", "resetTakeStageView");
        this.LLLLZLLIL = false;
        this.LLLLZLLLI = -1;
        C500260Jjc.LJIILIIL(getTakeTheStageTopLeftMuteStatusView());
        C500260Jjc.LJIILIIL(getTakeTheStageLayout());
        C994580bzM takeTheStageNextTurn = getTakeTheStageNextTurn();
        if (takeTheStageNextTurn != null) {
            takeTheStageNextTurn.setCountdown(null);
        }
        C994580bzM takeTheStageNextTurn2 = getTakeTheStageNextTurn();
        if (takeTheStageNextTurn2 != null) {
            C500260Jjc.LJIILIIL(takeTheStageNextTurn2);
        }
        View takeStageMarqueeContainer = getTakeStageMarqueeContainer();
        if (takeStageMarqueeContainer != null) {
            C500260Jjc.LJIILIIL(takeStageMarqueeContainer);
        }
        C1086750eO1 takeStageMarqueeTextView = getTakeStageMarqueeTextView();
        if (takeStageMarqueeTextView != null) {
            C500260Jjc.LJIILIIL(takeStageMarqueeTextView);
        }
        h0(false);
        C500260Jjc.LJIILIIL(getTakeTheStageBottomShadowViewV2());
        View takeTheStageRankCrownImageView = getTakeTheStageRankCrownImageView();
        if (takeTheStageRankCrownImageView != null) {
            C500260Jjc.LJIILIIL(takeTheStageRankCrownImageView);
        }
        C16F5 takeTheStageRankText = getTakeTheStageRankText();
        if (takeTheStageRankText != null) {
            takeTheStageRankText.setText("");
        }
        C16F5 takeTheStageScoreText = getTakeTheStageScoreText();
        if (takeTheStageScoreText != null) {
            takeTheStageScoreText.setText("");
        }
        setBackgroundDrawable(null);
        InterfaceC1059280dfi interfaceC1059280dfi = this.LLLZIL;
        if (interfaceC1059280dfi != null) {
            interfaceC1059280dfi.close();
        }
        this.LLLZIL = null;
        SparkContext sparkContext = this.LLLLLLL;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        this.LLLLLLL = null;
        this.LLLZ = false;
        this.LLLZI = false;
        e1();
        A2(this, 3, 0, true, 2);
        A2(this, 4, 0, true, 2);
        I2(this, 0, true, 1);
    }

    public final void j0() {
        C20441214yg.LIZIZ("CoHostWindowView", "battleEnd");
        C19MB c19mb = new C19MB();
        c19mb.LJII((ConstraintLayout) findViewById(R.id.dvs));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetCoHostViewWhenMatchEnd, margin bottom = ");
        int i = LLZZJLIL;
        sbLIZ.append(i);
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        c19mb.LJJIIJZLJL(R.id.i2t, 4, M0("resetCoHostViewWhenMatchEnd"));
        c19mb.LJJIIJZLJL(R.id.i2t, 7, i);
        c19mb.LIZIZ(getViewContainerRoot());
        C20441214yg.LJIIIZ("MultiCoHostWindowManager", "onMatchEnd, clear keepWindowViewsMap");
        ((LinkedHashMap) MultiCoHostWindowManager.LJJ).clear();
        LLZZ = false;
        if (CoHostWidgetWindowLayoutCacheSetting.INSTANCE.isEnableWindowView()) {
            g1();
            return;
        }
        this.LLLLLL = false;
        getStreakVisibilityController().LIZLLL(C989030bqP.LIZ);
        AnimatorSet animatorSet = this.LLLLLIL;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LLLLLIL;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            this.LLLLLIL = null;
        }
        w2(8);
        setRankBgLayoutWidth(22.0f);
        z0();
        this.LLLZZIL = 0L;
        this.LLZ = 0L;
    }

    public final void k1() {
        View view;
        C19ME c19me;
        C19ME c19me2;
        if (this.LLZLI) {
            Object parent = getHostScoreLayout().getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
                return;
            }
            ((ViewGroup.MarginLayoutParams) c19me).width = 0;
            c19me.constrainedWidth = true;
            c19me.rightToLeft = getViewAnchorInfo().getId();
            C786410Ut5.W5(view, c19me);
            if (this.LLZLL >= 0.0f) {
                ViewGroup.LayoutParams layoutParams2 = getViewAnchorInfo().getLayoutParams();
                if (!(layoutParams2 instanceof C19ME) || (c19me2 = (C19ME) layoutParams2) == null) {
                    return;
                }
                c19me2.matchConstraintPercentWidth = this.LLZLL;
                c19me2.leftToRight = view.getId();
                C786410Ut5.W5(getViewAnchorInfo(), c19me2);
            }
            this.LLZLI = false;
        }
    }

    public final void m2() {
        if (this.LLLLZLLIL) {
            if (this.LLLLZLLLI == 0 || P0()) {
                getAnchorInfoVisibilityController().LIZLLL(C2267841Dpe.LIZ);
                return;
            } else {
                getAnchorInfoVisibilityController().LIZLLL(C2267861Dpg.LIZ);
                s0(1.0f);
                return;
            }
        }
        if (P0()) {
            getAnchorInfoVisibilityController().LIZLLL(C2267841Dpe.LIZ);
            return;
        }
        C20441214yg.LIZIZ("CoHostWindowView", "updateAnchorInfo, setVisibility True");
        getAnchorInfoVisibilityController().LIZLLL(C2267861Dpg.LIZ);
        HandlerHook.viewPost(this, new Runnable() { // from class: X.0b2Z
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CoHostWindowView@cc83.updateAnchorInfo$1");
                try {
                    Map<String, Boolean> map = C958110b2X.LIZ;
                    C958110b2X.LJIILL(EnumC958120b2Y.CO_HOST_ANCHOR_INFO);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CoHostWindowView@cc83.updateAnchorInfo$1");
            }
        });
    }

    public final void n2() {
        if (CohostWithGuestOppositeAnchorInfoPosFix.INSTANCE.isEnabled()) {
            if (CohostTtsSkipAnchorInfoMarginFix.INSTANCE.isEnabled() && this.LLLLZLLIL) {
                C20441214yg.LIZIZ("CoHostWindowView", "updateAnchorInfoMarginForHostWithGuestMode, skip during TakeTheStage performing");
                return;
            }
            List<C936770aU7> listLJJIIJZLJL = C915980Zwa.LJII().LJJIIJZLJL();
            boolean z = false;
            if (!(listLJJIIJZLJL instanceof Collection) || !listLJJIIJZLJL.isEmpty()) {
                Iterator<C936770aU7> it2 = listLJJIIJZLJL.iterator();
                while (it2.hasNext()) {
                    Long l = it2.next().LIZIZ;
                    long jLIZLLL = C950220apo.LIZLLL();
                    if (l == null || l.longValue() != jLIZLLL) {
                        z = true;
                        break;
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateAnchorInfoMarginForHostWithGuestMode, hasOppositeRoomGuest = ");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
            o2(C963580bBM.LIZ() ? M0("updateAnchorInfoMarginForHostWithGuestMode") : z ? this.LLJJJJJIL : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        }
    }

    public final void p2() {
        Long lValueOf;
        if (this.LLJILJILJ == null) {
            return;
        }
        if (this.LLJJIJIIJIL || !O0()) {
            C954460awe c954460awe = this.LLJILJILJ;
            if (c954460awe == null || !c954460awe.LJI()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateFollowStatus id=");
                C954460awe c954460awe2 = this.LLJILJILJ;
                sbLIZ.append(c954460awe2 != null ? Long.valueOf(c954460awe2.LJ) : null);
                sbLIZ.append(" followStatus=");
                C954460awe c954460awe3 = this.LLJILJILJ;
                sbLIZ.append(c954460awe3 != null ? Long.valueOf(c954460awe3.LJIJJLI) : null);
                C20441214yg.LJIIIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
                C954460awe c954460awe4 = this.LLJILJILJ;
                if (c954460awe4 != null && (lValueOf = Long.valueOf(c954460awe4.LJIJJLI)) != null) {
                    if (lValueOf.longValue() == -1) {
                        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                        C954460awe c954460awe5 = this.LLJILJILJ;
                        interfaceC500940JkiUser.LJ(c954460awe5 != null ? c954460awe5.LJ : 0L, "CoHostWindowView_updateFollowStatus", "coHostWindow_updateFollowStatus").LJJIIZ(new AfS176S0100000_7(this, 186), new C09JN() { // from class: X.00L5
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("CoHostWindowView@cc83.updateFollowStatus$2");
                                C1C7U.LIZIZ("CoHostWindowView@cc83.updateFollowStatus$2");
                            }
                        });
                        return;
                    } else if (lValueOf.longValue() == 1 || lValueOf.longValue() == 2) {
                        C500260Jjc.LJLJLJ(getViewFollowStatus(), false);
                        return;
                    }
                }
                C500260Jjc.LJLJLJ(getViewFollowStatus(), true);
            }
        }
    }

    public final void z0() {
        SparkContext first;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        Pair<? extends SparkContext, Integer> pair = this.LLLIIIL;
        if (pair != null && (first = pair.getFirst()) != null && (interfaceC1059280dfiLJJIJLIJ = first.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        this.LLLIIIL = null;
    }

    public static boolean S0() {
        return C986680bmc.LIZ() instanceof C986690bmd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    private final int getCurrentHostOrder() {
        ?? arrayList;
        Object next;
        CohostTypeSpotExtra cohostTypeSpotExtra;
        Integer numValueOf;
        C956040azC c956040azCLJI;
        List<C955080axe> list;
        int i = 0;
        if (S0()) {
            C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
            if (c955010axXI30 == null || (c956040azCLJI = c955010axXI30.LJI()) == null || (list = c956040azCLJI.LIZ) == null) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList();
                for (C955080axe c955080axe : list) {
                    if (c955080axe.LJII == 1) {
                        arrayList.add(c955080axe);
                    }
                }
            }
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CohostTypeSpotExtra cohostTypeSpotExtra2 = ((C955080axe) it2.next()).LJIILJJIL;
                    if (cohostTypeSpotExtra2 != null && cohostTypeSpotExtra2.preEnlargeSpotId != 0) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            if (Intrinsics.LJFF(((C955080axe) next).LJIIIIZZ, getLinkMicId())) {
                                break;
                            }
                        }
                        C955080axe c955080axe2 = (C955080axe) next;
                        if (c955080axe2 != null && (cohostTypeSpotExtra = c955080axe2.LJIILJJIL) != null && (numValueOf = Integer.valueOf(cohostTypeSpotExtra.preEnlargeSpotId)) != null) {
                            return numValueOf.intValue() - 1;
                        }
                    }
                }
            }
        }
        List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
        StringBuilder sb = new StringBuilder("getCurrentHostOrder, sortedHostList size=");
        sb.append(listLJJLI.size());
        sb.append(", sortedHostList=");
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLI, 10));
        Iterator<C954460awe> it4 = listLJJLI.iterator();
        while (it4.hasNext()) {
            arrayList2.add(it4.next().LJIIJJI);
        }
        sb.append(arrayList2);
        C20441214yg.LIZIZ("CoHostWindowView", sb.toString());
        Iterator<C954460awe> it5 = listLJJLI.iterator();
        while (it5.hasNext()) {
            if (Intrinsics.LJFF(it5.next().LJIIJJI, getLinkMicId())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final int getCurrentWindowCnt() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList();
        for (C954460awe c954460awe : listLLILZLL) {
            C954460awe c954460awe2 = c954460awe;
            if (C963580bBM.LIZ()) {
                C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
                if (c955010axXI30 != null && c955010axXI30.LJIIJ(c954460awe2.LJIIJJI) != null) {
                    arrayList.add(c954460awe);
                }
            } else {
                InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                if (interfaceC954180awCLJIIIZ != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL()) != null && interfaceC937900aVwLLIIJLIL.LJI(c954460awe2.LJIIJJI) != null) {
                    arrayList.add(c954460awe);
                }
            }
        }
        return arrayList.size();
    }

    public final View B1() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ht2, this.LLJJLIIIJLLLLLLLZ, false);
        viewTd.setTag("team_mate_special_effect_buff");
        C500260Jjc.LJIILIIL(viewTd);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        if (progressBar != null) {
            progressBar.setMax(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        this.LLJJLIIIJLLLLLLLZ.addView(viewTd, getPowerUpInsertIndex(), new C19ME(-1, -1));
        return viewTd;
    }

    public final View D1() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ht2, this.LLJJLIIIJLLLLLLLZ, false);
        viewTd.setTag("team_mate_top3_buff");
        C500260Jjc.LJIILIIL(viewTd);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        if (progressBar != null) {
            progressBar.setMax(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        this.LLJJLIIIJLLLLLLLZ.addView(viewTd, getPowerUpInsertIndex(), new C19ME(-1, -1));
        return viewTd;
    }

    public final View F1() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ht2, this.LLJJLIIIJLLLLLLLZ, false);
        viewTd.setTag("top2_debuff");
        C500260Jjc.LJIILIIL(viewTd);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        if (progressBar != null) {
            progressBar.setMax(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        this.LLJJLIIIJLLLLLLLZ.addView(viewTd, getPowerUpInsertIndex(), new C19ME(-1, -1));
        return viewTd;
    }

    public final View H1() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ht2, this.LLJJLIIIJLLLLLLLZ, false);
        viewTd.setTag("top3_debuff");
        C500260Jjc.LJIILIIL(viewTd);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        if (progressBar != null) {
            progressBar.setMax(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        this.LLJJLIIIJLLLLLLLZ.addView(viewTd, getPowerUpInsertIndex(), new C19ME(-1, -1));
        return viewTd;
    }

    public final void LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showLoading, isPauseUIShowing=");
        sbLIZ.append(false);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(getLinkMicId());
        sbLIZ.append(", uiPos = ");
        sbLIZ.append(getUiPos());
        sbLIZ.append("， isRoomOwnerWindow=");
        sbLIZ.append(this.LLJJIJI);
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJIJI && C963580bBM.LIZ()) {
            return;
        }
        C20441214yg.LIZIZ("CoHostWindowView", "showLoading, show");
        C786410Ut5.LJLLLLLL(0, getViewContainerBg());
        C786410Ut5.LLLIZZ(getViewLoading(), 0);
        C956430azp viewPauseContainer = getViewPauseContainer();
        C954240awI c954240awI = new C954240awI(EnumC956410azn.PULLING_STREAM, getLinkMicId());
        boolean z = this.LLJJIJIIJIL;
        int i = C956430azp.LLJILJILJ;
        viewPauseContainer.LJFF(c954240awI, z, null);
    }

    public final boolean N0() {
        if (C915980Zwa.LJII().LJIILJJIL().contains(getLinkMicId()) || P0()) {
            return true;
        }
        C915980Zwa.LJII().jn1();
        return false;
    }

    public final void O2() {
        if (C951960asc.LIZIZ()) {
            C500260Jjc.LJLJLJ(getViewContainerClickView(), true);
            return;
        }
        C954460awe c954460awe = this.LLJILJILJ;
        if (c954460awe == null || !c954460awe.LJI()) {
            C500260Jjc.LJLJLJ(getViewContainerClickView(), true);
            return;
        }
        int i = this.LLLLZLLLI;
        if (i < 0) {
            C500260Jjc.LJLJLJ(getViewContainerClickView(), false);
        } else if (i == 0 && this.LLJJIJIIJIL) {
            C500260Jjc.LJLJLJ(getViewContainerClickView(), false);
        } else {
            C500260Jjc.LJLJLJ(getViewContainerClickView(), true);
        }
    }

    public final void R1() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.nbe);
        C500260Jjc.LLFFF(viewGroup);
        C786410Ut5.R4(0.0f, viewGroup);
        viewGroup.animate().alpha(1.0f).setDuration(250L).start();
        C1143680frq.LIZLLL(findViewById(R.id.laz), "tiktok_live_interaction_demand_10", "ttlive_catch_beans_guide_tip.webp");
        Handler handler = getHandler();
        if (handler != null) {
            C786410Ut5.LJLIIL(2250L, handler, new ARunnableS106S0100000_6((Object) viewGroup, 23));
        }
    }

    public final void S1() {
        View next;
        V0();
        Iterator<View> it2 = new C09RD(this.LLJJLIIIJLLLLLLLZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.LJFF(next.getTag(), "enigma_side_icon")) {
                    break;
                }
            }
        }
        if (next != null) {
            if (this.LLJJLIIIJLLLLLLLZ.getVisibility() != 0) {
                C500260Jjc.LLFFF(this.LLJJLIIIJLLLLLLLZ);
                return;
            }
            return;
        }
        View view = new View(getContext());
        C1143680frq.LIZLLL(view, "tiktok_live_interaction_demand_23", "ttlive_icon_cohost_window_enigma.png");
        C786410Ut5.I7(new ACListenerS118S0200000_15(view, this, 30), view);
        view.setTag("enigma_side_icon");
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        marginLayoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        this.LLJJLIIIJLLLLLLLZ.addView(view, marginLayoutParams);
        C500260Jjc.LLFFF(this.LLJJLIIIJLLLLLLLZ);
        LLZZ = true;
    }

    public final void T1() {
        C954460awe c954460awe;
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        List<C976800bWg> list;
        if (p0() && (c954460awe = this.LLJILJILJ) != null) {
            long j = c954460awe.LJ;
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 == null || (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) == null || (value = mutableLiveDataLJJJJIZL.getValue()) == null || value.isEmpty()) {
                return;
            }
            for (C976480bWA c976480bWA : value) {
                if (c976480bWA.LIZJ > 0 && (list = c976480bWA.LJFF) != null && !list.isEmpty()) {
                    Iterator<C976800bWg> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().LIZ == j) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("syncEnigmaSideIcon: adding enigma side icon for uid=");
                            sbLIZ.append(j);
                            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
                            S1();
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void U1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showLinked, isPauseUIShowing=");
        sbLIZ.append(false);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(getLinkMicId());
        sbLIZ.append(", uiPos = ");
        sbLIZ.append(getUiPos());
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLLLLLL(8, getViewContainerBg());
        C786410Ut5.LLLIZZ(getViewLoading(), 8);
        C956430azp viewPauseContainer = getViewPauseContainer();
        C954240awI c954240awI = new C954240awI(EnumC956410azn.NORMAL, getLinkMicId());
        boolean z = this.LLJJIJIIJIL;
        int i = C956430azp.LLJILJILJ;
        viewPauseContainer.LJFF(c954240awI, z, null);
    }

    public final boolean V0() {
        List<TeamUsersInfo> listLJJJ;
        User owner;
        if (!C970370bMJ.LJIIIIZZ()) {
            Long uid = getUid();
            Room room = this.LLJJJJ;
            return Intrinsics.LJFF(uid, (room == null || (owner = room.getOwner()) == null) ? null : Long.valueOf(owner.getId()));
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 == null || (listLJJJ = interfaceC973730bRjYf2.LJJJ()) == null || listLJJJ.isEmpty()) {
            return false;
        }
        Iterator<TeamUsersInfo> it2 = listLJJJ.iterator();
        while (it2.hasNext()) {
            if (it2.next().userIds.containsAll(C1697810uHb.LJIIJJI(getUid(), C930540aK4.LJIIZILJ()))) {
                return true;
            }
        }
        return false;
    }

    public final void e1() {
        C754570Tip c754570Tip;
        C754570Tip c754570Tip2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C954460awe c954460awe = this.LLJILJILJ;
        String str = null;
        sbLIZ.append((c954460awe == null || (c754570Tip2 = c954460awe.LJIJJ) == null) ? null : c754570Tip2.LIZIZ);
        sbLIZ.append(" resetAnchorInfoAndMuteIconForTakeTheStage start");
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLLZIIL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            C954460awe c954460awe2 = this.LLJILJILJ;
            if (c954460awe2 != null && (c754570Tip = c954460awe2.LJIJJ) != null) {
                str = c754570Tip.LIZIZ;
            }
            sbLIZ2.append(str);
            sbLIZ2.append(" resetAnchorInfoAndMuteIconForTakeTheStage takeTheStageConfigConstraintSet==false");
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLLZIIL = false;
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.dvs);
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJIIIZ(getViewAnchorInfo().getId(), 1, R.id.mbg, 2, C439101nJ.LIZ(4));
            c19mb.LJI(R.id.v_take_the_stage_left_guide_line, 2);
            c19mb.LIZIZ(constraintLayout);
        }
    }

    @Override // X.C1AXB
    public Boolean getAudioMute() {
        return Boolean.valueOf(isMute());
    }

    @Override // X.C1AXB
    public int getH() {
        return getHeight();
    }

    @Override // X.C1AXB
    public Integer getLogicPos() {
        OnLineMicInfo onLineMicInfoLJL;
        MicPositionInfo micPositionInfo;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        return Integer.valueOf((interfaceC954180awCLJIIIZ == null || (onLineMicInfoLJL = interfaceC954180awCLJIIIZ.LJL(getLinkMicId())) == null || (micPositionInfo = onLineMicInfoLJL.micPositionData) == null) ? this.LLJJJ : micPositionInfo.position);
    }

    @Override // X.C1AXB
    public Integer getUiPos() {
        OnLineMicInfo onLineMicInfoLJL;
        MicPositionInfo micPositionInfo;
        if (C963580bBM.LIZ()) {
            return Integer.valueOf(this.LLJJJ);
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        return Integer.valueOf((interfaceC954180awCLJIIIZ == null || (onLineMicInfoLJL = interfaceC954180awCLJIIIZ.LJL(getLinkMicId())) == null || (micPositionInfo = onLineMicInfoLJL.micPositionData) == null) ? this.LLJJJ : micPositionInfo.uiPos);
    }

    @Override // X.C1AXB
    public int getW() {
        return getWidth();
    }

    @Override // android.view.View, X.C1AXB
    public int getX() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getLeft();
    }

    @Override // android.view.View, X.C1AXB
    public int getY() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getTop();
    }

    public final void i2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clear current Smoke , ");
        sbLIZ.append(this.LLJLL);
        sbLIZ.append(" , this = ");
        sbLIZ.append(this);
        C20441214yg.LJ("SmokeTest", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLL.clear();
    }

    public final boolean isMute() {
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null) {
            return interfaceC954180awCLJIIIZ.LJ(getLinkMicId());
        }
        return false;
    }

    public final void k2() {
        String str;
        C954460awe c954460awe;
        CohostStreamConfig cohostStreamConfig;
        boolean zIsMute = isMute();
        DataChannel dataChannel = this.LLJJJIL;
        if (dataChannel == null || !C500260Jjc.LJIIZILJ(dataChannel)) {
            return;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null) {
            C954460awe c954460awe2 = this.LLJILJILJ;
            interfaceC954180awCLJIIIZ.LJJIJL(c954460awe2 != null ? c954460awe2.LJI : 0L, !zIsMute);
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ2 != null) {
            interfaceC954180awCLJIIIZ2.LIZJ("CoHostWindowView onClick");
        }
        C954460awe c954460awe3 = this.LLJILJILJ;
        if (c954460awe3 == null || (cohostStreamConfig = c954460awe3.LJJI) == null || (str = cohostStreamConfig.screenShareStreamId) == null) {
            str = "";
        }
        DataChannel dataChannel2 = this.LLJJJIL;
        if (dataChannel2 != null) {
            dataChannel2.LC0(MultiCoHostAuxStreamMuteEvent.class, new C962780bA4(str, !zIsMute));
        }
        if (str.length() > 0 && (c954460awe = this.LLJILJILJ) != null && Long.valueOf(c954460awe.LJ).equals(Long.valueOf(C915980Zwa.LJII().LJJL()))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("muteAuxStreamAudioWithStreamId userId = ");
            C954460awe c954460awe4 = this.LLJILJILJ;
            sbLIZ.append(c954460awe4 != null ? Long.valueOf(c954460awe4.LJ) : null);
            sbLIZ.append(" streamId = ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC954180awC interfaceC954180awCLJIIIZ3 = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ3 != null) {
                interfaceC954180awCLJIIIZ3.LJJI(str, !zIsMute);
            }
        }
        C955440ayE c955440ayE = new C955440ayE();
        C954460awe c954460awe5 = this.LLJILJILJ;
        boolean z = !zIsMute;
        c955440ayE.LJJIJLIJ(c954460awe5 != null ? c954460awe5.LJ : 0L, z);
        LLD(-1, z);
        if (zIsMute) {
            return;
        }
        C766270U4b.LIZLLL(2131842786);
    }

    public final void n0() {
        View takeTheStageRankNoGiftImageView = getTakeTheStageRankNoGiftImageView();
        if (!(takeTheStageRankNoGiftImageView instanceof C1324720kZq) || takeTheStageRankNoGiftImageView == null) {
            return;
        }
        takeTheStageRankNoGiftImageView.setBackground(null);
        C1143680frq.LJ(takeTheStageRankNoGiftImageView, "tiktok_live_interaction_demand_25", "ttlive_take_stage_v3_no_gift_icon.png", ImageView.ScaleType.FIT_XY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Runnable runnableRemove;
        super.onAttachedToWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow,");
        sbLIZ.append(this);
        sbLIZ.append(" linkMicId = ");
        sbLIZ.append(getLinkMicId());
        sbLIZ.append(", user = ");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", ---------, viewAnchorInfo.visibility = visible? ");
        sbLIZ.append(getAnchorInfoVisibilityController().LJ() == 0);
        C20441214yg.LJ("SmokeTest", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJJIJIIJIL && CoHostWidgetWindowLayoutCacheSetting.INSTANCE.isEnableWindowView()) {
            C158G c158g = C158G.LL;
            if (((Boolean) C158G.LLILLJJLI.getValue()).booleanValue() && (runnableRemove = C158G.LLILZLL.remove(this)) != null) {
                C158G.LLILZ.removeCallbacks(runnableRemove);
            }
        }
        getWindowRoot().requestLayout();
        if (C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.MATCH_START) < 0 || C915980Zwa.LJFF().RY(false) == EnumC964170bCJ.MATCH_END) {
            this.LLZ = 0L;
            this.LLLZZIL = 0L;
            this.LLLLLL = false;
            this.LLLLLLJ = EnumC964170bCJ.NONE;
            w2(8);
        }
        getTvTeamMatePowerUpEnter().setTypeface(getTvTeamMatePowerUpEnter().getTypeface(), 3);
        ((C0J1N) C784440Upu.LIZ().LJ(C257100z3.class).LIZJ(C11RD.LIZJ(this))).LIZ(new AfS184S0100000_15(this, 77), new C09JN() { // from class: X.0bmr
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("CoHostWindowView@cc83.onAttachedToWindow$2");
                C1C7U.LIZIZ("CoHostWindowView@cc83.onAttachedToWindow$2");
            }
        });
        DataChannel dataChannel = this.LLJJJIL;
        if (dataChannel != null) {
            dataChannel.CQ2(BattleBottomLayoutShowChannel.class, this, new AwS594S0100000_15(this, 489));
            dataChannel.DQ2(MultiHostGuestWindowHeightEvent.class, this, new AwS594S0100000_15(this, 490));
            dataChannel.CQ2(MultiHostRefreshAnchorPos.class, this, new AwS596S0100000_17(this, 35));
            dataChannel.CQ2(CohostGuestListChangeChannel.class, this, new AwS594S0100000_15(this, 493));
            dataChannel.CQ2(BattleItemGuideLayoutShowChannel.class, this, new AwS594S0100000_15(this, 495));
            dataChannel.CQ2(BattleStateChannel.class, this, new C986790bmn(this));
            dataChannel.CQ2(BattleItemSmokeDebuffTimeLeft.class, this, new AwS594S0100000_15(this, 498));
            dataChannel.CQ2(BattleItemCriticalDebuffTimeLeft.class, this, new AwS594S0100000_15(this, 491));
            dataChannel.CQ2(BattleItemExtraTimeDebuffTimeLeft.class, this, new AwS594S0100000_15(this, 492));
            dataChannel.CQ2(BattleItemSpecialEffectDebuffTimeLeft.class, this, new AwS594S0100000_15(this, 494));
            dataChannel.CQ2(BattleItemTop2DebuffTimeLeft.class, this, new AwS594S0100000_15(this, 496));
            dataChannel.CQ2(BattleItemTop3DebuffTimeLeft.class, this, new AwS594S0100000_15(this, 497));
            dataChannel.CQ2(BattleEnigmaWindowIconEvent.class, this, new AwS594S0100000_15(this, 499));
            dataChannel.CQ2(BattleItemCoHostWindowIconsPredictedOrder.class, this, new AwS594S0100000_15(this, 500));
            dataChannel.CQ2(BattleItemTeamMateEffectEnterAnimationChannel.class, this, new AwS594S0100000_15(this, 501));
            dataChannel.CQ2(BattleItemTeamMateCriticalEffectTimeLeft.class, this, new AwS594S0100000_15(this, 502));
            dataChannel.CQ2(BattleItemTeamMateSmokeEffectTimeLeft.class, this, new AwS594S0100000_15(this, 474));
            dataChannel.CQ2(BattleItemTeamMateExtraTimeEffectTimeLeft.class, this, new AwS594S0100000_15(this, 476));
            dataChannel.CQ2(BattleItemTeamMateSpecialEffectTimeLeft.class, this, new AwS594S0100000_15(this, 477));
            dataChannel.CQ2(BattleItemTeamMateTop2EffectTimeLeft.class, this, new AwS594S0100000_15(this, 478));
            dataChannel.CQ2(BattleItemTeamMateTop3EffectTimeLeft.class, this, new AwS594S0100000_15(this, 479));
            dataChannel.CQ2(BattleSmokeDebuffChannel.class, this, new AwS594S0100000_15(this, 480));
            dataChannel.CQ2(BattleCriticalDebuffChannel.class, this, new AwS594S0100000_15(this, 481));
            dataChannel.CQ2(BattleTop2DebuffChannel.class, this, new AwS594S0100000_15(this, 483));
            dataChannel.CQ2(BattleTop3DebuffChannel.class, this, new AwS594S0100000_15(this, 484));
            dataChannel.CQ2(BattleHighScoreFormatUpdateChannel.class, this, new AwS594S0100000_15(this, 485));
            dataChannel.CQ2(MatchWinStreakLowAlphaChannel.class, this, AFwS250S0000000_15.get$arr$(88));
            dataChannel.CQ2(UserWannaSendMessageEvent.class, this, new AwS594S0100000_15(this, 486));
            dataChannel.CQ2(ScoreRevealStateChannel.class, this, new AwS594S0100000_15(this, 487));
            dataChannel.CQ2(MatchVirtualTicketTrayVisibilityEvent.class, this, new AwS594S0100000_15(this, 488));
        }
        DataChannel dataChannel2 = this.LLJJJIL;
        if (dataChannel2 != null) {
            dataChannel2.LC0(MultiCoHostWindowViewStateChangeEvent.class, new C970900bNA(this, true));
        }
        Long uid = getUid();
        long jLJ = C950220apo.LJ();
        if (uid == null || uid.longValue() != jLJ) {
            C717620SCy c717620SCyLLIIL = C13LP.LLIIL(C915980Zwa.LJII().LJJLI());
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            Iterator it2 = c717620SCyLLIIL.iterator();
            while (true) {
                C717610SCx c717610SCx = (C717610SCx) it2;
                if (!c717610SCx.hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                Pair pair = new Pair(Long.valueOf(((C954460awe) indexedValue.LIZIZ).LJ), Integer.valueOf(indexedValue.LIZ));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            C954460awe c954460aweLIZ = C950190apl.LIZ();
            Long uid2 = getUid();
            if (uid2 != null) {
                long jLongValue = uid2.longValue();
                DataChannel dataChannel3 = this.LLJJJIL;
                if (dataChannel3 != null) {
                    WeakReference weakReference = new WeakReference(getViewContainerRoot());
                    Long lValueOf = c954460aweLIZ != null ? Long.valueOf(c954460aweLIZ.LJ) : null;
                    Long lLJIIZILJ = C930540aK4.LJIIZILJ();
                    dataChannel3.LC0(MatchGiftTrayRebindEvent.class, new C1133430fbJ(weakReference, jLongValue, linkedHashMap, lValueOf, lLJIIZILJ != null && jLongValue == lLJIIZILJ.longValue()));
                }
            }
        }
    }

    public final boolean p0() {
        if (P0()) {
            return false;
        }
        return this.LLLLLL || this.LLLLLLJ == EnumC964170bCJ.MATCH_START;
    }

    public final View p1() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ht2, this.LLJJLIIIJLLLLLLLZ, false);
        viewTd.setTag("strike_debuff");
        C500260Jjc.LJIILIIL(viewTd);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        if (progressBar != null) {
            progressBar.setMax(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        this.LLJJLIIIJLLLLLLLZ.addView(viewTd, getPowerUpInsertIndex(), new C19ME(-1, -1));
        return viewTd;
    }

    public final View s1() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ht2, this.LLJJLIIIJLLLLLLLZ, false);
        viewTd.setTag("extra_time_debuff");
        C500260Jjc.LJIILIIL(viewTd);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        if (progressBar != null) {
            progressBar.setMax(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            C786410Ut5.X4(progressBar, 0.0f);
        }
        this.LLJJLIIIJLLLLLLLZ.addView(viewTd, getPowerUpInsertIndex(), new C19ME(-1, -1));
        return viewTd;
    }

    public final View u1() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ht2, this.LLJJLIIIJLLLLLLLZ, false);
        viewTd.setTag("smoke_debuff");
        C500260Jjc.LJIILIIL(viewTd);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        if (progressBar != null) {
            progressBar.setMax(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        this.LLJJLIIIJLLLLLLLZ.addView(viewTd, getPowerUpInsertIndex(), new C19ME(-1, -1));
        return viewTd;
    }

    public final View v1() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ht2, this.LLJJLIIIJLLLLLLLZ, false);
        viewTd.setTag("special_effect_debuff");
        C500260Jjc.LJIILIIL(viewTd);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        if (progressBar != null) {
            progressBar.setMax(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        this.LLJJLIIIJLLLLLLLZ.addView(viewTd, getPowerUpInsertIndex(), new C19ME(-1, -1));
        return viewTd;
    }

    public final View x1() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ht2, this.LLJJLIIIJLLLLLLLZ, false);
        viewTd.setTag("team_mate_strike_buff");
        C500260Jjc.LJIILIIL(viewTd);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        if (progressBar != null) {
            progressBar.setMax(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        this.LLJJLIIIJLLLLLLLZ.addView(viewTd, getPowerUpInsertIndex(), new C19ME(-1, -1));
        return viewTd;
    }

    public final View y1() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ht2, this.LLJJLIIIJLLLLLLLZ, false);
        viewTd.setTag("team_mate_extra_time_buff");
        C500260Jjc.LJIILIIL(viewTd);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        if (progressBar != null) {
            progressBar.setMax(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            C786410Ut5.X4(progressBar, 0.0f);
        }
        this.LLJJLIIIJLLLLLLLZ.addView(viewTd, getPowerUpInsertIndex(), new C19ME(-1, -1));
        return viewTd;
    }

    public final View z1() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ht2, this.LLJJLIIIJLLLLLLLZ, false);
        viewTd.setTag("team_mate_smoke_buff");
        C500260Jjc.LJIILIIL(viewTd);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        if (progressBar != null) {
            progressBar.setMax(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        this.LLJJLIIIJLLLLLLLZ.addView(viewTd, getPowerUpInsertIndex(), new C19ME(-1, -1));
        return viewTd;
    }

    public final EnumC964170bCJ getBattleState() {
        return this.LLLLLLJ;
    }

    public final List<C986810bmp> getCriticalDebuffList() {
        return this.LLJLLIL;
    }

    public final List<C986810bmp> getExtraTimeDebuffList() {
        return this.LLJLLL;
    }

    @Override // X.C1AXB
    public String getLinkMicId() {
        return this.LLJJIJIL;
    }

    public final LinearLayout getRivalDebuffContainer() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final List<C986810bmp> getSmokeDebuffList() {
        return this.LLJLL;
    }

    public final List<C986810bmp> getTeamMateCriticalBuffList() {
        return this.LLLFF;
    }

    public final List<C986810bmp> getTeamMateExtraTimeBuffList() {
        return this.LLLFFI;
    }

    public final List<C986810bmp> getTeamMateSmokeBuffList() {
        return this.LLLF;
    }

    public final List<C986810bmp> getTeamMateTop2BuffList() {
        return this.LLLFZ;
    }

    public final List<C986810bmp> getTeamMateTop3BuffList() {
        return this.LLLI;
    }

    public final List<C986810bmp> getTop2DebuffList() {
        return this.LLJZ;
    }

    public final List<C986810bmp> getTop3DebuffList() {
        return this.LLJZIJLIL;
    }

    @Override // X.C1AXB
    public Boolean getVideoMute() {
        return Boolean.FALSE;
    }

    public ViewOnClickListenerC986770bml(final Context context) {
        super(context);
        this.LL = C1935407i4.LIZ(new AwS571S0100000_27(this, 83));
        this.LLILLJJLI = C1935407i4.LIZ(new AwS559S0100000_15(this, 460));
        this.LLILLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 458));
        this.LLILZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 456));
        this.LLILZIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 466));
        this.LLILZLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 470));
        this.LLIZ = C1935407i4.LIZ(new AwS416S0200000_15(context, this, 48));
        this.LLIZLLLIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 444));
        this.LLJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(145));
        this.LLJI = C1935407i4.LIZ(new AwS559S0100000_15(this, 451));
        this.LLJILJIL = true;
        this.LLJJ = EnumC918810a19.StateInit;
        this.LLJJIJIL = "";
        this.LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78));
        this.LLJJJJLIIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 461));
        this.LLJJL = C1935407i4.LIZ(new AwS571S0100000_27(this, 77));
        this.LLJL = C1935407i4.LIZ(new AwS559S0100000_15(this, 445));
        this.LLJLIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 459));
        this.LLJLILLLLZIIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 449));
        this.LLJLL = new ArrayList();
        this.LLJLLIL = new ArrayList();
        this.LLJLLL = new ArrayList();
        this.LLJZ = new ArrayList();
        this.LLJZIJLIL = new ArrayList();
        this.LLL = new ArrayList();
        this.LLLF = new ArrayList();
        this.LLLFF = new ArrayList();
        this.LLLFFI = new ArrayList();
        this.LLLFZ = new ArrayList();
        this.LLLI = new ArrayList();
        this.LLLII = new ArrayList();
        this.LLLIIII = new LinkedHashMap();
        this.LLLIIIIL = MatchItemCardLynxUrlSetting.INSTANCE.getMatchItemsPanel();
        this.LLLIIL = C1935407i4.LIZ(new AwS571S0100000_27(this, 78));
        this.LLLIILIL = C1935407i4.LIZ(new AwS571S0100000_27(this, 76));
        this.LLLIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 455));
        this.LLLILZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 457));
        this.LLLILZJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 446));
        this.LLLILZLLLI = C1935407i4.LIZ(new AwS559S0100000_15(this, 453));
        this.LLLIZZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 476));
        this.LLLJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 467));
        this.LLLJIL = C1935407i4.LIZ(new AwS571S0100000_27(this, 82));
        this.LLLJL = C1935407i4.LIZ(new AwS559S0100000_15(this, 464));
        this.LLLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 465));
        this.LLLLII = C1935407i4.LIZ(new AwS559S0100000_15(this, 448));
        this.LLLLIIIILLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 469));
        this.LLLLIIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 462));
        this.LLLLIILL = C1935407i4.LIZ(new AwS559S0100000_15(this, 463));
        this.LLLLIILLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 450));
        this.LLLLIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 452));
        this.LLLLILI = C1935407i4.LIZ(new AwS559S0100000_15(this, 447));
        this.LLLLJ = C1935407i4.LIZ(new AwS571S0100000_27(this, 80));
        this.LLLLJI = C1935407i4.LIZ(new AwS559S0100000_15(this, 472));
        this.LLLLL = new C985820blE(false, 0L);
        this.LLLLLLJ = EnumC964170bCJ.NONE;
        this.LLLLLLLLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 443));
        this.LLLLLLLLLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 473));
        this.LLLLLLLZIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 475));
        this.LLLLLLZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 478));
        this.LLLLLLZZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 477));
        this.LLLLLZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 474));
        this.LLLLLZIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 479));
        this.LLLLLZL = C1935407i4.LIZ(new AwS571S0100000_27(this, 81));
        this.LLLLZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 471));
        this.LLLLZI = C1935407i4.LIZ(new AwS559S0100000_15(this, 468));
        this.LLLLZIL = C1935407i4.LIZ(new AwS571S0100000_27(this, 79));
        this.LLLLZLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 454));
        this.LLLLZLLLI = -1;
        C915980Zwa.LJI().LIZLLL();
        this.LLLZLL = new LinkedHashMap();
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h9h, this, true);
        C1091250eVH c1091250eVH = (C1091250eVH) findViewById(R.id.i47);
        c1091250eVH.setEnableSizeChange(true);
        c1091250eVH.setEnableFixedSize(true);
        getViewContainerClickView().setEnabled(true);
        getViewContainerClickView().setOnTouchListener(new ATListenerS448S0100000_15(this, 3));
        C786410Ut5.V7(getViewMuteAudienceStatus(), this);
        C786410Ut5.V7(getViewFollowStatus(), this);
        C786410Ut5.V7(getTakeTheStageTopLeftMuteStatusView(), this);
        View takeTheStageLayout = getTakeTheStageLayout();
        if (takeTheStageLayout != null) {
            C500260Jjc.LJLIIL(this, takeTheStageLayout);
        }
        C635860Owq c635860Owq = C635860Owq.LIZ;
        AppCompatImageView viewMuteAudienceStatus = getViewMuteAudienceStatus();
        int iLIZ = C439101nJ.LIZ(4);
        int iLIZ2 = C439101nJ.LIZ(5);
        int iLIZ3 = C439101nJ.LIZ(4);
        int iLIZ4 = C439101nJ.LIZ(5);
        c635860Owq.getClass();
        C635860Owq.LIZIZ(iLIZ, iLIZ2, iLIZ3, iLIZ4, viewMuteAudienceStatus, null, false);
        c635860Owq.LIZJ(C439101nJ.LIZ(10), getViewFollowStatus());
        this.LLJJLIIIJLLLLLLLZ = getLnRivalPowerUpsNew();
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.OnGestureListener() { // from class: X.0bmi
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                InterfaceC1085480eLy interfaceC1085480eLy;
                if ((this.LL.P0() || this.LL.LLLZL) && (interfaceC1085480eLy = this.LL.LLJIJIL) != null) {
                    interfaceC1085480eLy.LJIIIZ(motionEvent.getRawX(), motionEvent.getRawY());
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                if (this.LL.LLJILJILJ == null) {
                    return;
                }
                C784440Upu.LIZ().LIZIZ(new C986760bmk());
            }
        });
        gestureDetector.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() { // from class: X.0bmb
            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                InterfaceC1085480eLy interfaceC1085480eLy;
                this.LLJJIII = System.currentTimeMillis();
                if ((this.P0() || this.LLLZL) && (interfaceC1085480eLy = this.LLJIJIL) != null) {
                    interfaceC1085480eLy.LJFF();
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                long j;
                long j2;
                String str;
                boolean zLJJLIL;
                long id;
                String str2;
                long j3;
                User owner;
                long j4 = 0;
                if (C951960asc.LIZIZ()) {
                    ViewOnClickListenerC986770bml viewOnClickListenerC986770bml = this;
                    C954460awe c954460awe = viewOnClickListenerC986770bml.LLJILJILJ;
                    if (c954460awe != null) {
                        long j5 = c954460awe.LJ;
                        Room room = viewOnClickListenerC986770bml.LLJJJJ;
                        if (room != null && (owner = room.getOwner()) != null) {
                            id = owner.getId();
                        } else {
                            id = 0;
                        }
                        String str3 = "own_host";
                        if (j5 == id) {
                            str2 = "own_host";
                        } else {
                            str2 = "other_host";
                        }
                        AbstractC986700bme abstractC986700bmeLIZ = C986680bmc.LIZ();
                        boolean z = abstractC986700bmeLIZ instanceof C986690bmd;
                        if (z) {
                            j3 = ((C986690bmd) abstractC986700bmeLIZ).LIZIZ;
                            if (j3 > 0) {
                                if (j3 != id) {
                                    str3 = "other_host";
                                }
                            }
                            C955400ayA.LJLJJI(j5, j3, z, str2, str3);
                        } else {
                            j3 = 0;
                        }
                        str3 = null;
                        C955400ayA.LJLJJI(j5, j3, z, str2, str3);
                    }
                    Context context2 = context;
                    ViewOnClickListenerC986770bml viewOnClickListenerC986770bml2 = this;
                    C954460awe c954460awe2 = viewOnClickListenerC986770bml2.LLJILJILJ;
                    boolean zIsMute = viewOnClickListenerC986770bml2.isMute();
                    ViewOnClickListenerC986770bml viewOnClickListenerC986770bml3 = this;
                    viewOnClickListenerC986770bml3.getClass();
                    InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                    if (interfaceC954180awCLJIIIZ != null) {
                        zLJJLIL = interfaceC954180awCLJIIIZ.LJJLIL(viewOnClickListenerC986770bml3.getLinkMicId());
                    } else {
                        zLJJLIL = false;
                    }
                    if (C951960asc.LJ(context2, c954460awe2, zIsMute, zLJJLIL)) {
                        return true;
                    }
                }
                long jLJI = 1000;
                if (this.P0()) {
                    C954460awe c954460awe3 = this.LLJILJILJ;
                    if (c954460awe3 == null || c954460awe3.LJI() || !C915980Zwa.LJII().LJJLIIIJJI() || Math.abs(System.currentTimeMillis() - this.LLJJIII) <= 1000) {
                        return true;
                    }
                    ViewOnClickListenerC986770bml viewOnClickListenerC986770bml4 = this;
                    DataChannel dataChannel = viewOnClickListenerC986770bml4.LLJJJIL;
                    C954460awe c954460awe4 = viewOnClickListenerC986770bml4.LLJILJILJ;
                    if (c954460awe4 != null) {
                        str = c954460awe4.LJIIJJI;
                    } else {
                        str = null;
                    }
                    C01H4.LIZ(dataChannel, str, "cohost_window");
                    return true;
                }
                if (this.LLLZL) {
                    long jAbs = Math.abs(System.currentTimeMillis() - this.LLJJIII);
                    InterfaceC1085480eLy interfaceC1085480eLy = this.LLJIJIL;
                    if (interfaceC1085480eLy != null) {
                        jLJI = interfaceC1085480eLy.LJI();
                    }
                    if (jAbs <= jLJI) {
                        return true;
                    }
                }
                C954460awe c954460awe5 = this.LLJILJILJ;
                if (c954460awe5 != null) {
                    j = c954460awe5.LJ;
                } else {
                    j = 0;
                }
                UserProfileEvent userProfileEvent = new UserProfileEvent(j);
                userProfileEvent.linkInRoomEnable = false;
                C954460awe c954460awe6 = this.LLJILJILJ;
                if (c954460awe6 != null) {
                    j2 = c954460awe6.LJFF;
                } else {
                    j2 = 0;
                }
                userProfileEvent.roomId = j2;
                userProfileEvent.currentHasMultiCoHostPermission = true;
                if (c954460awe6 != null) {
                    j4 = c954460awe6.LJ;
                }
                userProfileEvent.currentMultiCoHostGuestId = j4;
                userProfileEvent.clickModule = "link_anchor_profile";
                userProfileEvent.setFromLiveModule("match_anchor");
                userProfileEvent.enigmaEnterFrom = "pk_contributor_rank";
                C784440Upu.LIZ().LIZIZ(userProfileEvent);
                return true;
            }
        });
        this.LLLZLZ = gestureDetector;
        this.LLLZZ = C452501pT.LIZIZ(new AwS430S0200000_29(context, this, 4));
        this.LLZLL = -1.0f;
    }

    private final void setNoClipChildren(ViewParent viewParent) {
        ViewGroup viewGroup;
        C754570Tip c754570Tip;
        String str = null;
        if (!(viewParent instanceof ViewGroup) || (viewGroup = (ViewGroup) viewParent) == null || viewGroup.getId() == R.id.mbw) {
            return;
        }
        if (viewGroup.getClipChildren()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C954460awe c954460awe = this.LLJILJILJ;
            if (c954460awe != null && (c754570Tip = c954460awe.LJIJJ) != null) {
                str = c754570Tip.LIZIZ;
            }
            sbLIZ.append(str);
            sbLIZ.append(" setNoClipChildren id ");
            sbLIZ.append(viewGroup.getId());
            sbLIZ.append(" clipChildren=false");
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        setNoClipChildren(viewGroup.getParent());
    }

    private final void setRankBadgeClick(GiftGalleryBadgeInfo giftGalleryBadgeInfo) {
        C973130bQl rankBadge = getRankBadge();
        View.OnClickListener viewOnClickListenerC511801z2 = new ViewOnClickListenerC511801z2(giftGalleryBadgeInfo, this, 1);
        if (C1848410yCV.LIZ) {
            viewOnClickListenerC511801z2 = new f(viewOnClickListenerC511801z2);
        }
        a aVar = new a(viewOnClickListenerC511801z2);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(rankBadge);
        }
        rankBadge.setOnClickListener(aVar);
        if (C963580bBM.LIZ()) {
            int iM0 = M0("attachedToWindow");
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.dvs);
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJJIIJZLJL(R.id.i2t, 4, iM0);
            c19mb.LIZIZ(constraintLayout);
        }
    }

    private final void setRankBgLayoutWidth(float f) {
        ViewGroup.LayoutParams layoutParams;
        int iLIZIZ;
        if (S0()) {
            if (f == 22.0f) {
                f = 18.0f;
            } else {
                f = 24.0f;
            }
        }
        View viewFindViewById = getHostScoreLayout().findViewById(R.id.i9b);
        if (viewFindViewById == null || (layoutParams = viewFindViewById.getLayoutParams()) == null || layoutParams.width == (iLIZIZ = (int) C497740JfY.LIZIZ(f))) {
            return;
        }
        layoutParams.width = iLIZIZ;
        C786410Ut5.W5(viewFindViewById, layoutParams);
        viewFindViewById.requestLayout();
    }

    private final void setScoreTextWithAnim(long j) {
        Boolean boolValueOf;
        ValueAnimator valueAnimator = this.LLZLLLL;
        boolean z = false;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        C16F5 takeTheStageScoreText = getTakeTheStageScoreText();
        if (takeTheStageScoreText != null) {
            if (takeTheStageScoreText.getVisibility() == 8) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return;
        }
        C16F5 takeTheStageScoreText2 = getTakeTheStageScoreText();
        if (takeTheStageScoreText2 != null) {
            takeTheStageScoreText2.setText(C1850730yGF.LIZJ(j));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 2.0f);
        this.LLZLLLL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(200L);
        }
        ValueAnimator valueAnimator2 = this.LLZLLLL;
        if (valueAnimator2 != null) {
            valueAnimator2.setRepeatCount(1);
        }
        ValueAnimator valueAnimator3 = this.LLZLLLL;
        if (valueAnimator3 != null) {
            valueAnimator3.setRepeatMode(2);
        }
        ValueAnimator valueAnimator4 = this.LLZLLLL;
        if (valueAnimator4 != null) {
            valueAnimator4.addUpdateListener(new AUListenerS264S0100000_15(this, 5));
        }
        ValueAnimator valueAnimator5 = this.LLZLLLL;
        if (valueAnimator5 == null) {
            return;
        }
        valueAnimator5.start();
    }

    private final void setUpLocalTestInfo(boolean z) {
        String strLIZIZ;
        boolean z2 = false;
        if (C958370b2x.LIZIZ()) {
            C16F5 crossArcTestTv = getCrossArcTestTv();
            if (crossArcTestTv != null) {
                C500260Jjc.LJLJLJ(crossArcTestTv, true);
            }
            boolean zRy2 = C915980Zwa.LJFF().ry2();
            IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
            if (iMultiHostServiceLJII != null) {
                iMultiHostServiceLJII.jn1();
                z2 = true;
            }
            String str = "c-";
            String strLJIJI = "";
            if (z2) {
                boolean zLIZ = C963580bBM.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                if (!z) {
                    str = "";
                }
                sbLIZ.append(str);
                sbLIZ.append(C497740JfY.LJIJI(2131851867));
                if (zRy2) {
                    strLJIJI = C497740JfY.LJIJI(2131853729);
                }
                sbLIZ.append(strLJIJI);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (C955010axX.LJIIJ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append("-sl");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                } else if (zLIZ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append("-nl");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                if (!z) {
                    str = "";
                }
                sbLIZ4.append(str);
                sbLIZ4.append(C497740JfY.LJIJI(2131851874));
                if (zRy2) {
                    strLJIJI = C497740JfY.LJIJI(2131853729);
                }
                sbLIZ4.append(strLJIJI);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            }
            C16F5 crossArcTestTv2 = getCrossArcTestTv();
            if (crossArcTestTv2 != null) {
                crossArcTestTv2.setText(strLIZIZ);
                return;
            }
            return;
        }
        C16F5 crossArcTestTv3 = getCrossArcTestTv();
        if (crossArcTestTv3 == null) {
            return;
        }
        C500260Jjc.LJLJLJ(crossArcTestTv3, false);
    }

    private final void setupAnchorInfo(int i) {
        int currentWindowCnt;
        float f;
        LLD(i, isMute());
        AwS155S0101000_15 awS155S0101000_15 = new AwS155S0101000_15(i, this, 1);
        if (P0()) {
            C500260Jjc.LJLJLJ(getViewDisplayId(), false);
        } else {
            C500260Jjc.LJLJLJ(getViewDisplayId(), true);
        }
        C950220apo.LJJI(getViewDisplayId(), this.LLJILJILJ, "CoHostWindowView_updateDisplayId", "coHostWindow_updateDisplayId", awS155S0101000_15);
        if (C915980Zwa.LJII().LLLLJ() == EnumC955820ayq.COHOST_MODE_SCREEN_SHARE) {
            u0("updateCoHostUser");
        } else if (C915980Zwa.LJII().LLLLJ() == EnumC955820ayq.COHOST_MODE_NORMAL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("from = ");
            sbLIZ.append(i);
            sbLIZ.append(" setupAnchorInfo linked user list size = ");
            sbLIZ.append(C915980Zwa.LJII().LLILZLL(true).size());
            sbLIZ.append(" currentWindowCount = ");
            sbLIZ.append(getCurrentWindowCnt());
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
            if (i == 0) {
                currentWindowCnt = C915980Zwa.LJII().LJIJJ().size();
            } else {
                currentWindowCnt = getCurrentWindowCnt();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dealAnchorInfoMarginValue, size = ");
            sbLIZ2.append(currentWindowCnt);
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ2));
            C19MB c19mb = new C19MB();
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.dvs);
            c19mb.LJII(constraintLayout);
            if (currentWindowCnt >= 3) {
                f = 8.0f;
            } else {
                f = 12.0f;
            }
            c19mb.LJJIIJZLJL(R.id.i2t, 7, (int) C497740JfY.LIZIZ(f));
            c19mb.LIZIZ(constraintLayout);
            n2();
        }
        p2();
        m2();
    }

    public final void G2(C954240awI c954240awI) {
        getViewPauseContainer().LJFF(c954240awI, this.LLJJIJIIJIL, new AwS416S0200000_15(this, c954240awI, 47));
    }

    public final void H2(boolean z) {
        int i;
        DataChannel dataChannel = this.LLJJJIL;
        if (dataChannel == null || !C500260Jjc.LJIIZILJ(dataChannel) ? !(!this.LLLLZLLIL || this.LLLLZLLLI != 0 || !z) : !(!this.LLLLZLLIL || this.LLLLZLLLI != 0 || P0())) {
            C500260Jjc.LLFFF(getTakeTheStageTopLeftMuteStatusView());
            AppCompatImageView takeTheStageTopLeftMuteStatusView = getTakeTheStageTopLeftMuteStatusView();
            if (z) {
                i = R.drawable.ewn;
            } else {
                i = R.drawable.ewo;
            }
            takeTheStageTopLeftMuteStatusView.setImageResource(i);
            return;
        }
        C500260Jjc.LJIILIIL(getTakeTheStageTopLeftMuteStatusView());
    }

    public final void I1(boolean z) {
        int i;
        ViewGroup takeTheStageRankLayout = getTakeTheStageRankLayout();
        if (takeTheStageRankLayout != null) {
            C500260Jjc.LJJZZI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), takeTheStageRankLayout);
        }
        if (z) {
            i = 12;
        } else {
            i = 14;
        }
        View takeTheStageRankNoGiftImageView = getTakeTheStageRankNoGiftImageView();
        if (takeTheStageRankNoGiftImageView != null) {
            C500260Jjc.LJLLI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))), takeTheStageRankNoGiftImageView);
        }
        View takeTheStageRankNoGiftImageView2 = getTakeTheStageRankNoGiftImageView();
        if (takeTheStageRankNoGiftImageView2 != null) {
            C500260Jjc.LJJZZI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))), takeTheStageRankNoGiftImageView2);
        }
        View takeTheStageRankCrownImageView = getTakeTheStageRankCrownImageView();
        if (takeTheStageRankCrownImageView != null) {
            C500260Jjc.LJLLI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), takeTheStageRankCrownImageView);
        }
        View takeTheStageRankCrownImageView2 = getTakeTheStageRankCrownImageView();
        if (takeTheStageRankCrownImageView2 != null) {
            C500260Jjc.LJJZZI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), takeTheStageRankCrownImageView2);
        }
        C16F5 takeTheStageRankText = getTakeTheStageRankText();
        if (takeTheStageRankText != null) {
            takeTheStageRankText.setTextSize(1, 12.0f);
        }
        C500260Jjc.LJJLL(0, getTakeTheStageScoreText());
        C16F5 takeTheStageScoreText = getTakeTheStageScoreText();
        if (takeTheStageScoreText != null) {
            takeTheStageScoreText.setTextSize(1, 12.0f);
        }
    }

    public final void J2(int i) {
        if (i != 2) {
            C786410Ut5.LJLLLLLL(8, getViewContainerBg());
        } else {
            if (C958040b2Q.LIZLLL() || C915980Zwa.LJII().LJJLIIIJJI()) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, getViewContainerBg());
        }
    }

    public final String L0(long j) {
        C985820blE c985820blE = this.LLLLL;
        if (c985820blE.LIZ) {
            long j2 = c985820blE.LIZIZ;
            if (j >= j2) {
                return C497740JfY.LJIJJ(2131853303, C978440bZK.LIZJ(j2));
            }
        }
        return C944330agJ.LIZ(j);
    }

    public final void L2(EnumC956410azn enumC956410azn) {
        if (!LiveCohostEnableMatchResumeSetting.INSTANCE.isEnableCoHostResume()) {
            return;
        }
        if (enumC956410azn.compareTo(EnumC956410azn.FORWARD_STREAM_FAILED) < 0) {
            C786410Ut5.LJLLLLLL(8, getViewContainerBg());
        } else {
            if (C958040b2Q.LIZLLL() || C915980Zwa.LJII().LJJLIIIJJI()) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, getViewContainerBg());
        }
    }

    @Override // X.InterfaceC956450azr
    public final void LLL(EnumC918810a19 enumC918810a19) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeWindowViewState, linkMicId=");
        sbLIZ.append(getLinkMicId());
        sbLIZ.append(", state=");
        sbLIZ.append(enumC918810a19);
        sbLIZ.append(", currentState=");
        sbLIZ.append(this.LLJJ);
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC918810a19 == this.LLJJ) {
            return;
        }
        this.LLJJ = enumC918810a19;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateStateUIInner, linkMicId=");
        sbLIZ2.append(getLinkMicId());
        sbLIZ2.append(", uiPos = ");
        sbLIZ2.append(getUiPos());
        sbLIZ2.append(", currentState = ");
        sbLIZ2.append(this.LLJJ);
        sbLIZ2.append(", opt=");
        LinkmicSdkRenderCallbackTimeOptSetting linkmicSdkRenderCallbackTimeOptSetting = LinkmicSdkRenderCallbackTimeOptSetting.INSTANCE;
        sbLIZ2.append(linkmicSdkRenderCallbackTimeOptSetting.isOpt());
        sbLIZ2.append(", isCurSurfaceViewRealRender=");
        sbLIZ2.append(N0());
        C20441214yg.LJIIIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ2));
        int i = C917180ZyW.LIZ[this.LLJJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("updateStateUIInner, isAnchor=");
                    sbLIZ3.append(this.LLJJIJIIJIL);
                    sbLIZ3.append(", opt=");
                    sbLIZ3.append(linkmicSdkRenderCallbackTimeOptSetting.isOpt());
                    sbLIZ3.append(", isCurSurfaceViewRealRender=");
                    sbLIZ3.append(N0());
                    C20441214yg.LJIIIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ3));
                    if (this.LLJJIJIIJIL && linkmicSdkRenderCallbackTimeOptSetting.isOpt() && !N0()) {
                        LJ();
                        return;
                    } else {
                        U1();
                        return;
                    }
                }
                return;
            }
            if (this.LLJJIJIIJIL && linkmicSdkRenderCallbackTimeOptSetting.isOpt() && !N0()) {
                LJ();
                return;
            } else {
                U1();
                return;
            }
        }
        LJ();
    }

    public final int M0(String str) {
        C956040azC c956040azCLJI;
        List<C955080axe> list;
        C955080axe next;
        if (C963580bBM.LIZ() && C915980Zwa.LJII().LJJLIIIJJI() && this.LLJJJ == 1) {
            C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
            Integer numValueOf = null;
            if (c955010axXI30 != null && (c956040azCLJI = c955010axXI30.LJI()) != null && (list = c956040azCLJI.LIZ) != null) {
                Iterator<C955080axe> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        C955080axe c955080axe = next;
                        if (c955080axe.LJ == 4 && c955080axe.LJII == 1) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C955080axe c955080axe2 = next;
                if (c955080axe2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getAnchorInfoBottomMarginWithGuest, source=");
                    sbLIZ.append(str);
                    sbLIZ.append(", window height = ");
                    Rect rect = c955080axe2.LJFF;
                    if (rect != null) {
                        numValueOf = Integer.valueOf(rect.height());
                    }
                    sbLIZ.append(numValueOf);
                    C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
                    return c955080axe2.LJFF.height() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getAnchorInfoBottomMarginWithGuest, source=");
        sbLIZ2.append(str);
        sbLIZ2.append(", bottom margin=");
        int i = LLZZJLIL;
        sbLIZ2.append(i);
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ2));
        return i;
    }

    public final boolean O1(ItemInfo4FE itemInfo4FE) {
        Long lValueOf;
        if (itemInfo4FE != null) {
            String str = itemInfo4FE.sendToAnchorId;
            C954460awe c954460awe = this.LLJILJILJ;
            if (c954460awe != null) {
                lValueOf = Long.valueOf(c954460awe.LJ);
            } else {
                lValueOf = null;
            }
            if (Intrinsics.LJFF(str, String.valueOf(lValueOf))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean T0(ItemInfo4FE itemInfo4FE) {
        Long lValueOf;
        List<TeamUsersInfo> listLJJJ;
        String str;
        Long lLJIILIIL;
        Long lValueOf2;
        if (itemInfo4FE == null) {
            return false;
        }
        String str2 = itemInfo4FE.sendToAnchorId;
        C954460awe c954460awe = this.LLJILJILJ;
        if (c954460awe != null) {
            lValueOf = Long.valueOf(c954460awe.LJ);
        } else {
            lValueOf = null;
        }
        if (Intrinsics.LJFF(str2, String.valueOf(lValueOf))) {
            return true;
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (listLJJJ = interfaceC973730bRjYf2.LJJJ()) != null) {
            Iterator<TeamUsersInfo> it2 = listLJJJ.iterator();
            while (it2.hasNext()) {
                HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(it2.next().userIds);
                if (C500260Jjc.LJJIIZ(itemInfo4FE.sendToAnchorId) && (str = itemInfo4FE.sendToAnchorId) != null && C2095008Iq.LJIILIIL(str) != null) {
                    String str3 = itemInfo4FE.sendToAnchorId;
                    if (str3 != null) {
                        lLJIILIIL = C2095008Iq.LJIILIIL(str3);
                    } else {
                        lLJIILIIL = null;
                    }
                    if (hashSetLLIFFJFJJ.contains(lLJIILIIL)) {
                        C954460awe c954460awe2 = this.LLJILJILJ;
                        if (c954460awe2 != null) {
                            lValueOf2 = Long.valueOf(c954460awe2.LJ);
                        } else {
                            lValueOf2 = null;
                        }
                        if (hashSetLLIFFJFJJ.contains(lValueOf2)) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public final boolean W0(long j) {
        List<TeamUsersInfo> listLJJJ;
        List<Long> list;
        if (!C970370bMJ.LJIIIIZZ()) {
            Long uid = getUid();
            if (uid != null && uid.longValue() == j) {
                return true;
            }
            return false;
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        TeamUsersInfo teamUsersInfo = null;
        if (interfaceC973730bRjYf2 != null && (listLJJJ = interfaceC973730bRjYf2.LJJJ()) != null) {
            Iterator<TeamUsersInfo> it2 = listLJJJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TeamUsersInfo next = it2.next();
                if (next.teamId == j) {
                    teamUsersInfo = next;
                    break;
                }
            }
            TeamUsersInfo teamUsersInfo2 = teamUsersInfo;
            if (teamUsersInfo2 != null && (list = teamUsersInfo2.userIds) != null && list.contains(getUid())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void Z1(ItemInfo4FE itemInfo4FE) {
        boolean z;
        if (itemInfo4FE == null) {
            return;
        }
        if (S0()) {
            C20441214yg.LIZIZ("CoHostWindowView", "TeamMate Enter, skip enter animation in enlarge layout");
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getTeamMatePowerUpEnterLayout(), (Property<LinearLayout, Float>) View.TRANSLATION_X, (getTeamMatePowerUpEnterLayout().getWidth() * (-1.0f)) - ((int) C497740JfY.LIZIZ(8.0f)), 0.0f);
        objectAnimatorOfFloat.setDuration(480L);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.41f, 1.44f, 0.42f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getTeamMatePowerUpEnterLayout(), (Property<LinearLayout, Float>) View.ALPHA, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(getTeamMatePowerUpEnterLayout(), (Property<LinearLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(200L);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TeamMate Enter, show Teammate enter animation----visible = ");
        if (getTeamMatePowerUpEnterLayout().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LJ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        getIvTeamMatePowerUpSender().setAvatar(itemInfo4FE.avatarThumb);
        C786410Ut5.LJZL(0, getTeamMatePowerUpEnterLayout());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.start();
        animatorSet.addListener(new ALAdapterS11S0100000_15(this, 3));
    }

    public final void a2(BattleComboInfo battleComboInfo) {
        getStreakVisibilityController().LIZLLL(new AbstractC989020bqO() { // from class: X.0bqQ
        });
        l2(battleComboInfo, true, false);
    }

    public final void h0(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View takeStageMarqueeContainer = getTakeStageMarqueeContainer();
        if (takeStageMarqueeContainer == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = takeStageMarqueeContainer.getLayoutParams();
        if ((layoutParams instanceof FrameLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int iLIZ = C439101nJ.LIZ(4);
            int iLIZ2 = C439101nJ.LIZ(2);
            if (!z) {
                iLIZ2 = 0;
            }
            int i = iLIZ2 + iLIZ;
            if (marginLayoutParams.getMarginStart() != i || marginLayoutParams.getMarginEnd() != iLIZ) {
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.setMarginEnd(iLIZ);
                C786410Ut5.W5(takeStageMarqueeContainer, marginLayoutParams);
            }
        }
    }

    public final void l0(int i) {
        boolean z;
        boolean zLJFF;
        C19MB c19mb;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("battleStart, isMatching = ");
        sbLIZ.append(this.LLLLLL);
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        C20441214yg.LJ("lipengwei", "viewAnchorInfo.setVisible alpha to 1 ");
        getMatchLayoutCoordinator().LIZ(C986680bmc.LIZ());
        if (i == 2) {
            boolean z2 = false;
            if (CohostWithGuestDisableAlphaChangeForBattleStart.INSTANCE.isEnabled() && C915980Zwa.LJII().LJJLIIIJJI()) {
                z = true;
            } else {
                z = false;
            }
            DataChannel dataChannel = this.LLJJJIL;
            if (dataChannel != null) {
                zLJFF = Intrinsics.LJFF(dataChannel.gg0(MatchStartAnimationShowing.class), Boolean.TRUE);
                if (!zLJFF) {
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("battleStart, disableAlphaChange=");
                sbLIZ2.append(z);
                sbLIZ2.append(", isMatchStartAnimationRunning=");
                sbLIZ2.append(zLJFF);
                C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ2));
                if (!z && C975230bU9.LIZIZ(this.LLJJJIL) == EnumC964170bCJ.MATCH_START && !z2) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("BATTLE START method,  viewAnchorInfo.alpha = 0 num = ");
                    sbLIZ3.append(i);
                    sbLIZ3.append(", dataChannel = ");
                    sbLIZ3.append(this.LLJJJIL);
                    sbLIZ3.append(",  dataChannel?.getValue(getCompatibleMatchStatus::class.java) == LinkMatchStatus.MATCH_START ? true");
                    C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ3));
                    C786410Ut5.T4(getViewAnchorInfo(), 0.0f);
                    C20441214yg.LJ("lipengwei", "viewAnchorInfo.setVisible alpha to 0 7 ");
                }
                c19mb = new C19MB();
                if (this.LLJJIJIIJIL && !C915980Zwa.LJII().LJJLIIIJJI()) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.dvs);
                    c19mb.LJII(constraintLayout);
                    c19mb.LJJIIJZLJL(R.id.i2t, 4, (int) C497740JfY.LIZIZ(47.0f));
                    C20441214yg.LIZIZ("CoHostWindowView", "set fl_anchor_info margin in BATTLE START method");
                    c19mb.LIZIZ(constraintLayout);
                }
            } else {
                zLJFF = false;
            }
            if (CohostWindowUserNameMatchAnimationOpt.INSTANCE.isEnabled()) {
                z2 = true;
            }
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append("battleStart, disableAlphaChange=");
            sbLIZ22.append(z);
            sbLIZ22.append(", isMatchStartAnimationRunning=");
            sbLIZ22.append(zLJFF);
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ22));
            if (!z) {
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append("BATTLE START method,  viewAnchorInfo.alpha = 0 num = ");
                sbLIZ32.append(i);
                sbLIZ32.append(", dataChannel = ");
                sbLIZ32.append(this.LLJJJIL);
                sbLIZ32.append(",  dataChannel?.getValue(getCompatibleMatchStatus::class.java) == LinkMatchStatus.MATCH_START ? true");
                C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ32));
                C786410Ut5.T4(getViewAnchorInfo(), 0.0f);
                C20441214yg.LJ("lipengwei", "viewAnchorInfo.setVisible alpha to 0 7 ");
            }
            c19mb = new C19MB();
            if (this.LLJJIJIIJIL) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.dvs);
                c19mb.LJII(constraintLayout2);
                c19mb.LJJIIJZLJL(R.id.i2t, 4, (int) C497740JfY.LIZIZ(47.0f));
                C20441214yg.LIZIZ("CoHostWindowView", "set fl_anchor_info margin in BATTLE START method");
                c19mb.LIZIZ(constraintLayout2);
            }
        }
        if (this.LLLLLL) {
            if (getHostScoreLayout().getVisibility() == 0) {
                C970290bMB c970290bMB = C970290bMB.LIZ;
                C970290bMB.LJJIJ(EnumC970300bMC.PERSONAL_SCORE, true);
                return;
            }
            return;
        }
        this.LLLLLL = true;
        if (i > 2) {
            if (!C915980Zwa.LIZIZ().Dn0().isTakeTheStage()) {
                E2(this.LLLZZIL, this.LLZIL);
            }
            if (C970370bMJ.LJ()) {
                u2(this.LLZ);
            } else {
                C786410Ut5.LJZ(8, (FrameLayout) getHostScoreLayout().findViewById(R.id.i9b));
                getTeamScoreVisibilityController().LIZLLL(C2267881Dpi.LIZ);
            }
            if (!C915980Zwa.LIZIZ().Dn0().isTakeTheStage() && getHostScoreLayout().getVisibility() != 0) {
                LinearLayout hostScoreLayout = getHostScoreLayout();
                C786410Ut5.T4(hostScoreLayout, 0.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(hostScoreLayout, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(260L);
                objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.65f, 0.0f, 0.35f, 1.0f));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(objectAnimatorOfFloat);
                objectAnimatorOfFloat.addListener(new AAListenerS324S0100000_13(hostScoreLayout, 1));
                animatorSet.start();
                this.LLLLLIL = animatorSet;
            }
            HandlerHook.viewPost(this, new Runnable() { // from class: X.0bYk
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CoHostWindowView@cc83.battleStart$1");
                    try {
                        C970290bMB c970290bMB2 = C970290bMB.LIZ;
                        C970290bMB.LJJIJ(EnumC970300bMC.PERSONAL_SCORE, true);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CoHostWindowView@cc83.battleStart$1");
                }
            });
        }
    }

    @Override // X.InterfaceC956450azr
    public final void o(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onOnlineStateUpdate, linkMicId=");
        sbLIZ.append(getLinkMicId());
        sbLIZ.append(", state=");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        C20441214yg.LJIIIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        C956430azp viewPauseContainer = getViewPauseContainer();
        String linkMicId = getLinkMicId();
        AwS157S0101000_17 awS157S0101000_17 = new AwS157S0101000_17(i, this, 0);
        int i2 = C956430azp.LLJILJILJ;
        viewPauseContainer.LJ(i, linkMicId, awS157S0101000_17, false, false);
    }

    public final void o1(List<String> list) {
        if (list.isEmpty()) {
            C786410Ut5.LJJJJJL(this.LLJJLIIIJLLLLLLLZ);
            return;
        }
        for (int childCount = this.LLJJLIIIJLLLLLLLZ.getChildCount() - 1; -1 < childCount; childCount--) {
            if (!C13LP.LJJJJ(this.LLJJLIIIJLLLLLLLZ.getChildAt(childCount).getTag(), list)) {
                C786410Ut5.LJJLJ(childCount, this.LLJJLIIIJLLLLLLLZ);
            }
        }
    }

    public final void o2(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dealAnchorInfoMarginValue, marginBottom = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        C19MB c19mb = new C19MB();
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.dvs);
        c19mb.LJII(constraintLayout);
        c19mb.LJJIIJZLJL(R.id.i2t, 4, i);
        c19mb.LIZIZ(constraintLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7 A[PHI: r1
      0x00e7: PHI (r1v7 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:52:0x00e5, B:50:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r7) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC986770bml.onClick(android.view.View):void");
    }

    public final void onEvent(C257100z3 c257100z3) {
        FollowPair followPair;
        C954460awe c954460awe;
        if (c257100z3 != null && (followPair = c257100z3.LIZ) != null && (c954460awe = this.LLJILJILJ) != null && followPair.LIZ == c954460awe.LJ) {
            int i = followPair.followStatus;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            c954460awe.LJIJJLI = 3L;
                        }
                    } else {
                        c954460awe.LJIJJLI = 2L;
                    }
                } else {
                    c954460awe.LJIJJLI = 1L;
                }
            } else {
                c954460awe.LJIJJLI = 0L;
            }
            p2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039 A[PHI: r1
      0x0039: PHI (r1v7 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:9:0x0037, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(float r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "changeAnchorInfoMaxWidth, SCALE = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "CoHostWindowView"
            X.C20441214yg.LIZIZ(r0, r1)
            android.view.View r0 = r4.getViewAnchorInfo()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.19ME r1 = (X.C19ME) r1
            r1.matchConstraintPercentWidth = r5
            android.view.View r0 = r4.getViewAnchorInfo()
            X.C786410Ut5.W5(r0, r1)
            X.0awe r3 = r4.LLJILJILJ
            java.lang.String r2 = ""
            if (r3 == 0) goto L36
            X.0Tip r0 = r3.LJIJJ
            if (r0 == 0) goto L36
            java.lang.String r1 = r0.LIZ
            if (r1 != 0) goto L39
        L36:
            r1 = r2
            if (r3 == 0) goto L42
        L39:
            X.0Tip r0 = r3.LJIJJ
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.LIZIZ
            if (r0 == 0) goto L42
            r2 = r0
        L42:
            java.lang.String r1 = X.C0KVU.LIZIZ(r1, r2)
            if (r1 == 0) goto L55
            int r0 = r1.length()
            if (r0 <= 0) goto L55
            X.16F5 r0 = r4.getViewDisplayId()
            r0.setText(r1)
        L55:
            android.view.View r0 = r4.getViewAnchorInfo()
            r0.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC986770bml.s0(float):void");
    }

    public final void setBattleState(EnumC964170bCJ enumC964170bCJ) {
        this.LLLLLLJ = enumC964170bCJ;
    }

    public final void setCriticalDebuffList(List<C986810bmp> list) {
        this.LLJLLIL = list;
    }

    public final void setExtraTimeDebuffList(List<C986810bmp> list) {
        this.LLJLLL = list;
    }

    public final void setNextTurnLabelVisible(boolean z) {
        if (z) {
            C994580bzM takeTheStageNextTurn = getTakeTheStageNextTurn();
            if (takeTheStageNextTurn != null) {
                C500260Jjc.LLFFF(takeTheStageNextTurn);
                return;
            }
            return;
        }
        C994580bzM takeTheStageNextTurn2 = getTakeTheStageNextTurn();
        if (takeTheStageNextTurn2 != null) {
            C500260Jjc.LJIILIIL(takeTheStageNextTurn2);
        }
        C994580bzM takeTheStageNextTurn3 = getTakeTheStageNextTurn();
        if (takeTheStageNextTurn3 == null) {
            return;
        }
        takeTheStageNextTurn3.setCountdown(null);
    }

    public final void setRivalDebuffContainer(LinearLayout linearLayout) {
        this.LLJJLIIIJLLLLLLLZ = linearLayout;
    }

    public final void setSmokeDebuffList(List<C986810bmp> list) {
        this.LLJLL = list;
    }

    public final void setTeamMateCriticalBuffList(List<C986810bmp> list) {
        this.LLLFF = list;
    }

    public final void setTeamMateExtraTimeBuffList(List<C986810bmp> list) {
        this.LLLFFI = list;
    }

    public final void setTeamMateSmokeBuffList(List<C986810bmp> list) {
        this.LLLF = list;
    }

    public final void setTeamMateTop2BuffList(List<C986810bmp> list) {
        this.LLLFZ = list;
    }

    public final void setTeamMateTop3BuffList(List<C986810bmp> list) {
        this.LLLI = list;
    }

    public final void setTop2DebuffList(List<C986810bmp> list) {
        this.LLJZ = list;
    }

    public final void setTop3DebuffList(List<C986810bmp> list) {
        this.LLJZIJLIL = list;
    }

    public final void setVolumeBorderState(boolean z) {
        int i;
        Number numberValueOf;
        GradientDrawable gradientDrawable;
        C957020b0m c957020b0m;
        if (z) {
            i = R.attr.fxy;
        } else {
            i = R.attr.ewy;
        }
        ViewParent parent = getParent();
        GradientDrawable gradientDrawable2 = null;
        if ((parent instanceof C957020b0m) && (c957020b0m = (C957020b0m) parent) != null) {
            numberValueOf = Integer.valueOf(c957020b0m.getShapeDescriptor().LIZIZ);
        } else {
            numberValueOf = Float.valueOf(LLZZZIL);
        }
        View viewVolumeBorder = getViewVolumeBorder();
        Drawable background = getViewVolumeBorder().getBackground();
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setStroke(LLZZLLIL, C20736316Cj.LIZIZ(i, getContext()));
            gradientDrawable.setCornerRadius(numberValueOf.floatValue());
            gradientDrawable2 = gradientDrawable;
        }
        viewVolumeBorder.setBackground(gradientDrawable2);
    }

    public final void setWinOrLoseStreakIconOnClick(Function1<? super Boolean, Unit> function1) {
        getNewWinningStreakIcon().setOnClicked(new AwS594S0100000_15(function1, (Function1<? super PosIdentity, Unit>) 482));
        C786410Ut5.I7(new ACListenerS150S0100000_15(function1, 162), getLoseStreakIcon());
    }

    public final void u0(String str) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937840aVq interfaceC937840aVqLJI;
        Rect rectLJIIL;
        int iWidth;
        float fLIZIZ;
        Long lValueOf;
        C955080axe c955080axeLJIIJ;
        Rect rect;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeAnchorInfoMaxWidthInScreenShare");
        sbLIZ.append(" source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        ViewParent parent = getViewAnchorInfo().getParent();
        if (C963580bBM.LIZ()) {
            C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
            if (c955010axXI30 != null && (c955080axeLJIIJ = c955010axXI30.LJIIJ(getLinkMicId())) != null && (rect = c955080axeLJIIJ.LJFF) != null) {
                iWidth = rect.width();
            } else {
                return;
            }
        } else {
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL()) != null && (interfaceC937840aVqLJI = interfaceC937900aVwLLIIJLIL.LJI(getLinkMicId())) != null && (rectLJIIL = interfaceC937840aVqLJI.LJIIL()) != null) {
                iWidth = rectLJIIL.width();
            } else {
                return;
            }
        }
        if (iWidth > 0 && (parent instanceof ConstraintLayout)) {
            C19MB c19mb = new C19MB();
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            c19mb.LJII(constraintLayout);
            c19mb.LJFF(R.id.i2t);
            c19mb.LJIIIZ(R.id.i2t, 2, constraintLayout.getId(), 2, (int) C497740JfY.LIZIZ(6.0f));
            c19mb.LJIIIZ(R.id.i2t, 4, constraintLayout.getId(), 4, (int) C497740JfY.LIZIZ(6.0f));
            if (this.LLJJIJIIJIL) {
                fLIZIZ = C497740JfY.LIZIZ(36.0f);
            } else {
                fLIZIZ = C497740JfY.LIZIZ(12.0f);
            }
            int i = iWidth - ((int) fLIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("changeAnchorInfoMaxWidthInScreenShare");
            sbLIZ2.append(" source = ");
            sbLIZ2.append(str);
            sbLIZ2.append(" user = ");
            C954460awe c954460awe = this.LLJILJILJ;
            if (c954460awe != null) {
                lValueOf = Long.valueOf(c954460awe.LJ);
            } else {
                lValueOf = null;
            }
            sbLIZ2.append(lValueOf);
            sbLIZ2.append(", windowWidth = ");
            sbLIZ2.append(iWidth);
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ2));
            c19mb.LJIILIIL(R.id.i2t, i);
            c19mb.LJIIJJI(R.id.i2t, (int) C497740JfY.LIZIZ(22.0f));
            c19mb.LIZIZ(constraintLayout);
        }
    }

    public final void u2(long j) {
        Object objGg0;
        boolean z;
        float f;
        if (Q1()) {
            return;
        }
        getTeamScoreVisibilityController().LIZLLL(C2267901Dpk.LIZ);
        FrameLayout frameLayout = (FrameLayout) getHostScoreLayout().findViewById(R.id.i9b);
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        C1324720kZq c1324720kZq = (C1324720kZq) getHostScoreLayout().findViewById(R.id.u22);
        TextView textView = (TextView) getHostScoreLayout().findViewById(R.id.tv_rank);
        DataChannel dataChannel = this.LLJJJIL;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(BattleSmokeDebuffChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 == EnumC919030a1V.EFFECTING) {
            z = true;
        } else {
            z = false;
        }
        c1324720kZq.setActualImageResource(R.drawable.evi);
        getHostScoreLayout().setBackground(C497740JfY.LJIIJ(R.drawable.dzx));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isrivalSmokeEffecting = ");
        sbLIZ.append(z);
        sbLIZ.append(" ,rivalContaiiner = ");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ.getChildCount());
        C20441214yg.LJ("SmokeIndividual", C2188811AlT.LIZIZ(sbLIZ));
        if (j == 0) {
            C786410Ut5.LLIL(textView, 8);
            C786410Ut5.LLJJIII(c1324720kZq, 0);
            if (z) {
                C786410Ut5.h5(c1324720kZq, 0.5f);
            } else {
                C786410Ut5.h5(c1324720kZq, 1.0f);
            }
            setRankBgLayoutWidth(22.0f);
        } else {
            if (this.LLZLLIL == 0) {
                this.LLZLLIL = (int) ((TextView) getHostScoreLayout().findViewById(R.id.u23)).getPaint().measureText(C497740JfY.LJIJI(2131853302));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preMeasure, width = ");
                sbLIZ2.append(this.LLZLLIL);
                C20441214yg.LJIIIZ("individualMatch", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (this.LLZLLIL >= ((int) C497740JfY.LIZIZ(24.0f))) {
                textView.setTextSize(8.0f);
            } else {
                if (S0()) {
                    f = 10.0f;
                } else {
                    f = 12.0f;
                }
                textView.setTextSize(f);
            }
            textView.setText(C982410bfj.LIZ(j));
            if (z) {
                C786410Ut5.LLIL(textView, 8);
                C786410Ut5.LLJJIII(c1324720kZq, 0);
                C786410Ut5.h5(c1324720kZq, 0.5f);
                setRankBgLayoutWidth(22.0f);
            } else {
                C786410Ut5.LLIL(textView, 0);
                C786410Ut5.LLJJIII(c1324720kZq, 8);
                C786410Ut5.h5(c1324720kZq, 1.0f);
                setRankBgLayoutWidth(30.0f);
            }
        }
        int currentHostOrder = getCurrentHostOrder();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateBackgroundColorByIndividualHostOrder, currentOrder=");
        sbLIZ3.append(currentHostOrder);
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ3));
        FrameLayout frameLayout2 = (FrameLayout) getHostScoreLayout().findViewById(R.id.i9b);
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(0, frameLayout2);
            if (currentHostOrder != 0) {
                if (currentHostOrder != 1) {
                    if (currentHostOrder != 2) {
                        if (currentHostOrder != 3) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("Error order!! ");
                            sbLIZ4.append(currentHostOrder);
                            C20441214yg.LJ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ4));
                        } else {
                            frameLayout2.setBackgroundResource(R.drawable.duq);
                        }
                    } else {
                        frameLayout2.setBackgroundResource(R.drawable.dup);
                    }
                } else {
                    frameLayout2.setBackgroundResource(R.drawable.f654duo);
                }
            } else {
                frameLayout2.setBackgroundResource(R.drawable.dun);
            }
        }
        View viewI0 = I0();
        if (viewI0 != null) {
            c1((ImageView) viewI0.findViewById(R.id.le8), null);
        }
        C786410Ut5.R7(getHostScoreLayout(), new ACListenerS150S0100000_15(this, 205));
    }

    public final void v2(boolean z) {
        ImageModel imageModel;
        if (Q1()) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) getHostScoreLayout().findViewById(R.id.i9b);
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
            frameLayout.setBackgroundResource(0);
        }
        TextView textView = (TextView) getHostScoreLayout().findViewById(R.id.tv_rank);
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
            textView.setText("");
        }
        if (C978520bZS.LJIIJJI() && C970370bMJ.LJIIJ() && !S0()) {
            C1324720kZq teamScoreIv = getTeamScoreIv();
            GiftMode giftModeLJFF = C978520bZS.LJFF();
            if (giftModeLJFF != null) {
                imageModel = giftModeLJFF.giftIconImage;
            } else {
                imageModel = null;
            }
            C0JSS.LIZLLL(teamScoreIv, imageModel);
            getEnlargeTeamScore().setBackground(null);
            getTeamScoreVisibilityController().LIZLLL(C2267881Dpi.LIZ);
            if (z) {
                getHostScoreLayout().setBackground(C497740JfY.LJIIJ(R.drawable.e1m));
            } else {
                getHostScoreLayout().setBackground(C497740JfY.LJIIJ(R.drawable.e1k));
            }
        } else {
            if (z) {
                getTeamScoreIv().setActualImageResource(R.drawable.f2_);
                getEnlargeTeamScore().setBackground(C497740JfY.LJIIJ(R.drawable.dun));
            } else {
                getTeamScoreIv().setActualImageResource(R.drawable.f2b);
                getEnlargeTeamScore().setBackground(C497740JfY.LJIIJ(R.drawable.f654duo));
            }
            getTeamScoreVisibilityController().LIZLLL(C2267881Dpi.LIZ);
            getHostScoreLayout().setBackground(C497740JfY.LJIIJ(R.drawable.dzx));
        }
        C786410Ut5.R7(getHostScoreLayout(), new ACListenerS150S0100000_15(this, 207));
    }

    public final void w2(int i) {
        C786410Ut5.LJZL(i, getHostScoreLayout());
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E2(long r18, long r20) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC986770bml.E2(long, long):void");
    }

    @Override // X.InterfaceC956450azr
    public final void LLD(int i, boolean z) {
        DataChannel dataChannel;
        float f;
        DataChannel dataChannel2;
        int visibility = getViewMuteAudienceStatus().getVisibility();
        if (z) {
            getViewMuteAudienceStatus().setImageResource(R.drawable.ewl);
            C500260Jjc.LLFFF(getViewMuteAudienceStatus());
        } else {
            DataChannel dataChannel3 = this.LLJJJIL;
            if (dataChannel3 != null && C500260Jjc.LJIIZILJ(dataChannel3)) {
                getViewMuteAudienceStatus().setImageResource(R.drawable.ewp);
                C500260Jjc.LLFFF(getViewMuteAudienceStatus());
            } else {
                C500260Jjc.LJIILIIL(getViewMuteAudienceStatus());
            }
        }
        if (getViewMuteAudienceStatus().getVisibility() != visibility) {
            if (C915980Zwa.LJII().LLLLJ() == EnumC955820ayq.COHOST_MODE_SCREEN_SHARE) {
                C20441214yg.LIZIZ("CoHostWindowView", "setAudienceMuteState changeAnchorInfoMaxWidthInScreenShare");
                u0("setAudienceMuteState");
            } else {
                if (this.LLLLZLLIL) {
                    f = 1.0f;
                } else {
                    if (i == 0) {
                        C915980Zwa.LJII().LJIJJ().size();
                    }
                    if (z || ((dataChannel2 = this.LLJJJIL) != null && C500260Jjc.LJIIZILJ(dataChannel2))) {
                        f = 0.5f;
                    } else {
                        f = 0.43f;
                    }
                }
                s0(f);
            }
        }
        if (this.LLJJI != z && z && (dataChannel = this.LLJJJIL) != null && !C500260Jjc.LJIIZILJ(dataChannel) && this.LLJILJILJ != null && !O0()) {
            C766270U4b.LJIIJJI(C786410Ut5.j4(getContext().getString(2131842785), Arrays.copyOf(new Object[]{getCurrentRoomAnchorDisplayName()}, 1)));
        }
        this.LLJJI = z;
        H2(z);
        HandlerHook.viewPost(this, new Runnable() { // from class: X.0b2a
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CoHostWindowView@cc83.updateMuteIcon$1");
                try {
                    Map<String, Boolean> map = C958110b2X.LIZ;
                    C958110b2X.LJIILL(EnumC958120b2Y.MUTE_BUTTON);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CoHostWindowView@cc83.updateMuteIcon$1");
            }
        });
    }

    public final void W1(boolean z, boolean z2) {
        String str;
        C754570Tip c754570Tip;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C954460awe c954460awe = this.LLJILJILJ;
        if (c954460awe != null && (c754570Tip = c954460awe.LJIJJ) != null) {
            str = c754570Tip.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" showTakeTheStageBottomShadowLayout show:");
        sbLIZ.append(z);
        sbLIZ.append(" isTakeStageV3:");
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (z2) {
                View takeStageMarqueeContainer = getTakeStageMarqueeContainer();
                if (takeStageMarqueeContainer != null) {
                    C500260Jjc.LJLJLJ(takeStageMarqueeContainer, true);
                }
                C1086750eO1 takeStageMarqueeTextView = getTakeStageMarqueeTextView();
                if (takeStageMarqueeTextView != null) {
                    C500260Jjc.LJLJLJ(takeStageMarqueeTextView, true);
                }
                View takeTheStageBottomShadowViewV2 = getTakeTheStageBottomShadowViewV2();
                if (takeTheStageBottomShadowViewV2 != null) {
                    C500260Jjc.LJLJLJ(takeTheStageBottomShadowViewV2, false);
                    return;
                }
                return;
            }
            View takeStageMarqueeContainer2 = getTakeStageMarqueeContainer();
            if (takeStageMarqueeContainer2 != null) {
                C500260Jjc.LJLJLJ(takeStageMarqueeContainer2, false);
            }
            C1086750eO1 takeStageMarqueeTextView2 = getTakeStageMarqueeTextView();
            if (takeStageMarqueeTextView2 != null) {
                C500260Jjc.LJLJLJ(takeStageMarqueeTextView2, false);
            }
            View takeTheStageBottomShadowViewV22 = getTakeTheStageBottomShadowViewV2();
            if (takeTheStageBottomShadowViewV22 == null) {
                return;
            }
            C500260Jjc.LJLJLJ(takeTheStageBottomShadowViewV22, true);
            return;
        }
        View takeStageMarqueeContainer3 = getTakeStageMarqueeContainer();
        if (takeStageMarqueeContainer3 != null) {
            C500260Jjc.LJLJLJ(takeStageMarqueeContainer3, false);
        }
        C1086750eO1 takeStageMarqueeTextView3 = getTakeStageMarqueeTextView();
        if (takeStageMarqueeTextView3 != null) {
            C500260Jjc.LJLJLJ(takeStageMarqueeTextView3, false);
        }
        View takeTheStageBottomShadowViewV23 = getTakeTheStageBottomShadowViewV2();
        if (takeTheStageBottomShadowViewV23 == null) {
            return;
        }
        C500260Jjc.LJLJLJ(takeTheStageBottomShadowViewV23, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r3 == r1) goto L11;
     */
    @Override // X.InterfaceC956450azr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(int r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = S0()
            r6 = 0
            if (r0 == 0) goto L1e
            X.0bme r1 = X.C986680bmc.LIZ()
            boolean r0 = r1 instanceof X.C986690bmd
            r5 = 1
            if (r0 == 0) goto L25
            X.0bmd r1 = (X.C986690bmd) r1
            long r3 = r1.LIZIZ
            X.0awe r0 = r7.LLJILJILJ
            if (r0 == 0) goto L22
            long r1 = r0.LJ
        L1a:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
        L1e:
            r7.setVolumeBorderState(r6)
            return
        L22:
            r1 = 0
            goto L1a
        L25:
            X.0abP r2 = r7.getRippleHandler()
            kotlin.jvm.internal.AwS561S0100000_17 r1 = new kotlin.jvm.internal.AwS561S0100000_17
            r0 = 390(0x186, float:5.47E-43)
            r1.<init>(r7, r0)
            boolean r1 = r2.LJFF(r8, r1)
            boolean r0 = r7.LLJJI
            if (r0 != 0) goto L3f
            if (r9 == 0) goto L3f
            if (r1 == 0) goto L3f
            r7.setVolumeBorderState(r5)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC986770bml.Z(int, boolean):void");
    }

    public final void a1(int i, EnumC919030a1V enumC919030a1V) {
        long j;
        C20441214yg.LIZIZ("CoHostWindowView", "notifyFeUsingTop2Top3Cards in cohost window");
        if (C970370bMJ.LJ()) {
            Iterator<C954460awe> it2 = C915980Zwa.LJII().LJJLI().iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().LJIIJJI, getLinkMicId())) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            j = ((long) i2) + 1;
        } else {
            j = 2;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_match_in_battling", C915980Zwa.LJFF().Nt());
        jSONObject.put("team_id", j);
        jSONObject.put("card_type", i);
        jSONObject.put("card_effect_state", enumC919030a1V.ordinal());
        C389001fE.LIZ("USING_MATCH_POWER_UPS_CARD", jSONObject, System.currentTimeMillis(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b1(java.lang.String r16, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r17) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC986770bml.b1(java.lang.String, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE):void");
    }

    public final void b2(BattleComboInfo battleComboInfo, boolean z) {
        BattleFeatureFlags battleFeatureFlagsLIZJ;
        if (getNewWinningStreakIcon().getInfo() == null) {
            C20441214yg.LJIIIZ("CoHostWindowView", "showUpdateWinStreakAni info is null ");
            getNewWinningStreakIcon().LIZ(battleComboInfo);
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (battleFeatureFlagsLIZJ = interfaceC973730bRjYf2.LIZJ()) != null && battleFeatureFlagsLIZJ.hideComboCountOnStart && !z && battleComboInfo.comboCount <= 0) {
            getStreakVisibilityController().LIZLLL(C989030bqP.LIZ);
        } else {
            getStreakVisibilityController().LIZLLL(new C989010bqN(new AwS418S0200000_17(this, battleComboInfo, 68)));
            l2(battleComboInfo, z, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c1(android.widget.ImageView r4, X.C1144750ftZ r5) {
        /*
            r3 = this;
            com.bytedance.android.live.liveinteract.match.service.ILiveMatchService r0 = X.C915980Zwa.LJFF()
            X.0a1j r1 = r0.xB0()
            X.0a1j r0 = X.EnumC919170a1j.MATCH_TYPE_INDIVIDUAL
            if (r1 != r0) goto L42
            r2 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.Qb(r4, r2)
            int r1 = r3.getCurrentHostOrder()
            r0 = 2
            if (r1 == r0) goto L2b
            r0 = 3
            if (r1 != r0) goto L42
            java.lang.String r2 = "ttlive_icon_rival_hammer_purple.png"
        L1d:
            java.util.List<X.0bmp> r0 = r3.LLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            java.lang.String r0 = "tiktok_live_interaction_demand_1"
            Y0(r4, r0, r2, r5, r1)
            return
        L2b:
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            java.util.List r0 = r0.LJJLI()
            int r1 = r0.size()
            r0 = 4
            if (r1 != r0) goto L3c
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3c:
            X.C786410Ut5.Qb(r4, r2)
            java.lang.String r2 = "ttlive_icon_rival_hammer_orange.png"
            goto L1d
        L42:
            java.lang.String r2 = "ttlive_icon_rival_hammer.png"
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC986770bml.c1(android.widget.ImageView, X.0ftZ):void");
    }

    public final void e0(long j, TuxTextView tuxTextView) {
        float f = 0.0f;
        if (!this.LLJJIJIIJIL && j >= 1000000) {
            tuxTextView.setText("1M+");
            float textSize = tuxTextView.getTextSize();
            if (textSize > 0.0f) {
                f = (-0.8f) / textSize;
            }
            tuxTextView.setLetterSpacing(f);
            return;
        }
        tuxTextView.setText(C944330agJ.LIZ(j));
        tuxTextView.setLetterSpacing(0.0f);
    }

    public final void y2(Integer num, MatchBaseWidget matchBaseWidget) {
        C994580bzM takeTheStageNextTurn = getTakeTheStageNextTurn();
        if (takeTheStageNextTurn != null && takeTheStageNextTurn.getVisibility() == 0) {
            takeTheStageNextTurn.setLifecycleOwner(matchBaseWidget);
            takeTheStageNextTurn.setCountdown(num);
        }
    }

    public static void M1(int i, int i2, View view) {
        if (view != null && i >= 0) {
            if (i2 != 3 && i2 != 4) {
                return;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof ConstraintLayout)) {
                C20441214yg.LJ("CoHostWindowView", "View's parent is not ConstraintLayout");
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof C19ME)) {
                C20441214yg.LJ("CoHostWindowView", "View is not configured by ConstraintLayout.LayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i2 != 3) {
                if (marginLayoutParams.bottomMargin == i) {
                    return;
                }
            } else if (marginLayoutParams.topMargin == i) {
                return;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJJIIJZLJL(view.getId(), i2, i);
            c19mb.LIZIZ(constraintLayout);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z0(X.C986810bmp r10, boolean r11, boolean r12) {
        /*
            r9 = this;
            if (r12 == 0) goto L3
            return
        L3:
            com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r0 = r10.LIZIZ
            if (r0 != 0) goto L8
            return
        L8:
            int r1 = r0.itemType
            r0 = 1
            if (r1 == r0) goto L62
            r0 = 2
            if (r1 == r0) goto L5b
            r0 = 3
            if (r1 == r0) goto L54
            r0 = 4
            if (r1 == r0) goto L4b
            r0 = 7
            if (r1 == r0) goto L44
            r0 = 8
            if (r1 == r0) goto L3d
            r0 = 9
            if (r1 == r0) goto L62
            r4 = 0
        L22:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r9.LLJJJIL
            if (r2 == 0) goto L39
            java.lang.Class<com.bytedance.android.live.liveinteract.match.business.event.BattleItemDebuffIconNotifications> r1 = com.bytedance.android.live.liveinteract.match.business.event.BattleItemDebuffIconNotifications.class
            X.0ftY r3 = new X.0ftY
            X.0awe r0 = r9.LLJILJILJ
            if (r0 == 0) goto L3a
            long r5 = r0.LJ
        L30:
            com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r7 = r10.LIZIZ
            r8 = r11
            r3.<init>(r4, r5, r7, r8)
            r2.zW(r1, r3)
        L39:
            return
        L3a:
            r5 = 0
            goto L30
        L3d:
            java.util.List<X.0bmp> r0 = r9.LLJZIJLIL
            int r4 = r0.size()
            goto L22
        L44:
            java.util.List<X.0bmp> r0 = r9.LLJZ
            int r4 = r0.size()
            goto L22
        L4b:
            java.util.List<X.0bmp> r0 = r9.LLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r0.size()
            goto L22
        L54:
            java.util.List<X.0bmp> r0 = r9.LLJLLL
            int r4 = r0.size()
            goto L22
        L5b:
            java.util.List<X.0bmp> r0 = r9.LLJLL
            int r4 = r0.size()
            goto L22
        L62:
            java.util.List<X.0bmp> r0 = r9.LLJLLIL
            int r4 = r0.size()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC986770bml.Z0(X.0bmp, boolean, boolean):void");
    }

    @Override // X.InterfaceC956450azr
    public final void i(C954460awe c954460awe, int i, int i2) {
        C954460awe c954460awe2;
        if (!TextUtils.equals(c954460awe.LJIIJJI, getLinkMicId())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateCoHostUser, return, user.linkMicId != linkMicId, new_linkMicId=");
            sbLIZ.append(c954460awe.LJIIJJI);
            sbLIZ.append(", old_linkMicId=");
            sbLIZ.append(getLinkMicId());
            sbLIZ.append(", user = ");
            sbLIZ.append(c954460awe);
            C20441214yg.LJIIIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateCoHostUser, linkMicId = ");
        sbLIZ2.append(getLinkMicId());
        sbLIZ2.append(", linkedUserSize = ");
        sbLIZ2.append(i);
        sbLIZ2.append(", user = ");
        sbLIZ2.append(c954460awe);
        C20441214yg.LJIIIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLJILJILJ = c954460awe;
        this.LLJILLL = i;
        setupAnchorInfo(i2);
        if (this.LLJILJIL && (c954460awe2 = this.LLJILJILJ) != null && c954460awe2.LJI() && this.LLJILLL == 3) {
            this.LLJILJIL = false;
            C500260Jjc.LJLJLJ(getViewStartAnim(), true);
            C1851760yHu viewStartAnim = getViewStartAnim();
            viewStartAnim.getClass();
            HandlerHook.viewPost(viewStartAnim, new ARunnableS115S0100000_15(viewStartAnim, 112));
        }
        O2();
        Q1();
        C956430azp viewPauseContainer = getViewPauseContainer();
        viewPauseContainer.LLILLL = i;
        viewPauseContainer.LLILZLL = c954460awe;
        boolean zP0 = p0();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateEnigmaSideIcon: enigmaSideIconShowing ");
        sbLIZ3.append(LLZZ);
        sbLIZ3.append(", canShowEffectCountDownIcon ");
        sbLIZ3.append(zP0);
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ3));
        if (LLZZ && zP0) {
            Iterator<View> it2 = new C09RD(this.LLJJLIIIJLLLLLLLZ).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                }
                Object next = c09re.next();
                if (Intrinsics.LJFF(((View) next).getTag(), "enigma_side_icon")) {
                    if (next != null && this.LLJJLIIIJLLLLLLLZ.getVisibility() != 0) {
                        C500260Jjc.LLFFF(this.LLJJLIIIJLLLLLLLZ);
                    }
                }
            }
        }
        T1();
        AbstractC986700bme abstractC986700bmeLIZ = C986680bmc.LIZ();
        getMatchLayoutCoordinator().LIZ(abstractC986700bmeLIZ);
        getStreakVisibilityController().LIZ(abstractC986700bmeLIZ);
        getAnchorInfoVisibilityController().LIZ(abstractC986700bmeLIZ);
        getStreakVisibilityController().LIZJ();
        getAnchorInfoVisibilityController().LIZJ();
    }

    public final void l2(BattleComboInfo battleComboInfo, boolean z, boolean z2) {
        String str;
        if (z) {
            str = "update";
        } else {
            str = "show";
        }
        long battleId = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("streak_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(((LinkedHashMap) this.LLLZLL).get(strLIZIZ), Long.valueOf(battleId))) {
            return;
        }
        this.LLLZLL.put(strLIZIZ, Long.valueOf(battleId));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pk_win_streak_show");
        c474500IjALIZ.LJJII(str, "report_time");
        C963300bAu.LIZIZ(c474500IjALIZ, battleComboInfo, z2);
        c474500IjALIZ.LIZ();
    }

    public static void I2(ViewOnClickListenerC986770bml viewOnClickListenerC986770bml, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) == 0 && z) {
            viewOnClickListenerC986770bml.getClass();
            i = C439101nJ.LIZ(8);
        }
        M1(i, 4, viewOnClickListenerC986770bml.getViewAnchorInfo());
    }

    public final void V1(BattleComboInfo battleComboInfo, GiftGalleryBadgeInfo giftGalleryBadgeInfo, boolean z, boolean z2) {
        if (giftGalleryBadgeInfo == null) {
            getStreakVisibilityController().LIZLLL(C989030bqP.LIZ);
            return;
        }
        getRankBadge().LIZIZ(giftGalleryBadgeInfo, true);
        setRankBadgeClick(giftGalleryBadgeInfo);
        getStreakVisibilityController().LIZLLL(new C989000bqM(new AwS0S0320000_15(z2, this, z, battleComboInfo, giftGalleryBadgeInfo, 4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c2(final android.widget.ProgressBar r19, final android.view.View r20, final int r21, final boolean r22) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC986770bml.c2(android.widget.ProgressBar, android.view.View, int, boolean):void");
    }

    public static void A2(ViewOnClickListenerC986770bml viewOnClickListenerC986770bml, int i, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) == 0 && z) {
            viewOnClickListenerC986770bml.getClass();
            i2 = C439101nJ.LIZ(0);
        }
        M1(i2, i, viewOnClickListenerC986770bml.getTakeTheStageLayout());
    }

    public static void Y0(ImageView imageView, String str, String str2, final C1144750ftZ c1144750ftZ, final int i) {
        C1143680frq.LJFF(imageView, str, str2, ImageView.ScaleType.CENTER_CROP, new C0IYA() { // from class: X.0ftV
            @Override // X.C0IYA
            public final void LJ(boolean z) {
                C1144750ftZ c1144750ftZ2;
                if (z && (c1144750ftZ2 = c1144750ftZ) != null) {
                    int i2 = i;
                    Pair pairLJIL = C1144630ftN.LJIL(c1144750ftZ2);
                    EnumC1144570ftH enumC1144570ftH = (EnumC1144570ftH) pairLJIL.getFirst();
                    C1144590ftJ c1144590ftJ = (C1144590ftJ) pairLJIL.getSecond();
                    C1144630ftN.LJIJJ(c1144590ftJ.LIZIZ, c1144750ftZ2);
                    C0K04.LIZLLL(i2, "count", c1144590ftJ.LIZIZ);
                    C1144630ftN.LJJIJIIJIL(enumC1144570ftH, "show_stream_icon", c1144590ftJ);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0199  */
    @Override // X.InterfaceC956450azr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFZ(int r13, android.graphics.Rect r14, int r15, tikcast.linkmic.common.CohostTypeSpotExtra r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC986770bml.LLFZ(int, android.graphics.Rect, int, tikcast.linkmic.common.CohostTypeSpotExtra, boolean):void");
    }

    public final void X1(long j, long j2, int i, Integer num, boolean z) {
        String str;
        Drawable background;
        int i2;
        Drawable background2;
        String str2;
        C754570Tip c754570Tip;
        C754570Tip c754570Tip2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C954460awe c954460awe = this.LLJILJILJ;
        if (c954460awe != null && (c754570Tip2 = c954460awe.LJIJJ) != null) {
            str = c754570Tip2.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" showTakeTheStageScoreRankInEqualState");
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLLZLLIL = false;
        this.LLLLZLLLI = -1;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.dvs);
        if (!this.LLLZI) {
            this.LLLZ = false;
            this.LLLZI = true;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            C954460awe c954460awe2 = this.LLJILJILJ;
            if (c954460awe2 != null && (c754570Tip = c954460awe2.LJIJJ) != null) {
                str2 = c754570Tip.LIZIZ;
            } else {
                str2 = null;
            }
            sbLIZ2.append(str2);
            sbLIZ2.append(" showTakeTheStageScoreRankInEqualState takeTheStageFinalCallConfigScore==true");
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ2));
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJIIIZ(R.id.mgm, 1, 0, 1, C439101nJ.LIZ(8));
            c19mb.LJI(R.id.mgm, 3);
            c19mb.LJI(R.id.mgm, 2);
            c19mb.LJIIIZ(R.id.mgm, 4, 0, 4, C439101nJ.LIZ(8));
            c19mb.LIZIZ(constraintLayout);
        }
        C500260Jjc.LLFFF(getTakeTheStageLayout());
        ViewGroup takeTheStageRankLayout = getTakeTheStageRankLayout();
        if (takeTheStageRankLayout != null && (background2 = takeTheStageRankLayout.getBackground()) != null) {
            background2.setTint(i);
        }
        y2(null, null);
        C994580bzM takeTheStageNextTurn = getTakeTheStageNextTurn();
        if (takeTheStageNextTurn != null) {
            C500260Jjc.LJIILIIL(takeTheStageNextTurn);
        }
        if (j > 0 && j2 >= 0) {
            C16F5 takeTheStageRankText = getTakeTheStageRankText();
            if (takeTheStageRankText != null) {
                if (z) {
                    i2 = R.style.a9h;
                } else {
                    i2 = R.style.a9i;
                }
                takeTheStageRankText.LJJJI(i2);
            }
            if (z) {
                if (num != null) {
                    int iIntValue = num.intValue();
                    View takeTheStageLayout = getTakeTheStageLayout();
                    if (takeTheStageLayout != null && (background = takeTheStageLayout.getBackground()) != null) {
                        background.setTint(iIntValue);
                    }
                }
                if (j == 1) {
                    View takeTheStageRankCrownImageView = getTakeTheStageRankCrownImageView();
                    if ((takeTheStageRankCrownImageView instanceof C1324720kZq) && takeTheStageRankCrownImageView != null) {
                        C1143680frq.LJ(takeTheStageRankCrownImageView, "tiktok_live_interaction_demand_25", "ttlive_icon_take_the_stage_1st_rank_crown.png", ImageView.ScaleType.FIT_XY);
                    }
                    C500260Jjc.LLFFF(getTakeTheStageRankCrownImageView());
                    C500260Jjc.LJIILIIL(getTakeTheStageRankText());
                    C500260Jjc.LJIILIIL(getTakeTheStageRankNoGiftImageView());
                } else {
                    C500260Jjc.LJIILIIL(getTakeTheStageRankCrownImageView());
                    C16F5 takeTheStageRankText2 = getTakeTheStageRankText();
                    if (takeTheStageRankText2 != null) {
                        takeTheStageRankText2.setText(C982410bfj.LIZ(j));
                    }
                    C16F5 takeTheStageRankText3 = getTakeTheStageRankText();
                    if (takeTheStageRankText3 != null) {
                        takeTheStageRankText3.setTextColor(C20736316Cj.LIZIZ(R.attr.eq9, getContext()));
                    }
                    C500260Jjc.LLFFF(getTakeTheStageRankText());
                    C500260Jjc.LJIILIIL(getTakeTheStageRankNoGiftImageView());
                }
            } else {
                C500260Jjc.LJIILIIL(getTakeTheStageRankCrownImageView());
                C16F5 takeTheStageRankText4 = getTakeTheStageRankText();
                if (takeTheStageRankText4 != null) {
                    takeTheStageRankText4.setText(C982410bfj.LIZ(j));
                }
                C500260Jjc.LLFFF(getTakeTheStageRankText());
                C500260Jjc.LJIILIIL(getTakeTheStageRankNoGiftImageView());
            }
        } else {
            C500260Jjc.LJIILIIL(getTakeTheStageRankCrownImageView());
            C500260Jjc.LJIILIIL(getTakeTheStageRankText());
            if (z) {
                n0();
            } else {
                View takeTheStageRankNoGiftImageView = getTakeTheStageRankNoGiftImageView();
                if (takeTheStageRankNoGiftImageView != null) {
                    takeTheStageRankNoGiftImageView.setBackgroundResource(R.drawable.evi);
                }
            }
            C500260Jjc.LLFFF(getTakeTheStageRankNoGiftImageView());
        }
        C500260Jjc.LLFFF(getTakeTheStageScoreText());
        C16F5 takeTheStageScoreText = getTakeTheStageScoreText();
        if (takeTheStageScoreText != null) {
            takeTheStageScoreText.setText(C1850730yGF.LIZJ(j2));
        }
        e1();
        m2();
        s0(0.43f);
        H2(this.LLJJI);
        O2();
        setBackgroundDrawable(null);
        I1(z);
    }

    public final void i0(String str, DataChannel dataChannel, int i, boolean z, boolean z2) {
        boolean zBooleanValue;
        long id;
        boolean zCoHostCanLike$livesetting_release;
        float f;
        C985820blE c985820blE;
        Boolean bool;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, linkMicId = ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        Room room = null;
        if (CoHostWidgetWindowLayoutCacheSetting.INSTANCE.isEnableWindowView()) {
            h1();
            g1();
            C500260Jjc.LJIILIIL(getViewContainerClickView());
            C500260Jjc.LLFFF(getViewContainerBg());
            C500260Jjc.LJIILIIL(getViewMuteAudienceStatus());
            if (!this.LLJJIJI || !C963580bBM.LIZ()) {
                C500260Jjc.LLFFF(getViewPauseContainer());
            }
            C500260Jjc.LJIILIIL(getViewStartAnim());
            C500260Jjc.LJIILIIL(getViewScreenShareInfo());
            if (!this.LLJJIJI || !C963580bBM.LIZ()) {
                C786410Ut5.LLLIZZ(getViewLoading(), 0);
            }
            C500260Jjc.LJIILIIL(getViewFollowStatus());
            C500260Jjc.LJIILIIL(getViewDisplayId());
            this.LLJILJIL = true;
            this.LLJILJILJ = null;
            this.LLJILLL = 0;
            this.LLJJ = EnumC918810a19.StateInit;
            this.LLJJI = false;
            C19MB c19mb = new C19MB();
            c19mb.LJII((ConstraintLayout) findViewById(R.id.dvs));
            int id2 = getViewAnchorInfo().getId();
            int i2 = LLZZJLIL;
            c19mb.LJJIIJZLJL(id2, 4, i2);
            c19mb.LJJIIJZLJL(getViewAnchorInfo().getId(), 7, i2);
            c19mb.LJIILJJIL(0.43f, getViewAnchorInfo().getId());
            c19mb.LJIIJJI(getViewAnchorInfo().getId(), C439101nJ.LIZ(22));
            c19mb.LJIIIIZZ(getViewAnchorInfo().getId(), 1, R.id.mbg, 2);
            c19mb.LJIIIIZZ(getViewAnchorInfo().getId(), 2, 0, 2);
            c19mb.LJIIIIZZ(getViewAnchorInfo().getId(), 4, 0, 4);
            c19mb.LIZIZ(getViewContainerRoot());
            getAnchorInfoVisibilityController().LIZLLL(C2267861Dpg.LIZ);
            C786410Ut5.T4(getViewAnchorInfo(), 1.0f);
            C20441214yg.LJ("lipengwei", "viewAnchorInfo.visibility viewAnchorInfo.setVisible alpha to 1 14 ");
        }
        setTag(str);
        this.LLJJIJIL = str;
        this.LLJJJIL = dataChannel;
        this.LLJJJ = i;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        }
        this.LLJJJJ = room;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJJIJIIJIL = zBooleanValue;
        IBarrageService iBarrageService = (IBarrageService) C1161920gLG.LIZJ(IBarrageService.class);
        Room room2 = this.LLJJJJ;
        if (room2 != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        this.LLJIJIL = iBarrageService.O41(id);
        this.LLJJIJI = z2;
        if (this.LLJJIJIIJIL) {
            zCoHostCanLike$livesetting_release = LiveLikeContinueAreaExpandAnchorSetting.INSTANCE.coHostCanLike$livesetting_release();
        } else {
            zCoHostCanLike$livesetting_release = LiveLikeContinueAreaExpandAudienceSetting.INSTANCE.coHostCanLike$livesetting_release();
        }
        this.LLLZL = zCoHostCanLike$livesetting_release;
        C786410Ut5.LLIZ(getRivalPowerUpScrollNew(), 0);
        LinearLayout lnRivalPowerUpsNew = getLnRivalPowerUpsNew();
        this.LLJJLIIIJLLLLLLLZ = lnRivalPowerUpsNew;
        C786410Ut5.LJJJJJL(lnRivalPowerUpsNew);
        C915980Zwa.LJII().LJIJJ().size();
        if (C915980Zwa.LJII().LLLLJ() == EnumC955820ayq.COHOST_MODE_SCREEN_SHARE) {
            u0("initAnchorInfo");
        } else if (this.LLJJIJIIJIL) {
            s0(0.35f);
        } else {
            if (getViewMuteAudienceStatus().getVisibility() == 0) {
                f = 0.44f;
            } else {
                f = 0.39f;
            }
            s0(f);
        }
        setUpLocalTestInfo(z);
        if (dataChannel != null && (c985820blE = (C985820blE) dataChannel.gg0(BattleHighScoreFormatUpdateChannel.class)) != null) {
            this.LLLLL = c985820blE;
        }
    }

    public final void t2(long j, boolean z, long j2, EnumC919170a1j enumC919170a1j, long j3) {
        if (enumC919170a1j == EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE) {
            return;
        }
        if (enumC919170a1j == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL && C915980Zwa.LJII().LLILZLL(true).size() > 2) {
            u2(j2);
        } else {
            v2(z);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateHostScore, isMatching = ");
        sbLIZ.append(this.LLLLLL);
        sbLIZ.append(" and inmatch = ");
        sbLIZ.append(C915980Zwa.LJFF().co0());
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        if (!Q1()) {
            if (getHostScoreLayout().getVisibility() != 0 && (this.LLLLLL || C915980Zwa.LJFF().co0())) {
                w2(0);
            }
            E2(j, j3);
        }
        this.LLLZZIL = j;
        this.LLZ = j2;
        this.LLZIL = j3;
        Long uid = getUid();
        if (uid != null) {
            long jLongValue = uid.longValue();
            int i = this.LLJJJ;
            if (LiveMatchScoreTrackSetting.INSTANCE.enableTrack()) {
                C975410bUR c975410bUR = C975400bUQ.LIZ;
                synchronized (c975410bUR) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateUiAnchorScore: uid:");
                    sbLIZ2.append(jLongValue);
                    sbLIZ2.append(", score: ");
                    sbLIZ2.append(j);
                    sbLIZ2.append(", pos: ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", hostRank: ");
                    sbLIZ2.append(j2);
                    sbLIZ2.append(", containUid :");
                    sbLIZ2.append(c975410bUR.LJ.containsKey(Long.valueOf(jLongValue)));
                    C20441214yg.LJIIIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    c975410bUR.LJ.put(Long.valueOf(jLongValue), Long.valueOf(j));
                    c975410bUR.LJFF.put(Long.valueOf(jLongValue), Long.valueOf(j2));
                }
            }
        }
        T1();
    }

    public final void Y1(long j, long j2, int i, int i2, Integer num, boolean z, boolean z2) {
        String str;
        boolean z3;
        boolean z4;
        String str2;
        C754570Tip c754570Tip;
        Drawable background;
        C754570Tip c754570Tip2;
        String str3;
        int iLIZ;
        C754570Tip c754570Tip3;
        Drawable background2;
        Drawable background3;
        String str4;
        C754570Tip c754570Tip4;
        C754570Tip c754570Tip5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C954460awe c954460awe = this.LLJILJILJ;
        String str5 = null;
        if (c954460awe != null && (c754570Tip5 = c954460awe.LJIJJ) != null) {
            str = c754570Tip5.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" showTakeTheStageScoreRankInPerformStage performIndex:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLLZLLIL = true;
        this.LLLLZLLLI = i;
        if (getBackground() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 != z) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            C954460awe c954460awe2 = this.LLJILJILJ;
            if (c954460awe2 != null && (c754570Tip4 = c954460awe2.LJIJJ) != null) {
                str4 = c754570Tip4.LIZIZ;
            } else {
                str4 = null;
            }
            sbLIZ2.append(str4);
            sbLIZ2.append(" setBackgroundDrawable to null");
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ2));
            setBackgroundDrawable(null);
        } else if (getBackground() == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            C954460awe c954460awe3 = this.LLJILJILJ;
            if (c954460awe3 != null && (c754570Tip = c954460awe3.LJIJJ) != null) {
                str2 = c754570Tip.LIZIZ;
            } else {
                str2 = null;
            }
            sbLIZ3.append(str2);
            sbLIZ3.append(" set TakeTheStageV2WindowOutlineBackground");
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ3));
            if (TakeStageWindowBgOutlineExpandSetting.INSTANCE.isEnable()) {
                setNoClipChildren(getParent());
            }
            setBackgroundDrawable(new Drawable() { // from class: X.0Eap
                public final Paint LIZ;
                public final float LIZIZ;

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return -3;
                }

                {
                    Paint paint = new Paint();
                    this.LIZ = paint;
                    this.LIZIZ = C418440Gaw.LIZIZ(2);
                    paint.setColor(-16777216);
                    paint.setAntiAlias(true);
                    paint.setStyle(Paint.Style.FILL);
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    canvas.drawRect(getBounds().left, getBounds().top, getBounds().right, getBounds().top + this.LIZIZ, this.LIZ);
                    canvas.drawRect(getBounds().left, getBounds().top, getBounds().left + this.LIZIZ, getBounds().bottom, this.LIZ);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i3) {
                    this.LIZ.setAlpha(i3);
                    invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                    this.LIZ.setColorFilter(colorFilter);
                    invalidateSelf();
                }
            });
        }
        I1(z2);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.dvs);
        C500260Jjc.LLFFF(getTakeTheStageLayout());
        ViewGroup takeTheStageRankLayout = getTakeTheStageRankLayout();
        if (takeTheStageRankLayout != null && (background3 = takeTheStageRankLayout.getBackground()) != null) {
            background3.setTint(i2);
        }
        if (j > 0 && j2 >= 0) {
            if (z2) {
                if (num != null) {
                    int iIntValue = num.intValue();
                    View takeTheStageLayout = getTakeTheStageLayout();
                    if (takeTheStageLayout != null && (background2 = takeTheStageLayout.getBackground()) != null) {
                        background2.setTint(iIntValue);
                    }
                }
                if (j == 1) {
                    View takeTheStageRankCrownImageView = getTakeTheStageRankCrownImageView();
                    if ((takeTheStageRankCrownImageView instanceof C1324720kZq) && takeTheStageRankCrownImageView != null) {
                        C1143680frq.LJ(takeTheStageRankCrownImageView, "tiktok_live_interaction_demand_25", "ttlive_icon_take_the_stage_1st_rank_crown.png", ImageView.ScaleType.FIT_XY);
                    }
                    C500260Jjc.LLFFF(getTakeTheStageRankCrownImageView());
                    C500260Jjc.LJIILIIL(getTakeTheStageRankText());
                    C500260Jjc.LJIILIIL(getTakeTheStageRankNoGiftImageView());
                } else {
                    C500260Jjc.LJIILIIL(getTakeTheStageRankCrownImageView());
                    C500260Jjc.LJIILIIL(getTakeTheStageRankText());
                    n0();
                    C500260Jjc.LLFFF(getTakeTheStageRankNoGiftImageView());
                }
            } else {
                C500260Jjc.LJIILIIL(getTakeTheStageRankCrownImageView());
                C16F5 takeTheStageRankText = getTakeTheStageRankText();
                if (takeTheStageRankText != null) {
                    takeTheStageRankText.LJJJI(R.style.a9i);
                }
                C16F5 takeTheStageRankText2 = getTakeTheStageRankText();
                if (takeTheStageRankText2 != null) {
                    takeTheStageRankText2.setText(C982410bfj.LIZ(j));
                }
                C500260Jjc.LLFFF(getTakeTheStageRankText());
                C500260Jjc.LJIILIIL(getTakeTheStageRankNoGiftImageView());
            }
        } else {
            if (z2) {
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    View takeTheStageLayout2 = getTakeTheStageLayout();
                    if (takeTheStageLayout2 != null && (background = takeTheStageLayout2.getBackground()) != null) {
                        background.setTint(iIntValue2);
                    }
                }
                C500260Jjc.LJIILIIL(getTakeTheStageRankCrownImageView());
            }
            C500260Jjc.LJIILIIL(getTakeTheStageRankText());
            if (z2) {
                n0();
            } else {
                View takeTheStageRankNoGiftImageView = getTakeTheStageRankNoGiftImageView();
                if (takeTheStageRankNoGiftImageView != null) {
                    takeTheStageRankNoGiftImageView.setBackgroundResource(R.drawable.evi);
                }
            }
            C500260Jjc.LLFFF(getTakeTheStageRankNoGiftImageView());
        }
        C500260Jjc.LLFFF(getTakeTheStageScoreText());
        C16F5 takeTheStageScoreText = getTakeTheStageScoreText();
        if (takeTheStageScoreText != null) {
            takeTheStageScoreText.setText(C1850730yGF.LIZJ(j2));
        }
        C994580bzM takeTheStageNextTurn = getTakeTheStageNextTurn();
        if (takeTheStageNextTurn != null) {
            C500260Jjc.LJIILIIL(takeTheStageNextTurn);
        }
        if (z4) {
            this.LLLZ = false;
        }
        if (!this.LLLZ) {
            this.LLLZ = true;
            this.LLLZI = false;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            C954460awe c954460awe4 = this.LLJILJILJ;
            if (c954460awe4 != null && (c754570Tip3 = c954460awe4.LJIJJ) != null) {
                str3 = c754570Tip3.LIZIZ;
            } else {
                str3 = null;
            }
            sbLIZ4.append(str3);
            sbLIZ4.append(" showTakeTheStageScoreRankInPerformStage takeTheStagePerformingConfigScore==true");
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ4));
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJI(R.id.mgm, 2);
            c19mb.LJIIIZ(R.id.mgm, 3, 0, 3, 0);
            if (z) {
                iLIZ = C439101nJ.LIZ(2) + C439101nJ.LIZ(4);
            } else {
                iLIZ = C439101nJ.LIZ(4);
            }
            c19mb.LJIIIZ(R.id.mgm, 1, 0, 1, iLIZ);
            c19mb.LJI(R.id.mgm, 4);
            c19mb.LJIIIZ(R.id.xqz, 3, R.id.mgm, 4, C439101nJ.LIZ(4));
            c19mb.LJIIIZ(R.id.xqz, 6, R.id.mgm, 6, 0);
            c19mb.LJI(R.id.xqz, 7);
            c19mb.LJI(R.id.xqz, 4);
            c19mb.LIZIZ(constraintLayout);
        }
        m2();
        if (!this.LLLZIIL && getAnchorInfoVisibilityController().LJ() == 0) {
            this.LLLZIIL = true;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            C954460awe c954460awe5 = this.LLJILJILJ;
            if (c954460awe5 != null && (c754570Tip2 = c954460awe5.LJIJJ) != null) {
                str5 = c754570Tip2.LIZIZ;
            }
            sbLIZ5.append(str5);
            sbLIZ5.append(" showTakeTheStageScoreRankInPerformStage takeTheStageConfigConstraintSet==true");
            C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ5));
            C19MB c19mb2 = new C19MB();
            c19mb2.LJII(constraintLayout);
            c19mb2.LJIIIZ(R.id.v_take_the_stage_left_guide_line, 2, getViewAnchorInfo().getId(), 1, C439101nJ.LIZ(8));
            c19mb2.LJIIIZ(getViewAnchorInfo().getId(), 1, R.id.v_take_the_stage_left_guide_line, 2, C439101nJ.LIZ(8));
            c19mb2.LIZIZ(constraintLayout);
        }
        H2(this.LLJJI);
        AppCompatImageView takeTheStageTopLeftMuteStatusView = getTakeTheStageTopLeftMuteStatusView();
        ARunnableS106S0100000_6 aRunnableS106S0100000_6 = new ARunnableS106S0100000_6((Object) this, 173);
        if (takeTheStageTopLeftMuteStatusView != null) {
            if (takeTheStageTopLeftMuteStatusView.getWidth() > 0) {
                aRunnableS106S0100000_6.run();
            } else {
                HandlerHook.viewPost(takeTheStageTopLeftMuteStatusView, new ARunnableS75S0200000_6(takeTheStageTopLeftMuteStatusView, aRunnableS106S0100000_6, 84));
            }
        }
        O2();
        if (z2) {
            h0(z);
        }
    }
}

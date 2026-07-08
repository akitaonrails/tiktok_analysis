package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.FeedbackAnimVisibilityChannel;
import com.bytedance.android.live.gift.GiftGuideWidgetVisibilityChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.liveinteract.api.CompetitionLayoutChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkGuestNumChannel;
import com.bytedance.android.livesdk.dataChannel.CommentComboTrayVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.CommentPinWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.CommentStatusChannel;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.DrawGuessStatusVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.FullScreenSurveyShowing;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardVisibility;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.LiveInteractionScrollState;
import com.bytedance.android.livesdk.dataChannel.LiveInteractionWindowFocus;
import com.bytedance.android.livesdk.dataChannel.LockScreenChannel;
import com.bytedance.android.livesdk.dataChannel.MarketingCapsuleVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.MultiTabCurrentIndex;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNewMessageVisible;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.ToolbarTipsVisibilityChannel;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowBooleanChannel;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.event.FollowGuideBottomCardShow;
import com.bytedance.android.livesdkapi.depend.event.FollowGuidePinCardShow;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveGoalPinCardVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0evy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107800evy {
    public final LifecycleOwner LIZ;
    public final DataChannel LIZIZ;
    public final HashMap<C1107810evz, C1107780evw> LIZJ = new HashMap<>();
    public final HashMap<C1107810evz, List<C1107750evt>> LIZLLL = new HashMap<>();
    public final HashMap<InterfaceC1107760evu, C1107750evt> LJ = new HashMap<>();
    public final HashSet<C1107810evz> LJFF = new HashSet<>();

    public final C1096660ee0 LIZ(List<C1107810evz> list) {
        for (C1107810evz c1107810evz : list) {
            C1107780evw c1107780evw = this.LIZJ.get(c1107810evz);
            if (c1107780evw != null && c1107780evw.LIZ()) {
                return new C1096660ee0(false, c1107810evz);
            }
        }
        return new C1096660ee0(true, 2);
    }

    public final void LIZIZ(C1107810evz c1107810evz) {
        LifecycleOwner lifecycleOwner = this.LIZ;
        this.LJFF.add(c1107810evz);
        if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJ)) {
            this.LIZIZ.EQ2(lifecycleOwner, PublicScreenNormalPollStateVisibilityChannel.class, new AwS596S0100000_17(this, 209));
            return;
        }
        if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJFF)) {
            this.LIZIZ.EQ2(lifecycleOwner, PublicScreenGiftPollStateVisibilityChannel.class, new AwS596S0100000_17(this, 226));
            return;
        }
        if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJI)) {
            this.LIZIZ.EQ2(lifecycleOwner, LockScreenChannel.class, new AwS596S0100000_17(this, 204));
            return;
        }
        if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJII)) {
            this.LIZIZ.EQ2(lifecycleOwner, FullScreenSurveyShowing.class, new AwS596S0100000_17(this, 211));
            return;
        }
        if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJIIIIZZ)) {
            this.LIZIZ.EQ2(lifecycleOwner, SubOnlyLiveAudienceStatusChannel.class, new AwS596S0100000_17(this, 213));
            return;
        }
        if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJIIIZ)) {
            this.LIZIZ.EQ2(lifecycleOwner, LiveExploreDrawerShowChannel.class, new AwS596S0100000_17(this, 215));
            return;
        }
        if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJIIJ)) {
            this.LIZIZ.EQ2(lifecycleOwner, GameLinkGuestNumChannel.class, new AwS596S0100000_17(this, 217));
            return;
        }
        if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJJ)) {
            this.LIZIZ.EQ2(lifecycleOwner, CompetitionLayoutChangeEvent.class, new AwS596S0100000_17(this, 219));
            return;
        }
        if (!Intrinsics.LJFF(c1107810evz, C1107810evz.LJIIL) && !Intrinsics.LJFF(c1107810evz, C1107810evz.LJIILIIL) && !Intrinsics.LJFF(c1107810evz, C1107810evz.LJIILJJIL) && !Intrinsics.LJFF(c1107810evz, C1107810evz.LJIIJJI) && !Intrinsics.LJFF(c1107810evz, C1107810evz.LJIILL)) {
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJIJ)) {
                this.LIZIZ.EQ2(lifecycleOwner, DrawGuessStatusVisibilityChannel.class, new AwS596S0100000_17(this, 198));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJIJI)) {
                this.LIZIZ.EQ2(lifecycleOwner, DrawGuessIsCountingDownRoundStart.class, new AwS596S0100000_17(this, 199));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJIJJ)) {
                this.LIZIZ.EQ2(lifecycleOwner, DrawGuessFreelyStartChannel.class, new AwS596S0100000_17(this, 200));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJIIZILJ)) {
                this.LIZIZ.EQ2(lifecycleOwner, LinkCrossRoomStateChangeEvent.class, new AwS596S0100000_17(this, 201));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJIJJLI)) {
                DataChannel dataChannel = this.LIZIZ;
                dataChannel.EQ2(lifecycleOwner, LivePinCardVisibilityChannel.class, new AwS596S0100000_17(this, 202));
                dataChannel.EQ2(lifecycleOwner, PartnershipPromoteGameCardShowBooleanChannel.class, new AwS596S0100000_17(this, 203));
                dataChannel.EQ2(lifecycleOwner, CustomPollCardVisibility.class, new AwS596S0100000_17(this, 205));
                dataChannel.EQ2(lifecycleOwner, LiveEventCardVisibility.class, new AwS596S0100000_17(this, 206));
                dataChannel.EQ2(lifecycleOwner, FrameL2SlotVisibilityChannel.class, new AwS596S0100000_17(this, 207));
                dataChannel.EQ2(lifecycleOwner, LiveGoalPinCardVisibilityChannel.class, new AwS596S0100000_17(this, 208));
                dataChannel.EQ2(lifecycleOwner, CustomizedPerksCardVisibilityChannel.class, new AwS596S0100000_17(this, 210));
                dataChannel.EQ2(lifecycleOwner, SubGoalCardVisibilityChannel.class, new AwS596S0100000_17(this, 212));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJI)) {
                this.LIZIZ.EQ2(lifecycleOwner, CommentStatusChannel.class, new AwS596S0100000_17(this, 214));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJIFFI)) {
                this.LIZIZ.EQ2(lifecycleOwner, CommentComboTrayVisibilityChannel.class, new AwS596S0100000_17(this, 216));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJII)) {
                this.LIZIZ.EQ2(lifecycleOwner, CommentPinWidgetVisibility.class, new AwS596S0100000_17(this, 218));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJIII)) {
                this.LIZIZ.EQ2(lifecycleOwner, WarningInfoVisibilityEvent.class, new AwS596S0100000_17(this, 220));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJIIJ)) {
                this.LIZIZ.EQ2(lifecycleOwner, FeedbackAnimVisibilityChannel.class, new AwS596S0100000_17(this, 222));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJIIJZLJL)) {
                this.LIZIZ.EQ2(lifecycleOwner, KeyboardStatusChannel.class, new AwS596S0100000_17(this, 223));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJIIZ)) {
                this.LIZIZ.EQ2(lifecycleOwner, ProgrammedLiveMenuVisibilityChannel.class, new AwS596S0100000_17(this, 224));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJIIZI)) {
                DataChannel dataChannel2 = this.LIZIZ;
                dataChannel2.EQ2(lifecycleOwner, GiftGuideWidgetVisibilityChannel.class, new AwS596S0100000_17(this, 225));
                dataChannel2.EQ2(lifecycleOwner, FollowGuidePinCardShow.class, new AwS596S0100000_17(this, 227));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJIJIIJI)) {
                this.LIZIZ.EQ2(lifecycleOwner, FollowGuideBottomCardShow.class, new AwS383S0200000_17(this, c1107810evz, 38));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJIJIL)) {
                this.LIZIZ.EQ2(lifecycleOwner, PublicScreenNewMessageVisible.class, new AwS383S0200000_17(this, c1107810evz, 39));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJIJL)) {
                this.LIZIZ.EQ2(lifecycleOwner, HighPrioritySlotVisibilityChannel.class, new AwS383S0200000_17(this, c1107810evz, 40));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJIJLIJ)) {
                this.LIZIZ.EQ2(lifecycleOwner, HighPrioritySlotVisibilityChannel.class, new AwS383S0200000_17(this, c1107810evz, 27));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJJI)) {
                this.LIZIZ.EQ2(lifecycleOwner, MarketingCapsuleVisibilityChannel.class, new AwS383S0200000_17(this, c1107810evz, 28));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJJIL)) {
                this.LIZIZ.EQ2(lifecycleOwner, ToolbarTipsVisibilityChannel.class, new AwS383S0200000_17(this, c1107810evz, 29));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJIL)) {
                DataChannelGlobal.LLILZ.EQ2(lifecycleOwner, lifecycleOwner, ScreenClearEvent.class, new AwS383S0200000_17(this, c1107810evz, 30));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJIZ)) {
                DataChannelGlobal.LLILZ.EQ2(lifecycleOwner, lifecycleOwner, ScreenClearEvent.class, new AwS383S0200000_17(this, c1107810evz, 31));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJJJ)) {
                this.LIZIZ.EQ2(lifecycleOwner, LiveInteractionWindowFocus.class, new AwS383S0200000_17(this, c1107810evz, 32));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJJJJ)) {
                DataChannelGlobal.LLILZ.EQ2(lifecycleOwner, lifecycleOwner, LiveInteractionScrollState.class, new AwS383S0200000_17(this, c1107810evz, 33));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJJJJL)) {
                this.LIZIZ.EQ2(lifecycleOwner, MultiTabCurrentIndex.class, new AwS383S0200000_17(this, c1107810evz, 34));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJJJL)) {
                DataChannelGlobal.LLILZ.EQ2(lifecycleOwner, lifecycleOwner, TopLiveSkylightVisibilityChannel.class, new AwS383S0200000_17(this, c1107810evz, 35));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJJJLI)) {
                this.LIZIZ.EQ2(lifecycleOwner, LiveExtendedScreenStatus.class, new AwS383S0200000_17(this, c1107810evz, 36));
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJJJJLL)) {
                this.LIZIZ.EQ2(lifecycleOwner, LiveCenterStatusChannel.class, new AwS383S0200000_17(this, c1107810evz, 37));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("observe business error, business is ");
            sbLIZ.append(c1107810evz.LIZ);
            C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LIZIZ.EQ2(lifecycleOwner, MultiLiveRTCLayoutChannel.class, new AwS596S0100000_17(this, 221));
    }

    public final void LIZJ(InterfaceC1107760evu interfaceC1107760evu) {
        C1107750evt c1107750evtRemove = this.LJ.remove(interfaceC1107760evu);
        if (c1107750evtRemove != null) {
            Iterator<T> it2 = this.LIZLLL.values().iterator();
            while (it2.hasNext()) {
                List list = (List) it2.next();
                if (list.contains(c1107750evtRemove)) {
                    list.remove(c1107750evtRemove);
                }
            }
        }
    }

    public C1107800evy(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = dataChannel;
    }

    public final void LIZLLL(C1107810evz c1107810evz, C1107780evw c1107780evw) {
        List<C1107750evt> list;
        C1107770evv c1107770evv;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("business ");
        sbLIZ.append(c1107810evz.LIZ);
        sbLIZ.append(" visible is ");
        sbLIZ.append(c1107780evw.LIZ);
        C20441214yg.LJ("AvoidNotify", C2188811AlT.LIZIZ(sbLIZ));
        C1107780evw c1107770evv2 = this.LIZJ.get(c1107810evz);
        if (c1107770evv2 == null) {
            c1107770evv2 = new C1107770evv();
        }
        boolean zLIZ = c1107770evv2.LIZ();
        if ((c1107770evv2 instanceof C1107770evv) && (c1107770evv = (C1107770evv) c1107770evv2) != null) {
            if (c1107770evv.LIZJ.size() > 0 && c1107780evw.LIZIZ == null) {
                throw new IllegalArgumentException("subBusiness must not null");
            }
            Object obj = c1107780evw.LIZIZ;
            if (obj != null) {
                c1107770evv.LIZJ.put(obj, c1107780evw);
            } else {
                c1107770evv.LIZ = c1107780evw.LIZ;
            }
        }
        this.LIZJ.put(c1107810evz, c1107770evv2);
        if (zLIZ != c1107770evv2.LIZ() && (list = this.LIZLLL.get(c1107810evz)) != null) {
            for (C1107750evt c1107750evt : list) {
                c1107750evt.LIZIZ.LIZIZ(c1107810evz, c1107770evv2.LIZ(), c1107770evv2);
                C1097770efn c1097770efn = C1097770efn.LL;
                if (c1097770efn.LIZLLL(c1107750evt.LIZ, c1107750evt.LIZJ).LIZ) {
                    c1107750evt.LIZIZ.LIZJ();
                }
                if (c1097770efn.LIZJ(c1107750evt.LIZ, c1107750evt.LIZJ).LIZ) {
                    c1107750evt.LIZIZ.LIZ();
                }
                if (c1107770evv2.LIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[AvoidNotify]");
                    sbLIZ2.append(c1107750evt.LJ);
                    sbLIZ2.append(" , conflict business ");
                    sbLIZ2.append(c1107810evz.LIZ);
                    sbLIZ2.append(" opened");
                    C20441214yg.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
    }
}

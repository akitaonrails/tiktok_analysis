package X;

import com.bytedance.android.live.PollVisibleChannel;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.gift.GiftGuideWidgetVisibilityChannel;
import com.bytedance.android.live.liveinteract.match.business.event.MvpDialogVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.live.wallet.model.ReChargeDialogOnShow;
import com.bytedance.android.livesdk.comp.api.subscription.event.SubscribeViewOnShowChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterVisibility;
import com.bytedance.android.livesdk.dataChannel.SparkOpenChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeWebOnShow;
import com.bytedance.android.livesdk.rank.api.OnlineAudienceRankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.rank.api.RankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.datachannel.GlobalChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JGJ {
    public static DataChannel LIZLLL;
    public static final C0JGJ LIZ = new C0JGJ();
    public static final Map<Class<? extends Channel<Boolean>>, Boolean> LIZIZ = new LinkedHashMap();
    public static final Map<Class<? extends GlobalChannel<Boolean>>, Boolean> LIZJ = new LinkedHashMap();
    public static final List<Class<? extends Channel<Boolean>>> LJ = C1697810uHb.LJIIJJI(FrameL2SlotVisibilityChannel.class, FrameL3SlotVisibilityChannel.class, LiveExploreDrawerShowChannel.class, UserProfileShowingChannel.class, GiftDialogVisibilityChannel.class, KeyboardStatusChannel.class, RankListDialogVisibilityChannel.class, OnlineAudienceRankListDialogVisibilityChannel.class, FastGiftVisibleChannel.class, MultiGuestVisibleChannel.class, PollVisibleChannel.class, ToolBarShareVisibleChannel.class, MvpDialogVisibleChannel.class, ReChargeDialogOnShow.class, SubscribeWebOnShow.class, GiftGuideWidgetVisibilityChannel.class, LiveCenterVisibility.class);
    public static final List<Class<? extends GlobalChannel<Boolean>>> LJFF = C1697810uHb.LJIIJJI(SubscribeViewOnShowChannel.class, SparkOpenChannel.class);

    public static void LIZ(DataChannel dataChannel) {
        C0JGJ c0jgj;
        LIZLLL = dataChannel;
        ((LinkedHashMap) LIZIZ).clear();
        ((LinkedHashMap) LIZJ).clear();
        List<Class<? extends Channel<Boolean>>> list = LJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Class<? extends Channel<Boolean>>> it2 = list.iterator();
        while (true) {
            Boolean bool = null;
            if (!it2.hasNext()) {
                break;
            }
            Class<? extends Channel<Boolean>> next = it2.next();
            Map<Class<? extends Channel<Boolean>>, Boolean> map = LIZIZ;
            DataChannel dataChannel2 = LIZLLL;
            if (dataChannel2 != null) {
                bool = (Boolean) dataChannel2.gg0(next);
            }
            map.put(next, Boolean.valueOf(C176600m4.LIZIZ(bool)));
            arrayList.add(Unit.LIZ);
        }
        List<Class<? extends GlobalChannel<Boolean>>> list2 = LJFF;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (Class<? extends GlobalChannel<Boolean>> cls : list2) {
            LIZJ.put(cls, Boolean.valueOf(Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(cls), Boolean.TRUE)));
            arrayList2.add(Unit.LIZ);
        }
        List<Class<? extends Channel<Boolean>>> list3 = LJ;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator<Class<? extends Channel<Boolean>>> it3 = list3.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            c0jgj = LIZ;
            if (!zHasNext) {
                break;
            }
            Class<? extends Channel<Boolean>> next2 = it3.next();
            DataChannel dataChannel3 = LIZLLL;
            if (dataChannel3 != null) {
                dataChannel3.CQ2(next2, c0jgj, new AwS586S0100000_7(next2, (Class<? extends Channel<Boolean>>) 332));
            } else {
                dataChannel3 = null;
            }
            arrayList3.add(dataChannel3);
        }
        List<Class<? extends GlobalChannel<Boolean>>> list4 = LJFF;
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
        for (Class<? extends GlobalChannel<Boolean>> cls2 : list4) {
            DataChannelGlobal.LLILZ.CQ2(cls2, c0jgj, new AwS586S0100000_7(cls2, (Class<? extends Channel<Boolean>>) 333));
            arrayList4.add(Unit.LIZ);
        }
        ((LinkedList) C464800IKo.LIZ.LJIIL).add(new InterfaceC1107710evp() { // from class: X.0JGK
            @Override // X.InterfaceC1107710evp
            public final void LIZ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onDialogFragment num=");
                sbLIZ.append(i);
                C20441214yg.LJIIIZ("FollowPopUpPanelController", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1107710evp
            public final void LIZIZ(int i) {
            }
        });
    }
}

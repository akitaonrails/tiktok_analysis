package X;

import Y.AComparatorS26S0000000_7;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.WidgetLoadedGlobalEvent;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightEntranceSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedTopliveTabEntranceSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestCentralizedEntranceStyleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TopLiveTabsSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveTopTabSwitch;
import com.bytedance.android.livesdk.livesetting.performance.LiveViewTreeOptSetting;
import com.bytedance.android.livesdkapi.LivePlayPullStreamEndEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.hangout.container.LiveHangoutFragmentV2;
import com.ss.android.ugc.aweme.live.root.tab.nearby.LiveNearbyPageFragment;
import com.ss.android.ugc.aweme.live.root.tab.room.LiveRoomPageFragment;
import com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.LiveTab;

/* JADX INFO: renamed from: X.0IkR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475290IkR {
    public static final List<InterfaceC475320IkU> LIZ;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InterfaceC475320IkU() { // from class: X.0IkP
            @Override // X.InterfaceC475320IkU
            public final boolean LIZIZ(String str, String str2) {
                return true;
            }

            @Override // X.InterfaceC475320IkU
            public final String name() {
                return "discover";
            }

            @Override // X.InterfaceC475320IkU
            public final int position() {
                return 0;
            }

            @Override // X.InterfaceC475320IkU
            public final LiveTab getTab() {
                LiveTab next;
                Iterator<LiveTab> it2 = C477500Io0.LJIIJ().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (next.type == 1) {
                        break;
                    }
                }
                LiveTab liveTab = next;
                if (liveTab != null) {
                    return liveTab;
                }
                LiveTab liveTab2 = new LiveTab();
                liveTab2.type = 1;
                liveTab2.name = "discover";
                liveTab2.content = "";
                return liveTab2;
            }

            @Override // X.InterfaceC475320IkU
            public final InterfaceC479810Irj LIZ(InterfaceC479780Irg<?> interfaceC479780Irg, InterfaceC475150IkD interfaceC475150IkD, InterfaceC475300IkS interfaceC475300IkS) {
                LiveRoomPageFragment liveRoomPageFragment = new LiveRoomPageFragment();
                liveRoomPageFragment.LLILZIL = interfaceC475300IkS;
                liveRoomPageFragment.LL = interfaceC475150IkD;
                C475310IkT c475310IkT = new C475310IkT(liveRoomPageFragment, interfaceC479780Irg, interfaceC475300IkS, true, liveRoomPageFragment, new AwS551S0100000_7(liveRoomPageFragment, 840));
                c475310IkT.LJII = liveRoomPageFragment;
                liveRoomPageFragment.LLILLJJLI = c475310IkT;
                DataChannelGlobal.LLILZ.BQ2(liveRoomPageFragment, liveRoomPageFragment, LivePlayPullStreamEndEvent.class, new AwS586S0100000_7(liveRoomPageFragment, 600));
                DataChannelGlobal.LLILZ.BQ2(liveRoomPageFragment, liveRoomPageFragment, WidgetLoadedGlobalEvent.class, new AwS586S0100000_7(liveRoomPageFragment, 601));
                return liveRoomPageFragment;
            }
        });
        arrayList.add(new InterfaceC475320IkU() { // from class: X.0IkH
            @Override // X.InterfaceC475320IkU
            public final String name() {
                return "nearby";
            }

            @Override // X.InterfaceC475320IkU
            public final int position() {
                return 1;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
            @Override // X.InterfaceC475320IkU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final webcast.api.feed.LiveTab getTab() {
                /*
                    r2 = this;
                    java.lang.Class<com.bytedance.android.feed.api.ILiveFeedApiService> r0 = com.bytedance.android.feed.api.ILiveFeedApiService.class
                    X.006A r0 = X.C1161920gLG.LIZJ(r0)
                    com.bytedance.android.feed.api.ILiveFeedApiService r0 = (com.bytedance.android.feed.api.ILiveFeedApiService) r0
                    if (r0 == 0) goto L15
                    r0.zX1()
                    com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager r0 = com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager.LIZ
                    webcast.api.feed.LiveTab r1 = r0.LIZ()
                    if (r1 != 0) goto L32
                L15:
                    webcast.api.feed.LiveTab r1 = new webcast.api.feed.LiveTab
                    r1.<init>()
                    r0 = 3
                    r1.type = r0
                    X.0Io0 r0 = X.C477500Io0.LIZ
                    r0.getClass()
                    java.lang.String r0 = "ttlive_topLive_nearbyTab_tabDefault"
                    java.lang.String r0 = X.C477500Io0.LJIIL(r0)
                    if (r0 != 0) goto L2c
                    java.lang.String r0 = "Nearby"
                L2c:
                    r1.name = r0
                    java.lang.String r0 = ""
                    r1.content = r0
                L32:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C475190IkH.getTab():webcast.api.feed.LiveTab");
            }

            @Override // X.InterfaceC475320IkU
            public final boolean LIZIZ(String str, String str2) {
                boolean z;
                boolean z2;
                if (LiveInfeedSkylightEntranceSetting.matchEntrance(str, str2) && LiveInfeedTopliveTabEntranceSetting.matchEntrance(str, str2)) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zEnable = LiveNearbyTabSetting.INSTANCE.enable();
                Iterator<TopLiveTabsSetting.TopLiveTab> it2 = TopLiveTabsSetting.getTopLiveTabs().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TopLiveTabsSetting.TopLiveTab next = it2.next();
                    if (Intrinsics.LJFF(next.id, "nearby")) {
                        if (next != null) {
                            z2 = true;
                        }
                    }
                }
                z2 = false;
                if (z && zEnable && z2) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC475320IkU
            public final InterfaceC479810Irj LIZ(InterfaceC479780Irg<?> interfaceC479780Irg, InterfaceC475150IkD interfaceC475150IkD, InterfaceC475300IkS interfaceC475300IkS) {
                LifecycleOwner lifecycleOwnerXL;
                LiveNearbyPageFragment liveNearbyPageFragment = new LiveNearbyPageFragment();
                liveNearbyPageFragment.LLILZ = interfaceC475300IkS;
                liveNearbyPageFragment.LL = interfaceC475150IkD;
                liveNearbyPageFragment.LLIZ = interfaceC479780Irg;
                if (interfaceC479780Irg != null) {
                    lifecycleOwnerXL = interfaceC479780Irg.xL();
                } else {
                    lifecycleOwnerXL = null;
                }
                SkylightController skylightController = new SkylightController(interfaceC479780Irg, lifecycleOwnerXL, interfaceC475300IkS, liveNearbyPageFragment);
                liveNearbyPageFragment.LLJILLL = skylightController;
                skylightController.LLJI = true;
                skylightController.LLJIJIL = new AwS586S0100000_7(interfaceC475300IkS, 592);
                return liveNearbyPageFragment;
            }
        });
        arrayList.add(new InterfaceC475320IkU() { // from class: X.0IkI
            @Override // X.InterfaceC475320IkU
            public final String name() {
                return "hangout";
            }

            @Override // X.InterfaceC475320IkU
            public final int position() {
                return 1;
            }

            @Override // X.InterfaceC475320IkU
            public final LiveTab getTab() {
                LiveTab next;
                Iterator<LiveTab> it2 = C477500Io0.LJIIJ().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (next.type == 2) {
                        break;
                    }
                }
                LiveTab liveTab = next;
                if (liveTab != null) {
                    return liveTab;
                }
                LiveTab liveTab2 = new LiveTab();
                liveTab2.type = 2;
                liveTab2.name = "hangout";
                liveTab2.content = "";
                return liveTab2;
            }

            @Override // X.InterfaceC475320IkU
            public final boolean LIZIZ(String str, String str2) {
                if (MultiGuestCentralizedEntranceStyleSetting.INSTANCE.hangoutEnable() && LiveTopTabSwitch.isEnable() && !LiveViewTreeOptSetting.enableViewTreeOpt() && LiveInfeedSkylightEntranceSetting.matchEntrance(str, str2) && LiveInfeedTopliveTabEntranceSetting.matchEntrance(str, str2)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC475320IkU
            public final InterfaceC479810Irj LIZ(InterfaceC479780Irg<?> interfaceC479780Irg, InterfaceC475150IkD interfaceC475150IkD, InterfaceC475300IkS interfaceC475300IkS) {
                LiveHangoutFragmentV2 liveHangoutFragmentV2 = new LiveHangoutFragmentV2();
                C20441214yg.LIZIZ("LiveHangoutFragmentV2", "init");
                liveHangoutFragmentV2.LLILZ = interfaceC479780Irg;
                liveHangoutFragmentV2.LL = interfaceC475150IkD;
                liveHangoutFragmentV2.LLJILJILJ = interfaceC475300IkS;
                return liveHangoutFragmentV2;
            }
        });
        LIZ = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0IkU] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static List LIZ(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (?? r2 : (ArrayList) list) {
            Object obj = linkedHashMap.get(Integer.valueOf(r2.position()));
            Integer numValueOf = Integer.valueOf(r2.position());
            if (obj != null) {
                r2 = obj;
            }
            linkedHashMap.put(numValueOf, r2);
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS26S0000000_7(1), linkedHashMap.entrySet());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
        Iterator it2 = listLJLLLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getValue());
        }
        return arrayList;
    }

    public static List LIZIZ(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC475320IkU interfaceC475320IkU : (ArrayList) LIZ) {
            if (interfaceC475320IkU.LIZIZ(str, str2)) {
                arrayList.add(interfaceC475320IkU);
            }
        }
        return arrayList;
    }
}

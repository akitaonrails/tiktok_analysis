package X;

import Y.ACListenerS150S0100000_15;
import Y.ARunnableS16S0210000_15;
import Y.AfS151S0200000_15;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestBubbleShowEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSuspendPushBubbleAvoidDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSuspendPushMustReachSetting;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS187S0101000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS9S0120000_15;
import webcast.im.PermitOutsideApplyMessage;

/* JADX INFO: renamed from: X.0aGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928400aGc implements OnIMMessageListener {
    public static Long LLILLJJLI;
    public static WeakReference<DataChannel> LLILZ;
    public static int LLILZIL;
    public static Integer LLILZLL;
    public static int LLIZ;
    public static String LLIZLLLIL;
    public static String LLJ;
    public static Pair<String, String> LLJI;
    public static Long LLJIJIL;
    public static final C928400aGc LL = new C928400aGc();
    public static final C11NJ LLILLL = new C11NJ();
    public static final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(10));

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "MultiGuestSuspendJoinedHelper";
    }

    public final void LIZ() {
        DataChannel dataChannel;
        C20441214yg.LIZIZ("MultiGuestSuspendJoinedHelper", "clear");
        WeakReference<DataChannel> weakReference = LLILZ;
        if (weakReference != null && (dataChannel = weakReference.get()) != null) {
            dataChannel.zQ2(this);
        }
        LLILZ = null;
        LLILZLL = null;
        LLJ = null;
        LLILLL.LJ();
        C928420aGe.LIZ();
    }

    public static boolean LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasApplyingRequest=");
        sbLIZ.append(LLIZ);
        C20441214yg.LIZIZ("MultiGuestSuspendJoinedHelper", C2188811AlT.LIZIZ(sbLIZ));
        return LLIZ > 0;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.ASYNC;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Room room;
        DataChannel dataChannel;
        if (iMessage instanceof PermitOutsideApplyMessage) {
            WeakReference<DataChannel> weakReference = LLILZ;
            DataChannel dataChannel2 = null;
            if (weakReference != null && (dataChannel = weakReference.get()) != null) {
                room = (Room) dataChannel.gg0(RoomChannel.class);
                if (room != null && room.getId() == ((PermitOutsideApplyMessage) iMessage).roomId) {
                    WeakReference<DataChannel> weakReference2 = LLILZ;
                    if (weakReference2 != null) {
                        dataChannel2 = weakReference2.get();
                    }
                    LIZIZ(false, true, dataChannel2);
                    return;
                }
            } else {
                room = null;
            }
            PermitOutsideApplyMessage permitOutsideApplyMessage = (PermitOutsideApplyMessage) iMessage;
            if (C914290Ztr.LIZ.LIZ(String.valueOf(permitOutsideApplyMessage.roomId), String.valueOf(permitOutsideApplyMessage.permitTime))) {
                return;
            }
            final long j = permitOutsideApplyMessage.roomId;
            final long j2 = permitOutsideApplyMessage.permitTime;
            final AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(room, iMessage, 4);
            if (!MultiGuestSuspendPushMustReachSetting.INSTANCE.allSceneMustPush()) {
                awS416S0200000_15.invoke();
            } else {
                C19487311Lz.LIZIZ(C11NZ.LJJJJJL(0L, 1L, TimeUnit.SECONDS).LJLIIL(MultiGuestSuspendPushBubbleAvoidDurationSetting.INSTANCE.durationInSecond()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), LLILLL, null, null, new InterfaceC781210Ukh() { // from class: X.0Zu1
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        C20441214yg.LIZIZ("MultiGuestSuspendJoinedHelper", "startCountDownTimerForBubbleShow, onComplete");
                        if (C914290Ztr.LIZ.LIZ(String.valueOf(j), String.valueOf(j2))) {
                            return;
                        }
                        awS416S0200000_15.invoke();
                    }
                }, null, 54);
            }
        }
    }

    public static final void LJ(Context context, EnumC928480aGk enumC928480aGk) {
        DataChannel dataChannel;
        WeakReference<DataChannel> weakReference = LLILZ;
        if (weakReference != null) {
            dataChannel = weakReference.get();
        } else {
            dataChannel = null;
        }
        C786410Ut5.H4(new DialogC929590aIX(context, enumC928480aGk, null, null, null, dataChannel, 0, null, 192));
    }

    public static void LIZIZ(final boolean z, final boolean z2, final DataChannel dataChannel) {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZLLL;
        List listLJJIII;
        if (!C926800aE2.LIZ("doJoinDirect")) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: X.0aBg
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MultiGuestSuspendJoinedHelper@aee3.doJoinDirect$joinTask$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MultiGuestSuspendJoinedHelper@aee3.doJoinDirect$joinTask$1");
            }

            public final void LIZ() {
                MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
                int iLJIIIIZZ = multiGuestDataHolderLIZJ != null ? multiGuestDataHolderLIZJ.LJIIIIZZ("reply") : 2;
                InterfaceC925430aBp interfaceC925430aBpLIZ = C925970aCh.LIZ();
                long j = iLJIIIIZZ;
                Long lLJII = C930540aK4.LJII();
                long jLongValue = lLJII != null ? lLJII.longValue() : 0L;
                InterfaceC925800aCQ interfaceC925800aCQLIZIZ = C925810aCR.LIZIZ();
                interfaceC925430aBpLIZ.LIZ(new C949760ap4(j, jLongValue, interfaceC925800aCQLIZIZ != null ? interfaceC925800aCQLIZIZ.LJ() : null, null, null, false, 0, 0L, 0, false, 0, null, 0L, false, new C949780ap6(null, false, null, false, true, 15), 65528), new C925920aCc(new AwS9S0120000_15(z, z2, dataChannel, 0), new AwS187S0101000_15(dataChannel, iLJIIIIZZ, 0)));
            }
        };
        if (!z) {
            C473410IhP.LIZIZ(runnable);
            return;
        }
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if ((objLJIIIZ instanceof InterfaceC917640ZzG) && (interfaceC917640ZzG = (InterfaceC917640ZzG) objLJIIIZ) != null && (abstractC928510aGnLIZLLL = interfaceC917640ZzG.LIZLLL()) != null && (listLJJIII = abstractC928510aGnLIZLLL.LJJIII()) != null && listLJJIII.size() >= 2) {
            LLILLL.LIZ(C11NZ.LJJJJJL(100L, 500L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS151S0200000_15(runnable, new C118300cf(), 3)).LJJLJ());
        } else {
            C473410IhP.LIZIZ(runnable);
        }
    }

    public static void LJFF(Room room, C928450aGh c928450aGh, boolean z) {
        DataChannel dataChannel;
        WeakReference<DataChannel> weakReference = LLILZ;
        if (weakReference != null && (dataChannel = weakReference.get()) != null) {
            IWatchLiveService iWatchLiveService = (IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class);
            if (iWatchLiveService != null && iWatchLiveService.hp1(dataChannel)) {
                return;
            }
            C473410IhP.LIZIZ(new ARunnableS16S0210000_15(dataChannel, room, c928450aGh, z, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZLLL(String str, C928450aGh c928450aGh, boolean z, String str2) {
        int iLJIIL;
        String str3;
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZLLL;
        List listLJJIII;
        int size;
        if (z) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            if ((objLJIIIZ instanceof InterfaceC917640ZzG) && (interfaceC917640ZzG = (InterfaceC917640ZzG) objLJIIIZ) != null && (abstractC928510aGnLIZLLL = interfaceC917640ZzG.LIZLLL()) != null && (listLJJIII = abstractC928510aGnLIZLLL.LJJIII()) != null && (size = listLJJIII.size()) > 0) {
                iLJIIL = size - 1;
            } else {
                iLJIIL = 0;
            }
        } else {
            iLJIIL = C921180a4y.LJIIL((IMultiGuestV3InternalServiceV2) LLJILJIL.getValue());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("guest_cnt", String.valueOf(iLJIIL));
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null && num.intValue() == 1) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_applying", str3);
        linkedHashMap.put("event_position", str2);
        linkedHashMap.put("event_room_id", String.valueOf(c928450aGh.LIZ));
        linkedHashMap.put("event_anchor_id", String.valueOf(c928450aGh.LIZIZ));
        C924660aAa.LJFF(str, "apply_accepted", linkedHashMap);
    }

    public static final void LJI(final C928450aGh c928450aGh, final int i, final String str, final boolean z, View view, boolean z2, Function0 function0) {
        DataChannel dataChannel;
        if (LLILZIL != 0) {
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C1113800f5e.LIZJ(EnumC1120860fH2.MULTI_GUEST_SUSPEND_JOINED_BUBBLE);
        }
        C785220UrA c785220UrA = new C785220UrA(view);
        c785220UrA.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
        c785220UrA.LJIIIZ = true;
        c785220UrA.LJJIIJ = true;
        c785220UrA.LJJIII = z2;
        c785220UrA.LJIJJ = C497740JfY.LJIJI(2131854168);
        c785220UrA.LJFF(Collections.singletonList(c928450aGh.LIZJ));
        c785220UrA.LJ = new ACListenerS150S0100000_15(function0, 6);
        c785220UrA.LJIILL = new InterfaceC254600ye() { // from class: X.0aGd
            @Override // X.InterfaceC254600ye
            public final void onShow() {
                DataChannel dataChannel2;
                C928400aGc.LLILZIL = i;
                Set<C928440aGg> set = C928420aGe.LIZ;
                C928450aGh c928450aGh2 = c928450aGh;
                C928420aGe.LIZJ(c928450aGh2.LIZ, c928450aGh2.LIZLLL);
                WeakReference<DataChannel> weakReference = C928400aGc.LLILZ;
                if (weakReference != null && (dataChannel2 = weakReference.get()) != null) {
                    dataChannel2.zW(MultiGuestBubbleShowEvent.class, "apply_accepted");
                }
                C928400aGc.LIZLLL("show", c928450aGh, z, str);
            }
        };
        c785220UrA.LJIILLIIL = new InterfaceC254900yh() { // from class: X.0aGf
            @Override // X.InterfaceC254900yh
            public final void x1(int i2) {
                DataChannel dataChannel2;
                C928400aGc.LLILZIL = 0;
                WeakReference<DataChannel> weakReference = C928400aGc.LLILZ;
                if (weakReference != null && (dataChannel2 = weakReference.get()) != null) {
                    dataChannel2.zW(MultiGuestBubbleShowEvent.class, null);
                }
                if (i2 == 7) {
                    C928400aGc.LIZLLL("click", c928450aGh, z, str);
                }
            }
        };
        C1119590fEz c1119590fEz = new C1119590fEz(c785220UrA);
        C1113800f5e c1113800f5e2 = C1113800f5e.LIZ;
        EnumC1120860fH2 enumC1120860fH2 = EnumC1120860fH2.MULTI_GUEST_SUSPEND_JOINED_BUBBLE;
        WeakReference<DataChannel> weakReference = LLILZ;
        if (weakReference != null) {
            dataChannel = weakReference.get();
        } else {
            dataChannel = null;
        }
        c1113800f5e2.LJ(c1119590fEz, enumC1120860fH2, dataChannel);
    }
}

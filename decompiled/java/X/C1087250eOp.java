package X;

import Y.AcS495S0100000_12;
import android.content.Context;
import android.util.LongSparseArray;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdatePerformanceOptV2Setting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizClosingStayDialogCountSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSlidingStayDialogCountSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087250eOp implements InterfaceC1077620e9I, OnMessageListener {
    public static final C1087250eOp LL = new C1087250eOp();
    public static final LongSparseArray<DataChannel> LLILLJJLI = new LongSparseArray<>();
    public static final LongSparseArray<LifecycleOwner> LLILLL = new LongSparseArray<>();
    public static final LongSparseArray<Integer> LLILZ = new LongSparseArray<>();
    public static final HashMap<Long, Boolean> LLILZIL = new HashMap<>();
    public static final LongSparseArray<ArrayList<InterfaceC1077940e9o>> LLILZLL = new LongSparseArray<>();
    public static C1AKH LLIZ;

    public static final boolean LJ(Long l) {
        DataChannel dataChannel;
        Room room;
        if (l == null || (dataChannel = LLILLJJLI.get(l.longValue())) == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            return false;
        }
        return C781520UlC.LJFF(room);
    }

    public static final boolean LJI(Long l) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (l == null) {
            return false;
        }
        l.longValue();
        DataChannel dataChannel = LLILLJJLI.get(l.longValue());
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && !roomAuthStatus.isExploreEnabled()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1077620e9I
    public final boolean LIZ(Long l) {
        DataChannel dataChannel;
        Room room;
        if (l == null || (dataChannel = LLILLJJLI.get(l.longValue())) == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            return false;
        }
        return room.isQuizRoom();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        BaseMessage baseMessage;
        CommonMessageData commonMessageData;
        long j;
        DataChannel dataChannel;
        Room room;
        if ((iMessage instanceof AbstractC1136060ffY) && (baseMessage = (BaseMessage) iMessage) != null && (commonMessageData = baseMessage.baseMessage) != null && (dataChannel = LLILLJJLI.get((j = commonMessageData.roomId))) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (iMessage instanceof RoomVerifyMessage)) {
            int i = ((RoomVerifyMessage) iMessage).verifyAction;
            if (i == 38) {
                RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                if (roomAuthStatus != null) {
                    roomAuthStatus.setExploreEnabled(true);
                }
                ArrayList<InterfaceC1077940e9o> arrayList = LLILZLL.get(j);
                if (arrayList != null) {
                    Iterator<InterfaceC1077940e9o> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().onVisibilityChanged(true);
                    }
                    return;
                }
                return;
            }
            if (i == 39) {
                RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                if (roomAuthStatus2 != null) {
                    roomAuthStatus2.setExploreEnabled(false);
                }
                ArrayList<InterfaceC1077940e9o> arrayList2 = LLILZLL.get(j);
                if (arrayList2 != null) {
                    Iterator<InterfaceC1077940e9o> it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        it3.next().onVisibilityChanged(false);
                    }
                }
            }
        }
    }

    public static final void LJFF(int i, Long l) {
        if (l != null) {
            l.longValue();
            LongSparseArray<Integer> longSparseArray = LLILZ;
            Integer num = longSparseArray.get(l.longValue());
            if (num != null) {
                num.intValue();
                longSparseArray.put(l.longValue(), Integer.valueOf(i));
            }
        }
    }

    @Override // X.InterfaceC1077620e9I
    public final void LIZJ(Long l, C0IKJ c0ikj) {
        if (l != null) {
            l.longValue();
            LongSparseArray<ArrayList<InterfaceC1077940e9o>> longSparseArray = LLILZLL;
            ArrayList<InterfaceC1077940e9o> arrayList = longSparseArray.get(l.longValue());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                longSparseArray.put(l.longValue(), arrayList);
            }
            arrayList.add(c0ikj);
        }
    }

    @Override // X.InterfaceC1077620e9I
    public final void LLLF(Room room, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        if (room != null) {
            LLILLJJLI.remove(room.getId());
            LLILZ.remove(room.getId());
            LLILLL.remove(room.getId());
            LLILZLL.remove(room.getId());
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(this);
        }
        Long lValueOf = null;
        LLIZ = null;
        if (LiveMainFrameworkUpdatePerformanceOptV2Setting.INSTANCE.enable()) {
            HashMap<Long, Boolean> map = LLILZIL;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            }
            C19719512Dh.LIZJ(map).remove(lValueOf);
        }
    }

    public static void LJII(Context context, LifecycleOwner lifecycleOwner, Function0 function0) {
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZIZ = lifecycleOwner;
        c782110Um9.LJIIZILJ(2131844598);
        c782110Um9.LJII(2131844597);
        c782110Um9.LJIIL(2131844596);
        c782110Um9.LJIIJ(2131844595, new AcS495S0100000_12(function0, 85));
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    @Override // X.InterfaceC1077620e9I
    public final boolean LIZIZ(Context context, Long l, Function0<Unit> function0) {
        LifecycleOwner lifecycleOwner;
        int iIntValue;
        if (l != null) {
            l.longValue();
            if (LIZ(l)) {
                Integer num = LLILZ.get(l.longValue());
                if (num != null && num.intValue() == 1 && (lifecycleOwner = LLILLL.get(l.longValue())) != null && context != null) {
                    C20337914i1<Long> c20337914i1 = InterfaceC1106030et7.o6;
                    Long lLIZIZ = c20337914i1.LIZIZ();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C963140bAe.LIZLLL(lLIZIZ.longValue(), jCurrentTimeMillis)) {
                        iIntValue = InterfaceC1106030et7.p6.LIZIZ().intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue < LiveQuizClosingStayDialogCountSetting.INSTANCE.getValue()) {
                        LL.getClass();
                        LJII(context, lifecycleOwner, function0);
                        c20337914i1.LJFF(Long.valueOf(jCurrentTimeMillis));
                        InterfaceC1106030et7.p6.LJFF(Integer.valueOf(iIntValue + 1));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean LIZLLL(Context context, Long l, C465890IOt c465890IOt) {
        LifecycleOwner lifecycleOwner;
        int iIntValue;
        if (l != null) {
            l.longValue();
            if (LIZ(l)) {
                Integer num = LLILZ.get(l.longValue());
                if (num != null && num.intValue() == 1 && (lifecycleOwner = LLILLL.get(l.longValue())) != null && context != null) {
                    C20337914i1<Long> c20337914i1 = InterfaceC1106030et7.q6;
                    Long lLIZIZ = c20337914i1.LIZIZ();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C963140bAe.LIZLLL(lLIZIZ.longValue(), jCurrentTimeMillis)) {
                        iIntValue = InterfaceC1106030et7.y6.LIZIZ().intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue < LiveQuizSlidingStayDialogCountSetting.INSTANCE.getValue()) {
                        LL.getClass();
                        LJII(context, lifecycleOwner, c465890IOt);
                        c20337914i1.LJFF(Long.valueOf(jCurrentTimeMillis));
                        InterfaceC1106030et7.y6.LJFF(Integer.valueOf(iIntValue + 1));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1077620e9I
    public final void gu(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        IMessageManager iMessageManager;
        if (room != null) {
            LLILLJJLI.put(room.getId(), dataChannel);
            LLILZ.put(room.getId(), 0);
            LLILLL.put(room.getId(), lifecycleOwner);
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.ROOM_VERIFY.getIntType(), this);
        }
        C0DT5 c0dt5Xo = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Xo();
        LLIZ = c0dt5Xo;
        if (c0dt5Xo != null) {
            c0dt5Xo.LIZ = dataChannel;
        }
    }
}

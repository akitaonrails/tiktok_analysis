package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.LiveEventInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.LiveEventEnableChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.PreFinishPopOptimizationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0UQK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UQK {
    public static long LIZ = -1;
    public static final /* synthetic */ int LIZIZ = 0;

    public static long LIZ() {
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(C931190aL7.class);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public static boolean LIZIZ(RoomCreateInfo roomCreateInfo) {
        String str;
        LiveEventInfo liveEventInfo = roomCreateInfo.mLiveEventInfo;
        if (liveEventInfo != null && (str = liveEventInfo.title) != null && str.length() > 0 && roomCreateInfo.mLiveEventInfo.id > 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(DataChannel dataChannel) {
        Boolean bool = (Boolean) dataChannel.gg0(LiveEventEnableChannel.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void LIZLLL(DataChannel dataChannel, String str) {
        Long lValueOf;
        User owner;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_end_early");
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        c474500IjALIZ.LJJII(DataChannelGlobal.LLILZ.gg0(C930700aKK.class), "live_event_id");
        Room room2 = (Room) dataChannel.gg0(RoomChannel.class);
        if (room2 != null && (owner = room2.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static boolean LJ(Context context, DataChannel dataChannel, Function1 function1, Function2 function2, Function0 function0) {
        int i;
        if (LIZ() > 0 && SystemClock.elapsedRealtime() < LIZ() + ((long) FriendsTabPreloadTTLSetting.DEFAULT)) {
            LIZLLL(dataChannel, "show");
            C19GO c19go = new C19GO(context);
            PreFinishPopOptimizationSetting preFinishPopOptimizationSetting = PreFinishPopOptimizationSetting.INSTANCE;
            if (!preFinishPopOptimizationSetting.enable() && C500260Jjc.LJJJJI()) {
                c19go.LJI(2131840965);
            }
            if (preFinishPopOptimizationSetting.enable() && C500260Jjc.LJJJJI()) {
                i = 2131852097;
            } else {
                i = 2131842720;
            }
            c19go.LIZIZ(i);
            c19go.LJ(2131840967, new DialogInterfaceOnClickListenerC785930UsJ(function1, dataChannel, 4), false);
            c19go.LIZJ(2131840966, new DialogInterfaceOnClickListenerC785930UsJ(function2, dataChannel, 5), false);
            C786410Ut5.M4(c19go.LIZ());
            function0.invoke();
            return true;
        }
        return false;
    }
}

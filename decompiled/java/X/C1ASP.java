package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.broadcast.notification.BgVideoBroadcastService2;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1ASP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ASP {
    public static void LIZ() {
        LiveMode streamType;
        String str = BgVideoBroadcastService2.LLJJIII ? "start_live" : "swtich_backstage";
        Room room = BgVideoBroadcastService2.LLJJI ? (Room) DataChannelGlobal.LLILZ.gg0(C930930aKh.class) : (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_front_service_send");
        c474500IjALIZ.LJIL();
        Object objLIZ = null;
        c474500IjALIZ.LJJII(String.valueOf(room != null ? Long.valueOf(room.getOwnerUserId()) : null), "anchor_id");
        c474500IjALIZ.LJJII(room != null ? room.getIdStr() : null, "room_id");
        c474500IjALIZ.LJJII(str, "send_reason");
        if (room != null && (streamType = room.getStreamType()) != null) {
            objLIZ = C354201Zc.LIZ(streamType);
        }
        c474500IjALIZ.LJJII(objLIZ, "live_type");
        c474500IjALIZ.LJJII(Integer.valueOf(BgVideoBroadcastService2.LLJJIJI ? 1 : 0), "is_open_push");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopService begin isRunning=");
        sbLIZ.append(BgVideoBroadcastService2.LLJIJIL);
        sbLIZ.append(" isStopping=");
        sbLIZ.append(BgVideoBroadcastService2.LLJILJIL);
        sbLIZ.append(" isStartedWithoutPermission=");
        sbLIZ.append(BgVideoBroadcastService2.LLJJJ);
        sbLIZ.append(" isLiveEnd=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("BgVideoBroadcastService2", C2188811AlT.LIZIZ(sbLIZ));
        if (BgVideoBroadcastService2.LLJJJ && !z) {
            C20441214yg.LIZIZ("BgVideoBroadcastService2", "stopService skip: started without permission, not live end");
            return;
        }
        Context applicationContext = GlobalContext.getApplicationContext();
        if (BgVideoBroadcastService2.LLJIJIL && applicationContext != null) {
            if (z || !BgVideoBroadcastService2.LLJILJILJ) {
                BgVideoBroadcastService2.LLJILJIL = true;
                BgVideoBroadcastService2.LLJJJ = false;
                try {
                    applicationContext.stopService(new Intent(applicationContext, (Class<?>) BgVideoBroadcastService2.class));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("BgVideoBroadcastService2", e);
                }
            }
            C20441214yg.LIZIZ("BgVideoBroadcastService2", "stopService end");
            return;
        }
        C20441214yg.LIZIZ("BgVideoBroadcastService2", "stopService return");
    }
}

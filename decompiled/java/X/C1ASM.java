package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.broadcast.notification.BgVideoBroadcastService;
import com.bytedance.android.livesdk.broadcast.notification.BgVideoBroadcastService2;
import com.bytedance.android.livesdk.livesetting.other.LiveBroadcastBgServiceOptimizeSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ASM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ASM {
    public static void LIZ() {
        LiveMode streamType;
        String str = BgVideoBroadcastService.LLJJI ? "start_live" : "swtich_backstage";
        Room room = BgVideoBroadcastService.LLJJ ? (Room) DataChannelGlobal.LLILZ.gg0(C930930aKh.class) : (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
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
        c474500IjALIZ.LJJII(Integer.valueOf(BgVideoBroadcastService.LLJJIII ? 1 : 0), "is_open_push");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(boolean z) {
        if (!LiveBroadcastBgServiceOptimizeSetting.INSTANCE.enable() && !C0UVE.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopService begin isRunning=");
            sbLIZ.append(BgVideoBroadcastService.LLJIJIL);
            sbLIZ.append(" isStopping=");
            sbLIZ.append(BgVideoBroadcastService.LLJILJIL);
            sbLIZ.append(" isStartedWithoutPermission=");
            sbLIZ.append(BgVideoBroadcastService.LLJJIJIL);
            sbLIZ.append(" isLiveEnd=");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("BgVideoBroadcastService", C2188811AlT.LIZIZ(sbLIZ));
            if (BgVideoBroadcastService.LLJJIJIL && !z) {
                C20441214yg.LIZIZ("BgVideoBroadcastService", "stopService skip: started without permission, not live end");
                return;
            }
            Context applicationContext = GlobalContext.getApplicationContext();
            if (BgVideoBroadcastService.LLJIJIL && applicationContext != null) {
                BgVideoBroadcastService.LLJILJIL = true;
                BgVideoBroadcastService.LLJJIJIL = false;
                try {
                    applicationContext.stopService(new Intent(applicationContext, (Class<?>) BgVideoBroadcastService.class));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("BgVideoBroadcastService", e);
                }
                C20441214yg.LIZIZ("BgVideoBroadcastService", "stopService end");
                return;
            }
            C20441214yg.LIZIZ("BgVideoBroadcastService", "stopService return");
            return;
        }
        C1ASP.LIZIZ(z);
    }

    public static void LIZIZ(Fragment fragment, C19EG c19eg, boolean z, boolean z2, boolean z3, boolean z4) {
        DataChannel dataChannelProvideDataChannel = null;
        if (!LiveBroadcastBgServiceOptimizeSetting.INSTANCE.enable() && !z4) {
            boolean zLIZ = new C815520Vyw(c19eg).LIZ();
            BgVideoBroadcastService.LLJJIII = zLIZ;
            if (!zLIZ) {
                LIZ();
                C20441214yg.LIZIZ("BgVideoBroadcastService", "notification is disabled");
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startService begin isRunning=");
            sbLIZ.append(BgVideoBroadcastService.LLJIJIL);
            sbLIZ.append(" isStopping=");
            sbLIZ.append(BgVideoBroadcastService.LLJILJIL);
            sbLIZ.append(", isPreStart=");
            sbLIZ.append(z3);
            C20441214yg.LIZIZ("BgVideoBroadcastService", C2188811AlT.LIZIZ(sbLIZ));
            if (BgVideoBroadcastService.LLJIJIL) {
                return;
            }
            Intent intent = new Intent(c19eg, (Class<?>) BgVideoBroadcastService.class);
            try {
                BgVideoBroadcastService.LLJILJILJ = c19eg.getClass().getName();
                int i = Build.VERSION.SDK_INT;
                if (i >= 26 && i < 31) {
                    C838410Wul.LJIIIZ(c19eg, intent);
                } else {
                    C2204961BRm.LJIJJ(c19eg, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/IJh/lucBOiiryHprqpoLc3lCGKSJuEpmuCAOU8l+8HrUkv8A==", null));
                }
                BgVideoBroadcastService.LLJIJIL = true;
                BgVideoBroadcastService.LLJJI = z3;
                C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(c19eg);
                if (c0ip3LIZIZ != null) {
                    dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
                }
                BgVideoBroadcastService.LLJJIJI = dataChannelProvideDataChannel;
                BgVideoBroadcastService.LLJJIJIIJIL = fragment;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                JSONObject jSONObject = new JSONObject();
                C0K04.LJFF("error_code", th.getMessage(), jSONObject);
                C1CC2.LJIIIIZZ("ttlive_video_broadcast_service_start_error", 1, jSONObject);
                C20441214yg.LJI("BgVideoBroadcastService", th);
            }
            BgVideoBroadcastService.LLJILLL = z;
            BgVideoBroadcastService.LLJJ = z2;
            C20441214yg.LIZIZ("BgVideoBroadcastService", "startService end");
            return;
        }
        boolean zLIZ2 = new C815520Vyw(c19eg).LIZ();
        BgVideoBroadcastService2.LLJJIJI = zLIZ2;
        if (!zLIZ2) {
            C1ASP.LIZ();
            C20441214yg.LIZIZ("BgVideoBroadcastService2", "notification is disabled");
            return;
        }
        if (!BgVideoBroadcastService2.LLJILJILJ) {
            BgVideoBroadcastService2.LLJILJILJ = z4;
        }
        C20441214yg.LIZIZ("BgVideoBroadcastService2", "startService begin isRunning=" + BgVideoBroadcastService2.LLJIJIL + " isStopping=" + BgVideoBroadcastService2.LLJILJIL + ", isPreStart=" + z3);
        if (BgVideoBroadcastService2.LLJIJIL) {
            return;
        }
        Intent intent2 = new Intent(c19eg, (Class<?>) BgVideoBroadcastService2.class);
        try {
            BgVideoBroadcastService2.LLJILLL = c19eg.getClass().getName();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26 && i2 < 31) {
                C838410Wul.LJIIIZ(c19eg, intent2);
            } else {
                C2204961BRm.LJIJJ(c19eg, intent2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/IJh/lucBOiiryHprqpoLc3lCGKSJuEpmuCAOU8l+8HrUkv8Pc=", null));
            }
            BgVideoBroadcastService2.LLJIJIL = true;
            BgVideoBroadcastService2.LLJJIII = z3;
            C0IP3 c0ip3LIZIZ2 = C475510Ikn.LIZIZ(c19eg);
            if (c0ip3LIZIZ2 != null) {
                dataChannelProvideDataChannel = c0ip3LIZIZ2.provideDataChannel();
            }
            BgVideoBroadcastService2.LLJJIJIIJIL = dataChannelProvideDataChannel;
            BgVideoBroadcastService2.LLJJIJIL = fragment;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            JSONObject jSONObject2 = new JSONObject();
            C0K04.LJFF("error_code", th2.getMessage(), jSONObject2);
            C1CC2.LJIIIIZZ("ttlive_video_broadcast_service_start_error", 1, jSONObject2);
            C20441214yg.LJI("BgVideoBroadcastService2", th2);
        }
        BgVideoBroadcastService2.LLJJ = z;
        BgVideoBroadcastService2.LLJJI = z2;
        C20441214yg.LIZIZ("BgVideoBroadcastService2", "startService end");
    }
}

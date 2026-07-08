package X;

import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0CR2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CR2 {
    public static final C0CR2 LIZ = new C0CR2();
    public static final INetworkStateService LIZIZ = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);

    public static void LIZ(int i, int i2, long j, String str, Throwable th) {
        long jElapsedRealtime;
        String simpleName;
        long j2 = C1150504el.LIZ().LJJIII;
        if (j2 > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        } else {
            jElapsedRealtime = -1;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - j, "req_duration");
        c2344009Gk.LIZJ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_cold_start_first_launch");
        c2344009Gk.LIZLLL(jElapsedRealtime, "duration_from_start");
        c2344009Gk.LJIIIIZZ("error_message", str);
        c2344009Gk.LIZJ(C2214201BlK.LJIIJJI ? 1 : 0, "is_app_background");
        c2344009Gk.LIZJ(LIZIZ.getNetworkStatus().ordinal(), "network_status");
        c2344009Gk.LIZJ(i, Scene.SCENE_SERVICE);
        if (th != null) {
            simpleName = th.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        c2344009Gk.LJIIIIZZ("exception_type", simpleName);
        C20684815ws.LJIILLIIL("plugin_api_req_recv", c2344009Gk.LIZ);
    }
}

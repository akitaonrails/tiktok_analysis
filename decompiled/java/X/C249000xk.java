package X;

import com.bytedance.android.livesdk.game.api.GameLiveRoomStatusApi;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C249000xk {
    public static C11JF LIZ;

    public static void LIZ(final int i, final long j) {
        C11JF c11jf = LIZ;
        if (c11jf != null && !c11jf.isDisposed()) {
            c11jf.dispose();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("screen_status", i);
        jSONObject.put("room_id", j);
        C1CC2.LJIIIIZZ("ttlive_anchor_screenshot_track", 0, jSONObject);
        LIZ = (C11JF) C11NZ.LJLJL(1L, TimeUnit.SECONDS, C11S5.LIZ()).LJJJ(new InterfaceC1487280oo2() { // from class: X.00xl
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C480460Ism.LIZ().getClass();
                return ((GameLiveRoomStatusApi) C480460Ism.LIZLLL(GameLiveRoomStatusApi.class)).roomLockMonitor(j, i);
            }
        }, false).LJIILIIL(new C0UO0()).LJJLL(new C516901zr(j, i, 10), new C516901zr(j, i, 11));
    }
}

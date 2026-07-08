package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TU8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TU8 {
    public static Keva LIZIZ() {
        return C0TU9.LJJIJL.getValue();
    }

    public static void LIZ(boolean z) {
        AtomicBoolean atomicBoolean;
        String str;
        Object c098200Yq;
        if (!((Boolean) C295510Bi9.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (z) {
            atomicBoolean = C0TU9.LJJIJIIJIL;
        } else {
            atomicBoolean = C0TU9.LJJIJIL;
        }
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        if (z) {
            str = "pending_payload_photo_v1";
        } else {
            str = "pending_payload_video_v1";
        }
        try {
            String string = LIZIZ().getString(str, "");
            if (string != null && string.length() != 0) {
                try {
                    c098200Yq = new JSONObject(string);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                JSONObject jSONObject = (JSONObject) c098200Yq;
                if (jSONObject != null) {
                    long jOptLong = jSONObject.optLong("_pause_ts", 0L);
                    if (jOptLong > 0 && System.currentTimeMillis() - jOptLong > 259200000) {
                        LIZIZ().erase(str);
                    } else if (!z && !C295520BiA.LIZ()) {
                        LIZIZ().erase(str);
                    } else {
                        LIZIZ().erase(str);
                        jSONObject.remove("_pause_ts");
                        jSONObject.remove("_tracks_first_image_render");
                        jSONObject.put("is_from_pending_flush", 1);
                        try {
                            C20684815ws.LJIJ("explore_card_play_attribution", jSONObject);
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
    }
}

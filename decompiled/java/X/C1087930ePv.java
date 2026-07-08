package X;

import android.content.ContentResolver;
import android.content.Context;
import android.os.SystemClock;
import android.provider.Settings;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ePv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087930ePv {
    public static int LIZ;
    public static int LIZIZ;
    public static int LIZLLL;
    public static int LJ;
    public static int LJFF;
    public static int LJI;
    public static Room LJII;
    public static long LJIIIIZZ;
    public static String LIZJ = "";
    public static final HashMap<String, C1088010eQ3> LJIIIZ = new HashMap<>();

    public static void LIZ(int i, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", SystemClock.uptimeMillis() - j);
            jSONObject.put("error_code", i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1CC2.LJI("ttlive_like_query_icons_duration", new JSONObject(), null, jSONObject);
    }

    public static void LIZJ(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        float f;
        float f2;
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII == null) {
            return;
        }
        C1088020eQ4 c1088020eQ4 = C1088020eQ4.LIZ;
        C1868607To c1868607To = C1088020eQ4.LIZIZ;
        if (c1868607To == null) {
            synchronized (c1088020eQ4) {
                try {
                    c1868607To = C1088020eQ4.LIZIZ;
                    if (c1868607To == null) {
                        ContentResolver contentResolver = contextLJII.getContentResolver();
                        float f3 = 1.0f;
                        try {
                            f = Settings.Global.getFloat(contentResolver, "window_animation_scale", 1.0f);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            f = 1.0f;
                        }
                        try {
                            f2 = Settings.Global.getFloat(contentResolver, "transition_animation_scale", 1.0f);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            f2 = 1.0f;
                        }
                        try {
                            f3 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                        }
                        c1868607To = new C1868607To(f, f2, f3);
                        C1088020eQ4.LIZIZ = c1868607To;
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    throw th4;
                }
            }
        }
        boolean z2 = false;
        if (c1868607To.LIZ != 0.0f && c1868607To.LIZIZ != 0.0f && c1868607To.LIZJ != 0.0f) {
            z = false;
        } else {
            z = true;
        }
        jSONObject.put("animation_disabled", String.valueOf(z));
        if (c1868607To.LIZ == 0.0f && c1868607To.LIZIZ == 0.0f && c1868607To.LIZJ == 0.0f) {
            z2 = true;
        }
        jSONObject.put("all_animation_disabled", String.valueOf(z2));
        jSONObject2.put("window_animation_scale", c1868607To.LIZ);
        jSONObject2.put("transition_animation_scale", c1868607To.LIZIZ);
        jSONObject2.put("animator_duration_scale", c1868607To.LIZJ);
    }

    public static void LIZIZ(String str, int i, Room room, String str2, long j, int i2, int i3, int i4, int i5) {
        String str3;
        LiveMode streamType;
        LJI += i;
        JSONObject jSONObjectPut = new JSONObject().put("enter_from", str).put("like_optimize", i2).put("like_end_status", i3).put("is_success", i4).put("error_code", i5);
        Long lValueOf = null;
        if (room != null && (streamType = room.getStreamType()) != null) {
            str3 = streamType.logStreamingType;
        } else {
            str3 = null;
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("room_type", str3);
        JSONObject jSONObjectPut3 = new JSONObject().put("count", i).put("api_duration", SystemClock.uptimeMillis() - j);
        JSONObject jSONObjectPut4 = new JSONObject().put("anchor_id", str2);
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        }
        C1CC2.LJI("ttlive_like_request_monitor", jSONObjectPut2, jSONObjectPut3, jSONObjectPut4.put("room_id", lValueOf));
    }
}

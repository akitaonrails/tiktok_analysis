package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0JBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488020JBw {
    public static final boolean LIZ(Room room) {
        if (room != null) {
            try {
                String str = room.roomCreateAbParam;
                if (str != null) {
                    if (new JSONObject(str).optBoolean("comment_filter_optimize", false)) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }
}

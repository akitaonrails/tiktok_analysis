package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0INV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0INV {
    public final Map<String, Object> LIZ = new ConcurrentHashMap(10);
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    public final EnterRoomLinkSession LIZ() {
        if (C2093608Ic.LJ(this.LIZIZ)) {
            JSONObject jSONObject = new JSONObject();
            EnterRoomLinkSession.LJFF("error_msg", Log.getStackTraceString(new Throwable("")), jSONObject);
            C1CC2.LJI("live_enter_room_session_null_error", new JSONObject(), null, jSONObject);
            EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(new EnterRoomConfig());
            enterRoomLinkSession.LIZIZ(new Event("session_is_null", 4353, C0IIR.BussinessApiCall));
            LIZLLL(enterRoomLinkSession);
        }
        return (EnterRoomLinkSession) ((ConcurrentHashMap) this.LIZ).get(this.LIZIZ);
    }

    public final EnterRoomLinkSession LIZIZ() {
        if (C2093608Ic.LJ(this.LIZLLL)) {
            return LIZ();
        }
        return (EnterRoomLinkSession) ((ConcurrentHashMap) this.LIZ).get(this.LIZLLL);
    }

    public final void LIZJ(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("enter_room_session_id");
            this.LIZIZ = string;
            this.LIZJ = string;
            this.LIZLLL = bundle.getString("first_enter_room_session_id");
            this.LJ = bundle.getString("live_session_id");
            EnterRoomLinkSession enterRoomLinkSession = (EnterRoomLinkSession) bundle.getParcelable("enter_room_session");
            if (enterRoomLinkSession != null) {
                ((ConcurrentHashMap) this.LIZ).put(enterRoomLinkSession.LIZLLL(), enterRoomLinkSession);
            }
        }
    }

    public final void LIZLLL(EnterRoomLinkSession enterRoomLinkSession) {
        if (!TextUtils.isEmpty(this.LIZIZ) && !this.LIZIZ.equals(this.LIZLLL)) {
            ((ConcurrentHashMap) this.LIZ).remove(this.LIZIZ);
        }
        String strLIZLLL = enterRoomLinkSession.LIZLLL();
        this.LIZIZ = strLIZLLL;
        this.LIZJ = strLIZLLL;
        ((ConcurrentHashMap) this.LIZ).put(strLIZLLL, enterRoomLinkSession);
    }
}

package X;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0IO5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IO5 {
    public static final String LIZ(C925770aCN c925770aCN) {
        String str;
        Object c098200Yq;
        String guestRequestId;
        Object obj = null;
        if (c925770aCN != null) {
            str = c925770aCN.LJIIJ;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                w.LIZ.getClass();
                jSONObject.put("request_id", w.LJIJI());
                if (room != null) {
                    guestRequestId = room.getGuestRequestId();
                } else {
                    guestRequestId = null;
                }
                jSONObject.put("guest_request_id", guestRequestId);
                jSONObject.put("enter_from_merge", w.LJIIIZ());
                jSONObject.put("enter_method", w.LJIIL());
                jSONObject.put("action_type", w.LIZLLL());
                c098200Yq = C786410Ut5.J3(jSONObject);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            String str2 = (String) obj;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }
}

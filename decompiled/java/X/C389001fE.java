package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01fE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C389001fE {
    public static void LIZJ(String str, Pair[] pairArr) {
        JSONObject jSONObject;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (pairArr.length == 0) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            for (Pair pair : pairArr) {
                jSONObject.put((String) pair.getFirst(), pair.getSecond());
            }
        }
        LIZ(str, jSONObject, jCurrentTimeMillis, false);
    }

    public static final void LIZ(String str, JSONObject jSONObject, long j, boolean z) {
        C1323820kYO c1323820kYO;
        long currentUserId;
        User owner;
        if (jSONObject == null) {
            c1323820kYO = null;
        } else {
            c1323820kYO = new C1323820kYO(jSONObject);
        }
        C397901gf c397901gf = new C397901gf(j, c1323820kYO, str);
        boolean z2 = false;
        if (!z) {
            c397901gf.LLILZ = false;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("event_name", str);
        boolean z3 = true;
        pairArr[1] = new Pair("has_subscriber", Boolean.valueOf(C1548820qPI.LIZJ().containsKey(str)));
        if (!C500260Jjc.LJJIJLIJ()) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            } else {
                currentUserId = 0;
            }
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null && (owner = room.getOwner()) != null) {
                long id = owner.getId();
                if (id != 0 && currentUserId != 0 && id == currentUserId) {
                    z2 = true;
                }
            }
            z3 = z2;
        }
        pairArr[2] = new Pair("is_anchor", Boolean.valueOf(z3));
        C1CC2.LIZLLL("event_center_event_send", C2097608Jq.LJIIJ(pairArr), new LinkedHashMap(), new LinkedHashMap());
        C1548820qPI.LIZIZ(c397901gf);
    }
}

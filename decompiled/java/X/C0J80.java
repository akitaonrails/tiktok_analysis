package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0J80, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J80 implements InterfaceC486470J5x {
    public static boolean LLILLJJLI;
    public static final C0J80 LL = new C0J80();
    public static final List<Integer> LLILLL = C1697810uHb.LJIIJJI(134218273, 67109212, 83886377);

    public static final void LIZ() {
        if (LLILLJJLI) {
            return;
        }
        LLILLJJLI = true;
        Iterator<Integer> it2 = LLILLL.iterator();
        while (it2.hasNext()) {
            C2203431BLp.LIZIZ.LJI(it2.next().intValue(), 1, LL);
        }
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        if (C0J81.LIZ() && wsChannelMsg.method == 1) {
            try {
                String strOptString = new JSONObject(new String(wsChannelMsg.LIZ(), Charsets.UTF_8)).optString("server_param", "{}");
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("server_param", strOptString);
                C20684815ws.LJIILLIIL("l8_category_search", c2344009Gk.LIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}

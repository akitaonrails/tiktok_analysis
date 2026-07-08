package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00k4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C164200k4 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164200k4(long j, int i, Map map) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i = this.LL;
        long j = this.LLILLJJLI;
        Map<String, String> map = this.LLILLL;
        HashMap map2 = new HashMap();
        map2.put("ec_message_cnt", Integer.valueOf(i));
        map2.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - j));
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        C20684815ws.LJIJ("tiktokec_enter_page", jSONObject);
        return Unit.LIZ;
    }
}

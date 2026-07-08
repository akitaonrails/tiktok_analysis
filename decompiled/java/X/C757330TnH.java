package X;

import android.util.ArrayMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.ActiveCard;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TnH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C757330TnH {
    public static final void LIZ(C2344009Gk c2344009Gk, ActiveCard activeCard, ArrayMap arrayMap) {
        String str;
        Object c098200Yq;
        if (activeCard != null && (str = activeCard.liveLogExtra) != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    c2344009Gk.LJFF(next, String.valueOf(jSONObject.opt(next)));
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        if (!arrayMap.isEmpty()) {
            for (Map.Entry entry : arrayMap.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
    }
}

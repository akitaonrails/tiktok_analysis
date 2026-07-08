package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00Yo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C098000Yo extends C09AY implements Function0<Map<String, ? extends Object>> {
    public final /* synthetic */ JSONObject LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C098000Yo(JSONObject jSONObject) {
        super(0);
        this.LL = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends Object> invoke() {
        Unit unit;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = this.LL;
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if ((obj instanceof Integer) || (obj instanceof String)) {
                        linkedHashMap.put(next, obj);
                    }
                }
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return linkedHashMap;
            }
        } else {
            unit = null;
        }
        C189200o6.m2constructorimpl(unit);
        return linkedHashMap;
    }
}

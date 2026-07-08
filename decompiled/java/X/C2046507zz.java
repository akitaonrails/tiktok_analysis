package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2046507zz {
    public static final Map<String, String> LIZ(MobParam mobParam) {
        Object obj;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : JsonExtKt.toMap(new JSONObject(C7740030o.LIZ().getGson().LJIILL(mobParam))).entrySet()) {
                if (C123100dR.LIZ(entry.getKey()) && !Intrinsics.LJFF(entry.getKey(), "enter_from") && C123100dR.LIZ(entry.getValue().toString())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
            C189200o6.m2constructorimpl(linkedHashMap);
            obj = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = null;
        }
        return (Map) obj2;
    }
}

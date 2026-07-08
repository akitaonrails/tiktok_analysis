package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C118700cj {
    public static C012O LIZ(InterfaceC1033720d0U interfaceC1033720d0U) {
        String string;
        Object c098200Yq;
        List list;
        HashMap<String, Object> mapLIZIZ = C117200cU.LIZIZ(C117200cU.LIZ(interfaceC1033720d0U.getCommonParams(), "commonParams"));
        JSONObject jSONObjectLIZ = C117200cU.LIZ(interfaceC1033720d0U.getExtraParams(), "extraParams");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObjectLIZ.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObjectLIZ.opt(next);
            if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                map.put(next, objOpt.toString());
            }
        }
        HashMap<String, Object> mapLIZIZ2 = C117200cU.LIZIZ(C117200cU.LIZ(interfaceC1033720d0U.getLogExtra(), "logExtra"));
        String prefetchParams = interfaceC1033720d0U.getPrefetchParams();
        List list2 = null;
        if (prefetchParams == null || (string = a0.LJLIIIL(prefetchParams).toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            list = C13BV.INSTANCE;
        } else {
            try {
                c098200Yq = C117200cU.LIZJ(new JSONArray(string));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C13BV c13bv = C13BV.INSTANCE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = c13bv;
            }
            list = (List) c098200Yq;
        }
        if (!(!mapLIZIZ.isEmpty())) {
            mapLIZIZ = null;
        }
        if (!(!map.isEmpty())) {
            map = null;
        }
        if (!(!mapLIZIZ2.isEmpty())) {
            mapLIZIZ2 = null;
        }
        if (!list.isEmpty()) {
            list2 = list;
        }
        return new C012O(mapLIZIZ, map, mapLIZIZ2, list2);
    }
}

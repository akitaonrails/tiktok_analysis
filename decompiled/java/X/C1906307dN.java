package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.PiperData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07dN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1906307dN {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static Object LIZIZ(Object obj, Class cls, Class cls2) {
        Object linkedHashMap;
        if (Intrinsics.LJFF(cls2, Object.class) && (obj instanceof InterfaceC1909007do)) {
            return ((InterfaceC1909007do) obj).getValue();
        }
        if ((obj instanceof Integer) || (obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean) || obj == null) {
            return obj;
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            linkedHashMap = new ArrayList(C15438062q.LJIJJ(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                linkedHashMap.add(LIZIZ(it2.next(), cls, cls2));
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), LIZIZ(entry.getValue(), cls, cls2));
            }
        } else {
            if ((obj instanceof JSONObject) || (obj instanceof JSONArray) || (obj instanceof PiperData)) {
                return obj;
            }
            try {
                XBaseModel xBaseModel = (XBaseModel) cls.cast(obj);
                if (xBaseModel != null) {
                    obj = xBaseModel.convert();
                    return obj;
                }
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!(e instanceof C1549570qQV)) {
                    return obj.toString();
                }
                throw e;
            }
        }
        return linkedHashMap;
    }

    public static void LIZ(String str, List list, boolean z, Object obj) {
        if (z) {
            if (obj instanceof Collection) {
                Iterable iterable = (Iterable) obj;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    return;
                }
                for (Object obj2 : iterable) {
                    if (list == null || !(!C13LP.LJJJJ(obj2, list))) {
                    }
                }
                return;
            }
            if (list == null || !(!C13LP.LJJJJ(obj, list))) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" is not valid");
            throw new C1549570qQV(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}

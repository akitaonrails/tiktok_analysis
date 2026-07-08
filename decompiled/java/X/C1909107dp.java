package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.PiperData;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1909107dp {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Annotation annotation, Object obj) {
        if (annotation instanceof InterfaceC1909307dr) {
            if (!C13LQ.LJIILLIIL(obj, ((InterfaceC1909307dr) annotation).option())) {
                return true;
            }
            return false;
        }
        if (!(annotation instanceof InterfaceC1909207dq)) {
            return true;
        }
        if (!C13LQ.LJIILJJIL(((Integer) obj).intValue(), ((InterfaceC1909207dq) annotation).option())) {
            return true;
        }
        return false;
    }

    public static XBaseModel LIZJ(final Class cls, final String str) {
        return (XBaseModel) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: X.0qQM
            public final Map<String, Object> LL = new LinkedHashMap();

            /* JADX WARN: Removed duplicated region for block: B:108:0x0240  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x0243  */
            /* JADX WARN: Removed duplicated region for block: B:236:0x050f  */
            @Override // java.lang.reflect.InvocationHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r16, java.lang.reflect.Method r17, java.lang.Object[] r18) throws java.lang.Exception {
                /*
                    Method dump skipped, instruction units count: 1431
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1549480qQM.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static Object LIZLLL(Object obj, Class cls, Class cls2) throws Exception {
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
                linkedHashMap.add(LIZLLL(it2.next(), cls, cls2));
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), LIZLLL(entry.getValue(), cls, cls2));
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

    public static void LIZ(boolean z, Annotation annotation, Object obj, String str) throws C1549570qQV {
        if (z) {
            if (obj instanceof Collection) {
                Iterable iterable = (Iterable) obj;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    return;
                }
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    if (LIZIZ(annotation, it2.next())) {
                    }
                }
                return;
            }
            if (!LIZIZ(annotation, obj)) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" is not valid");
            throw new C1549570qQV(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}

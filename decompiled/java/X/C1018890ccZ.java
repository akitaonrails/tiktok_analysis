package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ccZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018890ccZ {
    public static final C1018890ccZ LIZ = new C1018890ccZ();
    public static final String LIZIZ = "AdHybridContainerCreator";
    public static final Map<String, Class<?>> LIZJ = new LinkedHashMap();
    public static final Map<String, Class<?>> LIZLLL = new LinkedHashMap();

    public static List LIZ(EnumC1016560cYo enumC1016560cYo) {
        Class<?> cls;
        Class<? extends U> clsAsSubclass;
        InterfaceC1018920ccc interfaceC1018920ccc;
        try {
            ArrayList arrayList = new ArrayList();
            C1018900cca.LIZ.getClass();
            List<String> list = (List) ((LinkedHashMap) C1018900cca.LIZLLL).get(enumC1016560cYo.name());
            if (list != null) {
                for (String str : list) {
                    Map<String, Class<?>> map = LIZLLL;
                    if (map.containsKey(str) && ((LinkedHashMap) map).get(str) != null) {
                        cls = (Class) ((LinkedHashMap) map).get(str);
                    } else {
                        cls = Class.forName(str);
                        map.put(str, cls);
                    }
                    if (cls != null && (clsAsSubclass = cls.asSubclass(InterfaceC1018920ccc.class)) != 0 && (interfaceC1018920ccc = (InterfaceC1018920ccc) clsAsSubclass.newInstance()) != null) {
                        arrayList.add(interfaceC1018920ccc);
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createGeckoConfigList: geckoModelList=");
            sbLIZ.append(arrayList);
            C2188811AlT.LIZIZ(sbLIZ);
            C811103Ev.LIZ(LIZIZ);
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("createGeckoConfigList: Exception = ");
                sbLIZ2.append(thM5exceptionOrNullimpl);
                C2188811AlT.LIZIZ(sbLIZ2);
                C811103Ev.LIZ(LIZIZ);
                C1AF0.LJ(thM5exceptionOrNullimpl);
                return null;
            }
            return null;
        }
    }
}

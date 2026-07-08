package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0cVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014770cVv {
    public static final Map<String, Object> LIZ(InterfaceC1014900cW8 interfaceC1014900cW8) {
        Object obj;
        String value;
        String str;
        EnumC1014780cVw enumC1014780cVw;
        boolean z;
        Object obj2 = null;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<C1014810cVz> listLIZIZ = interfaceC1014900cW8.LIZIZ();
            ArrayList arrayList = new ArrayList();
            for (C1014810cVz c1014810cVz : listLIZIZ) {
                if (c1014810cVz.LJ == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(c1014810cVz);
                }
            }
            linkedHashMap.put("render_times", Integer.valueOf(arrayList.size()));
            C1014810cVz c1014810cVz2 = (C1014810cVz) C13LP.LJJLIIIJL(interfaceC1014900cW8.LIZIZ());
            if (c1014810cVz2 != null && (enumC1014780cVw = c1014810cVz2.LIZIZ) != null) {
                value = enumC1014780cVw.getValue();
            } else {
                value = null;
            }
            linkedHashMap.put("render_reason", value);
            if (interfaceC1014900cW8.LIZIZ().isEmpty()) {
                str = "no_render_record";
            } else {
                C1014810cVz c1014810cVz3 = (C1014810cVz) C13LP.LJJLIIIJL(interfaceC1014900cW8.LIZIZ());
                if (c1014810cVz3 != null) {
                    str = c1014810cVz3.LJFF;
                } else {
                    str = null;
                }
            }
            linkedHashMap.put("render_fail_reason", str);
            C189200o6.m2constructorimpl(linkedHashMap);
            obj = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (Map) obj2;
    }
}

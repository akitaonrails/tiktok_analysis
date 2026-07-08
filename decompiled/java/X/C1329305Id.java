package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05Id, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1329305Id {
    public static final C1329305Id LIZ = new C1329305Id();
    public static final ConcurrentHashMap<String, InterfaceC1329405Ie<?>> LIZIZ = new ConcurrentHashMap<>();

    public static final void LIZLLL() {
        Iterator<T> it2 = LIZIZ.values().iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC1329405Ie) it2.next()).reset();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static final void LIZ(InterfaceC1329405Ie<?> interfaceC1329405Ie) {
        InterfaceC1329405Ie<?> interfaceC1329405IePut = LIZIZ.put(interfaceC1329405Ie.LIZIZ(), interfaceC1329405Ie);
        if (interfaceC1329405IePut != null && interfaceC1329405IePut != interfaceC1329405Ie) {
            try {
                interfaceC1329405IePut.release();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static final void LIZIZ(String str) {
        Iterator<T> it2 = LIZIZ.values().iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC1329405Ie) it2.next()).LJJIIJ(str);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static final void LIZJ(List<? extends InterfaceC1329505If> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC1329505If interfaceC1329505If : list) {
            String resourceType = interfaceC1329505If.getResourceType();
            Object arrayList = linkedHashMap.get(resourceType);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(resourceType, arrayList);
            }
            ((List) arrayList).add(interfaceC1329505If);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            InterfaceC1329405Ie<?> interfaceC1329405Ie = LIZIZ.get(str);
            if (interfaceC1329405Ie != null) {
                try {
                    interfaceC1329405Ie.LIZ(list2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error preloading resources of type ");
                    sbLIZ.append(str);
                    sbLIZ.append(": ");
                    sbLIZ.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
    }
}

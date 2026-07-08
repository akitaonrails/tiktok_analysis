package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0uLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700080uLG {
    public static final HashMap<String, HashMap<String, ? super InterfaceC1700110uLJ>> LIZ = new HashMap<>();
    public static final C01GW<C1700080uLG> LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(423));

    public static List LIZ(String str, String str2) {
        HashMap<String, HashMap<String, ? super InterfaceC1700110uLJ>> map = LIZ;
        synchronized (map) {
            try {
                ArrayList arrayList = new ArrayList();
                if (str2 != null) {
                    HashMap<String, ? super InterfaceC1700110uLJ> map2 = map.get(str);
                    if (map2 == null) {
                        return null;
                    }
                    InterfaceC1700110uLJ interfaceC1700110uLJ = map2.get(str2);
                    if (interfaceC1700110uLJ == null) {
                        return null;
                    }
                    arrayList.add(interfaceC1700110uLJ);
                } else {
                    HashMap<String, ? super InterfaceC1700110uLJ> map3 = map.get(str);
                    if (map3 == null) {
                        return null;
                    }
                    Iterator<? super InterfaceC1700110uLJ> it2 = map3.values().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(String str, String str2) {
        HashMap<String, HashMap<String, ? super InterfaceC1700110uLJ>> map = LIZ;
        synchronized (map) {
            try {
                HashMap<String, ? super InterfaceC1700110uLJ> map2 = map.get(str);
                if (map2 != null) {
                    map2.remove(str2);
                }
                HashMap<String, ? super InterfaceC1700110uLJ> map3 = map.get(str);
                if (map3 != null && map3.isEmpty()) {
                    map.remove(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

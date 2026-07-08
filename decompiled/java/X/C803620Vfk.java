package X;

import android.os.Bundle;
import com.ss.android.common.applog.AppLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0Vfk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803620Vfk {
    public static void LIZ() {
        InterfaceC803630Vfl interfaceC803630Vfl = new InterfaceC803630Vfl() { // from class: X.0Vfj
            @Override // X.InterfaceC803630Vfl
            public final Map<String, String> LIZ() {
                HashMap map = new HashMap();
                map.put("ram_size", C2161108dN.LIZJ());
                return map;
            }
        };
        CopyOnWriteArrayList<InterfaceC803630Vfl> copyOnWriteArrayList = C803640Vfm.LIZ;
        copyOnWriteArrayList.add(interfaceC803630Vfl);
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList);
        HashMap map = new HashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            map.putAll(((InterfaceC803630Vfl) it2.next()).LIZ());
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            C786410Ut5.LJJJI((String) entry.getKey(), (String) entry.getValue(), bundle);
        }
        AppLog.setCustomerHeader(bundle);
    }
}

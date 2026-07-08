package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.142a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201998142a {
    public final Map<String, List<InterfaceC202000142c>> LIZ = new HashMap();

    public final List<InterfaceC202000142c> LIZ(String str) {
        List<InterfaceC202000142c> list = (List) ((HashMap) this.LIZ).get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            ((HashMap) this.LIZ).put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    public final void LIZIZ(String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            Iterator<InterfaceC202000142c> it2 = LIZ(str).iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ();
            }
        }
    }

    public final void LIZJ(String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            Iterator<InterfaceC202000142c> it2 = LIZ(str).iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL();
            }
        }
    }
}

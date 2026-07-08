package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0XLG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XLG {
    public final Map<String, List<C080U>> LIZ;

    public C0XLG() {
        this(C13BV.INSTANCE);
    }

    public final List<C080U> LIZIZ() {
        Map<String, List<C080U>> map = this.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI((Iterable) ((Map.Entry) it2.next()).getValue(), arrayList);
        }
        return arrayList;
    }

    public C0XLG(List<C080U> list) {
        this.LIZ = new LinkedHashMap();
        for (C080U c080u : list) {
            String str = c080u.LIZ;
            Map<String, List<C080U>> map = this.LIZ;
            String lowerCase = str.toLowerCase(Locale.getDefault());
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(c080u);
        }
    }

    public final String LIZJ(String str) {
        Object next;
        List list = (List) ((LinkedHashMap) this.LIZ).get(str.toLowerCase(Locale.getDefault()));
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C080U) next).LIZIZ != null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C080U c080u = (C080U) next;
        if (c080u == null) {
            return null;
        }
        return c080u.LIZIZ;
    }

    public final void LIZ(String str, String str2) {
        C080U c080u = new C080U(str, str2);
        Map<String, List<C080U>> map = this.LIZ;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object arrayList = linkedHashMap.get(lowerCase);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(lowerCase, arrayList);
        }
        ((List) arrayList).add(c080u);
    }

    public final void LIZLLL(String str, String str2) {
        Map<String, List<C080U>> map = this.LIZ;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object arrayList = linkedHashMap.get(lowerCase);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(lowerCase, arrayList);
        }
        List list = (List) arrayList;
        list.clear();
        list.add(new C080U(str, str2));
    }
}

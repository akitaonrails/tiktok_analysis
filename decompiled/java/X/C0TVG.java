package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0TVG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TVG {
    public static final Map<Integer, List<C0TVI>> LIZ = new LinkedHashMap();

    public static void LIZ(View view, C0TVI c0tvi) {
        final int iHashCode = view.hashCode();
        Map<Integer, List<C0TVI>> map = LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Collection collection = (Collection) linkedHashMap.get(Integer.valueOf(iHashCode));
        if (collection == null || collection.isEmpty()) {
            map.put(Integer.valueOf(iHashCode), new ArrayList());
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0TVH
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    List list = (List) ((LinkedHashMap) C0TVG.LIZ).get(Integer.valueOf(iHashCode));
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        C20246014Ju c20246014JuOnApplyWindowInsets = c20246014Ju;
                        while (it2.hasNext()) {
                            c20246014JuOnApplyWindowInsets = ((C0TVI) it2.next()).onApplyWindowInsets(view2, c20246014Ju);
                        }
                        return c20246014JuOnApplyWindowInsets;
                    }
                    return c20246014Ju;
                }
            });
        }
        List list = (List) linkedHashMap.get(Integer.valueOf(iHashCode));
        if (list != null) {
            list.add(c0tvi);
        }
    }

    public static void LIZIZ(View view, C0TVI c0tvi) {
        int iHashCode = view.hashCode();
        Map<Integer, List<C0TVI>> map = LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        List list = (List) linkedHashMap.get(Integer.valueOf(iHashCode));
        if (list != null) {
            list.remove(c0tvi);
        }
        List list2 = (List) linkedHashMap.get(Integer.valueOf(iHashCode));
        if (list2 != null && list2.isEmpty()) {
            map.remove(Integer.valueOf(iHashCode));
        }
    }
}

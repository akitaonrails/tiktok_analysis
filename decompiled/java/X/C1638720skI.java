package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0skI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638720skI {
    public static final C1638440sjq LIZ;
    public static final C01GW LIZIZ;
    public static final EffectCategoryResponse LIZJ;

    static {
        C13BV c13bv = C13BV.INSTANCE;
        LIZ = new C1638440sjq(c13bv, c13bv, null);
        LIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(409));
        LIZJ = C1635120seU.LIZIZ;
    }

    public static final FilterBean LIZLLL() {
        return (FilterBean) LIZIZ.getValue();
    }

    public static final <K, V> Map<K, List<V>> LIZ(List<? extends Pair<? extends K, ? extends List<? extends V>>> list) {
        if (list != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Pair<? extends K, ? extends List<? extends V>> pair : list) {
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    public static final String LJ(FilterBean filterBean) {
        String filterFolder;
        if (filterBean == null || (filterFolder = filterBean.getFilterFolder()) == null) {
            return "";
        }
        return filterFolder;
    }

    public static final <K, V> List<K> LJFF(List<? extends Pair<? extends K, ? extends List<? extends V>>> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends Pair<? extends K, ? extends List<? extends V>>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getFirst());
        }
        return arrayList;
    }

    public static final <K, V> List<V> LJI(List<? extends Pair<? extends K, ? extends List<? extends V>>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Pair<? extends K, ? extends List<? extends V>>> it2 = list.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSecond(), arrayList);
        }
        return arrayList;
    }

    public static final boolean LIZIZ(FilterBean filterBean, FilterBean filterBean2) {
        if (filterBean == null) {
            if (filterBean2 != null) {
                return false;
            }
            return true;
        }
        if (filterBean2 == null || !Intrinsics.LJFF(filterBean.getId(), filterBean2.getId())) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(FilterBean filterBean, FilterBean filterBean2) {
        if (filterBean == null) {
            if (filterBean2 != null) {
                return false;
            }
            return true;
        }
        if (filterBean2 == null || !Intrinsics.LJFF(filterBean.getResId(), filterBean2.getResId())) {
            return false;
        }
        return true;
    }
}

package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.arch.SearchBffItem;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixFloatingLayerAssem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS136S0201000_10;
import kotlin.jvm.internal.AwS14S1001000_2;
import kotlin.jvm.internal.AwS150S0101000_10;
import kotlin.jvm.internal.AwS151S1100000_2;

/* JADX INFO: renamed from: X.0Qke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679260Qke implements Map<Integer, Pair<? extends View, ? extends SearchBffItem>>, InterfaceC2095908Iz {
    public final /* synthetic */ Map<Integer, Pair<View, SearchBffItem>> LL;
    public final /* synthetic */ MixFloatingLayerAssem LLILLJJLI;

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    public final void LIZ() {
        MixFloatingLayerAssem mixFloatingLayerAssem = this.LLILLJJLI;
        mixFloatingLayerAssem.LLJJJJJIL.removeCallbacks(mixFloatingLayerAssem.LLJJJJLIIL);
        MixFloatingLayerAssem mixFloatingLayerAssem2 = this.LLILLJJLI;
        C786410Ut5.LJLIIL(50L, mixFloatingLayerAssem2.LLJJJJJIL, mixFloatingLayerAssem2.LLJJJJLIIL);
    }

    @Override // java.util.Map
    public final void clear() {
        int size = this.LLILLJJLI.LLJJL.size();
        Collection collectionValues = ((LinkedHashMap) this.LLILLJJLI.LLJJL).values();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Pair) it2.next()).getSecond());
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, AFwS241S0000000_10.get$arr$(55), 30);
        ((LinkedHashMap) this.LLILLJJLI.LLJJL).clear();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS14S1001000_2 awS14S1001000_2 = new AwS14S1001000_2(size, strLJJLIIIJ, 0);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(awS14S1001000_2);
        LIZ();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<Integer, Pair<? extends View, ? extends SearchBffItem>>> entrySet() {
        return this.LL.entrySet();
    }

    @Override // java.util.Map
    public final Set<Integer> keySet() {
        return this.LL.keySet();
    }

    @Override // java.util.Map
    public final int size() {
        return this.LL.size();
    }

    @Override // java.util.Map
    public final Collection<Pair<? extends View, ? extends SearchBffItem>> values() {
        return this.LL.values();
    }

    public C679260Qke(MixFloatingLayerAssem mixFloatingLayerAssem) {
        this.LLILLJJLI = mixFloatingLayerAssem;
        this.LL = mixFloatingLayerAssem.LLJJL;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return this.LL.containsKey(Integer.valueOf(((Number) obj).intValue()));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        return this.LL.containsValue(obj);
    }

    @Override // java.util.Map
    public final Pair<? extends View, ? extends SearchBffItem> get(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        return this.LL.get(Integer.valueOf(((Number) obj).intValue()));
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends Integer, ? extends Pair<? extends View, ? extends SearchBffItem>> map) {
        Collection<? extends Pair<? extends View, ? extends SearchBffItem>> collectionValues = map.values();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Pair) it2.next()).getSecond());
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, AFwS241S0000000_10.get$arr$(56), 30);
        this.LLILLJJLI.LLJJL.putAll(map);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS151S1100000_2 awS151S1100000_2 = new AwS151S1100000_2((Map) map, (Map<? extends Integer, ? extends Pair<? extends View, SearchBffItem>>) strLJJLIIIJ, (String) 10);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(awS151S1100000_2);
        LIZ();
    }

    @Override // java.util.Map
    public final Pair<? extends View, ? extends SearchBffItem> remove(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        int iIntValue = ((Number) obj).intValue();
        Pair<View, SearchBffItem> pairRemove = this.LLILLJJLI.LLJJL.remove(Integer.valueOf(iIntValue));
        if (pairRemove != null) {
            SearchBffItem second = pairRemove.getSecond();
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            AwS150S0101000_10 awS150S0101000_10 = new AwS150S0101000_10(iIntValue, second, 3);
            c2341109Fh.getClass();
            C2341109Fh.LIZIZ(awS150S0101000_10);
        }
        LIZ();
        return pairRemove;
    }

    @Override // java.util.Map
    public final Pair<? extends View, ? extends SearchBffItem> put(Integer num, Pair<? extends View, ? extends SearchBffItem> pair) {
        int iIntValue = num.intValue();
        Pair<? extends View, ? extends SearchBffItem> pair2 = pair;
        Pair<View, SearchBffItem> pairPut = this.LLILLJJLI.LLJJL.put(Integer.valueOf(iIntValue), (Pair<View, SearchBffItem>) pair2);
        SearchBffItem second = pair2.getSecond();
        if (pairPut != null) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            AwS136S0201000_10 awS136S0201000_10 = new AwS136S0201000_10(iIntValue, (int) second, (SearchBffItem) pairPut, (Pair<? extends View, SearchBffItem>) 3);
            c2341109Fh.getClass();
            C2341109Fh.LIZIZ(awS136S0201000_10);
        } else {
            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
            AwS150S0101000_10 awS150S0101000_10 = new AwS150S0101000_10(iIntValue, second, 2);
            c2341109Fh2.getClass();
            C2341109Fh.LIZIZ(awS150S0101000_10);
        }
        LIZ();
        return pairPut;
    }
}

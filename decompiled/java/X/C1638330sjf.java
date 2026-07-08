package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0sjf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel$onStart$1$2", f = "EditFilterViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1638330sjf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Pair<EffectCategoryResponse, List<FilterBean>>> LL;
    public final /* synthetic */ EditFilterViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1638330sjf(List<? extends Pair<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>> list, EditFilterViewModel editFilterViewModel, InterfaceC1364105Vn<? super C1638330sjf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = editFilterViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1638330sjf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map mapLIZ;
        C1C7U.LIZ("EditFilterViewModel@7637.onStart$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Pair<EffectCategoryResponse, List<FilterBean>>> list = this.LL;
        Map mapLJ = null;
        if (list != null) {
            mapLIZ = C1638720skI.LIZ(list);
        } else {
            mapLIZ = null;
        }
        if (C19719512Dh.LJII(mapLIZ)) {
            mapLJ = mapLIZ;
        }
        int size = 0;
        if (mapLJ != null) {
            EditFilterViewModel editFilterViewModel = this.LLILLJJLI;
            for (Map.Entry entry : mapLJ.entrySet()) {
                Object key = entry.getKey();
                List<FilterBean> list2 = (List) entry.getValue();
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (FilterBean filterBean : list2) {
                    Pair pair = new Pair(filterBean.getId(), new Pair(Boolean.valueOf(C1453230nv7.LJIIIZ(filterBean, editFilterViewModel.LLIZ)), Boolean.valueOf(C1324750kZt.LJIIZILJ(filterBean.getThumbnailFileUri()))));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                mapLJ.put(key, C13LP.LJLLLL(C20085613iQ.LIZ(new AwS604S0100000_25((Map) linkedHashMap, (Map<String, Pair<Boolean, Boolean>>) 343), new AwS604S0100000_25((Map) linkedHashMap, (Map<String, Pair<Boolean, Boolean>>) 344)), list2));
            }
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sb = new StringBuilder("viki filter, categoryFilters()?.observe -> !NetWorkStateManagerProxy.isNetworkAvailable -> filterTable=");
        Set setKeySet = mapLJ.keySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((EffectCategoryResponse) it2.next()).getName());
        }
        sb.append(arrayList);
        sb.append(", filter.size =");
        Iterator it3 = mapLJ.values().iterator();
        while (it3.hasNext()) {
            size += ((List) it3.next()).size();
        }
        sb.append(size);
        interfaceC1463990oCTLIZLLL.d(sb.toString());
        EditFilterViewModel editFilterViewModel2 = this.LLILLJJLI;
        editFilterViewModel2.setStateImmediate(new AwS391S0200000_25(editFilterViewModel2, (EditFilterViewModel) mapLJ, (Map<EffectCategoryResponse, List<FilterBean>>) 161));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditFilterViewModel@7637.onStart$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

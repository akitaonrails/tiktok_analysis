package X;

import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS604S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0sjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$onStart$1$2$1", f = "FilterPanelViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1638310sjd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Pair<EffectCategoryResponse, List<FilterBean>>> LL;
    public final /* synthetic */ FilterPanelViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1638310sjd(List<? extends Pair<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>> list, FilterPanelViewModel filterPanelViewModel, InterfaceC1364105Vn<? super C1638310sjd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = filterPanelViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1638310sjd(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> mapLIZ;
        C1C7U.LIZ("FilterPanelViewModel@e224.onStart$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Pair<EffectCategoryResponse, List<FilterBean>>> list = this.LL;
        Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> mapLJ = null;
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
            FilterPanelViewModel filterPanelViewModel = this.LLILLJJLI;
            for (Map.Entry<EffectCategoryResponse, ? extends List<? extends FilterBean>> entry : mapLJ.entrySet()) {
                EffectCategoryResponse key = entry.getKey();
                List<? extends FilterBean> value = entry.getValue();
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(value, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                Iterator<? extends FilterBean> it2 = value.iterator();
                while (true) {
                    boolean z = true;
                    if (it2.hasNext()) {
                        FilterBean next = it2.next();
                        String id = next.getId();
                        InterfaceC1639870sm9 interfaceC1639870sm9Invoke = filterPanelViewModel.LLIZ.invoke();
                        if (interfaceC1639870sm9Invoke == null || !C1453230nv7.LJIIIZ(next, interfaceC1639870sm9Invoke)) {
                            z = false;
                        }
                        Pair pair = new Pair(id, new Pair(Boolean.valueOf(z), Boolean.valueOf(C1324750kZt.LJIIZILJ(next.getThumbnailFileUri()))));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                }
                mapLJ.put(key, C13LP.LJLLLL(C20085613iQ.LIZ(new AwS604S0100000_25((Map) linkedHashMap, (Map<String, Pair<Boolean, Boolean>>) 66), new AwS604S0100000_25((Map) linkedHashMap, (Map<String, Pair<Boolean, Boolean>>) 67)), value));
            }
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sb = new StringBuilder("viki filter, categoryFilters()?.observe -> !NetWorkStateManagerProxy.isNetworkAvailable -> filterTable=");
        Set<EffectCategoryResponse> setKeySet = mapLJ.keySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
        Iterator it3 = setKeySet.iterator();
        while (it3.hasNext()) {
            arrayList.add(((EffectCategoryResponse) it3.next()).getName());
        }
        sb.append(arrayList);
        sb.append(", filter.size =");
        Iterator it4 = mapLJ.values().iterator();
        while (it4.hasNext()) {
            size += ((List) it4.next()).size();
        }
        sb.append(size);
        interfaceC1463990oCTLIZLLL.d(sb.toString());
        this.LLILLJJLI.AR2(mapLJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FilterPanelViewModel@e224.onStart$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

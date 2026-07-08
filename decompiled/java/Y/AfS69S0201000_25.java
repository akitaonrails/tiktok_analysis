package Y;

import X.C091S;
import X.C09JN;
import X.C11PQ;
import X.C1449380nou;
import X.C15438062q;
import X.C1631810sZ9;
import X.C1639650sln;
import X.C1639670slp;
import X.C1C7U;
import X.C23061091v;
import X.C443120HZe;
import X.EnumC1641340soW;
import com.ss.android.ugc.aweme.filter.repository.internal.main.a;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import wuk.f;

/* JADX INFO: loaded from: classes26.dex */
public class AfS69S0201000_25 implements C09JN {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS69S0201000_25 afS69S0201000_25, Object obj) {
        Object next;
        C1C7U.LIZ("DefaultFilterRepository@352a.fetchInfo$d$1");
        List list = (List) obj;
        a aVar = (a) afS69S0201000_25.l0;
        List list2 = (List) afS69S0201000_25.l1;
        int i = afS69S0201000_25.i2;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            C1639650sln c1639650slnLIZ = aVar.LJIILIIL.LIZ(((C1639650sln) obj2).LIZ);
            if (c1639650slnLIZ == null || c1639650slnLIZ.LIZIZ == EnumC1641340soW.FILTER_STATE_UNKNOWN) {
                arrayList.add(obj2);
            }
        }
        aVar.LJJIIJZLJL(arrayList);
        if (aVar.LJIIIIZZ) {
            if (i == -1) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    C1639670slp c1639670slp = (C1639670slp) obj3;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(((C1639650sln) next).LIZ, c1639670slp.LIZ)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C1639650sln c1639650sln = (C1639650sln) next;
                    if (c1639650sln == null || c1639650sln.LIZIZ != EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS) {
                        arrayList2.add(obj3);
                    }
                }
                aVar.LJJIJLIJ(arrayList2);
            } else if (list2.size() <= i) {
                aVar.LJJIJLIJ(list2);
            } else {
                aVar.LJJIJLIJ(list2.subList(0, i));
            }
        }
        C1C7U.LIZIZ("DefaultFilterRepository@352a.fetchInfo$d$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS69S0201000_25 afS69S0201000_25, Object obj) {
        CategoryPageModel categoryPageModel;
        List<CategoryPageModel.FilterEffect> filtered_effects;
        String string;
        C1C7U.LIZ("DefaultStickerRepository@bad7.fetchCategoricalStickers$4");
        C091S c091s = (C091S) obj;
        if (c091s instanceof C23061091v) {
            T t = c091s.LIZ;
            CategoryEffectModel categoryEffects = null;
            if ((t instanceof CategoryPageModel) && (categoryPageModel = (CategoryPageModel) t) != null) {
                CategoryPageModel.Extra extra = categoryPageModel.getExtra();
                if (extra != null && (filtered_effects = extra.getFiltered_effects()) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(filtered_effects, 10));
                    for (CategoryPageModel.FilterEffect filterEffect : filtered_effects) {
                        Long id = filterEffect.getId();
                        if (id == null || (string = id.toString()) == null) {
                            string = "";
                        }
                        filterEffect.getReasonCode();
                        arrayList.add(new C1449380nou(string, filterEffect.getReasonMsg()));
                    }
                    if (!arrayList.isEmpty()) {
                        ((f) afS69S0201000_25.l0).LJJIII.onNext(new Pair<>(((C1631810sZ9) afS69S0201000_25.l1).LIZ, arrayList));
                    }
                }
                categoryEffects = categoryPageModel.getCategoryEffects();
            }
            C11PQ<C443120HZe<Integer, String, C091S<?>>> c11pq = ((f) afS69S0201000_25.l0).LJJIIJ;
            Integer numValueOf = Integer.valueOf(afS69S0201000_25.i2);
            C1631810sZ9 c1631810sZ9 = (C1631810sZ9) afS69S0201000_25.l1;
            c11pq.onNext(new C443120HZe<>(numValueOf, c1631810sZ9.LIZ, new C23061091v(c1631810sZ9.LJI, c1631810sZ9.LIZIZ, categoryEffects)));
        } else {
            ((f) afS69S0201000_25.l0).LJJIIJ.onNext(new C443120HZe<>(Integer.valueOf(afS69S0201000_25.i2), ((C1631810sZ9) afS69S0201000_25.l1).LIZ, c091s));
        }
        C1C7U.LIZIZ("DefaultStickerRepository@bad7.fetchCategoricalStickers$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS69S0201000_25(Object obj, a aVar, List<C1639670slp> list, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = aVar;
        this.i2 = list;
    }
}

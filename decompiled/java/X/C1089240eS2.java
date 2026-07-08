package X;

import com.bytedance.android.live.dynamicstrategy.strategy.Strategy;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEpiFeatureMigrateToFeatureCenterSetting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eS2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089240eS2 implements InterfaceC1089270eS5 {
    public final InterfaceC1089220eS0 LL;
    public final boolean LLILLJJLI;
    public InterfaceC1089760eSs LLILLL;
    public final Map<String, Object> LLILZ = new LinkedHashMap();
    public final Map<String, C1089610eSd> LLILZIL = new LinkedHashMap();
    public final ILiveDecisionService LLILZLL = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
    public final Map<String, InterfaceC1088470eQn<?>> LLIZ = new LinkedHashMap();

    @Override // X.InterfaceC1089270eS5
    public final void release() {
        this.LLILLL = null;
    }

    @Override // X.InterfaceC1089270eS5
    public final Collection<C443120HZe<C1089700eSm<Object>, List<InterfaceC1089750eSr<Object>>, AbstractC1089300eS8<Object>>> LIZLLL() {
        return this.LL.LJI();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1089270eS5
    public final void prepare() {
        Iterator<T> it2 = this.LL.LJI().iterator();
        while (it2.hasNext()) {
            C443120HZe c443120HZe = (C443120HZe) it2.next();
            AbstractC1089300eS8 abstractC1089300eS8 = (AbstractC1089300eS8) c443120HZe.getThird();
            ((ArrayList) abstractC1089300eS8.LLILLJJLI).addAll((Collection) c443120HZe.getSecond());
            if (c443120HZe.getThird() instanceof InterfaceC1088470eQn) {
                this.LLIZ.put(((C1089700eSm) c443120HZe.getFirst()).LIZ, (InterfaceC1088470eQn<?>) c443120HZe.getThird());
            }
        }
        Iterator<Pair<Strategy, InterfaceC1089740eSq>> itLIZJ = this.LL.LIZJ();
        while (itLIZJ.hasNext()) {
            Pair<Strategy, InterfaceC1089740eSq> next = itLIZJ.next();
            C1089610eSd c1089610eSdLIZJ = LIZJ(next.getFirst().decisionKey);
            if (c1089610eSdLIZJ == null) {
                c1089610eSdLIZJ = new C1089610eSd(next.getFirst().defaultValue, next.getFirst().defaultResultDict, true);
            }
            InterfaceC1089740eSq second = next.getSecond();
            if (second != null) {
                second.LIZ(c1089610eSdLIZJ);
            }
        }
        Collection<C443120HZe<C1089700eSm<Object>, List<InterfaceC1089750eSr<Object>>, AbstractC1089300eS8<Object>>> collectionLJI = this.LL.LJI();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it3 = collectionLJI.iterator();
        while (it3.hasNext()) {
            C443120HZe c443120HZe2 = (C443120HZe) it3.next();
            T t = ((C1089700eSm) c443120HZe2.getFirst()).LIZIZ;
            if (t != 0) {
                C0J0E c0j0e = new C0J0E();
                c0j0e.LIZ = ((C1089700eSm) c443120HZe2.getFirst()).LIZ;
                c0j0e.LIZLLL = ((AbstractC1089300eS8) c443120HZe2.getThird()).LL.LIZJ;
                linkedHashMap.put(c0j0e, t);
            }
        }
        LJI(linkedHashMap, true);
        Iterator<T> it4 = this.LL.LJI().iterator();
        while (it4.hasNext()) {
            ((AbstractC1089300eS8) ((C443120HZe) it4.next()).getThird()).LJ();
        }
    }

    @Override // X.InterfaceC1089270eS5
    public final Map<String, Object> LJII() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1089270eS5
    public final AbstractC1089300eS8<Object> LIZIZ(String str) {
        return this.LL.LIZIZ(str);
    }

    @Override // X.InterfaceC1089270eS5
    public final C1089610eSd LIZJ(String str) {
        return (C1089610eSd) ((LinkedHashMap) this.LLILZIL).get(str);
    }

    @Override // X.InterfaceC1089270eS5
    public final void LJFF(C1089210eRz c1089210eRz) {
        this.LLILLL = c1089210eRz;
    }

    public C1089240eS2(C1089230eS1 c1089230eS1, boolean z) {
        this.LL = c1089230eS1;
        this.LLILLJJLI = z;
    }

    public final void LJI(Map<C0J0E, Object> map, boolean z) {
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (true) {
            Pair pair = null;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            String str = ((C0J0E) entry.getKey()).LIZ;
            Object value = entry.getValue();
            C0J0Q c0j0q = ((C0J0E) entry.getKey()).LIZLLL;
            if (!Intrinsics.LJFF(((LinkedHashMap) this.LLILZ).get(str), value)) {
                this.LLILZ.put(str, value);
                if (LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE.getValue()) {
                    ILiveDecisionService iLiveDecisionService = this.LLILZLL;
                    C0J0Q c0j0q2 = C0J0Q.ROOM;
                    if (c0j0q == c0j0q2) {
                        if (this.LLILLJJLI) {
                            c0j0q = C0J0Q.ANCHOR;
                            c0j0q2 = c0j0q;
                        }
                        iLiveDecisionService.bg(c0j0q2, str, value, EnumC467180ITs.EPI.getGroupName(), false);
                    } else {
                        c0j0q2 = c0j0q;
                        iLiveDecisionService.bg(c0j0q2, str, value, EnumC467180ITs.EPI.getGroupName(), false);
                    }
                }
                pair = new Pair(str, value);
            }
            arrayList.add(pair);
        }
        List listLJJJJLI = C13LP.LJJJJLI(arrayList);
        if (!z) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = ((ArrayList) listLJJJJLI).iterator();
            while (it3.hasNext()) {
                arrayList2.addAll(this.LL.LJIIIIZZ((String) ((Pair) it3.next()).getFirst()));
            }
            List listLJJJJI = C13LP.LJJJJI(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = listLJJJJI.iterator();
            while (it4.hasNext()) {
                C443120HZe<Strategy, C1089610eSd, C1089610eSd> c443120HZeLJIIIZ = LJIIIZ((Strategy) ((Pair) it4.next()).getFirst(), C2097608Jq.LJ(), false, "");
                if (c443120HZeLJIIIZ != null) {
                    arrayList3.add(c443120HZeLJIIIZ);
                }
            }
            List<C443120HZe> listLLIIII = C13LP.LLIIII(arrayList3);
            InterfaceC1089760eSs interfaceC1089760eSs = this.LLILLL;
            if (interfaceC1089760eSs != null) {
                for (C443120HZe c443120HZe : listLLIIII) {
                    interfaceC1089760eSs.LIZIZ((C1089610eSd) c443120HZe.getThird(), ((Strategy) c443120HZe.getFirst()).decisionKey);
                }
            }
        }
    }

    @Override // X.C0KY6
    public final Object LIZ(String str, String str2, String str3) {
        return LJIIIIZZ(str, str2, str3);
    }

    @Override // X.InterfaceC1089270eS5
    public final void LJ(C0J0Q c0j0q, Object obj, String str) {
        C0J0E c0j0e = new C0J0E();
        c0j0e.LIZ = str;
        c0j0e.LIZLLL = c0j0q;
        LJI(C2097608Jq.LJIIJ(new Pair(c0j0e, obj)), false);
    }

    @Override // X.InterfaceC1089270eS5
    public final Object LJIIIIZZ(String str, String str2, String str3) {
        Object obj;
        if (LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE.getValue()) {
            ILiveDecisionService iLiveDecisionService = this.LLILZLL;
            EnumC1094630eaj.Companion.getClass();
            C1090000eTG c1090000eTGO3 = iLiveDecisionService.O3(C1094620eai.LIZ(str3), str2, str);
            if (c1090000eTGO3 != null && (obj = c1090000eTGO3.LIZJ) != null) {
                return obj;
            }
            return ((LinkedHashMap) this.LLILZ).get(str);
        }
        return ((LinkedHashMap) this.LLILZ).get(str);
    }

    @Override // X.InterfaceC1089270eS5
    public final C443120HZe<Strategy, C1089610eSd, C1089610eSd> LJIIIZ(Strategy strategy, Map<String, ? extends Object> map, boolean z, String str) {
        C1089610eSd c1089610eSd = (C1089610eSd) ((LinkedHashMap) this.LLILZIL).get(strategy.decisionKey);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE.getValue()) {
            for (C0J0E c0j0e : (ArrayList) strategy.LIZIZ()) {
                Object objLJIIIIZZ = LJIIIIZZ(c0j0e.LIZ, c0j0e.LIZJ, c0j0e.LIZIZ);
                if (objLJIIIIZZ != null) {
                    linkedHashMap.put(c0j0e.LIZ, objLJIIIIZZ);
                }
            }
            for (C0J0E c0j0e2 : (ArrayList) strategy.LIZ()) {
                Object objLJIIIIZZ2 = LJIIIIZZ(c0j0e2.LIZ, c0j0e2.LIZJ, c0j0e2.LIZIZ);
                if (objLJIIIIZZ2 != null) {
                    linkedHashMap.put(c0j0e2.LIZ, objLJIIIIZZ2);
                }
            }
        } else {
            List<String> list = strategy.relativeFactors;
            if (list != null) {
                for (String str2 : list) {
                    Object objLJIIIIZZ3 = LJIIIIZZ(str2, EnumC467180ITs.EPI.getGroupName(), "default");
                    if (objLJIIIIZZ3 != null) {
                        linkedHashMap.put(str2, objLJIIIIZZ3);
                    }
                }
            }
            List<String> list2 = strategy.conditionFactors;
            if (list2 != null) {
                for (String str3 : list2) {
                    Object objLJIIIIZZ4 = LJIIIIZZ(str3, EnumC467180ITs.EPI.getGroupName(), "default");
                    if (objLJIIIIZZ4 != null) {
                        linkedHashMap.put(str3, objLJIIIIZZ4);
                    }
                }
            }
        }
        C1089610eSd c1089610eSdLIZ = C1089660eSi.LIZ(strategy, new LinkedHashMap(C2097608Jq.LJIIL(linkedHashMap, map)), str);
        if (c1089610eSd != null && c1089610eSdLIZ.LIZ(c1089610eSd) && !z) {
            return null;
        }
        this.LLILZIL.put(strategy.decisionKey, c1089610eSdLIZ);
        return new C443120HZe<>(strategy, c1089610eSd, c1089610eSdLIZ);
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625940sPg {
    public static final int LIZLLL(InterfaceC1624480sNK interfaceC1624480sNK) {
        Map<String, InterfaceC2176408fq> mapLIZLLL = interfaceC1624480sNK.getStickerRepository().LJII().LIZLLL();
        ArrayList arrayList = new ArrayList(mapLIZLLL.size());
        Iterator<Map.Entry<String, InterfaceC2176408fq>> it2 = mapLIZLLL.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getKey());
        }
        int i = 0;
        for (EffectCategoryModel effectCategoryModel : C23117093z.LJFF(interfaceC1624480sNK.getStickerRepository().LJFF())) {
            int i2 = i + 1;
            if (i >= 0) {
                if (!arrayList.contains(effectCategoryModel.getKey())) {
                    return i;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int LJIIIZ(InterfaceC1624480sNK interfaceC1624480sNK) {
        C1624330sN5 c1624330sN5 = (C1624330sN5) interfaceC1624480sNK.LJII().LJIJI().getValue();
        if (c1624330sN5 != null) {
            return c1624330sN5.LIZIZ;
        }
        return 0;
    }

    public static final int LIZ(InterfaceC1624480sNK interfaceC1624480sNK, String str) {
        Iterator<EffectCategoryModel> it2 = C23117093z.LJFF(interfaceC1624480sNK.getStickerRepository().LJFF()).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(it2.next().getKey(), str)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static final Pair LIZJ(List list, int i) {
        if (list.size() - 2 < i) {
            return new Pair(null, null);
        }
        if (i < 0) {
            i = 0;
        }
        if (i < list.size()) {
            return new Pair(ListProtector.get(list, i), ((Effect) ListProtector.get(list, i)).getEffectId());
        }
        return new Pair(null, null);
    }

    public static final Pair LJII(List list, int i) {
        if (i - 2 < 0) {
            return new Pair(null, null);
        }
        int iLJ = C13LZ.LJ(i, 0, list.size() - 1) - 2;
        if (-1 < iLJ) {
            return new Pair(ListProtector.get(list, iLJ), ((Effect) ListProtector.get(list, iLJ)).getEffectId());
        }
        return new Pair(null, null);
    }

    public static final EffectCategoryModel LJIIIIZZ(InterfaceC1624480sNK interfaceC1624480sNK, int i) {
        InterfaceC1633140sbI interfaceC1633140sbILJFF = interfaceC1624480sNK.getStickerRepository().LJFF();
        if (i >= 0 && i < C23117093z.LJFF(interfaceC1633140sbILJFF).size()) {
            return (EffectCategoryModel) ListProtector.get(C23117093z.LJFF(interfaceC1633140sbILJFF), i);
        }
        return null;
    }

    public static final boolean LJIIJ(InterfaceC1624480sNK interfaceC1624480sNK, Effect effect) {
        return interfaceC1624480sNK.LJII().LJIIL(effect);
    }

    public static final boolean LJIIJJI(InterfaceC1624480sNK interfaceC1624480sNK, Effect effect) {
        String effectId;
        if (effect == null) {
            return false;
        }
        String effectId2 = effect.getEffectId();
        Effect effectLJJL = interfaceC1624480sNK.LJJL();
        String resourceId = null;
        if (effectLJJL != null) {
            effectId = effectLJJL.getEffectId();
        } else {
            effectId = null;
        }
        if (!Intrinsics.LJFF(effectId2, effectId)) {
            if (!Intrinsics.LJFF(interfaceC1624480sNK.LJJLIIIJJIZ().LIZ, "livestreaming")) {
                return false;
            }
            String resourceId2 = effect.getResourceId();
            Effect effectLJJL2 = interfaceC1624480sNK.LJJL();
            if (effectLJJL2 != null) {
                resourceId = effectLJJL2.getResourceId();
            }
            if (!Intrinsics.LJFF(resourceId2, resourceId)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJIIL(InterfaceC1624480sNK interfaceC1624480sNK, Effect effect) {
        String effectId;
        if (effect == null) {
            return false;
        }
        String effectId2 = effect.getEffectId();
        Effect effectLLILIL = interfaceC1624480sNK.LLILIL();
        String resourceId = null;
        if (effectLLILIL != null) {
            effectId = effectLLILIL.getEffectId();
        } else {
            effectId = null;
        }
        if (!Intrinsics.LJFF(effectId2, effectId)) {
            if (!Intrinsics.LJFF(interfaceC1624480sNK.LJJLIIIJJIZ().LIZ, "livestreaming")) {
                return false;
            }
            String resourceId2 = effect.getResourceId();
            Effect effectLLILIL2 = interfaceC1624480sNK.LLILIL();
            if (effectLLILIL2 != null) {
                resourceId = effectLLILIL2.getResourceId();
            }
            if (!Intrinsics.LJFF(resourceId2, resourceId)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJIILIIL(InterfaceC1624480sNK interfaceC1624480sNK, Effect effect) {
        CategoryEffectModel categoryEffectModelLJIIIIZZ;
        if (effect == null || (categoryEffectModelLJIIIIZZ = interfaceC1624480sNK.getStickerRepository().LJFF().LJIIIIZZ("greenscreen")) == null) {
            return false;
        }
        for (Effect effect2 : categoryEffectModelLJIIIIZZ.getEffects()) {
            if (Intrinsics.LJFF(effect2.getEffectId(), effect.getEffectId())) {
                if (effect2 == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIILJJIL(InterfaceC1624480sNK interfaceC1624480sNK, Effect effect) {
        String effectId;
        if (effect != null) {
            Effect effectLJI = interfaceC1624480sNK.LJII().LJI();
            if (effectLJI != null) {
                effectId = effectLJI.getEffectId();
            } else {
                effectId = null;
            }
            return Intrinsics.LJFF(effectId, effect.getEffectId());
        }
        return false;
    }

    public static final boolean LJIILL(InterfaceC1624480sNK interfaceC1624480sNK, Effect effect) {
        if (effect != null && effect.getEffectType() == 0 && !interfaceC1624480sNK.getStickerRepository().LJIILLIIL().LIZ(effect, false)) {
            return true;
        }
        return false;
    }

    public static final Effect LIZIZ(InterfaceC1624480sNK interfaceC1624480sNK, List<? extends Effect> list, int i) {
        if (list.size() - 2 < i) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        int size = list.size();
        while (i < size) {
            if (LJIILL(interfaceC1624480sNK, (Effect) ListProtector.get(list, i))) {
                return (Effect) ListProtector.get(list, i);
            }
            i++;
        }
        return null;
    }

    public static final List<Effect> LJ(InterfaceC1624480sNK interfaceC1624480sNK, List<? extends Effect> list, int i, int i2) {
        if (list.size() - 2 < i) {
            return C13BV.INSTANCE;
        }
        if (i2 <= 0) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (i < 0) {
            i = 0;
        }
        int size = list.size();
        while (i < size) {
            if (LJIILL(interfaceC1624480sNK, (Effect) ListProtector.get(list, i))) {
                arrayList.add(ListProtector.get(list, i));
                if (arrayList.size() == i2) {
                    return arrayList;
                }
            }
            i++;
        }
        return arrayList;
    }

    public static final Pair LJFF(List list, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list.size() - 2 < i) {
            return new Pair(arrayList, arrayList2);
        }
        if (i2 > 0 && i3 > 0) {
            if (i < 0) {
                i = 0;
            }
            int size = list.size();
            while (i < size) {
                if (arrayList2.size() <= i3) {
                    arrayList2.add(((Effect) ListProtector.get(list, i)).getEffectId());
                }
                arrayList.add(ListProtector.get(list, i));
                if (arrayList.size() == i2) {
                    return new Pair(arrayList, arrayList2);
                }
                i++;
            }
            return new Pair(arrayList, arrayList2);
        }
        return new Pair(arrayList, arrayList2);
    }

    public static final Pair LJI(List list, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i - 2 < 0) {
            return new Pair(arrayList, arrayList2);
        }
        if (i2 <= 0) {
            return new Pair(arrayList, arrayList2);
        }
        for (int iLJ = C13LZ.LJ(i, 0, list.size() - 1) - 2; -1 < iLJ; iLJ--) {
            arrayList.add(ListProtector.get(list, iLJ));
            if (arrayList2.size() <= i3) {
                arrayList2.add(((Effect) ListProtector.get(list, iLJ)).getEffectId());
            }
            if (arrayList.size() == i2) {
                return new Pair(arrayList, arrayList2);
            }
        }
        return new Pair(arrayList, arrayList2);
    }
}

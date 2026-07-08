package X;

import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.093z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23117093z {
    public static final Map<String, CategoryEffectModel> LJ(InterfaceC1625880sPa interfaceC1625880sPa) {
        Object obj;
        Map<String, LiveData<C1641640sp0<CategoryEffectModel>>> mapLJIJI = interfaceC1625880sPa.LJIJI();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIJI.size()));
        Iterator<T> it2 = mapLJIJI.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            C1641640sp0 c1641640sp0 = (C1641640sp0) ((LiveData) entry.getValue()).getValue();
            if (c1641640sp0 != null) {
                obj = c1641640sp0.LIZ;
            } else {
                obj = null;
            }
            linkedHashMap.put(key, obj);
        }
        return linkedHashMap;
    }

    public static final List<EffectCategoryModel> LJFF(InterfaceC1625880sPa interfaceC1625880sPa) {
        if (C1659720tIA.LIZIZ()) {
            List<EffectCategoryModel> value = interfaceC1625880sPa.LJI().getValue();
            if (value == null) {
                return C13BV.INSTANCE;
            }
            return value;
        }
        return interfaceC1625880sPa.LIZIZ();
    }

    public static final String LJI(InterfaceC1625880sPa interfaceC1625880sPa) {
        if (((LinkedHashMap) LJ(interfaceC1625880sPa)).get("hot") == null) {
            if (((LinkedHashMap) LJ(interfaceC1625880sPa)).get("trending") != null) {
                return "trending";
            }
            if (((LinkedHashMap) LJ(interfaceC1625880sPa)).get("all") != null) {
                return "all";
            }
        }
        return "hot";
    }

    public static final String LJII(InterfaceC1625880sPa interfaceC1625880sPa) {
        List listLJLLJ = C13LP.LJLLJ(((LinkedHashMap) LJ(interfaceC1625880sPa)).keySet());
        if (listLJLLJ.size() >= 2) {
            return (String) ListProtector.get(listLJLLJ, 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Integer LJIIIIZZ(InterfaceC1624480sNK interfaceC1624480sNK) {
        PanelInfoModel panelInfoModel;
        CategoryEffectModel categoryEffectModel;
        String categoryKey;
        AnonymousClass0940 anonymousClass0940LIZJ;
        C1641640sp0 c1641640sp0 = (C1641640sp0) interfaceC1624480sNK.getStickerRepository().LJFF().LJIIJ(null, false, true, false).getValue();
        if (c1641640sp0 == null || (panelInfoModel = (PanelInfoModel) c1641640sp0.LIZ) == null || (categoryEffectModel = panelInfoModel.getCategoryEffectModel()) == null || (categoryKey = categoryEffectModel.getCategoryKey()) == null || (anonymousClass0940LIZJ = LIZJ(interfaceC1624480sNK, categoryKey)) == null) {
            return null;
        }
        return Integer.valueOf(anonymousClass0940LIZJ.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CategoryEffectModel LIZ(InterfaceC1625880sPa interfaceC1625880sPa, String str) {
        C1641640sp0 c1641640sp0;
        if (str != null && (c1641640sp0 = (C1641640sp0) interfaceC1625880sPa.LJIJJLI(str, null, false, false).getValue()) != null) {
            return (CategoryEffectModel) c1641640sp0.LIZ;
        }
        return null;
    }

    public static final EffectCategoryModel LIZIZ(InterfaceC1625880sPa interfaceC1625880sPa, Effect effect) {
        EffectCategoryModel effectCategoryModel = null;
        if (effect == null) {
            return null;
        }
        Map<String, CategoryEffectModel> mapLJ = LJ(interfaceC1625880sPa);
        List<EffectCategoryModel> listLJFF = LJFF(interfaceC1625880sPa);
        Iterator it2 = ((LinkedHashMap) mapLJ).entrySet().iterator();
        while (it2.hasNext()) {
            CategoryEffectModel categoryEffectModel = (CategoryEffectModel) ((Map.Entry) it2.next()).getValue();
            if (categoryEffectModel != null) {
                List<Effect> effects = categoryEffectModel.getEffects();
                if (!(effects instanceof Collection) || !effects.isEmpty()) {
                    Iterator<Effect> it3 = effects.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.LJFF(it3.next().getEffectId(), effect.getEffectId())) {
                            Iterator<EffectCategoryModel> it4 = listLJFF.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                EffectCategoryModel next = it4.next();
                                if (Intrinsics.LJFF(next.getKey(), categoryEffectModel.getCategoryKey())) {
                                    effectCategoryModel = next;
                                    break;
                                }
                            }
                            return effectCategoryModel;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final AnonymousClass0940 LIZJ(InterfaceC1624480sNK interfaceC1624480sNK, String str) {
        InterfaceC1633140sbI interfaceC1633140sbILJFF = interfaceC1624480sNK.getStickerRepository().LJFF();
        Iterator<EffectCategoryModel> it2 = LJFF(interfaceC1633140sbILJFF).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getKey(), str)) {
                if (i != -1) {
                    ListProtector.get(LJFF(interfaceC1633140sbILJFF), i);
                    return new AnonymousClass0940(i);
                }
                return null;
            }
            i++;
        }
        return null;
    }

    public static final C443120HZe<CategoryEffectModel, Boolean, Integer> LIZLLL(InterfaceC1625880sPa interfaceC1625880sPa, Effect effect) {
        if (effect == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        HorizontalEffectsModel horizontalEffectsModelLJIILIIL = interfaceC1625880sPa.LJIILIIL();
        if (horizontalEffectsModelLJIILIIL != null) {
            Object value = null;
            for (Map.Entry entry : ((LinkedHashMap) LJ(interfaceC1625880sPa)).entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), "hot")) {
                    value = entry.getValue();
                }
            }
            arrayList.addAll(horizontalEffectsModelLJIILIIL.trending_effects);
            List<? extends Effect> list = horizontalEffectsModelLJIILIIL.insert_effects;
            if (list != null) {
                arrayList.addAll(list);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Effect effect2 = (Effect) it2.next();
                if (Intrinsics.LJFF(effect2.getEffectId(), effect.getEffectId())) {
                    C443120HZe<CategoryEffectModel, Boolean, Integer> c443120HZe = new C443120HZe<>(value, Boolean.TRUE, Integer.valueOf(arrayList.indexOf(effect2)));
                    if (!Intrinsics.LJFF(c443120HZe.getSecond(), Boolean.TRUE)) {
                        if (effect == null) {
                            return null;
                        }
                    } else {
                        return c443120HZe;
                    }
                }
            }
        }
        ArrayList<Effect> arrayList2 = new ArrayList();
        HorizontalEffectsModel horizontalEffectsModelLJIILIIL2 = interfaceC1625880sPa.LJIILIIL();
        if (horizontalEffectsModelLJIILIIL2 == null) {
            return null;
        }
        Object value2 = null;
        for (Map.Entry entry2 : ((LinkedHashMap) LJ(interfaceC1625880sPa)).entrySet()) {
            if (Intrinsics.LJFF(entry2.getKey(), "sticker_category:favorite")) {
                value2 = entry2.getValue();
            }
        }
        List<? extends Effect> list2 = horizontalEffectsModelLJIILIIL2.favorite_effects;
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        List<? extends Effect> list3 = horizontalEffectsModelLJIILIIL2.recent_effects;
        if (list3 != null) {
            arrayList2.addAll(list3);
        }
        for (Effect effect3 : arrayList2) {
            if (Intrinsics.LJFF(effect3.getEffectId(), effect.getEffectId())) {
                return new C443120HZe<>(value2, Boolean.TRUE, Integer.valueOf(arrayList2.indexOf(effect3)));
            }
        }
        return null;
    }
}

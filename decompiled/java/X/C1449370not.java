package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0not, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449370not {
    public static String LIZJ(InterfaceC1624480sNK interfaceC1624480sNK) {
        String key;
        if (interfaceC1624480sNK.LJIIJ().length() == 0) {
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) C13LP.LJJJLZIJ(C1625940sPg.LIZLLL(interfaceC1624480sNK), C23117093z.LJFF(interfaceC1624480sNK.getStickerRepository().LJFF()));
            if (effectCategoryModel == null || (key = effectCategoryModel.getKey()) == null) {
                return "";
            }
            return key;
        }
        return interfaceC1624480sNK.LJIIJ();
    }

    public static final String LIZ(InterfaceC1624480sNK interfaceC1624480sNK, String str) {
        boolean z;
        EffectCategoryModel next;
        String name;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        Iterator<EffectCategoryModel> it2 = C23117093z.LJFF(interfaceC1624480sNK.getStickerRepository().LJFF()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getKey(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EffectCategoryModel effectCategoryModel = next;
        if (effectCategoryModel == null || (name = effectCategoryModel.getName()) == null) {
            return "";
        }
        return name;
    }

    public static final int LIZIZ(InterfaceC1624480sNK interfaceC1624480sNK, String str) {
        CategoryEffectModel categoryEffectModelLIZ;
        List<Effect> effects;
        if (str.length() == 0 || (categoryEffectModelLIZ = C23117093z.LIZ(interfaceC1624480sNK.getStickerRepository().LJFF(), str)) == null || (effects = categoryEffectModelLIZ.getEffects()) == null) {
            return 0;
        }
        return effects.size();
    }

    public static final Pair<String, String> LIZLLL(InterfaceC1624480sNK interfaceC1624480sNK, String str) {
        List<Pair> listLJIL;
        if (str.length() == 0) {
            listLJIL = C13BV.INSTANCE;
        } else {
            HashMap map = new HashMap();
            for (C1449380nou c1449380nou : interfaceC1624480sNK.getStickerRepository().LJFF().LJIIL(str)) {
                String str2 = c1449380nou.LIZIZ;
                String str3 = c1449380nou.LIZ;
                if (str3 == null) {
                    str3 = "";
                }
                if (str2 != null && str2.length() > 0) {
                    Object linkedHashSet = map.get(str2);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        map.put(str2, linkedHashSet);
                    }
                    ((Set) linkedHashSet).add(str3);
                }
            }
            listLJIL = C2097808Js.LJIL(map);
        }
        Gson gson = C0CHQ.LIZ().getGson();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIL, 10));
        for (Pair pair : listLJIL) {
            arrayList.add(C2097908Jt.LIZJ(new Pair(pair.getFirst(), Integer.valueOf(((Set) pair.getSecond()).size()))));
        }
        String json = GsonProtectorUtils.toJson(gson, arrayList);
        Gson gson2 = C0CHQ.LIZ().getGson();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIL, 10));
        for (Pair pair2 : listLJIL) {
            arrayList2.add(C2097908Jt.LIZJ(new Pair(pair2.getFirst(), C13LP.LJJLIIIJ((Iterable) pair2.getSecond(), ",", null, null, 0, null, null, 62))));
        }
        return new Pair<>(json, GsonProtectorUtils.toJson(gson2, arrayList2));
    }
}

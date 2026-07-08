package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365460EUm {
    public static final Map<String, Effect> LIZ = new ConcurrentHashMap();
    public static final Map<String, List<Effect>> LIZIZ = new ConcurrentHashMap();
    public static final Map<String, List<EffectCategoryResponse>> LIZJ = new ConcurrentHashMap();

    public static Effect LIZJ(String str) {
        if (str == null) {
            return null;
        }
        return (Effect) ((ConcurrentHashMap) LIZ).get(str);
    }

    public static Effect LIZLLL(String str) {
        Map<String, List<Effect>> map = LIZIZ;
        if (((ConcurrentHashMap) map).isEmpty()) {
            return null;
        }
        Iterator it2 = ((ConcurrentHashMap) map).values().iterator();
        while (it2.hasNext()) {
            for (Effect effect : (List) it2.next()) {
                if (Intrinsics.LJFF(effect.getEffect_id(), str)) {
                    return effect;
                }
            }
        }
        return null;
    }

    public static Effect LJ(String str) {
        Map<String, List<Effect>> map = LIZIZ;
        if (((ConcurrentHashMap) map).isEmpty()) {
            return null;
        }
        Iterator it2 = ((ConcurrentHashMap) map).values().iterator();
        while (it2.hasNext()) {
            for (Effect effect : (List) it2.next()) {
                if (Intrinsics.LJFF(effect.getResource_id(), str)) {
                    return effect;
                }
            }
        }
        return null;
    }

    public static List LJFF(String str) {
        return (List) ((ConcurrentHashMap) LIZIZ).get(str);
    }

    public static boolean LJI(String str) {
        boolean z;
        Collection collection = (Collection) ((ConcurrentHashMap) LIZIZ).get(str);
        if (collection != null && !collection.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static void LIZ(String str, List list) {
        ((ConcurrentHashMap) LIZJ).put(str, list);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((EffectCategoryResponse) it2.next()).getTotal_effects(), arrayList);
        }
        LIZIZ(str, arrayList);
    }

    public static void LIZIZ(String str, List list) {
        ((ConcurrentHashMap) LIZIZ).put(str, list);
    }

    public static void LJII(Effect effect, String str) {
        ((ConcurrentHashMap) LIZIZ).put(str, C1697810uHb.LJIILJJIL(effect));
    }
}

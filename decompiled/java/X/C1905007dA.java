package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.eventtracking.group.PropBasicParamGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07dA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1905007dA {
    public static final Map<Class<?>, Function1<Effect, InterfaceC1282004zy>> LIZ = C2097608Jq.LJIIIIZZ(new Pair(C07TS.class, new C1926007gY(C07TS.LLILLL)), new Pair(PropBasicParamGroup.class, new C1926207ga(PropBasicParamGroup.Companion)));
    public static final Map<Class<?>, Function1<CreativeModel, InterfaceC1282004zy>> LIZIZ = C2097908Jt.LIZJ(new Pair(C07TQ.class, new C1926107gZ(C07TQ.LLILLL)));
    public static final Map<String, List<Class<?>>> LIZJ = new LinkedHashMap();
    public static final List<String> LIZLLL;

    static {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("prop_show", "prop_click", "prop_auto_click", "prop_click_time", "prop_save", "prop_remove");
        LIZLLL = listLJIIJJI;
        LIZ(PropBasicParamGroup.class, C13LP.LJLIL(Collections.singletonList("record_video"), listLJIIJJI));
        LIZ(C07TU.class, C13LP.LJLIL(Collections.singletonList("record_video"), listLJIIJJI));
        LIZ(C07TQ.class, C13LP.LJLIL(Collections.singletonList("record_video"), listLJIIJJI));
        LIZ(C00YV.class, listLJIIJJI);
        LIZ(C0253006p.class, listLJIIJJI);
        LIZ(AnonymousClass0070.class, Collections.singletonList("record_video"));
        LIZ(C07TS.class, C1697810uHb.LJIIJJI("shoot_exit", "exit_shoot_popup_result"));
    }

    public static void LIZ(Class cls, List list) {
        for (Object obj : list) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) LIZJ;
            List arrayList = (List) linkedHashMap.get(obj);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                linkedHashMap.put(obj, arrayList);
            }
        }
    }

    public static List LIZIZ(String str, List list) {
        List list2 = (List) ((LinkedHashMap) LIZJ).get(str);
        if (list2 == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (list2.contains(obj.getClass())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}

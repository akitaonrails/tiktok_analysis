package X;

import com.google.gson.n;
import com.google.gson.q;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0BeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293120BeI {
    public static final Set<Pair<String, Class<? extends Object>>> LIZ;
    public static final Set<Pair<String, Class<Integer>>> LIZIZ;
    public static final Set<Pair<String, Class<Integer>>> LIZJ;
    public static final Set<String> LIZLLL;
    public static final ConcurrentHashMap<String, Object> LJ;

    static {
        Class cls = Integer.TYPE;
        LIZ = C13LQ.LJLIIL(new Pair[]{new Pair("common_log_id", String.class), new Pair("tab_fcp_backup_config", cls), new Pair("social_2tab_assem_opt", cls)});
        LIZIZ = C13LQ.LJLIIL(new Pair[]{new Pair("tt_story_experiment", cls), new Pair("tt_story_fyp_skylight", cls), new Pair("tt_story_tabicon_corner_position", cls), new Pair("tt_story_tabicon_multi_avatar_style", cls), new Pair("tt_story_top_corner_unify_interaction", cls), new Pair("tt_skylight_share_fixed_entrance_in_multi_avatar", cls), new Pair("tt_story_tabicon_self_avatar_replace_camera", cls), new Pair("enable_skylight_fyp_only", cls)});
        LIZJ = Collections.singleton(new Pair("friend_top_tab_show_unlogin", cls));
        LIZLLL = C13LQ.LJLIIL(new String[]{"nearby_tab_revamp_config", "ttls_nearby_tab_revamp_settings", "location_popup_config"});
        LJ = new ConcurrentHashMap<>();
    }

    public static Object LIZ(String str, Function0 function0) {
        Object obj = LJ.get(str);
        if (obj == null) {
            return function0.invoke();
        }
        return obj;
    }

    public static void LIZIZ(Collection collection, n nVar) {
        q qVarLJJIJIIJI;
        Integer numValueOf;
        n nVarLJJIJ;
        q qVarLJJIJIIJI2;
        String strLJIL;
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            Object second = pair.getSecond();
            if (Intrinsics.LJFF(second, Integer.TYPE)) {
                n nVarLJJIJ2 = nVar.LJJIJ((String) pair.getFirst());
                if (nVarLJJIJ2 != null && (qVarLJJIJIIJI = nVarLJJIJ2.LJJIJIIJI("val")) != null && (numValueOf = Integer.valueOf(qVarLJJIJIIJI.LJIIJJI())) != null) {
                    LJ.put((String) pair.getFirst(), numValueOf);
                }
            } else if (Intrinsics.LJFF(second, String.class) && (nVarLJJIJ = nVar.LJJIJ((String) pair.getFirst())) != null && (qVarLJJIJIIJI2 = nVarLJJIJ.LJJIJIIJI("val")) != null && (strLJIL = qVarLJJIJIIJI2.LJIL()) != null) {
                LJ.put((String) pair.getFirst(), strLJIL);
            }
        }
    }
}

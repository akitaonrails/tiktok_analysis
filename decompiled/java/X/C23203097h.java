package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEUtils;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.097h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23203097h {
    public static final HashMap<String, Boolean> LIZ = new HashMap<>();
    public static final HashMap<String, Pair<Integer, Integer>> LIZIZ = new HashMap<>();
    public static final HashMap<String, Pair<Integer, Integer>> LIZJ = new HashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, HashMap<String, String>> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LJFF = new ConcurrentHashMap<>();

    public static HashMap LIZ(String str) {
        if (str == null) {
            return new HashMap();
        }
        ConcurrentHashMap<String, HashMap<String, String>> concurrentHashMap = LJ;
        if (concurrentHashMap.get(str) == null) {
            concurrentHashMap.put(str, TEVideoUtils.getMetaData(str));
        }
        HashMap<String, String> map = concurrentHashMap.get(str);
        if (map == null) {
            return TEVideoUtils.getMetaData(str);
        }
        return map;
    }

    public static Boolean LIZIZ(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZLLL;
        if (concurrentHashMap.containsKey(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get ");
            sbLIZ.append(str);
            sbLIZ.append("-->hasOriginAudio:");
            sbLIZ.append(concurrentHashMap.get(str));
            C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ));
            return concurrentHashMap.get(str);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("get ");
        sbLIZ2.append(str);
        sbLIZ2.append("-->hasOriginAudio:null");
        C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }

    public static void LIZJ(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C23202097g(str, null), 3);
        }
    }

    public static void LIZLLL(String str) {
        if (str != null && !a0.LJJJIL(str) && !LJ.contains(str)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C498001wo(str, null), 3);
        }
    }

    public static void LJ(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C23204097i(str, null), 3);
        }
    }

    public static final void LJI(String str) {
        boolean z;
        List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks = VEUtils.getAudioFileInfoForAllTracks(str);
        if (audioFileInfoForAllTracks != null && !audioFileInfoForAllTracks.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        LIZLLL.put(str, Boolean.valueOf(z2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update videoInfo ");
        sbLIZ.append(str);
        sbLIZ.append(" :");
        sbLIZ.append(z2);
        C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJFF(String str, boolean z) {
        if (str != null && !a0.LJJJIL(str) && LIZLLL.get(str) == null) {
            if (z) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C497901wn(str, null), 3);
            } else {
                LJI(str);
            }
        }
    }
}

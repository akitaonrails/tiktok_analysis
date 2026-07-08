package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0bq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988850bq7 {
    public static final LinkedHashMap<Integer, C1019830ce5> LIZ = new LinkedHashMap<>();

    public static C1019830ce5 LIZ() {
        LinkedHashMap<Integer, C1019830ce5> linkedHashMap = LIZ;
        if (!linkedHashMap.isEmpty()) {
            return linkedHashMap.values().iterator().next();
        }
        return null;
    }

    public static void LIZJ(int i) {
        LinkedHashMap<Integer, C1019830ce5> linkedHashMap = LIZ;
        if (linkedHashMap.containsKey(Integer.valueOf(i))) {
            linkedHashMap.remove(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LIZIZ(int i, Object obj) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap<Integer, C1019830ce5> linkedHashMap = LIZ;
            C988640bpm c988640bpm = new C988640bpm();
            new AwS595S0100000_16(aweme, 182).invoke(c988640bpm.LIZ);
            linkedHashMap.put(numValueOf, (C1019830ce5) c988640bpm.LIZ);
        }
    }
}

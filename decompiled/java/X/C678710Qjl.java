package X;

import com.lynx.tasm.base.TraceEvent;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Qjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678710Qjl {
    public static final HashMap<String, Long> LIZ = new HashMap<>();

    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixSortTrace:");
        sbLIZ.append(str);
        TraceEvent.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        LIZ.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public static void LIZIZ(String str) {
        System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixSortTrace:");
        sbLIZ.append(str);
        TraceEvent.LJII(C2188811AlT.LIZIZ(sbLIZ));
        HashMap<String, Long> map = LIZ;
        if (map.get(str) != null) {
            map.put(str, null);
        }
    }

    public static void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixSortTrace:");
        sbLIZ.append(str);
        TraceEvent.LJII(C2188811AlT.LIZIZ(sbLIZ));
        HashMap<String, Long> map = LIZ;
        if (map.get(str) != null) {
            map.put(str, null);
        }
    }
}

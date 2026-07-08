package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS138S1100000_24;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.0ql8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562360ql8 {
    public static boolean LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static final HashMap<String, Integer> LJII = new HashMap<>();

    public static boolean LIZ(C723430SZh c723430SZh) {
        if (c723430SZh.LIZIZ && LIZ) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(long j, String str) {
        int iIntValue;
        if (j <= 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("duration", String.valueOf(j));
        map.put("is_in_feed_total", String.valueOf(!C0CP9.LIZ()));
        HashMap<String, Integer> map2 = LJII;
        Integer num = map2.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map2.put(str, Integer.valueOf(iIntValue + 1));
        map.put("calculate_count", String.valueOf(iIntValue));
        C725430Scv.LIZJ(str, 1.0f, new AwS546S0100000_2(map, (HashMap<String, String>) 1082));
    }

    public static void LIZJ(C723430SZh c723430SZh, String str, Function1 function1) {
        C1562470qlJ c1562470qlJ = C1562470qlJ.LIZ;
        AwS138S1100000_24 awS138S1100000_24 = new AwS138S1100000_24(str, (String) function1, (Function1<? super Map<String, String>, Unit>) 6);
        c1562470qlJ.getClass();
        C1562470qlJ.LIZ(c723430SZh, str, awS138S1100000_24);
    }
}

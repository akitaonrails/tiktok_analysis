package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07L7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07L7 {
    public static final C07L7 LIZ = new C07L7();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1259));

    public static boolean LIZ(Integer num, String str, String str2) {
        if (num != null) {
            int iIntValue = num.intValue();
            Pair pair = new Pair(str, str2);
            C01GW c01gw = LIZIZ;
            Map map = (Map) ((Map) c01gw.getValue()).get(Integer.valueOf(iIntValue));
            if (map == null) {
                ((Map) c01gw.getValue()).put(Integer.valueOf(iIntValue), C2097608Jq.LJIIJ(new Pair(pair, Boolean.TRUE)));
                return false;
            }
            Object obj = map.get(pair);
            if (obj == null) {
                map.put(pair, Boolean.TRUE);
                obj = Boolean.FALSE;
            }
            return ((Boolean) obj).booleanValue();
        }
        throw new NullPointerException("Must provide fragment hash when tracking video anchor");
    }
}

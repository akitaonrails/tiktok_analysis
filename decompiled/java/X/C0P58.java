package X;

import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0P58, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P58 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(709));

    public static Map LIZ() {
        return (Map) LIZ.getValue();
    }

    public static final void LIZIZ(Integer num, String str) {
        if (num != null) {
            int iIntValue = num.intValue();
            Map mapLIZ = LIZ();
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (str == null) {
                str = "";
            }
            mapLIZ.put(numValueOf, str);
        }
    }
}

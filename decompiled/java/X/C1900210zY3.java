package X;

import com.bytedance.keva.Keva;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0zY3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900210zY3 {
    public static Keva LIZIZ() {
        return C1900200zY2.LJ.getValue();
    }

    public static C1900200zY2 LIZ(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        HashMap<Integer, C1900200zY2> value = C1900200zY2.LJFF.getValue();
        Integer numValueOf = Integer.valueOf(iIntValue);
        C1900200zY2 c1900200zY2 = value.get(numValueOf);
        if (c1900200zY2 == null) {
            c1900200zY2 = new C1900200zY2(iIntValue);
            value.put(numValueOf, c1900200zY2);
        }
        return c1900200zY2;
    }
}

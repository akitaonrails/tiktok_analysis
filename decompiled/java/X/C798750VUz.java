package X;

import android.os.Build;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0VUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798750VUz {
    public static C0VVV LIZ(String str) {
        C0VVV c798760VVa;
        HashMap<String, C0VVV> map = C798740VUy.LIZ;
        C0VVV c0vvv = map.get(str);
        if (c0vvv != null) {
            return c0vvv;
        }
        if (Build.VERSION.SDK_INT < 24) {
            c798760VVa = new C0VVZ();
        } else {
            c798760VVa = new C798760VVa();
        }
        C0VV0.LLILLJJLI.getClass();
        C0VV0.LLILLL.add(c798760VVa);
        map.put(str, c798760VVa);
        return c798760VVa;
    }
}

package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0obj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479650obj {
    public static C1480660odM LIZ(String str, AbstractC1479520obW abstractC1479520obW) {
        C1479810obz c1479810obz;
        if (!TextUtils.isEmpty(str) && (c1479810obz = abstractC1479520obW.LJJII) != null && c1479810obz.containsKey(str)) {
            C1480660odM c1480660odM = abstractC1479520obW.LJJII.get(str);
            if (c1480660odM == null) {
                return new C1480660odM();
            }
            return c1480660odM;
        }
        return new C1480660odM();
    }

    public static void LIZIZ(String str, C1480660odM c1480660odM, AbstractC1479520obW abstractC1479520obW) {
        C1479810obz c1479810obz;
        if (!TextUtils.isEmpty(str) && (c1479810obz = abstractC1479520obW.LJJII) != null) {
            try {
                c1479810obz.put(str, c1480660odM);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}

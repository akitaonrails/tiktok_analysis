package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0nGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428300nGu {
    public static final void LIZ(C20626615nU c20626615nU, String str) {
        List<AbstractC20626815nW> listLIZIZ;
        if (c20626615nU == null) {
            return;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\'');
            sbLIZ.append(str);
            sbLIZ.append('\'');
            listLIZIZ = new C20626915nX(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            listLIZIZ = new C20626915nX("100%").LIZIZ();
        }
        c20626615nU.setPlaceholderConfig(listLIZIZ);
    }
}

package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0yEp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849850yEp {
    public final Keva LIZ = KevaImpl.getRepoFromSp(((AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0)).LJIIJJI(), "fe-storage", 0);

    public final void LIZ(Object obj, String str) {
        if (str != null && obj != null) {
            try {
                if (obj instanceof Boolean) {
                    this.LIZ.storeBoolean(str, ((Boolean) obj).booleanValue());
                    return;
                }
                if (obj instanceof String) {
                    this.LIZ.storeString(str, (String) obj);
                } else if (obj instanceof Long) {
                    this.LIZ.storeLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    this.LIZ.storeInt(str, ((Integer) obj).intValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}

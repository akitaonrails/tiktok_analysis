package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0NaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596450NaN {
    public final Keva LIZ;

    public C596450NaN() {
        C844470XAv.LIZ.getClass();
        this.LIZ = KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "fe-storage", 0);
    }

    public final Boolean LIZ(Boolean bool, String str) {
        return Boolean.valueOf(this.LIZ.getBoolean(str, bool.booleanValue()));
    }

    public final String LIZIZ(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }

    public final boolean LIZJ(Object obj, String str) {
        if (str != null && obj != null) {
            try {
                if (obj instanceof Boolean) {
                    LIZLLL((Boolean) obj, str);
                    return true;
                }
                if (obj instanceof String) {
                    this.LIZ.storeString(str, (String) obj);
                    return true;
                }
                if (obj instanceof Long) {
                    this.LIZ.storeLong(str, ((Long) obj).longValue());
                    return true;
                }
                if (!(obj instanceof Integer)) {
                    return false;
                }
                this.LIZ.storeInt(str, ((Integer) obj).intValue());
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public final void LIZLLL(Boolean bool, String str) {
        this.LIZ.storeBoolean(str, bool.booleanValue());
    }
}

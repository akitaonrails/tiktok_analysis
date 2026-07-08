package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287780jcG {
    public static final String[] LIZIZ = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};
    public final Map<String, String> LIZ;

    public final int LIZIZ() {
        int i = -1;
        try {
            String str = (String) ((HashMap) this.LIZ).get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                i = CastIntegerProtector.parseInt(str);
                return i;
            }
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return i;
    }

    public final String LIZ() {
        StringBuilder sb = new StringBuilder();
        for (String str : LIZIZ) {
            if (((HashMap) this.LIZ).containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) ((HashMap) this.LIZ).get(str));
            }
        }
        return sb.toString();
    }

    public final int hashCode() {
        return LIZ().hashCode();
    }

    public final String toString() {
        return LIZ();
    }

    public C1287780jcG(Map<String, String> map) {
        HashMap map2 = new HashMap();
        this.LIZ = map2;
        map2.putAll(map);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1287780jcG)) {
            return false;
        }
        return LIZ().equalsIgnoreCase(((C1287780jcG) obj).LIZ());
    }
}

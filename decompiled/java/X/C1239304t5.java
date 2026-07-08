package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.Set;

/* JADX INFO: renamed from: X.04t5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1239304t5 {
    public static final Set<String> LIZ;

    static {
        Object[] objArr = new String[0];
        Object[] objArr2 = (Object[]) SettingsManager.LIZLLL().LJIIIIZZ("ecom_common_spark_query_parameters_whitelist", String[].class, objArr);
        if (objArr2 != null) {
            objArr = objArr2;
        }
        LIZ = C13LQ.LJLIIL(objArr);
    }

    public static boolean LIZ(String str) {
        Set<String> set = LIZ;
        if (!set.isEmpty() && !set.contains(str)) {
            return false;
        }
        return true;
    }
}

package X;

import android.text.TextUtils;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0a3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920500a3s {
    public static String LIZ = "";
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(69));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(70));

    public static String LIZ(long j) {
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            return LIZ;
        }
        String str = (String) ((Map) LIZJ.getValue()).get(Long.valueOf(j));
        if (str == null) {
            return "";
        }
        return str;
    }

    public static void LIZIZ(long j) {
        String str = LIZ;
        if ((!TextUtils.isEmpty(str)) && str != null) {
            ((Map) LIZJ.getValue()).put(Long.valueOf(j), LIZ);
        }
    }
}

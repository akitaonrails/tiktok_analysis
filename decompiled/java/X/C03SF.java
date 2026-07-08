package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.03SF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03SF {
    public static final C03SJ LIZ = new LruCache<String, String>() { // from class: X.03SJ
        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ int sizeOf(String str, String str2) {
            return 1;
        }
    };

    public static String LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            return LIZ.get(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return null;
        }
    }

    public static String LIZIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String strLJIIIIZZ = null;
        if (z) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strLIZ = LIZ(str);
            if (strLIZ != null) {
                linkedHashMap.put("verify_request_id", strLIZ);
            }
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(linkedHashMap);
            return strLJIIIIZZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return strLJIIIIZZ;
        }
    }
}

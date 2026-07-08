package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0udQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711340udQ {
    public static final C1711340udQ LIZ = new C1711340udQ();

    public static String LIZJ(Object obj) {
        try {
            return String.valueOf(System.identityHashCode(obj));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public static String LJ(Object obj) {
        return GsonProtectorUtils.toJson(C08JS.LIZIZ(), obj);
    }

    public static int LIZLLL(String str, String str2) {
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return Color.parseColor(str2);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return -1;
            }
        }
    }

    public static String LIZ(Context context, String str, String str2) {
        if (context != null && C960203pA.LIZIZ(context) && str2 != null && C123100dR.LIZ(str2)) {
            return str2;
        }
        return str;
    }

    public static String LIZIZ(Context context, String str, String str2) {
        if (context != null && C960203pA.LIZIZ(context) && str2 != null && C123100dR.LIZ(str2)) {
            return str2;
        }
        return str;
    }
}

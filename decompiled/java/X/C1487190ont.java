package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ont, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487190ont {
    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new C0VSJ(str).exists();
    }

    public static void LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                LIZLLL(c0vsj.getPath());
            }
        }
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08HM.LIZJ(str));
        sbLIZ.append(".mp3");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(String str) {
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.getParentFile().exists()) {
                c0vsj.mkdir();
            } else {
                LIZLLL(c0vsj.getParent());
                c0vsj.mkdir();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}

package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0XDO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XDO {
    public static void LIZ() {
        if (!AppLog.getSwitchToBdtracker()) {
            try {
                Field declaredField = C0XDN.class.getDeclaredField("LIZIZ");
                declaredField.setAccessible(true);
                ((ConcurrentHashMap) declaredField.get(null)).remove("account_region");
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C0XDP c0xdp = C0XDP.L1;
        if (c0xdp == null || C2093608Ic.LJ("account_region")) {
            return;
        }
        C0XCI c0xci = C0XCJ.LIZIZ;
        if (c0xci.LIZJ()) {
            C0XCH c0xch = c0xci.LJI;
            c0xch.getClass();
            if (TextUtils.isEmpty("account_region")) {
                return;
            }
            int i = C0XDQ.LIZ[c0xdp.ordinal()];
            if (i == 1) {
                ((ConcurrentHashMap) c0xch.LJ).remove("account_region");
            } else if (i == 2) {
                ((ConcurrentHashMap) c0xch.LIZLLL).remove("account_region");
            }
        }
    }
}

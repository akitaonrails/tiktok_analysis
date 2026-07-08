package X;

import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08ie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2193808ie {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    public static int LIZ() {
        int i;
        Keva repo = Keva.getRepo("device_info_repo");
        ?? LJJIIZI = -1;
        if (repo.contains("device_type")) {
            return repo.getInt("device_type", -1);
        }
        try {
            LJJIIZI = a0.LJJIIZI((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.com.google.gmsversion"), "go", false);
            i = LJJIIZI;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            i = LJJIIZI;
        }
        repo.storeInt("device_type", i);
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public static int LIZIZ(Context context) {
        int i;
        Keva repo = Keva.getRepo("device_info_repo");
        ?? IsLowRamDevice = -1;
        if (repo.contains("device_ram_state")) {
            return repo.getInt("device_ram_state", -1);
        }
        try {
            IsLowRamDevice = ((ActivityManager) C786410Ut5.H2(context, "activity")).isLowRamDevice();
            i = IsLowRamDevice;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            i = IsLowRamDevice;
        }
        repo.storeInt("device_ram_state", i);
        return i;
    }
}

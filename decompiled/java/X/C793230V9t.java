package X;

import com.bytedance.apm6.cpu.ApmCpuManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0V9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793230V9t {
    public static volatile C793230V9t LIZIZ;
    public final C793200V9q LIZ = new InterfaceC794610VFb() { // from class: X.0V9q
        public String LIZ;
        public String LIZIZ;
        public final C793210V9r LIZJ = new HashMap<String, String>() { // from class: X.0V9r
            {
                put("com.ss.android.ugc.aweme.main.MainActivity", "main_activity");
            }
        };

        @Override // X.InterfaceC794610VFb
        public final void LIZIZ(String str, String str2) {
            if (str == null || str2 == null || str.equals(this.LIZIZ)) {
                return;
            }
            this.LIZIZ = str;
            if (this.LIZ != null) {
                ApmCpuManager.getInstance().stopScene(this.LIZ);
                this.LIZ = null;
            }
            String str3 = get(str);
            if (str3 != null) {
                ApmCpuManager.getInstance().startScene(str3);
                this.LIZ = str3;
            }
        }
    };

    public static C793230V9t LIZ() {
        if (LIZIZ == null) {
            synchronized (C793230V9t.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C793230V9t();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}

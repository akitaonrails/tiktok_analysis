package X;

import android.os.Vibrator;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0Cjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1294060jmO
public final class C322070Cjt {
    public static final C322070Cjt LIZ = new C322070Cjt();
    public static Vibrator LIZIZ;

    public static void LIZ(long j) {
        if (LIZIZ == null) {
            LIZIZ = (Vibrator) C786410Ut5.H2(((IAppContextManagerService) ServiceManager.get().getService(IAppContextManagerService.class)).getApplicationContext(), "vibrator");
        }
        Vibrator vibrator = LIZIZ;
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(j);
    }
}

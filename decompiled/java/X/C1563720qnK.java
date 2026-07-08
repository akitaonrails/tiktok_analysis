package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: renamed from: X.0qnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563720qnK {
    public static final C1563720qnK LIZ = new C1563720qnK();
    public static boolean LIZIZ;

    public static final void LIZ() {
        C0CCZ c0cczInitTask = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(4);
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        if (c0cczInitTask != null) {
            C799900VZk.LIZ.getClass();
            C0CPH c0cph = new C0CPH();
            c0cph.LIZ(c0cczInitTask);
            c0cph.LIZIZ();
        }
    }
}

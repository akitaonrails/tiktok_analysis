package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService;

/* JADX INFO: renamed from: X.0rRF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588470rRF implements C0WHU {
    public static final C1588470rRF LIZ = new C1588470rRF();
    public static final C1604710rrR LIZIZ = new C1604710rrR("follow", 3, 3);
    public static InterfaceC1587510rPh LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;

    public static final boolean LIZIZ() {
        C1604710rrR c1604710rrR = LIZIZ;
        if (c1604710rrR.LIZ() || !c1604710rrR.LJI() || ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFollowingCount() <= 0) {
            return false;
        }
        ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LJFF("follow", false);
        return true;
    }

    @Override // X.C0WHU
    public final void LIZ(C0WHR c0whr) {
        LIZJ = c0whr;
        LIZLLL = true;
        C816050Vzn c816050VznLIZLLL = ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LIZLLL("follow");
        if (c816050VznLIZLLL != null) {
            c816050VznLIZLLL.LJ(null);
        }
    }
}

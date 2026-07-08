package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.services.autologin.AutoLoginET;
import com.ss.android.ugc.aweme.services.autologin.AutoLoginService;
import java.util.List;

/* JADX INFO: renamed from: X.0XX9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XX9 {
    public static final C0XX9 LIZ = new C0XX9();
    public static boolean LIZIZ = true;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static boolean LIZ() {
        if (!LIZJ && !LIZLLL) {
            if (C0V4W.LIZ()) {
                try {
                    GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                    List<InterfaceC586170Myt> list = C0XQ5.LIZ;
                    googleApiAvailability.checkApiAvailability(new C833970Wnb(C0XPY.LIZIZ), new InterfaceC829320Wg6[0]).LJFF(new InterfaceC835710WqP() { // from class: X.0XXC
                        @Override // X.InterfaceC835710WqP
                        public final void onSuccess(Object obj) {
                            C0XX9.LIZJ = true;
                            C0XX9.LIZIZ = true;
                            C0XX9.LIZLLL = false;
                            C0XWJ.LIZ.getClass();
                            C0XWJ.LIZ(false, false);
                        }
                    }).LIZLLL(new InterfaceC835730WqR() { // from class: X.0XXA
                        @Override // X.InterfaceC835730WqR
                        public final void onFailure(Exception exc) {
                            C0XX9.LIZJ = true;
                            C0XX9.LIZIZ = false;
                            C0XX9.LIZLLL = false;
                            C0XWJ.LIZ.getClass();
                            C0XWJ.LIZ(false, true);
                            AutoLoginET.INSTANCE.checkEligibilityET(AutoLoginService.Companion.getAppType(), false, C0XXB.ERRORS);
                        }
                    });
                    LIZLLL = true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZJ = true;
                    LIZIZ = false;
                    LIZLLL = false;
                    C0XWJ.LIZ.getClass();
                    C0XWJ.LIZ(false, true);
                    AutoLoginET.INSTANCE.checkEligibilityET(AutoLoginService.Companion.getAppType(), false, C0XXB.ERRORS);
                }
            } else {
                C0XWJ.LIZ.getClass();
                C0XWJ.LIZ(true, true);
                AutoLoginET.INSTANCE.checkEligibilityET(AutoLoginService.Companion.getAppType(), false, C0XXB.ERRORS);
                LIZIZ = false;
                LIZJ = true;
            }
        }
        return LIZIZ;
    }
}

package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Set;

/* JADX INFO: renamed from: X.0zu5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913870zu5 {
    public static boolean LIZJ;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static final C1913870zu5 LIZ = new C1913870zu5();
    public static final Keva LIZIZ = Keva.getRepo("firebase_repo");
    public static boolean LIZLLL = true;

    public static final void LJ() {
        LJI = true;
        LJII();
    }

    public static final void LJFF() {
        LJ = true;
        if (LIZLLL) {
            LIZLLL = LIZIZ.getBoolean("is_preinstall", true);
        }
        LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LIZJ() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = X.C1913870zu5.LJI     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            boolean r0 = X.C1913870zu5.LJ     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            boolean r0 = X.C1913870zu5.LJFF     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1913870zu5.LIZJ():boolean");
    }

    public static boolean LIZIZ() {
        Set setLJLIIL = C13LQ.LJLIIL(new String[]{"AT", "BE", "BG", "CH", "CY", "CZ", "DE", "DK", "EE", "EL", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK"});
        Set setLJLIIL2 = C13LQ.LJLIIL(new String[]{"GB", "CH"});
        String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
        return setLJLIIL.contains(storeRegionUpperCase) && !setLJLIIL2.contains(storeRegionUpperCase);
    }

    public static final synchronized void LJII() {
        if (LIZ.LIZJ()) {
            C0WG9 c0wg9 = new C0WG9();
            c0wg9.LIZ = LIZJ;
            final C0WG1 c0wg1 = new C0WG1(LIZLLL, c0wg9.LIZ, LIZIZ());
            if (C10EU.LJIILIIL()) {
                c0wg1.LIZIZ();
                return;
            }
            if (ComplianceServiceProvider.LJIILJJIL().LJII(null)) {
                C0WGS.LIZ();
            } else {
                ComplianceServiceProvider.LJIILJJIL().LJIIJJI(new AbstractC826920WcE() { // from class: X.0Wc2
                    @Override // X.InterfaceC1915870zxJ
                    public final void LIZ(EnumC1876780ywG enumC1876780ywG) {
                        if (EnumC1876780ywG.APPROVE == enumC1876780ywG) {
                            C0WGS.LIZ();
                            c0wg1.LIZ();
                            ComplianceServiceProvider.LJIILJJIL().LJIIIZ(this);
                        }
                    }
                });
            }
            c0wg1.LIZ();
        }
    }

    public static boolean LIZ() {
        return ((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null);
    }

    public static final void LIZLLL(boolean z) {
        LJFF = true;
        LIZJ = z;
        LJII();
    }

    public static final void LJI(boolean z) {
        LIZLLL = z;
        LIZIZ.storeBoolean("is_preinstall", z);
    }
}

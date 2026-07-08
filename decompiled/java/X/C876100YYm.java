package X;

import android.os.SystemClock;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0YYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876100YYm extends C0YXO {
    public static final C876100YYm LLJILJILJ = new C876100YYm();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0YZB] */
    public C876100YYm() {
        boolean z = false;
        if (C296580Bjs.LIZ() && ((Number) C876110YYn.LIZ.getValue()).intValue() == 1) {
            z = true;
        }
        super(z, new C0YWO() { // from class: X.0YZB
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(422));
            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(420));
            public final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(421));

            @Override // X.C0YWO
            public final void LIZIZ() {
            }

            @Override // X.C0YWO
            public final C0YXC LIZJ() {
                return (C0YXC) this.LIZ.getValue();
            }

            @Override // X.C0YWO
            public final C0YZ7 LIZLLL() {
                return (C0YZ7) this.LIZJ.getValue();
            }

            @Override // X.C0YWO
            public final C0YOQ LJFF() {
                return (C0YOQ) this.LIZIZ.getValue();
            }

            @Override // X.C0YWO
            public final boolean LIZ() {
                IECommerceHostService iECommerceHostService;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                return C2162308dZ.LJI(((IApplicationDependencyService) iECommerceHostService).getApplicationContext());
            }

            @Override // X.C0YWO
            public final int getAppId() {
                IECommerceHostService iECommerceHostService;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                return ((IApplicationDependencyService) iECommerceHostService).getAppId();
            }

            @Override // X.C0YWO
            public final String getDeviceId() {
                return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            }

            @Override // X.C0YWO
            public final String getInstallId() {
                return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId();
            }

            @Override // X.C0YWO
            public final String getSecUid() {
                AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                }
                String curSecUserId = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getCurSecUserId();
                return curSecUserId == null ? "" : curSecUserId;
            }

            @Override // X.C0YWO
            public final boolean isAppBackground() {
                IECommerceHostService iECommerceHostService;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
                return rootPageMonitor != null && rootPageMonitor.LJFF();
            }

            @Override // X.C0YWO
            public final void LJ(C0YIS c0yis, InterfaceC874620YSu interfaceC874620YSu) {
                C23250099c.LIZLLL(C817503Hh.LL, C2126308Ur.LIZ, null, new C0YZA(c0yis, interfaceC874620YSu, null), 2);
            }
        });
    }
}

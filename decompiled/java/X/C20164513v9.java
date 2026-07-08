package X;

import android.os.SystemClock;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomSecApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.13v9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20164513v9 implements C0XQB, InterfaceC2210981Bg8 {
    @Override // X.InterfaceC2210981Bg8
    public final void LIZ(boolean z) {
    }

    @Override // X.InterfaceC2210981Bg8
    public final void LIZJ(boolean z) {
    }

    public C20164513v9() {
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
        ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).addLoginOrLogoutListener(this);
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(this);
    }

    @Override // X.InterfaceC2210981Bg8
    public final void LIZIZ(String str, String str2) {
        IEcomSecApi iEcomSecApi = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null);
        if (iEcomSecApi != null) {
            iEcomSecApi.reportData(EnumC19304710fl.DID_IID_UPDATE.getReportName());
        }
    }

    @Override // X.C0XQB
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        IEcomSecApi iEcomSecApi = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null);
                        if (iEcomSecApi != null) {
                            iEcomSecApi.LIZJ();
                        }
                        IEcomSecApi iEcomSecApi2 = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null);
                        if (iEcomSecApi2 != null) {
                            iEcomSecApi2.reportData(EnumC19304710fl.LOGIN_DONE.getReportName());
                            return;
                        }
                        return;
                    }
                    return;
                }
                IEcomSecApi iEcomSecApi3 = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null);
                if (iEcomSecApi3 != null) {
                    iEcomSecApi3.LIZJ();
                }
                IEcomSecApi iEcomSecApi4 = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null);
                if (iEcomSecApi4 == null) {
                    return;
                }
                iEcomSecApi4.reportData(EnumC19304710fl.LOGOUT.getReportName());
                return;
            }
            IEcomSecApi iEcomSecApi5 = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null);
            if (iEcomSecApi5 != null) {
                iEcomSecApi5.LIZJ();
            }
            IEcomSecApi iEcomSecApi6 = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null);
            if (iEcomSecApi6 == null) {
                return;
            }
            iEcomSecApi6.reportData(EnumC19304710fl.LOGIN.getReportName());
            return;
        }
        IEcomSecApi iEcomSecApi7 = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null);
        if (iEcomSecApi7 != null) {
            iEcomSecApi7.LIZJ();
        }
        IEcomSecApi iEcomSecApi8 = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null);
        if (iEcomSecApi8 == null) {
            return;
        }
        iEcomSecApi8.reportData(EnumC19304710fl.LOGIN.getReportName());
    }
}

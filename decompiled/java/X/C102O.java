package X;

import android.os.Bundle;
import android.os.Looper;
import com.ss.android.ugc.aweme.clean.ICleanDialogService;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.dialogmanager.CleanDialogServiceImpl;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.102O, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C102O {
    public static final C102O LIZ = new C102O();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C102S());

    public static void LIZ(final C19EG c19eg) {
        ICleanDialogService iCleanDialogService;
        C01GW c01gw = LIZIZ;
        IComplianceSettingsService iComplianceSettingsService = (IComplianceSettingsService) c01gw.getValue();
        if (iComplianceSettingsService != null && iComplianceSettingsService.LJIL()) {
            IComplianceSettingsService iComplianceSettingsService2 = (IComplianceSettingsService) c01gw.getValue();
            if (iComplianceSettingsService2 != null) {
                iComplianceSettingsService2.LJJI(false);
            }
            IComplianceSettingsService iComplianceSettingsService3 = (IComplianceSettingsService) c01gw.getValue();
            if (iComplianceSettingsService3 != null) {
                iComplianceSettingsService3.LJIJJLI(new C100F() { // from class: X.102Q
                    @Override // X.C100F
                    public final void LIZIZ(boolean z) {
                        C102O c102o = C102O.LIZ;
                        C19EG c19eg2 = c19eg;
                        c102o.getClass();
                        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                            C15O7.LIZJ(new C102R(c19eg2));
                        } else {
                            C102O.LIZ(c19eg2);
                        }
                    }
                }, 0);
                return;
            }
            return;
        }
        ((IGatekeeperService) ServiceManager.get().getService(IGatekeeperService.class)).LJIIIIZZ("ComplianceSettingFinished", new Bundle(), null);
        Object objLIZ = C04TD.LIZ(ICleanDialogService.class, false);
        if (objLIZ != null) {
            iCleanDialogService = (ICleanDialogService) objLIZ;
        } else {
            if (C04TD.d2 == null) {
                synchronized (ICleanDialogService.class) {
                    if (C04TD.d2 == null) {
                        C04TD.d2 = new CleanDialogServiceImpl();
                    }
                }
            }
            iCleanDialogService = C04TD.d2;
        }
        if (iCleanDialogService != null && iCleanDialogService.LIZ()) {
            return;
        }
        IComplianceSettingsService iComplianceSettingsService4 = (IComplianceSettingsService) c01gw.getValue();
        if (iComplianceSettingsService4 != null) {
            iComplianceSettingsService4.LJJIII();
        }
        C1440005kM.LIZ(new IEvent() { // from class: X.0rUy
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }
}

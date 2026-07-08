package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0c7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999730c7f {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZ;
    public final InterfaceC999480c7G LIZIZ;
    public View LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final void LIZIZ() {
        this.LIZLLL = false;
        this.LJ = false;
    }

    public C999730c7f(InterfaceC1000280c8Y interfaceC1000280c8Y, final C999790c7l c999790c7l) {
        AbstractC1024610cln abstractC1024610cln = new AbstractC1024610cln() { // from class: X.0c7g
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                C999730c7f c999730c7f = this.LL;
                if (!c999730c7f.LIZLLL) {
                    c999730c7f.LJ = true;
                    c999730c7f.LIZJ = interfaceC1541990qEH.e1();
                    View viewE1 = interfaceC1541990qEH.e1();
                    if (viewE1 != null) {
                        C786410Ut5.W5(viewE1, new FrameLayout.LayoutParams(-1, -2));
                    }
                }
                c999790c7l.LJ = this.LL.LJ;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                this.LL.LIZLLL = false;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
                c999790c7l.LIZLLL(2);
                this.LL.LIZLLL = true;
            }
        };
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c999790c7l.LIZJ;
        C1029690ctz c1029690ctzLJJIIJZLJL = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new FrameLayout.LayoutParams(-1, -2));
        } else {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
        }
        this.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        if (interfaceC1000280c8Y != null) {
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            c1029690ctzLJJIIJZLJL = interfaceC1000280c8Y.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, iAdLandPagePreloadService != null ? iAdLandPagePreloadService.K0("lynx_feed") : null, abstractC1024610cln);
        }
        this.LIZIZ = c1029690ctzLJJIIJZLJL;
    }

    public final void LIZ(Bundle bundle, String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(this.LIZ);
        }
        InterfaceC999480c7G interfaceC999480c7G = this.LIZIZ;
        if (interfaceC999480c7G != null) {
            interfaceC999480c7G.LIZ(bundle, str, C1000150c8L.LIZ().enableLynxCard);
        }
    }
}

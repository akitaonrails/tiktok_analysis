package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0clj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024570clj {
    public final Context LIZ;
    public final String LIZIZ;
    public final Bundle LIZJ;
    public FragmentManager LJ;
    public InterfaceC1008670cM5 LJII;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 854));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 850));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 851));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 852));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 855));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 853));

    public final boolean LIZIZ() {
        boolean zLIZIZ;
        String str;
        SparkFragment sparkFragment;
        Object obj = (InterfaceC1034470d1h) this.LJI.getValue();
        InterfaceC1541990qEH kitView = null;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (!(obj instanceof SparkFragment) || (sparkFragment = (SparkFragment) obj) == null) ? null : sparkFragment.LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
            return false;
        }
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        if (sparkContext == null || (str = sparkContext.containerId) == null) {
            zLIZIZ = false;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            }
            if (!zLIZIZ && kitView != null) {
                Map<String, Boolean> map = C1024630clp.LLILLL;
                C1051550dTF.LIZ(kitView, true, false);
                return true;
            }
        }
        Map<String, Boolean> map2 = C1024630clp.LLILLL;
        zLIZIZ = C1051550dTF.LIZIZ(str);
        kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        return !zLIZIZ ? false : false;
    }

    public final void LIZJ() {
        Object c098200Yq;
        InterfaceC1034470d1h interfaceC1034470d1h = (InterfaceC1034470d1h) this.LJI.getValue();
        Fragment fragment = interfaceC1034470d1h != null ? interfaceC1034470d1h.getFragment() : null;
        FragmentManager fragmentManager = this.LJ;
        if (fragment == null || fragmentManager == null) {
            return;
        }
        try {
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragment);
            c098200Yq = Integer.valueOf(c19ehLJIIJ.LJIIJ());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m1boximpl(c098200Yq);
    }

    public final void LIZ(Fragment fragment) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Activity activityLIZ;
        if (this.LJII == null) {
            Context context = this.LIZ;
            if ((context instanceof InterfaceC655270Pn3) && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                ICommercializeFeedService iCommercializeFeedService = (ICommercializeFeedService) ServiceManager.get().getService(ICommercializeFeedService.class);
                C726730Sf1 c726730Sf1LJFF = null;
                Fragment fragment2 = null;
                if (iCommercializeFeedService != null) {
                    InterfaceC1034470d1h interfaceC1034470d1h = (InterfaceC1034470d1h) this.LJI.getValue();
                    if (interfaceC1034470d1h != null) {
                        fragment2 = interfaceC1034470d1h.getFragment();
                    }
                    c726730Sf1LJFF = iCommercializeFeedService.LJFF(activityLIZ, fragment2, new InterfaceC1399350mWD() { // from class: X.0clk
                        @Override // X.InterfaceC1399350mWD
                        public final /* synthetic */ boolean Fi() {
                            return false;
                        }

                        @Override // X.InterfaceC1399350mWD
                        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                            if (i == 4) {
                                if (!this.LL.LIZIZ()) {
                                    this.LL.LIZJ();
                                    return true;
                                }
                                return true;
                            }
                            return false;
                        }
                    });
                }
                this.LJII = c726730Sf1LJFF;
            }
        }
        InterfaceC1008670cM5 interfaceC1008670cM5 = this.LJII;
        if (interfaceC1008670cM5 != null) {
            interfaceC1008670cM5.enable(true);
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ == null || (onBackPressedDispatcher = c19egLIZIZ.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.LIZ(fragment, (AbstractC2173821A5s) this.LJIIJ.getValue());
    }

    public C1024570clj(C19EG c19eg, String str, Bundle bundle) {
        this.LIZ = c19eg;
        this.LIZIZ = str;
        this.LIZJ = bundle;
    }
}

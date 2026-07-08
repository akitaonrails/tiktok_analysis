package X;

import Y.ARunnableS128S0100000_28;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.OnboardingRequest;
import com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.10ST, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C10ST extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZgspPhogLTcAKDo9Ky0NKjs6Piw4MA==";
    public int LL;
    public boolean LLILLJJLI;
    public boolean LLILLL = true;
    public boolean LLILZ;
    public boolean LLILZIL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public void finish() {
        super.finish();
        this.LLILZIL = true;
        C0X35.LJIIJJI("cold_boot_new_user_launch_focus_to_finish", false);
        C1911410zq7.LIZ("NewUserLaunchActivity", Log.getStackTraceString(new RuntimeException("NewUserLaunchActivity finish calling stack, not a real exception:")));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        RunnableC1601200rlm runnableC1601200rlm;
        super.onPause();
        if (this.LL <= 0) {
            C0X35.LJIJI(SystemClock.uptimeMillis());
            C202099145x c202099145xLIZ = C1150504el.LIZ();
            Integer num = SloganFragment.LLJILJILJ;
            c202099145xLIZ.LJJ = num != null ? num.intValue() : 0;
            C08TN.LIZ().LJJJJ(((Boolean) C276870AtB.LIZ.getValue()).booleanValue());
            return;
        }
        if (isFinishing()) {
            C584470Mw9.LJII("new_user_journey", null);
            C584360Mvy.LJ(1);
            C0X35.LJIIJJI("cold_boot_new_user_login_end_to_nuj_finish", false);
            C0X35.LJIIJJI("cold_boot_nujactivity_focus_to_finish", false);
            C0X35.LJIIJJI("cold_boot_new_user_login_end_to_feed_total_start", false);
            C0X35.LJIJI(SystemClock.uptimeMillis());
            C202099145x c202099145xLIZ2 = C1150504el.LIZ();
            Integer num2 = SloganFragment.LLJILJILJ;
            c202099145xLIZ2.LJJ = num2 != null ? num2.intValue() : 0;
            C08TN.LIZ().LJJJJ(((Boolean) C276870AtB.LIZ.getValue()).booleanValue());
            C0X35.LIZ("cold_boot_new_user_journey_pause_to_data_fetched", false);
            C0X35.LJIIJJI("cold_boot_start_to_feed_total_start", false);
            C1913090zsp c1913090zsp = C1913090zsp.LIZ;
            boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
            c1913090zsp.getClass();
            C1913090zsp.LIZ(zBooleanValue);
            if (C1486210omJ.LIZ() || (runnableC1601200rlm = Feed0VVManager.LJIIIZ) == null) {
                return;
            }
            runnableC1601200rlm.run();
            Feed0VVManager.LJIIIZ = null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        C0X35.LIZ("cold_boot_new_user_launch_oncreate_duration", false);
        C0TKF c0tkf = C0TKA.LIZ;
        super.onCreate(bundle);
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        boolean z = true;
        C10RS.LIZ().LIZLLL = true;
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(OnboardingRequest.LLILZ.getValue());
        ComplianceServiceProvider.LJJIII().initialize();
        IMandatoryLoginService iMandatoryLoginService = (IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class);
        if (C10RS.LIZ().LIZJ() != 0 && iMandatoryLoginService.shouldShowForcedLogin(false) && !iMandatoryLoginService.getHasRequestComplianceApi()) {
            iMandatoryLoginService.setHasRequestComplianceApi(true);
            c799890VZj.LIZ(C19248710Sf.LIZIZ.LJIILIIL(C0CO3.NORMAL));
        }
        c799890VZj.LIZIZ();
        if (getIntent().getBooleanExtra("redirect_from_main", false) || getIntent().getBooleanExtra("from_deeplink", false)) {
            new ARunnableS128S0100000_28(this, 28).run();
        }
        if (bundle == null) {
            z = false;
        }
        this.LLILLJJLI = z;
        C0X35.LJIIJJI("cold_boot_new_user_launch_oncreate_duration", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService;
        View view;
        C0X35.LJIIJJI("cold_boot_new_user_journey_resume_to_focus_changed", false);
        super.onWindowFocusChanged(z);
        C1150504el.LIZ().LJIIIIZZ = false;
        C1150504el.LIZ().LJIIZILJ = true;
        if (z) {
            C0X35.LJIIJJI("app_start_to_main_focus", true);
            C2155308cR.LIZIZ();
            C0X35.LIZ("cold_boot_nujactivity_focus_to_finish", false);
            C0X35.LIZ("cold_boot_new_user_launch_focus_to_finish", false);
            C0X35.LIZ("interest_window_focus_changed_to_slogan_fragment", false);
            C584470Mw9.LJ("new_user_journey");
            C1568170quV.LIZ(2000);
            C0VWW.LIZIZ("latency_app_start_newuser");
        }
        if (C10TN.LIZ() && this.LLILZIL && (iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null)) != null) {
            C1602860roS.LIZ.getClass();
            WeakReference<View> weakReference = C1602860roS.LIZIZ;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                view = null;
            }
            WeakReference<View> weakReference2 = C1602860roS.LIZIZ;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            iUnKnownOwnershipBusinessOuterService.LJIILIIL(view);
        }
    }

    public static void LLLLLZL(C10ST c10st, Intent intent) {
        Intent intent2 = intent;
        Activity activity = c10st;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KMStdKrd2SCuWeCdThC5jMjvQ5puJg==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/NewUserLaunchActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/NewUserLaunchActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/NewUserLaunchActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }
}

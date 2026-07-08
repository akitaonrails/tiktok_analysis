package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.NewUserJourneyContainerActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;

/* JADX INFO: renamed from: X.0Wr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC836150Wr7 extends C19EG implements InterfaceC836170Wr9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOS8jPD09LTxiGjsmKggtICESKzElPyYnMQ==";

    @Override // X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        Activity activity;
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService;
        C0X35.LJIIJJI("cold_boot_application_to_stubmain", false);
        C0X35.LIZ("cold_boot_stubmain_oncreate_duration", false);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            intent.setFlags(268435456);
        } else {
            intent = new Intent();
        }
        intent.putExtra("redirect_from_main", true);
        if (C836180WrA.LIZ()) {
            intent.setClassName(this, NewUserJourneyContainerActivity.class.getName());
        } else {
            intent.setClassName(this, NewUserJourneyActivity.class.getName());
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, this);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOCndo3A2SvpO2/K2lHEVTk8BP1RhSgsGQ==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/journey/StubMainActivity", "startActivity", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/journey/StubMainActivity", "startActivity", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    activity = (Activity) obj;
                } else {
                    activity = this;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    intent = (Intent) obj2;
                }
            } else {
                activity = this;
            }
            activity.startActivity(intent);
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/journey/StubMainActivity", "startActivity", null, objArr, activity, c0wzw, true);
        }
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
        finish();
        if (C104100aN.LIZ().isNewUser() && (iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null)) != null) {
            iUnKnownOwnershipBusinessOuterService.LJIIIZ();
        }
        C0X35.LJIIJJI("cold_boot_stubmain_oncreate_duration", false);
        C0X35.LIZ("cold_boot_stubmain_to_new_user_jrouney", false);
    }
}

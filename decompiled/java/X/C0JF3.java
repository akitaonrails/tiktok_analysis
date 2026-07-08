package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0JF3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JF3<V> implements Callable {
    public final /* synthetic */ String LL;

    public C0JF3(String str) {
        this.LL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("DynamicModuleStateListener@72c0.showPermissionDialog$1");
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        Unit unit = null;
        if (validTopActivity != null) {
            Intent intent = new Intent(validTopActivity, (Class<?>) DFInstallBlankActivity.class);
            intent.putExtra("module_name", this.LL);
            intent.putExtra("is_hold_permission_dialog", true);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(validTopActivity, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, validTopActivity);
            C2204961BRm.LJIILLIIL(validTopActivity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOupYY/CyTWLEHdFYsp1PwXSO2QIJWfh3CV8oeJyAVQQu3DQSH1mUBloojmr8v0=", null));
            C786410Ut5.ae(0, validTopActivity, 0);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("DynamicModuleStateListener@72c0.showPermissionDialog$1");
        return unit;
    }
}

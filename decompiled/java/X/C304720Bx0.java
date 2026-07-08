package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Bx0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C304720Bx0 {
    public static final boolean LIZ = ((Boolean) C304700Bwy.LIZ.getValue()).booleanValue();
    public static final C0CUF LIZIZ = new C0CUH() { // from class: X.0CUF
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            try {
                if (C304720Bx0.LJ && EventBus.LIZLLL().LJIIJ(activity)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("activity", activity.getClass().getSimpleName());
                    C793770VBv.LJII("eventbus_unregister", jSONObject, null, null);
                }
                EventBus.LIZLLL().LJJI(activity);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (C304720Bx0.LIZJ && (activity instanceof C19EG)) {
                ((C19EG) activity).getSupportFragmentManager().LJZL(C304720Bx0.LIZLLL, true);
            }
        }
    };
    public static final boolean LIZJ = ((Boolean) C304700Bwy.LIZIZ.getValue()).booleanValue();
    public static final C0CUG LIZLLL = new AbstractC813200VvC() { // from class: X.0CUG
        @Override // X.AbstractC813200VvC
        public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            try {
                if (C304720Bx0.LJ && EventBus.LIZLLL().LJIIJ(fragment)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fragment", fragment.getClass().getSimpleName());
                    C793770VBv.LJII("eventbus_unregister", jSONObject, null, null);
                }
                EventBus.LIZLLL().LJJI(fragment);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    };
    public static final boolean LJ = ((Boolean) C0AMI.LIZ.getValue()).booleanValue();
}

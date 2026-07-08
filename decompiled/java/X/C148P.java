package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148P, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C148P implements Application.ActivityLifecycleCallbacks {
    public final Activity LL;
    public int LLILLJJLI = 1;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    public C148P(Activity activity) {
        this.LL = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity == this.LL) {
            this.LLILLJJLI++;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == this.LL) {
            int i = this.LLILLJJLI - 1;
            this.LLILLJJLI = i;
            if (i == 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("key", "background");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C202179148z.LIZJ("turing_verify_sdk", jSONObject);
            }
        }
    }
}

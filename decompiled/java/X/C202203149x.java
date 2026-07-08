package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.149x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202203149x implements Application.ActivityLifecycleCallbacks {
    public final Activity LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public int LLILZ = 1;

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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity == this.LL) {
            this.LLILZ++;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == this.LL) {
            int i = this.LLILZ - 1;
            this.LLILZ = i;
            if (i == 0) {
                String str = this.LLILLJJLI;
                String str2 = this.LLILLL;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("shark_log_id", str);
                    jSONObject.put("req_path", str2);
                    jSONObject.put("key", "background");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C202191149l.LIZJ("oec_verify_sdk", jSONObject);
            }
        }
    }

    public C202203149x(Activity activity, String str, String str2) {
        this.LL = activity;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}

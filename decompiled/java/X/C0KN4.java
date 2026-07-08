package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KN4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KN4 implements Application.ActivityLifecycleCallbacks {
    public static final /* synthetic */ int LLJ = 0;
    public final Activity LL;
    public final long LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    public final void LIZJ() {
        Application application;
        Activity activity = this.LL;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    public C0KN4(Activity activity) {
        Application application;
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.LL = activity;
        this.LLILLJJLI = jUptimeMillis;
        if (activity != null && (application = activity.getApplication()) != null) {
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    public final Map<String, String> LIZ(Map<String, String> map) {
        long jLongValue;
        long jLongValue2;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        String str = map.get("get_store_callback_start_timestamp");
        if (str != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str)) != null) {
            jLongValue = lLJIILIIL2.longValue();
        } else {
            jLongValue = 0;
        }
        String str2 = map.get("get_store_callback_end_timestamp");
        if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
            jLongValue2 = lLJIILIIL.longValue();
        } else {
            jLongValue2 = 0;
        }
        String str3 = map.get("upload_receipt_duration");
        this.LLILZ = jLongValue2;
        if (this.LLILLL == 0) {
            this.LLILLL = jLongValue;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("add_payment_duration", String.valueOf(jLongValue - this.LLILLJJLI));
        linkedHashMap.put("cashier_wait_duration", String.valueOf(this.LLILLL - this.LLILLJJLI));
        linkedHashMap.put("cashier_show_duration", String.valueOf(this.LLILZ - this.LLILLL));
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("send_receipt_duration", str3);
        return linkedHashMap;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (Intrinsics.LJFF(this.LL, activity) && this.LLILLL == 0) {
            this.LLILLL = SystemClock.uptimeMillis();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (Intrinsics.LJFF(this.LL, activity)) {
            if (this.LLILZIL) {
                this.LLILZLL++;
            }
            if (this.LLIZ) {
                this.LLIZLLLIL++;
            }
        }
    }
}

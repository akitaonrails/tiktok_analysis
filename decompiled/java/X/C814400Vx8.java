package X;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0Vx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814400Vx8 implements Application.ActivityLifecycleCallbacks {
    public final Set<Intent> LL = Collections.newSetFromMap(new WeakHashMap());

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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0014 -> B:10:0x0017). Please report as a decompilation issue!!! */
    public static void LIZ(Intent intent) {
        Bundle bundle = null;
        try {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    bundle = extras.getBundle("gcm.n.analytics_data");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (bundle != null && "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null && "1".equals(bundle.getString("google.c.a.tc"))) {
                C818880WAk c818880WAkLIZIZ = C818880WAk.LIZIZ();
                c818880WAkLIZIZ.LIZ();
                InterfaceC814150Vwj interfaceC814150Vwj = (InterfaceC814150Vwj) c818880WAkLIZIZ.LIZLLL.LIZIZ(InterfaceC814150Vwj.class);
                if (interfaceC814150Vwj != null) {
                    String string = bundle.getString("google.c.a.c_id");
                    interfaceC814150Vwj.LIZIZ(string);
                    Bundle bundle2 = new Bundle();
                    C786410Ut5.LJJJI("source", "Firebase", bundle2);
                    C786410Ut5.LJJJI("medium", "notification", bundle2);
                    C786410Ut5.LJJJI("campaign", string, bundle2);
                    interfaceC814150Vwj.LIZ("_cmp", bundle2);
                }
            }
            C814140Vwi.LIZIZ(bundle, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Integer numLIZ;
        if (activity instanceof C199Y) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) ((C19FO) activity).getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.IS_FINISHING;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), activity)) != null) {
                if (activity.isFinishing()) {
                    this.LL.remove(activity.getIntent());
                }
                C1565730qqZ.LIZIZ(numLIZ.intValue(), activity);
                return;
            }
        }
        if (!activity.isFinishing()) {
            return;
        }
        this.LL.remove(activity.getIntent());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent != null && this.LL.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0Vx9
                    @Override // java.lang.Runnable
                    public final void run() {
                        C814400Vx8 c814400Vx8 = this.LL;
                        Intent intent2 = intent;
                        c814400Vx8.getClass();
                        C1C7U.LIZ("FcmLifecycleCallbacks@9a33.onActivityCreated$1L");
                        C814400Vx8.LIZ(intent2);
                        C1C7U.LIZIZ("FcmLifecycleCallbacks@9a33.onActivityCreated$1L");
                    }
                });
            } else {
                LIZ(intent);
            }
        }
    }
}

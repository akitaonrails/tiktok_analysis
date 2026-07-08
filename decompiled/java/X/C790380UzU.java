package X;

import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.HttpDns;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: X.0UzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790380UzU implements Application.ActivityLifecycleCallbacks {
    public static boolean LLILLL;
    public static final WeakHandler LLILZ = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() { // from class: X.0UzW
        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    });
    public C790390UzV LL;
    public final ARunnableS113S0100000_13 LLILLJJLI = new ARunnableS113S0100000_13(this, 209);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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

    public C790380UzU() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(objInvoke);
            if (map != null) {
                for (Object obj : map.values()) {
                    Class<?> cls2 = obj.getClass();
                    Field declaredField2 = cls2.getDeclaredField("paused");
                    declaredField2.setAccessible(true);
                    if (!declaredField2.getBoolean(obj)) {
                        Field declaredField3 = cls2.getDeclaredField("activity");
                        declaredField3.setAccessible(true);
                        if (((Activity) declaredField3.get(obj)) != null) {
                            LLILLL = true;
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (LLILLL) {
            LLILZ.postDelayed(this.LLILLJJLI, 30000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (!LLILLL) {
            LLILLL = true;
            if (this.LL != null) {
                HttpDns httpDnsLJ = HttpDns.LJ();
                httpDnsLJ.getClass();
                Message messageObtain = Message.obtain();
                messageObtain.obj = httpDnsLJ;
                messageObtain.what = 7;
                HttpDns.LLJJJIL.sendMessage(messageObtain);
            }
        }
        LLILZ.removeCallbacks(this.LLILLJJLI);
    }
}

package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.ies.foundation.activity.BaseActivity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS355S0000000_32;
import kotlin.jvm.internal.AwS681S0100000_32;

/* JADX INFO: renamed from: X.19Dr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21504119Dr implements Application.ActivityLifecycleCallbacks {
    public final CopyOnWriteArrayList<InterfaceC21503119Dh> LL = new CopyOnWriteArrayList<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        LIZ(this, activity, false, null, AFwS355S0000000_32.get$arr$(2), 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        LIZ(this, activity, false, null, AFwS355S0000000_32.get$arr$(3), 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (C2345409Gy.LIZ()) {
            C2345409Gy.LIZIZ(new RunnableC2345109Gv(0, activity, this));
        } else {
            LIZ(this, activity, false, null, new C21504219Ds(), 6);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        LIZ(this, activity, false, null, new C21504319Dt(), 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        LIZ(this, activity, false, null, AFwS355S0000000_32.get$arr$(4), 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        LIZ(this, activity, false, null, new C21504019Dq(bundle), 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        LIZ(this, activity, false, null, new AwS681S0100000_32(bundle, 14), 6);
    }

    public static Object LIZ(C21504119Dr c21504119Dr, Activity activity, boolean z, Object obj, InterfaceC1631620sYq interfaceC1631620sYq, int i) {
        BaseActivity baseActivity;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        c21504119Dr.getClass();
        if ((activity instanceof BaseActivity) && (baseActivity = (BaseActivity) activity) != null && baseActivity.enableCallbacks) {
            Iterator<InterfaceC21503119Dh> it2 = c21504119Dr.LL.iterator();
            while (it2.hasNext()) {
                obj = interfaceC1631620sYq.invoke(it2.next(), baseActivity, obj);
            }
            if (z) {
                Iterator<C19DE> it3 = ((BaseActivity) activity).getProcessors$base_foundation_release().iterator();
                while (it3.hasNext()) {
                    obj = interfaceC1631620sYq.invoke(it3.next(), baseActivity, obj);
                }
            }
            List<C19D2> list = baseActivity.innerProcessors;
            if (list != null) {
                Iterator<C19D2> it4 = list.iterator();
                while (it4.hasNext()) {
                    obj = interfaceC1631620sYq.invoke(it4.next(), baseActivity, obj);
                }
            }
        }
        return obj;
    }
}

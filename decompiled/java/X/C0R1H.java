package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.foundation.activity.BaseActivity;
import kotlin.jvm.internal.AwS247S0300000_3;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0R1H, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R1H {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LIZ(Activity activity) {
        if ((activity instanceof C19EG) && (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d))) {
            return ((Boolean) C1563370qml.LIZ((LifecycleOwner) activity, EnumC682280QpW.IS_FINISHING, new AwS554S0100000_10(activity, 904))).booleanValue();
        }
        return activity.isFinishing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Lifecycle.State LIZJ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof C19EG) {
            ComponentCallbacks2 componentCallbacks2 = (Activity) lifecycleOwner;
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2 instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2).getEnableSAF()) : (componentCallbacks2 instanceof InterfaceC214897198d)) {
                return (Lifecycle.State) C1563370qml.LIZ(lifecycleOwner, EnumC682280QpW.GET_CURRENT_STATE, new C0R1I(lifecycleOwner));
            }
        }
        return lifecycleOwner.getLifecycle().getCurrentState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZLLL(Activity activity) {
        if ((activity instanceof C19EG) && (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d))) {
            C1563370qml.LIZ((LifecycleOwner) activity, EnumC682280QpW.FINISH, new AwS554S0100000_10(activity, 905));
        } else {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(LifecycleOwner lifecycleOwner, LifecycleObserver lifecycleObserver) {
        if (lifecycleOwner instanceof C19EG) {
            ComponentCallbacks2 componentCallbacks2 = (Activity) lifecycleOwner;
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2 instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2).getEnableSAF()) : (componentCallbacks2 instanceof InterfaceC214897198d)) {
                C1563370qml.LIZ(lifecycleOwner, EnumC682280QpW.ADD_OBSERVER, new C642580PIi(lifecycleOwner, lifecycleObserver));
                return;
            }
        }
        lifecycleOwner.getLifecycle().addObserver(lifecycleObserver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJ(LiveData liveData, BaseActivity baseActivity, Observer observer) {
        if (!C294780Bgy.LIZ() ? !(!(baseActivity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) baseActivity).getEnableSAF()) : (baseActivity instanceof InterfaceC214897198d)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("safObserve: ");
            sbLIZ.append(baseActivity);
            sbLIZ.append(", ");
            sbLIZ.append(baseActivity.getLifecycle());
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
            C1563370qml.LIZ(baseActivity, EnumC682280QpW.LIVEDATA_OBSERVE, new AwS247S0300000_3(liveData, baseActivity, observer, 2));
            return;
        }
        liveData.observe(baseActivity, observer);
    }
}

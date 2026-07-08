package androidx.savedstate;

import X.C128Y;
import X.C128Z;
import X.C2188811AlT;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes30.dex */
public final class Recreator implements LifecycleEventObserver {
    public final C128Y LL;

    public Recreator(C128Y c128y) {
        this.LL = c128y;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            Bundle bundleLIZ = this.LL.getSavedStateRegistry().LIZ("androidx.savedstate.Restarter");
            if (bundleLIZ == null) {
                return;
            }
            ArrayList<String> stringArrayList = bundleLIZ.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C128Z.class);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                ((C128Z) declaredConstructor.newInstance(new Object[0])).onRecreated(this.LL);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Failed to instantiate ");
                                sbLIZ.append(str);
                                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Class ");
                            sbLIZ2.append(clsAsSubclass.getSimpleName());
                            sbLIZ2.append(" must have default constructor in order to be automatically recreated");
                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2), e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Class ");
                        sbLIZ3.append(str);
                        sbLIZ3.append(" wasn't found");
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3), e3);
                    }
                }
                return;
            }
            "SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"".toString();
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}

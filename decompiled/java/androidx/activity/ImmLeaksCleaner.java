package androidx.activity;

import X.AbstractC21517319It;
import X.C01GW;
import X.C452501pT;
import X.C786410Ut5;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class ImmLeaksCleaner implements LifecycleEventObserver {
    public static final C01GW<AbstractC21517319It> LLILLJJLI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(4));
    public final Activity LL;

    public ImmLeaksCleaner(Activity activity) {
        this.LL = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        InputMethodManager inputMethodManager;
        AbstractC21517319It value;
        Object objLIZIZ;
        if (event != Lifecycle.Event.ON_DESTROY || (objLIZIZ = (value = LLILLJJLI.getValue()).LIZIZ((inputMethodManager = (InputMethodManager) C786410Ut5.F2(this.LL, "input_method")))) == null) {
            return;
        }
        synchronized (objLIZIZ) {
            try {
                View viewLIZJ = value.LIZJ(inputMethodManager);
                if (viewLIZJ == null) {
                    return;
                }
                if (viewLIZJ.isAttachedToWindow()) {
                    return;
                }
                boolean zLIZ = value.LIZ(inputMethodManager);
                if (zLIZ) {
                    inputMethodManager.isActive();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

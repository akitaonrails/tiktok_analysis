package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandleController;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.nita.memory.MemoryManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow;
import com.ss.android.ugc.aweme.preload.SAFPreloadManager;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0qqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565730qqZ {
    public static final WeakHashMap<Observer, WeakReference<C19506511Tj>> LIZ = new WeakHashMap<>();
    public static final Class[] LIZIZ = {TuxTooltipPopupWindow.class, PowerStub.class, LifecycleCoroutineScopeImpl.class, MemoryManager.MemoryLifecycleObserver.class, MemoryManager.MemoryLifecycleObserverV2.class, SAFPreloadManager.SAFPreloadLifecycleObserver.class, PowerCell.class, SavedStateHandleController.class};

    public static Integer LIZ(int i, Context context) {
        if (context == null) {
            return null;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ instanceof C199Y) {
            Lifecycle lifecycle = ((C19FO) activityLIZ).getLifecycle();
            if (lifecycle instanceof AbstractC1563340qmi) {
                AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycle;
                abstractC1563340qmi.getClass();
                if (abstractC1563340qmi.LJI(EnumC682280QpW.MAIN)) {
                    synchronized (abstractC1563340qmi.LLILLJJLI) {
                        try {
                            for (EnumC682280QpW enumC682280QpW : EnumC682280QpW.values()) {
                                if ((enumC682280QpW.getValue() & i) != 0) {
                                    int[] iArr = abstractC1563340qmi.LLILLJJLI;
                                    int iOrdinal = enumC682280QpW.ordinal();
                                    iArr[iOrdinal] = iArr[iOrdinal] + 1;
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    return Integer.valueOf(i);
                }
            }
        }
        return null;
    }

    public static void LIZIZ(int i, Context context) {
        if (context == null) {
            return;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ instanceof C199Y) {
            Lifecycle lifecycle = ((C19FO) activityLIZ).getLifecycle();
            if (lifecycle instanceof AbstractC1563340qmi) {
                ((AbstractC1563340qmi) lifecycle).LIZLLL(i);
            }
        }
    }
}

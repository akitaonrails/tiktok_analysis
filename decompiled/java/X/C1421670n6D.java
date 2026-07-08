package X;

import X.C1413350msn;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.ECViewTracker$Companion$setupTrack$observer$1;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n6D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421670n6D {
    public static void LIZIZ(View view, Function0 function0, Function1 function1) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ != null) {
            LIZ(view, fragmentLIZ, (String) function0.invoke(), function1);
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ != null) {
            LIZ(view, c19egLIZIZ, (String) function0.invoke(), function1);
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (!((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            C1AF0.LIZJ("logWhenShow fail to report");
            return;
        }
        throw new RuntimeException("view must in a fragment or FragmentActivity");
    }

    public static void LIZ(View view, LifecycleOwner lifecycleOwner, String str, Function1 function1) {
        C1413350msn c1413350msn;
        if (Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
            HashMap<LifecycleOwner, LifecycleEventObserver> map = C1413350msn.LJIIL;
            if (!map.containsKey(lifecycleOwner)) {
                ECViewTracker$Companion$setupTrack$observer$1 eCViewTracker$Companion$setupTrack$observer$1 = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.slark.impl.ECViewTracker$Companion$setupTrack$observer$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1413350msn.LJIIJJI.remove(lifecycleOwner2);
                            C1413350msn.LJIIL.remove(lifecycleOwner2);
                        }
                    }
                };
                map.put(lifecycleOwner, eCViewTracker$Companion$setupTrack$observer$1);
                C0R1H.LIZIZ(lifecycleOwner, eCViewTracker$Companion$setupTrack$observer$1);
            }
            ConcurrentHashMap<LifecycleOwner, CopyOnWriteArraySet<String>> concurrentHashMap = C1413350msn.LJIIJJI;
            if (!concurrentHashMap.containsKey(lifecycleOwner)) {
                concurrentHashMap.put(lifecycleOwner, new CopyOnWriteArraySet<>());
            }
            Object tag = view.getTag(R.id.gic);
            if (tag instanceof C1413350msn) {
                c1413350msn = (C1413350msn) tag;
            } else {
                c1413350msn = null;
            }
            if (c1413350msn != null) {
                AnonymousClass0956 anonymousClass0956 = c1413350msn.LJIIIIZZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c1413350msn.LJIIIIZZ = null;
                c1413350msn.LIZJ = str;
                c1413350msn.LIZLLL = function1;
                c1413350msn.LJI = false;
                return;
            }
            C1413350msn c1413350msn2 = new C1413350msn(view, lifecycleOwner, str, function1);
            view.setTag(R.id.gic, c1413350msn2);
            C786410Ut5.y3(view.getViewTreeObserver(), c1413350msn2.LJIIIZ);
            view.addOnAttachStateChangeListener(c1413350msn2.LJIIJ);
            c1413350msn2.LJII = false;
            return;
        }
        throw new IllegalThreadStateException("must in main thread");
    }
}

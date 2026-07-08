package X;

import X.C1578100rAW;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qsh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567050qsh {
    public static C1578100rAW LIZ(LifecycleOwner lifecycleOwner, C19EG c19eg) {
        C1578100rAW c1578100rAW = C1578100rAW.LLILLL;
        if (c1578100rAW == null) {
            synchronized (C13LE.LIZ(C1578100rAW.class)) {
                try {
                    c1578100rAW = C1578100rAW.LLILLL;
                    if (c1578100rAW == null) {
                        c1578100rAW = new C1578100rAW(c19eg, lifecycleOwner);
                        C1578100rAW.LLILLL = c1578100rAW;
                        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                        if (lifecycle != null) {
                            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.popup.SocialPagePopupScene$Companion$getInstance$1$1$1
                                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                                public final void onDestroy() {
                                    C1578100rAW.LLILLL = null;
                                }

                                @Override // androidx.lifecycle.LifecycleEventObserver
                                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                    if (event == Lifecycle.Event.ON_DESTROY) {
                                        onDestroy();
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c1578100rAW;
    }
}

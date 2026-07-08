package X;

import X.C1498600p6I;
import X.C1499070p73;
import X.C1C7U;
import X.C2487409ou;
import X.C786410Ut5;
import X.InterfaceC1499080p74;
import android.os.HandlerThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;

/* JADX INFO: renamed from: X.0p6I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498600p6I {
    public static BPEAHandler LIZ;
    public static final HandlerThread LIZIZ = new HandlerThread("StrategyDriver");

    public static void LIZIZ(Runnable runnable) {
        BPEAHandler bPEAHandler = LIZ;
        if (bPEAHandler != null) {
            C786410Ut5.LJJZZIII(bPEAHandler, runnable);
        }
    }

    public static void LIZ(final Fragment fragment, final InterfaceC1499080p74 interfaceC1499080p74, final String str) {
        C823050WQl.LIZJ().execute(new Runnable() { // from class: com.ss.android.ugc.aweme.preload.strategy.StrategyDriver$addClient$1
            public final void LIZ() {
                if (C1498600p6I.LIZ == null) {
                    HandlerThread handlerThread = C1498600p6I.LIZIZ;
                    synchronized (handlerThread) {
                        try {
                            if (C1498600p6I.LIZ == null) {
                                if (handlerThread.getState() == Thread.State.NEW) {
                                    handlerThread.start();
                                }
                                C1498600p6I.LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                final String str2 = str;
                final Fragment fragment2 = fragment;
                final InterfaceC1499080p74 interfaceC1499080p742 = interfaceC1499080p74;
                C2487409ou.LIZJ(new Runnable() { // from class: com.ss.android.ugc.aweme.preload.strategy.StrategyDriver$addClient$1.2
                    public final void LIZ() {
                        Fragment fragment3;
                        LifecycleOwner viewLifecycleOwner;
                        final C1499070p73 c1499070p73 = new C1499070p73();
                        String str3 = str2;
                        Fragment fragment4 = fragment2;
                        final InterfaceC1499080p74 interfaceC1499080p743 = interfaceC1499080p742;
                        if (str3 == null) {
                            str3 = "";
                        }
                        c1499070p73.LIZIZ = str3;
                        c1499070p73.LIZ = fragment4;
                        if (fragment4.getView() == null || (fragment3 = c1499070p73.LIZ) == null || (viewLifecycleOwner = fragment3.getViewLifecycleOwner()) == null || viewLifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                            return;
                        }
                        interfaceC1499080p743.LIZIZ(c1499070p73);
                        viewLifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.preload.strategy.StrategyDriver$addClient$1$2$1$1$1
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                if (event == Lifecycle.Event.ON_DESTROY) {
                                    interfaceC1499080p743.LIZ();
                                    c1499070p73.LIZ = null;
                                }
                            }
                        });
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("StrategyDriver@c51c.addClient$1$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("StrategyDriver@c51c.addClient$1$2");
                    }
                });
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("StrategyDriver@c51c.addClient$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("StrategyDriver@c51c.addClient$1");
            }
        });
    }
}

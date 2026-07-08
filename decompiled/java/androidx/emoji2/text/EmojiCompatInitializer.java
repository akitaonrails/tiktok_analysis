package androidx.emoji2.text;

import X.AbstractC20139313r5;
import X.C2363109Nt;
import X.C2485109oX;
import X.C356901a3;
import X.C786410Ut5;
import X.InterfaceC2363209Nu;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.emoji2.text.e;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class EmojiCompatInitializer implements InterfaceC2363209Nu<Boolean> {
    @Override // X.InterfaceC2363209Nu
    public final List<Class<? extends InterfaceC2363209Nu<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$1, reason: invalid class name */
    public class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public final /* synthetic */ Lifecycle LL;

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            Handler handler;
            EmojiCompatInitializer.this.getClass();
            if (Build.VERSION.SDK_INT >= 28) {
                handler = C2485109oX.LIZ(Looper.getMainLooper());
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            C786410Ut5.LJLIIL(500L, handler, new Runnable() { // from class: X.09oW
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        try {
                            int i = C08C0.LIZ;
                            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                            if (e.LJ()) {
                                e.LIZ().LJFF();
                            }
                            Trace.endSection();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            int i2 = C08C0.LIZ;
                            Trace.endSection();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        if (!C2179971ATj.LIZ(th2)) {
                            throw th2;
                        }
                    }
                }
            });
            this.LL.removeObserver(this);
        }

        public AnonymousClass1(Lifecycle lifecycle) {
            this.LL = lifecycle;
        }
    }

    @Override // X.InterfaceC2363209Nu
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final Boolean create(final Context context) {
        Object objLIZIZ;
        e.LIZLLL(new AbstractC20139313r5(context) { // from class: X.09Nv
            {
                super(new C2485809oe(context));
                this.LIZIZ = 1;
            }
        });
        C2363109Nt c2363109NtLIZJ = C2363109Nt.LIZJ(context);
        c2363109NtLIZJ.getClass();
        synchronized (C2363109Nt.LJ) {
            try {
                objLIZIZ = ((HashMap) c2363109NtLIZJ.LIZ).get(ProcessLifecycleInitializer.class);
                if (objLIZIZ == null) {
                    objLIZIZ = c2363109NtLIZJ.LIZIZ(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Lifecycle lifecycle = ((LifecycleOwner) objLIZIZ).getLifecycle();
        lifecycle.addObserver(new AnonymousClass1(lifecycle));
        return Boolean.TRUE;
    }
}

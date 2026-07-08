package androidx.window.layout.adapter.sidecar;

import X.C092O;
import X.C0N9B;
import X.C12LG;
import X.C12LL;
import X.C12LN;
import X.C12LP;
import X.C12LR;
import X.C13BV;
import X.C19EG;
import X.C2188811AlT;
import X.InterfaceC19739612La;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.IBinder;
import android.view.View;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class SidecarCompat implements C12LN {
    public static final /* synthetic */ int LJFF = 0;
    public final SidecarInterface LIZ;
    public final C12LR LIZIZ;
    public final Map<IBinder, Activity> LIZJ;
    public final Map<Activity, C092O<Configuration>> LIZLLL;
    public C12LP LJ;

    public final boolean LJFF() {
        Class<?> cls;
        Method method;
        Class<?> cls2;
        Method method2;
        Class<?> cls3;
        Method method3;
        Class<?> cls4;
        Method method4;
        try {
            SidecarInterface sidecarInterface = this.LIZ;
            Class<?> returnType = null;
            Class<?> returnType2 = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null || (method4 = cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class)) == null) ? null : method4.getReturnType();
            if (!Intrinsics.LJFF(returnType2, Void.TYPE)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Illegal return type for 'setSidecarCallback': ");
                sbLIZ.append(returnType2);
                throw new NoSuchMethodException(C2188811AlT.LIZIZ(sbLIZ));
            }
            SidecarInterface sidecarInterface2 = this.LIZ;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.LIZ;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.LIZ;
            Class<?> returnType3 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null || (method3 = cls3.getMethod("getWindowLayoutInfo", IBinder.class)) == null) ? null : method3.getReturnType();
            if (!Intrinsics.LJFF(returnType3, SidecarWindowLayoutInfo.class)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Illegal return type for 'getWindowLayoutInfo': ");
                sbLIZ2.append(returnType3);
                throw new NoSuchMethodException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            SidecarInterface sidecarInterface5 = this.LIZ;
            Class<?> returnType4 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null || (method2 = cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class)) == null) ? null : method2.getReturnType();
            if (!Intrinsics.LJFF(returnType4, Void.TYPE)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Illegal return type for 'onWindowLayoutChangeListenerAdded': ");
                sbLIZ3.append(returnType4);
                throw new NoSuchMethodException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            SidecarInterface sidecarInterface6 = this.LIZ;
            if (sidecarInterface6 != null && (cls = sidecarInterface6.getClass()) != null && (method = cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class)) != null) {
                returnType = method.getReturnType();
            }
            if (!Intrinsics.LJFF(returnType, Void.TYPE)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ");
                sbLIZ4.append(returnType);
                throw new NoSuchMethodException(C2188811AlT.LIZIZ(sbLIZ4));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                if (((Integer) SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0])).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            sidecarDisplayFeature.setRect(sidecarDisplayFeature.getRect());
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            new SidecarWindowLayoutInfo();
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarWindowLayoutInfo windowLayoutInfo;
            SidecarInterface sidecarInterface;
            Collection<Activity> collectionValues = ((LinkedHashMap) SidecarCompat.this.LIZJ).values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : collectionValues) {
                IBinder iBinderLIZ = C12LG.LIZ(activity);
                if (iBinderLIZ != null && (sidecarInterface = sidecarCompat.LIZ) != null) {
                    windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinderLIZ);
                } else {
                    windowLayoutInfo = null;
                }
                C12LP c12lp = sidecarCompat.LJ;
                if (c12lp != null) {
                    c12lp.LIZ(activity, sidecarCompat.LIZIZ.LIZJ(windowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            Activity activity = (Activity) ((LinkedHashMap) SidecarCompat.this.LIZJ).get(iBinder);
            if (activity == null) {
                return;
            }
            SidecarCompat sidecarCompat = SidecarCompat.this;
            C12LR c12lr = sidecarCompat.LIZIZ;
            SidecarInterface sidecarInterface = sidecarCompat.LIZ;
            if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            C0N9B c0n9bLIZJ = c12lr.LIZJ(sidecarWindowLayoutInfo, sidecarDeviceState);
            C12LP c12lp = SidecarCompat.this.LJ;
            if (c12lp != null) {
                c12lp.LIZ(activity, c0n9bLIZJ);
            }
        }
    }

    public SidecarCompat(C19EG c19eg) {
        SidecarInterface sidecarInterfaceLIZIZ = C12LG.LIZIZ(c19eg);
        C12LR c12lr = new C12LR(0);
        this.LIZ = sidecarInterfaceLIZIZ;
        this.LIZIZ = c12lr;
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C12LN
    public final void LIZ(Activity activity) {
        boolean z;
        SidecarInterface sidecarInterface;
        IBinder iBinderLIZ = C12LG.LIZ(activity);
        if (iBinderLIZ == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.LIZ;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderLIZ);
        }
        C092O<Configuration> c092o = (C092O) ((LinkedHashMap) this.LIZLLL).get(activity);
        if (c092o != null) {
            if (activity instanceof InterfaceC19739612La) {
                ((InterfaceC19739612La) activity).removeOnConfigurationChangedListener(c092o);
            }
            this.LIZLLL.remove(activity);
        }
        C12LP c12lp = this.LJ;
        if (c12lp != null) {
            ReentrantLock reentrantLock = c12lp.LIZIZ;
            reentrantLock.lock();
            try {
                c12lp.LIZJ.put(activity, null);
                reentrantLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
        if (this.LIZJ.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LIZJ.remove(iBinderLIZ);
        if (z && (sidecarInterface = this.LIZ) != null) {
            sidecarInterface.onDeviceStateListenersChanged(true);
        }
    }

    @Override // X.C12LN
    public final void LIZIZ(final Activity activity) {
        IBinder iBinderLIZ = C12LG.LIZ(activity);
        if (iBinderLIZ != null) {
            LIZLLL(iBinderLIZ, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this, activity) { // from class: X.12LJ
                public final SidecarCompat LL;
                public final WeakReference<Activity> LLILLJJLI;

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    view.removeOnAttachStateChangeListener(this);
                    Activity activity2 = this.LLILLJJLI.get();
                    IBinder iBinderLIZ2 = C12LG.LIZ(activity2);
                    if (activity2 == null || iBinderLIZ2 == null) {
                        return;
                    }
                    this.LL.LIZLLL(iBinderLIZ2, activity2);
                }

                {
                    this.LL = this;
                    this.LLILLJJLI = new WeakReference<>(activity);
                }
            });
        }
    }

    public final C0N9B LIZJ(Activity activity) {
        SidecarWindowLayoutInfo windowLayoutInfo;
        SidecarDeviceState sidecarDeviceState;
        IBinder iBinderLIZ = C12LG.LIZ(activity);
        if (iBinderLIZ == null) {
            return new C0N9B(C13BV.INSTANCE);
        }
        SidecarInterface sidecarInterface = this.LIZ;
        if (sidecarInterface != null) {
            windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinderLIZ);
        } else {
            windowLayoutInfo = null;
        }
        C12LR c12lr = this.LIZIZ;
        SidecarInterface sidecarInterface2 = this.LIZ;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return c12lr.LIZJ(windowLayoutInfo, sidecarDeviceState);
    }

    public final void LJ(C12LL c12ll) {
        this.LJ = new C12LP(c12ll);
        SidecarInterface sidecarInterface = this.LIZ;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.LIZIZ, new TranslatingCallback()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        this.LIZJ.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.LIZ;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.LIZJ.size() == 1 && (sidecarInterface = this.LIZ) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C12LP c12lp = this.LJ;
        if (c12lp != null) {
            c12lp.LIZ(activity, LIZJ(activity));
        }
        if (((LinkedHashMap) this.LIZLLL).get(activity) == null && (activity instanceof InterfaceC19739612La)) {
            C092O<Configuration> c092o = new C092O() { // from class: X.12LY
                @Override // X.C092O
                public final void accept(Object obj) {
                    SidecarCompat sidecarCompat = this.LIZ;
                    Activity activity2 = activity;
                    C12LP c12lp2 = sidecarCompat.LJ;
                    if (c12lp2 != null) {
                        c12lp2.LIZ(activity2, sidecarCompat.LIZJ(activity2));
                    }
                }
            };
            this.LIZLLL.put(activity, c092o);
            ((InterfaceC19739612La) activity).addOnConfigurationChangedListener(c092o);
        }
    }
}

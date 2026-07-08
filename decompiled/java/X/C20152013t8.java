package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13t8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20152013t8 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(205));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));

    public C20152013t8(C20151413t2 c20151413t2) {
        C20152413tC.LIZ = c20151413t2;
        C1524605y0.LIZ().LIZ.LIZ = this;
        c20151413t2.LIZ.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.13t7
            public final /* synthetic */ Application.ActivityLifecycleCallbacks LL;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                this.LL.onActivityPaused(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                this.LL.onActivityResumed(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                this.LL.onActivitySaveInstanceState(activity, bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                this.LL.onActivityStarted(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                this.LL.onActivityStopped(activity);
            }

            {
                Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, new InvocationHandler() { // from class: X.13tE
                    @Override // java.lang.reflect.InvocationHandler
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
                        return Unit.LIZ;
                    }
                });
                if (objNewProxyInstance != null) {
                    this.LL = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
                    return;
                }
                throw new C2482109o3("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                C20152313tB c20152313tBLIZJ;
                Set<C20151613t4> set;
                C20152513tD c20152513tD = (C20152513tD) this.LLILLJJLI.LIZIZ.getValue();
                c20152513tD.getClass();
                String strLIZ = C1203000hPW.LIZ(activity.getIntent());
                if (strLIZ != null && (c20152313tBLIZJ = c20152513tD.LIZ.LIZJ(activity.getClass().getName())) != null && c20152313tBLIZJ.LIZIZ && (set = c20152513tD.LIZ.LIZIZ().get(c20152313tBLIZJ)) != null) {
                    for (C20151613t4 c20151613t4 : set) {
                        AbstractRunnableC20150813sw<?> abstractRunnableC20150813sw = c20151613t4.LIZ;
                        if (abstractRunnableC20150813sw != null && c20151613t4.LIZ(null, strLIZ)) {
                            abstractRunnableC20150813sw.onDetach();
                        }
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                final C20152513tD c20152513tD = (C20152513tD) this.LLILLJJLI.LIZIZ.getValue();
                C20152313tB c20152313tBLIZJ = c20152513tD.LIZ.LIZJ(activity.getClass().getName());
                if (c20152313tBLIZJ != null) {
                    if (c20152313tBLIZJ.LIZ && (activity instanceof C19EG)) {
                        ((C19EG) activity).getSupportFragmentManager().LJZL(new AbstractC813200VvC() { // from class: X.13t6
                            @Override // X.AbstractC813200VvC
                            public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                                Bundle arguments;
                                String strLIZIZ;
                                Set<C20151613t4> set;
                                C20152313tB c20152313tBLIZLLL = c20152513tD.LIZ.LIZLLL(fragment.getClass().getName());
                                if (c20152313tBLIZLLL != null && c20152313tBLIZLLL.LIZIZ && (arguments = fragment.getArguments()) != null && (strLIZIZ = C1203000hPW.LIZIZ(arguments)) != null && (set = c20152513tD.LIZ.LIZIZ().get(c20152313tBLIZLLL)) != null) {
                                    for (C20151613t4 c20151613t4 : set) {
                                        AbstractRunnableC20150813sw<?> abstractRunnableC20150813sw = c20151613t4.LIZ;
                                        if (abstractRunnableC20150813sw != null && c20151613t4.LIZ(null, strLIZIZ)) {
                                            abstractRunnableC20150813sw.onDetach();
                                        }
                                    }
                                }
                            }

                            @Override // X.AbstractC813200VvC
                            public final void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle2) {
                                Bundle arguments;
                                String strLIZIZ;
                                C20152313tB c20152313tBLIZLLL = c20152513tD.LIZ.LIZLLL(fragment.getClass().getName());
                                if (c20152313tBLIZLLL != null && c20152313tBLIZLLL.LIZ && (arguments = fragment.getArguments()) != null && (strLIZIZ = C1203000hPW.LIZIZ(arguments)) != null) {
                                    c20152313tBLIZLLL.LIZIZ = true;
                                    Set<C20151613t4> set = c20152513tD.LIZ.LIZIZ().get(c20152313tBLIZLLL);
                                    if (set != null) {
                                        for (C20151613t4 c20151613t4 : set) {
                                            AbstractRunnableC20150813sw<?> abstractRunnableC20150813sw = c20151613t4.LIZ;
                                            if (abstractRunnableC20150813sw != null && c20151613t4.LIZ(null, strLIZIZ)) {
                                                C19EG activity2 = fragment.getActivity();
                                                C1555660qaK c1555660qaK = abstractRunnableC20150813sw.LL;
                                                InterfaceC2217461Bqa[] interfaceC2217461BqaArr = AbstractRunnableC20150813sw.LLIZ;
                                                c1555660qaK.getClass();
                                                c1555660qaK.LIZ = new WeakReference<>(activity2);
                                                C1555660qaK c1555660qaK2 = abstractRunnableC20150813sw.LLILLJJLI;
                                                c1555660qaK2.getClass();
                                                c1555660qaK2.LIZ = new WeakReference<>(fragment);
                                                abstractRunnableC20150813sw.LIZ(bundle2);
                                            }
                                        }
                                    }
                                }
                            }
                        }, false);
                    }
                    String strLIZ = C1203000hPW.LIZ(activity.getIntent());
                    if (strLIZ != null && !c20152313tBLIZJ.LIZ) {
                        c20152313tBLIZJ.LIZIZ = true;
                        Set<C20151613t4> set = c20152513tD.LIZ.LIZIZ().get(c20152313tBLIZJ);
                        if (set != null) {
                            for (C20151613t4 c20151613t4 : set) {
                                AbstractRunnableC20150813sw<?> abstractRunnableC20150813sw = c20151613t4.LIZ;
                                if (abstractRunnableC20150813sw != null && c20151613t4.LIZ(null, strLIZ)) {
                                    C1555660qaK c1555660qaK = abstractRunnableC20150813sw.LL;
                                    InterfaceC2217461Bqa[] interfaceC2217461BqaArr = AbstractRunnableC20150813sw.LLIZ;
                                    c1555660qaK.getClass();
                                    c1555660qaK.LIZ = new WeakReference<>(activity);
                                    abstractRunnableC20150813sw.LIZ(bundle);
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    public final void LIZIZ(C20152313tB c20152313tB, Bundle bundle) {
        ArrayList<InterfaceC20153313tL> arrayList;
        String strLIZIZ;
        if (c20152313tB.LJI != null) {
            c20152313tB.LIZ = true;
        }
        List<String> list = c20152313tB.LIZLLL;
        if (list.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Class.forName(it2.next()).newInstance());
            }
        }
        c20152313tB.LIZJ = arrayList;
        if (arrayList != null) {
            for (InterfaceC20153313tL interfaceC20153313tL : arrayList) {
                if (interfaceC20153313tL.enable(bundle)) {
                    AbstractRunnableC20150813sw<InterfaceC20153313tL> abstractRunnableC20150813swLIZ = C20152413tC.LIZ.LIZJ.LIZ(interfaceC20153313tL, c20152313tB, bundle);
                    if (abstractRunnableC20150813swLIZ != null) {
                        C1555660qaK c1555660qaK = abstractRunnableC20150813swLIZ.LLILLL;
                        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = AbstractRunnableC20150813sw.LLIZ;
                        c1555660qaK.getClass();
                        c1555660qaK.LIZ = new WeakReference<>(null);
                    }
                    C20151713t5 c20151713t5 = (C20151713t5) this.LIZ.getValue();
                    if (abstractRunnableC20150813swLIZ == null) {
                        Intrinsics.LJIIL();
                    }
                    if (bundle != null) {
                        strLIZIZ = C1203000hPW.LIZIZ(bundle);
                    } else {
                        strLIZIZ = null;
                    }
                    c20151713t5.LIZ(c20152313tB, interfaceC20153313tL, abstractRunnableC20150813swLIZ, strLIZIZ, false);
                }
            }
        }
    }

    public final void LIZ(InterfaceC20153313tL interfaceC20153313tL, Bundle bundle, InterfaceC1726310v1Z interfaceC1726310v1Z, boolean z) {
        C13BV c13bv = C13BV.INSTANCE;
        String strLIZIZ = null;
        C20152313tB c20152313tB = new C20152313tB(c13bv, c13bv, null, null);
        c20152313tB.LIZJ = Collections.singletonList(interfaceC20153313tL);
        if (!interfaceC20153313tL.enable(bundle)) {
            return;
        }
        AbstractRunnableC20150813sw<InterfaceC20153313tL> abstractRunnableC20150813swLIZ = C20152413tC.LIZ.LIZJ.LIZ(interfaceC20153313tL, c20152313tB, bundle);
        if (abstractRunnableC20150813swLIZ != null) {
            C1555660qaK c1555660qaK = abstractRunnableC20150813swLIZ.LLILLL;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = AbstractRunnableC20150813sw.LLIZ;
            c1555660qaK.getClass();
            c1555660qaK.LIZ = new WeakReference<>(interfaceC1726310v1Z);
        }
        C20151713t5 c20151713t5 = (C20151713t5) this.LIZ.getValue();
        if (abstractRunnableC20150813swLIZ == null) {
            Intrinsics.LJIIL();
        }
        if (bundle != null) {
            strLIZIZ = C1203000hPW.LIZIZ(bundle);
        }
        c20151713t5.LIZ(c20152313tB, interfaceC20153313tL, abstractRunnableC20150813swLIZ, strLIZIZ, z);
    }
}

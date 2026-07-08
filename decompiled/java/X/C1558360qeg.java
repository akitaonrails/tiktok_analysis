package X;

import X.C1561190qjF;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AwS13S1100100_11;
import kotlin.jvm.internal.AwS3S1210100_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qeg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558360qeg {
    public static final Lifecycle.State LIZ(Lifecycle lifecycle) {
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            return lifecycle.getCurrentState();
        }
        return null;
    }

    @InterfaceC1294060jmO
    public static final void LIZIZ(final Fragment fragment, String str) {
        Executor executor = C1557550qdN.LIZIZ;
        if (executor != null) {
            C1558390qej c1558390qej = new C1558390qej(fragment, str);
            executor.execute(c1558390qej);
            C1561190qjF.LIZ.put(fragment, c1558390qej);
            fragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.provider.preload.PreLoader$preVScope$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1561190qjF.LIZ.remove(fragment);
                    }
                }
            });
        }
    }

    public static final synchronized InterfaceC665370Q7z LJ(View view, String str) {
        InterfaceC665370Q7z interfaceC665370Q7zLIZLLL;
        interfaceC665370Q7zLIZLLL = LIZLLL(view, str, null, new C1558410qel(false));
        if (interfaceC665370Q7zLIZLLL == null) {
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
        return interfaceC665370Q7zLIZLLL;
    }

    public static final InterfaceC665370Q7z LJFF(Fragment fragment, String str) {
        InterfaceC665370Q7z interfaceC665370Q7zWQ2;
        if (fragment.getFragmentManager() != null && fragment.getContext() != null) {
            String strValueOf = String.valueOf(fragment.hashCode());
            C1561870qkL c1561870qkL = C1561870qkL.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                if (arrayList.size() > 0) {
                    Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().onEventBegin(c1561870qkL);
                    }
                }
                if (C725480Sd0.LIZ(c1561870qkL)) {
                    C725430Scv.LIZ(new AwS13S1100100_11(c1561870qkL, strValueOf, SystemClock.elapsedRealtimeNanos(), 26));
                }
            }
            InterfaceC665370Q7z interfaceC665370Q7zLIZ = C665430Q8f.LIZ(String.valueOf(fragment.hashCode()));
            if (interfaceC665370Q7zLIZ != null) {
                C1561870qkL c1561870qkL2 = C1561870qkL.LIZ;
                if (C725450Scx.LIZJ) {
                    ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                    if (arrayList2.size() > 0) {
                        Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            it3.next().onEventEnd(c1561870qkL2);
                        }
                    }
                    if (C725480Sd0.LIZ(c1561870qkL2)) {
                        C725430Scv.LIZ(new AwS3S1210100_24(c1561870qkL2, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), fragment, 1));
                    }
                }
                return interfaceC665370Q7zLIZ;
            }
            ScopeViewModel scopeViewModel = (ScopeViewModel) new ViewModelProvider(fragment).get(ScopeViewModel.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fragment_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1558380qei c1558380qei = new C1558380qei(fragment, str);
            synchronized (scopeViewModel) {
                try {
                    interfaceC665370Q7zWQ2 = scopeViewModel.wQ2(strLIZIZ, c1558380qei);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1555400qZu c1555400qZu = (C1555400qZu) interfaceC665370Q7zWQ2;
            C1555590qaD c1555590qaD = c1555400qZu.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1555400qZu.LLILZLL;
            c1555590qaD.getClass();
            c1555590qaD.LIZ = new WeakReference<>(fragment);
            Lifecycle.State stateLIZ = LIZ(fragment.getLifecycle());
            if (stateLIZ != null && stateLIZ != Lifecycle.State.DESTROYED) {
                C665430Q8f.LIZIZ(String.valueOf(fragment.hashCode()), c1555400qZu, fragment);
            }
            C1561870qkL c1561870qkL3 = C1561870qkL.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList3 = C725430Scv.LIZIZ;
                if (arrayList3.size() > 0) {
                    Iterator<InterfaceC725440Scw> it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        it4.next().onEventEnd(c1561870qkL3);
                    }
                }
                if (C725480Sd0.LIZ(c1561870qkL3)) {
                    C725430Scv.LIZ(new AwS3S1210100_24(c1561870qkL3, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), fragment, 0));
                }
            }
            return c1555400qZu;
        }
        return new C1555360qZq(fragment);
    }

    public static final InterfaceC665370Q7z LJI(C19EG c19eg, String str) {
        synchronized (c19eg) {
            try {
                String strValueOf = String.valueOf(c19eg.hashCode());
                C1561870qkL c1561870qkL = C1561870qkL.LIZ;
                if (C725450Scx.LIZJ) {
                    ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                    if (arrayList.size() > 0) {
                        Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            it2.next().onEventBegin(c1561870qkL);
                        }
                    }
                    if (C725480Sd0.LIZ(c1561870qkL)) {
                        C725430Scv.LIZ(new AwS13S1100100_11(c1561870qkL, strValueOf, SystemClock.elapsedRealtimeNanos(), 27));
                    }
                }
                InterfaceC665370Q7z interfaceC665370Q7zLIZ = C665430Q8f.LIZ(String.valueOf(c19eg.hashCode()));
                if (interfaceC665370Q7zLIZ != null) {
                    C1561870qkL c1561870qkL2 = C1561870qkL.LIZ;
                    if (C725450Scx.LIZJ) {
                        ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                        if (arrayList2.size() > 0) {
                            Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                it3.next().onEventEnd(c1561870qkL2);
                            }
                        }
                        if (C725480Sd0.LIZ(c1561870qkL2)) {
                            C725430Scv.LIZ(new AwS3S1210100_24(c1561870qkL2, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), c19eg, 3));
                        }
                    }
                    return interfaceC665370Q7zLIZ;
                }
                if (C1557550qdN.LJI) {
                    C1555410qZv c1555410qZv = (C1555410qZv) C1563370qml.LIZ(c19eg, EnumC682280QpW.MAIN, new C1558300qea(c19eg, str));
                    if (c1555410qZv != null) {
                        C1561870qkL c1561870qkL3 = C1561870qkL.LIZ;
                        if (C725450Scx.LIZJ) {
                            ArrayList<InterfaceC725440Scw> arrayList3 = C725430Scv.LIZIZ;
                            if (arrayList3.size() > 0) {
                                Iterator<InterfaceC725440Scw> it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    it4.next().onEventEnd(c1561870qkL3);
                                }
                            }
                            if (C725480Sd0.LIZ(c1561870qkL3)) {
                                C725430Scv.LIZ(new AwS3S1210100_24(c1561870qkL3, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), c19eg, 4));
                            }
                        }
                        return c1555410qZv;
                    }
                }
                ScopeViewModel scopeViewModel = (ScopeViewModel) new ViewModelProvider(c19eg).get(ScopeViewModel.class);
                C1555410qZv c1555410qZv2 = (C1555410qZv) scopeViewModel.wQ2(C1558290qeZ.LIZ(str), new C1558370qeh(c19eg, str));
                C1555590qaD c1555590qaD = c1555410qZv2.LLILZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1555410qZv.LLILZLL;
                c1555590qaD.getClass();
                c1555590qaD.LIZ = new WeakReference<>(c19eg);
                C1563370qml.LIZ(c19eg, EnumC682280QpW.MAIN, new C1558310qeb(c19eg, c1555410qZv2));
                C1557550qdN.LIZ("vprovider_vscope", new C1554700qYm(c1555410qZv2, scopeViewModel));
                C1561870qkL c1561870qkL4 = C1561870qkL.LIZ;
                if (C725450Scx.LIZJ) {
                    ArrayList<InterfaceC725440Scw> arrayList4 = C725430Scv.LIZIZ;
                    if (arrayList4.size() > 0) {
                        Iterator<InterfaceC725440Scw> it5 = arrayList4.iterator();
                        while (it5.hasNext()) {
                            it5.next().onEventEnd(c1561870qkL4);
                        }
                    }
                    if (C725480Sd0.LIZ(c1561870qkL4)) {
                        C725430Scv.LIZ(new AwS3S1210100_24(c1561870qkL4, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), c19eg, 2));
                    }
                }
                return c1555410qZv2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final synchronized InterfaceC665370Q7z LJII(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, InterfaceC1558400qek interfaceC1558400qek) {
        InterfaceC665370Q7z interfaceC665370Q7zLIZLLL;
        interfaceC665370Q7zLIZLLL = LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, "ttls_tracker", interfaceC1558400qek, new C1558410qel(false));
        if (interfaceC665370Q7zLIZLLL == null) {
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
        return interfaceC665370Q7zLIZLLL;
    }

    public static final InterfaceC665370Q7z LJIIJJI(Fragment fragment, String str) {
        ScopeViewModel scopeViewModel = (ScopeViewModel) new ViewModelProvider(fragment).get(ScopeViewModel.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fragment_");
        sbLIZ.append(str);
        return scopeViewModel.vQ2(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[LOOP:0: B:6:0x000c->B:21:0x003b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042 A[EDGE_INSN: B:32:0x0042->B:24:0x0042 BREAK  A[LOOP:0: B:6:0x000c->B:21:0x003b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC665370Q7z LIZJ(android.view.View r5, java.lang.String r6, int r7) {
        /*
            r0 = r7 & 1
            r4 = 0
            if (r0 == 0) goto L6
            r6 = r4
        L6:
            androidx.fragment.app.Fragment r3 = X.C946803n0.LIZ(r5)
            r1 = r5
            r2 = r4
        Lc:
            if (r1 == 0) goto L42
            if (r2 != 0) goto L6c
            android.view.ViewParent r2 = r1.getParent()
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L40
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L40
            r0 = 2
            X.0Q7z r2 = LJIIL(r2, r6, r0)
            if (r2 != 0) goto L33
        L23:
            if (r3 == 0) goto L3e
            android.view.View r0 = r3.getView()
        L29:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L33
            X.0Q7z r2 = LJIIJJI(r3, r6)
        L33:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L42
            android.view.View r1 = (android.view.View) r1
            goto Lc
        L3e:
            r0 = r4
            goto L29
        L40:
            r2 = r4
            goto L23
        L42:
            if (r2 != 0) goto L6c
            X.19EG r0 = X.C665410Q8d.LIZ(r5)
            if (r0 == 0) goto L6b
            androidx.lifecycle.ViewModelProvider r1 = new androidx.lifecycle.ViewModelProvider
            r1.<init>(r0)
            java.lang.Class<com.bytedance.provider.vm.ScopeViewModel> r0 = com.bytedance.provider.vm.ScopeViewModel.class
            androidx.lifecycle.ViewModel r2 = r1.get(r0)
            com.bytedance.provider.vm.ScopeViewModel r2 = (com.bytedance.provider.vm.ScopeViewModel) r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "activity_"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.0Q7z r4 = r2.vQ2(r0)
        L6b:
            return r4
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1558360qeg.LIZJ(android.view.View, java.lang.String, int):X.0Q7z");
    }

    public static InterfaceC665370Q7z LJIIL(View view, String str, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        return LIZLLL(view, str, null, new C1558410qel(true));
    }

    public static final InterfaceC665370Q7z LIZLLL(View view, String str, InterfaceC1558400qek interfaceC1558400qek, C1558410qel c1558410qel) {
        ViewModelStoreOwner viewModelStoreOwnerLIZ;
        LifecycleOwner lifecycleOwner;
        InterfaceC665370Q7z interfaceC665370Q7zWQ2;
        InterfaceC665370Q7z interfaceC665370Q7zVQ2;
        String strValueOf = String.valueOf(view.hashCode());
        C1561870qkL c1561870qkL = C1561870qkL.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c1561870qkL);
                }
            }
            if (C725480Sd0.LIZ(c1561870qkL)) {
                C725430Scv.LIZ(new C1558540qey(c1561870qkL, strValueOf, SystemClock.elapsedRealtimeNanos()));
            }
        }
        if ((interfaceC1558400qek == null || (viewModelStoreOwnerLIZ = interfaceC1558400qek.LLIIIILZ()) == null) && (viewModelStoreOwnerLIZ = C946803n0.LIZ(view)) == null && (viewModelStoreOwnerLIZ = C665410Q8d.LIZ(view)) == null) {
            if (c1558410qel.LIZ) {
                return null;
            }
            throw new RuntimeException("view not attach to a fragment or activity");
        }
        if (C1557550qdN.LIZ && (viewModelStoreOwnerLIZ instanceof Fragment) && ((Fragment) viewModelStoreOwnerLIZ).getFragmentManager() == null) {
            if (c1558410qel.LIZ) {
                return null;
            }
            return new C1555360qZq(viewModelStoreOwnerLIZ);
        }
        if (interfaceC1558400qek == null || (lifecycleOwner = interfaceC1558400qek.getLifecycleOwner()) == null) {
            lifecycleOwner = (LifecycleOwner) viewModelStoreOwnerLIZ;
        }
        ScopeViewModel scopeViewModel = (ScopeViewModel) new ViewModelProvider(viewModelStoreOwnerLIZ).get(ScopeViewModel.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("view_");
        sbLIZ.append(view.hashCode());
        sbLIZ.append('_');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (c1558410qel.LIZ) {
            interfaceC665370Q7zVQ2 = scopeViewModel.vQ2(strLIZIZ);
        } else {
            C1555520qa6 c1555520qa6 = new C1555520qa6(view, lifecycleOwner);
            synchronized (scopeViewModel) {
                try {
                    interfaceC665370Q7zWQ2 = scopeViewModel.wQ2(strLIZIZ, c1555520qa6);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1555440qZy c1555440qZy = (C1555440qZy) interfaceC665370Q7zWQ2;
            C1555590qaD c1555590qaD = c1555440qZy.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1555440qZy.LLILZLL;
            c1555590qaD.getClass();
            c1555590qaD.LIZ = new WeakReference<>(view);
            interfaceC665370Q7zVQ2 = c1555440qZy;
        }
        C1561870qkL c1561870qkL2 = C1561870qkL.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c1561870qkL2);
                }
            }
            if (C725480Sd0.LIZ(c1561870qkL2)) {
                C725430Scv.LIZ(new C1558570qf1(c1561870qkL2, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), view));
            }
        }
        return interfaceC665370Q7zVQ2;
    }
}

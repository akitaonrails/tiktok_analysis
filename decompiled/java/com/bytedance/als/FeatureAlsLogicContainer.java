package com.bytedance.als;

import X.AbstractC1664510tPt;
import X.AbstractC20611515l3;
import X.AbstractC2255721DQs;
import X.AbstractC2255761DQw;
import X.C05YF;
import X.C0F1T;
import X.C0F1U;
import X.C0LEK;
import X.C1287930jcV;
import X.C13LP;
import X.C15O0;
import X.C1647230sy1;
import X.C1659720tIA;
import X.C1664660tQ8;
import X.C19466011Du;
import X.C1DR5;
import X.C1DR7;
import X.C1DR8;
import X.C1DR9;
import X.C1DRF;
import X.C1DRG;
import X.C2097608Jq;
import X.C21308518aB;
import X.C2188811AlT;
import X.C385670FAf;
import X.EnumC1642750sqn;
import X.EnumC371580EhY;
import X.InterfaceC1441305kZ;
import X.InterfaceC1664530tPv;
import X.InterfaceC2255741DQu;
import X.InterfaceC2255791DQz;
import X.InterfaceC540980LJo;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.als.ui.UIPanelComponent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import ge.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import jg5.AvS540S0100000_8;
import jg5.AvS544S0100000_32;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class FeatureAlsLogicContainer extends C0LEK implements GenericLifecycleObserver {
    public final String LL;
    public final ApiCenter LLILLJJLI;
    public final C1DRG LLILLL;
    public final C1647230sy1 LLILZ;
    public final StackTraceElement[] LLILZIL;
    public final Lifecycle LLILZLL;
    public final List<C1DR5> LLIZ = new ArrayList();
    public final ArrayList<AbstractC2255721DQs<?>> LLIZLLLIL;
    public final List<AbstractC2255721DQs<?>> LLJ;
    public final C1DR8 LLJI;
    public final LifecycleRegistry LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final C1DR7 LLJILLL;
    public final C1DRF LLJJ;
    public C1DRG LLJJI;
    public final ArrayList<Runnable> LLJJIII;
    public final HashMap<String, C1DR7> LLJJIJI;
    public final HashMap<String, C1DRF> LLJJIJIIJIL;
    public final HashMap<String, C1DRG> LLJJIJIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onActivityCreated();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroyView();
        }
    }

    public final void LJIIJJI() {
        List<C1DR5> list = this.LLIZ;
        ArrayList<C1DR5> arrayList = new ArrayList();
        for (C1DR5 c1dr5 : list) {
            if (c1dr5.LJ == EnumC1642750sqn.IMMEDIATE) {
                arrayList.add(c1dr5);
            }
        }
        if (!arrayList.isEmpty()) {
            for (C1DR5 c1dr52 : arrayList) {
                AbstractC2255721DQs<?> abstractC2255721DQs = null;
                if (c1dr52.LIZ == null) {
                    C1DRG c1drg = this.LLJJI;
                    if (c1drg != null) {
                        abstractC2255721DQs = (AbstractC2255721DQs) c1drg.LJII(c1dr52.LIZIZ, null);
                    }
                } else if (C0F1T.class.isAssignableFrom(c1dr52.LIZJ)) {
                    C1DRG c1drg2 = this.LLJJI;
                    if (c1drg2 != null) {
                        abstractC2255721DQs = (AbstractC2255721DQs) c1drg2.LJII(c1dr52.LIZIZ, null);
                    }
                } else {
                    C1DRG c1drg3 = this.LLJJIJIL.get(c1dr52.LIZ);
                    if (c1drg3 != null) {
                        abstractC2255721DQs = (AbstractC2255721DQs) c1drg3.LJII(c1dr52.LIZIZ, null);
                    }
                }
                LJIIIIZZ(abstractC2255721DQs, c1dr52);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onActivityCreated() {
        if (!this.LLJILJIL && this.LLILZ.LIZ) {
            LJIIJJI();
        }
        this.LLJILJIL = true;
        Iterator it2 = C13LP.LLIIII(this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            LJIIL((AbstractC2255721DQs) it2.next(), Lifecycle.State.CREATED);
        }
        if (this.LLJI.LL.LLJIJIL.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            return;
        }
        this.LLJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroyView() {
        HashMap map = new HashMap();
        for (AbstractC2255721DQs<?> abstractC2255721DQs : C13LP.LLIIII(this.LLIZLLLIL)) {
            LJIIL(abstractC2255721DQs, Lifecycle.State.DESTROYED);
            map.put(abstractC2255721DQs.getClass(), C2097608Jq.LJIIZILJ(abstractC2255721DQs.performanceMonitorCalculate.LIZIZ));
        }
        this.LLILZLL.removeObserver(this);
        this.LLJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        Iterator it2 = C13LP.LLIIII(this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            LJIIL((AbstractC2255721DQs) it2.next(), Lifecycle.State.STARTED);
        }
        this.LLJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        Iterator it2 = C13LP.LLIIII(this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            LJIIL((AbstractC2255721DQs) it2.next(), Lifecycle.State.RESUMED);
        }
        this.LLJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        Iterator it2 = C13LP.LLIIII(this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            LJIIL((AbstractC2255721DQs) it2.next(), Lifecycle.State.STARTED);
        }
        this.LLJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        Iterator it2 = C13LP.LLIIII(this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            LJIIL((AbstractC2255721DQs) it2.next(), Lifecycle.State.CREATED);
        }
        this.LLJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // X.C0LEK
    public final void LJII() {
        final C1DRG c1drg;
        AbstractC2255721DQs<?> abstractC2255721DQsLIZIZ;
        C1659720tIA.LIZ();
        if (this.LLILZLL.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            this.LLJILJIL = true;
        }
        this.LLJJ.LJ(InterfaceC2255741DQu.class, null, this.LLJILLL.LJ);
        C1DRF c1drf = this.LLJJ;
        c1drf.LJIIJ = this.LLILZ.LIZJ;
        C1DRG c1drgLIZIZ = c1drf.LIZIZ();
        c1drgLIZIZ.LIZ.LIZJ(this.LLILZIL);
        this.LLJJI = c1drgLIZIZ;
        Iterator<Runnable> it2 = this.LLJJIII.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        this.LLJJIII.clear();
        for (Map.Entry<String, C1DRF> entry : this.LLJJIJIIJIL.entrySet()) {
            entry.getValue().LJ(InterfaceC2255741DQu.class, null, this.LLJJIJI.get(entry.getKey()).LJ);
        }
        for (Map.Entry<String, C1DRF> entry2 : this.LLJJIJIIJIL.entrySet()) {
            this.LLJJIJIL.put(entry2.getKey(), entry2.getValue().LIZIZ());
        }
        List<C1DR5> list = this.LLIZ;
        ArrayList<C1DR5> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            EnumC1642750sqn enumC1642750sqn = ((C1DR5) obj).LJ;
            if (enumC1642750sqn == EnumC1642750sqn.LAZY || enumC1642750sqn == EnumC1642750sqn.FORCE_LAZY) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            if (!this.LLJI.LL.LLJIJIL.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                this.LLJIJIL.handleLifecycleEvent(Lifecycle.Event.ON_START);
            }
            for (final C1DR5 c1dr5 : arrayList) {
                final Class<AbstractC2255721DQs<?>> cls = c1dr5.LIZIZ;
                if (c1dr5.LIZ == null) {
                    c1drg = this.LLJJI;
                    if (c1drg == null) {
                        throw new IllegalStateException("ALS container not started");
                    }
                } else if (C0F1T.class.isAssignableFrom(c1dr5.LIZJ)) {
                    c1drg = this.LLJJI;
                    if (c1drg == null) {
                        throw new IllegalStateException("ALS container not started");
                    }
                } else {
                    c1drg = this.LLJJIJIL.get(c1dr5.LIZ);
                    if (c1drg == null) {
                        throw new IllegalStateException("ALS container not started");
                    }
                }
                c1drg.LJIILJJIL(new C1287930jcV(null, cls), new AbstractC2255761DQw<AbstractC2255721DQs<?>>() { // from class: X.1DR2
                    @Override // X.AbstractC2255761DQw
                    public final void LIZIZ(Object obj2, boolean z) {
                        AbstractC2255721DQs<?> abstractC2255721DQs = (AbstractC2255721DQs) obj2;
                        C1DRG c1drg2 = c1drg;
                        Class<AbstractC2255721DQs<?>> cls2 = cls;
                        c1drg2.getClass();
                        c1drg2.LJIILLIIL(new C1287930jcV(null, cls2), this);
                        if (c1dr5.LJ == EnumC1642750sqn.FORCE_LAZY) {
                            FeatureAlsLogicContainer featureAlsLogicContainer = this;
                            if (featureAlsLogicContainer.LLJILJIL) {
                                if (featureAlsLogicContainer.LLJILJILJ) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(cls.getName());
                                    sbLIZ.append(" is registered with AttachOption.FORCE_LAZY, it can not be created in ");
                                    sbLIZ.append(this.LL);
                                    sbLIZ.append(" lifecycle method");
                                    final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    throw new RuntimeException(strLIZIZ) { // from class: X.1DRB
                                    };
                                }
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(cls.getName());
                                sbLIZ2.append(" is registered with AttachOption.FORCE_LAZY, it can not be created before ");
                                sbLIZ2.append(this.LL);
                                sbLIZ2.append(" lifecycle method");
                                final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                throw new RuntimeException(strLIZIZ2) { // from class: X.1DRA
                                };
                            }
                        }
                        if (this.LLILZ.LIZIZ) {
                            Class<AbstractC2255721DQs<?>> cls3 = cls;
                            boolean z2 = false;
                            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "start_shoot_disable_unuse_watch_exp", true) <= 0) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Lazy component ");
                                sbLIZ3.append(cls3.getName());
                                sbLIZ3.append(" is created by following stack trace: \n");
                                C2188811AlT.LIZIZ(sbLIZ3);
                                StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
                                int length = stackTrace.length;
                                int i = 5;
                                for (int i2 = 3; i2 < length; i2++) {
                                    StackTraceElement stackTraceElement = stackTrace[i2];
                                    if (Intrinsics.LJFF(stackTraceElement.getClassName(), AbstractC1664760tQI.class.getName())) {
                                        z2 = true;
                                    } else if (z2 && i > 0) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("\tat ");
                                        sbLIZ4.append(stackTraceElement.getClassName());
                                        sbLIZ4.append('.');
                                        sbLIZ4.append(stackTraceElement.getMethodName());
                                        sbLIZ4.append('(');
                                        sbLIZ4.append(stackTraceElement.getFileName());
                                        sbLIZ4.append(':');
                                        sbLIZ4.append(stackTraceElement.getLineNumber());
                                        sbLIZ4.append(")\n");
                                        C2188811AlT.LIZIZ(sbLIZ4);
                                        i--;
                                        if (i == 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (this.LLILZLL.getCurrentState() != Lifecycle.State.DESTROYED) {
                            this.LJIIIIZZ(abstractC2255721DQs, c1dr5);
                            return;
                        }
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(cls.getName());
                        sbLIZ5.append(" is registered with AttachOption.LAZY or AttachOption.FORCE_LAZY, it can not be created after ");
                        sbLIZ5.append(this.LL);
                        sbLIZ5.append(" lifecycle onDestroy");
                        final String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                        throw new RuntimeException(strLIZIZ3) { // from class: X.1DRC
                        };
                    }
                });
                final InterfaceC540980LJo<Boolean> interfaceC540980LJo = c1dr5.LJFF;
                if (interfaceC540980LJo != null) {
                    Class<? extends C05YF> cls2 = c1dr5.LIZJ;
                    if (!c1drg.LIZJ(cls2) || (abstractC2255721DQsLIZIZ = ((InterfaceC2255741DQu) c1drg.LJII(InterfaceC2255741DQu.class, null)).LIZIZ(cls2)) == null || abstractC2255721DQsLIZIZ.getApiComponent() == null) {
                        interfaceC540980LJo.LIZ(this.LLJI, new InterfaceC1441305kZ<Boolean>() { // from class: X.1DR6
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj2) {
                                if (((Boolean) obj2).booleanValue()) {
                                    FeatureAlsLogicContainer featureAlsLogicContainer = this.LL;
                                    C1DRG c1drg2 = c1drg;
                                    C1DR5 c1dr52 = c1dr5;
                                    featureAlsLogicContainer.getClass();
                                    if (c1drg2 != null) {
                                        if (Intrinsics.LJFF(c1dr52.LIZJ, C05YF.class)) {
                                            c1drg2.LJI(c1dr52.LIZIZ);
                                        } else {
                                            c1drg2.LJI(c1dr52.LIZJ);
                                        }
                                        interfaceC540980LJo.LIZIZ(this);
                                        return;
                                    }
                                    final String str = "componentsInitTiming triggered but alsLogicContainer not stated";
                                    throw new RuntimeException(str) { // from class: X.1DRE
                                    };
                                }
                            }
                        });
                    }
                }
            }
        }
        if (this.LLJILJIL || !this.LLILZ.LIZ) {
            LJIIJJI();
        }
    }

    @Override // X.C0LEK
    public final List<AbstractC2255721DQs<?>> LJ() {
        return this.LLJ;
    }

    @Override // X.C0LEK
    public final C1DRG LJFF() {
        return this.LLJJI;
    }

    @Override // X.C0LEK
    public final C1DRF LJI() {
        return this.LLJJ;
    }

    @Override // X.C0LEK
    public final <T extends C05YF> T LIZLLL(Class<T> cls) {
        C1DRG c1drg = this.LLJJI;
        if (c1drg != null) {
            if (!c1drg.LIZJ(cls)) {
                return null;
            }
            return (T) this.LLJILLL.LJ.LIZIZ(cls);
        }
        throw new IllegalStateException("ALS container not started");
    }

    public final void LJIIIIZZ(AbstractC2255721DQs<?> abstractC2255721DQs, C1DR5 c1dr5) {
        if (abstractC2255721DQs == null) {
            return;
        }
        if (abstractC2255721DQs instanceof i) {
            i iVar = (i) abstractC2255721DQs;
            iVar.z4(c1dr5.LJI);
            iVar.LLILZIL = c1dr5.LJII;
            iVar.e4(c1dr5.LJIIIIZZ);
        } else if (abstractC2255721DQs instanceof UIPanelComponent) {
            UIPanelComponent uIPanelComponent = (UIPanelComponent) abstractC2255721DQs;
            uIPanelComponent.Q3(c1dr5.LJI);
            uIPanelComponent.O3(c1dr5.LJIIIIZZ);
        } else if (abstractC2255721DQs instanceof AbstractC1664510tPt) {
            AbstractC1664510tPt abstractC1664510tPt = (AbstractC1664510tPt) abstractC2255721DQs;
            abstractC1664510tPt.LLILZIL = c1dr5.LJII;
            abstractC1664510tPt.Q3(c1dr5.LJIIIIZZ);
        }
        InterfaceC2255791DQz interfaceC2255791DQz = null;
        if (c1dr5.LIZ == null) {
            LJIILJJIL(abstractC2255721DQs, c1dr5, this.LLJILLL);
            C1DRG c1drg = this.LLJJI;
            if (c1drg != null) {
                interfaceC2255791DQz = c1drg.LIZ;
            }
            abstractC2255721DQs.registeredObjectContainerName = interfaceC2255791DQz;
        } else if (C0F1T.class.isAssignableFrom(c1dr5.LIZJ)) {
            LJIILJJIL(abstractC2255721DQs, c1dr5, this.LLJILLL);
            C1DRG c1drg2 = this.LLJJI;
            if (c1drg2 != null) {
                interfaceC2255791DQz = c1drg2.LIZ;
            }
            abstractC2255721DQs.registeredObjectContainerName = interfaceC2255791DQz;
            abstractC2255721DQs.featureName = c1dr5.LIZ;
        } else {
            LJIILJJIL(abstractC2255721DQs, c1dr5, this.LLJJIJI.get(c1dr5.LIZ));
            C1DRG c1drg3 = this.LLJJIJIL.get(c1dr5.LIZ);
            if (c1drg3 != null) {
                interfaceC2255791DQz = c1drg3.LIZ;
            }
            abstractC2255721DQs.registeredObjectContainerName = interfaceC2255791DQz;
            abstractC2255721DQs.hostFeatureName = c1dr5.LIZ;
        }
        C1659720tIA.LIZ();
        if (this.LLILZLL.getCurrentState() != Lifecycle.State.DESTROYED) {
            if (!this.LLIZLLLIL.contains(abstractC2255721DQs)) {
                this.LLIZLLLIL.add(abstractC2255721DQs);
                if (!Intrinsics.LJFF(abstractC2255721DQs.getApiComponent(), C05YF.class) && !(abstractC2255721DQs.getApiComponent() instanceof C0F1U) && !(abstractC2255721DQs instanceof InterfaceC1664530tPv)) {
                    ApiCenter apiCenter = this.LLILLJJLI;
                    C05YF apiComponent = abstractC2255721DQs.getApiComponent();
                    if (!apiCenter.LIZJ) {
                        Class<?> cls = apiComponent.getClass();
                        if (!Intrinsics.LJFF(cls, C05YF.class)) {
                            for (Class cls2 : ((HashMap) apiCenter.LIZIZ).keySet()) {
                                if (!Intrinsics.LJFF(cls, cls2)) {
                                    if (!ApiCenter.LIZJ(cls, cls2)) {
                                        if (ApiCenter.LIZJ(cls2, cls)) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(cls);
                                            sbLIZ.append(" parent found ");
                                            sbLIZ.append(cls2);
                                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                    } else {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(cls);
                                        sbLIZ2.append(" child found ");
                                        sbLIZ2.append(cls2);
                                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                } else {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(cls);
                                    sbLIZ3.append(" already register");
                                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
                                }
                            }
                            ((HashMap) apiCenter.LIZIZ).put(cls, apiComponent);
                        } else {
                            throw new IllegalArgumentException("ApiComponent can't register, use subclass instead");
                        }
                    }
                }
                if (this.LLILZLL.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    this.LLJILJILJ = true;
                    abstractC2255721DQs.dispatchOnCreate$als_release();
                    if (this.LLILZLL.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        abstractC2255721DQs.dispatchOnStart$als_release();
                        if (this.LLILZLL.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                            abstractC2255721DQs.dispatchOnResume$als_release();
                        }
                    }
                    this.LLJILJILJ = false;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("LogicComponent already exists");
        }
    }

    public final void LJIIL(AbstractC2255721DQs<?> abstractC2255721DQs, Lifecycle.State state) {
        this.LLJILJILJ = true;
        int i = C19466011Du.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (abstractC2255721DQs.getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) >= 0) {
                            abstractC2255721DQs.dispatchOnPause$als_release();
                        }
                        if (abstractC2255721DQs.getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) >= 0) {
                            abstractC2255721DQs.dispatchOnStop$als_release();
                        }
                        if (abstractC2255721DQs.getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) >= 0) {
                            abstractC2255721DQs.dispatchOnDestroy$als_release();
                            C05YF apiComponent = abstractC2255721DQs.getApiComponent();
                            if (!Intrinsics.LJFF(apiComponent, C05YF.class)) {
                                ApiCenter apiCenter = this.LLILLJJLI;
                                if (!apiCenter.LIZJ) {
                                    ((HashMap) apiCenter.LIZIZ).remove(apiComponent.getClass());
                                }
                            }
                        }
                    }
                } else if (abstractC2255721DQs.getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) < 0) {
                    if (abstractC2255721DQs.getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) < 0) {
                        abstractC2255721DQs.dispatchOnCreate$als_release();
                    }
                    if (abstractC2255721DQs.getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) < 0) {
                        abstractC2255721DQs.dispatchOnStart$als_release();
                    }
                    abstractC2255721DQs.dispatchOnResume$als_release();
                }
            } else {
                Lifecycle.State currentState = abstractC2255721DQs.getLifecycle().getCurrentState();
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                if (currentState.compareTo(state2) < 0) {
                    if (abstractC2255721DQs.getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) < 0) {
                        abstractC2255721DQs.dispatchOnCreate$als_release();
                    }
                    abstractC2255721DQs.dispatchOnStart$als_release();
                } else if (abstractC2255721DQs.getLifecycle().getCurrentState().compareTo(state2) > 0) {
                    abstractC2255721DQs.dispatchOnPause$als_release();
                }
            }
        } else {
            Lifecycle.State currentState2 = abstractC2255721DQs.getLifecycle().getCurrentState();
            Lifecycle.State state3 = Lifecycle.State.CREATED;
            if (currentState2.compareTo(state3) < 0) {
                abstractC2255721DQs.dispatchOnCreate$als_release();
            } else {
                if (abstractC2255721DQs.getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) > 0) {
                    abstractC2255721DQs.dispatchOnPause$als_release();
                }
                if (abstractC2255721DQs.getLifecycle().getCurrentState().compareTo(state3) > 0) {
                    abstractC2255721DQs.dispatchOnStop$als_release();
                }
            }
        }
        this.LLJILJILJ = false;
    }

    public static void LJIIJ(C1DR9 c1dr9, Class cls, C1DRF c1drf) {
        Class<? extends C05YF> cls2 = c1dr9.LIZ;
        C21308518aB c21308518aBLJFF = c1drf.LJFF(cls2, null, new AvS544S0100000_32(cls, 0));
        c1drf.LIZ(cls, cls2);
        for (Class<? extends C05YF> cls3 : c1dr9.LIZIZ) {
            c21308518aBLJFF.LIZ(cls3);
            c1drf.LIZ(cls, cls3);
        }
    }

    public static void LJIILJJIL(AbstractC2255721DQs abstractC2255721DQs, C1DR5 c1dr5, C1DR7 c1dr7) {
        List<Class<? extends C05YF>> list;
        c1dr7.LIZLLL.put(c1dr5.LIZIZ, abstractC2255721DQs);
        C1DR9 c1dr9 = c1dr5.LIZLLL;
        if (c1dr9 != null && (list = c1dr9.LIZJ) != null) {
            Iterator<Class<? extends C05YF>> it2 = list.iterator();
            while (it2.hasNext()) {
                c1dr7.LIZLLL.put(it2.next(), abstractC2255721DQs);
            }
        }
    }

    public static void LJIILIIL(Class cls, C1DR9 c1dr9, C1DR5 c1dr5, C1DR7 c1dr7) {
        c1dr7.LIZIZ.put(cls, c1dr5);
        c1dr7.LIZJ.put(cls, cls);
        if (c1dr9 != null) {
            c1dr7.LIZJ.put(c1dr9.LIZ, cls);
            Iterator<Class<? extends C05YF>> it2 = c1dr9.LIZIZ.iterator();
            while (it2.hasNext()) {
                c1dr7.LIZJ.put(it2.next(), cls);
            }
        }
    }

    public FeatureAlsLogicContainer(String str, Lifecycle lifecycle, ApiCenter apiCenter, C1DRG c1drg, C1647230sy1 c1647230sy1, StackTraceElement[] stackTraceElementArr) {
        this.LL = str;
        this.LLILLJJLI = apiCenter;
        this.LLILLL = c1drg;
        this.LLILZ = c1647230sy1;
        this.LLILZIL = stackTraceElementArr;
        this.LLILZLL = lifecycle;
        ArrayList<AbstractC2255721DQs<?>> arrayList = new ArrayList<>();
        this.LLIZLLLIL = arrayList;
        this.LLJ = arrayList;
        this.LLJI = new C1DR8(this);
        this.LLJIJIL = new LifecycleRegistry(this.LLJI);
        this.LLJJIII = new ArrayList<>();
        this.LLJJIJI = new HashMap<>();
        this.LLJJIJIIJIL = new HashMap<>();
        this.LLJJIJIL = new HashMap<>();
        lifecycle.addObserver(this);
        if (c1drg == null) {
            C1DRF c1drf = new C1DRF(new C1664660tQ8("empty_parent"), null);
            c1drf.LJIIJ = c1647230sy1.LIZJ;
            this.LLILLL = c1drf.LIZIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" attach{}");
        this.LLJJ = new C1DRF(new C1664660tQ8(C2188811AlT.LIZIZ(sbLIZ)), this.LLILLL);
        this.LLJILLL = new C1DR7(this.LLILLL);
    }

    @Override // X.C0LEK
    public final FeatureAlsLogicContainer LIZ(String str, EnumC1642750sqn enumC1642750sqn, InterfaceC540980LJo interfaceC540980LJo, Class cls, Class cls2, Function1 function1) {
        LJIIIZ(str, enumC1642750sqn, interfaceC540980LJo, cls, cls2, null, 0, null, function1);
        return this;
    }

    @Override // X.C0LEK
    public final FeatureAlsLogicContainer LIZJ(String str, EnumC1642750sqn enumC1642750sqn, C385670FAf c385670FAf, Class cls, Class cls2, int i, EnumC371580EhY enumC371580EhY, Function1 function1) {
        LJIIIZ(str, enumC1642750sqn, c385670FAf, cls, cls2, null, i, enumC371580EhY, function1);
        return this;
    }

    @Override // X.C0LEK
    public final FeatureAlsLogicContainer LIZIZ(String str, EnumC1642750sqn enumC1642750sqn, InterfaceC540980LJo interfaceC540980LJo, Class cls, Class cls2, Class cls3, int i, EnumC371580EhY enumC371580EhY, Function1 function1) {
        LJIIIZ(str, enumC1642750sqn, interfaceC540980LJo, cls, cls2, cls3, i, enumC371580EhY, function1);
        return this;
    }

    public final void LJIIIZ(final String str, EnumC1642750sqn enumC1642750sqn, InterfaceC540980LJo interfaceC540980LJo, Class cls, final Class cls2, Class cls3, int i, EnumC371580EhY enumC371580EhY, final Function1 function1) {
        C1DR9 c1dr9;
        if ((Intrinsics.LJFF(cls, C05YF.class) || Intrinsics.LJFF(cls, C0F1T.class)) && ((enumC1642750sqn == EnumC1642750sqn.LAZY || enumC1642750sqn == EnumC1642750sqn.FORCE_LAZY) && interfaceC540980LJo == null)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Because ");
            sbLIZ.append(cls2);
            sbLIZ.append(" only implement ApiComponent or FeatureApiComponent, its attachOption is ");
            sbLIZ.append(enumC1642750sqn);
            sbLIZ.append(", its attachTiming can't be null");
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            throw new RuntimeException(strLIZIZ) { // from class: X.1DRD
            };
        }
        if (Intrinsics.LJFF(cls, C05YF.class)) {
            c1dr9 = null;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C15O0.LIZ(cls, linkedHashSet);
            List listLLIIII = C13LP.LLIIII(linkedHashSet);
            ArrayList arrayList = new ArrayList(linkedHashSet);
            ListProtector.add(arrayList, 0, cls);
            c1dr9 = new C1DR9(cls, listLLIIII, C13LP.LLIIII(arrayList));
        }
        final C1DR5 c1dr5 = new C1DR5(i, enumC1642750sqn, c1dr9, interfaceC540980LJo, enumC371580EhY, cls2, cls, cls3, str);
        ((ArrayList) this.LLIZ).add(c1dr5);
        if (str == null) {
            LJIILIIL(cls2, c1dr9, c1dr5, this.LLJILLL);
            this.LLJJ.LJFF(cls2, null, new AvS540S0100000_8(function1, 16));
            if (c1dr9 != null) {
                LJIIJ(c1dr9, cls2, this.LLJJ);
                return;
            }
            return;
        }
        if (C0F1T.class.isAssignableFrom(cls)) {
            LJIILIIL(cls2, c1dr9, c1dr5, this.LLJILLL);
            this.LLJJ.LJFF(cls2, null, new AbstractC20611515l3<Object>() { // from class: X.15Qy
                @Override // X.AbstractC20611515l3
                public final Object LIZIZ(C1DRG c1drg) {
                    return function1.invoke(this.LIZIZ.LLJJIJIL.get(str));
                }
            });
            if (c1dr9 == null) {
                return;
            }
            LJIIJ(c1dr9, cls2, this.LLJJ);
            return;
        }
        final C1DR9 c1dr92 = c1dr9;
        this.LLJJIII.add(new Runnable() { // from class: X.1DR3
            @Override // java.lang.Runnable
            public final void run() {
                FeatureAlsLogicContainer featureAlsLogicContainer = this.LL;
                String str2 = str;
                Class cls4 = cls2;
                C1DR9 c1dr93 = c1dr92;
                C1DR5 c1dr52 = c1dr5;
                Function1 function12 = function1;
                C1C7U.LIZ("FeatureAlsLogicContainer@e2d8.attachComponentInternal$1L");
                C1DR7 c1dr7 = featureAlsLogicContainer.LLJJIJI.get(str2);
                if (c1dr7 == null) {
                    c1dr7 = new C1DR7(featureAlsLogicContainer.LLJJI);
                    featureAlsLogicContainer.LLJJIJI.put(str2, c1dr7);
                }
                FeatureAlsLogicContainer.LJIILIIL(cls4, c1dr93, c1dr52, c1dr7);
                C1DRF c1drf = featureAlsLogicContainer.LLJJIJIIJIL.get(str2);
                if (c1drf == null) {
                    c1drf = new C1DRF(new C1664660tQ8(str2), featureAlsLogicContainer.LLJJI);
                    c1drf.LJIIJ = featureAlsLogicContainer.LLILZ.LIZJ;
                    featureAlsLogicContainer.LLJJIJIIJIL.put(str2, c1drf);
                }
                c1drf.LJFF(cls4, null, new AvS540S0100000_8(function12, 17));
                if (c1dr93 != null) {
                    FeatureAlsLogicContainer.LJIIJ(c1dr93, cls4, c1drf);
                }
                C1C7U.LIZIZ("FeatureAlsLogicContainer@e2d8.attachComponentInternal$1L");
            }
        });
    }
}

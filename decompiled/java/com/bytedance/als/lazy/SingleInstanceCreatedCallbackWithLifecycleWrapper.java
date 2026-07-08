package com.bytedance.als.lazy;

import X.AbstractC2255721DQs;
import X.AbstractC2255761DQw;
import X.C05YF;
import X.C1287930jcV;
import X.C1DR0;
import X.C1DRG;
import X.C2188811AlT;
import X.C2255731DQt;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS436S0200000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class SingleInstanceCreatedCallbackWithLifecycleWrapper<T extends C05YF> extends AbstractC2255761DQw<AbstractC2255721DQs<T>> implements GenericLifecycleObserver {
    public final Class<?> LLILLJJLI;
    public final C1DRG LLILLL;
    public final Lifecycle LLILZ;
    public final Function1<T, Unit> LLILZIL;
    public final C2255731DQt LLILZLL;
    public final C2255731DQt LLIZ;
    public final Function0<Unit> LLIZLLLIL;
    public final Function0<Unit> LLJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZJ() {
        this.LLILZ.removeObserver(this);
        C1DRG c1drg = this.LLILLL;
        Class<?> cls = this.LLILLJJLI;
        c1drg.getClass();
        if (c1drg.LJIILLIIL(new C1287930jcV(null, cls), this)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unregisterInstanceCreatedCallbacks failed, instanceType: ");
        sbLIZ.append(this.LLILLJJLI);
        throw new C1DR0(C2188811AlT.LIZIZ(sbLIZ));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LIZJ();
    }

    @Override // X.AbstractC2255761DQw
    public final void LIZIZ(Object obj, boolean z) {
        boolean z2;
        AbstractC2255721DQs abstractC2255721DQs = (AbstractC2255721DQs) obj;
        if (!z) {
            C2255731DQt c2255731DQt = this.LLILZLL;
            synchronized (c2255731DQt) {
                try {
                    z2 = c2255731DQt.LIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!z2) {
                this.LLIZ.LIZ();
                LIZJ();
                this.LLIZLLLIL.invoke();
                this.LLILZIL.invoke((T) abstractC2255721DQs.getApiComponent());
                this.LLJ.invoke();
            }
        }
    }

    public SingleInstanceCreatedCallbackWithLifecycleWrapper(Class cls, C1DRG c1drg, LifecycleRegistry lifecycleRegistry, AwS401S0200000_35 awS401S0200000_35, C2255731DQt c2255731DQt, C2255731DQt c2255731DQt2, AwS436S0200000_35 awS436S0200000_35, AwS436S0200000_35 awS436S0200000_352) {
        this.LLILLJJLI = cls;
        this.LLILLL = c1drg;
        this.LLILZ = lifecycleRegistry;
        this.LLILZIL = awS401S0200000_35;
        this.LLILZLL = c2255731DQt;
        this.LLIZ = c2255731DQt2;
        this.LLIZLLLIL = awS436S0200000_35;
        this.LLJ = awS436S0200000_352;
    }
}

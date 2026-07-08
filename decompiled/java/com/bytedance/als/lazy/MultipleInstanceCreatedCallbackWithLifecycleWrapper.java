package com.bytedance.als.lazy;

import X.AbstractC2255761DQw;
import X.C05YF;
import X.C1287930jcV;
import X.C1DR0;
import X.C1DRG;
import X.C2255731DQt;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS436S0200000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class MultipleInstanceCreatedCallbackWithLifecycleWrapper<T extends C05YF> extends AbstractC2255761DQw<T> implements GenericLifecycleObserver {
    public final List<Class<? extends C05YF>> LLILLJJLI;
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
        for (Class<? extends C05YF> cls : this.LLILLJJLI) {
            C1DRG c1drg = this.LLILLL;
            c1drg.getClass();
            if (!c1drg.LJIILLIIL(new C1287930jcV(null, cls), this)) {
                throw new C1DR0("unregisterInstanceCreatedCallbacks failed");
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LIZJ();
    }

    @Override // X.AbstractC2255761DQw
    public final void LIZIZ(Object obj, boolean z) {
        boolean z2;
        if (!z) {
            C2255731DQt c2255731DQt = this.LLIZ;
            synchronized (c2255731DQt) {
                try {
                    z2 = c2255731DQt.LIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!z2) {
                this.LLILZLL.LIZ();
                LIZJ();
                this.LLIZLLLIL.invoke();
                this.LLILZIL.invoke(obj);
                this.LLJ.invoke();
            }
        }
    }

    public MultipleInstanceCreatedCallbackWithLifecycleWrapper(List list, C1DRG c1drg, LifecycleRegistry lifecycleRegistry, AwS401S0200000_35 awS401S0200000_35, C2255731DQt c2255731DQt, C2255731DQt c2255731DQt2, AwS436S0200000_35 awS436S0200000_35, AwS436S0200000_35 awS436S0200000_352) {
        this.LLILLJJLI = list;
        this.LLILLL = c1drg;
        this.LLILZ = lifecycleRegistry;
        this.LLILZIL = awS401S0200000_35;
        this.LLILZLL = c2255731DQt;
        this.LLIZ = c2255731DQt2;
        this.LLIZLLLIL = awS436S0200000_35;
        this.LLJ = awS436S0200000_352;
    }
}

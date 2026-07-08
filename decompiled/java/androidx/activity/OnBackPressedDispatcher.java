package androidx.activity;

import X.AbstractC1563340qmi;
import X.AbstractC2173821A5s;
import X.C092O;
import X.C13E8;
import X.C1565730qqZ;
import X.C199Y;
import X.C2173811A5r;
import X.C2173861A5w;
import X.C2173871A5x;
import X.EnumC682280QpW;
import X.InterfaceC2173851A5v;
import android.content.Context;
import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class OnBackPressedDispatcher {
    public final Runnable LIZ;
    public final C092O<Boolean> LIZIZ;
    public final C13E8<AbstractC2173821A5s> LIZJ;
    public AbstractC2173821A5s LIZLLL;
    public final OnBackInvokedCallback LJ;
    public OnBackInvokedDispatcher LJFF;
    public boolean LJI;
    public boolean LJII;

    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, InterfaceC2173851A5v {
        public final Lifecycle LL;
        public final AbstractC2173821A5s LLILLJJLI;
        public C2173811A5r LLILLL;

        @Override // X.InterfaceC2173851A5v
        public final void cancel() {
            this.LL.removeObserver(this);
            this.LLILLJJLI.LIZIZ.remove(this);
            C2173811A5r c2173811A5r = this.LLILLL;
            if (c2173811A5r != null) {
                c2173811A5r.cancel();
            }
            this.LLILLL = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.LLILLL = OnBackPressedDispatcher.this.LIZIZ(this.LLILLJJLI);
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                C2173811A5r c2173811A5r = this.LLILLL;
                if (c2173811A5r == null) {
                    return;
                }
                c2173811A5r.cancel();
                return;
            }
            if (event != Lifecycle.Event.ON_DESTROY) {
                return;
            }
            cancel();
        }

        public LifecycleOnBackPressedCancellable(Lifecycle lifecycle, AbstractC2173821A5s abstractC2173821A5s) {
            this.LL = lifecycle;
            this.LLILLJJLI = abstractC2173821A5s;
            lifecycle.addObserver(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    public final void LIZLLL() {
        AbstractC2173821A5s abstractC2173821A5sPrevious;
        AbstractC2173821A5s abstractC2173821A5s = this.LIZLLL;
        if (abstractC2173821A5s == null) {
            C13E8<AbstractC2173821A5s> c13e8 = this.LIZJ;
            ListIterator<AbstractC2173821A5s> listIterator = c13e8.listIterator(c13e8.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC2173821A5sPrevious = null;
                    break;
                } else {
                    abstractC2173821A5sPrevious = listIterator.previous();
                    if (abstractC2173821A5sPrevious.LIZ) {
                        break;
                    }
                }
            }
            abstractC2173821A5s = abstractC2173821A5sPrevious;
        }
        this.LIZLLL = null;
        if (abstractC2173821A5s != null) {
            abstractC2173821A5s.LIZ();
        }
    }

    public final void LJ() {
        AbstractC2173821A5s abstractC2173821A5sPrevious;
        AbstractC2173821A5s abstractC2173821A5s = this.LIZLLL;
        if (abstractC2173821A5s == null) {
            C13E8<AbstractC2173821A5s> c13e8 = this.LIZJ;
            ListIterator<AbstractC2173821A5s> listIterator = c13e8.listIterator(c13e8.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC2173821A5sPrevious = null;
                    break;
                } else {
                    abstractC2173821A5sPrevious = listIterator.previous();
                    if (abstractC2173821A5sPrevious.LIZ) {
                        break;
                    }
                }
            }
            abstractC2173821A5s = abstractC2173821A5sPrevious;
        }
        this.LIZLLL = null;
        if (abstractC2173821A5s != null) {
            abstractC2173821A5s.LIZIZ();
            return;
        }
        Runnable runnable = this.LIZ;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void LJI() {
        boolean z = this.LJII;
        C13E8<AbstractC2173821A5s> c13e8 = this.LIZJ;
        boolean z2 = false;
        if (!(c13e8 instanceof Collection) || !c13e8.isEmpty()) {
            Iterator<AbstractC2173821A5s> it2 = c13e8.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (it2.next().LIZ) {
                    z2 = true;
                    break;
                }
            }
        }
        this.LJII = z2;
        if (z2 != z) {
            C092O<Boolean> c092o = this.LIZIZ;
            if (c092o != null) {
                c092o.accept(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                LJFF(z2);
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.LIZ = runnable;
        this.LIZIZ = null;
        this.LIZJ = new C13E8<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                final AwS612S0100000_33 awS612S0100000_33 = new AwS612S0100000_33(this, 0);
                final AwS612S0100000_33 awS612S0100000_332 = new AwS612S0100000_33(this, 1);
                final AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(this, 4);
                final AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(this, 5);
                onBackInvokedCallback = new OnBackAnimationCallback() { // from class: X.1A5t
                    @Override // android.window.OnBackAnimationCallback
                    public final void onBackCancelled() {
                        awS577S0100000_332.invoke();
                    }

                    @Override // android.window.OnBackInvokedCallback
                    public final void onBackInvoked() {
                        awS577S0100000_33.invoke();
                    }

                    @Override // android.window.OnBackAnimationCallback
                    public final void onBackProgressed(BackEvent backEvent) {
                        awS612S0100000_332.invoke(new C1776540wKa(backEvent));
                    }

                    @Override // android.window.OnBackAnimationCallback
                    public final void onBackStarted(BackEvent backEvent) {
                        awS612S0100000_33.invoke(new C1776540wKa(backEvent));
                    }
                };
            } else {
                final AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(this, 6);
                onBackInvokedCallback = new OnBackInvokedCallback() { // from class: X.1A5u
                    @Override // android.window.OnBackInvokedCallback
                    public final void onBackInvoked() {
                        awS577S0100000_333.invoke();
                    }
                };
            }
            this.LJ = onBackInvokedCallback;
        }
    }

    public final C2173811A5r LIZIZ(AbstractC2173821A5s abstractC2173821A5s) {
        this.LIZJ.addLast(abstractC2173821A5s);
        C2173811A5r c2173811A5r = new C2173811A5r(this, abstractC2173821A5s);
        abstractC2173821A5s.LIZIZ.add(c2173811A5r);
        LJI();
        abstractC2173821A5s.LIZJ = new C2173871A5x(this);
        return c2173811A5r;
    }

    public final void LJFF(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.LJFF;
        OnBackInvokedCallback onBackInvokedCallback = this.LJ;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z) {
                if (!this.LJI) {
                    onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
                    this.LJI = true;
                    return;
                }
                return;
            }
            if (!this.LJI) {
                return;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.LJI = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(LifecycleOwner lifecycleOwner, AbstractC2173821A5s abstractC2173821A5s) {
        Context context;
        Integer numLIZ;
        if (lifecycleOwner instanceof C199Y) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleOwner.getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.MAIN;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) lifecycleOwner))) != null) {
                LIZJ(lifecycleOwner, abstractC2173821A5s);
                C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                return;
            }
        }
        LIZJ(lifecycleOwner, abstractC2173821A5s);
    }

    public final void LIZJ(LifecycleOwner lifecycleOwner, AbstractC2173821A5s abstractC2173821A5s) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        abstractC2173821A5s.LIZIZ.add(new LifecycleOnBackPressedCancellable(lifecycle, abstractC2173821A5s));
        LJI();
        abstractC2173821A5s.LIZJ = new C2173861A5w(this);
    }
}

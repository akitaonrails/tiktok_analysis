package androidx.databinding;

import X.AbstractC1324140kYu;
import X.AbstractC947903nB;
import X.C03GW;
import X.C1324130kYt;
import X.C1779230wOv;
import X.C1842040y2E;
import X.C1DTM;
import X.C1DTN;
import X.C1DTO;
import X.C1DTP;
import X.C1DTS;
import X.C1DTZ;
import X.C2256341DTc;
import X.C786410Ut5;
import X.InterfaceC2256321DTa;
import X.InterfaceC340040DUs;
import Y.ARunnableS135S0100000_35;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes36.dex */
public abstract class ViewDataBinding extends C1779230wOv implements InterfaceC340040DUs {
    public static final boolean LLJJI = true;
    public final ARunnableS135S0100000_35 LL;
    public boolean LLILLJJLI;
    public final C1DTS[] LLILLL;
    public final View LLILZ;
    public C1324130kYt<AbstractC947903nB, ViewDataBinding, Void> LLILZIL;
    public boolean LLILZLL;
    public final Choreographer LLIZ;
    public final C1DTN LLIZLLLIL;
    public final Handler LLJ;
    public final C03GW LLJI;
    public ViewDataBinding LLJIJIL;
    public LifecycleOwner LLJILJIL;
    public OnStartListener LLJILJILJ;
    public boolean LLJILLL;
    public static final int LLJJ = Build.VERSION.SDK_INT;
    public static final C1DTO LLJJIII = new InterfaceC2256321DTa() { // from class: X.1DTO
        @Override // X.InterfaceC2256321DTa
        public final C1DTS LIZ(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new C1DTR(viewDataBinding, i, referenceQueue).LL;
        }
    };
    public static final C1DTP LLJJIJI = new InterfaceC2256321DTa() { // from class: X.1DTP
        @Override // X.InterfaceC2256321DTa
        public final C1DTS LIZ(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new C1DTQ(viewDataBinding, i, referenceQueue).LL;
        }
    };
    public static final C2256341DTc LLJJIJIIJIL = new AbstractC1324140kYu<AbstractC947903nB, ViewDataBinding, Void>() { // from class: X.1DTc
        @Override // X.AbstractC1324140kYu
        public final void LIZ(int i, Object obj, Object obj2) {
            AbstractC947903nB abstractC947903nB = (AbstractC947903nB) obj;
            ViewDataBinding viewDataBinding = (ViewDataBinding) obj2;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        abstractC947903nB.LIZ(viewDataBinding);
                        return;
                    }
                    return;
                }
                abstractC947903nB.getClass();
                return;
            }
            abstractC947903nB.getClass();
        }
    };
    public static final ReferenceQueue<ViewDataBinding> LLJJIJIL = new ReferenceQueue<>();
    public static final C1DTM LLJJJ = new View.OnAttachStateChangeListener() { // from class: X.1DTM
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            ViewDataBinding viewDataBinding;
            if (view != null) {
                viewDataBinding = (ViewDataBinding) view.getTag(R.id.ffn);
            } else {
                viewDataBinding = null;
            }
            viewDataBinding.LL.run();
            view.removeOnAttachStateChangeListener(this);
        }
    };

    public static class OnStartListener implements GenericLifecycleObserver {
        public final WeakReference<ViewDataBinding> LL;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                onStart();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.LL.get();
            if (viewDataBinding != null) {
                viewDataBinding.LJFF();
            }
        }

        public OnStartListener(ViewDataBinding viewDataBinding) {
            this.LL = new WeakReference<>(viewDataBinding);
        }
    }

    public abstract void LIZLLL();

    public abstract boolean LJI();

    public abstract void LJII();

    public abstract boolean LJIIJJI(int i, int i2, Object obj);

    public final void LJ() {
        if (this.LLILZLL) {
            LJIILIIL();
            return;
        }
        if (LJI()) {
            this.LLILZLL = true;
            C1324130kYt<AbstractC947903nB, ViewDataBinding, Void> c1324130kYt = this.LLILZIL;
            if (c1324130kYt != null) {
                c1324130kYt.LIZLLL(1, this);
            }
            LIZLLL();
            C1324130kYt<AbstractC947903nB, ViewDataBinding, Void> c1324130kYt2 = this.LLILZIL;
            if (c1324130kYt2 != null) {
                c1324130kYt2.LIZLLL(3, this);
            }
            this.LLILZLL = false;
        }
    }

    public final void LJFF() {
        ViewDataBinding viewDataBinding = this.LLJIJIL;
        if (viewDataBinding == null) {
            LJ();
        } else {
            viewDataBinding.LJFF();
        }
    }

    public final void LJIILIIL() {
        ViewDataBinding viewDataBinding = this.LLJIJIL;
        if (viewDataBinding != null) {
            viewDataBinding.LJIILIIL();
            return;
        }
        LifecycleOwner lifecycleOwner = this.LLJILJIL;
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            synchronized (this) {
                try {
                    if (this.LLILLJJLI) {
                        return;
                    }
                    this.LLILLJJLI = true;
                    if (LLJJI) {
                        this.LLIZ.postFrameCallback(this.LLIZLLLIL);
                    } else {
                        C786410Ut5.LJJZZIII(this.LLJ, this.LL);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC340040DUs
    public final View getRoot() {
        return this.LLILZ;
    }

    public static C03GW LIZJ(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof C03GW) {
            return (C03GW) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public void LJIILJJIL(LifecycleOwner lifecycleOwner) {
        LifecycleOwner lifecycleOwner2 = this.LLJILJIL;
        if (lifecycleOwner2 == lifecycleOwner) {
            return;
        }
        if (lifecycleOwner2 != null) {
            lifecycleOwner2.getLifecycle().removeObserver(this.LLJILJILJ);
        }
        this.LLJILJIL = lifecycleOwner;
        if (lifecycleOwner != null) {
            if (this.LLJILJILJ == null) {
                this.LLJILJILJ = new OnStartListener(this);
            }
            lifecycleOwner.getLifecycle().addObserver(this.LLJILJILJ);
        }
        for (C1DTS c1dts : this.LLILLL) {
            if (c1dts != null) {
                c1dts.LIZ.setLifecycleOwner(lifecycleOwner);
            }
        }
    }

    public static ViewDataBinding LIZIZ(int i, View view) {
        return C1842040y2E.LIZ.LIZIZ(LIZJ(null), view, i);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.1DTN] */
    public ViewDataBinding(int i, View view, Object obj) {
        C03GW c03gwLIZJ = LIZJ(obj);
        this.LL = new ARunnableS135S0100000_35(this, 0);
        this.LLILLJJLI = false;
        this.LLJI = c03gwLIZJ;
        this.LLILLL = new C1DTS[i];
        this.LLILZ = view;
        if (Looper.myLooper() != null) {
            if (LLJJI) {
                this.LLIZ = C786410Ut5.v2();
                this.LLIZLLLIL = new Choreographer.FrameCallback() { // from class: X.1DTN
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        this.LL.LL.run();
                    }
                };
                return;
            } else {
                this.LLIZLLLIL = null;
                this.LLJ = new Handler(Looper.myLooper());
                return;
            }
        }
        throw new IllegalStateException("DataBinding must be created in view's UI Thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIIL(int i, Object obj, InterfaceC2256321DTa interfaceC2256321DTa) {
        if (obj == 0) {
            return;
        }
        C1DTS c1dtsLIZ = this.LLILLL[i];
        if (c1dtsLIZ == null) {
            c1dtsLIZ = interfaceC2256321DTa.LIZ(this, i, LLJJIJIL);
            this.LLILLL[i] = c1dtsLIZ;
            LifecycleOwner lifecycleOwner = this.LLJILJIL;
            if (lifecycleOwner != null) {
                c1dtsLIZ.LIZ.setLifecycleOwner(lifecycleOwner);
            }
        }
        c1dtsLIZ.LIZ();
        c1dtsLIZ.LIZJ = obj;
        c1dtsLIZ.LIZ.LIZ(obj);
    }

    public final boolean LJIILL(int i, Object obj, InterfaceC2256321DTa interfaceC2256321DTa) {
        if (obj == null) {
            C1DTS c1dts = this.LLILLL[i];
            if (c1dts == null) {
                return false;
            }
            return c1dts.LIZ();
        }
        C1DTS c1dts2 = this.LLILLL[i];
        if (c1dts2 == null) {
            LJIIL(i, obj, interfaceC2256321DTa);
            return true;
        }
        if (c1dts2.LIZJ == obj) {
            return false;
        }
        c1dts2.LIZ();
        LJIIL(i, obj, interfaceC2256321DTa);
        return true;
    }

    public static Object[] LJIIJ(C03GW c03gw, View[] viewArr, int i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        for (View view : viewArr) {
            LJIIIIZZ(c03gw, view, objArr, null, sparseIntArray, true);
        }
        return objArr;
    }

    public static Object[] LJIIIZ(C03GW c03gw, View view, int i, C1DTZ c1dtz, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        LJIIIIZZ(c03gw, view, objArr, c1dtz, sparseIntArray, true);
        return objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.C03GW r27, android.view.View r28, java.lang.Object[] r29, X.C1DTZ r30, android.util.SparseIntArray r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.LJIIIIZZ(X.03GW, android.view.View, java.lang.Object[], X.1DTZ, android.util.SparseIntArray, boolean):void");
    }
}

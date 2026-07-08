package X;

import Y.ARunnableS40S0400000_32;
import Y.ARunnableS6S0600000_32;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.194d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC214793194d {
    public ViewGroup LIZ;
    public Runnable LIZIZ;
    public List<InterfaceC214797194h> LIZJ;
    public boolean LIZLLL;

    public abstract void LIZJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY);

    public abstract void LJ(C214795194f c214795194f, C214795194f c214795194f2, Runnable runnable, C1447920nmY c1447920nmY);

    public abstract boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2);

    public void LIZ(InterfaceC214797194h interfaceC214797194h) {
        if (this.LIZJ == null) {
            this.LIZJ = new ArrayList();
        }
        this.LIZJ.add(interfaceC214797194h);
    }

    public void LJI(InterfaceC214797194h interfaceC214797194h) {
        List<InterfaceC214797194h> list = this.LIZJ;
        if (list != null) {
            list.remove(interfaceC214797194h);
        }
    }

    public void LJII(List<InterfaceC214797194h> list) {
        this.LIZJ = list;
    }

    public void LJIIIIZZ(Runnable runnable) {
        this.LIZIZ = runnable;
    }

    public void LJIIIZ(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    public void LJIIJ(boolean z) {
        this.LIZLLL = z;
    }

    public static void LJIIJJI(final View view, C1447920nmY c1447920nmY, final Runnable runnable) {
        if (view == view.getRootView()) {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            C786410Ut5.y3(viewTreeObserver, new ViewTreeObserver.OnPreDrawListener() { // from class: X.111o
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    if (atomicBoolean.get()) {
                        return false;
                    }
                    if (viewTreeObserver.isAlive()) {
                        C786410Ut5.D3(viewTreeObserver, this);
                        return true;
                    }
                    C786410Ut5.D3(view.getViewTreeObserver(), this);
                    return true;
                }
            });
            final C12YY c12yy = new C12YY(viewTreeObserver, view, atomicBoolean, runnable, 0);
            c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.10uK
                @Override // X.InterfaceC1447930nmZ
                public final void onCancel() {
                    if (viewTreeObserver.isAlive()) {
                        C786410Ut5.A3(viewTreeObserver, c12yy);
                    } else {
                        C786410Ut5.A3(view.getViewTreeObserver(), c12yy);
                    }
                    atomicBoolean.set(false);
                    runnable.run();
                }
            });
            viewTreeObserver.addOnGlobalLayoutListener(c12yy);
            C2187701Ajg.LIZ(viewTreeObserver, c12yy, ViewTreeObserver.OnGlobalLayoutListener.class);
            return;
        }
        throw new IllegalArgumentException("Need View.getRootView()");
    }

    public final void LIZIZ(NavigationScene navigationScene, View view, final C214795194f c214795194f, final C214795194f c214795194f2, final C1447810nmN c1447810nmN, InterfaceC214796194g<Boolean> interfaceC214796194g, Runnable runnable) {
        final boolean z;
        boolean z2;
        List<InterfaceC214797194h> list = this.LIZJ;
        if (list != null) {
            Iterator it2 = new ArrayList(list).iterator();
            while (it2.hasNext()) {
                ((InterfaceC214797194h) it2.next()).LIZJ();
            }
        }
        navigationScene.LLLLLLZ(true);
        navigationScene.LLLF = true;
        interfaceC214796194g.LIZ(Boolean.TRUE);
        final ARunnableS40S0400000_32 aRunnableS40S0400000_32 = new ARunnableS40S0400000_32(navigationScene, interfaceC214796194g, runnable, this, 5);
        c1447810nmN.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.194c
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                aRunnableS40S0400000_32.run();
            }
        });
        final View view2 = c214795194f.LIZIZ;
        View view3 = c214795194f2.LIZIZ;
        if (view2.getWidth() != 0 && view2.getHeight() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (view3.getWidth() != 0 && view3.getHeight() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            LIZJ(c214795194f, c214795194f2, aRunnableS40S0400000_32, c1447810nmN.LIZJ());
            return;
        }
        final C1447920nmY c1447920nmYLIZJ = c1447810nmN.LIZJ();
        LJIIJJI(view, c1447920nmYLIZJ, new Runnable() { // from class: X.194b
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                boolean z3;
                C1C7U.LIZ("NavigationAnimationExecutor@59c.executePopChange$3");
                try {
                    if (!z) {
                        C19BL.LJFF(view2);
                        C786410Ut5.LJLLLLLL(8, view2);
                    }
                    C1447920nmY c1447920nmY = c1447920nmYLIZJ;
                    synchronized (c1447920nmY) {
                        try {
                            z3 = c1447920nmY.LIZ;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (!z3) {
                        this.LLIZLLLIL.LIZJ(c214795194f, c214795194f2, aRunnableS40S0400000_32, c1447810nmN.LIZJ());
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NavigationAnimationExecutor@59c.executePopChange$3");
            }
        });
        if (!z) {
            if (view2.getParent() == null) {
                this.LIZ.addView(view2);
            }
            C786410Ut5.LJLLLLLL(0, view2);
            view2.requestLayout();
        }
        if (z2) {
            return;
        }
        view3.requestLayout();
    }

    public final void LIZLLL(NavigationScene navigationScene, View view, final C214795194f c214795194f, final C214795194f c214795194f2, final C1447810nmN c1447810nmN, InterfaceC214796194g<Boolean> interfaceC214796194g, Runnable runnable) {
        final boolean z;
        boolean z2;
        List<InterfaceC214797194h> list = this.LIZJ;
        if (list != null) {
            Iterator it2 = new ArrayList(list).iterator();
            while (it2.hasNext()) {
                ((InterfaceC214797194h) it2.next()).LIZLLL();
            }
        }
        final boolean z3 = true;
        navigationScene.LLLLLLZ(true);
        navigationScene.LLLF = true;
        interfaceC214796194g.LIZ(Boolean.TRUE);
        final View view2 = c214795194f.LIZIZ;
        View view3 = c214795194f2.LIZIZ;
        if (!this.LIZLLL && c214795194f.LIZJ.value < EnumC214943199x.VIEW_CREATED.value) {
            this.LIZ.getOverlay().add(view2);
        }
        final ARunnableS6S0600000_32 aRunnableS6S0600000_32 = new ARunnableS6S0600000_32(interfaceC214796194g, c214795194f, view2, this, navigationScene, runnable, 2);
        c1447810nmN.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.194a
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                aRunnableS6S0600000_32.run();
            }
        });
        if (view2.getWidth() != 0 && view2.getHeight() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (view3.getWidth() != 0 && view3.getHeight() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (view2.getVisibility() != 0) {
            z3 = false;
        }
        if (z && z2) {
            LJ(c214795194f, c214795194f2, aRunnableS6S0600000_32, c1447810nmN.LIZJ());
            return;
        }
        final C1447920nmY c1447920nmYLIZJ = c1447810nmN.LIZJ();
        LJIIJJI(view, c1447920nmYLIZJ, new Runnable() { // from class: X.194Z
            public final void LIZ() {
                boolean z4;
                if (!z) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                C1447920nmY c1447920nmY = c1447920nmYLIZJ;
                synchronized (c1447920nmY) {
                    try {
                        z4 = c1447920nmY.LIZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (!z4) {
                    this.LLJ.LJ(c214795194f, c214795194f2, aRunnableS6S0600000_32, c1447810nmN.LIZJ());
                } else {
                    if (z || !z3) {
                        return;
                    }
                    C786410Ut5.LJLLLLLL(0, view2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NavigationAnimationExecutor@59c.executePushChange$3");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NavigationAnimationExecutor@59c.executePushChange$3");
            }
        });
        if (!z) {
            C786410Ut5.LJLLLLLL(0, view2);
            view2.requestLayout();
        }
        if (z2) {
            return;
        }
        view3.requestLayout();
    }
}

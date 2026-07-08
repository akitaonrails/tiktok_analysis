package X;

import Y.ARunnableS107S0100000_7;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0Ire, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479760Ire {
    public static volatile boolean LJIJI;
    public static final LinkedHashSet<Runnable> LJIJJ = new LinkedHashSet<>();
    public static final LinkedHashSet<Runnable> LJIJJLI = new LinkedHashSet<>();
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public Drawable LJIIJJI;
    public Drawable LJIIL;
    public Drawable LJIILIIL;
    public boolean LJIILJJIL;
    public WeakReference<C20632315oP> LJIILL;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(304));
    public int LJIILLIIL = -1;
    public final C521620Kcy LJIIZILJ = new C521620Kcy(this, 3);
    public final ARunnableS107S0100000_7 LJIJ = new ARunnableS107S0100000_7(this, 230);

    public final void LIZ() {
        if (this.LJIIIZ || this.LJI) {
            return;
        }
        C1324720kZq c1324720kZq = (C1324720kZq) this.LIZ.findViewById(R.id.ljc);
        if (c1324720kZq == null) {
            C20441214yg.LJIIL("HangoutNewUserGuideBg", "bg view (R.id.iv_hangout_new_user_guide_bg) not found; abort");
            return;
        }
        this.LJIIIZ = true;
        LJIJI = true;
        if (!this.LJII) {
            this.LJII = true;
            ((Keva) this.LJ.getValue()).storeBoolean("hangout_new_user_guide_shown", true);
        }
        C786410Ut5.h5(c1324720kZq, 1.0f);
        C786410Ut5.LLJJIII(c1324720kZq, 0);
        c1324720kZq.setAspectRatio(0.84782606f);
        if (!this.LJIIIIZZ) {
            this.LJIIIIZZ = true;
            C1143680frq.LIZLLL(c1324720kZq, "tiktok_live_interaction_normal_3", "hangout_new_user_guide_background.png");
        }
        if (!this.LJIILJJIL) {
            this.LJIILJJIL = true;
            View view = this.LIZIZ;
            this.LJIIJJI = view != null ? view.getBackground() : null;
            View view2 = this.LIZJ;
            this.LJIIL = view2 != null ? view2.getBackground() : null;
            this.LJIILIIL = this.LIZ.getBackground();
        }
        View view3 = this.LIZIZ;
        if (view3 != null) {
            view3.setBackground(null);
        }
        View view4 = this.LIZJ;
        if (view4 != null) {
            view4.setBackground(null);
        }
        this.LIZ.setBackground(null);
    }

    public final void LIZIZ() {
        List listLLIIII;
        C20632315oP c20632315oP;
        if (this.LJI) {
            return;
        }
        this.LJI = true;
        C1324720kZq c1324720kZq = (C1324720kZq) this.LIZ.findViewById(R.id.ljc);
        if (c1324720kZq != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = c1324720kZq.animate();
            if (viewPropertyAnimatorAnimate != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            C786410Ut5.LLJJIII(c1324720kZq, 8);
            C786410Ut5.h5(c1324720kZq, 1.0f);
        }
        this.LJIIIZ = false;
        LJIJI = false;
        this.LJIIJ = false;
        WeakReference<C20632315oP> weakReference = this.LJIILL;
        if (weakReference != null && (c20632315oP = weakReference.get()) != null) {
            c20632315oP.LJI(this.LJIIZILJ);
        }
        this.LJIILL = null;
        if (this.LJIILJJIL) {
            View view = this.LIZIZ;
            if (view != null) {
                view.setBackground(this.LJIIJJI);
            }
            View view2 = this.LIZJ;
            if (view2 != null) {
                view2.setBackground(this.LJIIL);
            }
            this.LIZ.setBackground(this.LJIILIIL);
            this.LJIIJJI = null;
            this.LJIIL = null;
            this.LJIILIIL = null;
            this.LJIILJJIL = false;
        }
        LinkedHashSet<Runnable> linkedHashSet = LJIJJ;
        synchronized (linkedHashSet) {
            try {
                listLLIIII = C13LP.LLIIII(linkedHashSet);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            try {
                ((Runnable) it2.next()).run();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C20441214yg.LJFF("HangoutNewUserGuideBg", "onGuideEnded listener threw", th2);
            }
        }
    }

    public final void LIZJ(float f, int i) {
        C1324720kZq c1324720kZq;
        if (this.LJI || !this.LJIIIZ || this.LJIIJ || (c1324720kZq = (C1324720kZq) this.LIZ.findViewById(R.id.ljc)) == null) {
            return;
        }
        int i2 = this.LJIILLIIL;
        int i3 = 0;
        if (i == i2 && f == 0.0f) {
            f = 1.0f;
        } else if (i == i2) {
            f = 1.0f - f;
        } else if (i != i2 - 1) {
            f = 0.0f;
        }
        C786410Ut5.h5(c1324720kZq, C13LZ.LIZLLL(f, 0.0f, 1.0f));
        if (f <= 0.0f) {
            i3 = 8;
        }
        C786410Ut5.LLJJIII(c1324720kZq, i3);
    }

    public C479760Ire(C477070InJ c477070InJ, C21546719Ub c21546719Ub, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LIZIZ = c477070InJ;
        this.LIZJ = c21546719Ub;
    }
}

package X;

import Y.ARunnableS120S0100000_20;
import Y.AUListenerS269S0100000_20;
import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295950jpR extends Drawable implements Drawable.Callback, Animatable {
    public static final C822650WOx LLLIIIIL = new C822650WOx(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X.08U9
        public static final AtomicInteger LLILZ = new AtomicInteger(1);
        public final ThreadGroup LL;
        public final AtomicInteger LLILLJJLI = new AtomicInteger(1);
        public final String LLILLL;

        {
            SecurityManager securityManager = System.getSecurityManager();
            this.LL = securityManager == null ? C786410Ut5.u3().getThreadGroup() : securityManager.getThreadGroup();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lottie-");
            sbLIZ.append(LLILZ.getAndIncrement());
            sbLIZ.append("-thread-");
            this.LLILLL = C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(this.LLILLJJLI.getAndIncrement());
            BPEAThread bPEAThread = new BPEAThread(threadGroup, runnable, C2188811AlT.LIZIZ(sbLIZ), 0L);
            bPEAThread.setDaemon(false);
            ThreadMethodProxy.setPriority(bPEAThread, 10);
            return bPEAThread;
        }
    });
    public C1294720jnS LL;
    public final ChoreographerFrameCallbackC1295930jpP LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public EnumC1296020jpY LLILZLL;
    public final ArrayList<InterfaceC1296220jps> LLIZ;
    public C1294380jmu LLIZLLLIL;
    public String LLJ;
    public InterfaceC1294390jmv LLJI;
    public C1295350joT LLJIJIL;
    public Map<String, Typeface> LLJILJIL;
    public String LLJILJILJ;
    public C1295870jpJ LLJILLL;
    public C1295710jp3 LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public C1294740jnU LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public EnumC1295970jpT LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final Matrix LLJJL;
    public Bitmap LLJJLIIIJLLLLLLLZ;
    public Canvas LLJL;
    public Rect LLJLIL;
    public RectF LLJLILLLLZIIL;
    public C1294440jn0 LLJLL;
    public Rect LLJLLIL;
    public Rect LLJLLL;
    public RectF LLJZ;
    public RectF LLJZIJLIL;
    public Matrix LLL;
    public Matrix LLLF;
    public EnumC1296010jpX LLLFF;
    public final AUListenerS269S0100000_20 LLLFFI;
    public final Semaphore LLLFZ;
    public final ARunnableS120S0100000_20 LLLI;
    public float LLLII;
    public boolean LLLIIII;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean LIZIZ() {
        return this.LLILLL || this.LLILZ;
    }

    public final void LIZJ() {
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            return;
        }
        C1296750jqj c1296750jqj = C1294710jnR.LIZ;
        Rect rect = c1294720jnS.LJIIIZ;
        C1294740jnU c1294740jnU = new C1294740jnU(this, new C1294730jnT(Collections.emptyList(), c1294720jnS, "__container", -1L, EnumC1294940jno.PRE_COMP, -1L, null, Collections.emptyList(), new C1295320joQ(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), EnumC1295410joZ.NONE, null, false, null, null), c1294720jnS.LJIIIIZZ, c1294720jnS);
        this.LLJJIJIIJIL = c1294740jnU;
        if (this.LLJJJIL) {
            c1294740jnU.LJIIZILJ(true);
        }
        this.LLJJIJIIJIL.LJJIJL = this.LLJJIJI;
    }

    public final void LIZLLL() {
        ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP = this.LLILLJJLI;
        if (choreographerFrameCallbackC1295930jpP.LLJILJILJ) {
            choreographerFrameCallbackC1295930jpP.cancel();
            if (!isVisible()) {
                this.LLILZLL = EnumC1296020jpY.NONE;
            }
        }
        this.LL = null;
        this.LLJJIJIIJIL = null;
        this.LLIZLLLIL = null;
        this.LLLII = -3.4028235E38f;
        ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP2 = this.LLILLJJLI;
        choreographerFrameCallbackC1295930jpP2.LLJILJIL = null;
        choreographerFrameCallbackC1295930jpP2.LLJI = -2.1474836E9f;
        choreographerFrameCallbackC1295930jpP2.LLJIJIL = 2.1474836E9f;
        invalidateSelf();
    }

    public final void LJ() {
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            return;
        }
        this.LLJJJJLIIL = this.LLJJJJJIL.useSoftwareRendering(Build.VERSION.SDK_INT, c1294720jnS.LJIILIIL, c1294720jnS.LJIILJJIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1294380jmu LJIIIIZZ() {
        /*
            r5 = this;
            X.0jmu r3 = r5.LLIZLLLIL
            if (r3 == 0) goto L25
            android.graphics.drawable.Drawable$Callback r1 = r5.getCallback()
            r2 = 0
            if (r1 == 0) goto L3f
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L3f
            android.view.View r1 = (android.view.View) r1
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L3f
            android.content.Context r0 = r3.LIZ
            boolean r0 = r0 instanceof android.app.Application
            if (r0 == 0) goto L21
            android.content.Context r1 = X.C786410Ut5.N3(r1)
        L21:
            android.content.Context r0 = r3.LIZ
            if (r1 != r0) goto L44
        L25:
            X.0jmu r0 = r5.LLIZLLLIL
            if (r0 != 0) goto L3c
            X.0jmu r4 = new X.0jmu
            android.graphics.drawable.Drawable$Callback r3 = r5.getCallback()
            java.lang.String r2 = r5.LLJ
            X.0jmv r1 = r5.LLJI
            X.0jnS r0 = r5.LL
            java.util.Map<java.lang.String, X.0jmo> r0 = r0.LIZLLL
            r4.<init>(r3, r2, r1, r0)
            r5.LLIZLLLIL = r4
        L3c:
            X.0jmu r0 = r5.LLIZLLLIL
            return r0
        L3f:
            android.content.Context r0 = r3.LIZ
            if (r0 != 0) goto L44
            goto L25
        L44:
            r5.LLIZLLLIL = r2
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1295950jpR.LJIIIIZZ():X.0jmu");
    }

    public final boolean LJIIIZ() {
        ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP = this.LLILLJJLI;
        if (choreographerFrameCallbackC1295930jpP == null) {
            return false;
        }
        return choreographerFrameCallbackC1295930jpP.LLJILJILJ;
    }

    public final void LJIIJ() {
        this.LLIZ.clear();
        ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP = this.LLILLJJLI;
        choreographerFrameCallbackC1295930jpP.LJIIIZ(true);
        Iterator it2 = ((CopyOnWriteArraySet) choreographerFrameCallbackC1295930jpP.LLILLL).iterator();
        while (it2.hasNext()) {
            ((Animator.AnimatorPauseListener) it2.next()).onAnimationPause(choreographerFrameCallbackC1295930jpP);
        }
        if (isVisible()) {
            return;
        }
        this.LLILZLL = EnumC1296020jpY.NONE;
    }

    public final void LJIIJJI() {
        if (this.LLJJIJIIJIL == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpi
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJIIJJI();
                }
            });
            return;
        }
        LJ();
        if (LIZIZ() || this.LLILLJJLI.getRepeatCount() == 0) {
            if (isVisible()) {
                ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP = this.LLILLJJLI;
                choreographerFrameCallbackC1295930jpP.LLJILJILJ = true;
                boolean zLJIIIIZZ = choreographerFrameCallbackC1295930jpP.LJIIIIZZ();
                for (Animator.AnimatorListener animatorListener : (CopyOnWriteArraySet) choreographerFrameCallbackC1295930jpP.LLILLJJLI) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC1295930jpP, zLJIIIIZZ);
                    } else {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC1295930jpP);
                    }
                }
                choreographerFrameCallbackC1295930jpP.LJIIJJI((int) (choreographerFrameCallbackC1295930jpP.LJIIIIZZ() ? choreographerFrameCallbackC1295930jpP.LJI() : choreographerFrameCallbackC1295930jpP.LJII()));
                choreographerFrameCallbackC1295930jpP.LLILZLL = 0L;
                choreographerFrameCallbackC1295930jpP.LLJ = 0;
                if (choreographerFrameCallbackC1295930jpP.LLJILJILJ) {
                    choreographerFrameCallbackC1295930jpP.LJIIIZ(false);
                    C786410Ut5.v2().postFrameCallback(choreographerFrameCallbackC1295930jpP);
                }
                this.LLILZLL = EnumC1296020jpY.NONE;
            } else {
                this.LLILZLL = EnumC1296020jpY.PLAY;
            }
        }
        if (LIZIZ()) {
            return;
        }
        ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP2 = this.LLILLJJLI;
        LJIILLIIL((int) (choreographerFrameCallbackC1295930jpP2.LLILZ < 0.0f ? choreographerFrameCallbackC1295930jpP2.LJII() : choreographerFrameCallbackC1295930jpP2.LJI()));
        this.LLILLJJLI.LJ();
        if (isVisible()) {
            return;
        }
        this.LLILZLL = EnumC1296020jpY.NONE;
    }

    public final void LJIILJJIL() {
        if (this.LLJJIJIIJIL == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpo
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJIILJJIL();
                }
            });
            return;
        }
        LJ();
        if (LIZIZ() || this.LLILLJJLI.getRepeatCount() == 0) {
            if (isVisible()) {
                ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP = this.LLILLJJLI;
                choreographerFrameCallbackC1295930jpP.LLJILJILJ = true;
                choreographerFrameCallbackC1295930jpP.LJIIIZ(false);
                C786410Ut5.v2().postFrameCallback(choreographerFrameCallbackC1295930jpP);
                choreographerFrameCallbackC1295930jpP.LLILZLL = 0L;
                if (choreographerFrameCallbackC1295930jpP.LJIIIIZZ() && choreographerFrameCallbackC1295930jpP.LLIZLLLIL == choreographerFrameCallbackC1295930jpP.LJII()) {
                    choreographerFrameCallbackC1295930jpP.LJIIJJI(choreographerFrameCallbackC1295930jpP.LJI());
                } else if (!choreographerFrameCallbackC1295930jpP.LJIIIIZZ() && choreographerFrameCallbackC1295930jpP.LLIZLLLIL == choreographerFrameCallbackC1295930jpP.LJI()) {
                    choreographerFrameCallbackC1295930jpP.LJIIJJI(choreographerFrameCallbackC1295930jpP.LJII());
                }
                Iterator it2 = ((CopyOnWriteArraySet) choreographerFrameCallbackC1295930jpP.LLILLL).iterator();
                while (it2.hasNext()) {
                    ((Animator.AnimatorPauseListener) it2.next()).onAnimationResume(choreographerFrameCallbackC1295930jpP);
                }
                this.LLILZLL = EnumC1296020jpY.NONE;
            } else {
                this.LLILZLL = EnumC1296020jpY.RESUME;
            }
        }
        if (LIZIZ()) {
            return;
        }
        ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP2 = this.LLILLJJLI;
        LJIILLIIL((int) (choreographerFrameCallbackC1295930jpP2.LLILZ < 0.0f ? choreographerFrameCallbackC1295930jpP2.LJII() : choreographerFrameCallbackC1295930jpP2.LJI()));
        this.LLILLJJLI.LJ();
        if (isVisible()) {
            return;
        }
        this.LLILZLL = EnumC1296020jpY.NONE;
    }

    public final boolean LJJIIJZLJL() {
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            return false;
        }
        float f = this.LLLII;
        float fLJFF = this.LLILLJJLI.LJFF();
        this.LLLII = fLJFF;
        return Math.abs(fLJFF - f) * c1294720jnS.LIZIZ() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            return -1;
        }
        return c1294720jnS.LJIIIZ.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            return -1;
        }
        return c1294720jnS.LJIIIZ.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.LLLIIII) {
            return;
        }
        this.LLLIIII = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.LLIZ.clear();
        this.LLILLJJLI.LJ();
        if (isVisible()) {
            return;
        }
        this.LLILZLL = EnumC1296020jpY.NONE;
    }

    public C1295950jpR() {
        ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP = new ChoreographerFrameCallbackC1295930jpP();
        this.LLILLJJLI = choreographerFrameCallbackC1295930jpP;
        this.LLILLL = true;
        this.LLILZ = false;
        this.LLILZIL = false;
        this.LLILZLL = EnumC1296020jpY.NONE;
        this.LLIZ = new ArrayList<>();
        this.LLJJIII = false;
        this.LLJJIJI = true;
        this.LLJJIJIL = 255;
        this.LLJJJJJIL = EnumC1295970jpT.AUTOMATIC;
        this.LLJJJJLIIL = false;
        this.LLJJL = new Matrix();
        this.LLLFF = EnumC1296010jpX.AUTOMATIC;
        AUListenerS269S0100000_20 aUListenerS269S0100000_20 = new AUListenerS269S0100000_20(this, 0);
        this.LLLFFI = aUListenerS269S0100000_20;
        this.LLLFZ = new Semaphore(1);
        this.LLLI = new ARunnableS120S0100000_20(this, 21);
        this.LLLII = -3.4028235E38f;
        this.LLLIIII = false;
        choreographerFrameCallbackC1295930jpP.addUpdateListener(aUListenerS269S0100000_20);
    }

    public final C1295350joT LJII() {
        if (getCallback() == null) {
            return null;
        }
        if (this.LLJIJIL == null) {
            C1295350joT c1295350joT = new C1295350joT(getCallback(), this.LLJILLL);
            this.LLJIJIL = c1295350joT;
            String str = this.LLJILJILJ;
            if (str != null) {
                c1295350joT.LJFF = str;
            }
        }
        return this.LLJIJIL;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return LJIIIZ();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        LJIIJJI();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LLJJIJIL;
    }

    public final void LJI(Canvas canvas) {
        C1294740jnU c1294740jnU = this.LLJJIJIIJIL;
        C1294720jnS c1294720jnS = this.LL;
        if (c1294740jnU != null && c1294720jnS != null) {
            this.LLJJL.reset();
            if (!getBounds().isEmpty()) {
                this.LLJJL.preScale(r4.width() / c1294720jnS.LJIIIZ.width(), r4.height() / c1294720jnS.LJIIIZ.height());
                this.LLJJL.preTranslate(r4.left, r4.top);
            }
            c1294740jnU.LIZ(canvas, this.LLJJL, this.LLJJIJIL);
        }
    }

    public final List<C1295090jo3> LJIILIIL(C1295090jo3 c1295090jo3) {
        if (this.LLJJIJIIJIL == null) {
            C1292050jj9.LIZIZ("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.LLJJIJIIJIL.LJ(c1295090jo3, 0, arrayList, new C1295090jo3(new String[0]));
        return arrayList;
    }

    public final boolean LJIILL(C1294720jnS c1294720jnS) {
        if (this.LL == c1294720jnS) {
            return false;
        }
        this.LLLIIII = true;
        LIZLLL();
        this.LL = c1294720jnS;
        LIZJ();
        this.LLILLJJLI.LJIIJ(c1294720jnS);
        LJJIII(this.LLILLJJLI.getAnimatedFraction());
        Iterator it2 = new ArrayList(this.LLIZ).iterator();
        while (it2.hasNext()) {
            InterfaceC1296220jps interfaceC1296220jps = (InterfaceC1296220jps) it2.next();
            if (interfaceC1296220jps != null) {
                interfaceC1296220jps.run();
            }
            it2.remove();
        }
        this.LLIZ.clear();
        c1294720jnS.LIZ.LIZ = this.LLJJJ;
        LJ();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void LJIILLIIL(final int i) {
        if (this.LL == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpj
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJIILLIIL(i);
                }
            });
        } else {
            this.LLILLJJLI.LJIIJJI(i);
        }
    }

    public final void LJIIZILJ(final int i) {
        if (this.LL == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpn
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJIIZILJ(i);
                }
            });
            return;
        }
        ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP = this.LLILLJJLI;
        choreographerFrameCallbackC1295930jpP.LJIIL(choreographerFrameCallbackC1295930jpP.LLJI, i + 0.99f);
    }

    public final void LJIJ(final String str) {
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpp
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJIJ(str);
                }
            });
            return;
        }
        C1295850jpH c1295850jpHLIZJ = c1294720jnS.LIZJ(str);
        if (c1295850jpHLIZJ != null) {
            LJIIZILJ((int) (c1295850jpHLIZJ.LIZIZ + c1295850jpHLIZJ.LIZJ));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot find marker with name ");
        sbLIZ.append(str);
        sbLIZ.append(e3.d);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIJI(final float f) {
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpc
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJIJI(f);
                }
            });
            return;
        }
        ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP = this.LLILLJJLI;
        float f2 = c1294720jnS.LJIIJ;
        float f3 = c1294720jnS.LJIIJJI;
        PointF pointF = C1295100jo4.LIZ;
        choreographerFrameCallbackC1295930jpP.LJIIL(choreographerFrameCallbackC1295930jpP.LLJI, f2 + (f * (f3 - f2)));
    }

    public final void LJIJJLI(final String str) {
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpl
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJIJJLI(str);
                }
            });
            return;
        }
        C1295850jpH c1295850jpHLIZJ = c1294720jnS.LIZJ(str);
        if (c1295850jpHLIZJ != null) {
            int i = (int) c1295850jpHLIZJ.LIZIZ;
            LJIJJ(i, ((int) c1295850jpHLIZJ.LIZJ) + i);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot find marker with name ");
            sbLIZ.append(str);
            sbLIZ.append(e3.d);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJJI(final int i) {
        if (this.LL == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpm
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJJI(i);
                }
            });
        } else {
            this.LLILLJJLI.LJIIL(i, (int) r2.LLJIJIL);
        }
    }

    public final void LJJIFFI(final String str) {
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpr
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJJIFFI(str);
                }
            });
            return;
        }
        C1295850jpH c1295850jpHLIZJ = c1294720jnS.LIZJ(str);
        if (c1295850jpHLIZJ != null) {
            LJJI((int) c1295850jpHLIZJ.LIZIZ);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot find marker with name ");
        sbLIZ.append(str);
        sbLIZ.append(e3.d);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJII(final float f) {
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpg
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJJII(f);
                }
            });
            return;
        }
        float f2 = c1294720jnS.LJIIJ;
        float f3 = c1294720jnS.LJIIJJI;
        PointF pointF = C1295100jo4.LIZ;
        LJJI((int) (f2 + (f * (f3 - f2))));
    }

    public final void LJJIII(final float f) {
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpd
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJJIII(f);
                }
            });
            return;
        }
        ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP = this.LLILLJJLI;
        float f2 = c1294720jnS.LJIIJ;
        float f3 = c1294720jnS.LJIIJJI;
        PointF pointF = C1295100jo4.LIZ;
        choreographerFrameCallbackC1295930jpP.LJIIJJI(f2 + (f * (f3 - f2)));
    }

    public final void LJJIIJ(int i) {
        this.LLILLJJLI.setRepeatCount(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0jpX] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C1294740jnU c1294740jnU = this.LLJJIJIIJIL;
        if (c1294740jnU == null) {
            return;
        }
        ?? r3 = this.LLLFF;
        try {
            if (r3 == EnumC1296010jpX.ENABLED) {
                r3 = 1;
                r3 = 1;
                r3 = 1;
                r3 = 1;
                try {
                    this.LLLFZ.acquire();
                    if (LJJIIJZLJL()) {
                        LJJIII(this.LLILLJJLI.LJFF());
                    }
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (r3 != 0) {
                        this.LLLFZ.release();
                        if (c1294740jnU.LJJIJIL == this.LLILLJJLI.LJFF()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                r3 = 0;
            }
            if (this.LLILZIL) {
                try {
                    if (this.LLJJJJLIIL) {
                        LJIIL(canvas, c1294740jnU);
                    } else {
                        LJI(canvas);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1292050jj9.LIZ.getClass();
                }
            } else if (this.LLJJJJLIIL) {
                LJIIL(canvas, c1294740jnU);
            } else {
                LJI(canvas);
            }
            this.LLLIIII = false;
            if (r3 != 0) {
                this.LLLFZ.release();
                if (c1294740jnU.LJJIJIL == this.LLILLJJLI.LJFF()) {
                    return;
                }
                LLLIIIIL.execute(this.LLLI);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (r3 != 0) {
                this.LLLFZ.release();
                if (c1294740jnU.LJJIJIL != this.LLILLJJLI.LJFF()) {
                    LLLIIIIL.execute(this.LLLI);
                }
            }
            throw th2;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LLJJIJIL = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C1292050jj9.LIZIZ("Use addColorFilter instead.");
    }

    public static void LJFF(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(android.graphics.Canvas r11, X.C1294740jnU r12) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1295950jpR.LJIIL(android.graphics.Canvas, X.0jnU):void");
    }

    public final void LJIJJ(final int i, final int i2) {
        if (this.LL == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpk
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJIJJ(i, i2);
                }
            });
        } else {
            this.LLILLJJLI.LJIIL(i, i2 + 0.99f);
        }
    }

    public final void LJJ(final float f, final float f2) {
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpf
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJJ(f, f2);
                }
            });
            return;
        }
        float f3 = c1294720jnS.LJIIJ;
        float f4 = c1294720jnS.LJIIJJI;
        PointF pointF = C1295100jo4.LIZ;
        LJIJJ((int) ((f * (f4 - f3)) + f3), (int) (f3 + (f2 * (f4 - f3))));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            EnumC1296020jpY enumC1296020jpY = this.LLILZLL;
            if (enumC1296020jpY == EnumC1296020jpY.PLAY) {
                LJIIJJI();
            } else if (enumC1296020jpY == EnumC1296020jpY.RESUME) {
                LJIILJJIL();
                return visible;
            }
        } else {
            if (this.LLILLJJLI.LLJILJILJ) {
                LJIIJ();
                this.LLILZLL = EnumC1296020jpY.RESUME;
                return visible;
            }
            if (!z3) {
                this.LLILZLL = EnumC1296020jpY.NONE;
                return visible;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final <T> void LIZ(final C1295090jo3 c1295090jo3, final T t, final C1295400joY<T> c1295400joY) {
        C1294740jnU c1294740jnU = this.LLJJIJIIJIL;
        if (c1294740jnU == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpb
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LIZ(c1295090jo3, t, c1295400joY);
                }
            });
            return;
        }
        if (c1295090jo3 == C1295090jo3.LIZJ) {
            c1294740jnU.LJII(c1295400joY, t);
        } else {
            InterfaceC1295760jp8 interfaceC1295760jp8 = c1295090jo3.LIZIZ;
            if (interfaceC1295760jp8 != null) {
                interfaceC1295760jp8.LJII(c1295400joY, t);
            } else {
                List<C1295090jo3> listLJIILIIL = LJIILIIL(c1295090jo3);
                for (int i = 0; i < listLJIILIIL.size(); i++) {
                    ((C1295090jo3) ListProtector.get(listLJIILIIL, i)).LIZIZ.LJII(c1295400joY, t);
                }
                if (!(true ^ listLJIILIIL.isEmpty())) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (t == InterfaceC1295080jo2.LJJIIZ) {
            LJJIII(this.LLILLJJLI.LJFF());
        }
    }

    public final void LJIL(final String str, final String str2, final boolean z) {
        float f;
        C1294720jnS c1294720jnS = this.LL;
        if (c1294720jnS == null) {
            this.LLIZ.add(new InterfaceC1296220jps() { // from class: X.0jpq
                @Override // X.InterfaceC1296220jps
                public final void run() {
                    this.LIZ.LJIL(str, str2, z);
                }
            });
            return;
        }
        C1295850jpH c1295850jpHLIZJ = c1294720jnS.LIZJ(str);
        if (c1295850jpHLIZJ != null) {
            int i = (int) c1295850jpHLIZJ.LIZIZ;
            C1295850jpH c1295850jpHLIZJ2 = this.LL.LIZJ(str2);
            if (c1295850jpHLIZJ2 != null) {
                float f2 = c1295850jpHLIZJ2.LIZIZ;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                LJIJJ(i, (int) (f2 + f));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot find marker with name ");
            sbLIZ.append(str2);
            sbLIZ.append(e3.d);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Cannot find marker with name ");
        sbLIZ2.append(str);
        sbLIZ2.append(e3.d);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }
}

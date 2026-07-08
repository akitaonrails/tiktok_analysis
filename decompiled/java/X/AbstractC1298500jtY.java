package X;

import Y.ARunnableS120S0100000_20;
import android.app.Activity;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jtY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1298500jtY {
    public WeakReference<UIBody> LIZ;
    public ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ LIZIZ;
    public ViewTreeObserverOnScrollChangedListenerC1298510jtZ LIZJ;
    public ViewTreeObserverOnDrawListenerC1298520jta LIZLLL;
    public ViewTreeObserver LJ;
    public boolean LJFF;
    public long LJII;
    public BPEAHandler LJIIIIZZ;
    public ARunnableS120S0100000_20 LJIIIZ;
    public BPEAHandler LJIIJ;
    public RunnableC1298440jtS LJIIJJI;
    public RectF LJIIL;
    public boolean LJIILJJIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public final String LJIJJ;
    public long LJI = 50;
    public long LJIILIIL = 50;
    public final int[] LJIILL = new int[2];
    public final int[] LJIJI = new int[2];
    public boolean LJIILLIIL = true;

    public void LJIIIIZZ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0jtS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r4 = this;
            java.lang.String r1 = r4.LJIJJ
            java.lang.String r0 = "addToObserverTree"
            com.lynx.base.log.LynxLog.i(r1, r0)
            java.lang.ref.WeakReference<com.lynx.tasm.behavior.ui.UIBody> r0 = r4.LIZ
            java.lang.Object r0 = r0.get()
            com.lynx.tasm.behavior.ui.LynxBaseUI r0 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r0
            if (r0 == 0) goto L37
            j27.s r2 = r0.mContext
            if (r2 == 0) goto L37
            X.0kCZ r0 = r2.LLLIIII
            if (r0 == 0) goto L85
            int r0 = r0.LJJIJIL
            if (r0 <= 0) goto L29
        L1d:
            r1 = 1000(0x3e8, float:1.401E-42)
            int r1 = r1 / r0
            r0 = 16
            int r0 = java.lang.Math.max(r0, r1)
            long r0 = (long) r0
            r4.LJI = r0
        L29:
            X.0kCZ r1 = r2.LLLIIII
            if (r1 == 0) goto L83
            boolean r0 = r1.LJJII
        L2f:
            r4.LJIILLIIL = r0
            if (r1 == 0) goto L81
            boolean r0 = r1.LJJIII
        L35:
            r4.LJIIZILJ = r0
        L37:
            r4.LJIIIZ()
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r4.LJIIIIZZ
            if (r0 != 0) goto L49
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            r4.LJIIIIZZ = r1
        L49:
            Y.ARunnableS120S0100000_20 r0 = r4.LJIIIZ
            if (r0 != 0) goto L56
            Y.ARunnableS120S0100000_20 r1 = new Y.ARunnableS120S0100000_20
            r0 = 214(0xd6, float:3.0E-43)
            r1.<init>(r4, r0)
            r4.LJIIIZ = r1
        L56:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = r4.LJIIIIZZ
            Y.ARunnableS120S0100000_20 r0 = r4.LJIIIZ
            X.C786410Ut5.LJJZZIII(r1, r0)
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r4.LJIIJ
            if (r0 != 0) goto L6c
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            r4.LJIIJ = r1
        L6c:
            X.0jtS r0 = r4.LJIIJJI
            if (r0 != 0) goto L77
            X.0jtS r0 = new X.0jtS
            r0.<init>(r4)
            r4.LJIIJJI = r0
        L77:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = r4.LJIIJ
            X.0jtS r2 = r4.LJIIJJI
            long r0 = r4.LJIILIIL
            X.C786410Ut5.LJLIIL(r0, r3, r2)
            return
        L81:
            r0 = 0
            goto L35
        L83:
            r0 = 1
            goto L2f
        L85:
            r0 = 20
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1298500jtY.LIZIZ():void");
    }

    public final void LIZJ() {
        ViewTreeObserver viewTreeObserver;
        LynxLog.i(this.LJIJJ, "destroy");
        BPEAHandler bPEAHandler = this.LJIIIIZZ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
            this.LJIIIIZZ = null;
        }
        BPEAHandler bPEAHandler2 = this.LJIIJ;
        if (bPEAHandler2 != null) {
            bPEAHandler2.removeCallbacksAndMessages(null);
            this.LJIIJ = null;
        }
        ViewTreeObserver viewTreeObserver2 = this.LJ;
        if (viewTreeObserver2 == null || !viewTreeObserver2.isAlive()) {
            C1310660kDA c1310660kDALJFF = LJFF();
            if (c1310660kDALJFF == null) {
                LynxLog.e(this.LJIJJ, "LynxObserver getViewTreeObserver failed since rootView is null");
                viewTreeObserver = null;
            } else {
                viewTreeObserver = c1310660kDALJFF.getViewTreeObserver();
            }
            this.LJ = viewTreeObserver;
        }
        ViewTreeObserver viewTreeObserver3 = this.LJ;
        if (viewTreeObserver3 == null) {
            LynxLog.e(this.LJIJJ, "LynxObserverManager remove listeners failed since observer is null");
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ = this.LIZIZ;
        viewTreeObserver3.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1339270kxJ);
        C2187701Ajg.LIZIZ(viewTreeObserver3, viewTreeObserverOnGlobalLayoutListenerC1339270kxJ, ViewTreeObserver.OnGlobalLayoutListener.class);
        C786410Ut5.E3(this.LJ, this.LIZJ);
        C786410Ut5.B3(this.LJ, this.LIZLLL);
        this.LJ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    public final C1310660kDA LJFF() {
        UIBody uIBody = this.LIZ.get();
        if (uIBody != null) {
            return uIBody.LL;
        }
        LynxLog.e(this.LJIJJ, "LynxObserver getRootView failed since rootUI is null");
        return null;
    }

    public final void LJII() {
        if (!this.LJFF) {
            LynxLog.e(this.LJIJJ, "Lynx observerHandler failed since rootView not draw");
        } else if (this.LJIILJJIL) {
            LynxLog.w(this.LJIJJ, "Lynx observerHandler failed since inner function is delayed");
        } else {
            C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 213));
        }
    }

    public final void LJIIJ() {
        if (this.LJIIIIZZ == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJII;
        long j = this.LJI;
        if (jCurrentTimeMillis > j) {
            this.LJII = System.currentTimeMillis();
            C786410Ut5.LJJZZIII(this.LJIIIIZZ, this.LJIIIZ);
            this.LJIJ = false;
        } else {
            if (this.LJIJ) {
                return;
            }
            C786410Ut5.LJLIIL(j, this.LJIIIIZZ, this.LJIIIZ);
            this.LJIJ = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0jta] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0jtZ] */
    public final void LJIIIZ() {
        C1310660kDA c1310660kDALJFF = LJFF();
        if (c1310660kDALJFF == null) {
            LynxLog.e(this.LJIJJ, "LynxObserver getViewTreeObserver failed since rootView is null");
        } else {
            ViewTreeObserver viewTreeObserver = c1310660kDALJFF.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (this.LIZIZ == null) {
                    this.LIZIZ = new ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ(this, 3);
                }
                if (this.LIZJ == null) {
                    this.LIZJ = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0jtZ
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            this.LL.LJIIJ();
                        }
                    };
                }
                if (this.LIZLLL == null) {
                    this.LIZLLL = new ViewTreeObserver.OnDrawListener() { // from class: X.0jta
                        @Override // android.view.ViewTreeObserver.OnDrawListener
                        public final void onDraw() {
                            this.LL.LJIIJ();
                        }
                    };
                }
                if (viewTreeObserver != this.LJ) {
                    this.LJ = viewTreeObserver;
                    C786410Ut5.x3(this.LJ, this.LIZIZ);
                    C786410Ut5.z3(this.LJ, this.LIZJ);
                    C786410Ut5.w3(this.LJ, this.LIZLLL);
                    return;
                }
                return;
            }
        }
        LynxLog.e(this.LJIJJ, "LynxObserverManager add listeners failed since observer is null");
    }

    public AbstractC1298500jtY(String str) {
        this.LJIJJ = str;
    }

    public final RectF LIZLLL(LynxBaseUI lynxBaseUI) {
        RectF rectF = new RectF();
        if (lynxBaseUI == null) {
            LynxLog.e(this.LJIJJ, "LynxObserverManager getBoundsOnScreenOfLynxBaseUI failed since ui is null");
            return rectF;
        }
        if (LynxEnv.inst().enableTransformForPositionCalculation()) {
            RectF rectFLJ = C1292490jjr.LJ(lynxBaseUI, new RectF(0.0f, 0.0f, lynxBaseUI.getWidth(), lynxBaseUI.getHeight()));
            rectF.set(rectFLJ.left, rectFLJ.top, rectFLJ.right, rectFLJ.bottom);
            return rectF;
        }
        if (lynxBaseUI instanceof LynxUI) {
            LJ(((LynxUI) lynxBaseUI).mView, rectF);
            float f = rectF.left;
            rectF.set(f, rectF.top, lynxBaseUI.getWidth() + f, rectF.top + lynxBaseUI.getHeight());
        } else if (lynxBaseUI instanceof LynxFlattenUI) {
            for (LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI(); parentBaseUI != null; parentBaseUI = parentBaseUI.getParentBaseUI()) {
                if (parentBaseUI instanceof LynxUI) {
                    LJ(((LynxUI) parentBaseUI).mView, rectF);
                    rectF.offset(-r2.getScrollX(), -r2.getScrollY());
                    rectF.offset(lynxBaseUI.getLeft(), lynxBaseUI.getTop());
                    float f2 = rectF.left;
                    rectF.set(f2, rectF.top, lynxBaseUI.getWidth() + f2, rectF.top + lynxBaseUI.getHeight());
                    return rectF;
                }
            }
        }
        return rectF;
    }

    public final RectF LJI(s sVar) {
        Window window;
        if (sVar != null) {
            Activity activityLIZ = C1298530jtb.LIZ(sVar);
            int[] iArr = new int[2];
            if (activityLIZ != null && (window = activityLIZ.getWindow()) != null) {
                window.getDecorView().getLocationOnScreen(iArr);
            }
            int i = iArr[0];
            int i2 = iArr[1];
            int[] iArr2 = this.LJIJI;
            return new RectF(i, i2, i + iArr2[0], i2 + iArr2[1]);
        }
        LynxLog.e(this.LJIJJ, "getWindowRect func failed since context is null");
        return new RectF();
    }

    public final void LJIIJJI(s sVar) {
        DisplayMetrics displayMetricsLIZ = DisplayMetricsHolder.LIZ(sVar);
        int[] iArr = this.LJIJI;
        iArr[0] = displayMetricsLIZ.widthPixels;
        iArr[1] = displayMetricsLIZ.heightPixels;
    }

    public final void LJ(View view, RectF rectF) {
        if (view == null) {
            LynxLog.e(this.LJIJJ, "LynxObserverManager getLeftAndTopOfBoundsInScreen failed since view is null");
            return;
        }
        view.getLocationOnScreen(this.LJIILL);
        int[] iArr = this.LJIILL;
        rectF.offset(iArr[0], iArr[1]);
    }
}

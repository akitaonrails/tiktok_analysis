package X;

import Y.ARunnableS123S0100000_23;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.AttachedSurfaceControl;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0oSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474100oSm implements InterfaceC1482650ogZ, InterfaceC1471580oOi {
    public boolean LL;
    public boolean LLILLJJLI;
    public SurfaceView LLILLL;
    public boolean LLILZ;
    public SurfaceControl LLIZ;
    public Surface LLIZLLLIL;
    public final ViewGroup LLJ;
    public int LLJJ;
    public final SurfaceHolderCallbackC1474080oSk LLJJI;
    public int[] LLJJIII;
    public Rect LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final ViewTreeObserverOnPreDrawListenerC1554400qYI LLJJIJIL;
    public final ARunnableS123S0100000_23 LLJJJ;
    public final Set<InterfaceC1473950oSX> LLILZIL = new LinkedHashSet();
    public SurfaceControl.Transaction LLILZLL = new SurfaceControl.Transaction();
    public int LLJI = 0;
    public int LLJIJIL = 0;
    public boolean LLJILJIL = true;
    public boolean LLJILJILJ = false;
    public C1170404hy LLJILLL = null;

    @Override // X.InterfaceC1482650ogZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJFF() {
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJI(String str) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LJIIIZ(String str) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIILIIL(String str, boolean z) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final int LJIILL() {
        return 2;
    }

    @Override // X.InterfaceC1482650ogZ
    public final boolean LJIJI() {
        return false;
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIJJLI(String str) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LJLJLLL(String str) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void jj(boolean z) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void onPagePause() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void resume() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LIZLLL() {
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup == null || this.LLILLL == null) {
            return;
        }
        HandlerHook.viewRemoveCallbacks(viewGroup, this.LLJJJ);
        LJII("from_scrolling");
        ViewGroup viewGroup2 = this.LLJ;
        if (viewGroup2 != null && !this.LLJJIJIIJIL) {
            C786410Ut5.y3(viewGroup2.getViewTreeObserver(), this.LLJJIJIL);
            this.LLJJIJIIJIL = true;
        }
        this.LLILLJJLI = this.LL;
    }

    public final void LJIIIIZZ() {
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            C786410Ut5.D3(viewGroup.getViewTreeObserver(), this.LLJJIJIL);
        }
        this.LLJJIJIIJIL = false;
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIIZILJ() {
        if (this.LLILLL != null) {
            release();
            C786410Ut5.LLIIII(this.LLILLL, 8);
            C786410Ut5.LLIIII(this.LLILLL, 0);
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void release() {
        SurfaceControl surfaceControl = this.LLIZ;
        if (surfaceControl != null) {
            this.LLILZLL.reparent(surfaceControl, null);
            this.LLILZLL.apply();
            this.LLIZ.release();
            this.LLIZ = null;
        }
        Surface surface = this.LLIZLLLIL;
        if (surface != null) {
            surface.release();
            C1471640oOo.LJ.remove(this.LLIZLLLIL);
            this.LLIZLLLIL = null;
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final boolean Da() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1482650ogZ
    public final View Hk() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1482650ogZ
    public final Surface getSurface() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1482650ogZ
    public final View getView() {
        return this.LLJ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0oSk] */
    public C1474100oSm(ViewGroup viewGroup) {
        new BPEAHandler(Looper.getMainLooper());
        this.LLJJ = 0;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: X.0oSl
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C1474100oSm c1474100oSm = this.LL;
                ViewGroup viewGroup2 = c1474100oSm.LLJ;
                if (viewGroup2 == null) {
                    return;
                }
                if (C1481110oe5.LIZ && c1474100oSm.LLILLL != null) {
                    viewGroup2.getLocationOnScreen(new int[2]);
                    C1474100oSm c1474100oSm2 = this.LL;
                    c1474100oSm2.LIZIZ(c1474100oSm2.LLJ);
                }
                C1474100oSm c1474100oSm3 = this.LL;
                c1474100oSm3.LLJI = c1474100oSm3.LLJ.getWidth();
                C1474100oSm c1474100oSm4 = this.LL;
                c1474100oSm4.LLJIJIL = c1474100oSm4.LLJ.getHeight();
                try {
                    SurfaceControl surfaceControl = this.LL.LLIZ;
                    if (surfaceControl != null && surfaceControl.isValid() && Build.VERSION.SDK_INT >= 33) {
                        C1474100oSm c1474100oSm5 = this.LL;
                        if (c1474100oSm5.LLJILJIL) {
                            c1474100oSm5.LJII("from_layout_change");
                            this.LL.LLJILJIL = false;
                        }
                        C1474100oSm c1474100oSm6 = this.LL;
                        c1474100oSm6.LLILZLL.setBufferSize(c1474100oSm6.LLIZ, c1474100oSm6.LLJ.getWidth(), this.LL.LLJ.getHeight());
                        this.LL.LLILZLL.apply();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (C1481110oe5.LIZ) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: X.0oSj
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                SurfaceView surfaceView = this.LL.LLILLL;
                if (surfaceView != null && surfaceView.getSurfaceControl() != null && this.LL.LLJ != null) {
                    view.getLocationOnScreen(new int[2]);
                    this.LL.LLIZ = new SurfaceControl.Builder().setName("surface_view_control").setParent(this.LL.LLILLL.getSurfaceControl()).setBufferSize(this.LL.LLJ.getWidth(), this.LL.LLJ.getHeight()).setFormat(1).build();
                    this.LL.LLIZLLLIL = new Surface(this.LL.LLIZ);
                    C1474100oSm c1474100oSm = this.LL;
                    C1471640oOo.LJ.put(c1474100oSm.LLIZLLLIL, c1474100oSm);
                    C1474100oSm c1474100oSm2 = this.LL;
                    c1474100oSm2.LLJI = c1474100oSm2.LLJ.getWidth();
                    C1474100oSm c1474100oSm3 = this.LL;
                    c1474100oSm3.LLJIJIL = c1474100oSm3.LLJ.getHeight();
                    try {
                        C1474100oSm c1474100oSm4 = this.LL;
                        c1474100oSm4.LLILZLL.setVisibility(c1474100oSm4.LLIZ, true);
                        if (Build.VERSION.SDK_INT >= 33) {
                            C1474100oSm c1474100oSm5 = this.LL;
                            c1474100oSm5.LLILZLL.setPosition(c1474100oSm5.LLIZ, c1474100oSm5.LLILLL.getWidth() * 2, 0.0f);
                        }
                        this.LL.LLILZLL.apply();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (C1481110oe5.LIZ) {
                            throw new RuntimeException(e);
                        }
                    }
                    C1474100oSm c1474100oSm6 = this.LL;
                    if (c1474100oSm6.LLJJ != 0) {
                        c1474100oSm6.LJIIIIZZ();
                        this.LL.LIZLLL();
                    }
                    C1474100oSm c1474100oSm7 = this.LL;
                    c1474100oSm7.LLILZ = true;
                    Iterator<InterfaceC1473950oSX> it2 = c1474100oSm7.LLILZIL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LLILLIZIL(0, 0);
                    }
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                C1474100oSm c1474100oSm = this.LL;
                if (c1474100oSm.LLIZLLLIL != null) {
                    SurfaceControl surfaceControl = c1474100oSm.LLIZ;
                    if (surfaceControl != null) {
                        c1474100oSm.LLILZLL.reparent(surfaceControl, null);
                        this.LL.LLILZLL.apply();
                    }
                    this.LL.LLIZLLLIL.release();
                    this.LL.LLIZ.release();
                    C1474100oSm c1474100oSm2 = this.LL;
                    c1474100oSm2.LLIZ = null;
                    C1471640oOo.LJ.remove(c1474100oSm2.LLIZLLLIL);
                    C1474100oSm c1474100oSm3 = this.LL;
                    c1474100oSm3.LLIZLLLIL = null;
                    Iterator<InterfaceC1473950oSX> it2 = c1474100oSm3.LLILZIL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ();
                    }
                    this.LL.LLILZ = false;
                }
                this.LL.LJIIIIZZ();
            }
        };
        this.LLJJI = new SurfaceHolder.Callback() { // from class: X.0oSk
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                Surface surface;
                C1474100oSm c1474100oSm = this.LL;
                if (c1474100oSm.LLJ == null) {
                    return;
                }
                if (c1474100oSm.LLIZ == null) {
                    c1474100oSm.LLIZ = new SurfaceControl.Builder().setName("surface_view_control").setParent(this.LL.LLILLL.getSurfaceControl()).setBufferSize(this.LL.LLJ.getWidth(), this.LL.LLJ.getHeight()).setFormat(1).build();
                    this.LL.LLIZLLLIL = new Surface(this.LL.LLIZ);
                    C1474100oSm c1474100oSm2 = this.LL;
                    C1471640oOo.LJ.put(c1474100oSm2.LLIZLLLIL, c1474100oSm2);
                    try {
                        C1474100oSm c1474100oSm3 = this.LL;
                        c1474100oSm3.LLILZLL.setVisibility(c1474100oSm3.LLIZ, true);
                        if (Build.VERSION.SDK_INT >= 33) {
                            C1474100oSm c1474100oSm4 = this.LL;
                            if (c1474100oSm4.LL) {
                                c1474100oSm4.LJII("from_surface_available");
                            } else {
                                SurfaceControl.Transaction transaction = c1474100oSm4.LLILZLL;
                                SurfaceControl surfaceControl = c1474100oSm4.LLIZ;
                                int[] iArr = c1474100oSm4.LLJJIII;
                                transaction.setPosition(surfaceControl, iArr[0], iArr[1]);
                                this.LL.LLILZLL.apply();
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (C1481110oe5.LIZ) {
                            throw new RuntimeException(e);
                        }
                    }
                    C1474100oSm c1474100oSm5 = this.LL;
                    c1474100oSm5.LLILZ = true;
                    Iterator<InterfaceC1473950oSX> it2 = c1474100oSm5.LLILZIL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LLILLIZIL(0, 0);
                    }
                }
                C1474100oSm c1474100oSm6 = this.LL;
                if (c1474100oSm6.LLJILJILJ && (surface = c1474100oSm6.LLIZLLLIL) != null && surface.isValid()) {
                    C1474100oSm c1474100oSm7 = this.LL;
                    c1474100oSm7.LLJILJILJ = false;
                    c1474100oSm7.LLILZLL.reparent(c1474100oSm7.LLIZ, c1474100oSm7.LLILLL.getSurfaceControl());
                    C1474100oSm c1474100oSm8 = this.LL;
                    c1474100oSm8.LLILZLL.setVisibility(c1474100oSm8.LLIZ, true);
                    this.LL.LLILZLL.apply();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                this.LL.LLJILJILJ = true;
            }
        };
        this.LLJJIII = new int[]{2160, 0};
        this.LLJJIJI = new Rect();
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = new ViewTreeObserverOnPreDrawListenerC1554400qYI(this, 1);
        this.LLJJJ = new ARunnableS123S0100000_23(this, 220);
        this.LLJ = viewGroup;
        View view = (View) viewGroup.getTag();
        if (view != null) {
            view.setBackground(null);
        }
        viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
        viewGroup.addOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    @Override // X.InterfaceC1482650ogZ
    public final void Dn(InterfaceC1473950oSX interfaceC1473950oSX) {
        this.LLILZIL.add(interfaceC1473950oSX);
    }

    public final int[] LIZIZ(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        SurfaceView surfaceView = this.LLILLL;
        if (surfaceView != null) {
            surfaceView.getLocationOnScreen(iArr2);
        }
        return new int[]{iArr[0] - iArr2[0], iArr[1] - iArr2[1]};
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJ(final InterfaceC1474030oSf interfaceC1474030oSf) {
        ViewGroup viewGroup;
        if (this.LLIZLLLIL != null && this.LLILLL != null && (viewGroup = this.LLJ) != null) {
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewGroup.getWidth(), this.LLJ.getHeight(), Bitmap.Config.ARGB_8888);
            PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.0oSg
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    InterfaceC1474030oSf interfaceC1474030oSf2 = interfaceC1474030oSf;
                    Bitmap bitmap = bitmapCreateBitmap;
                    if (i == 0) {
                        interfaceC1474030oSf2.LIZ(bitmap);
                    } else {
                        interfaceC1474030oSf2.LIZ(null);
                    }
                }
            };
            try {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getBitmap. use mVideoSurface:");
                    sbLIZ.append(this.LLIZLLLIL);
                    C1481110oe5.LIZIZ("getVideoFrame", C2188811AlT.LIZIZ(sbLIZ));
                }
                C1322890kWt.LIZIZ(this.LLIZLLLIL, bitmapCreateBitmap, onPixelCopyFinishedListener, this.LLILLL.getHandler(), C1475000oUE.LJII());
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        interfaceC1474030oSf.LIZ(null);
    }

    public final void LJII(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        Rect rect;
        SurfaceControl surfaceControl;
        Rect rect2;
        Boolean boolValueOf;
        Integer numValueOf;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("internalUpdateSurfaceControlPosition. from:");
            sbLIZ.append(str);
            sbLIZ.append(", mSurfaceControl valid:");
            SurfaceControl surfaceControl2 = this.LLIZ;
            String str2 = null;
            if (surfaceControl2 == null) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(surfaceControl2.isValid());
            }
            sbLIZ.append(boolValueOf);
            sbLIZ.append(", mSurfaceView:");
            sbLIZ.append(this.LLILLL);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("  , mContainer:");
            ViewGroup viewGroup = this.LLJ;
            if (viewGroup != null) {
                numValueOf = Integer.valueOf(viewGroup.hashCode());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(" mSurfaceControl:");
            sbLIZ2.append(this.LLIZ);
            sbLIZ2.append(", title:");
            C1170404hy c1170404hy = this.LLJILLL;
            if (c1170404hy != null) {
                str2 = c1170404hy.LIZIZ;
            }
            sbLIZ2.append(str2);
            sbLIZ2.append(", this:");
            sbLIZ2.append(this);
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LLJJIII = LIZIZ(this.LLJ);
        ViewGroup viewGroup2 = this.LLJ;
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        View view = (View) viewGroup2.getTag();
        if (view == null) {
            rect = new Rect();
        } else {
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            int i5 = iArr[0];
            int i6 = iArr2[0];
            int i7 = i5 - i6;
            int width = (i5 + this.LLJI) - (i6 + view.getWidth());
            int i8 = iArr[1];
            int i9 = iArr2[1];
            int i10 = i8 - i9;
            int height = (i8 + this.LLJIJIL) - (i9 + view.getHeight());
            if (i7 >= 0) {
                i = 0;
            } else {
                i = -i7;
            }
            if (width >= 0) {
                i2 = this.LLJI - width;
            } else {
                i2 = this.LLJI;
            }
            if (i10 >= 0) {
                i3 = 0;
            } else {
                i3 = -i10;
            }
            if (height >= 0) {
                i4 = this.LLJIJIL - height;
            } else {
                i4 = this.LLJIJIL;
            }
            rect = new Rect(i, i3, i2, i4);
        }
        this.LLJJIJI = rect;
        if (this.LLJ != null && (surfaceControl = this.LLIZ) != null && this.LLILLL != null && surfaceControl.isValid() && (rect2 = this.LLJJIJI) != null && rect2.left <= rect2.right && rect2.top <= rect2.bottom) {
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    if ((!this.LLILLJJLI && !this.LL) || (this.LLJJ == 0 && !this.LL)) {
                        this.LLILZLL.setPosition(this.LLIZ, this.LLILLL.getWidth() * 2, 0.0f);
                    } else {
                        SurfaceControl.Transaction transaction = this.LLILZLL;
                        SurfaceControl surfaceControl3 = this.LLIZ;
                        int[] iArr3 = this.LLJJIII;
                        transaction.setPosition(surfaceControl3, iArr3[0], iArr3[1]);
                    }
                    this.LLILZLL.setCrop(this.LLIZ, this.LLJJIJI);
                    AttachedSurfaceControl rootSurfaceControl = this.LLJ.getRootSurfaceControl();
                    if (rootSurfaceControl != null) {
                        rootSurfaceControl.applyTransactionOnDraw(this.LLILZLL);
                        if (((Boolean) C1474810oTv.J5.getValue()).booleanValue() && i11 == 33) {
                            this.LLILZLL = new SurfaceControl.Transaction();
                            return;
                        }
                        return;
                    }
                    this.LLILZLL.apply();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (C1481110oe5.LIZ) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJIL(SurfaceView surfaceView) {
        this.LLILLL = surfaceView;
        if (surfaceView == null) {
            return;
        }
        surfaceView.getHolder().addCallback(this.LLJJI);
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJJ(C1170404hy c1170404hy) {
        this.LLJILLL = c1170404hy;
    }

    @Override // X.InterfaceC1482650ogZ
    public final void q3(boolean z) {
        HandlerHook.viewPostDelay(this.LLJ, this.LLJJJ, ((Number) C1474810oTv.I5.getValue()).intValue());
        HandlerHook.viewPost(this.LLJ, new ARunnableS123S0100000_23(this, 221));
        this.LLJJIJIIJIL = false;
        this.LLILLJJLI = this.LL;
    }

    @Override // X.InterfaceC1482650ogZ
    public final void s5(InterfaceC1473950oSX interfaceC1473950oSX) {
        this.LLILZIL.remove(interfaceC1473950oSX);
    }

    @Override // X.InterfaceC1482650ogZ
    public final void u(boolean z, boolean z2) {
        this.LL = z;
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJIIJ(float f, int i, int i2, int i3) {
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.LLJJ = i3;
        }
    }
}

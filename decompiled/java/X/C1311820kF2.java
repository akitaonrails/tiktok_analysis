package X;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kF2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311820kF2 {
    public WeakReference<LynxUI> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public Rect LJIIZILJ;
    public ViewOnAttachStateChangeListenerC1311830kF3 LJIJ;
    public C1311880kF8 LJIJI;
    public C1312080kFS LJIJJ;
    public C1311890kF9 LJIJJLI;
    public final SparseArray<InterfaceC1311790kEz> LJIL = new SparseArray<>(0);
    public float LJJ = -1.0f;
    public boolean LJJI = false;

    public final void LIZIZ() {
        WeakReference<LynxUI> weakReference = this.LIZ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.LIZ.get().updateLayout(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIIZILJ);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kF8] */
    public final AbstractC1312060kFQ LIZLLL() {
        if (this.LJIJI == null) {
            this.LJIJI = new AbstractC1312070kFR() { // from class: X.0kF8
                @Override // X.AbstractC1312070kFR
                public final boolean LIZLLL() {
                    return false;
                }
            };
        }
        return this.LJIJI;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kF9] */
    public final AbstractC1312060kFQ LJ() {
        if (this.LJIJJLI == null) {
            this.LJIJJLI = new AbstractC1312070kFR() { // from class: X.0kF9
                @Override // X.AbstractC1312070kFR
                public final boolean LIZLLL() {
                    return true;
                }
            };
        }
        return this.LJIJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kFS] */
    public final AbstractC1312060kFQ LJFF() {
        if (this.LJIJJ == null) {
            this.LJIJJ = new AbstractC1312060kFQ() { // from class: X.0kFS
                @Override // X.AbstractC1312060kFQ
                public final Animation LIZIZ(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f) {
                    boolean z;
                    boolean z2 = false;
                    if (lynxUI.getOriginLeft() == i && lynxUI.getOriginTop() == i2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (lynxUI.getWidth() != i3 || lynxUI.getHeight() != i4) {
                        z2 = true;
                    }
                    if (!z) {
                        if (!z2) {
                            return null;
                        }
                    } else if (!z2) {
                        return new TranslateAnimation(lynxUI.getOriginLeft() - i, 0.0f, lynxUI.getOriginTop() - i2, 0.0f);
                    }
                    return new C1312090kFT(lynxUI, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
                }
            };
        }
        return this.LJIJJ;
    }

    public final LynxUI LJI() {
        WeakReference<LynxUI> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void LIZJ(String str) {
        WeakReference<LynxUI> weakReference;
        T t;
        ViewOnAttachStateChangeListenerC1311830kF3 viewOnAttachStateChangeListenerC1311830kF3 = this.LJIJ;
        if (viewOnAttachStateChangeListenerC1311830kF3 != null && viewOnAttachStateChangeListenerC1311830kF3.LLILLJJLI.equals(str) && (weakReference = this.LIZ) != null && weakReference.get() != null && (t = this.LIZ.get().mView) != 0 && t.getAnimation() != null) {
            t.clearAnimation();
            LIZIZ();
        }
    }

    public final void LJII(String str) {
        LynxUI lynxUILJI = LJI();
        if (lynxUILJI == null) {
            return;
        }
        T t = lynxUILJI.mView;
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.LJIJ;
        if (onAttachStateChangeListener != null) {
            if (t != 0) {
                t.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
            this.LJIJ = null;
        }
        LIZIZ();
        C1291260jhs.LIZ(lynxUILJI, "animationend", str);
    }

    public final void LIZ(View view, String str) {
        if (LJI() == null) {
            return;
        }
        ViewOnAttachStateChangeListenerC1311830kF3 viewOnAttachStateChangeListenerC1311830kF3 = this.LJIJ;
        if (viewOnAttachStateChangeListenerC1311830kF3 != null && viewOnAttachStateChangeListenerC1311830kF3.LLILLJJLI.equals(str)) {
            return;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.LJIJ;
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        ViewOnAttachStateChangeListenerC1311830kF3 viewOnAttachStateChangeListenerC1311830kF32 = new ViewOnAttachStateChangeListenerC1311830kF3(this, str);
        this.LJIJ = viewOnAttachStateChangeListenerC1311830kF32;
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1311830kF32);
    }

    public final void LJIIIIZZ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = i7;
        this.LJIIIIZZ = i8;
        this.LJIILIIL = i9;
        this.LJIILJJIL = i10;
        this.LJIILL = i11;
        this.LJIILLIIL = i12;
        this.LJIIIZ = i13;
        this.LJIIJ = i14;
        this.LJIIJJI = i15;
        this.LJIIL = i16;
        this.LJIIZILJ = rect;
    }
}

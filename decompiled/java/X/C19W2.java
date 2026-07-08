package X;

import Y.AUListenerS235S0200000_33;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import u4.q0;

/* JADX INFO: renamed from: X.19W2, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19W2 extends C19W7 implements C19WG {
    public static final Interpolator LJJII = new AccelerateInterpolator();
    public static final Interpolator LJJIII = new DecelerateInterpolator();
    public Context LIZ;
    public Context LIZIZ;
    public C19W6 LIZJ;
    public C21545619Tq LIZLLL;
    public C19W5 LJ;
    public C19VE LJFF;
    public final View LJI;
    public boolean LJII;
    public C19VZ LJIIIIZZ;
    public C19VZ LJIIIZ;
    public InterfaceC21549419Vc LJIIJ;
    public boolean LJIIJJI;
    public final ArrayList<InterfaceC21550619Vo> LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public C19W4 LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public final C19W3 LJJ;
    public final C19WA LJJI;
    public final C19WD LJJIFFI;

    @Override // X.C19W7
    public final void LJIILJJIL() {
        LJIJJLI(2, 2);
    }

    @Override // X.C19W7
    public final void LJIILL() {
        LJIJJLI(0, 8);
    }

    @Override // X.C19W7
    public final boolean LIZIZ() {
        C19W5 c19w5 = this.LJ;
        if (c19w5 == null || !c19w5.LJIILL()) {
            return false;
        }
        this.LJ.collapseActionView();
        return true;
    }

    @Override // X.C19W7
    public final int LIZLLL() {
        return this.LJ.LJIILJJIL();
    }

    @Override // X.C19W7
    public final Context LJ() {
        if (this.LIZIZ == null) {
            TypedValue typedValue = new TypedValue();
            this.LIZ.getTheme().resolveAttribute(R.attr.b87, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.LIZIZ = new ContextThemeWrapper(this.LIZ, i);
            } else {
                this.LIZIZ = this.LIZ;
            }
        }
        return this.LIZIZ;
    }

    @Override // X.C19W7
    public final void LJFF() {
        if (this.LJIILLIIL) {
            return;
        }
        this.LJIILLIIL = true;
        LJJ(false);
    }

    @Override // X.C19W7
    public final void LJII() {
        LJIL(this.LIZ.getResources().getBoolean(R.bool.b));
    }

    public C19W2(Dialog dialog) {
        new ArrayList();
        this.LJIIL = new ArrayList<>();
        this.LJIILJJIL = 0;
        this.LJIILL = true;
        this.LJIJI = true;
        this.LJJ = new C19W3(this);
        this.LJJI = new C19WA(this);
        this.LJJIFFI = new C19WD(this);
        LJIJJ(dialog.getWindow().getDecorView());
    }

    @Override // X.C19W7
    public final void LIZJ(boolean z) {
        if (z == this.LJIIJJI) {
            return;
        }
        this.LJIIJJI = z;
        int size = this.LJIIL.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC21550619Vo) ListProtector.get(this.LJIIL, i)).LIZ();
        }
    }

    @Override // X.C19W7
    public final void LJIIL(boolean z) {
        if (!this.LJII) {
            LJIILIIL(z);
        }
    }

    @Override // X.C19W7
    public final void LJIILIIL(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        LJIJJLI(i, 4);
    }

    @Override // X.C19W7
    public final void LJIILLIIL(boolean z) {
        C19W4 c19w4;
        this.LJIJJLI = z;
        if (!z && (c19w4 = this.LJIJJ) != null) {
            c19w4.LIZ();
        }
    }

    @Override // X.C19W7
    public final void LJIIZILJ(CharSequence charSequence) {
        this.LJ.setWindowTitle(charSequence);
    }

    @Override // X.C19W7
    public final AbstractC21549319Vb LJIJ(C19WK c19wk) {
        C19VZ c19vz = this.LJIIIIZZ;
        if (c19vz != null) {
            c19vz.LIZJ();
        }
        this.LIZJ.setHideOnContentScrollEnabled(false);
        this.LJFF.LJII();
        C19VZ c19vz2 = new C19VZ(this, this.LJFF.getContext(), c19wk);
        c19vz2.LLILZ.LJJI();
        try {
            boolean zLIZIZ = c19vz2.LLILZIL.LIZIZ(c19vz2, c19vz2.LLILZ);
            c19vz2.LLILZ.LJJ();
            if (zLIZIZ) {
                this.LJIIIIZZ = c19vz2;
                c19vz2.LJIIIIZZ();
                this.LJFF.LJFF(c19vz2);
                LJIJI(true);
                return c19vz2;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c19vz2.LLILZ.LJJ();
            throw th;
        }
    }

    public final void LJIJI(boolean z) {
        C19WF c19wfLJIIJ;
        C19WF c19wfLJ;
        long duration;
        if (z) {
            if (!this.LJIJ) {
                this.LJIJ = true;
                C19W6 c19w6 = this.LIZJ;
                if (c19w6 != null) {
                    c19w6.setShowingForActionMode(true);
                }
                LJJ(false);
            }
        } else if (this.LJIJ) {
            this.LJIJ = false;
            C19W6 c19w62 = this.LIZJ;
            if (c19w62 != null) {
                c19w62.setShowingForActionMode(false);
            }
            LJJ(false);
        }
        if (this.LIZLLL.isLaidOut()) {
            if (z) {
                c19wfLJ = this.LJ.LJIIJ(4, 100L);
                c19wfLJIIJ = this.LJFF.LJ(0, 200L);
            } else {
                c19wfLJIIJ = this.LJ.LJIIJ(0, 200L);
                c19wfLJ = this.LJFF.LJ(8, 100L);
            }
            C19W4 c19w4 = new C19W4();
            c19w4.LIZ.add(c19wfLJ);
            View view = c19wfLJ.LIZ.get();
            if (view != null) {
                duration = view.animate().getDuration();
            } else {
                duration = 0;
            }
            View view2 = c19wfLJIIJ.LIZ.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            c19w4.LIZ.add(c19wfLJIIJ);
            c19w4.LIZIZ();
            return;
        }
        if (z) {
            this.LJ.setVisibility(4);
            C786410Ut5.LLILII(this.LJFF, 0);
        } else {
            this.LJ.setVisibility(0);
            C786410Ut5.LLILII(this.LJFF, 8);
        }
    }

    public final void LJIJJ(View view) {
        String simpleName;
        C19W5 wrapper;
        C19W6 c19w6 = (C19W6) view.findViewById(R.id.fhh);
        this.LIZJ = c19w6;
        if (c19w6 != null) {
            c19w6.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.a15);
        if (callbackFindViewById instanceof C19W5) {
            wrapper = (C19W5) callbackFindViewById;
        } else if (callbackFindViewById instanceof C19V8) {
            wrapper = ((C19V8) callbackFindViewById).getWrapper();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Can't make a decor toolbar out of ");
            if (callbackFindViewById != null) {
                simpleName = callbackFindViewById.getClass().getSimpleName();
            } else {
                simpleName = "null";
            }
            sbLIZ.append(simpleName);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LJ = wrapper;
        this.LJFF = (C19VE) view.findViewById(R.id.a2u);
        C21545619Tq c21545619Tq = (C21545619Tq) view.findViewById(R.id.a1_);
        this.LIZLLL = c21545619Tq;
        C19W5 c19w5 = this.LJ;
        if (c19w5 != null && this.LJFF != null && c21545619Tq != null) {
            this.LIZ = c19w5.getContext();
            if ((this.LJ.LJIILJJIL() & 4) != 0) {
                this.LJII = true;
            }
            Context context = this.LIZ;
            int i = context.getApplicationInfo().targetSdkVersion;
            this.LJ.LJIILLIIL();
            LJIL(context.getResources().getBoolean(R.bool.b));
            TypedArray typedArrayObtainStyledAttributes = this.LIZ.obtainStyledAttributes(null, R$styleable.ActionBar, R.attr.b82, 0);
            if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.ActionBar_hideOnContentScroll, false)) {
                C19W6 c19w62 = this.LIZJ;
                if (c19w62.LLIZ) {
                    this.LJIL = true;
                    c19w62.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_elevation, 0);
            if (dimensionPixelSize != 0) {
                C14K9.LJIJ(this.LIZLLL, dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C19W2.class.getSimpleName());
        sbLIZ2.append(" can only be used with a compatible window decor layout");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJIL(boolean z) {
        this.LJIILIIL = z;
        if (!z) {
            this.LJ.LJIILIIL();
            this.LIZLLL.setTabContainer(null);
        } else {
            this.LIZLLL.setTabContainer(null);
            this.LJ.LJIILIIL();
        }
        this.LJ.LJIIJJI();
        this.LJ.LJIIIZ(false);
        this.LIZJ.setHasNonEmbeddedTabs(false);
    }

    public final void LJJ(boolean z) {
        boolean z2;
        View view;
        View view2;
        View view3;
        boolean z3 = this.LJIILLIIL;
        boolean z4 = this.LJIIZILJ;
        if (!this.LJIJ && (z3 || z4)) {
            z2 = false;
        } else {
            z2 = true;
        }
        AUListenerS235S0200000_33 aUListenerS235S0200000_33 = null;
        if (z2) {
            if (!this.LJIJI) {
                this.LJIJI = true;
                C19W4 c19w4 = this.LJIJJ;
                if (c19w4 != null) {
                    c19w4.LIZ();
                }
                C21545619Tq c21545619Tq = this.LIZLLL;
                int visibility = c21545619Tq.getVisibility();
                c21545619Tq.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c21545619Tq);
                if (this.LJIILJJIL == 0 && (this.LJIJJLI || z)) {
                    C21545619Tq c21545619Tq2 = this.LIZLLL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545619Tq2);
                    c21545619Tq2.setTranslationY(0.0f);
                    float f = -this.LIZLLL.getHeight();
                    if (z) {
                        this.LIZLLL.getLocationInWindow(new int[]{0, 0});
                        f -= r1[1];
                    }
                    C21545619Tq c21545619Tq3 = this.LIZLLL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545619Tq3);
                    c21545619Tq3.setTranslationY(f);
                    C19W4 c19w42 = new C19W4();
                    C19WF c19wfLIZIZ = q0.LIZIZ(this.LIZLLL);
                    c19wfLIZIZ.LJI(0.0f);
                    C19WD c19wd = this.LJJIFFI;
                    View view4 = c19wfLIZIZ.LIZ.get();
                    if (view4 != null) {
                        if (c19wd != null) {
                            aUListenerS235S0200000_33 = new AUListenerS235S0200000_33(c19wd, view4, 11);
                        }
                        view4.animate().setUpdateListener(aUListenerS235S0200000_33);
                    }
                    if (!c19w42.LJ) {
                        c19w42.LIZ.add(c19wfLIZIZ);
                    }
                    if (this.LJIILL && (view3 = this.LJI) != null) {
                        C786410Ut5.ed(view3, f);
                        C19WF c19wfLIZIZ2 = q0.LIZIZ(this.LJI);
                        c19wfLIZIZ2.LJI(0.0f);
                        if (!c19w42.LJ) {
                            c19w42.LIZ.add(c19wfLIZIZ2);
                        }
                    }
                    Interpolator interpolator = LJJIII;
                    boolean z5 = c19w42.LJ;
                    if (!z5) {
                        c19w42.LIZJ = interpolator;
                        c19w42.LIZIZ = 250L;
                    }
                    C19WA c19wa = this.LJJI;
                    if (!z5) {
                        c19w42.LIZLLL = c19wa;
                    }
                    this.LJIJJ = c19w42;
                    c19w42.LIZIZ();
                } else {
                    C21545619Tq c21545619Tq4 = this.LIZLLL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545619Tq4);
                    c21545619Tq4.setAlpha(1.0f);
                    C21545619Tq c21545619Tq5 = this.LIZLLL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545619Tq5);
                    c21545619Tq5.setTranslationY(0.0f);
                    if (this.LJIILL && (view2 = this.LJI) != null) {
                        C786410Ut5.ed(view2, 0.0f);
                    }
                    this.LJJI.LIZ();
                }
                C19W6 c19w6 = this.LIZJ;
                if (c19w6 != null) {
                    C20097313kJ.LIZJ(c19w6);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LJIJI) {
            return;
        }
        this.LJIJI = false;
        C19W4 c19w43 = this.LJIJJ;
        if (c19w43 != null) {
            c19w43.LIZ();
        }
        if (this.LJIILJJIL == 0 && (this.LJIJJLI || z)) {
            C21545619Tq c21545619Tq6 = this.LIZLLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545619Tq6);
            c21545619Tq6.setAlpha(1.0f);
            this.LIZLLL.setTransitioning(true);
            C19W4 c19w44 = new C19W4();
            float f2 = -this.LIZLLL.getHeight();
            if (z) {
                this.LIZLLL.getLocationInWindow(new int[]{0, 0});
                f2 -= r1[1];
            }
            C19WF c19wfLIZIZ3 = q0.LIZIZ(this.LIZLLL);
            c19wfLIZIZ3.LJI(f2);
            C19WD c19wd2 = this.LJJIFFI;
            View view5 = c19wfLIZIZ3.LIZ.get();
            if (view5 != null) {
                if (c19wd2 != null) {
                    aUListenerS235S0200000_33 = new AUListenerS235S0200000_33(c19wd2, view5, 11);
                }
                view5.animate().setUpdateListener(aUListenerS235S0200000_33);
            }
            if (!c19w44.LJ) {
                c19w44.LIZ.add(c19wfLIZIZ3);
            }
            if (this.LJIILL && (view = this.LJI) != null) {
                C19WF c19wfLIZIZ4 = q0.LIZIZ(view);
                c19wfLIZIZ4.LJI(f2);
                if (!c19w44.LJ) {
                    c19w44.LIZ.add(c19wfLIZIZ4);
                }
            }
            Interpolator interpolator2 = LJJII;
            boolean z6 = c19w44.LJ;
            if (!z6) {
                c19w44.LIZJ = interpolator2;
                c19w44.LIZIZ = 250L;
            }
            C19W3 c19w3 = this.LJJ;
            if (!z6) {
                c19w44.LIZLLL = c19w3;
            }
            this.LJIJJ = c19w44;
            c19w44.LIZIZ();
            return;
        }
        this.LJJ.LIZ();
    }

    public C19W2(Activity activity, boolean z) {
        new ArrayList();
        this.LJIIL = new ArrayList<>();
        this.LJIILJJIL = 0;
        this.LJIILL = true;
        this.LJIJI = true;
        this.LJJ = new C19W3(this);
        this.LJJI = new C19WA(this);
        this.LJJIFFI = new C19WD(this);
        View decorView = activity.getWindow().getDecorView();
        LJIJJ(decorView);
        if (!z) {
            this.LJI = decorView.findViewById(android.R.id.content);
        }
    }

    @Override // X.C19W7
    public final boolean LJIIIZ(int i, KeyEvent keyEvent) {
        C19V6 c19v6;
        int deviceId;
        C19VZ c19vz = this.LJIIIIZZ;
        if (c19vz == null || (c19v6 = c19vz.LLILZ) == null) {
            return false;
        }
        if (keyEvent != null) {
            deviceId = keyEvent.getDeviceId();
        } else {
            deviceId = -1;
        }
        int keyboardType = KeyCharacterMap.load(deviceId).getKeyboardType();
        boolean z = true;
        if (keyboardType == 1) {
            z = false;
        }
        c19v6.setQwertyMode(z);
        return c19v6.performShortcut(i, keyEvent, 0);
    }

    public final void LJIJJLI(int i, int i2) {
        int iLJIILJJIL = this.LJ.LJIILJJIL();
        if ((i2 & 4) != 0) {
            this.LJII = true;
        }
        this.LJ.LJII((i & i2) | ((~i2) & iLJIILJJIL));
    }
}

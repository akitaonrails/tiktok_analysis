package androidx.appcompat.app;

import X.AbstractC21549319Vb;
import X.AbstractC787190UuL;
import X.C0J43;
import X.C0TVI;
import X.C1361400lX0;
import X.C14K9;
import X.C14MG;
import X.C19GS;
import X.C19GT;
import X.C19GZ;
import X.C19QR;
import X.C19V6;
import X.C19V8;
import X.C19VE;
import X.C19VG;
import X.C19VX;
import X.C19W2;
import X.C19W7;
import X.C19W8;
import X.C19WF;
import X.C19WL;
import X.C19WO;
import X.C19WR;
import X.C19WT;
import X.C19WU;
import X.C19WV;
import X.C19WW;
import X.C19WZ;
import X.C19ZO;
import X.C19ZP;
import X.C19ZQ;
import X.C19ZR;
import X.C20143713rn;
import X.C20154713tZ;
import X.C21411918qr;
import X.C21413018r2;
import X.C21551919Wb;
import X.C2188811AlT;
import X.C261160ALi;
import X.C786410Ut5;
import X.C805380Via;
import X.C815500Vyu;
import X.C830530Wi3;
import X.C838510Wuv;
import X.C838570Wv1;
import X.InterfaceC21510219Ga;
import Y.ARunnableS133S0100000_33;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Objects;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public final class AppCompatDelegateImpl extends C19GT implements C19VX, LayoutInflater.Factory2 {
    public static final C830530Wi3<String, Integer> LLLLIILLL = new C830530Wi3<>();
    public static final int[] LLLLIL = {R.attr.windowBackground};
    public static final boolean LLLLILI = true ^ "robolectric".equals(Build.FINGERPRINT);
    public final Object LLJI;
    public final Context LLJIJIL;
    public Window LLJILJIL;
    public C19W8 LLJILJILJ;
    public final C19WW LLJILLL;
    public C19W7 LLJJ;
    public C19QR LLJJI;
    public CharSequence LLJJIII;
    public C19WR LLJJIJI;
    public C19WV LLJJIJIIJIL;
    public C19WO LLJJIJIL;
    public AbstractC21549319Vb LLJJJ;
    public C19VE LLJJJIL;
    public PopupWindow LLJJJJ;
    public ARunnableS133S0100000_33 LLJJJJJIL;
    public C19WF LLJJJJLIIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public TextView LLJLIL;
    public View LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public PanelFeatureState[] LLLFFI;
    public PanelFeatureState LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public Configuration LLLIIIL;
    public int LLLIIL;
    public int LLLIILIL;
    public int LLLIL;
    public boolean LLLILZ;
    public C19ZR LLLILZJ;
    public C19ZO LLLILZLLLI;
    public boolean LLLIZZ;
    public int LLLJ;
    public boolean LLLJL;
    public Rect LLLL;
    public Rect LLLLII;
    public C21413018r2 LLLLIIIILLL;
    public OnBackInvokedDispatcher LLLLIIL;
    public OnBackInvokedCallback LLLLIILL;
    public final boolean LLJJL = true;
    public final C19WU LLLJIL = new C19WU(this);

    @Override // X.C19GT
    public final boolean LIZLLL() {
        return LJJIJIL(true, true);
    }

    @Override // X.C19GT
    public final void LJIILL() {
        this.LLLII = true;
        LJJIJIL(false, true);
        LJJJJIZL();
        Object obj = this.LLJI;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    if (C815500Vyu.LIZJ(activity.getComponentName(), activity) != null) {
                        C19W7 c19w7 = this.LLJJ;
                        if (c19w7 == null) {
                            this.LLLJL = true;
                        } else {
                            c19w7.LJIIL(true);
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            synchronized (C19GT.LLIZLLLIL) {
                try {
                    C19GT.LJIL(this);
                    C19GT.LLIZ.add(new WeakReference<>(this));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LLLIIIL = new Configuration(this.LLJIJIL.getResources().getConfiguration());
        this.LLLIIII = true;
    }

    @Override // X.C19GT
    public final void LJIJI() {
    }

    @Override // X.C19GT
    public final void LJIJJ() {
        LJJIJIL(true, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19GZ] */
    @Override // X.C19GT
    public final C19GZ LJII() {
        return new InterfaceC21510219Ga() { // from class: X.19GZ
        };
    }

    @Override // X.C19GT
    public final MenuInflater LJIIIZ() {
        if (this.LLJJI == null) {
            LJJJJLL();
            C19W7 c19w7 = this.LLJJ;
            this.LLJJI = new C19QR(c19w7 != null ? c19w7.LJ() : this.LLJIJIL);
        }
        return this.LLJJI;
    }

    @Override // X.C19GT
    public final void LJIIJJI() {
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(this.LLJIJIL);
        if ((NxRewordManager.LJIILIIL ? C0J43.LIZ(layoutInflaterNe, false) : layoutInflaterNe.getFactory()) == null) {
            C786410Ut5.Vd(layoutInflaterNe, this);
        } else {
            C786410Ut5.Qd(layoutInflaterNe);
        }
    }

    @Override // X.C19GT
    public final void LJIIL() {
        if (this.LLJJ != null) {
            LJJJJLL();
            if (this.LLJJ.LJI()) {
                return;
            }
            this.LLLJ |= 1;
            if (this.LLLIZZ) {
                return;
            }
            this.LLJILJIL.getDecorView().postOnAnimation(this.LLLJIL);
            this.LLLIZZ = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    @Override // X.C19GT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.LLJI
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L14
            java.lang.Object r1 = X.C19GT.LLIZLLLIL
            monitor-enter(r1)
            X.C19GT.LJIL(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            goto L14
        Le:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
        L14:
            boolean r0 = r3.LLLIZZ
            if (r0 == 0) goto L23
            android.view.Window r0 = r3.LLJILJIL
            android.view.View r1 = r0.getDecorView()
            X.19WU r0 = r3.LLLJIL
            r1.removeCallbacks(r0)
        L23:
            r0 = 1
            r3.LLLIIIIL = r0
            int r1 = r3.LLLIIL
            r0 = -100
            if (r1 == r0) goto L65
            java.lang.Object r1 = r3.LLJI
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L65
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChangingConfigurations()
            if (r0 == 0) goto L65
            X.0Wi3<java.lang.String, java.lang.Integer> r2 = androidx.appcompat.app.AppCompatDelegateImpl.LLLLIILLL
            java.lang.Object r0 = r3.LLJI
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getName()
            int r0 = r3.LLLIIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
        L4f:
            X.19W7 r0 = r3.LLJJ
            if (r0 == 0) goto L56
            r0.LJIIIIZZ()
        L56:
            X.19ZR r0 = r3.LLLILZJ
            if (r0 == 0) goto L5d
            r0.LIZ()
        L5d:
            X.19ZO r0 = r3.LLLILZLLLI
            if (r0 == 0) goto L64
            r0.LIZ()
        L64:
            return
        L65:
            X.0Wi3<java.lang.String, java.lang.Integer> r1 = androidx.appcompat.app.AppCompatDelegateImpl.LLLLIILLL
            java.lang.Object r0 = r3.LLJI
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJIILLIIL():void");
    }

    @Override // X.C19GT
    public final void LJJIIJ() {
        if (this.LLLIIL != 1) {
            this.LLLIIL = 1;
            if (this.LLLII) {
                LIZLLL();
            }
        }
    }

    public final ViewGroup LJJIJIIJI() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.LLJIJIL.obtainStyledAttributes(R$styleable.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowNoTitle, false)) {
            LJJ(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBar, false)) {
            LJJ(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            LJJ(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            LJJ(10);
        }
        this.LLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        LJJJJIZL();
        this.LLJILJIL.getDecorView();
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(this.LLJIJIL);
        if (this.LLLF) {
            viewGroup = this.LLJZIJLIL ? (ViewGroup) C786410Ut5.Sd(com.zhiliaoapp.musically.R.layout.f849i0, layoutInflaterNe, null) : (ViewGroup) C786410Ut5.Sd(com.zhiliaoapp.musically.R.layout.hz, layoutInflaterNe, null);
        } else if (this.LLL) {
            viewGroup = (ViewGroup) C786410Ut5.Sd(com.zhiliaoapp.musically.R.layout.hq, layoutInflaterNe, null);
            this.LLJZ = false;
            this.LLJLLL = false;
        } else if (this.LLJLLL) {
            TypedValue typedValue = new TypedValue();
            this.LLJIJIL.getTheme().resolveAttribute(com.zhiliaoapp.musically.R.attr.b86, typedValue, true);
            viewGroup = (ViewGroup) C786410Ut5.Sd(com.zhiliaoapp.musically.R.layout.i1, C786410Ut5.ne(typedValue.resourceId != 0 ? new C1361400lX0(this.LLJIJIL, typedValue.resourceId) : this.LLJIJIL), null);
            C19WR c19wr = (C19WR) viewGroup.findViewById(com.zhiliaoapp.musically.R.id.fhh);
            this.LLJJIJI = c19wr;
            c19wr.setWindowCallback(LJJJJLI());
            if (this.LLJZ) {
                this.LLJJIJI.LJII(109);
            }
            if (this.LLJLL) {
                this.LLJJIJI.LJII(2);
            }
            if (this.LLJLLIL) {
                this.LLJJIJI.LJII(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AppCompat does not support the current theme features: { windowActionBar: ");
            sbLIZ.append(this.LLJLLL);
            sbLIZ.append(", windowActionBarOverlay: ");
            sbLIZ.append(this.LLJZ);
            sbLIZ.append(", android:windowIsFloating: ");
            sbLIZ.append(this.LLL);
            sbLIZ.append(", windowActionModeOverlay: ");
            sbLIZ.append(this.LLJZIJLIL);
            sbLIZ.append(", windowNoTitle: ");
            sbLIZ.append(this.LLLF);
            sbLIZ.append(" }");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C14K9.LJIJJ(viewGroup, new C0TVI() { // from class: X.14KW
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                boolean z;
                int iLIZLLL;
                int iLJ;
                boolean z2;
                int iLIZ;
                C20246014Ju c20246014JuLJIIIZ = c20246014Ju;
                int iLJFF = c20246014JuLJIIIZ.LJFF();
                AppCompatDelegateImpl appCompatDelegateImpl = this.LL;
                appCompatDelegateImpl.getClass();
                int iLJFF2 = c20246014JuLJIIIZ.LJFF();
                C19VE c19ve = appCompatDelegateImpl.LLJJJIL;
                int i = 0;
                if (c19ve != null && (c19ve.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.LLJJJIL.getLayoutParams();
                    if (appCompatDelegateImpl.LLJJJIL.isShown()) {
                        if (appCompatDelegateImpl.LLLL == null) {
                            appCompatDelegateImpl.LLLL = new Rect();
                            appCompatDelegateImpl.LLLLII = new Rect();
                        }
                        Rect rect = appCompatDelegateImpl.LLLL;
                        Rect rect2 = appCompatDelegateImpl.LLLLII;
                        rect.set(c20246014JuLJIIIZ.LIZLLL(), c20246014JuLJIIIZ.LJFF(), c20246014JuLJIIIZ.LJ(), c20246014JuLJIIIZ.LIZJ());
                        ViewGroup viewGroup2 = appCompatDelegateImpl.LLJL;
                        if (Build.VERSION.SDK_INT >= 29) {
                            C14K5.LIZ(viewGroup2, rect, rect2);
                        } else {
                            if (!C14KV.LIZ) {
                                C14KV.LIZ = true;
                                try {
                                    Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    C14KV.LIZIZ = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        C14KV.LIZIZ.setAccessible(true);
                                    }
                                } catch (NoSuchMethodException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            Method method = C14KV.LIZIZ;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup2, rect, rect2);
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            }
                        }
                        int i2 = rect.top;
                        int i3 = rect.left;
                        int i4 = rect.right;
                        C20246014Ju c20246014JuLIZ = C14K4.LIZ(appCompatDelegateImpl.LLJL);
                        if (c20246014JuLIZ == null) {
                            iLIZLLL = 0;
                            iLJ = 0;
                        } else {
                            iLIZLLL = c20246014JuLIZ.LIZLLL();
                            iLJ = c20246014JuLIZ.LJ();
                        }
                        if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                            z2 = false;
                        } else {
                            marginLayoutParams.topMargin = i2;
                            marginLayoutParams.leftMargin = i3;
                            marginLayoutParams.rightMargin = i4;
                            z2 = true;
                        }
                        if (i2 > 0 && appCompatDelegateImpl.LLJLILLLLZIIL == null) {
                            View view2 = new View(appCompatDelegateImpl.LLJIJIL);
                            appCompatDelegateImpl.LLJLILLLLZIIL = view2;
                            C786410Ut5.LJLLLLLL(8, view2);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = iLIZLLL;
                            layoutParams.rightMargin = iLJ;
                            appCompatDelegateImpl.LLJL.addView(appCompatDelegateImpl.LLJLILLLLZIIL, -1, layoutParams);
                        } else {
                            View view3 = appCompatDelegateImpl.LLJLILLLLZIIL;
                            if (view3 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                                int i5 = marginLayoutParams2.height;
                                int i6 = marginLayoutParams.topMargin;
                                if (i5 != i6 || marginLayoutParams2.leftMargin != iLIZLLL || marginLayoutParams2.rightMargin != iLJ) {
                                    marginLayoutParams2.height = i6;
                                    marginLayoutParams2.leftMargin = iLIZLLL;
                                    marginLayoutParams2.rightMargin = iLJ;
                                    C786410Ut5.W5(appCompatDelegateImpl.LLJLILLLLZIIL, marginLayoutParams2);
                                }
                            }
                        }
                        View view4 = appCompatDelegateImpl.LLJLILLLLZIIL;
                        if (view4 != null) {
                            z = true;
                            if (view4.getVisibility() != 0) {
                                View view5 = appCompatDelegateImpl.LLJLILLLLZIIL;
                                if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                                    iLIZ = C446980Hfs.LIZ(appCompatDelegateImpl.LLJIJIL, com.zhiliaoapp.musically.R.color.dy);
                                } else {
                                    iLIZ = C446980Hfs.LIZ(appCompatDelegateImpl.LLJIJIL, com.zhiliaoapp.musically.R.color.dx);
                                }
                                view5.setBackgroundColor(iLIZ);
                            }
                        } else {
                            z = false;
                        }
                        if (!appCompatDelegateImpl.LLJZIJLIL && z) {
                            iLJFF2 = 0;
                        }
                        if (z2) {
                            C19VE c19ve2 = appCompatDelegateImpl.LLJJJIL;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19ve2);
                            c19ve2.setLayoutParams(marginLayoutParams);
                        }
                    } else if (marginLayoutParams.topMargin != 0) {
                        marginLayoutParams.topMargin = 0;
                        z = false;
                        C19VE c19ve22 = appCompatDelegateImpl.LLJJJIL;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19ve22);
                        c19ve22.setLayoutParams(marginLayoutParams);
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                View view6 = appCompatDelegateImpl.LLJLILLLLZIIL;
                if (view6 != null) {
                    if (!z) {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, view6);
                }
                if (iLJFF != iLJFF2) {
                    c20246014JuLJIIIZ = c20246014JuLJIIIZ.LJIIIZ(c20246014JuLJIIIZ.LIZLLL(), iLJFF2, c20246014JuLJIIIZ.LJ(), c20246014JuLJIIIZ.LIZJ());
                }
                return q0.LJIIL(view, c20246014JuLJIIIZ);
            }
        });
        if (this.LLJJIJI == null) {
            this.LLJLIL = (TextView) viewGroup.findViewById(com.zhiliaoapp.musically.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.zhiliaoapp.musically.R.id.a16);
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.qe(this.LLJILJIL, R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                C786410Ut5.LJJLIL(0, viewGroup2);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                viewGroup2.setForeground(null);
            }
        }
        this.LLJILJIL.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C19WZ(this));
        return viewGroup;
    }

    public final void LJJJJI() {
        ViewGroup viewGroupLJJIJIIJI;
        if (this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        if (C786410Ut5.u3() != Looper.getMainLooper().getThread()) {
            Debug.isDebuggerConnected();
            C805380Via.LJFF("AIR_CUSHION_UNPROTECT", "CreateSubDecorHook", new IllegalAccessException("call createSubDecorInsert on the sub thread!"));
        }
        if (((Boolean) C261160ALi.LIZ.getValue()).booleanValue()) {
            synchronized (this) {
                try {
                    viewGroupLJJIJIIJI = LJJIJIIJI();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            viewGroupLJJIJIIJI = LJJIJIIJI();
        }
        this.LLJL = viewGroupLJJIJIIJI;
        Object obj = this.LLJI;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.LLJJIII;
        if (!TextUtils.isEmpty(title)) {
            C19WR c19wr = this.LLJJIJI;
            if (c19wr != null) {
                c19wr.setWindowTitle(title);
            } else {
                C19W7 c19w7 = this.LLJJ;
                if (c19w7 != null) {
                    c19w7.LJIIZILJ(title);
                } else {
                    TextView textView = this.LLJLIL;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.LLJL.findViewById(R.id.content);
        View decorView = this.LLJILJIL.getDecorView();
        contentFrameLayout.LLIZ.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout.isLaidOut()) {
            contentFrameLayout.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes = this.LLJIJIL.obtainStyledAttributes(R$styleable.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes.getValue(R$styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
        this.LLJJLIIIJLLLLLLLZ = true;
        PanelFeatureState panelFeatureStateLJJJJL = LJJJJL(0);
        if (this.LLLIIIIL || panelFeatureStateLJJJJL.LJII != null) {
            return;
        }
        this.LLLJ |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        if (this.LLLIZZ) {
            return;
        }
        this.LLJILJIL.getDecorView().postOnAnimation(this.LLLJIL);
        this.LLLIZZ = true;
    }

    public final void LJJJJIZL() {
        if (this.LLJILJIL == null) {
            Object obj = this.LLJI;
            if (obj instanceof Activity) {
                LJJIJL(((Activity) obj).getWindow());
            }
        }
        if (this.LLJILJIL == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Window.Callback LJJJJLI() {
        return this.LLJILJIL.getCallback();
    }

    public final boolean LJJJJZI() {
        boolean z = this.LLLI;
        this.LLLI = false;
        PanelFeatureState panelFeatureStateLJJJJL = LJJJJL(0);
        if (panelFeatureStateLJJJJL.LJIIL) {
            if (!z) {
                LJJJ(panelFeatureStateLJJJJL, true);
            }
            return true;
        }
        AbstractC21549319Vb abstractC21549319Vb = this.LLJJJ;
        if (abstractC21549319Vb != null) {
            abstractC21549319Vb.LIZJ();
            return true;
        }
        LJJJJLL();
        C19W7 c19w7 = this.LLJJ;
        return c19w7 != null && c19w7.LIZIZ();
    }

    public final void LJJJZ() {
        if (this.LLJJLIIIJLLLLLLLZ) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void LJJL() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.LLLLIIL != null && (LJJJJL(0).LJIIL || this.LLJJJ != null)) {
                if (this.LLLLIILL == null) {
                    this.LLLLIILL = C19WT.LIZIZ(this.LLLLIIL, this);
                }
            } else {
                OnBackInvokedCallback onBackInvokedCallback = this.LLLLIILL;
                if (onBackInvokedCallback != null) {
                    C19WT.LIZJ(this.LLLLIIL, onBackInvokedCallback);
                    this.LLLLIILL = null;
                }
            }
        }
    }

    @Override // X.C19GT
    public final C19W7 LJIIJ() {
        LJJJJLL();
        return this.LLJJ;
    }

    @Override // X.C19GT
    public final void LJIJ() {
        LJJJJLL();
        C19W7 c19w7 = this.LLJJ;
        if (c19w7 != null) {
            c19w7.LJIILLIIL(true);
        }
    }

    @Override // X.C19GT
    public final void LJIJJLI() {
        LJJJJLL();
        C19W7 c19w7 = this.LLJJ;
        if (c19w7 != null) {
            c19w7.LJIILLIIL(false);
        }
    }

    public final void LJJJJLL() {
        LJJJJI();
        if (this.LLJLLL && this.LLJJ == null) {
            Object obj = this.LLJI;
            if (obj instanceof Activity) {
                this.LLJJ = new C19W2((Activity) this.LLJI, this.LLJZ);
            } else if (obj instanceof Dialog) {
                this.LLJJ = new C19W2((Dialog) this.LLJI);
            }
            C19W7 c19w7 = this.LLJJ;
            if (c19w7 != null) {
                c19w7.LJIIL(this.LLLJL);
            }
        }
    }

    @Override // X.C19GT
    public final Context LJI() {
        return this.LLJIJIL;
    }

    @Override // X.C19GT
    public final int LJIIIIZZ() {
        return this.LLLIIL;
    }

    @Override // X.C19GT
    public final void LJIIZILJ() {
        LJJJJI();
    }

    public static final class PanelFeatureState {
        public final int LIZ;
        public int LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public C19WL LJ;
        public View LJFF;
        public View LJI;
        public C19V6 LJII;
        public C21551919Wb LJIIIIZZ;
        public C1361400lX0 LJIIIZ;
        public boolean LJIIJ;
        public boolean LJIIJJI;
        public boolean LJIIL;
        public boolean LJIILIIL;
        public boolean LJIILJJIL;
        public Bundle LJIILL;

        public PanelFeatureState(int i) {
            this.LIZ = i;
        }

        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.19Wd
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return AppCompatDelegateImpl.PanelFeatureState.SavedState.LIZ(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AppCompatDelegateImpl.PanelFeatureState.SavedState[i];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return AppCompatDelegateImpl.PanelFeatureState.SavedState.LIZ(parcel, classLoader);
                }
            };
            public int LL;
            public boolean LLILLJJLI;
            public Bundle LLILLL;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public static SavedState LIZ(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.LL = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.LLILLJJLI = z;
                if (z) {
                    savedState.LLILLL = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.LL);
                parcel.writeInt(this.LLILLJJLI ? 1 : 0);
                if (this.LLILLJJLI) {
                    parcel.writeBundle(this.LLILLL);
                }
            }
        }
    }

    public static C838510Wuv LJJIJLIJ(Context context) {
        C838510Wuv c838510Wuv;
        C838510Wuv c838510WuvLIZIZ;
        Locale localeLIZJ;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c838510Wuv = C19GT.LLILLL) == null) {
            return null;
        }
        C838510Wuv c838510WuvLJJJJJL = LJJJJJL(C786410Ut5.N3(context).getResources().getConfiguration());
        if (i >= 24) {
            if (c838510Wuv.LIZLLL()) {
                c838510WuvLIZIZ = C838510Wuv.LIZIZ;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < c838510Wuv.LIZ.size() + c838510WuvLJJJJJL.LIZ.size(); i2++) {
                    if (i2 < c838510Wuv.LIZ.size()) {
                        localeLIZJ = c838510Wuv.LIZJ(i2);
                    } else {
                        localeLIZJ = c838510WuvLJJJJJL.LIZJ(i2 - c838510Wuv.LIZ.size());
                    }
                    if (localeLIZJ != null) {
                        linkedHashSet.add(localeLIZJ);
                    }
                }
                c838510WuvLIZIZ = C838510Wuv.LIZ((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (c838510Wuv.LIZLLL()) {
            c838510WuvLIZIZ = C838510Wuv.LIZIZ;
        } else {
            c838510WuvLIZIZ = C838510Wuv.LIZIZ(C19ZP.LIZIZ(c838510Wuv.LIZJ(0)));
        }
        if (!c838510WuvLIZIZ.LIZLLL()) {
            return c838510WuvLIZIZ;
        }
        return c838510WuvLJJJJJL;
    }

    public static C838510Wuv LJJJJJL(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C838570Wv1.LIZIZ(configuration);
        }
        return C838510Wuv.LIZIZ(C19ZP.LIZIZ(configuration.locale));
    }

    @Override // X.C19VX
    public final void LIZIZ(C19V6 c19v6) {
        C19WR c19wr = this.LLJJIJI;
        if (c19wr != null && c19wr.LJFF() && (!ViewConfiguration.get(this.LLJIJIL).hasPermanentMenuKey() || this.LLJJIJI.LJ())) {
            Window.Callback callbackLJJJJLI = LJJJJLI();
            if (this.LLJJIJI.LIZJ()) {
                this.LLJJIJI.LIZ();
                if (!this.LLLIIIIL) {
                    callbackLJJJJLI.onPanelClosed(108, LJJJJL(0).LJII);
                    return;
                }
                return;
            }
            if (callbackLJJJJLI == null || this.LLLIIIIL) {
                return;
            }
            if (this.LLLIZZ && (1 & this.LLLJ) != 0) {
                this.LLJILJIL.getDecorView().removeCallbacks(this.LLLJIL);
                this.LLLJIL.run();
            }
            PanelFeatureState panelFeatureStateLJJJJL = LJJJJL(0);
            C19V6 c19v62 = panelFeatureStateLJJJJL.LJII;
            if (c19v62 == null || panelFeatureStateLJJJJL.LJIILJJIL || !callbackLJJJJLI.onPreparePanel(0, panelFeatureStateLJJJJL.LJI, c19v62)) {
                return;
            }
            callbackLJJJJLI.onMenuOpened(108, panelFeatureStateLJJJJL.LJII);
            this.LLJJIJI.LIZIZ();
            return;
        }
        PanelFeatureState panelFeatureStateLJJJJL2 = LJJJJL(0);
        panelFeatureStateLJJJJL2.LJIILIIL = true;
        LJJJ(panelFeatureStateLJJJJL2, false);
        LJJJLIIL(panelFeatureStateLJJJJL2, null);
    }

    @Override // X.C19GT
    public final Context LJ(final Context context) {
        this.LLLII = true;
        int i = this.LLLIIL;
        if (i == -100) {
            i = C19GT.LLILLJJLI;
        }
        int iLJJJJZ = LJJJJZ(i, context);
        if (C19GT.LJIILIIL(context) && C19GT.LJIILIIL(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!C19GT.LLILZLL) {
                    C19GT.LL.execute(new Runnable() { // from class: X.0Wv5
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C838510Wuv c838510WuvLJ;
                            Context contextLJI;
                            Context context2 = context;
                            if (Build.VERSION.SDK_INT >= 33) {
                                ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                                if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                                    C835410Wpv<WeakReference<C19GT>> c835410Wpv = C19GT.LLIZ;
                                    c835410Wpv.getClass();
                                    C835430Wpx c835430Wpx = new C835430Wpx(c835410Wpv);
                                    while (true) {
                                        if (!c835430Wpx.hasNext()) {
                                            break;
                                        }
                                        C19GT c19gt = (C19GT) ((Reference) c835430Wpx.next()).get();
                                        if (c19gt != null && (contextLJI = c19gt.LJI()) != null) {
                                            Object objH2 = C786410Ut5.H2(contextLJI, "locale");
                                            if (objH2 != null) {
                                                c838510WuvLJ = C838510Wuv.LJ(C838620Wv6.LIZ(objH2));
                                            }
                                        }
                                    }
                                    c838510WuvLJ = C838510Wuv.LIZIZ;
                                    if (c838510WuvLJ.LIZLLL()) {
                                        String strLIZIZ = C20154713tZ.LIZIZ(context2);
                                        Object objH22 = C786410Ut5.H2(context2, "locale");
                                        if (objH22 != null) {
                                            C838620Wv6.LIZIZ(objH22, C838630Wv7.LIZ(strLIZIZ));
                                        }
                                    }
                                    context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                                }
                            }
                            C19GT.LLILZLL = true;
                        }
                    });
                }
            } else {
                synchronized (C19GT.LLJ) {
                    try {
                        C838510Wuv c838510Wuv = C19GT.LLILLL;
                        if (c838510Wuv == null) {
                            if (C19GT.LLILZ == null) {
                                C19GT.LLILZ = C838510Wuv.LIZIZ(C20154713tZ.LIZIZ(context));
                            }
                            if (!C19GT.LLILZ.LIZLLL()) {
                                C19GT.LLILLL = C19GT.LLILZ;
                            }
                        } else if (!c838510Wuv.equals(C19GT.LLILZ)) {
                            C838510Wuv c838510Wuv2 = C19GT.LLILLL;
                            C19GT.LLILZ = c838510Wuv2;
                            C20154713tZ.LIZ(context, c838510Wuv2.LIZ.LIZIZ());
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        }
        C838510Wuv c838510WuvLJJIJLIJ = LJJIJLIJ(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LJJJI(context, iLJJJJZ, c838510WuvLJJIJLIJ, null, false));
                return context;
            } catch (IllegalStateException th) {
            }
        }
        if (context instanceof C1361400lX0) {
            try {
                ((C1361400lX0) context).LIZ(LJJJI(context, iLJJJJZ, c838510WuvLJJIJLIJ, null, false));
                return context;
            } catch (IllegalStateException th2) {
            }
        }
        if (!LLLLILI) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i2 = configuration3.mcc;
                int i3 = configuration4.mcc;
                if (i2 != i3) {
                    configuration.mcc = i3;
                }
                int i4 = configuration3.mnc;
                int i5 = configuration4.mnc;
                if (i4 != i5) {
                    configuration.mnc = i5;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 24) {
                    C838570Wv1.LIZ(configuration3, configuration4, configuration);
                } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i7 = configuration3.touchscreen;
                int i8 = configuration4.touchscreen;
                if (i7 != i8) {
                    configuration.touchscreen = i8;
                }
                int i9 = configuration3.keyboard;
                int i10 = configuration4.keyboard;
                if (i9 != i10) {
                    configuration.keyboard = i10;
                }
                int i11 = configuration3.keyboardHidden;
                int i12 = configuration4.keyboardHidden;
                if (i11 != i12) {
                    configuration.keyboardHidden = i12;
                }
                int i13 = configuration3.navigation;
                int i14 = configuration4.navigation;
                if (i13 != i14) {
                    configuration.navigation = i14;
                }
                int i15 = configuration3.navigationHidden;
                int i16 = configuration4.navigationHidden;
                if (i15 != i16) {
                    configuration.navigationHidden = i16;
                }
                int i17 = configuration3.orientation;
                int i18 = configuration4.orientation;
                if (i17 != i18) {
                    configuration.orientation = i18;
                }
                int i19 = configuration3.screenLayout & 15;
                int i20 = configuration4.screenLayout & 15;
                if (i19 != i20) {
                    configuration.screenLayout |= i20;
                }
                int i21 = configuration3.screenLayout & 192;
                int i22 = configuration4.screenLayout & 192;
                if (i21 != i22) {
                    configuration.screenLayout |= i22;
                }
                int i23 = configuration3.screenLayout & 48;
                int i24 = configuration4.screenLayout & 48;
                if (i23 != i24) {
                    configuration.screenLayout |= i24;
                }
                int i25 = configuration3.screenLayout & 768;
                int i26 = configuration4.screenLayout & 768;
                if (i25 != i26) {
                    configuration.screenLayout |= i26;
                }
                if (i6 >= 26) {
                    int i27 = configuration3.colorMode & 3;
                    int i28 = configuration4.colorMode & 3;
                    if (i27 != i28) {
                        configuration.colorMode |= i28;
                    }
                    int i29 = configuration3.colorMode & 12;
                    int i30 = configuration4.colorMode & 12;
                    if (i29 != i30) {
                        configuration.colorMode |= i30;
                    }
                }
                int i31 = configuration3.uiMode & 15;
                int i32 = configuration4.uiMode & 15;
                if (i31 != i32) {
                    configuration.uiMode |= i32;
                }
                int i33 = configuration3.uiMode & 48;
                int i34 = configuration4.uiMode & 48;
                if (i33 != i34) {
                    configuration.uiMode |= i34;
                }
                int i35 = configuration3.screenWidthDp;
                int i36 = configuration4.screenWidthDp;
                if (i35 != i36) {
                    configuration.screenWidthDp = i36;
                }
                int i37 = configuration3.screenHeightDp;
                int i38 = configuration4.screenHeightDp;
                if (i37 != i38) {
                    configuration.screenHeightDp = i38;
                }
                int i39 = configuration3.smallestScreenWidthDp;
                int i40 = configuration4.smallestScreenWidthDp;
                if (i39 != i40) {
                    configuration.smallestScreenWidthDp = i40;
                }
                int i41 = configuration3.densityDpi;
                int i42 = configuration4.densityDpi;
                if (i41 != i42) {
                    configuration.densityDpi = i42;
                }
            }
        }
        Configuration configurationLJJJI = LJJJI(context, iLJJJJZ, c838510WuvLJJIJLIJ, configuration, true);
        C1361400lX0 c1361400lX0 = new C1361400lX0(context, com.zhiliaoapp.musically.R.style.sb);
        c1361400lX0.LIZ(configurationLJJJI);
        try {
            if (context.getTheme() != null) {
                C20143713rn.LIZ(c1361400lX0.getTheme());
                return c1361400lX0;
            }
        } catch (NullPointerException th22) {
        }
        return c1361400lX0;
    }

    @Override // X.C19GT
    public final <T extends View> T LJFF(int i) {
        LJJJJI();
        return (T) C786410Ut5.qe(this.LLJILJIL, i);
    }

    @Override // X.C19GT
    public final void LJIILJJIL(Configuration configuration) {
        if (this.LLJLLL && this.LLJJLIIIJLLLLLLLZ) {
            LJJJJLL();
            C19W7 c19w7 = this.LLJJ;
            if (c19w7 != null) {
                c19w7.LJII();
            }
        }
        C14MG c14mgLIZ = C14MG.LIZ();
        Context context = this.LLJIJIL;
        synchronized (c14mgLIZ) {
            c14mgLIZ.LIZ.LJIIJ(context);
        }
        this.LLLIIIL = new Configuration(this.LLJIJIL.getResources().getConfiguration());
        LJJIJIL(false, false);
    }

    @Override // X.C19GT
    public final boolean LJJ(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.LLLF && i == 108) {
            return false;
        }
        if (this.LLJLLL && i == 1) {
            this.LLJLLL = false;
        } else if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 10) {
                        if (i != 108) {
                            if (i != 109) {
                                return this.LLJILJIL.requestFeature(i);
                            }
                            LJJJZ();
                            this.LLJZ = true;
                            return true;
                        }
                        LJJJZ();
                        this.LLJLLL = true;
                        return true;
                    }
                    LJJJZ();
                    this.LLJZIJLIL = true;
                    return true;
                }
                LJJJZ();
                this.LLJLLIL = true;
                return true;
            }
            LJJJZ();
            this.LLJLL = true;
            return true;
        }
        LJJJZ();
        this.LLLF = true;
        return true;
    }

    @Override // X.C19GT
    public final void LJJI(int i) {
        LJJJJI();
        ViewGroup viewGroup = (ViewGroup) this.LLJL.findViewById(R.id.content);
        C786410Ut5.LJJJJI(viewGroup);
        C786410Ut5.Sd(i, C786410Ut5.ne(this.LLJIJIL), viewGroup);
        this.LLJILJILJ.LIZ(this.LLJILJIL.getCallback());
    }

    @Override // X.C19GT
    public final void LJJIFFI(View view) {
        LJJJJI();
        ViewGroup viewGroup = (ViewGroup) this.LLJL.findViewById(R.id.content);
        C786410Ut5.LJJJJI(viewGroup);
        viewGroup.addView(view);
        this.LLJILJILJ.LIZ(this.LLJILJIL.getCallback());
    }

    @Override // X.C19GT
    public final void LJJIIJZLJL(C19V8 c19v8) {
        CharSequence title;
        if (!(this.LLJI instanceof Activity)) {
            return;
        }
        LJJJJLL();
        C19W7 c19w7 = this.LLJJ;
        if (!(c19w7 instanceof C19W2)) {
            this.LLJJI = null;
            if (c19w7 != null) {
                c19w7.LJIIIIZZ();
            }
            this.LLJJ = null;
            if (c19v8 != null) {
                Object obj = this.LLJI;
                if (obj instanceof Activity) {
                    title = ((Activity) obj).getTitle();
                } else {
                    title = this.LLJJIII;
                }
                C19VG c19vg = new C19VG(c19v8, title, this.LLJILJILJ);
                this.LLJJ = c19vg;
                this.LLJILJILJ.LLILLJJLI = c19vg.LIZJ;
                c19v8.setBackInvokedCallbackEnabled(true);
            } else {
                this.LLJILJILJ.LLILLJJLI = null;
            }
            LJIIL();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // X.C19GT
    public final void LJJIIZ(int i) {
        this.LLLIILIL = i;
    }

    @Override // X.C19GT
    public final void LJJIIZI(CharSequence charSequence) {
        this.LLJJIII = charSequence;
        C19WR c19wr = this.LLJJIJI;
        if (c19wr != null) {
            c19wr.setWindowTitle(charSequence);
            return;
        }
        C19W7 c19w7 = this.LLJJ;
        if (c19w7 != null) {
            c19w7.LJIIZILJ(charSequence);
            return;
        }
        TextView textView = this.LLJLIL;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
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
    @Override // X.C19GT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC21549319Vb LJJIJ(X.InterfaceC21549419Vc r9) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJJIJ(X.19Vc):X.19Vb");
    }

    public final void LJJIJL(Window window) {
        if (this.LLJILJIL == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C19W8)) {
                C19W8 c19w8 = new C19W8(this, callback);
                this.LLJILJILJ = c19w8;
                window.setCallback(c19w8);
                C21411918qr c21411918qrLJIIL = C21411918qr.LJIIL(this.LLJIJIL, null, LLLLIL);
                Drawable drawableLJFF = c21411918qrLJIIL.LJFF(0);
                if (drawableLJFF != null) {
                    window.setBackgroundDrawable(drawableLJFF);
                }
                c21411918qrLJIIL.LJIILJJIL();
                this.LLJILJIL = window;
                if (Build.VERSION.SDK_INT >= 33 && this.LLLLIIL == null) {
                    Object obj = this.LLJI;
                    if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                        this.LLLLIIL = C19WT.LIZ((Activity) this.LLJI);
                    } else {
                        this.LLLLIIL = null;
                    }
                    LJJL();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void LJJIZ(C19V6 c19v6) {
        if (this.LLLFF) {
            return;
        }
        this.LLLFF = true;
        this.LLJJIJI.LJIIIIZZ();
        Window.Callback callbackLJJJJLI = LJJJJLI();
        if (callbackLJJJJLI != null && !this.LLLIIIIL) {
            callbackLJJJJLI.onPanelClosed(108, c19v6);
        }
        this.LLLFF = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d1, code lost:
    
        if (LJJJLZIJ(r4, r7) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJIL(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJJJIL(android.view.KeyEvent):boolean");
    }

    public final void LJJJJ(int i) {
        PanelFeatureState panelFeatureStateLJJJJL = LJJJJL(i);
        if (panelFeatureStateLJJJJL.LJII != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateLJJJJL.LJII.LJIJJ(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateLJJJJL.LJIILL = bundle;
            }
            panelFeatureStateLJJJJL.LJII.LJJI();
            panelFeatureStateLJJJJL.LJII.clear();
        }
        panelFeatureStateLJJJJL.LJIILJJIL = true;
        panelFeatureStateLJJJJL.LJIILIIL = true;
        if ((i == 108 || i == 0) && this.LLJJIJI != null) {
            PanelFeatureState panelFeatureStateLJJJJL2 = LJJJJL(0);
            panelFeatureStateLJJJJL2.LJIIJ = false;
            LJJJLZIJ(panelFeatureStateLJJJJL2, null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.19ZR] */
    public final AbstractC787190UuL LJJJJJ(Context context) {
        if (this.LLLILZJ == null) {
            if (C19ZQ.LIZLLL == null) {
                Context contextN3 = C786410Ut5.N3(context);
                C19ZQ.LIZLLL = new C19ZQ(contextN3, (LocationManager) C786410Ut5.H2(contextN3, "location"));
            }
            final C19ZQ c19zq = C19ZQ.LIZLLL;
            this.LLLILZJ = new AbstractC787190UuL(c19zq) { // from class: X.19ZR
                public final C19ZQ LIZJ;

                @Override // X.AbstractC787190UuL
                public final IntentFilter LIZIZ() {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.TIME_SET");
                    intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                    intentFilter.addAction("android.intent.action.TIME_TICK");
                    return intentFilter;
                }

                /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[ORIG_RETURN, RETURN] */
                @Override // X.AbstractC787190UuL
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final int LIZJ() {
                    /*
                        Method dump skipped, instruction units count: 276
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C19ZR.LIZJ():int");
                }

                @Override // X.AbstractC787190UuL
                public final void LIZLLL() {
                    this.LIZLLL.LIZLLL();
                }

                {
                    super(this.LIZLLL);
                    this.LIZJ = c19zq;
                }
            };
        }
        return this.LLLILZJ;
    }

    public final PanelFeatureState LJJJJL(int i) {
        PanelFeatureState[] panelFeatureStateArr = this.LLLFFI;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.LLLFFI = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
            panelFeatureStateArr[i] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    @Override // X.C19VX
    public final boolean LIZ(C19V6 c19v6, MenuItem menuItem) {
        Window.Callback callbackLJJJJLI = LJJJJLI();
        if (callbackLJJJJLI != null && !this.LLLIIIIL) {
            C19V6 c19v6LJIIJ = c19v6.LJIIJ();
            PanelFeatureState[] panelFeatureStateArr = this.LLLFFI;
            if (panelFeatureStateArr != null) {
                for (PanelFeatureState panelFeatureState : panelFeatureStateArr) {
                    if (panelFeatureState != null && panelFeatureState.LJII == c19v6LJIIJ) {
                        return callbackLJJJJLI.onMenuItemSelected(panelFeatureState.LIZ, menuItem);
                    }
                }
            }
        }
        return false;
    }

    @Override // X.C19GT
    public final void LIZJ(View view, ViewGroup.LayoutParams layoutParams) {
        LJJJJI();
        ((ViewGroup) this.LLJL.findViewById(R.id.content)).addView(view, layoutParams);
        this.LLJILJILJ.LIZ(this.LLJILJIL.getCallback());
    }

    @Override // X.C19GT
    public final void LJJII(View view, ViewGroup.LayoutParams layoutParams) {
        LJJJJI();
        ViewGroup viewGroup = (ViewGroup) this.LLJL.findViewById(R.id.content);
        C786410Ut5.LJJJJI(viewGroup);
        viewGroup.addView(view, layoutParams);
        this.LLJILJILJ.LIZ(this.LLJILJIL.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJIL(boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJJIJIL(boolean, boolean):boolean");
    }

    public final void LJJJ(PanelFeatureState panelFeatureState, boolean z) {
        C19WL c19wl;
        C19WR c19wr;
        if (z && panelFeatureState.LIZ == 0 && (c19wr = this.LLJJIJI) != null && c19wr.LIZJ()) {
            LJJIZ(panelFeatureState.LJII);
            return;
        }
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(this.LLJIJIL, "window");
        if (windowManager != null && panelFeatureState.LJIIL && (c19wl = panelFeatureState.LJ) != null) {
            windowManager.removeView(c19wl);
            if (z) {
                LJJIL(panelFeatureState.LIZ, panelFeatureState, null);
            }
        }
        panelFeatureState.LJIIJ = false;
        panelFeatureState.LJIIJJI = false;
        panelFeatureState.LJIIL = false;
        panelFeatureState.LJFF = null;
        panelFeatureState.LJIILIIL = true;
        if (this.LLLFZ == panelFeatureState) {
            this.LLLFZ = null;
        }
        if (panelFeatureState.LIZ == 0) {
            LJJL();
        }
    }

    public final int LJJJJZ(int i, Context context) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        if (this.LLLILZLLLI == null) {
                            this.LLLILZLLLI = new C19ZO(this, context);
                        }
                        return this.LLLILZLLLI.LIZJ();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                return i;
            }
            if (((UiModeManager) C786410Ut5.H2(C786410Ut5.N3(context), "uimode")).getNightMode() == 0) {
                return -1;
            }
            return LJJJJJ(context).LIZJ();
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        if (r1.LLILZLL.getCount() > 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.19WO] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.19WL] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLIIL(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJJJLIIL(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a  */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.19WV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJLZIJ(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJJJLZIJ(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJIIJIL(int i, C838510Wuv c838510Wuv, boolean z) {
        Resources resources = this.LLJIJIL.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (c838510Wuv != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                C838570Wv1.LIZLLL(configuration, c838510Wuv);
            } else {
                configuration.setLocale(c838510Wuv.LIZJ(0));
                configuration.setLayoutDirection(c838510Wuv.LIZJ(0));
            }
        }
        resources.updateConfiguration(configuration, null);
        if (Build.VERSION.SDK_INT < 26) {
            ResourcesFlusher.flush(resources);
        }
        int i2 = this.LLLIILIL;
        if (i2 != 0) {
            this.LLJIJIL.setTheme(i2);
            this.LLJIJIL.getTheme().applyStyle(this.LLLIILIL, true);
        }
        if (z) {
            Object obj = this.LLJI;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                        activity.onConfigurationChanged(configuration);
                    }
                } else {
                    if (!this.LLLIIII || this.LLLIIIIL) {
                        return;
                    }
                    activity.onConfigurationChanged(configuration);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        if (r6 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(int r5, androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r6, X.C19V6 r7) {
        /*
            r4 = this;
            if (r7 != 0) goto L16
            if (r6 != 0) goto Lf
            if (r5 < 0) goto L19
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r1 = r4.LLLFFI
            int r0 = r1.length
            if (r5 >= r0) goto L19
            r6 = r1[r5]
            if (r6 == 0) goto L19
        Lf:
            X.19V6 r7 = r6.LJII
        L11:
            boolean r0 = r6.LJIIL
            if (r0 != 0) goto L19
            return
        L16:
            if (r6 == 0) goto L19
            goto L11
        L19:
            boolean r0 = r4.LLLIIIIL
            if (r0 != 0) goto L39
            X.19W8 r3 = r4.LLJILJILJ
            android.view.Window r0 = r4.LLJILJIL
            android.view.Window$Callback r2 = r0.getCallback()
            r3.getClass()
            r0 = 1
            r1 = 0
            r3.LLILZIL = r0     // Catch: java.lang.Throwable -> L30
            r2.onPanelClosed(r5, r7)     // Catch: java.lang.Throwable -> L30
            goto L37
        L30:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L30
            r3.LLILZIL = r1
            throw r0
        L37:
            r3.LLILZIL = r1
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.LJJIL(int, androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, X.19V6):void");
    }

    public final boolean LJJJLL(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        C19V6 c19v6;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!panelFeatureState.LJIIJ && !LJJJLZIJ(panelFeatureState, keyEvent)) || (c19v6 = panelFeatureState.LJII) == null) {
            return false;
        }
        return c19v6.performShortcut(i, keyEvent, 1);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Window window, C19WW c19ww, Object obj) {
        C830530Wi3<String, Integer> c830530Wi3;
        Integer num;
        this.LLLIIL = -100;
        this.LLJIJIL = context;
        this.LLJILLL = c19ww;
        this.LLJI = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof C19GS) {
                        C19GS c19gs = (C19GS) context;
                        if (c19gs != null) {
                            this.LLLIIL = c19gs.getDelegate().LJIIIIZZ();
                        }
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
        }
        if (this.LLLIIL == -100 && (num = (c830530Wi3 = LLLLIILLL).get(this.LLJI.getClass().getName())) != null) {
            this.LLLIIL = num.intValue();
            c830530Wi3.remove(this.LLJI.getClass().getName());
        }
        if (window != null) {
            LJJIJL(window);
        }
        C14MG.LIZLLL();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.LLLLIIIILLL == null) {
            TypedArray typedArrayObtainStyledAttributes = this.LLJIJIL.obtainStyledAttributes(R$styleable.AppCompatTheme);
            String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.AppCompatTheme_viewInflaterClass);
            typedArrayObtainStyledAttributes.recycle();
            if (strXd == null) {
                this.LLLLIIIILLL = new C21413018r2();
            } else {
                try {
                    this.LLLLIIIILLL = (C21413018r2) this.LLJIJIL.getClassLoader().loadClass(strXd).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLLLIIIILLL = new C21413018r2();
                }
            }
        }
        return this.LLLLIIIILLL.createView(view, str, context, attributeSet, false, false, true, false);
    }

    public static Configuration LJJJI(Context context, int i, C838510Wuv c838510Wuv, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = C786410Ut5.N3(context).getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c838510Wuv != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                C838570Wv1.LIZLLL(configuration2, c838510Wuv);
            } else {
                configuration2.setLocale(c838510Wuv.LIZJ(0));
                configuration2.setLayoutDirection(c838510Wuv.LIZJ(0));
                return configuration2;
            }
        }
        return configuration2;
    }
}

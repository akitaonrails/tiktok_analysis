package X;

import Y.ARunnableS125S0100000_25;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0uGM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class ViewOnLongClickListenerC1697040uGM implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static ViewOnLongClickListenerC1697040uGM LLJIJIL;
    public static ViewOnLongClickListenerC1697040uGM LLJILJIL;
    public final View LL;
    public final CharSequence LLILLJJLI;
    public final int LLILLL;
    public final ARunnableS125S0100000_25 LLILZ = new ARunnableS125S0100000_25(this, 0);
    public final ARunnableS125S0100000_25 LLILZIL = new ARunnableS125S0100000_25(this, 1);
    public int LLILZLL;
    public int LLIZ;
    public C1687810u1T LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public final void LIZ() {
        if (LLJILJIL == this) {
            LLJILJIL = null;
            C1687810u1T c1687810u1T = this.LLIZLLLIL;
            if (c1687810u1T != null) {
                if (c1687810u1T.LIZIZ.getParent() != null) {
                    ((WindowManager) C786410Ut5.H2(c1687810u1T.LIZ, "window")).removeView(c1687810u1T.LIZIZ);
                }
                this.LLIZLLLIL = null;
                this.LLJI = true;
                this.LL.removeOnAttachStateChangeListener(this);
            }
        }
        if (LLJIJIL == this) {
            LIZIZ(null);
        }
        this.LL.removeCallbacks(this.LLILZIL);
    }

    public static void LIZIZ(ViewOnLongClickListenerC1697040uGM viewOnLongClickListenerC1697040uGM) {
        ViewOnLongClickListenerC1697040uGM viewOnLongClickListenerC1697040uGM2 = LLJIJIL;
        if (viewOnLongClickListenerC1697040uGM2 != null) {
            viewOnLongClickListenerC1697040uGM2.LL.removeCallbacks(viewOnLongClickListenerC1697040uGM2.LLILZ);
        }
        LLJIJIL = viewOnLongClickListenerC1697040uGM;
        if (viewOnLongClickListenerC1697040uGM != null) {
            viewOnLongClickListenerC1697040uGM.LL.postDelayed(viewOnLongClickListenerC1697040uGM.LLILZ, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void LIZJ(boolean z) {
        boolean z2;
        int height;
        int i;
        int i2;
        long longPressTimeout;
        long j;
        long j2;
        int dimensionPixelSize;
        if (!this.LL.isAttachedToWindow()) {
            return;
        }
        LIZIZ(null);
        ViewOnLongClickListenerC1697040uGM viewOnLongClickListenerC1697040uGM = LLJILJIL;
        if (viewOnLongClickListenerC1697040uGM != null) {
            viewOnLongClickListenerC1697040uGM.LIZ();
        }
        LLJILJIL = this;
        this.LLJ = z;
        C1687810u1T c1687810u1T = new C1687810u1T(this.LL.getContext());
        this.LLIZLLLIL = c1687810u1T;
        View view = this.LL;
        int width = this.LLILZLL;
        int i3 = this.LLIZ;
        boolean z3 = this.LLJ;
        CharSequence charSequence = this.LLILLJJLI;
        if (c1687810u1T.LIZIZ.getParent() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && c1687810u1T.LIZIZ.getParent() != null) {
            ((WindowManager) C786410Ut5.H2(c1687810u1T.LIZ, "window")).removeView(c1687810u1T.LIZIZ);
        }
        c1687810u1T.LIZJ.setText(charSequence);
        WindowManager.LayoutParams layoutParams = c1687810u1T.LIZLLL;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = c1687810u1T.LIZ.getResources().getDimensionPixelOffset(R.dimen.aj1);
        if (view.getWidth() < dimensionPixelOffset) {
            width = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = c1687810u1T.LIZ.getResources().getDimensionPixelOffset(R.dimen.aj0);
            height = i3 + dimensionPixelOffset2;
            i = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = c1687810u1T.LIZ.getResources();
        if (z3) {
            i2 = R.dimen.aj4;
        } else {
            i2 = R.dimen.aj3;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if ((layoutParams2 instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams2).type == 2) {
            rootView.getWindowVisibleDisplayFrame(c1687810u1T.LJ);
            Rect rect = c1687810u1T.LJ;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = c1687810u1T.LIZ.getResources();
                int iN3 = C786410Ut5.n3(resources2, "status_bar_height", "dimen", "android");
                if (iN3 != 0) {
                    dimensionPixelSize = resources2.getDimensionPixelSize(iN3);
                } else {
                    dimensionPixelSize = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                c1687810u1T.LJ.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen(c1687810u1T.LJI);
            view.getLocationOnScreen(c1687810u1T.LJFF);
            int[] iArr = c1687810u1T.LJFF;
            int i4 = iArr[0];
            int[] iArr2 = c1687810u1T.LJI;
            int i5 = i4 - iArr2[0];
            iArr[0] = i5;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i5 + width) - (rootView.getWidth() / 2);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            c1687810u1T.LIZIZ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            int measuredHeight = c1687810u1T.LIZIZ.getMeasuredHeight();
            int i6 = c1687810u1T.LJFF[1];
            int i7 = ((i + i6) - dimensionPixelOffset3) - measuredHeight;
            int i8 = i6 + height + dimensionPixelOffset3;
            if (z3) {
                if (i7 >= 0) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i8;
                }
            } else if (measuredHeight + i8 <= c1687810u1T.LJ.height()) {
                layoutParams.y = i8;
            } else {
                layoutParams.y = i7;
            }
        } else {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    if (rootView != null) {
                        break;
                    }
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
        }
        ((WindowManager) C786410Ut5.H2(c1687810u1T.LIZ, "window")).addView(c1687810u1T.LIZIZ, c1687810u1T.LIZLLL);
        this.LL.addOnAttachStateChangeListener(this);
        if (this.LLJ) {
            j2 = 2500;
        } else {
            if ((this.LL.getWindowSystemUiVisibility() & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        this.LL.removeCallbacks(this.LLILZIL);
        this.LL.postDelayed(this.LLILZIL, j2);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.LLILZLL = view.getWidth() / 2;
        this.LLIZ = view.getHeight() / 2;
        LIZJ(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        LIZ();
    }

    public ViewOnLongClickListenerC1697040uGM(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.LL = view;
        this.LLILLJJLI = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = C19737612Kg.LIZ;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = C1697070uGP.LIZ(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.LLILLL = scaledTouchSlop;
        this.LLJI = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.LLIZLLLIL != null && this.LLJ) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) C786410Ut5.H2(this.LL.getContext(), "accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.LLJI = true;
                LIZ();
            }
        } else if (this.LL.isEnabled() && this.LLIZLLLIL == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.LLJI || Math.abs(x - this.LLILZLL) > this.LLILLL || Math.abs(y - this.LLIZ) > this.LLILLL) {
                this.LLILZLL = x;
                this.LLIZ = y;
                this.LLJI = false;
                LIZIZ(this);
                return false;
            }
        }
        return false;
    }
}

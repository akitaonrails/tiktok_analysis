package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19TJ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19TJ extends C19T9 {
    public final C19TM LIZLLL;
    public final ViewOnFocusChangeListenerC21544719Th LJ;
    public final C19TL LJFF;
    public final C19TI LJI;
    public final C19TP LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public StateListDrawable LJIIJJI;
    public C21538919Rb LJIIL;
    public AccessibilityManager LJIILIIL;
    public ValueAnimator LJIILJJIL;
    public ValueAnimator LJIILL;

    @Override // X.C19T9
    public final boolean LIZIZ(int i) {
        return i != 0;
    }

    @Override // X.C19T9
    public final void LIZ() {
        float dimensionPixelOffset = this.LIZIZ.getResources().getDimensionPixelOffset(R.dimen.aaf);
        float dimensionPixelOffset2 = this.LIZIZ.getResources().getDimensionPixelOffset(R.dimen.a9x);
        int dimensionPixelOffset3 = this.LIZIZ.getResources().getDimensionPixelOffset(R.dimen.a9z);
        C21538919Rb c21538919RbLIZLLL = LIZLLL(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C21538919Rb c21538919RbLIZLLL2 = LIZLLL(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.LJIIL = c21538919RbLIZLLL;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.LJIIJJI = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, c21538919RbLIZLLL);
        this.LJIIJJI.addState(new int[0], c21538919RbLIZLLL2);
        this.LIZ.setEndIconDrawable(C14MI.LIZ(this.LIZIZ, R.drawable.cnz));
        C21543419Su c21543419Su = this.LIZ;
        c21543419Su.setEndIconContentDescription(c21543419Su.getResources().getText(2131834323));
        this.LIZ.setEndIconOnClickListener(new View.OnClickListener() { // from class: X.19Tb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.LL.LJFF((AutoCompleteTextView) this.LL.LIZ.getEditText());
            }
        });
        C21543419Su c21543419Su2 = this.LIZ;
        C19TI c19ti = this.LJI;
        c21543419Su2.LLLILZLLLI.add(c19ti);
        if (c21543419Su2.LLILZIL != null) {
            c19ti.LIZ(c21543419Su2);
        }
        this.LIZ.LLLJL.add(this.LJII);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = C194V.LIZ;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(67);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19TY
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C21545019Tk c21545019Tk = this.LL.LIZJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545019Tk);
                c21545019Tk.setAlpha(fFloatValue);
            }
        });
        this.LJIILL = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(50);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19TY
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C21545019Tk c21545019Tk = this.LL.LIZJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545019Tk);
                c21545019Tk.setAlpha(fFloatValue);
            }
        });
        this.LJIILJJIL = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: X.19TZ
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C19TJ c19tj = this.LL;
                c19tj.LIZJ.setChecked(c19tj.LJIIIZ);
                this.LL.LJIILL.start();
            }
        });
        this.LJIILIIL = (AccessibilityManager) C786410Ut5.H2(this.LIZIZ, "accessibility");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.19Th] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.19TL] */
    public C19TJ(final C21543419Su c21543419Su) {
        super(c21543419Su);
        this.LIZLLL = new C19TM(this);
        this.LJ = new View.OnFocusChangeListener() { // from class: X.19Th
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.LL.LIZ.setEndIconActivated(z);
                if (!z) {
                    this.LL.LJ(false);
                    this.LL.LJIIIIZZ = false;
                }
            }
        };
        this.LJFF = new C21543919Sz(c21543419Su) { // from class: X.19TL
            @Override // X.C21543919Sz, X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (this.LIZIZ.LIZ.getEditText().getKeyListener() == null) {
                    accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
                }
                if (accessibilityNodeInfoCompat.isShowingHintText()) {
                    accessibilityNodeInfoCompat.setHintText(null);
                }
            }

            @Override // X.C20094213jo
            public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                EditText editText = this.LIZIZ.LIZ.getEditText();
                if (editText instanceof AutoCompleteTextView) {
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                    if (accessibilityEvent.getEventType() == 1 && this.LIZIZ.LJIILIIL.isTouchExplorationEnabled() && this.LIZIZ.LIZ.getEditText().getKeyListener() == null) {
                        this.LIZIZ.LJFF(autoCompleteTextView);
                        return;
                    }
                    return;
                }
                throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            }
        };
        this.LJI = new C19TI(this);
        this.LJII = new C19TP(this);
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        this.LJIIJ = Long.MAX_VALUE;
    }

    public final void LJ(boolean z) {
        if (this.LJIIIZ != z) {
            this.LJIIIZ = z;
            this.LJIILL.cancel();
            this.LJIILJJIL.start();
        }
    }

    public final void LJFF(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIJ;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.LJIIIIZZ = false;
        }
        if (!this.LJIIIIZZ) {
            LJ(!this.LJIIIZ);
            if (this.LJIIIZ) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            } else {
                autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.LJIIIIZZ = false;
    }

    public final C21538919Rb LIZLLL(float f, float f2, float f3, int i) {
        C19RY c19ry = new C19RY();
        c19ry.LIZLLL(f);
        c19ry.LJFF = new C1844490y6B(f);
        c19ry.LJII = new C1844490y6B(f2);
        c19ry.LJI = new C1844490y6B(f2);
        C19RX c19rx = new C19RX(c19ry);
        Context context = this.LIZIZ;
        Paint paint = C21538919Rb.LLJJJJ;
        int iLIZIZ = C19PF.LIZIZ(context, R.attr.bix, C21538919Rb.class.getSimpleName());
        C21538919Rb c21538919Rb = new C21538919Rb();
        c21538919Rb.LJIIIIZZ(context);
        c21538919Rb.LJIIJJI(ColorStateList.valueOf(iLIZIZ));
        c21538919Rb.LJIIJ(f3);
        c21538919Rb.setShapeAppearanceModel(c19rx);
        C21539019Rc c21539019Rc = c21538919Rb.LL;
        if (c21539019Rc.LJII == null) {
            c21539019Rc.LJII = new Rect();
        }
        c21538919Rb.LL.LJII.set(0, i, 0, i);
        c21538919Rb.invalidateSelf();
        return c21538919Rb;
    }
}

package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19TG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19TG extends C19T9 {
    public final C21544019Ta LIZLLL;
    public final ViewOnFocusChangeListenerC21544319Td LJ;
    public final C19TH LJFF;
    public final C19TT LJI;
    public AnimatorSet LJII;
    public ValueAnimator LJIIIIZZ;

    @Override // X.C19T9
    public final void LIZ() {
        this.LIZ.setEndIconDrawable(C14MI.LIZ(this.LIZIZ, R.drawable.co2));
        C21543419Su c21543419Su = this.LIZ;
        c21543419Su.setEndIconContentDescription(c21543419Su.getResources().getText(2131828847));
        this.LIZ.setEndIconOnClickListener(new View.OnClickListener() { // from class: X.19T8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Editable text = this.LL.LIZ.getEditText().getText();
                if (text != null) {
                    text.clear();
                }
                C21543419Su c21543419Su2 = this.LL.LIZ;
                c21543419Su2.LJIIJ(c21543419Su2.LLLJIL, c21543419Su2.LLLL);
            }
        });
        C21543419Su c21543419Su2 = this.LIZ;
        C19TH c19th = this.LJFF;
        c21543419Su2.LLLILZLLLI.add(c19th);
        if (c21543419Su2.LLILZIL != null) {
            c19th.LIZ(c21543419Su2);
        }
        this.LIZ.LLLJL.add(this.LJI);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(C194V.LIZLLL);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19TW
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C21545019Tk c21545019Tk = this.LL.LIZJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545019Tk);
                c21545019Tk.setScaleX(fFloatValue);
                C21545019Tk c21545019Tk2 = this.LL.LIZJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545019Tk2);
                c21545019Tk2.setScaleY(fFloatValue);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = C194V.LIZ;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19TX
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C21545019Tk c21545019Tk = this.LL.LIZJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545019Tk);
                c21545019Tk.setAlpha(fFloatValue);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.LJII = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.LJII.addListener(new AnimatorListenerAdapter() { // from class: X.19Tf
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                this.LL.LIZ.setEndIconVisible(true);
            }
        });
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(100L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19TX
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C21545019Tk c21545019Tk = this.LL.LIZJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545019Tk);
                c21545019Tk.setAlpha(fFloatValue);
            }
        });
        this.LJIIIIZZ = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new AnimatorListenerAdapter() { // from class: X.19Tg
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.LL.LIZ.setEndIconVisible(false);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19Ta] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.19Td] */
    public C19TG(C21543419Su c21543419Su) {
        super(c21543419Su);
        this.LIZLLL = new TextWatcher() { // from class: X.19Ta
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                boolean z;
                if (this.LL.LIZ.getSuffixText() != null) {
                    return;
                }
                C19TG c19tg = this.LL;
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                c19tg.LIZLLL(z);
            }
        };
        this.LJ = new View.OnFocusChangeListener() { // from class: X.19Td
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                boolean z2 = true;
                boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
                C19TG c19tg = this.LL;
                if (!z3 || !z) {
                    z2 = false;
                }
                c19tg.LIZLLL(z2);
            }
        };
        this.LJFF = new C19TH(this);
        this.LJI = new C19TT(this);
    }

    @Override // X.C19T9
    public final void LIZJ(boolean z) {
        if (this.LIZ.getSuffixText() == null) {
            return;
        }
        LIZLLL(z);
    }

    public final void LIZLLL(boolean z) {
        boolean z2;
        if (this.LIZ.LJI() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!this.LJII.isRunning()) {
                this.LJIIIIZZ.cancel();
                this.LJII.start();
                if (z2) {
                    this.LJII.end();
                    return;
                }
                return;
            }
            return;
        }
        this.LJII.cancel();
        this.LJIIIIZZ.start();
        if (!z2) {
            return;
        }
        this.LJIIIIZZ.end();
    }
}

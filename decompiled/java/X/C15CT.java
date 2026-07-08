package X;

import Y.ALAdapterS5S0000000_31;
import Y.AUListenerS233S0200000_31;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.chatroom.model.AnchorFinishEncourageData;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15CT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15CT extends ConstraintLayout {
    public C16F5 LL;
    public View LLILLJJLI;
    public ProgressBar LLILLL;
    public ProgressBar LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public ConstraintLayout LLIZ;
    public AnchorFinishEncourageData.Task LLIZLLLIL;
    public C15CU LLJ;
    public int LLJI;
    public ValueAnimator LLJIJIL;
    public float LLJILJIL;
    public AnimatorSet LLJILJILJ;
    public AnimatorSet LLJILLL;
    public boolean LLJJ;

    public final void cancel() {
        C16F5 progressTextFromXml;
        String strLIZIZ;
        ValueAnimator valueAnimator = this.LLJIJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnchorFinishEncourageData.Task task = this.LLIZLLLIL;
        if (task != null && (progressTextFromXml = getProgressTextFromXml()) != null) {
            if (task.aggregated) {
                strLIZIZ = "";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(task.currentNum);
                sbLIZ.append('/');
                sbLIZ.append(task.targetNum);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            progressTextFromXml.setText(strLIZIZ);
        }
        ProgressBar taskProgressBarFromXml = getTaskProgressBarFromXml();
        if (taskProgressBarFromXml != null) {
            float f = this.LLJILJIL;
            taskProgressBarFromXml.setProgress((f > 1.0f || f <= 0.0f) ? (int) f : 1);
        }
        View taskThumbFromXml = getTaskThumbFromXml();
        if (taskThumbFromXml != null) {
            C786410Ut5.LJLLLLLL(8, taskThumbFromXml);
        }
        AnimatorSet animatorSet = this.LLJILJILJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJILJILJ = null;
        AnimatorSet animatorSet2 = this.LLJILLL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LLJILLL = null;
    }

    public final C16F5 getProgressTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.s9w);
            this.LLILZIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final ConstraintLayout getRootViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tsc);
            this.LLIZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C16F5 getSubProgressTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wgn);
            this.LLILZLL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final ProgressBar getSubTaskProgressBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wgu);
            this.LLILLL = (ProgressBar) callbackFindViewById;
        }
        return (ProgressBar) callbackFindViewById;
    }

    public final ProgressBar getTaskProgressBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xen);
            this.LLILZ = (ProgressBar) callbackFindViewById;
        }
        return (ProgressBar) callbackFindViewById;
    }

    public final View getTaskThumbFromXml() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.xf0);
        this.LLILLJJLI = viewFindViewById;
        return viewFindViewById;
    }

    public final C16F5 getTitleTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y3b);
            this.LL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final void e0() {
        if (getRootViewFromXml() == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getRootViewFromXml(), (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.LLJILLL = animatorSet;
        animatorSet.play(objectAnimatorOfFloat);
        AnimatorSet animatorSet2 = this.LLJILLL;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new ALAdapterS5S0000000_31(1));
        }
        AnimatorSet animatorSet3 = this.LLJILLL;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    public final void play() {
        AnchorFinishEncourageData.Task task;
        if (getTaskProgressBarFromXml() == null || getVisibility() == 8 || (task = this.LLIZLLLIL) == null) {
            return;
        }
        float f = (task.currentNum / task.targetNum) * 100 * 1.0f;
        this.LLJILJIL = f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
        this.LLJIJIL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(200L);
        }
        ValueAnimator valueAnimator = this.LLJIJIL;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new DecelerateInterpolator());
        }
        ValueAnimator valueAnimator2 = this.LLJIJIL;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS233S0200000_31(this, task, 5));
        }
        ValueAnimator valueAnimator3 = this.LLJIJIL;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public final void setProgressTextFromXml(C16F5 c16f5) {
        this.LLILZIL = c16f5;
    }

    public final void setRootViewFromXml(ConstraintLayout constraintLayout) {
        this.LLIZ = constraintLayout;
    }

    public final void setSubProgressTextFromXml(C16F5 c16f5) {
        this.LLILZLL = c16f5;
    }

    public final void setSubTaskProgressBarFromXml(ProgressBar progressBar) {
        this.LLILLL = progressBar;
    }

    public final void setTaskProgressBarFromXml(ProgressBar progressBar) {
        this.LLILZ = progressBar;
    }

    public final void setTaskThumbFromXml(View view) {
        this.LLILLJJLI = view;
    }

    public final void setTitleTextFromXml(C16F5 c16f5) {
        this.LL = c16f5;
    }

    public C15CT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C15CT(Context context, AttributeSet attributeSet, int i) {
        Drawable progressDrawable;
        LayerDrawable layerDrawable;
        LayerDrawable layerDrawable2;
        Drawable drawableFindDrawableByLayerId;
        Drawable drawableFindDrawableByLayerId2;
        super(context, attributeSet, i);
        this.LLJI = -1;
        ViewGroup.inflate(new C1361400lX0(context, C011Z.LIZ.LJ()), R.layout.gz7, this);
        if (C497740JfY.LJJ()) {
            C16F5 titleTextFromXml = getTitleTextFromXml();
            if (titleTextFromXml != null) {
                titleTextFromXml.setGravity(8388611);
            }
            View taskThumbFromXml = getTaskThumbFromXml();
            if (taskThumbFromXml != null) {
                taskThumbFromXml.setBackgroundResource(R.drawable.egn);
            }
        } else {
            C16F5 titleTextFromXml2 = getTitleTextFromXml();
            if (titleTextFromXml2 != null) {
                titleTextFromXml2.setGravity(8388611);
            }
            View taskThumbFromXml2 = getTaskThumbFromXml();
            if (taskThumbFromXml2 != null) {
                taskThumbFromXml2.setBackgroundResource(R.drawable.egm);
            }
        }
        float[] fArr = new float[3];
        Color.colorToHSV(C15CY.LIZ, fArr);
        fArr[1] = fArr[1] - 0.2f;
        fArr[2] = fArr[2] + 0.6f;
        int iHSVToColor = Color.HSVToColor(fArr);
        ProgressBar subTaskProgressBarFromXml = getSubTaskProgressBarFromXml();
        if (subTaskProgressBarFromXml != null) {
            progressDrawable = subTaskProgressBarFromXml.getProgressDrawable();
        } else {
            progressDrawable = null;
        }
        if (progressDrawable instanceof LayerDrawable) {
            layerDrawable = (LayerDrawable) progressDrawable;
        } else {
            layerDrawable = null;
        }
        if (layerDrawable != null && (drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(android.R.id.progress)) != null) {
            drawableFindDrawableByLayerId2.setColorFilter(iHSVToColor, PorterDuff.Mode.SRC_IN);
        }
        ProgressBar taskProgressBarFromXml = getTaskProgressBarFromXml();
        Drawable progressDrawable2 = taskProgressBarFromXml != null ? taskProgressBarFromXml.getProgressDrawable() : null;
        if ((progressDrawable2 instanceof LayerDrawable) && (layerDrawable2 = (LayerDrawable) progressDrawable2) != null && (drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(android.R.id.progress)) != null) {
            drawableFindDrawableByLayerId.setColorFilter(iHSVToColor, PorterDuff.Mode.SRC_IN);
        }
    }

    public final void h0(AnchorFinishEncourageData.Task task, C15CU c15cu, int i) {
        String strLIZIZ;
        if (task == null) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        this.LLIZLLLIL = task;
        this.LLJ = c15cu;
        this.LLJI = i;
        C16F5 titleTextFromXml = getTitleTextFromXml();
        if (titleTextFromXml != null) {
            titleTextFromXml.setText(task.title);
        }
        C16F5 progressTextFromXml = getProgressTextFromXml();
        String strLIZIZ2 = "";
        if (progressTextFromXml != null) {
            if (task.aggregated) {
                strLIZIZ = "";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("0/");
                sbLIZ.append(task.targetNum);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            progressTextFromXml.setText(strLIZIZ);
        }
        C16F5 subProgressTextFromXml = getSubProgressTextFromXml();
        if (subProgressTextFromXml != null) {
            if (!task.aggregated) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(task.currentNum);
                sbLIZ2.append('/');
                sbLIZ2.append(task.targetNum);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
            subProgressTextFromXml.setText(strLIZIZ2);
        }
        int visibility2 = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
    }
}

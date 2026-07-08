package X;

import Y.AUListenerS233S0200000_31;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.text.u;
import tikcast.api.anchor_data.FinishEncourageTask;

/* JADX INFO: renamed from: X.15Ck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20481615Ck extends ConstraintLayout {
    public C16F5 LL;
    public ImageView LLILLJJLI;
    public ProgressBar LLILLL;
    public ProgressBar LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public ConstraintLayout LLIZ;
    public View LLIZLLLIL;
    public FinishEncourageTask LLJ;
    public C15D6 LLJI;
    public int LLJIJIL;
    public ValueAnimator LLJILJIL;
    public float LLJILJILJ;
    public AnimatorSet LLJILLL;
    public AnimatorSet LLJJ;
    public EnumC20482415Cs LLJJI;
    public C15D3 LLJJIII;

    public final void cancel() {
        ValueAnimator valueAnimator = this.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FinishEncourageTask finishEncourageTask = this.LLJ;
        if (finishEncourageTask != null) {
            double d = finishEncourageTask.progress;
            EnumC20482415Cs enumC20482415Cs = this.LLJJI;
            EnumC20482415Cs enumC20482415Cs2 = EnumC20482415Cs.PERCENTAGE;
            String strE0 = e0(enumC20482415Cs == enumC20482415Cs2, d);
            String strE02 = e0(this.LLJJI == enumC20482415Cs2, finishEncourageTask.target);
            C16F5 c16f5 = this.LLILZIL;
            if (c16f5 != null) {
                c16f5.setText(strE0);
            }
            C16F5 c16f52 = this.LLILZLL;
            if (c16f52 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" / ");
                sbLIZ.append(strE02);
                c16f52.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        ProgressBar progressBar = this.LLILZ;
        if (progressBar != null) {
            float f = this.LLJILJILJ;
            progressBar.setProgress((f > 1.0f || f <= 0.0f) ? (int) f : 1);
        }
        AnimatorSet animatorSet = this.LLJILLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJILLL = null;
    }

    public final C16F5 getTitleTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y3b);
            this.LL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final void play() {
        FinishEncourageTask finishEncourageTask;
        float f;
        float f2;
        if (this.LLILZ == null || getVisibility() == 8 || (finishEncourageTask = this.LLJ) == null) {
            return;
        }
        double d = finishEncourageTask.initProgress;
        float f3 = 0.0f;
        if (d > 0.0d) {
            double d2 = d / finishEncourageTask.target;
            if (d2 > 1.0d) {
                d2 = 1.0d;
            }
            f = (float) (d2 * ((double) 100));
        } else {
            f = 0.0f;
        }
        double d3 = finishEncourageTask.target;
        if (d3 > 0.0d) {
            f2 = 100.0f;
            double d4 = finishEncourageTask.progress / d3;
            f3 = (float) ((d4 <= 1.0d ? d4 : 1.0d) * ((double) 100));
        } else {
            f2 = 0.0f;
        }
        this.LLJILJILJ = f3;
        ProgressBar progressBar = this.LLILZ;
        if (progressBar != null) {
            progressBar.setMax((int) f2);
            progressBar.setProgress((int) f);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, this.LLJILJILJ);
        this.LLJILJIL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(400L);
        }
        ValueAnimator valueAnimator = this.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(C1619980sG4.LIZLLL());
        }
        ValueAnimator valueAnimator2 = this.LLJILJIL;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS233S0200000_31(this, finishEncourageTask, 6));
        }
        ValueAnimator valueAnimator3 = this.LLJILJIL;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancel();
    }

    public final ImageView getIcon() {
        return this.LLILLJJLI;
    }

    public final View getProgressCenterAnchor() {
        return this.LLIZLLLIL;
    }

    public final C16F5 getProgressTargetTextView() {
        return this.LLILZLL;
    }

    public final C16F5 getProgressTextView() {
        return this.LLILZIL;
    }

    public final ConstraintLayout getRootViewFromXml() {
        return this.LLIZ;
    }

    public final ProgressBar getSubTaskProgressBarFromXml() {
        return this.LLILLL;
    }

    public final ProgressBar getTaskProgressBarFromXml() {
        return this.LLILZ;
    }

    public final void setIcon(ImageView imageView) {
        this.LLILLJJLI = imageView;
    }

    public final void setOnAnimationEndListener(C15D3 c15d3) {
        this.LLJJIII = c15d3;
    }

    public final void setProgressCenterAnchor(View view) {
        this.LLIZLLLIL = view;
    }

    public final void setProgressTargetTextView(C16F5 c16f5) {
        this.LLILZLL = c16f5;
    }

    public final void setProgressTextView(C16F5 c16f5) {
        this.LLILZIL = c16f5;
    }

    public final void setRootViewFromXml(ConstraintLayout constraintLayout) {
        this.LLIZ = constraintLayout;
    }

    public final void setSubTaskProgressBarFromXml(ProgressBar progressBar) {
        this.LLILLL = progressBar;
    }

    public final void setTaskProgressBarFromXml(ProgressBar progressBar) {
        this.LLILZ = progressBar;
    }

    public final void setTitleTextFromXml(C16F5 c16f5) {
        this.LL = c16f5;
    }

    public static final String e0(boolean z, double d) {
        String strK4;
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((int) (d * ((double) 100)));
            sbLIZ.append('%');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (d >= 1000000.0d) {
            strK4 = C786410Ut5.k4(Locale.US, "%.1fM", Arrays.copyOf(new Object[]{Double.valueOf(d / ((double) 1000000))}, 1));
        } else if (d >= 10000.0d) {
            strK4 = C786410Ut5.k4(Locale.US, "%.1fK", Arrays.copyOf(new Object[]{Double.valueOf(d / ((double) LSPassThroughRecordSizeConfig.DEFAULT))}, 1));
        } else {
            strK4 = C786410Ut5.k4(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        }
        return u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(strK4, ".0M", "M", false), ".0K", "K", false), ".0", "", false);
    }

    public C20481615Ck(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJIJIL = -1;
        this.LLJJI = EnumC20482415Cs.NUMBER;
        ViewGroup.inflate(new C1361400lX0(context, C011Z.LIZ.LJ()), R.layout.gz8, this);
        this.LLILZIL = (C16F5) findViewById(R.id.mx2);
        this.LLILZLL = (C16F5) findViewById(R.id.mx5);
        this.LLILLL = (ProgressBar) findViewById(R.id.wgu);
        this.LLILZ = (ProgressBar) findViewById(R.id.xen);
        this.LLIZLLLIL = findViewById(R.id.s90);
        this.LL = (C16F5) findViewById(R.id.y3b);
        this.LLIZ = (ConstraintLayout) findViewById(R.id.tsc);
        this.LLILLJJLI = (ImageView) findViewById(R.id.s9a);
        if (C497740JfY.LJJ()) {
            C16F5 titleTextFromXml = getTitleTextFromXml();
            if (titleTextFromXml != null) {
                titleTextFromXml.setGravity(8388611);
                return;
            }
            return;
        }
        C16F5 titleTextFromXml2 = getTitleTextFromXml();
        if (titleTextFromXml2 == null) {
            return;
        }
        titleTextFromXml2.setGravity(8388611);
    }
}

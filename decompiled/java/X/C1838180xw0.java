package X;

import Y.ALAdapterS4S0101000_27;
import Y.AUListenerS230S0200000_27;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.text.u;
import tikcast.api.anchor_data.FinishEncourageTask;

/* JADX INFO: renamed from: X.0xw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838180xw0 extends ConstraintLayout {
    public C16F5 LL;
    public ProgressBar LLILLJJLI;
    public ProgressBar LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public FinishEncourageTask LLILZLL;
    public ValueAnimator LLIZ;
    public float LLIZLLLIL;
    public AnimatorSet LLJ;
    public InterfaceC1838190xw1 LLJI;
    public EnumC1322650kWV LLJIJIL;

    public final void cancel() {
        double d;
        double d2;
        double d3;
        try {
            ValueAnimator valueAnimator = this.LLIZ;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLIZ = null;
        FinishEncourageTask finishEncourageTask = this.LLILZLL;
        int i = 1;
        if (finishEncourageTask != null) {
            double d4 = finishEncourageTask.progress;
            EnumC1322650kWV enumC1322650kWV = this.LLJIJIL;
            EnumC1322650kWV enumC1322650kWV2 = EnumC1322650kWV.PERCENTAGE;
            String strH0 = h0(enumC1322650kWV == enumC1322650kWV2, d4);
            String strH02 = h0(this.LLJIJIL == enumC1322650kWV2, finishEncourageTask.target);
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                c16f5.setText(strH0);
            }
            C16F5 c16f52 = this.LLILZIL;
            if (c16f52 != null) {
                c16f52.setText(" / " + strH02);
            }
        }
        float f = this.LLIZLLLIL;
        if (f <= 0.0f) {
            FinishEncourageTask finishEncourageTask2 = this.LLILZLL;
            if (finishEncourageTask2 != null) {
                d = finishEncourageTask2.target;
                d2 = finishEncourageTask2.progress;
            } else {
                d = 0.0d;
                d2 = 0.0d;
            }
            if (d > 0.0d) {
                double d5 = d2 / d;
                if (d5 > 1.0d) {
                    d5 = 1.0d;
                }
                d3 = d5 * 100.0d;
            } else {
                d3 = 0.0d;
            }
            int i2 = (int) d3;
            if (i2 > 0 || d2 <= 0.0d || d <= 0.0d) {
                i = i2;
            }
        } else if (f > 1.0f) {
            i = (int) f;
        }
        ProgressBar progressBar = this.LLILLL;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
        ProgressBar progressBar2 = this.LLILLJJLI;
        if (progressBar2 != null) {
            progressBar2.setProgress(i);
        }
        C20441214yg.LIZIZ("EndIncentiveSettlementWeakProgressView", "cancel taskProgressBarFromXml?.progress & subTaskProgressBarFromXml?.progress is " + i);
        try {
            AnimatorSet animatorSet = this.LLJ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LLJ = null;
    }

    public final C16F5 getTitleTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y3b);
            this.LL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getProgressTargetTextView() {
        return this.LLILZIL;
    }

    public final C16F5 getProgressTextView() {
        return this.LLILZ;
    }

    public final ProgressBar getSubTaskProgressBarFromXml() {
        return this.LLILLJJLI;
    }

    public final ProgressBar getTaskProgressBarFromXml() {
        return this.LLILLL;
    }

    public /* synthetic */ C1838180xw0(Context context) {
        this(context, null, 0);
    }

    public static AnimatorSet e0(ProgressBar progressBar) {
        progressBar.setPivotX(0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_X, 1.0f, 1.05f);
        objectAnimatorOfFloat.setDuration(230L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_Y, 1.0f, 2.0f);
        objectAnimatorOfFloat2.setDuration(230L);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LIZLLL());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_X, 1.05f, 1.0f);
        objectAnimatorOfFloat3.setDuration(170L);
        objectAnimatorOfFloat3.setStartDelay(610L);
        objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJI());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_Y, 2.0f, 0.5f);
        objectAnimatorOfFloat4.setDuration(170L);
        objectAnimatorOfFloat4.setStartDelay(610L);
        objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJI());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_X, 1.0f, 1.0f);
        objectAnimatorOfFloat5.setDuration(200L);
        objectAnimatorOfFloat5.setStartDelay(780L);
        objectAnimatorOfFloat5.setInterpolator(C1619980sG4.LJI());
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_Y, 0.5f, 1.0f);
        objectAnimatorOfFloat6.setDuration(200L);
        objectAnimatorOfFloat6.setStartDelay(780L);
        objectAnimatorOfFloat6.setInterpolator(C1619980sG4.LJI());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
        return animatorSet;
    }

    public final void i0(int i) {
        FinishEncourageTask finishEncourageTask;
        float f;
        float f2;
        if (this.LLILLL != null && getVisibility() != 8 && (finishEncourageTask = this.LLILZLL) != null) {
            double d = finishEncourageTask.target;
            if (d > 0.0d) {
                f = 100.0f;
                double d2 = finishEncourageTask.progress / d;
                if (d2 > 1.0d) {
                    d2 = 1.0d;
                }
                f2 = (float) (d2 * ((double) 100));
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            this.LLIZLLLIL = f2;
            ProgressBar progressBar = this.LLILLL;
            if (progressBar != null) {
                progressBar.setMax((int) f);
                progressBar.setProgress(0);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.LLIZLLLIL);
            this.LLIZ = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(400L);
            }
            ValueAnimator valueAnimator = this.LLIZ;
            if (valueAnimator != null) {
                valueAnimator.setStartDelay(80L);
            }
            ValueAnimator valueAnimator2 = this.LLIZ;
            if (valueAnimator2 != null) {
                valueAnimator2.setInterpolator(C1619980sG4.LIZLLL());
            }
            ValueAnimator valueAnimator3 = this.LLIZ;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new ALAdapterS4S0101000_27(this, i, 4));
            }
            ValueAnimator valueAnimator4 = this.LLIZ;
            if (valueAnimator4 != null) {
                valueAnimator4.addUpdateListener(new AUListenerS230S0200000_27(this, finishEncourageTask, 14));
            }
            ValueAnimator valueAnimator5 = this.LLIZ;
            if (valueAnimator5 != null) {
                valueAnimator5.start();
            }
        }
    }

    public final void setProgressTargetTextView(C16F5 c16f5) {
        this.LLILZIL = c16f5;
    }

    public final void setProgressTextView(C16F5 c16f5) {
        this.LLILZ = c16f5;
    }

    public final void setSubTaskProgressBarFromXml(ProgressBar progressBar) {
        this.LLILLJJLI = progressBar;
    }

    public final void setTaskProgressBarFromXml(ProgressBar progressBar) {
        this.LLILLL = progressBar;
    }

    public final void setTitleTextFromXml(C16F5 c16f5) {
        this.LL = c16f5;
    }

    public static final String h0(boolean z, double d) {
        String strK4;
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((int) (d * ((double) 100)));
            sbLIZ.append('%');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (d >= 1000000.0d) {
            strK4 = C786410Ut5.k4(Locale.US, "%.1fM", Arrays.copyOf(new Object[]{Double.valueOf(d / ((double) 1000000))}, 1));
        } else if (d >= 1000.0d) {
            strK4 = C786410Ut5.k4(Locale.US, "%.1fK", Arrays.copyOf(new Object[]{Double.valueOf(d / ((double) LSPassThroughRecordSizeConfig.DEFAULT))}, 1));
        } else {
            strK4 = C786410Ut5.k4(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        }
        return u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(strK4, ".0", "", false), ".0M", "M", false), ".0K", "K", false);
    }

    public C1838180xw0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJIJIL = EnumC1322650kWV.NUMBER;
        ViewGroup.inflate(new C1361400lX0(context, C011Z.LIZ.LJ()), R.layout.gz9, this);
        this.LLILZ = (C16F5) findViewById(R.id.mx3);
        this.LLILZIL = (C16F5) findViewById(R.id.mx6);
        this.LLILLJJLI = (ProgressBar) findViewById(R.id.wgv);
        this.LLILLL = (ProgressBar) findViewById(R.id.xeo);
        this.LL = (C16F5) findViewById(R.id.y3e);
    }

    public static void j0(C1838180xw0 c1838180xw0, FinishEncourageTask finishEncourageTask, InterfaceC1838190xw1 interfaceC1838190xw1) {
        boolean z;
        c1838180xw0.LLJIJIL = EnumC1322650kWV.NUMBER;
        c1838180xw0.LLILZLL = finishEncourageTask;
        C16F5 titleTextFromXml = c1838180xw0.getTitleTextFromXml();
        if (titleTextFromXml != null) {
            titleTextFromXml.setText(finishEncourageTask.taskName);
        }
        c1838180xw0.LLJI = interfaceC1838190xw1;
        Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 900, 12.0f, 1.0f, null, -6.0f, 100, null, 144);
        C16F5 c16f5 = c1838180xw0.LLILZ;
        if (c16f5 != null) {
            c16f5.setTypeface(typefaceLIZIZ);
        }
        C16F5 c16f52 = c1838180xw0.LLILZIL;
        if (c16f52 != null) {
            c16f52.setTypeface(typefaceLIZIZ);
        }
        C16F5 c16f53 = c1838180xw0.LLILZ;
        boolean z2 = true;
        double d = 0.0d;
        if (c16f53 != null) {
            if (c1838180xw0.LLJIJIL == EnumC1322650kWV.PERCENTAGE) {
                z = true;
            } else {
                z = false;
            }
            c16f53.setText(h0(z, 0.0d));
        }
        C16F5 c16f54 = c1838180xw0.LLILZIL;
        if (c16f54 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('/');
            FinishEncourageTask finishEncourageTask2 = c1838180xw0.LLILZLL;
            if (finishEncourageTask2 != null) {
                d = finishEncourageTask2.target;
            }
            if (c1838180xw0.LLJIJIL != EnumC1322650kWV.PERCENTAGE) {
                z2 = false;
            }
            sbLIZ.append(h0(z2, d));
            c16f54.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        int visibility = c1838180xw0.getVisibility();
        c1838180xw0.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1838180xw0);
    }
}

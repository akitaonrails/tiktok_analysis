package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0HUP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HUP extends FrameLayout implements SeekBar.OnSeekBarChangeListener {
    public final C0HUT LL;
    public final C0HUF LLILLJJLI;
    public C0HUV LLILLL;
    public int LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public C0HUW LLIZ;

    public C0HUP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int getProgress() {
        return this.LL.LLILLL.getProgress();
    }

    public final String LIZJ(int i) {
        float f;
        int i2 = C0HUR.LIZ[this.LLIZ.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                f = this.LLILZLL;
                float f2 = this.LLILZIL;
                float max = ((i / this.LL.LLILLL.getMax()) * (f - f2)) + f2;
                if (max >= f2) {
                    f2 = max;
                }
                if (f2 <= f) {
                    f = f2;
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            float f3 = this.LLILZIL;
            int i3 = this.LLILZ;
            float f4 = i + (i3 * f3);
            float f5 = f3 * i3;
            if (f4 < f5) {
                f4 = f5;
            }
            f = this.LLILZLL * i3;
            if (f4 <= f) {
                f = f4;
            }
        }
        return C786410Ut5.k4(Locale.getDefault(), this.LLIZ.LIZIZ, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent != null) {
            motionEvent.setAction(3);
        } else {
            motionEvent = null;
        }
        super.dispatchTouchEvent(motionEvent);
        return false;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        C0GX1 c0gx1;
        if ((seekBar instanceof C0GX1) && (c0gx1 = (C0GX1) seekBar) != null) {
            c0gx1.LJI(true);
        }
        this.LLILLJJLI.LIZLLL();
        this.LLILLJJLI.LIZJ(LIZJ(this.LL.LLILLL.getProgress()), this.LL.LLILLL, r2.getProgress() / this.LL.LLILLL.getMax());
        LIZLLL(seekBar, C0HUQ.START);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C0GX1 c0gx1;
        if ((seekBar instanceof C0GX1) && (c0gx1 = (C0GX1) seekBar) != null) {
            c0gx1.LJI(false);
        }
        this.LLILLJJLI.LIZIZ();
        LIZLLL(seekBar, C0HUQ.END);
    }

    public final void setProgressBarHeight(float f) {
        this.LL.LLILLL.setProgressHeight(f);
    }

    public final void setValue(float f) {
        this.LL.LLILLL.setProgress((int) ((f - this.LLILZIL) * this.LLILZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0HUU] */
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
    public final void LIZLLL(SeekBar seekBar, final C0HUQ c0huq) {
        int progress;
        final float f;
        if (seekBar != null) {
            progress = seekBar.getProgress();
        } else {
            progress = 0;
        }
        int i = C0HUR.LIZ[this.LLIZ.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                f = this.LLILZLL;
                float f2 = this.LLILZIL;
                float max = ((progress / this.LL.LLILLL.getMax()) * (f - f2)) + f2;
                if (max >= f2) {
                    f2 = max;
                }
                if (f2 <= f) {
                    f = f2;
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            float f3 = progress;
            float f4 = this.LLILZIL;
            float f5 = this.LLILZ;
            float f6 = f4 * f5;
            float f7 = f3 + f6;
            if (f7 >= f6) {
                f6 = f7;
            }
            float f8 = this.LLILZLL * f5;
            if (f6 > f8) {
                f6 = f8;
            }
            f = f6 / f5;
        }
        ?? r1 = new Object(f, c0huq) { // from class: X.0HUU
            public final float LIZ;
            public final C0HUQ LIZIZ;
            public final boolean LIZJ = true;

            {
                this.LIZ = f;
                this.LIZIZ = c0huq;
            }
        };
        C0HUV c0huv = this.LLILLL;
        if (c0huv != 0) {
            c0huv.LIZ(r1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0HUP(Context context, AttributeSet attributeSet, int i) {
        SeekBar.OnSeekBarChangeListener c786820Utk;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fx4, this, false);
        addView(viewTd);
        int i2 = R.id.p09;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.p09, viewTd);
        if (tuxTextView != null) {
            i2 = R.id.ujh;
            C0GX1 c0gx1 = (C0GX1) C1616006Uk.LIZ(R.id.ujh, viewTd);
            if (c0gx1 != null) {
                this.LL = new C0HUT((ConstraintLayout) viewTd, tuxTextView, c0gx1);
                this.LLILLJJLI = new C0HUF(context);
                this.LLILZ = 100;
                this.LLILZLL = 100.0f;
                this.LLIZ = new C0HUW();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AmeSlider, 0, 0);
                this.LLILZ = typedArrayObtainStyledAttributes.getInt(R$styleable.AmeSlider_progressScale, 100);
                typedArrayObtainStyledAttributes.recycle();
                if (C1848410yCV.LIZ) {
                    c786820Utk = new C786820Utk(this);
                } else {
                    c786820Utk = this;
                }
                c0gx1.setOnSeekBarChangeListener(c786820Utk);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i2)));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.LLILLJJLI.LIZJ(LIZJ(i), this.LL.LLILLL, i / r2.getMax());
        LIZLLL(seekBar, C0HUQ.PROGRESS);
    }

    public final void LIZ(float f, float f2, int i, C0HUW c0huw) {
        this.LLILZIL = f;
        this.LLILZLL = f2;
        this.LLILZ = i;
        this.LLIZ = c0huw;
        C0GX1 c0gx1 = this.LL.LLILLL;
        float fAbs = 0.0f;
        if (f * f2 < 0.0f) {
            fAbs = Math.abs(f) / (f2 - f);
        }
        c0gx1.setDrawBeginScale(fAbs);
        C0GX1 c0gx12 = this.LL.LLILLL;
        float f3 = i;
        int i2 = (int) (f * f3);
        c0gx12.LLILLL = i2;
        c0gx12.setMax(((int) (f2 * f3)) - i2);
        C0GX1 c0gx13 = this.LL.LLILLL;
        float fLIZIZ = C418440Gaw.LIZIZ(14);
        float fLIZIZ2 = C418440Gaw.LIZIZ(24);
        c0gx13.LLIZ = fLIZIZ;
        c0gx13.LLIZLLLIL = fLIZIZ2;
        HandlerHook.viewPost(this, new ARunnableS106S0100000_6((Object) this, 31));
    }

    public static void LIZIZ(C0HUP c0hup, String str, float f, float f2, C0HUV c0huv) {
        C0HUW c0huw = new C0HUW();
        TuxTextView tuxTextView = c0hup.LL.LLILLJJLI;
        int i = 0;
        if (str.length() == 0) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
        c0hup.LL.LLILLJJLI.setText(str);
        c0hup.LIZ(f, f2, 100, c0huw);
        c0hup.LLILLL = c0huv;
    }
}

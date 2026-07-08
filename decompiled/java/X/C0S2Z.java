package X;

import Y.ALAdapterS3S0110000_11;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0S2Z, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0S2Z extends FrameLayout implements C121O {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public ImageView LL;
    public ImageView LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final Vibrator LLJI;
    public int LLJIJIL;
    public int LLJILJIL;

    public View getContentView() {
        return this;
    }

    public final void LIZIZ() {
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            this.LL.clearAnimation();
            LIZ(this.LLILZ, false, false);
        }
    }

    public final void LIZJ() {
        if (this.LLILZIL.getVisibility() == 0) {
            LIZ(this.LLILZIL, false, true);
        }
    }

    public final void LIZLLL() {
        if (this.LLIZLLLIL) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, this.LLILZ);
        this.LLIZLLLIL = true;
        LIZ(this.LLILZ, true, false);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -20.0f, 10.0f, 30.0f);
        rotateAnimation.setDuration(300L);
        rotateAnimation.setFillAfter(true);
        this.LL.startAnimation(rotateAnimation);
    }

    @Override // X.C121O
    public Rect getDeleteRect() {
        return new Rect(getLeft(), getTop() - this.LLJILJIL, getRight(), getBottom() - this.LLJILJIL);
    }

    @Override // X.C121O
    public void LJIL() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = ScreenUtils.getStatusBarHeight(getContext());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    @Override // X.C121O
    public void hide() {
        LIZJ();
        LIZIZ();
        this.LLILZLL = false;
    }

    public C0S2Z(Context context) {
        super(context, null);
        View viewSd = C786410Ut5.Sd(R.layout.c4v, C786410Ut5.ne(context), null);
        this.LL = (ImageView) viewSd.findViewById(R.id.yar);
        this.LLILLJJLI = (ImageView) viewSd.findViewById(R.id.ce5);
        this.LLILLL = viewSd.findViewById(R.id.flc);
        this.LLILZIL = viewSd.findViewById(R.id.q32);
        this.LLILZ = viewSd.findViewById(R.id.bym);
        addView(viewSd);
        C786410Ut5.LJLLLLLL(8, this.LLILZ);
        C786410Ut5.LJLLLLLL(8, this.LLILZIL);
        this.LLJI = (Vibrator) C786410Ut5.H2(context, "vibrator");
    }

    private void setBottomImageViewBottomMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILLJJLI.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        C786410Ut5.c6(this.LLILLJJLI, marginLayoutParams);
    }

    private void setParentViewTopMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILZIL.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        C786410Ut5.W5(this.LLILZIL, marginLayoutParams);
    }

    private void setTopImagViewTopMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LL.getLayoutParams();
        marginLayoutParams.topMargin = i;
        C786410Ut5.c6(this.LL, marginLayoutParams);
    }

    public void setContainerYOffset(int i) {
        this.LLJILJIL = i;
    }

    public static void LIZ(View view, boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f6 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", fArr2);
        float[] fArr3 = new float[2];
        if (z) {
            f5 = 0.0f;
        } else {
            f5 = 1.0f;
        }
        fArr3[0] = f5;
        if (z) {
            f6 = 1.0f;
        }
        fArr3[1] = f6;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleY", fArr3);
        animatorSet.setDuration(300L);
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        animatorSet.addListener(new ALAdapterS3S0110000_11(view, z2, 4));
        animatorSet.start();
    }

    public int LJ(int i, int i2, boolean z) {
        Rect deleteRect = getDeleteRect();
        if (z) {
            if (deleteRect.contains(i, i2)) {
                LIZJ();
                LIZIZ();
                if (this.LLJIJIL == 1) {
                    return 2;
                }
                return -1;
            }
            LIZJ();
            LIZIZ();
            this.LLILZLL = false;
            return -1;
        }
        if (deleteRect.contains(i, i2)) {
            if (this.LLJ) {
                this.LLJ = false;
                LIZ(this.LLILLL, false, true);
            }
            LIZLLL();
            this.LLILZLL = true;
            return 1;
        }
        LIZIZ();
        if (this.LLILZIL.getVisibility() == 8) {
            C786410Ut5.LJLLLLLL(0, this.LLILZIL);
            LIZ(this.LLILZIL, true, false);
        }
        if (!this.LLJ) {
            this.LLJ = true;
            C786410Ut5.LJLLLLLL(0, this.LLILLL);
            LIZ(this.LLILLL, true, false);
        }
        if (this.LLILZLL) {
            this.LLILZLL = false;
            return 3;
        }
        this.LLILZLL = false;
        return -1;
    }

    @Override // X.C121O
    public int LJJJJL(int i, int i2, boolean z, boolean z2) {
        int iLJ;
        if (z2) {
            if (z) {
                LIZJ();
                LIZIZ();
                this.LLILZLL = false;
                this.LLIZ = false;
                this.LLJ = false;
                this.LLIZLLLIL = false;
                if (this.LLJIJIL == 1) {
                    iLJ = 2;
                } else {
                    iLJ = -1;
                }
            } else {
                if (this.LLJ) {
                    this.LLJ = false;
                    LIZ(this.LLILLL, false, true);
                }
                LIZLLL();
                this.LLILZLL = true;
                iLJ = 1;
            }
        } else {
            iLJ = LJ(i, i2, z);
        }
        this.LLJIJIL = iLJ;
        if (iLJ == 1) {
            if (!this.LLIZ) {
                Vibrator vibrator = this.LLJI;
                if (vibrator != null) {
                    try {
                        vibrator.vibrate(10L);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                this.LLIZ = true;
                return 1;
            }
            return 0;
        }
        if (iLJ == 2) {
            this.LLILZLL = false;
            this.LLJ = false;
            this.LLIZLLLIL = false;
            this.LLIZ = false;
            return 3;
        }
        if (iLJ == 3) {
            Vibrator vibrator2 = this.LLJI;
            if (vibrator2 == null) {
                return 2;
            }
            try {
                vibrator2.vibrate(10L);
                return 2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return 2;
            }
        }
        this.LLIZ = false;
        return 4;
    }
}

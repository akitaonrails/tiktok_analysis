package X;

import Y.ARunnableS75S0200000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Gqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428230Gqj extends FrameLayout {
    public static final Interpolator LLJJJIL = C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f);
    public final C2252321DDq LL;
    public C054G LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public final LinearLayout LLILZIL;
    public final TuxTextView LLILZLL;
    public final ConstraintLayout LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxTextView LLJ;
    public final TuxIconView LLJI;
    public final FrameLayout LLJIJIL;
    public final FrameLayout LLJILJIL;
    public final C0GTI LLJILJILJ;
    public final C1322110kVd LLJILLL;
    public final C1295960jpS LLJJ;
    public String LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public ARunnableS75S0200000_6 LLJJIJIIJIL;
    public AnimatorSet LLJJIJIL;
    public final ValueAnimator LLJJJ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C054G c054g = this.LLILLJJLI;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        this.LLILLJJLI = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C054G c054g = this.LLILLJJLI;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LLILLJJLI = c054gLIZ;
        C23250099c.LIZLLL(c054gLIZ, null, null, new C432240GxC(this, null), 3);
    }

    public C428230Gqj(Context context) {
        super(context, null, 0);
        this.LL = C1BNE.LIZ(new C428240Gqk(0));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fx5, this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ymr);
        this.LLILLL = frameLayout;
        this.LLILZ = (FrameLayout) findViewById(R.id.ymo);
        this.LLILZIL = (LinearLayout) findViewById(R.id.ymw);
        this.LLILZLL = (TuxTextView) findViewById(R.id.ymp);
        this.LLIZ = (ConstraintLayout) findViewById(R.id.ymz);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.ymq);
        this.LLJ = (TuxTextView) findViewById(R.id.ymv);
        this.LLJI = (TuxIconView) findViewById(R.id.ymn);
        this.LLJIJIL = (FrameLayout) findViewById(R.id.yms);
        this.LLJILJIL = (FrameLayout) findViewById(R.id.ymt);
        this.LLJILJILJ = (C0GTI) findViewById(R.id.ymu);
        this.LLJILLL = (C1322110kVd) findViewById(R.id.ymx);
        this.LLJJ = (C1295960jpS) findViewById(R.id.ymy);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.setMarginStart((int) (12 * getResources().getDisplayMetrics().density));
        marginLayoutParams.topMargin = (int) (4 * getResources().getDisplayMetrics().density);
        C786410Ut5.a6(this.LLILLL, marginLayoutParams);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(1000L);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new AUListenerS256S0100000_6(this, 81));
        this.LLJJJ = valueAnimator;
    }

    public final void LIZ(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.getMarginStart() != (i = (int) f)) {
            marginLayoutParams.setMarginStart(i);
            C786410Ut5.a6(this.LLILZ, marginLayoutParams);
        }
    }

    public final void LIZIZ(final float f) {
        this.LLILZIL.setMinimumWidth(0);
        Drawable background = this.LLILZIL.getBackground();
        this.LLILZIL.setBackground(new Drawable(f) { // from class: X.0F4Q
            public final float LIZ;
            public final boolean LIZIZ = false;
            public final Paint LIZJ;
            public final Path LIZLLL;
            public final RectF LJ;
            public final float[] LJFF;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            {
                this.LIZ = f;
                Paint paint = new Paint();
                paint.setAntiAlias(false);
                paint.setColor(ColorProtector.parseColor("#99000000"));
                this.LIZJ = paint;
                this.LIZLLL = new Path();
                this.LJ = new RectF();
                this.LJFF = new float[8];
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                int i;
                float fHeight = getBounds().height();
                if (fHeight > 0.0f && getBounds().width() > 0) {
                    float f2 = this.LIZ;
                    float f3 = fHeight / 2.0f;
                    if (f2 < f3) {
                        f2 = f3;
                    }
                    float f4 = 2.0f * f2;
                    if (f4 >= fHeight) {
                        fHeight = f4;
                    }
                    this.LJ.set(getBounds());
                    this.LIZLLL.reset();
                    this.LIZLLL.setFillType(Path.FillType.EVEN_ODD);
                    Path path = this.LIZLLL;
                    RectF rectF = this.LJ;
                    if (this.LIZIZ) {
                        float[] fArr = this.LJFF;
                        fArr[0] = fHeight;
                        fArr[1] = fHeight;
                        fArr[2] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[6] = fHeight;
                        fArr[7] = fHeight;
                    } else {
                        float[] fArr2 = this.LJFF;
                        fArr2[0] = 0.0f;
                        fArr2[1] = 0.0f;
                        fArr2[2] = fHeight;
                        fArr2[3] = fHeight;
                        fArr2[4] = fHeight;
                        fArr2[5] = fHeight;
                        fArr2[6] = 0.0f;
                        fArr2[7] = 0.0f;
                    }
                    path.addRoundRect(rectF, this.LJFF, Path.Direction.CW);
                    if (this.LIZIZ) {
                        i = getBounds().right;
                    } else {
                        i = getBounds().left;
                    }
                    this.LIZLLL.addCircle(i, getBounds().exactCenterY(), f2, Path.Direction.CW);
                    canvas.drawPath(this.LIZLLL, this.LIZJ);
                }
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                this.LIZJ.setAlpha(i);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LIZJ.setColorFilter(colorFilter);
                invalidateSelf();
            }
        });
        if (background != null) {
            background.setCallback(null);
        }
    }

    public final void setBubbleTextTemplate$tt_reward_ad_saas_impl_release(String str) {
        if (str == null) {
            str = "";
        }
        String string = a0.LJLIIIL(new Regex("\\s+").replace(str, " ")).toString();
        C2252321DDq c2252321DDq = this.LL;
        c2252321DDq.setValue(C428240Gqk.LIZ((C428240Gqk) c2252321DDq.getValue(), string, null, 2));
    }

    public final void setCenterLottie$tt_reward_ad_saas_impl_release(String str) {
        this.LLJJI = str;
        C786410Ut5.LJZ(0, this.LLJILJIL);
        C0GTI c0gti = this.LLJILJILJ;
        int visibility = c0gti.getVisibility();
        c0gti.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c0gti);
        this.LLJJIJI = false;
        if (str != null && str.length() != 0) {
            LIZJ(str, new AwS550S0100000_6(this, 1158), new AwS550S0100000_6(this, 1159));
            return;
        }
        this.LLJJIII = false;
        this.LLJJ.cancelAnimation();
        C786410Ut5.LLD(8, this.LLJJ);
    }

    public final void setSecondRowText$tt_reward_ad_saas_impl_release(String str) {
        C2252321DDq c2252321DDq = this.LL;
        C428240Gqk c428240Gqk = (C428240Gqk) c2252321DDq.getValue();
        if (str == null) {
            str = "";
        }
        c2252321DDq.setValue(C428240Gqk.LIZ(c428240Gqk, null, str, 1));
    }

    public final void setTimerFallbackImage$tt_reward_ad_saas_impl_release(String str) {
        if (str != null && str.length() != 0) {
            this.LLJILLL.setImageURI(str);
            C786410Ut5.LLZZLLIL(this.LLJILLL, 0);
        } else {
            this.LLJILLL.setImageURI((String) null);
            C786410Ut5.LLZZLLIL(this.LLJILLL, 8);
        }
    }

    public final void LIZJ(String str, final Function0 function0, Function0 function02) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.LLJJ.cancelAnimation();
            C786410Ut5.LLD(8, this.LLJJ);
            function02.invoke();
            return;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            this.LLJJ.cancelAnimation();
            C786410Ut5.LLD(8, this.LLJJ);
            function02.invoke();
            return;
        }
        try {
            C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(new C0VSP(c0vsj), str);
            c1292030jj7LJ.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0GpS
                public final /* synthetic */ boolean LLILLJJLI = false;

                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    this.LL.LLJJ.setComposition((C1294720jnS) obj);
                    this.LL.LLJJ.setRepeatCount(0);
                    C786410Ut5.LLD(0, this.LL.LLJJ);
                    if (this.LLILLJJLI) {
                        this.LL.LLJJ.playAnimation();
                    }
                    Function0<Unit> function03 = function0;
                    if (function03 != null) {
                        function03.invoke();
                    }
                }
            });
            c1292030jj7LJ.LIZ(new C0IE0(this, function02, 0));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLJJ.cancelAnimation();
            C786410Ut5.LLD(8, this.LLJJ);
            function02.invoke();
        }
    }
}

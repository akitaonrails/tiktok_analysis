package X;

import Y.AfS175S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0rzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609500rzA extends FrameLayout implements InterfaceC1605750rt7 {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public C1294720jnS LL;
    public final int LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public EnumC727930Sgx LLILZIL;
    public String LLILZLL;
    public int[] LLIZ;
    public float[] LLIZLLLIL;
    public Integer LLJ;
    public LinearGradient LLJI;
    public float LLJIJIL;
    public int LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public final Paint LLJJ;
    public EnumC1605470rsf LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public AwS603S0100000_24 LLJJIJIIJIL;
    public C11JF LLJJIJIL;
    public ValueAnimator LLJJJ;
    public final float LLJJJIL;
    public final C1609500rzA LLJJJJ;
    public final RectF LLJJJJJIL;
    public long LLJJJJLIIL;
    public EnumC1605470rsf LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public C1294720jnS LLJL;
    public boolean LLJLIL;

    public C1609500rzA(Context context) {
        this(context, null, 6);
    }

    public C1609500rzA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.InterfaceC1605750rt7
    public final void LJI(EnumC1605470rsf enumC1605470rsf, EnumC1605470rsf enumC1605470rsf2, int i, boolean z, boolean z2) {
    }

    private final C1295960jpS getPublishLottieView() {
        return (C1295960jpS) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1605750rt7
    public final void LIZ() {
        if (this.LLJLIL) {
            EnumC1605470rsf mode = getMode();
            EnumC1605470rsf enumC1605470rsf = EnumC1605470rsf.PROGRESS;
            if (mode == enumC1605470rsf) {
                EnumC1605470rsf mode2 = getMode();
                float progress = getProgress();
                if (mode2 == enumC1605470rsf && progress == 0.5f) {
                    setMode(this.LLJJL);
                    setProgress(this.LLJJLIIIJLLLLLLLZ);
                    this.LL = this.LLJL;
                }
            }
        }
        this.LLJLIL = false;
        getPublishLottieView().cancelAnimation();
        C786410Ut5.LLD(8, getPublishLottieView());
        invalidate();
    }

    private final LinearGradient getColorShader() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getColorShader: ");
        int[] colorList = getColorList();
        sbLIZ.append(colorList != null ? Integer.valueOf(colorList.length) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        int[] colorList2 = getColorList();
        if (colorList2 == null) {
            colorList2 = LIZJ(getContext());
        }
        float[] positionList = getPositionList();
        if (positionList == null) {
            positionList = C1606910ruz.LIZIZ();
        }
        if (colorList2.length != positionList.length) {
            colorList2 = LIZJ(getContext());
            positionList = C1606910ruz.LIZIZ();
        }
        return new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), colorList2, positionList, Shader.TileMode.CLAMP);
    }

    public int[] getColorList() {
        return this.LLIZ;
    }

    public final float getDesiredRingPadding() {
        return this.LLJILLL;
    }

    public final float getDesiredRingWidth() {
        return this.LLJILJILJ;
    }

    public final C1294720jnS getLottieComposition() {
        return this.LL;
    }

    @Override // X.InterfaceC1605750rt7
    public EnumC1605470rsf getMode() {
        return this.LLJJI;
    }

    public float[] getPositionList() {
        return this.LLIZLLLIL;
    }

    public float getProgress() {
        return this.LLJJIII;
    }

    public EnumC727930Sgx getProgressMode() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1605750rt7
    public String getScheduleId() {
        return this.LLILZLL;
    }

    public Integer getUnReadNum() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1605750rt7
    public View getView() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1605750rt7
    public final boolean q1() {
        return this.LLILZ;
    }

    public static int[] LIZJ(Context context) {
        int[] iArr = new int[3];
        int i = 0;
        while (true) {
            int iIntValue = R.attr.ti;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ti, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            while (true) {
                iArr[i] = iIntValue;
                i++;
                if (i < 3) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                iIntValue = 0;
                            } else {
                                iIntValue = R.attr.tk;
                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.tk, context);
                                if (numLIZJ2 != null) {
                                    iIntValue = numLIZJ2.intValue();
                                }
                            }
                        } else {
                            iIntValue = R.attr.tj;
                            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.tj, context);
                            if (numLIZJ3 != null) {
                                iIntValue = numLIZJ3.intValue();
                            }
                        }
                    }
                } else {
                    return iArr;
                }
            }
        }
    }

    public static float LIZLLL(int i) {
        float f = i;
        if (f >= C418440Gaw.LIZIZ(96)) {
            return 4.0f;
        }
        if (f >= C418440Gaw.LIZIZ(64)) {
            return 3.5f;
        }
        if (f >= C418440Gaw.LIZIZ(44)) {
            return 3.0f;
        }
        if (f >= C418440Gaw.LIZIZ(24)) {
            return 2.5f;
        }
        return 2.0f;
    }

    private final void setRingWidth(float f) {
        this.LLJIJIL = f;
        this.LLJJ.setStrokeWidth(f);
        LJ(getWidth(), getHeight());
        invalidate();
    }

    @Override // X.InterfaceC1605750rt7
    public final void LIZIZ(C1294720jnS c1294720jnS) {
        EnumC1605470rsf mode = getMode();
        EnumC1605470rsf enumC1605470rsf = EnumC1605470rsf.PROGRESS;
        if (mode != enumC1605470rsf && !this.LLJLIL) {
            this.LLJJL = getMode();
            this.LLJJLIIIJLLLLLLLZ = getProgress();
            this.LLJL = this.LL;
        }
        this.LLJLIL = true;
        this.LL = c1294720jnS;
        setMode(enumC1605470rsf);
        setProgress(0.5f);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (getMode() != EnumC1605470rsf.PROGRESS) {
            getPublishLottieView().cancelAnimation();
            C786410Ut5.LLD(8, getPublishLottieView());
        }
        int i = C1605790rtB.LIZIZ[getMode().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || getProgressMode() == EnumC727930Sgx.LOTTIE_ANIMATION) {
                        return;
                    }
                    this.LLJJ.setStyle(Paint.Style.STROKE);
                    this.LLJJ.setShader(null);
                    this.LLJJ.setColor(this.LLILLJJLI);
                    canvas.drawArc(this.LLJJJJJIL, 0.0f, 360.0f, false, this.LLJJ);
                    this.LLJJ.setShader(this.LLJI);
                    this.LLJJ.setColor(-16777216);
                    canvas.drawArc(this.LLJJJJJIL, -90.0f, this.LLJJIJI * 360.0f, false, this.LLJJ);
                    return;
                }
                this.LLJJ.setStyle(Paint.Style.STROKE);
                this.LLJJ.setShader(null);
                this.LLJJ.setColor(R.attr.zs);
                canvas.drawArc(this.LLJJJJJIL, -90.0f, 360.0f, false, this.LLJJ);
                return;
            }
            this.LLJJ.setStyle(Paint.Style.STROKE);
            this.LLJJ.setShader(null);
            this.LLJJ.setColor(this.LLILLJJLI);
            canvas.drawArc(this.LLJJJJJIL, -90.0f, 360.0f, false, this.LLJJ);
            return;
        }
        this.LLJJ.setShader(this.LLJI);
        this.LLJJ.setStyle(Paint.Style.STROKE);
        this.LLJJ.setColor(-16777216);
        canvas.drawArc(this.LLJJJJJIL, -90.0f, 360.0f, false, this.LLJJ);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LLJJJJLIIL = System.currentTimeMillis();
        }
        if (getMode() != EnumC1605470rsf.NONE && motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.LLJJJJLIIL < ViewConfiguration.getLongPressTimeout()) {
                performClick();
            }
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC1605750rt7
    public void setColorList(int[] iArr) {
        this.LLIZ = iArr;
        this.LLJI = getColorShader();
        invalidate();
    }

    public final void setDesiredRingPadding(float f) {
        this.LLJILLL = f;
    }

    public final void setDesiredRingWidth(float f) {
        this.LLJILJILJ = f;
    }

    public final void setLottieComposition(C1294720jnS c1294720jnS) {
        this.LL = c1294720jnS;
    }

    @Override // X.InterfaceC1605750rt7
    public void setMine(boolean z) {
        this.LLILZ = z;
    }

    @Override // X.InterfaceC1605750rt7
    public void setMode(EnumC1605470rsf enumC1605470rsf) {
        if (this.LLJJI == enumC1605470rsf) {
            return;
        }
        this.LLJJI = enumC1605470rsf;
        C11JF c11jf = this.LLJJIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIJIL = null;
        this.LLJJIJIIJIL = null;
        if ((getProgressMode() == EnumC727930Sgx.PROGRESS_BAR || this.LL == null) && enumC1605470rsf == EnumC1605470rsf.PROGRESS) {
            setProgress(0.0f);
            this.LLJJIJIL = (C11JF) C11NZ.LJIJJLI(new C1620950sHd(this, 2)).LJIL(300L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS175S0100000_6(this, 20), new C09JN() { // from class: X.00NW
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("SocPubAvatarFrameLayout@82d8.observeProgressIfNeed$2");
                    C1C7U.LIZIZ("SocPubAvatarFrameLayout@82d8.observeProgressIfNeed$2");
                }
            });
        }
        invalidate();
    }

    @Override // X.InterfaceC1605750rt7
    public void setPositionList(float[] fArr) {
        this.LLIZLLLIL = fArr;
        this.LLJI = getColorShader();
        invalidate();
    }

    @Override // X.InterfaceC1605750rt7
    public void setProgress(float f) {
        C1294720jnS c1294720jnS;
        this.LLJJIII = f;
        if (this.LL == null) {
            setProgressMode(EnumC727930Sgx.PROGRESS_BAR);
        }
        EnumC727930Sgx progressMode = getProgressMode();
        if (progressMode != null) {
            int i = C1605790rtB.LIZ[progressMode.ordinal()];
            if (i != 1) {
                if (i == 2 && (c1294720jnS = this.LL) != null) {
                    if (f > 0.0f && !getPublishLottieView().isAnimating()) {
                        C786410Ut5.LLD(0, getPublishLottieView());
                        C786410Ut5.Pc(getPublishLottieView(), -getPaddingLeft());
                        C786410Ut5.ld(getPublishLottieView(), -getPaddingTop());
                        getPublishLottieView().setComposition(c1294720jnS);
                        getPublishLottieView().setMinAndMaxProgress(0.1f, 0.9f);
                        getPublishLottieView().playAnimation();
                        invalidate();
                    } else if (f == 1.0f) {
                        getPublishLottieView().cancelAnimation();
                        C786410Ut5.LLD(8, getPublishLottieView());
                        invalidate();
                    }
                }
            } else if (f < this.LLJJIJI) {
                ValueAnimator valueAnimator = this.LLJJJ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.LLJJJ;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator3 = this.LLJJJ;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllListeners();
                }
                if (f == 0.0f) {
                    this.LLJJIJI = f;
                    invalidate();
                }
            }
        }
        AwS603S0100000_24 awS603S0100000_24 = this.LLJJIJIIJIL;
        if (awS603S0100000_24 != null) {
            awS603S0100000_24.invoke(Float.valueOf(this.LLJJIII));
        }
    }

    @Override // X.InterfaceC1605750rt7
    public void setProgressMode(EnumC727930Sgx enumC727930Sgx) {
        this.LLILZIL = enumC727930Sgx;
    }

    public final void setRingStrokeWidthByAvatarSize(int i) {
        this.LLJILJIL = i;
        this.LLJJ.setStrokeWidth(C418440Gaw.LIZIZ(Float.valueOf(LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))))));
        LJ(getWidth(), getHeight());
        invalidate();
    }

    @Override // X.InterfaceC1605750rt7
    public void setScheduleId(String str) {
        this.LLILZLL = str;
    }

    @Override // X.InterfaceC1605750rt7
    public void setUnReadNum(Integer num) {
        this.LLJ = num;
    }

    public final void LJ(int i, int i2) {
        if (i > 0 && i2 > 0) {
            float f = this.LLJILLL;
            if (f >= 0.0f) {
                float f2 = i;
                float f3 = this.LLJIJIL;
                float f4 = 2;
                if ((f2 - f3) - (f * f4) > 0.0f) {
                    float f5 = i2;
                    if ((f5 - f3) - (f4 * f) > 0.0f) {
                        RectF rectF = this.LLJJJJJIL;
                        rectF.left = (f3 / 2.0f) + f;
                        rectF.top = (f3 / 2.0f) + f;
                        rectF.right = (f2 - (f3 / 2.0f)) - f;
                        rectF.bottom = (f5 - (f3 / 2.0f)) - f;
                    }
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = this.LLJILJILJ;
        if (measuredWidth <= 0.0f) {
            int i3 = this.LLJILJIL;
            if (i3 > 0) {
                measuredWidth = C418440Gaw.LIZIZ(Float.valueOf(LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))))));
            } else {
                measuredWidth = getMeasuredWidth() * this.LLJJJIL;
            }
        }
        setRingWidth(measuredWidth);
    }

    public C1609500rzA(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ne, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILLJJLI = iIntValue;
        this.LLILLL = C452501pT.LIZIZ(new C424460Gke(context, this));
        this.LLILZ = true;
        this.LLILZIL = EnumC727930Sgx.LOTTIE_ANIMATION;
        Paint paint = new Paint();
        paint.setStrokeWidth(this.LLJIJIL);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.LLJJ = paint;
        EnumC1605470rsf enumC1605470rsf = EnumC1605470rsf.NONE;
        this.LLJJI = enumC1605470rsf;
        this.LLJJJIL = 0.03125f;
        this.LLJJJJ = this;
        this.LLJJJJJIL = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        this.LLJJL = enumC1605470rsf;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJ(i, i2);
        if (i > 0 && i2 > 0) {
            this.LLJI = getColorShader();
            float measuredWidth = this.LLJILJILJ;
            if (measuredWidth <= 0.0f) {
                int i5 = this.LLJILJIL;
                if (i5 > 0) {
                    measuredWidth = C418440Gaw.LIZIZ(Float.valueOf(LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i5))))));
                } else {
                    measuredWidth = getMeasuredWidth() * this.LLJJJIL;
                }
            }
            setRingWidth(measuredWidth);
        }
    }
}

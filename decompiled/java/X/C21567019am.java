package X;

import Y.ALAdapterS27S0100000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.19am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21567019am extends View {
    public static final /* synthetic */ int LLLJL = 0;
    public final int LL;
    public final int LLILLJJLI;
    public final Path LLILLL;
    public final Path LLILZ;
    public final Path LLILZIL;
    public final Paint LLILZLL;
    public final Paint LLIZ;
    public final Paint LLIZLLLIL;
    public final Paint LLJ;
    public final Paint LLJI;
    public float LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public long LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public long LLJJJJJIL;
    public TypedArray LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public final double LLJLLIL;
    public LinearGradient LLJLLL;
    public LinearGradient LLJZ;
    public Bitmap LLJZIJLIL;
    public Bitmap LLL;
    public String LLLF;
    public String LLLFF;
    public final Rect LLLFFI;
    public final Rect LLLFZ;
    public float LLLI;
    public int LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public float LLLIIL;
    public float LLLIILIL;
    public float LLLIL;
    public float LLLILZ;
    public int LLLILZJ;
    public int LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public final PaintFlagsDrawFilter LLLJIL;

    public float getNewLeftWidth() {
        return 0.0f;
    }

    public void LJI() {
        if (this.LLJLL || this.LLJLILLLLZIIL) {
            this.LLJLILLLLZIIL = false;
            this.LLJLL = false;
            if (!this.LLLIZZ || this.LLJIJIL <= 0.0f) {
                this.LLJIJIL = getNewLeftWidth();
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.LLJILLL + this.LLJIJIL, 0.0f, this.LLJJL, this.LLJJLIIIJLLLLLLLZ, Shader.TileMode.CLAMP);
            this.LLJLLL = linearGradient;
            this.LLILZLL.setShader(linearGradient);
            float f = 255;
            this.LLILZLL.setAlpha((int) (this.LLLIIL * f));
            this.LLJ.setAlpha((int) (this.LLLIIL * f));
            LinearGradient linearGradient2 = new LinearGradient(this.LLJIJIL, 0.0f, this.LLJJI, 0.0f, this.LLJL, this.LLJLIL, Shader.TileMode.CLAMP);
            this.LLJZ = linearGradient2;
            this.LLIZ.setShader(linearGradient2);
            this.LLIZ.setAlpha((int) (this.LLLIILIL * f));
            this.LLJI.setAlpha((int) (this.LLLIILIL * f));
        }
    }

    public final String getAccessibilityContentDescription() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Resources resources = getContext().getResources();
        long j = this.LLJJJ;
        sbLIZ.append(resources.getQuantityString(2131755501, j > 2147483647L ? Integer.MAX_VALUE : (int) j, this.LLJJIJIL, this.LLLF));
        sbLIZ.append(", ");
        Resources resources2 = getContext().getResources();
        long j2 = this.LLJJJJJIL;
        sbLIZ.append(resources2.getQuantityString(2131755501, j2 <= 2147483647L ? (int) j2 : Integer.MAX_VALUE, this.LLJJJJ, this.LLLFF));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final float getBitmapHeight() {
        return this.LLLILZ;
    }

    public final float getBitmapWidth() {
        return this.LLLIL;
    }

    public final float getCaps() {
        return this.LLJJ;
    }

    public final Bitmap getLeftBitmap() {
        return this.LLJZIJLIL;
    }

    public final int getLeftBitmapW() {
        return this.LLLIIIIL;
    }

    public final String getLeftCircleText() {
        return this.LLLF;
    }

    public final int getLeftContentGravity() {
        return this.LLLILZJ;
    }

    public final int getLeftP() {
        return this.LLLII;
    }

    public final long getLeftPercent() {
        return this.LLJILJIL;
    }

    public final Rect getLeftRect() {
        return this.LLLFFI;
    }

    public final float getLeftWidth() {
        return this.LLJIJIL;
    }

    public final String getMLeftText() {
        return this.LLJJIJIIJIL;
    }

    public final String getMRightText() {
        return this.LLJJJIL;
    }

    public final PaintFlagsDrawFilter getMSetfil() {
        return this.LLLJIL;
    }

    public final Bitmap getRightBitmap() {
        return this.LLL;
    }

    public final int getRightBitmapW() {
        return this.LLLIIIL;
    }

    public final String getRightCircleText() {
        return this.LLLFF;
    }

    public final int getRightContentGravity() {
        return this.LLLILZLLLI;
    }

    public final int getRightP() {
        return this.LLLIIII;
    }

    public final long getRightPercent() {
        return this.LLJILJILJ;
    }

    public final Rect getRightRect() {
        return this.LLLFZ;
    }

    public final float getTextDis() {
        return this.LLLI;
    }

    public final Paint getTextLeftPaint() {
        return this.LLJ;
    }

    public final Paint getTextRightPaint() {
        return this.LLJI;
    }

    public final float getTotalHeight() {
        return this.LLJJIII;
    }

    public final float getTotalWidth() {
        return this.LLJJI;
    }

    public final TypedArray getTypedArray() {
        return this.LLJJJJLIIL;
    }

    public final float getWidthCaps() {
        return this.LLJILLL;
    }

    public static String LIZJ(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 3) {
            String strSubstring = str.substring(0, 4);
            if (u.LJIIZILJ(strSubstring, e3.d, false)) {
                return strSubstring.substring(0, 3);
            }
            return strSubstring;
        }
        return str;
    }

    public final String LIZIZ(long j) {
        int i = this.LL;
        if (j >= i) {
            long j2 = j * 1;
            long j3 = i * 999;
            if (j > j3) {
                j2 = j3 * 1;
            }
            String strJ4 = C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf((j2 * 1.0d) / ((double) i))}, 1));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZJ(strJ4));
            sbLIZ.append('m');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        int i2 = this.LLILLJJLI;
        if (j >= i2) {
            String strJ42 = C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf((j * 1.0d) / ((double) i2))}, 1));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LIZJ(strJ42));
            sbLIZ2.append('k');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return String.valueOf(j);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.setDrawFilter(this.LLLJIL);
        LJI();
        Path path = this.LLILLL;
        path.reset();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(this.LLJIJIL + this.LLJILLL, 0.0f);
        path.lineTo(this.LLJIJIL, this.LLJJIII);
        path.lineTo(0.0f, this.LLJJIII);
        path.close();
        Path path2 = this.LLILZ;
        path2.reset();
        path2.moveTo(this.LLJIJIL + this.LLJILLL + this.LLJJ, 0.0f);
        path2.lineTo(this.LLJJI, 0.0f);
        path2.lineTo(this.LLJJI, this.LLJJIII);
        path2.lineTo(this.LLJIJIL + this.LLJJ, this.LLJJIII);
        path2.close();
        canvas.drawPath(this.LLILLL, this.LLILZLL);
        canvas.drawPath(this.LLILZ, this.LLIZ);
        if (this.LLLJ) {
            float fLIZIZ = C497740JfY.LIZIZ(5.0f);
            Path path3 = this.LLILZIL;
            path3.reset();
            path3.moveTo(0.0f, 0.0f);
            path3.lineTo(fLIZIZ, 0.0f);
            path3.lineTo(0.0f, fLIZIZ);
            path3.close();
            this.LLIZLLLIL.setShader(this.LLJLLL);
            float f = 255;
            this.LLIZLLLIL.setAlpha((int) (this.LLLIIL * f));
            this.LLIZLLLIL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
            canvas.drawPath(this.LLILZIL, this.LLIZLLLIL);
            Path path4 = this.LLILZIL;
            path4.reset();
            path4.moveTo(0.0f, this.LLJJIII - fLIZIZ);
            path4.lineTo(0.0f, this.LLJJIII);
            path4.lineTo(fLIZIZ, this.LLJJIII);
            path4.close();
            canvas.drawPath(this.LLILZIL, this.LLIZLLLIL);
            Path path5 = this.LLILZIL;
            path5.reset();
            path5.moveTo(this.LLJJI - fLIZIZ, 0.0f);
            path5.lineTo(this.LLJJI, 0.0f);
            path5.lineTo(this.LLJJI, fLIZIZ);
            path5.close();
            this.LLIZLLLIL.setShader(this.LLJZ);
            this.LLIZLLLIL.setAlpha((int) (this.LLLIILIL * f));
            canvas.drawPath(this.LLILZIL, this.LLIZLLLIL);
            Path path6 = this.LLILZIL;
            path6.reset();
            path6.moveTo(this.LLJJI, this.LLJJIII - fLIZIZ);
            path6.lineTo(this.LLJJI, this.LLJJIII);
            path6.lineTo(this.LLJJI - fLIZIZ, this.LLJJIII);
            path6.close();
            canvas.drawPath(this.LLILZIL, this.LLIZLLLIL);
            this.LLIZLLLIL.setXfermode(null);
        }
    }

    public final void setBitmapHeight(float f) {
        this.LLLILZ = f;
    }

    public final void setBitmapWidth(float f) {
        this.LLLIL = f;
    }

    public final void setCaps(float f) {
        this.LLJJ = f;
    }

    public final void setCircleBitmap(int i) {
        if (i <= 0) {
            return;
        }
        Bitmap bitmapLIZ = LIZ(BitmapFactory.decodeResource(getResources(), i), C497740JfY.LIZIZ(18.0f), C497740JfY.LIZIZ(18.0f));
        this.LLJZIJLIL = bitmapLIZ;
        this.LLL = bitmapLIZ;
        LJ(this.LLLF, this.LLLFF);
    }

    public final void setDrawRadius(boolean z) {
        this.LLLJ = z;
        postInvalidate();
    }

    public final void setLeftBitmap(Bitmap bitmap) {
        this.LLJZIJLIL = bitmap;
    }

    public final void setLeftBitmapW(int i) {
        this.LLLIIIIL = i;
    }

    public final void setLeftCircleText(String str) {
        this.LLLF = str;
    }

    public final void setLeftContentGravity(int i) {
        this.LLLILZJ = i;
    }

    public final void setLeftP(int i) {
        this.LLLII = i;
    }

    public final void setLeftPercent(long j) {
        this.LLJILJIL = j;
    }

    public final void setLeftWidth(float f) {
        this.LLJIJIL = f;
    }

    public final void setMLeftText(String str) {
        this.LLJJIJIIJIL = str;
    }

    public final void setMRightText(String str) {
        this.LLJJJIL = str;
    }

    public final void setRightBitmap(Bitmap bitmap) {
        this.LLL = bitmap;
    }

    public final void setRightBitmapW(int i) {
        this.LLLIIIL = i;
    }

    public final void setRightCircleText(String str) {
        this.LLLFF = str;
    }

    public final void setRightContentGravity(int i) {
        this.LLLILZLLLI = i;
    }

    public final void setRightP(int i) {
        this.LLLIIII = i;
    }

    public final void setRightPercent(long j) {
        this.LLJILJILJ = j;
    }

    public final void setScaleSize(final int i) {
        if (i > 0) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.1f, 1.0f);
            valueAnimatorOfFloat.setDuration(500L);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19ap
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int i2 = i;
                    if (i2 == 1) {
                        C21567019am c21567019am = this;
                        c21567019am.LLJLL = true;
                        c21567019am.getTextLeftPaint().setTextSize(this.LLJJIJI * fFloatValue);
                        C21567019am c21567019am2 = this;
                        c21567019am2.setLeftBitmap(C21567019am.LIZ(c21567019am2.getLeftBitmap(), this.getBitmapWidth() * fFloatValue, this.getBitmapHeight() * fFloatValue));
                    } else if (i2 == 2) {
                        C21567019am c21567019am3 = this;
                        c21567019am3.LLJLL = true;
                        c21567019am3.getTextRightPaint().setTextSize(this.LLJJIJI * fFloatValue);
                        C21567019am c21567019am4 = this;
                        c21567019am4.setRightBitmap(C21567019am.LIZ(c21567019am4.getRightBitmap(), this.getBitmapWidth() * fFloatValue, this.getBitmapHeight() * fFloatValue));
                    }
                    this.postInvalidate();
                }
            });
            valueAnimatorOfFloat.start();
        }
    }

    public final void setTextDis(float f) {
        this.LLLI = f;
    }

    public final void setTotalHeight(float f) {
        this.LLJJIII = f;
    }

    public final void setTotalWidth(float f) {
        this.LLJJI = f;
    }

    public final void setTypedArray(TypedArray typedArray) {
        this.LLJJJJLIIL = typedArray;
    }

    public final void setWidthCaps(float f) {
        this.LLJILLL = f;
    }

    public C21567019am(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void LIZLLL(Context context, AttributeSet attributeSet) {
        try {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LivePollView);
            this.LLJILLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.LivePollView_widthCaps, 10.0f);
            this.LLJJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.LivePollView_caps, 1.0f);
            typedArrayObtainStyledAttributes.getDimension(R$styleable.LivePollView_stoke, C497740JfY.LIZIZ(1.0f));
            this.LLJJIJI = typedArrayObtainStyledAttributes.getDimension(R$styleable.LivePollView_buttonTextSize, 14.0f);
            String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LivePollView_leftText);
            String str = "";
            if (strXd == null) {
                strXd = "";
            }
            this.LLJJIJIIJIL = strXd;
            String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LivePollView_rightText);
            if (strXd2 != null) {
                str = strXd2;
            }
            this.LLJJJIL = str;
            int color = typedArrayObtainStyledAttributes.getColor(R$styleable.LivePollView_leftStartColor, -65536);
            this.LLJJL = color;
            this.LLJJLIIIJLLLLLLLZ = typedArrayObtainStyledAttributes.getColor(R$styleable.LivePollView_leftEndColor, color);
            int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.LivePollView_rightStartColor, -16776961);
            this.LLJL = color2;
            this.LLJLIL = typedArrayObtainStyledAttributes.getColor(R$styleable.LivePollView_rightEndColor, color2);
            String strXd3 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LivePollView_circleLeftText);
            if (strXd3 == null) {
                strXd3 = "1";
            }
            this.LLLF = strXd3;
            String strXd4 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LivePollView_circleRightText);
            if (strXd4 == null) {
                strXd4 = "2";
            }
            this.LLLFF = strXd4;
            this.LLLILZJ = typedArrayObtainStyledAttributes.getInt(R$styleable.LivePollView_leftContentGravity, 0);
            this.LLLILZLLLI = typedArrayObtainStyledAttributes.getInt(R$styleable.LivePollView_rightContentGravity, 0);
            this.LLLI = typedArrayObtainStyledAttributes.getDimension(R$styleable.LivePollView_bitmapTextPadding, 10.0f);
            this.LLJJJJLIIL = typedArrayObtainStyledAttributes;
            this.LLJILJIL = 1L;
            this.LLJILJILJ = 1L;
            setLayerType(1, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Paint paint = this.LLILZLL;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = this.LLIZ;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint3 = this.LLIZLLLIL;
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint4 = this.LLJ;
        paint4.setAntiAlias(true);
        paint4.setColor(-1);
        paint4.setTextSize(this.LLJJIJI);
        paint4.setTextSkewX(0.0f);
        Paint paint5 = this.LLJI;
        paint5.setAntiAlias(true);
        paint5.setColor(-1);
        paint5.setTextSize(this.LLJJIJI);
        paint5.setTextSkewX(0.0f);
        this.LLILZLL.setPathEffect(new CornerPathEffect(C497740JfY.LIZIZ(5.0f)));
        this.LLIZ.setPathEffect(new CornerPathEffect(C497740JfY.LIZIZ(5.0f)));
        this.LLIZLLLIL.setPathEffect(new CornerPathEffect(C497740JfY.LIZIZ(2.0f)));
    }

    public final void LJ(String str, String str2) {
        if (!C1086830eO9.LIZIZ(str) || !C1086830eO9.LIZIZ(str2)) {
            this.LLJZIJLIL = null;
            this.LLL = null;
            this.LLLI = C497740JfY.LIZIZ(6.0f);
        }
        this.LLLF = str;
        this.LLLFF = str2;
        postInvalidate();
    }

    public final void LJFF(long j, long j2) {
        this.LLJJIJIL = LIZIZ(j);
        this.LLJJJ = j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("x ");
        sbLIZ.append(this.LLJJIJIL);
        this.LLJJIJIIJIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJJJ = LIZIZ(j2);
        this.LLJJJJJIL = j2;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("x ");
        sbLIZ2.append(this.LLJJJJ);
        this.LLJJJIL = C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLJJI = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        this.LLJJIII = measuredHeight;
        this.LLJILLL = (float) (((double) (measuredHeight * 1.0f)) / Math.tan(this.LLJLLIL));
    }

    public C21567019am(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = 1000000;
        this.LLILLJJLI = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LLILLL = new Path();
        this.LLILZ = new Path();
        this.LLILZIL = new Path();
        this.LLILZLL = new Paint();
        this.LLIZ = new Paint();
        this.LLIZLLLIL = new Paint();
        this.LLJ = new Paint();
        this.LLJI = new Paint();
        this.LLJILJIL = 1L;
        this.LLJILJILJ = 1L;
        this.LLJILLL = 20.0f;
        this.LLJJ = 8.0f;
        C497740JfY.LIZIZ(1.0f);
        this.LLJJI = 188.0f;
        this.LLJJIII = 30.0f;
        this.LLJJIJI = 20.0f;
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = CardStruct.IStatusCode.DEFAULT;
        this.LLJJJIL = "";
        this.LLJJJJ = CardStruct.IStatusCode.DEFAULT;
        this.LLJLILLLLZIIL = true;
        this.LLJLL = true;
        this.LLJLLIL = 45.0d;
        this.LLLF = "1";
        this.LLLFF = "2";
        this.LLLFFI = new Rect();
        this.LLLFZ = new Rect();
        this.LLLIIL = 1.0f;
        this.LLLIILIL = 1.0f;
        this.LLLIL = 1.0f;
        this.LLLILZ = 1.0f;
        this.LLLILZJ = 0;
        this.LLLILZLLLI = 0;
        this.LLLJIL = new PaintFlagsDrawFilter(0, 2);
        LIZLLL(context, attributeSet);
    }

    public static Bitmap LIZ(Bitmap bitmap, float f, float f2) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale((f * 1.0f) / bitmap.getWidth(), (f2 * 1.0f) / bitmap.getHeight());
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public final void LJII(long j, long j2, long j3) {
        if (j <= 0 && j2 <= 0) {
            this.LLJILJIL = 1L;
            this.LLJILJILJ = 1L;
            this.LLJLL = true;
            this.LLJIJIL = getNewLeftWidth();
            postInvalidate();
            return;
        }
        this.LLJILJIL = j;
        this.LLJILJILJ = j2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLJIJIL, getNewLeftWidth());
        valueAnimatorOfFloat.setDuration(j3);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addListener(new ALAdapterS27S0100000_33(this, 2));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 6));
        valueAnimatorOfFloat.start();
    }
}

package X;

import Y.ALAdapterS27S0100000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.1AG4, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AG4 extends RelativeLayout {
    public int LL;
    public final C1AG5[] LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public float LLILZIL;
    public final float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public boolean LLJIJIL;
    public final SharedPreferences LLJILJIL;
    public final ALAdapterS27S0100000_33 LLJILJILJ;

    public C1AG4(Context context) throws Throwable {
        super(context, null, 0);
        C1AG5[] c1ag5Arr = {new C1AG5(ColorProtector.parseColor("#FF92A7"), ColorProtector.parseColor("#FE2C55")), new C1AG5(ColorProtector.parseColor("#FFC059"), ColorProtector.parseColor("#D95C34")), new C1AG5(ColorProtector.parseColor("#67CC8F"), ColorProtector.parseColor("#08843A")), new C1AG5(ColorProtector.parseColor("#5D7CE8"), ColorProtector.parseColor("#5927A9")), new C1AG5(ColorProtector.parseColor("#30C3EA"), ColorProtector.parseColor("#148FC3"))};
        this.LLILLJJLI = c1ag5Arr;
        int iLJIIIIZZ = C14KQ.LJIIIIZZ(context);
        int iLIZJ = C14KQ.LIZJ(context);
        float fSqrt = (float) Math.sqrt((iLJIIIIZZ * iLJIIIIZZ) + (iLIZJ * iLIZJ));
        this.LLILZLL = fSqrt;
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C786410Ut5.N3(context), 0, "qr_code_background_sp_name");
        this.LLJILJIL = sharedPreferencesLIZJ;
        this.LLJ = sharedPreferencesLIZJ.getFloat("qr_code_background_sp_center_x", iLJIIIIZZ);
        this.LLJI = sharedPreferencesLIZJ.getFloat("qr_code_background_sp_center_y", 0.0f);
        this.LL = sharedPreferencesLIZJ.getInt("qr_code_background_sp_color_index", 0);
        Paint paint = new Paint(1);
        this.LLILLL = paint;
        float f = this.LLJ;
        float f2 = this.LLJI;
        C1AG5 c1ag5 = c1ag5Arr[this.LL];
        paint.setShader(new RadialGradient(f, f2, fSqrt, c1ag5.LIZ, c1ag5.LIZIZ, Shader.TileMode.CLAMP));
        this.LLILZ = new Paint(1);
        setWillNotDraw(false);
        this.LLJILJILJ = new ALAdapterS27S0100000_33(this, 23);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.LLJ, this.LLJI, this.LLILZLL, this.LLILLL);
        float f = this.LLILZIL;
        if (f > 0.0f && f <= this.LLILZLL) {
            canvas.drawCircle(this.LLIZ, this.LLIZLLLIL, f, this.LLILZ);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (this.LLJIJIL) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLIZ = motionEvent.getX();
                this.LLIZLLLIL = motionEvent.getY();
                return true;
            }
            if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                int i = this.LL + 1;
                this.LL = i;
                C1AG5[] c1ag5Arr = this.LLILLJJLI;
                if (i >= c1ag5Arr.length) {
                    int length = i - c1ag5Arr.length;
                    this.LL = i - c1ag5Arr.length;
                    i = length;
                }
                this.LL = i;
                Paint paint = this.LLILZ;
                float f = this.LLIZ;
                float f2 = this.LLIZLLLIL;
                float f3 = this.LLILZLL;
                C1AG5 c1ag5 = this.LLILLJJLI[i];
                paint.setShader(new RadialGradient(f, f2, f3, c1ag5.LIZ, c1ag5.LIZIZ, Shader.TileMode.CLAMP));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.LLILZLL);
                valueAnimatorOfFloat.setDuration(600L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 47));
                valueAnimatorOfFloat.addListener(this.LLJILJILJ);
                valueAnimatorOfFloat.start();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}

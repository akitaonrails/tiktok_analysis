package X;

import Y.AAListenerS317S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Looper;
import android.util.AttributeSet;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0H0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434000H0c extends TuxTextView {
    public final int LLJJJJ;
    public final int LLJJJJJIL;
    public final int[] LLJJJJLIIL;
    public final float[] LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final float LLJL;
    public final Matrix LLJLIL;
    public final Paint LLJLILLLLZIIL;
    public final PorterDuffXfermode LLJLL;
    public boolean LLJLLIL;
    public Animator LLJLLL;
    public final List<Animator.AnimatorListener> LLJZ;
    public float LLJZIJLIL;
    public int LLL;
    public final BPEAHandler LLLF;

    public final void LJJJJJ() {
        this.LLJLLIL = false;
        Animator animator = this.LLJLLL;
        if (animator != null) {
            animator.cancel();
        }
        ((ArrayList) this.LLJZ).clear();
        this.LLLF.removeCallbacksAndMessages(null);
        this.LLL = 0;
        getPaint().setShader(null);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int iLIZ;
        int iLIZ2;
        super.onDraw(canvas);
        Animator animator = this.LLJLLL;
        if (animator != null && animator.isRunning() && getLayout() != null) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            int color = getPaint().getColor();
            Shader shader = getPaint().getShader();
            getPaint().setShader(null);
            getPaint().setColor(-1);
            getLayout().draw(canvas);
            float f = this.LLJL;
            C434030H0f c434030H0f = new C434030H0f();
            int[] iArr = c434030H0f.LIZLLL;
            int i = c434030H0f.LIZIZ;
            int i2 = i + 1;
            iArr[i] = 0;
            int i3 = i2 + 1;
            c434030H0f.LIZJ[i2] = this.LLJJJJLIIL;
            c434030H0f.LIZIZ = i3 + 1;
            iArr[i3] = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                Object obj = c434030H0f.LIZJ[i4];
                if (obj != null) {
                    iLIZ = c434030H0f.LIZ(obj);
                } else {
                    iLIZ = 1;
                }
                i5 += iLIZ;
                if (i4 == 2) {
                    break;
                } else {
                    i4++;
                }
            }
            int[] iArr2 = new int[i5];
            c434030H0f.LIZIZ(iArr, iArr2);
            C434020H0e c434020H0e = new C434020H0e();
            float[] fArr = c434020H0e.LIZLLL;
            int i6 = c434020H0e.LIZIZ;
            int i7 = i6 + 1;
            fArr[i6] = 0.0f;
            int i8 = i7 + 1;
            c434020H0e.LIZJ[i7] = this.LLJJL;
            c434020H0e.LIZIZ = i8 + 1;
            fArr[i8] = 1.0f;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                Object obj2 = c434020H0e.LIZJ[i9];
                if (obj2 != null) {
                    iLIZ2 = c434020H0e.LIZ(obj2);
                } else {
                    iLIZ2 = 1;
                }
                i10 += iLIZ2;
                if (i9 != 2) {
                    i9++;
                } else {
                    float[] fArr2 = new float[i10];
                    c434020H0e.LIZIZ(fArr, fArr2);
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f, 0.0f, iArr2, fArr2, Shader.TileMode.CLAMP);
                    this.LLJLIL.reset();
                    this.LLJLIL.setTranslate(this.LLJZIJLIL, 0.0f);
                    linearGradient.setLocalMatrix(this.LLJLIL);
                    this.LLJLILLLLZIIL.setShader(linearGradient);
                    this.LLJLILLLLZIIL.setXfermode(this.LLJLL);
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LLJLILLLLZIIL);
                    getPaint().setColor(color);
                    getPaint().setShader(shader);
                    this.LLJLILLLLZIIL.setXfermode(null);
                    canvas.restoreToCount(iSaveLayer);
                    return;
                }
            }
        }
    }

    public C434000H0c(Context context, AttributeSet attributeSet) {
        List listLJJLIIIJILLIZJL;
        List listLJJLIIIJILLIZJL2;
        super(context, attributeSet, 0);
        this.LLJJJJJIL = 5000;
        this.LLJJJJLIIL = new int[]{0, -1, 0};
        this.LLJJL = new float[]{0.0f, 0.5f, 1.0f};
        this.LLJLIL = new Matrix();
        this.LLJLILLLLZIIL = new Paint(1);
        this.LLJLL = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.LLJZ = new ArrayList();
        this.LLLF = new BPEAHandler(Looper.getMainLooper());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveGlintTextView, 0, 0);
            try {
                String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LiveGlintTextView_glint_colors);
                if (strXd != null && (listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(strXd, new String[]{","}, 0, 6)) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL2, 10));
                    Iterator it2 = listLJJLIIIJILLIZJL2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(Color.parseColor(a0.LJLIIIL((String) it2.next()).toString())));
                    }
                    this.LLJJJJLIIL = C13LP.LLII(arrayList);
                }
                String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LiveGlintTextView_glint_positions);
                if (strXd2 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strXd2, new String[]{","}, 0, 6)) != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                    Iterator it3 = listLJJLIIIJILLIZJL.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(Float.valueOf(CastFloatProtector.parseFloat(a0.LJLIIIL((String) it3.next()).toString())));
                    }
                    this.LLJJL = C13LP.LLI(arrayList2);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            int i = typedArrayObtainStyledAttributes.getInt(R$styleable.LiveGlintTextView_glint_repeat_count, this.LLJJLIIIJLLLLLLLZ);
            this.LLJJLIIIJLLLLLLLZ = i < 0 ? 0 : i;
            int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.LiveGlintTextView_glint_interval, this.LLJJJJ);
            this.LLJJJJ = i2 >= 0 ? i2 : 0;
            this.LLJJJJJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.LiveGlintTextView_glint_duration, this.LLJJJJJIL);
            float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveGlintTextView_glint_width, this.LLJL);
            this.LLJL = dimension < 0.0f ? 0.0f : dimension;
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            LJJJJJ();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfFloat.setDuration(this.LLJJJJJIL);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 60));
            valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(this, 31));
            this.LLJLLL = valueAnimatorOfFloat;
        }
    }
}

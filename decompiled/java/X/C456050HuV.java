package X;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HuV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C456050HuV extends FrameLayout {
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
    public EnumC455960HuM LL;
    public InterfaceC456070HuX LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public final TuxTextView LLIZ;
    public final LinearLayout LLIZLLLIL;
    public final TuxTextView LLJ;
    public final ImageView LLJI;
    public C456080HuY LLJIJIL;
    public final int LLJILJIL;
    public final IntEvaluator LLJILJILJ;
    public final ArgbEvaluator LLJILLL;
    public float LLJJ;

    public C456050HuV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final EnumC455960HuM getCurrentState() {
        return this.LL;
    }

    public final void LIZ(C456040HuU c456040HuU) {
        SpannableString spannableString = c456040HuU.LIZIZ;
        if (spannableString != null) {
            this.LLIZ.setText(spannableString);
        }
        SpannableString spannableString2 = c456040HuU.LIZJ;
        if (spannableString2 != null) {
            this.LLJ.setText(spannableString2);
        }
        Drawable drawable = c456040HuU.LIZLLL;
        if (drawable != null) {
            this.LLILLL.setBackground(drawable);
        }
        Drawable drawable2 = c456040HuU.LJ;
        if (drawable2 != null) {
            this.LLILZ.setBackground(drawable2);
        }
        InterfaceC456070HuX interfaceC456070HuX = c456040HuU.LJFF;
        if (interfaceC456070HuX != null) {
            this.LLILLJJLI = interfaceC456070HuX;
        }
        C456080HuY c456080HuY = c456040HuU.LJI;
        if (c456080HuY != null) {
            this.LLJIJIL = c456080HuY;
        }
        LIZIZ(c456040HuU.LIZ);
    }

    public final void LIZIZ(EnumC455960HuM enumC455960HuM) {
        setCurrentRatio(enumC455960HuM.getRatio());
        this.LL = enumC455960HuM;
        InterfaceC456070HuX interfaceC456070HuX = this.LLILLJJLI;
        if (interfaceC456070HuX != null) {
            interfaceC456070HuX.LIZ(enumC455960HuM);
        }
        final float width = (this.LLILLL.getWidth() - (this.LLIZ.getWidth() / 2.0f)) - (this.LLIZLLLIL.getWidth() / 2.0f);
        setOnTouchListener(new View.OnTouchListener() { // from class: X.0HuW
            /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[PHI: r7
              0x0031: PHI (r7v1 float) = (r7v0 float), (r7v2 float) binds: [B:8:0x0026, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
                /*
                    r8 = this;
                    int r0 = r10.getAction()
                    r3 = 1
                    if (r0 == 0) goto Lb3
                    r4 = 1065353216(0x3f800000, float:1.0)
                    r7 = 0
                    r6 = 2
                    if (r0 == r3) goto L33
                    if (r0 != r6) goto L30
                    X.0HuV r0 = r8.LL
                    float r6 = r0.LLILZLL
                    int r0 = r0.LLJILJIL
                    float r5 = (float) r0
                    float r2 = r10.getX()
                    X.0HuV r1 = r8.LL
                    float r0 = r1.LLILZIL
                    float r2 = r2 - r0
                    float r5 = r5 * r2
                    float r0 = r2
                    float r5 = r5 / r0
                    float r6 = r6 + r5
                    int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                    if (r0 < 0) goto L31
                    r7 = r6
                    int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                    if (r0 <= 0) goto L31
                L2d:
                    r1.setCurrentRatio(r4)
                L30:
                    return r3
                L31:
                    r4 = r7
                    goto L2d
                L33:
                    X.0HuV r0 = r8.LL
                    com.bytedance.tux.input.TuxTextView r0 = r0.LLIZ
                    int r0 = r0.getWidth()
                    float r2 = (float) r0
                    r0 = 1073741824(0x40000000, float:2.0)
                    float r2 = r2 / r0
                    float r0 = r2
                    float r2 = r2 / r0
                    float r1 = r10.getX()
                    X.0HuV r0 = r8.LL
                    float r0 = r0.LLILZIL
                    float r1 = r1 - r0
                    float r1 = java.lang.Math.abs(r1)
                    int r0 = X.C456050HuV.LLJJI
                    int r0 = X.C456050HuV.LLJJI
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L7b
                    X.0HuV r0 = r8.LL
                    float r0 = r0.LLJJ
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 >= 0) goto L78
                    X.0HuM r5 = X.EnumC455960HuM.RIGHT
                L62:
                    X.0HuV r0 = r8.LL
                    float r2 = r0.LLJJ
                    int[] r1 = X.C456030HuT.LIZ
                    int r0 = r5.ordinal()
                    r0 = r1[r0]
                    if (r0 == r3) goto L89
                    if (r0 == r6) goto L8a
                    X.07lC r0 = new X.07lC
                    r0.<init>()
                    throw r0
                L78:
                    X.0HuM r5 = X.EnumC455960HuM.LEFT
                    goto L62
                L7b:
                    X.0HuV r0 = r8.LL
                    float r0 = r0.LLJJ
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 <= 0) goto L86
                    X.0HuM r5 = X.EnumC455960HuM.RIGHT
                    goto L62
                L86:
                    X.0HuM r5 = X.EnumC455960HuM.LEFT
                    goto L62
                L89:
                    r4 = 0
                L8a:
                    float[] r1 = new float[r6]
                    r0 = 0
                    r1[r0] = r2
                    r1[r3] = r4
                    android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r1)
                    X.0HuV r2 = r8.LL
                    r0 = 120(0x78, double:5.93E-322)
                    r4.setDuration(r0)
                    Y.AUListenerS256S0100000_6 r1 = new Y.AUListenerS256S0100000_6
                    r0 = 31
                    r1.<init>(r2, r0)
                    r4.addUpdateListener(r1)
                    Y.AAListenerS261S0200000_6 r1 = new Y.AAListenerS261S0200000_6
                    r0 = 3
                    r1.<init>(r2, r5, r0)
                    r4.addListener(r1)
                    r4.start()
                    return r3
                Lb3:
                    X.0HuV r1 = r8.LL
                    float r0 = r10.getX()
                    r1.LLILZIL = r0
                    X.0HuV r1 = r8.LL
                    float r0 = r1.LLJJ
                    r1.LLILZLL = r0
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC456060HuW.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
    }

    public final void setCurrentRatio(float f) {
        int width = this.LLILLL.getWidth();
        int width2 = this.LLIZ.getWidth();
        float f2 = width2;
        float f3 = f2 / 2.0f;
        float width3 = f3 + (((width - f3) - (this.LLIZLLLIL.getWidth() / 2.0f)) * f);
        ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
        layoutParams.width = (int) (f2 + ((r5 - width2) * f));
        layoutParams.height = this.LLILLL.getHeight();
        C786410Ut5.W5(this.LLILZ, layoutParams);
        C786410Ut5.Jc(this.LLILZ, this.LLJILJIL * (width3 - (r3 / 2)));
        C456080HuY c456080HuY = this.LLJIJIL;
        if (c456080HuY != null) {
            this.LLIZ.setTextColor(((Integer) this.LLJILLL.evaluate(f, Integer.valueOf(c456080HuY.LIZ), Integer.valueOf(c456080HuY.LIZIZ))).intValue());
            this.LLJ.setTextColor(((Integer) this.LLJILLL.evaluate(f, Integer.valueOf(c456080HuY.LIZIZ), Integer.valueOf(c456080HuY.LIZ))).intValue());
            this.LLJI.setImageAlpha(this.LLJILJILJ.evaluate(f, (Integer) 153, (Integer) 255).intValue());
        }
        this.LLJJ = f;
    }

    public C456050HuV(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = EnumC455960HuM.LEFT;
        if (C444960Hcc.LIZIZ()) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        this.LLJILJIL = i2;
        FrameLayout.inflate(getContext(), R.layout.cg6, this);
        this.LLILZ = findViewById(R.id.kan);
        this.LLILLL = findViewById(R.id.kai);
        this.LLIZ = (TuxTextView) findViewById(R.id.kaj);
        this.LLIZLLLIL = (LinearLayout) findViewById(R.id.kak);
        this.LLJ = (TuxTextView) findViewById(R.id.kam);
        this.LLJI = (ImageView) findViewById(R.id.kal);
        this.LLJILJILJ = new IntEvaluator();
        this.LLJILLL = new ArgbEvaluator();
    }
}

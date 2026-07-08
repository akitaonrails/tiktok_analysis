package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0I0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I0Y extends FrameLayout {
    public final C444350Hbd LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final TuxSpinner LLILZ;
    public final View LLILZIL;
    public float[] LLILZLL;
    public final Path LLIZ;
    public final RectF LLIZLLLIL;

    public C0I0Y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        setState(C459470I0b.LIZ);
    }

    public final SmartImageView getImageView() {
        return this.LL;
    }

    public static void LIZ(C0I0Y c0i0y) {
        c0i0y.setState(C459460I0a.LIZ);
    }

    public static void LIZLLL(C0I0Y c0i0y) {
        c0i0y.setState(C459480I0c.LIZ);
    }

    private final void setState(C0I0Z c0i0z) {
        if (c0i0z instanceof C459470I0b) {
            LJ(this, C0I0X.LLILLJJLI, true, 10);
        } else if (c0i0z instanceof C459460I0a) {
            LJ(this, C0I0X.LLILLJJLI, false, 14);
        } else {
            if (c0i0z instanceof C459480I0c) {
                LJ(this, C0I0X.LL, false, 14);
                return;
            }
            throw new C1954807lC();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float[] fArr = this.LLILZLL;
        int length = fArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (fArr[i] == 0.0f) {
                    i++;
                } else {
                    canvas.clipPath(this.LLIZ);
                    break;
                }
            } else {
                break;
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void setImageCrashFixTag(String str) {
        if (C300630BqP.LIZ()) {
            getImageView().setTag(-5676, str);
        }
    }

    public final void setRounding(float f) {
        LIZJ(f, f, f, f);
    }

    public C0I0Y(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILZLL = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.LLIZ = new Path();
        this.LLIZLLLIL = new RectF();
        C786410Ut5.Sd(R.layout.cg5, C786410Ut5.ne(context), this);
        C444350Hbd c444350Hbd = (C444350Hbd) findViewById(R.id.k7a);
        this.LL = c444350Hbd;
        View viewFindViewById = findViewById(R.id.k7b);
        this.LLILLJJLI = viewFindViewById;
        this.LLILLL = findViewById(R.id.k7c);
        this.LLILZ = (TuxSpinner) findViewById(R.id.k7e);
        this.LLILZIL = findViewById(R.id.k7d);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a2k, context);
        if (numLIZJ != null) {
            int iIntValue2 = numLIZJ.intValue();
            C1331070kk5 hierarchy = c444350Hbd.getHierarchy();
            C1331100kk8 c1331100kk8 = new C1331100kk8();
            c1331100kk8.LIZ = EnumC1321320kUM.OVERLAY_COLOR;
            c1331100kk8.LJIIIIZZ(iIntValue2);
            hierarchy.LJJIII(c1331100kk8);
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ2 != null) {
            int iIntValue3 = numLIZJ2.intValue();
            float fAlpha = Color.alpha(iIntValue3) / 255.0f;
            float fRed = Color.red(iIntValue3);
            float fGreen = Color.green(iIntValue3);
            float fBlue = Color.blue(iIntValue3);
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a2k, getContext());
            if (numLIZJ3 != null) {
                iIntValue = numLIZJ3.intValue();
            } else {
                iIntValue = -1;
            }
            float f = 1 - fAlpha;
            float fGreen2 = (fGreen * fAlpha) + (Color.green(iIntValue) * f);
            int iLIZIZ = C814420VxA.LIZIZ((fBlue * fAlpha) + (Color.blue(iIntValue) * f)) | (C814420VxA.LIZIZ(fGreen2) << 8) | (C814420VxA.LIZIZ((fRed * fAlpha) + (Color.red(iIntValue) * f)) << 16) | (-16777216);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.getPaint().setColor(iLIZIZ);
            viewFindViewById.setBackground(shapeDrawable);
        }
    }

    public static void LJ(C0I0Y c0i0y, C0I0X c0i0x, boolean z, int i) {
        boolean z2;
        int i2;
        if ((i & 1) != 0) {
            c0i0x = C0I0X.LLILLJJLI;
        }
        int i3 = 0;
        if ((i & 4) != 0) {
            z = false;
        }
        View view = c0i0y.LLILLJJLI;
        if (c0i0x == C0I0X.LLILLJJLI) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view);
        C786410Ut5.LJLLLLLL(8, c0i0y.LLILLL);
        TuxSpinner tuxSpinner = c0i0y.LLILZ;
        if (!z) {
            i3 = 8;
        }
        C786410Ut5.LJLLLLLL(i3, tuxSpinner);
        C786410Ut5.LJLLLLLL(8, c0i0y.LLILZIL);
    }

    public final void LIZJ(float f, float f2, float f3, float f4) {
        this.LLILZLL = new float[]{f, f, f2, f2, f3, f3, f4, f4};
        this.LLIZ.reset();
        this.LLIZ.addRoundRect(this.LLIZLLLIL, this.LLILZLL, Path.Direction.CW);
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLIZLLLIL.set(0.0f, 0.0f, i, i2);
        this.LLIZ.reset();
        this.LLIZ.addRoundRect(this.LLIZLLLIL, this.LLILZLL, Path.Direction.CW);
    }
}

package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12P4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12P4 extends AppCompatImageView {
    public static final C12KQ[] LLILLJJLI = {C12KQ.VERTICAL, C12KQ.HORIZONTAL, C12KQ.RADIAL};
    public static final EnumC197015126j[] LLILLL = {EnumC197015126j.LINEAR, EnumC197015126j.EASE_IN, EnumC197015126j.EASE_OUT, EnumC197015126j.EASE_IN_OUT};
    public C12P3 LL;

    public C12P4(Context context) {
        this(context, null, 6, 0);
    }

    public C12P4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setBeginShadeOpacity(float f) {
        this.LL.LIZJ(f);
    }

    public final void setEndShadeOpacity(float f) {
        this.LL.LIZLLL(f);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable instanceof C12P3) {
            this.LL = (C12P3) drawable;
        }
    }

    public final void setLayerHeight(int i) {
        C12P3 c12p3 = this.LL;
        if (c12p3.LIZ() != i) {
            c12p3.LJIIIIZZ = null;
            c12p3.LJIILJJIL = i;
            c12p3.LIZJ = i;
            c12p3.invalidateSelf();
        }
        requestLayout();
    }

    public final void setLayerWidth(int i) {
        C12P3 c12p3 = this.LL;
        if (c12p3.LIZIZ() != i) {
            c12p3.LJIIIIZZ = null;
            c12p3.LJIILIIL = i;
            c12p3.LIZIZ = i;
            c12p3.invalidateSelf();
        }
        requestLayout();
    }

    public final void setShadeColor(int i) {
        this.LL.LJ(i);
    }

    public final void setShadeColorRes(int i) {
        C12P3 c12p3 = this.LL;
        Context context = getContext();
        c12p3.getClass();
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            c12p3.LJ(numLIZJ.intValue());
            c12p3.invalidateSelf();
        }
    }

    public final void setShader(EnumC197015126j enumC197015126j) {
        this.LL.LJFF(enumC197015126j);
    }

    public final void setStyle(C12KQ c12kq) {
        C12P3 c12p3 = this.LL;
        if (c12p3.LJIIJ != c12kq) {
            c12p3.LJIIIIZZ = null;
            c12p3.LJIIJ = c12kq;
            c12p3.invalidateSelf();
        }
    }

    public final void setTuxDarkLayer(C12P5 c12p5) {
        if (c12p5 == null) {
            setImageDrawable(null);
        } else {
            setImageDrawable(c12p5.LIZ(getContext()));
        }
    }

    public C12P4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxDarkLayerView, i, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxDarkLayerView_tux_layerWidth, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxDarkLayerView_tux_layerHeight, -1);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDarkLayerView_tux_shadeColor, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.TuxDarkLayerView_tux_beginShadeOpacity, 0.0f);
        float f2 = typedArrayObtainStyledAttributes.getFloat(R$styleable.TuxDarkLayerView_tux_endShadeOpacity, 1.0f);
        C12KQ c12kq = LLILLJJLI[typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDarkLayerView_tux_style, 0)];
        EnumC197015126j enumC197015126j = LLILLL[typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDarkLayerView_tux_shader, 0)];
        typedArrayObtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.FIT_XY);
        C12P5 c12p5 = new C12P5();
        c12p5.LIZ = dimensionPixelSize;
        c12p5.LIZIZ = dimensionPixelSize2;
        c12p5.LIZJ = Integer.valueOf(color);
        c12p5.LJ = Float.valueOf(f);
        c12p5.LJFF = Float.valueOf(f2);
        c12p5.LJI = c12kq;
        c12p5.LJII = enumC197015126j;
        C12P3 c12p3LIZ = c12p5.LIZ(context);
        this.LL = c12p3LIZ;
        setImageDrawable(c12p3LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C12P4(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i3 = R.attr.xs;
        } else {
            i3 = 0;
        }
        this(context, attributeSet, i3);
    }
}

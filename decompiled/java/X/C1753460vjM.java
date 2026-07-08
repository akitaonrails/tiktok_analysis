package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753460vjM extends ConstraintLayout {
    public final TuxIconView LL;
    public final C419910GdJ LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    public C1753460vjM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void setBackgroundAlpha(int i) {
        getBackground().setAlpha(i);
    }

    public final void setBackgroundColorRes(int i) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(this.LLILLL);
        c384050F3z.LIZ = C1308910kAL.LIZJ(i, getContext());
        setBackground(c384050F3z.LIZ(getContext()));
    }

    public final void setIconHeight(int i) {
        this.LLILZ = C679280Qkg.LIZ(i);
        ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.M6(this.LL, layoutParams);
        this.LL.requestLayout();
    }

    public final void setIconMargin(int i) {
        this.LLILZIL = C679280Qkg.LIZ(i);
        C06WN.LIZ(this.LL, Integer.valueOf(i));
        this.LL.requestLayout();
    }

    public final void setIconRes(int i) {
        this.LLILLJJLI.LIZ = i;
        TuxIconView tuxIconView = this.LL;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZLLL = this.LLILLJJLI.LIZLLL;
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    public final void setIconWidth(int i) {
        this.LLILLL = C679280Qkg.LIZ(i);
        ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
        layoutParams.width = i;
        C786410Ut5.M6(this.LL, layoutParams);
        this.LL.requestLayout();
    }

    public final void setLabel(CharSequence charSequence) {
        this.LL.setLabel(charSequence);
    }

    public final void setTintColor(int i) {
        this.LLILLJJLI.LIZLLL = Integer.valueOf(i);
        TuxIconView tuxIconView = this.LL;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = this.LLILLJJLI.LIZ;
        c419910GdJ.LIZLLL = Integer.valueOf(i);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    public final void setTintColorRes(int i) {
        this.LLILLJJLI.LIZLLL = C1308910kAL.LIZJ(i, getContext());
        TuxIconView tuxIconView = this.LL;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = this.LLILLJJLI.LIZ;
        c419910GdJ.LJ = Integer.valueOf(i);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    public C1753460vjM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircleButtonView);
        this.LLILLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.CircleButtonView_icon_width, 0.0f);
        this.LLILZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.CircleButtonView_icon_height, 0.0f);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleButtonView_button_backgroundColor, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.CircleButtonView_button_background);
        float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.CircleButtonView_button_background_alpha, 1.0f);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CircleButtonView_icon_res, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.CircleButtonView_icon_tintColor, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.CircleButtonView_icon_margin, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        if (drawable == null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(this.LLILLL);
            c384050F3z.LIZ = Integer.valueOf(color);
            drawable = c384050F3z.LIZ(context);
        }
        drawable.setAlpha((int) (f * drawable.getAlpha()));
        setBackground(drawable);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = resourceId;
        c419910GdJ.LIZLLL = Integer.valueOf(color2);
        this.LLILLJJLI = c419910GdJ;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setId(R.id.gi6);
        float f2 = this.LLILLL;
        float f3 = this.LLILZ;
        float f4 = this.LLILZIL;
        C19ME c19me = new C19ME((int) f2, (int) f3);
        c19me.startToStart = 0;
        c19me.endToEnd = 0;
        c19me.topToTop = 0;
        c19me.bottomToBottom = 0;
        int i2 = (int) f4;
        c19me.setMarginStart(i2);
        c19me.setMarginEnd(i2);
        ((ViewGroup.MarginLayoutParams) c19me).topMargin = i2;
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = i2;
        C786410Ut5.M6(tuxIconView, c19me);
        tuxIconView.setTuxIcon(c419910GdJ);
        this.LL = tuxIconView;
        addView(tuxIconView);
    }

    public /* synthetic */ C1753460vjM(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

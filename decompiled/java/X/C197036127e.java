package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.127e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197036127e {
    public final TextView LIZ;
    public int LIZIZ;
    public int LIZJ;
    public Integer LIZLLL;
    public float LJ;
    public float LJFF;
    public Drawable LJI;
    public Drawable LJII;

    public C197036127e(TextView textView) {
        this.LIZ = textView;
    }

    public final TuxIconDrawable LIZIZ(Integer num) {
        if (num == null) {
            return null;
        }
        num.intValue();
        if (num.intValue() <= 0) {
            return null;
        }
        return new TuxIconDrawable(this.LIZ.getContext(), num.intValue());
    }

    public final void LIZJ(int i) {
        int i2;
        int i3;
        Drawable drawable;
        Drawable drawable2;
        int i4;
        TuxIconDrawable tuxIconDrawable;
        TuxIconDrawable tuxIconDrawable2;
        TuxIconDrawable tuxIconDrawable3;
        TuxIconDrawable tuxIconDrawable4;
        TextView textView = this.LIZ;
        Drawable drawable3 = this.LJI;
        if ((drawable3 instanceof TuxIconDrawable) && (tuxIconDrawable4 = (TuxIconDrawable) drawable3) != null) {
            Integer num = this.LIZLLL;
            if (num == null) {
                tuxIconDrawable4.LIZ();
            } else {
                tuxIconDrawable4.LJFF(num.intValue());
            }
        }
        Drawable drawable4 = this.LJII;
        if ((drawable4 instanceof TuxIconDrawable) && (tuxIconDrawable3 = (TuxIconDrawable) drawable4) != null) {
            Integer num2 = this.LIZLLL;
            if (num2 == null) {
                tuxIconDrawable3.LIZ();
            } else {
                tuxIconDrawable3.LJFF(num2.intValue());
            }
        }
        float width = ((textView.getWidth() - textView.getPaint().measureText(textView.getText().toString())) - textView.getPaddingLeft()) - textView.getPaddingRight();
        if (textView.getCompoundDrawablePadding() != i) {
            textView.setCompoundDrawablePadding(i);
        }
        if (this.LJI != null) {
            i2 = this.LIZJ + i;
        } else {
            i2 = 0;
        }
        if (this.LJII != null) {
            i3 = this.LIZJ + i;
        } else {
            i3 = 0;
        }
        float f = (width - i2) - i3;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = f / 2.0f;
        if (textView.getLayoutDirection() == 1) {
            drawable = this.LJII;
            drawable2 = this.LJI;
        } else {
            drawable = this.LJI;
            drawable2 = this.LJII;
        }
        int iLIZIZ = C814420VxA.LIZIZ(f2);
        if ((drawable instanceof TuxIconDrawable) && (tuxIconDrawable2 = (TuxIconDrawable) drawable) != null && tuxIconDrawable2.LIZLLL && tuxIconDrawable2.LJFF) {
            i4 = -iLIZIZ;
        } else {
            i4 = iLIZIZ;
        }
        if (!(drawable2 instanceof TuxIconDrawable) || (tuxIconDrawable = (TuxIconDrawable) drawable2) == null || !tuxIconDrawable.LIZLLL || !tuxIconDrawable.LJFF) {
            iLIZIZ = -iLIZIZ;
        }
        if (drawable != null) {
            drawable.setBounds(i4, 0, this.LIZJ + i4, this.LIZIZ);
        }
        if (drawable2 != null) {
            drawable2.setBounds(iLIZIZ, 0, this.LIZJ + iLIZIZ, this.LIZIZ);
        }
        textView.setCompoundDrawables(drawable, null, drawable2, null);
    }

    public final void LIZ(AttributeSet attributeSet, int i) {
        Context context = this.LIZ.getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxCompoundIcon, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxCompoundIcon_tux_icon, -1);
        if (resourceId < 0) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxCompoundIcon_tux_iconStart, -1);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxCompoundIcon_tux_iconEnd, -1);
        this.LJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxCompoundIcon_tux_iconWidth, -1.0f);
        this.LJFF = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxCompoundIcon_tux_iconHeight, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TuxCompoundIcon_tux_tintColor)) {
            this.LIZLLL = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCompoundIcon_tux_tintColor, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId > 0) {
            this.LJI = new TuxIconDrawable(context, resourceId);
        }
        if (resourceId2 > 0) {
            this.LJII = new TuxIconDrawable(context, resourceId2);
        }
    }
}

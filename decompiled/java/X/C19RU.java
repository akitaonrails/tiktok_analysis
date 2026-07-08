package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19RU, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19RU {
    public final Rect LIZ;
    public final ColorStateList LIZIZ;
    public final ColorStateList LIZJ;
    public final ColorStateList LIZLLL;
    public final int LJ;
    public final C19RX LJFF;

    public final void LIZIZ(TextView textView) {
        C21538919Rb c21538919Rb = new C21538919Rb();
        C21538919Rb c21538919Rb2 = new C21538919Rb();
        c21538919Rb.setShapeAppearanceModel(this.LJFF);
        c21538919Rb2.setShapeAppearanceModel(this.LJFF);
        c21538919Rb.LJIIJJI(this.LIZJ);
        float f = this.LJ;
        ColorStateList colorStateList = this.LIZLLL;
        c21538919Rb.LL.LJIIJ = f;
        c21538919Rb.invalidateSelf();
        C21539019Rc c21539019Rc = c21538919Rb.LL;
        if (c21539019Rc.LIZLLL != colorStateList) {
            c21539019Rc.LIZLLL = colorStateList;
            c21538919Rb.onStateChange(c21538919Rb.getState());
        }
        textView.setTextColor(this.LIZIZ);
        RippleDrawable rippleDrawable = new RippleDrawable(this.LIZIZ.withAlpha(30), c21538919Rb, c21538919Rb2);
        Rect rect = this.LIZ;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public static C19RU LIZ(int i, Context context) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C08IF.LIZ("Cannot create a CalendarItemStyle with a styleResId of 0", z);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListLIZ = C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListLIZ2 = C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListLIZ3 = C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        C19RX c19rx = new C19RX(C19RX.LIZ(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new C1844490y6B(0)));
        typedArrayObtainStyledAttributes.recycle();
        return new C19RU(colorStateListLIZ, colorStateListLIZ2, colorStateListLIZ3, dimensionPixelSize, c19rx, rect);
    }

    public C19RU(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C19RX c19rx, Rect rect) {
        C08IF.LIZJ(rect.left);
        C08IF.LIZJ(rect.top);
        C08IF.LIZJ(rect.right);
        C08IF.LIZJ(rect.bottom);
        this.LIZ = rect;
        this.LIZIZ = colorStateList2;
        this.LIZJ = colorStateList;
        this.LIZLLL = colorStateList3;
        this.LJ = i;
        this.LJFF = c19rx;
    }
}

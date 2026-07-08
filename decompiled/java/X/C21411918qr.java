package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: renamed from: X.18qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21411918qr {
    public final Context LIZ;
    public final TypedArray LIZIZ;
    public TypedValue LIZJ;

    public final void LJIILJJIL() {
        this.LIZIZ.recycle();
    }

    public final ColorStateList LIZIZ(int i) {
        int resourceId;
        ColorStateList colorStateListLIZIZ;
        if (this.LIZIZ.hasValue(i) && (resourceId = this.LIZIZ.getResourceId(i, 0)) != 0 && (colorStateListLIZIZ = C838410Wul.LIZIZ(resourceId, this.LIZ)) != null) {
            return colorStateListLIZIZ;
        }
        return this.LIZIZ.getColorStateList(i);
    }

    public final Drawable LJ(int i) {
        int resourceId;
        if (this.LIZIZ.hasValue(i) && (resourceId = this.LIZIZ.getResourceId(i, 0)) != 0) {
            return C14MI.LIZ(this.LIZ, resourceId);
        }
        return this.LIZIZ.getDrawable(i);
    }

    public final Drawable LJFF(int i) {
        int resourceId;
        Drawable drawableLJI;
        if (this.LIZIZ.hasValue(i) && (resourceId = this.LIZIZ.getResourceId(i, 0)) != 0) {
            C14MG c14mgLIZ = C14MG.LIZ();
            Context context = this.LIZ;
            synchronized (c14mgLIZ) {
                drawableLJI = c14mgLIZ.LIZ.LJI(context, resourceId, true);
            }
            return drawableLJI;
        }
        return null;
    }

    public final String LJIIIZ(int i) {
        return C786410Ut5.Xd(this.LIZIZ, i);
    }

    public final CharSequence LJIIJ(int i) {
        return C786410Ut5.Yd(this.LIZIZ, i);
    }

    public final boolean LJIIJJI(int i) {
        return this.LIZIZ.hasValue(i);
    }

    public C21411918qr(Context context, TypedArray typedArray) {
        this.LIZ = context;
        this.LIZIZ = typedArray;
    }

    public final boolean LIZ(int i, boolean z) {
        return this.LIZIZ.getBoolean(i, z);
    }

    public final int LIZJ(int i, int i2) {
        return this.LIZIZ.getDimensionPixelOffset(i, i2);
    }

    public final int LIZLLL(int i, int i2) {
        return this.LIZIZ.getDimensionPixelSize(i, i2);
    }

    public final int LJII(int i, int i2) {
        return this.LIZIZ.getInt(i, i2);
    }

    public final int LJIIIIZZ(int i, int i2) {
        return this.LIZIZ.getResourceId(i, i2);
    }

    public static C21411918qr LJIIL(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C21411918qr(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public final Typeface LJI(int i, int i2, C21411518qn c21411518qn) {
        int resourceId = this.LIZIZ.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new TypedValue();
        }
        Context context = this.LIZ;
        TypedValue typedValue = this.LIZJ;
        if (context.isRestricted()) {
            return null;
        }
        return C20143013rg.LJ(context, resourceId, typedValue, i2, c21411518qn, true);
    }

    public static C21411918qr LJIILIIL(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C21411918qr(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}

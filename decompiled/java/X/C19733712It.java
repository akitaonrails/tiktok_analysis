package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12It, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19733712It {
    public static final Context LIZ = C0CHQ.LIZ;
    public static final int LIZIZ = ColorProtector.parseColor("#FFFFFFFF");
    public static final int LIZJ = ColorProtector.parseColor("#D8000000");
    public static final int LIZLLL = ColorProtector.parseColor("#80000000");
    public static final int LJ = ColorProtector.parseColor("#99000000");
    public static final int LJFF = ColorProtector.parseColor("#26FFFFFF");
    public static final int LJI = ColorProtector.parseColor("#26000000");

    public static int LIZJ(int i) {
        return (i & 16777215) | Integer.MIN_VALUE;
    }

    public static Drawable LIZLLL(Drawable drawable) {
        if (drawable == null) {
            return drawable;
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(LIZIZ, PorterDuff.Mode.SRC_IN));
        return drawableMutate;
    }

    public static Drawable LIZ(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isCircle, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_topHalfRadius, false);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_roundRadius, 0.0f);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_fsPanel, false);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_secondPanel, false);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_effectPanel, false);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_subView, false);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_useTextColor, false);
        int iLIZIZ = LIZIZ(z3, z4, z5, z6);
        if (z7) {
            iLIZIZ = LIZIZ;
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.AVDmtView_bgColor)) {
            iLIZIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.AVDmtView_bgColor, iLIZIZ);
        }
        typedArrayObtainStyledAttributes.recycle();
        C1643380sro c1643380sro = new C1643380sro();
        c1643380sro.LIZIZ(iLIZIZ);
        c1643380sro.LJ(iLIZIZ, 0);
        if (z) {
            c1643380sro.LIZLLL(1);
        } else {
            c1643380sro.LIZLLL(0);
            if (z2) {
                float f = dimension;
                c1643380sro.LJI = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
            } else {
                c1643380sro.LIZJ(dimension);
            }
        }
        return c1643380sro.LIZ();
    }

    public static Drawable LJ(Drawable drawable, int i) {
        if (drawable == null) {
            return drawable;
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        return drawableMutate;
    }

    public static int LIZIZ(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return LJFF;
        }
        if (z) {
            Context context = LIZ;
            if (z2) {
                return C960203pA.LIZ(R.attr.bn, context);
            }
            return C960203pA.LIZ(R.attr.bm, context);
        }
        if (z2) {
            if (z3) {
                return LJI;
            }
            return LIZLLL;
        }
        if (z3) {
            return LJ;
        }
        return LIZJ;
    }
}

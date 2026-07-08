package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ebz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368130Ebz {
    public static final Typeface LIZ = C1697580uHE.LIZIZ(0.0f, 400, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224);
    public static final float LIZIZ = 18.0f;
    public static float LIZJ = 0.1f;
    public static final float LIZLLL = 30.0f;
    public static final boolean LJ = true;
    public static final int LJFF = R.color.sp;
    public static final boolean LJI = true;
    public static final boolean LJII = true;
    public static final C369570EeJ LJIIIIZZ = new Object() { // from class: X.0EeJ
    };
    public static final int LJIIIZ;
    public static final int LJIIJ;
    public static final int LJIIJJI;
    public static final float LJIIL;
    public static final int LJIILIIL;
    public static final int LJIILJJIL;
    public static final float LJIILL;
    public static final float LJIILLIIL;
    public static final int LJIIZILJ;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0EeJ] */
    static {
        LJIIIZ = C293820BfQ.LIZ() ? 66 : 54;
        LJIIJ = C293820BfQ.LIZ() ? 60 : 50;
        LJIIJJI = C293820BfQ.LIZ() ? 60 : 50;
        LJIIL = 1.5f;
        LJIILIIL = 34;
        LJIILJJIL = C390810FTz.LIZ(C293820BfQ.LIZ() ? 22.0f : 14.0f);
        LJIILL = C293820BfQ.LIZ() ? 36.0f : 30.0f;
        LJIILLIIL = 0.6f;
        LJIIZILJ = R.drawable.bot;
    }

    public static C368390EcP LIZ(Context context) {
        float f;
        float f2;
        int i;
        int i2;
        Integer numLIZIZ = LIZIZ(context, Integer.valueOf(R.attr.ee));
        C368780Ed2 c368780Ed2 = new C368780Ed2(EnumC368190Ec5.LEFT, context);
        C368780Ed2 c368780Ed22 = new C368780Ed2(EnumC368190Ec5.RIGHT, context);
        if (C293820BfQ.LIZ()) {
            f = 22.0f;
        } else {
            f = 16.0f;
        }
        int iLIZ = C390810FTz.LIZ(f);
        if (C293820BfQ.LIZ()) {
            f2 = 3.0f;
        } else {
            f2 = 2.0f;
        }
        int iLIZ2 = C390810FTz.LIZ(f2);
        if (C293820BfQ.LIZ()) {
            i = 14;
        } else {
            i = 10;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
        if (C293820BfQ.LIZ()) {
            i2 = 10;
        } else {
            i2 = 8;
        }
        return new C368390EcP(c368780Ed2, c368780Ed22, numLIZIZ, iLIZIZ, iLIZ, iLIZ2, C390810FTz.LIZ(0.0f), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), LIZIZ(context, Integer.valueOf(R.attr.e6)), LIZIZ(context, Integer.valueOf(R.attr.e4)), 8);
    }

    public static C368570Ech LIZJ(final Context context) {
        float f;
        int iIntValue;
        float f2;
        float f3;
        float f4;
        if (C293820BfQ.LIZ()) {
            f = 32.0f;
        } else {
            f = 26.0f;
        }
        final int iLIZ = C390810FTz.LIZ(f);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_double_triangle;
        int i = C367740EbM.LIZ;
        Integer numLIZIZ = LIZIZ(context, Integer.valueOf(R.attr.ej));
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = 0;
        }
        c419910GdJ.LIZLLL = Integer.valueOf(C367740EbM.LIZ(0.35f, iIntValue));
        c419910GdJ.LJFF = false;
        float f5 = 22.0f;
        if (C293820BfQ.LIZ()) {
            f2 = 22.0f;
        } else {
            f2 = 18.0f;
        }
        c419910GdJ.LIZIZ = C390810FTz.LIZ(f2);
        if (C293820BfQ.LIZ()) {
            f3 = 22.0f;
        } else {
            f3 = 18.0f;
        }
        c419910GdJ.LIZJ = C390810FTz.LIZ(f3);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        if (C293820BfQ.LIZ()) {
            f4 = 22.0f;
        } else {
            f4 = 18.0f;
        }
        int iLIZ2 = C390810FTz.LIZ(f4);
        if (!C293820BfQ.LIZ()) {
            f5 = 18.0f;
        }
        int iLIZ3 = C390810FTz.LIZ(f5);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_double_triangle;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.ej);
        c419910GdJ2.LJFF = false;
        c419910GdJ2.LIZIZ = iLIZ2;
        c419910GdJ2.LIZJ = iLIZ3;
        TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(context);
        return new C368570Ech(Integer.valueOf(iLIZ), new Drawable(context, iLIZ) { // from class: X.0EeS
            public final int LIZ;
            public final float LIZIZ;
            public final float LIZJ;
            public final RectF LIZLLL;
            public final C01GW LJ;
            public final C01GW LJFF;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return ((Paint) this.LJ.getValue()).getAlpha();
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                int iWidth = getBounds().width();
                int iHeight = getBounds().height();
                float f6 = this.LIZJ;
                if (C293810BfP.LIZ()) {
                    float f7 = 2;
                    f6 = (iHeight - (this.LIZ - (this.LIZJ * f7))) / f7;
                }
                if (iWidth > 0 && iHeight > 0) {
                    this.LIZLLL.set(0.0f, 0.0f, iWidth, iHeight);
                    RectF rectF = this.LIZLLL;
                    float f8 = this.LIZIZ;
                    canvas.drawRoundRect(rectF, f8, f8, (Paint) this.LJFF.getValue());
                    RectF rectF2 = this.LIZLLL;
                    rectF2.top += f6;
                    rectF2.bottom -= f6;
                    float f9 = rectF2.left;
                    float f10 = this.LIZJ;
                    rectF2.left = f9 + f10;
                    rectF2.right -= f10;
                    float f11 = this.LIZIZ;
                    canvas.drawRoundRect(rectF2, f11, f11, (Paint) this.LJ.getValue());
                }
            }

            @Override // android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                super.onBoundsChange(rect);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i2) {
                if (((Paint) this.LJ.getValue()).getAlpha() != i2) {
                    ((Paint) this.LJ.getValue()).setAlpha(i2);
                    invalidateSelf();
                }
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                ((Paint) this.LJ.getValue()).setColorFilter(colorFilter);
                invalidateSelf();
            }

            {
                float fLIZIZ;
                this.LIZ = iLIZ;
                if (C293820BfQ.LIZ()) {
                    fLIZIZ = C418440Gaw.LIZIZ(8);
                } else {
                    fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                }
                this.LIZIZ = fLIZIZ;
                this.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                this.LIZLLL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                this.LJ = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1218));
                this.LJFF = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(333));
            }
        }, tuxIconDrawableLIZ, tuxIconDrawableLIZ2, LIZIZ(context, Integer.valueOf(R.attr.eg)));
    }

    public static C368780Ed2 LIZLLL(Context context) {
        int i;
        C368780Ed2 c368780Ed2 = new C368780Ed2(EnumC368190Ec5.LEFT, context);
        C418440Gaw.LIZIZ(6);
        if (C293820BfQ.LIZ()) {
            i = 20;
        } else {
            i = 18;
        }
        c368780Ed2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        return c368780Ed2;
    }

    public static C368780Ed2 LJ(Context context) {
        int i;
        C368780Ed2 c368780Ed2 = new C368780Ed2(EnumC368190Ec5.RIGHT, context);
        C418440Gaw.LIZIZ(6);
        if (C293820BfQ.LIZ()) {
            i = 20;
        } else {
            i = 18;
        }
        c368780Ed2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        return c368780Ed2;
    }

    public static Integer LIZIZ(Context context, Integer num) {
        if (num == null) {
            return null;
        }
        return C1308910kAL.LIZJ(num.intValue(), context);
    }

    public static TuxIconDrawable LJFF(int i, int i2, Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(i2);
        c419910GdJ.LJFF = false;
        return c419910GdJ.LIZ(context);
    }
}

package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Magnifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10tH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19388510tH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19389110tN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19388510tH(C19389110tN c19389110tN) {
        super(0);
        this.LL = c19389110tN;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19389110tN c19389110tN = this.LL;
        View view = c19389110tN.LIZ;
        if (view != null) {
            Magnifier.Builder builder = new Magnifier.Builder(view);
            C19388410tG c19388410tG = c19389110tN.LIZIZ;
            Magnifier.Builder initialZoom = builder.setSize(c19388410tG.LIZ, c19388410tG.LIZIZ).setInitialZoom(c19389110tN.LIZIZ.LIZJ);
            Context context = view.getContext();
            C19388410tG c19388410tG2 = c19389110tN.LIZIZ;
            Integer numLIZJ = C1308910kAL.LIZJ(c19388410tG2.LIZLLL, context);
            final int iIntValue = numLIZJ != null ? numLIZJ.intValue() : -1;
            final float f = c19388410tG2.LJI;
            final float f2 = c19388410tG2.LJ;
            c19389110tN.LIZJ = initialZoom.setOverlay(new Drawable(f, f2, iIntValue) { // from class: X.0Eeh
                public static final float LJI = C418440Gaw.LIZIZ(11);
                public static final float LJII = C418440Gaw.LIZIZ(Double.valueOf(9.5d));
                public final float LIZ;
                public final float LIZIZ;
                public final Paint LIZJ;
                public final Paint LIZLLL;
                public final RectF LJ;
                public final Path LJFF;

                @Override // android.graphics.drawable.Drawable
                @InterfaceC1294060jmO
                public final int getOpacity() {
                    return -3;
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    if (getBounds().isEmpty()) {
                        return;
                    }
                    float f3 = this.LIZIZ / 2.0f;
                    float f4 = this.LIZ;
                    float fHeight = (getBounds().height() / 2.0f) - f3;
                    if (f4 > fHeight) {
                        f4 = fHeight;
                    }
                    this.LJ.set(getBounds().left + f3, getBounds().top + f3, getBounds().right - f3, getBounds().bottom - f3);
                    this.LJFF.reset();
                    this.LJFF.addRoundRect(this.LJ, f4, f4, Path.Direction.CW);
                    int iSave = canvas.save();
                    canvas.clipPath(this.LJFF);
                    float fHeight2 = (getBounds().height() - LJI) - LJII;
                    Paint paint = this.LIZLLL;
                    if (fHeight2 < 0.0f) {
                        fHeight2 = 0.0f;
                    }
                    paint.setShader(new LinearGradient(0.0f, fHeight2, 0.0f, getBounds().height(), 0, 520093696, Shader.TileMode.CLAMP));
                    canvas.drawRoundRect(this.LJ, f4, f4, this.LIZLLL);
                    canvas.restoreToCount(iSave);
                    canvas.drawRoundRect(this.LJ, f4, f4, this.LIZJ);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
                    this.LIZJ.setAlpha(i);
                    this.LIZLLL.setAlpha(i);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                    this.LIZJ.setColorFilter(colorFilter);
                    this.LIZLLL.setColorFilter(colorFilter);
                }

                {
                    this.LIZ = f;
                    this.LIZIZ = f2;
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(paint.getStrokeWidth());
                    paint.setColor(iIntValue);
                    this.LIZJ = paint;
                    this.LIZLLL = new Paint(1);
                    this.LJ = new RectF();
                    this.LJFF = new Path();
                }
            }).setElevation(c19389110tN.LIZIZ.LJFF).setCornerRadius(c19389110tN.LIZIZ.LJI).setClippingEnabled(c19389110tN.LIZIZ.LJII).build();
        }
        return Unit.LIZ;
    }
}

package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0c4U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997760c4U {
    public static void LIZ(final Context context, ViewGroup viewGroup, final C1326830kdF c1326830kdF) {
        Drawable drawable = new Drawable(c1326830kdF, context) { // from class: X.0kdE
            public final String LIZ;
            public final int LIZIZ;
            public final float LIZJ;
            public final float LIZLLL;
            public final int LJ;
            public final int LJFF;
            public final Paint LJI;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                this.LJI.setColor(this.LIZIZ);
                this.LJI.setTextSize(this.LIZJ);
                this.LJI.setAntiAlias(true);
                float f = getBounds().right;
                float f2 = getBounds().bottom;
                float fMeasureText = this.LJI.measureText(this.LIZ);
                canvas.drawColor(0);
                int i = this.LJFF;
                float f3 = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float f4 = (-fMeasureText) / 2;
                    int i3 = this.LJ;
                    for (int i4 = 0; i4 < i3; i4++) {
                        canvas.save();
                        canvas.translate(f4, f3);
                        canvas.rotate(this.LIZLLL);
                        canvas.drawText(this.LIZ, 0.0f, 0.0f, this.LJI);
                        canvas.restore();
                        f4 += f / (this.LJ - 1);
                    }
                    f3 += f2 / this.LJFF;
                }
                canvas.save();
                canvas.restore();
            }

            {
                int i;
                float fLIZJ;
                String str;
                this.LIZ = (c1326830kdF == null || (str = c1326830kdF.LIZ) == null) ? context.getString(2131825231) : str;
                if (c1326830kdF != null) {
                    i = c1326830kdF.LIZIZ;
                } else {
                    i = 520093695;
                }
                this.LIZIZ = i;
                if (c1326830kdF != null) {
                    fLIZJ = c1326830kdF.LIZJ;
                } else {
                    fLIZJ = C12ES.LIZJ(18.0f, context);
                }
                this.LIZJ = fLIZJ;
                this.LIZLLL = -15.0f;
                this.LJ = 3;
                this.LJFF = 10;
                this.LJI = new Paint();
            }
        };
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.aim);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackground(drawable);
        viewGroup.addView(frameLayout);
    }
}

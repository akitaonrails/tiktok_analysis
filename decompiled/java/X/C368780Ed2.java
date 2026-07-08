package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ed2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368780Ed2 extends Drawable {
    public final EnumC368190Ec5 LIZ;
    public final Context LIZIZ;
    public int LIZJ;
    public final int LIZLLL;
    public final Paint LJ;
    public final C01GW LJFF;
    public final int LJI;
    public final ShapeDrawable LJII;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public final float LIZ() {
        if (this.LIZ == EnumC368190Ec5.LEFT) {
            return C418440Gaw.LIZIZ(Integer.valueOf(this.LJI));
        }
        return 0.0f;
    }

    public final float LIZIZ() {
        if (this.LIZ == EnumC368190Ec5.LEFT) {
            return 0.0f;
        }
        return C418440Gaw.LIZIZ(Integer.valueOf(this.LJI));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        this.LJII.setBounds(getBounds());
        this.LJII.draw(canvas);
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY();
        if (this.LIZ == EnumC368190Ec5.LEFT) {
            i = this.LIZLLL;
        } else {
            i = -this.LIZLLL;
        }
        Drawable drawable = (Drawable) this.LJFF.getValue();
        int i2 = this.LIZJ / 2;
        drawable.setBounds((iCenterX - i2) + i, iCenterY - i2, iCenterX + i2 + i, iCenterY + i2);
        boolean zLIZ = C423170GiZ.LIZ(this.LIZIZ);
        if (zLIZ) {
            canvas.save();
            canvas.translate(this.LIZJ, 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        ((TuxIconDrawable) this.LJFF.getValue()).draw(canvas);
        if (zLIZ) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJ.setColorFilter(colorFilter);
    }

    public C368780Ed2(EnumC368190Ec5 enumC368190Ec5, Context context) {
        int i;
        this.LIZ = enumC368190Ec5;
        this.LIZIZ = context;
        C418440Gaw.LIZIZ(8);
        this.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        this.LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.LJ = paint;
        this.LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1209));
        if (C293820BfQ.LIZ()) {
            i = 14;
        } else {
            i = 8;
        }
        this.LJI = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{LIZ(), LIZ(), LIZIZ(), LIZIZ(), LIZIZ(), LIZIZ(), LIZ(), LIZ()}, null, null));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
        if (numLIZJ != null) {
            shapeDrawable.getPaint().setColor(numLIZJ.intValue());
        }
        this.LJII = shapeDrawable;
    }
}

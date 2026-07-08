package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0GQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC415370GQl extends Drawable {
    public final LinkedList<Paint> LIZ;
    public final Paint LIZIZ;
    public final C415290GQd LIZJ;
    public boolean LIZLLL;

    public abstract void LIZ(Canvas canvas);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public AbstractC415370GQl() {
        LinkedList<Paint> linkedList = new LinkedList<>();
        this.LIZ = linkedList;
        Paint paint = new Paint();
        this.LIZIZ = paint;
        this.LIZJ = new C415290GQd();
        linkedList.add(paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.LIZLLL) {
            Iterator<Paint> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().setAntiAlias(true);
            }
            this.LIZLLL = true;
        }
        canvas.save();
        LIZ(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Iterator<Paint> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Iterator<Paint> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().setColorFilter(colorFilter);
        }
    }

    public final void LIZIZ(float f, float f2, Canvas canvas) {
        canvas.translate(getBounds().left, getBounds().top);
        canvas.scale(getBounds().width() / f, getBounds().height() / f2);
    }
}

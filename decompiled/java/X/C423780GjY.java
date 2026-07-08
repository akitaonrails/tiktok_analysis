package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallGradientColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0GjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423780GjY extends Drawable {
    public final ECMixMallGradientColor LIZ;
    public final Integer LIZIZ;
    public final Paint LIZJ = new Paint(1);
    public int LIZLLL = Integer.MIN_VALUE;
    public int LJ = Integer.MIN_VALUE;
    public int LJFF = Integer.MIN_VALUE;
    public int LJI = Integer.MIN_VALUE;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<java.lang.Float>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final void LIZ() {
        ?? arrayList;
        if (getBounds().left == this.LIZLLL && getBounds().top == this.LJ && getBounds().right == this.LJFF && getBounds().bottom == this.LJI) {
            return;
        }
        this.LIZLLL = getBounds().left;
        this.LJ = getBounds().top;
        this.LJFF = getBounds().right;
        this.LJI = getBounds().bottom;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth <= 0 || iHeight <= 0) {
            this.LIZJ.setShader(null);
            Paint paint = this.LIZJ;
            Integer num = this.LIZIZ;
            paint.setColor(num != null ? num.intValue() : 0);
            return;
        }
        List<String> list = this.LIZ.colors;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(C1774710wHd.LIZ(it2.next())));
        }
        List<Float> list2 = this.LIZ.absolutePositions;
        if (list2 == null || list2.isEmpty()) {
            arrayList = this.LIZ.positions;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<Float> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(Float.valueOf(C13LZ.LIZLLL(C0H9H.LIZ(it3.next().floatValue()) / iHeight, 0.0f, 1.0f)));
            }
        }
        if (arrayList2.isEmpty() || arrayList.size() != arrayList2.size()) {
            this.LIZJ.setShader(null);
            Paint paint2 = this.LIZJ;
            Integer num2 = this.LIZIZ;
            paint2.setColor(num2 != null ? num2.intValue() : 0);
            return;
        }
        double radians = Math.toRadians(((double) this.LIZ.angle) - 180.0d);
        float f = iWidth / 2.0f;
        float f2 = iHeight / 2.0f;
        float fSin = (float) Math.sin(radians);
        float f3 = getBounds().left + f;
        float f4 = getBounds().top + f2;
        float f5 = f * fSin;
        float fCos = f2 * ((float) Math.cos(radians));
        this.LIZJ.setShader(new LinearGradient(f3 + f5, f4 - fCos, f3 - f5, f4 + fCos, C13LP.LLII(arrayList2), C13LP.LLI(arrayList), Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        LIZ();
        canvas.drawRect(getBounds(), this.LIZJ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        LIZ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZJ.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZJ.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C423780GjY(ECMixMallGradientColor eCMixMallGradientColor, Integer num) {
        this.LIZ = eCMixMallGradientColor;
        this.LIZIZ = num;
    }
}

package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EeL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C369590EeL implements InterfaceC367710EbJ {
    public static final int LJIIJ = ColorProtector.parseColor("#11862F");
    public static final int LJIIJJI = ColorProtector.parseColor("#ECC66B");
    public static final int LJIIL = ColorProtector.parseColor("#ED8ACE");
    public static final int LJIILIIL = ColorProtector.parseColor("#FACE15");
    public final Paint LIZ;
    public final Path LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;

    @Override // X.InterfaceC367710EbJ
    public void LIZ() {
    }

    @Override // X.InterfaceC367710EbJ
    public void LIZJ(Canvas canvas, RectF rectF, RectF rectF2, float f) {
    }

    public C369590EeL() {
        Paint paint = new Paint();
        paint.setStrokeWidth(C0FU0.LIZ(1.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.LIZ = paint;
        this.LIZIZ = new Path();
        this.LIZJ = C0FU0.LIZ(13.0f);
        this.LIZLLL = C0FU0.LIZ(1.5f);
        this.LJII = 1.0f;
    }

    @Override // X.InterfaceC367710EbJ
    public final void LIZIZ(float f, float f2, float f3) {
        this.LJ = f;
        this.LJFF = f2;
        this.LJII = f3;
    }

    @Override // X.InterfaceC367710EbJ
    public final void LJFF(float f, int i, int i2) {
        this.LJI = f;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
    }

    @Override // X.InterfaceC367710EbJ
    public void LJ(Canvas canvas, RectF rectF, List<Integer> list, float f, float f2) {
        this.LIZ.setColor(LJIILIIL);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(it2.next().intValue() * f));
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            float fFloatValue = (((Number) it3.next()).floatValue() - this.LJI) / this.LJII;
            if (fFloatValue >= rectF.left && fFloatValue <= rectF.right) {
                float fHeight = rectF.height() - (this.LIZLLL * 3);
                float fHeight2 = rectF.height();
                float f3 = this.LIZLLL;
                canvas.drawCircle(fFloatValue, ((fHeight2 - f3) - fHeight) / 2, f3, this.LIZ);
            }
        }
    }

    @Override // X.InterfaceC367710EbJ
    public void LIZLLL(Canvas canvas, RectF rectF, List list, float f, EnumC367660EbE enumC367660EbE, float f2) {
        int i;
        int i2;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        float f3 = (33 * f) / this.LJII;
        float f4 = rectF.left - f3;
        float f5 = rectF.right + f3;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Pair pair = (Pair) it2.next();
            float fFloatValue = ((((Number) pair.getFirst()).floatValue() * f) - this.LJ) / this.LJII;
            float fMax = Math.max(((Number) pair.getSecond()).floatValue() * this.LIZJ, 0.5f);
            if (f4 <= fFloatValue && fFloatValue <= f5) {
                arrayList2.add(new Pair(Float.valueOf(fFloatValue), Float.valueOf(fMax)));
            }
        }
        Paint paint = this.LIZ;
        int i3 = C367700EbI.LIZ[enumC367660EbE.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                i2 = LJIIJJI;
            } else {
                i2 = LJIIL;
            }
        } else {
            i2 = LJIIJ;
        }
        paint.setColor(i2);
        this.LIZIZ.reset();
        float fCenterY = rectF.centerY();
        for (Object obj : arrayList2) {
            int i4 = i + 1;
            if (i >= 0) {
                Pair pair2 = (Pair) obj;
                if (i == 0) {
                    this.LIZIZ.moveTo(((Number) pair2.getFirst()).floatValue(), fCenterY - ((Number) pair2.getSecond()).floatValue());
                } else {
                    this.LIZIZ.moveTo(((Number) pair2.getFirst()).floatValue(), fCenterY - ((Number) pair2.getSecond()).floatValue());
                    this.LIZIZ.lineTo(((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue() + fCenterY);
                }
                i = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        canvas.drawPath(this.LIZIZ, this.LIZ);
        this.LIZIZ.reset();
    }
}

package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.19iS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21614619iS {
    public boolean LIZ = C463380IFc.LIZ();
    public final Path LIZIZ = new Path();
    public final Paint LIZJ;
    public final Paint LIZLLL;
    public final PorterDuffXfermode LJ;
    public float LJFF;
    public float LJI;
    public final Paint LJII;

    public C21614619iS() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LIZJ = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        this.LIZLLL = paint2;
        this.LJ = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(0);
        this.LJII = paint3;
    }

    public final void LIZIZ(int i) {
        if (i == EnumC938840aXS.DIVIDER_TYPE_NORMAL.type) {
            this.LIZJ.setColor(ColorProtector.parseColor("#FF1D0C2A"));
            this.LIZLLL.setColor(ColorProtector.parseColor("#FF1D0C2A"));
        } else if (i == EnumC938840aXS.DIVIDER_TYPE_SHARED_BG.type) {
            this.LIZJ.setColor(ColorProtector.parseColor("#57FFFFFF"));
            this.LIZLLL.setColor(ColorProtector.parseColor("#57FFFFFF"));
        } else {
            this.LIZ = false;
        }
    }

    public final void LIZ(Canvas canvas, Rect rect, Map<C21614719iT, Boolean> map, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        if (canvas == null) {
            return;
        }
        float f = rect.left;
        int iSaveLayer = canvas.saveLayer(f, rect.top, rect.width() + f, rect.top + rect.height(), null);
        if (!z) {
            canvas.drawColor(this.LIZLLL.getColor());
        }
        if (this.LIZLLL.getColor() != this.LIZJ.getColor()) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                ViewGroup.LayoutParams layoutParams3 = ((C21614719iT) entry.getKey()).LIZ.getLayoutParams();
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null && !((Boolean) entry.getValue()).booleanValue()) {
                    if (z) {
                        int i = layoutParams2.leftMargin;
                        float f2 = this.LJFF;
                        int i2 = layoutParams2.topMargin;
                        float f3 = this.LJI;
                        canvas.drawRoundRect(i - f2, i2 - f3, f2 + i + layoutParams2.width, i2 + layoutParams2.height + f3, ((C21614719iT) entry.getKey()).LIZIZ, ((C21614719iT) entry.getKey()).LIZIZ, this.LIZJ);
                    } else {
                        int i3 = layoutParams2.leftMargin;
                        float f4 = this.LJFF;
                        int i4 = layoutParams2.topMargin;
                        float f5 = this.LJI;
                        canvas.drawRect(i3 - f4, i4 - f5, f4 + i3 + layoutParams2.width, i4 + layoutParams2.height + f5, this.LIZJ);
                    }
                }
            }
        }
        this.LJII.setXfermode(this.LJ);
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            ViewGroup.LayoutParams layoutParams4 = ((C21614719iT) ((Map.Entry) it2.next()).getKey()).LIZ.getLayoutParams();
            if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
                if (z) {
                    canvas.drawRoundRect(layoutParams.leftMargin, layoutParams.topMargin, r7 + layoutParams.width, r5 + layoutParams.height, ((C21614719iT) r4.getKey()).LIZIZ, ((C21614719iT) r4.getKey()).LIZIZ, this.LJII);
                } else {
                    canvas.drawRect(layoutParams.leftMargin, layoutParams.topMargin, r5 + layoutParams.width, r4 + layoutParams.height, this.LJII);
                }
            }
        }
        this.LJII.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }
}

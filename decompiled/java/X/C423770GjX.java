package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleAGSLSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0GjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423770GjX extends Drawable {
    public final int[] LIZ;
    public final float[] LIZIZ;
    public final boolean LIZJ;
    public final Paint LIZLLL;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    public C423770GjX() {
        List<String> list = IMMessageBubbleAGSLSetting.LIZ().colors;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(ColorProtector.parseColor(it2.next())));
        }
        int[] iArrLLII = C13LP.LLII(arrayList);
        float[] fArrLLI = C13LP.LLI(IMMessageBubbleAGSLSetting.LIZ().sendBtnRatio);
        boolean z = IMMessageBubbleAGSLSetting.LIZ().isDiagonal;
        this.LIZ = iArrLLII;
        this.LIZIZ = fArrLLI;
        this.LIZJ = z;
        this.LIZLLL = new Paint(1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fMin = Math.min(getBounds().width(), getBounds().height()) / 2.0f;
        float fExactCenterX = getBounds().exactCenterX();
        float fExactCenterY = getBounds().exactCenterY();
        if (this.LIZJ && getLayoutDirection() == 1) {
            canvas.scale(-1.0f, 1.0f, fExactCenterX, fExactCenterY);
        }
        canvas.drawCircle(fExactCenterX, fExactCenterY, fMin, this.LIZLLL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float f;
        float f2;
        if (rect.isEmpty()) {
            return;
        }
        Paint paint = this.LIZLLL;
        boolean z = this.LIZJ;
        if (z) {
            f = rect.left;
        } else {
            f = 0.0f;
        }
        float f3 = rect.top;
        if (z) {
            f2 = rect.right;
        } else {
            f2 = 0.0f;
        }
        paint.setShader(new LinearGradient(f, f3, f2, rect.bottom, this.LIZ, this.LIZIZ, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZLLL.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZLLL.setColorFilter(colorFilter);
    }
}

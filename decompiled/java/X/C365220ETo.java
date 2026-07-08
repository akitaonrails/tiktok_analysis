package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ETo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365220ETo extends View {
    public final NLETrackSlot LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final Rect LLILZ;
    public final int LLILZIL;
    public final Paint LLILZLL;

    public final NLETrackSlot getSlot() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.LLILZ.set(0, 0, getWidth(), getHeight());
        Rect rect = this.LLILZ;
        canvas.drawRect(rect.left, rect.top, rect.right, rect.bottom, this.LLILZLL);
        super.onDraw(canvas);
    }

    public C365220ETo(NLETrackSlot nLETrackSlot, boolean z, boolean z2, boolean z3, Context context, AttributeSet attributeSet, int i, C356830Dyr c356830Dyr) {
        int iLIZ;
        Integer numLJIIJJI;
        int iLIZ2;
        int iLIZ3;
        Integer numLJIIJJI2;
        int i2;
        super(context, attributeSet, i);
        this.LL = nLETrackSlot;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = new Rect();
        this.LLILZIL = -1;
        if (z) {
            this.LLILZIL = C960203pA.LIZ(R.attr.a04, context);
        } else if (z2) {
            c356830Dyr.getClass();
            String strLJIIZILJ = C356830Dyr.LJIIZILJ(nLETrackSlot, "nleExtraEffectSelectedColor");
            if (strLJIIZILJ != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strLJIIZILJ)) != null) {
                iLIZ3 = numLJIIJJI2.intValue();
            } else {
                iLIZ3 = C960203pA.LIZ(R.attr.a04, context);
            }
            this.LLILZIL = iLIZ3;
        } else if (z3) {
            if (nLETrackSlot.hasExtra("nleExtraEffectColor")) {
                Integer numLJIIJJI3 = C2095008Iq.LJIIJJI(nLETrackSlot.getExtra("nleExtraEffectColor"));
                if (numLJIIJJI3 != null) {
                    iLIZ2 = numLJIIJJI3.intValue();
                } else {
                    iLIZ2 = C960203pA.LIZ(R.attr.a04, context);
                }
                this.LLILZIL = iLIZ2;
            }
        } else {
            if (nLETrackSlot.getMainSegment().hasExtra("nleExtraEffectSelectedColor") && (numLJIIJJI = C2095008Iq.LJIIJJI(nLETrackSlot.getMainSegment().getExtra("nleExtraEffectSelectedColor"))) != null) {
                iLIZ = numLJIIJJI.intValue();
            } else {
                iLIZ = C960203pA.LIZ(R.attr.a04, context);
            }
            this.LLILZIL = iLIZ;
            setElevation(C418440Gaw.LIZIZ(2));
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.LLILZIL);
        if (z) {
            i2 = 86;
        } else if (z2) {
            i2 = 127;
        } else {
            i2 = 204;
        }
        paint.setAlpha(i2);
        this.LLILZLL = paint;
    }
}

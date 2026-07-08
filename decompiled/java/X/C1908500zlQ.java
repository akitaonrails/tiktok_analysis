package X;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zlQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908500zlQ extends LayerDrawable {
    public float LL;

    public C1908500zlQ(ViewGroup viewGroup) {
        int iIntValue;
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        float fLIZIZ = C418440Gaw.LIZIZ(12);
        ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[1];
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        Paint paint = shapeDrawable.getPaint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c5, ActivityStack.getTopActivity());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        paint.setColor(iIntValue);
        shapeDrawable.getPaint().setShadowLayer(C418440Gaw.LIZIZ(12), 0.0f, C418440Gaw.LIZIZ(2), Color.argb(31, 0, 0, 0));
        shapeDrawable.setShape(C1888860zFk.LIZ(fLIZIZ));
        shapeDrawableArr[0] = shapeDrawable;
        super(shapeDrawableArr);
        if (viewGroup != null) {
            iLIZIZ = viewGroup.getPaddingStart();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        if (viewGroup != null) {
            iLIZIZ2 = viewGroup.getPaddingTop();
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        }
        if (viewGroup != null) {
            iLIZIZ3 = viewGroup.getPaddingEnd();
        } else {
            iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        if (viewGroup != null) {
            iLIZIZ4 = viewGroup.getPaddingBottom();
        } else {
            iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        }
        setLayerInset(0, iLIZIZ, iLIZIZ2, iLIZIZ3, iLIZIZ4);
        setId(0, 1827182);
        this.LL = fLIZIZ;
    }

    public final void LIZ(float f) {
        Drawable drawableFindDrawableByLayerId = findDrawableByLayerId(1827182);
        if (drawableFindDrawableByLayerId instanceof ShapeDrawable) {
            if (Math.abs(this.LL - f) < 1.0E-6d) {
                C19290510dT.LIZLLL("InnerPushBackgroundDrawable", "[updateCornerRadius], roundRadius is equal to current background radius, no need to update");
                return;
            }
            ((ShapeDrawable) drawableFindDrawableByLayerId).setShape(C1888860zFk.LIZ(f));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[updateCornerRadius], update background radius = ");
            sbLIZ.append(f);
            sbLIZ.append(" px");
            C19290510dT.LIZLLL("InnerPushBackgroundDrawable", C2188811AlT.LIZIZ(sbLIZ));
            this.LL = f;
        }
    }
}

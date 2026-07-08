package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21617719ix {
    public static final List<String> LIZLLL;
    public int LIZ;
    public final List<Camera.Area> LIZIZ = new ArrayList();
    public final List<Camera.Area> LIZJ = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        LIZLLL = arrayList;
        arrayList.add("multilaser");
        arrayList.add("ms40");
    }

    public final List<Camera.Area> LIZ(int i, int i2, float f, int i3, int i4, int i5, EnumC21617819iy enumC21617819iy) {
        Rect rectLIZIZ = LIZIZ(i, i2, f, 180.0f, i3, i4, i5, enumC21617819iy);
        if (((ArrayList) this.LIZJ).size() > 0) {
            ((ArrayList) this.LIZJ).clear();
        }
        ((ArrayList) this.LIZJ).add(new Camera.Area(rectLIZIZ, LSPassThroughRecordSizeConfig.DEFAULT));
        return this.LIZJ;
    }

    public final Rect LIZIZ(int i, int i2, float f, float f2, int i3, int i4, int i5, EnumC21617819iy enumC21617819iy) {
        int iIntValue = Float.valueOf((f * f2) + 0.5f).intValue();
        int i6 = ((int) (((i3 * 2000) * 1.0f) / i)) - LSPassThroughRecordSizeConfig.DEFAULT;
        int i7 = ((int) (((i4 * 2000) * 1.0f) / i2)) - LSPassThroughRecordSizeConfig.DEFAULT;
        if (this.LIZ == 1 && enumC21617819iy == EnumC21617819iy.VIEW) {
            i6 = -i6;
        }
        int i8 = iIntValue / 2;
        int i9 = i6 - i8;
        String str = C2183321Acc.LIZ;
        if (i9 > 1000) {
            i9 = LSPassThroughRecordSizeConfig.DEFAULT;
        } else if (i9 < -1000) {
            i9 = C386801es.DEFAULT;
        }
        int i10 = i7 - i8;
        if (i10 > 1000) {
            i10 = LSPassThroughRecordSizeConfig.DEFAULT;
        } else if (i10 < -1000) {
            i10 = C386801es.DEFAULT;
        }
        Rect rect = new Rect();
        RectF rectF = new RectF(i9, i10, C2183321Acc.LIZLLL(i9 + iIntValue), C2183321Acc.LIZLLL(i10 + iIntValue));
        Rect rect2 = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        Rect rect3 = new Rect(C386801es.DEFAULT, C386801es.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT);
        if (enumC21617819iy == EnumC21617819iy.VIEW) {
            Matrix matrix = new Matrix();
            matrix.setRotate(-i5);
            RectF rectF2 = new RectF(rect3);
            RectF rectF3 = new RectF(rect2);
            matrix.mapRect(rectF2);
            matrix.mapRect(rectF3);
            matrix.reset();
            matrix.setTranslate(-rectF2.left, -rectF2.top);
            matrix.mapRect(rectF2);
            matrix.mapRect(rectF3);
            rect3.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            rect2.set((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
            rect = new Rect(rect2.left - LSPassThroughRecordSizeConfig.DEFAULT, rect2.top - LSPassThroughRecordSizeConfig.DEFAULT, rect2.right - LSPassThroughRecordSizeConfig.DEFAULT, rect2.bottom - LSPassThroughRecordSizeConfig.DEFAULT);
        } else if (enumC21617819iy == EnumC21617819iy.ORIGINAL_FRAME) {
            rect = new Rect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        rect.left = C2183321Acc.LIZLLL(rect.left);
        rect.right = C2183321Acc.LIZLLL(rect.right);
        rect.top = C2183321Acc.LIZLLL(rect.top);
        rect.bottom = C2183321Acc.LIZLLL(rect.bottom);
        return rect;
    }
}

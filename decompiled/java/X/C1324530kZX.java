package X;

import a3.e0;
import android.graphics.Paint;
import android.text.Layout;

/* JADX INFO: renamed from: X.0kZX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324530kZX {
    public static final float LIZ(Layout layout, int i, Paint paint) {
        boolean z;
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        C1319890kS3 c1319890kS3 = e0.LIZ;
        if (layout.getEllipsisCount(i) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && C1324550kZZ.LIZ[paragraphAlignment.ordinal()] == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static final float LIZIZ(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        C1319890kS3 c1319890kS3 = e0.LIZ;
        if (layout.getEllipsisCount(i) > 0 && layout.getParagraphDirection(i) == -1 && layout.getWidth() < layout.getLineRight(i)) {
            float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
            Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
            if (paragraphAlignment != null && C1324550kZZ.LIZ[paragraphAlignment.ordinal()] == 1) {
                width = layout.getWidth() - layout.getLineRight(i);
                width2 = (layout.getWidth() - lineRight) / 2.0f;
            } else {
                width = layout.getWidth() - layout.getLineRight(i);
                width2 = layout.getWidth() - lineRight;
            }
            return width - width2;
        }
        return 0.0f;
    }
}

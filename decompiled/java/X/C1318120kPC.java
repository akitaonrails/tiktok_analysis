package X;

import android.text.Layout;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0kPC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318120kPC {
    public static int LIZ(Layout layout, int i, TextUtils.TruncateAt truncateAt) {
        if (truncateAt != TextUtils.TruncateAt.END) {
            if (i < layout.getLineCount()) {
                return layout.getLineBottom(i - 1);
            }
            return layout.getHeight();
        }
        return layout.getHeight();
    }

    public static boolean LIZIZ(Layout layout, int i, TextUtils.TruncateAt truncateAt, int i2, int i3) {
        float lineMax;
        if (LIZ(layout, i, truncateAt) > i3) {
            return true;
        }
        if (truncateAt != null) {
            if (layout.getEllipsisCount(layout.getLineCount() - 1) <= 0) {
                return false;
            }
        } else if (layout.getLineCount() <= i) {
            Layout.Alignment alignment = layout.getAlignment();
            int lineCount = layout.getLineCount();
            float fMax = -1.0f;
            for (int i4 = 0; i4 < lineCount; i4++) {
                if (alignment == Layout.Alignment.ALIGN_NORMAL) {
                    lineMax = layout.getLineMax(i4);
                } else {
                    lineMax = layout.getLineMax(i4) - layout.getParagraphLeft(i4);
                }
                fMax = Math.max(fMax, lineMax);
            }
            if (fMax > i2) {
                return true;
            }
            return false;
        }
        return true;
    }
}

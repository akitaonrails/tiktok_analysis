package X;

import android.text.Layout;

/* JADX INFO: renamed from: X.0uDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695420uDk {
    public static final int LIZ(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i && lineEnd != i) {
            return lineForOffset;
        }
        if (lineStart == i) {
            if (z) {
                return lineForOffset - 1;
            }
            return lineForOffset;
        }
        if (z) {
            return lineForOffset;
        }
        return lineForOffset + 1;
    }
}

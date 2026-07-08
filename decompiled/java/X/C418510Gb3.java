package X;

import android.text.TextPaint;

/* JADX INFO: renamed from: X.0Gb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418510Gb3 {
    public static final void LIZ(TextPaint textPaint, float f) {
        if (!Float.isNaN(f)) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            textPaint.setAlpha(Math.round(f * 255));
        }
    }
}

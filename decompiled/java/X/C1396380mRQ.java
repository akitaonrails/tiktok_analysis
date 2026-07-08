package X;

import android.graphics.Color;

/* JADX INFO: renamed from: X.0mRQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396380mRQ {
    public static final int LIZ(int i, int i2) {
        int i3 = 255;
        float f = 255;
        int iAlpha = (int) ((((Color.alpha(i) / f) * i2) / f) * f);
        if (iAlpha > 0) {
            if (255 > iAlpha) {
            }
            return (i3 << 24) + (i & 16777215);
        }
        iAlpha = 0;
        i3 = iAlpha;
        return (i3 << 24) + (i & 16777215);
    }
}

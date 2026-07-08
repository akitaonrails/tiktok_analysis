package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.0GTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416170GTn {
    public static Rect LIZ(float f, float f2, Rect rect) {
        float fLIZLLL = C13LZ.LIZLLL(f, 1.0f, f2);
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        int iWidth = (int) ((rect.width() * 0.5f) / fLIZLLL);
        int iHeight = (int) ((rect.height() * 0.5f) / fLIZLLL);
        return new Rect(iCenterX - iWidth, iCenterY - iHeight, iCenterX + iWidth, iCenterY + iHeight);
    }
}

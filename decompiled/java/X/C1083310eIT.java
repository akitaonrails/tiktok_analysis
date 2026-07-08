package X;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: X.0eIT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1083310eIT {
    public static final /* synthetic */ int LIZ = 0;

    public static PointF LIZIZ(View view, boolean z) {
        int width;
        int height;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (z) {
            width = iArr[0] + (view.getWidth() / 2);
        } else {
            width = iArr[0];
        }
        if (z) {
            height = iArr[1] + (view.getHeight() / 2);
        } else {
            height = iArr[1];
        }
        return new PointF(width, height);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator LIZ(final int r15, android.content.Context r16, final android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1083310eIT.LIZ(int, android.content.Context, android.view.View):android.animation.Animator");
    }
}

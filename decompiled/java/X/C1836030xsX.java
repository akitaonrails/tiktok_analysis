package X;

import android.util.Size;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0xsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836030xsX {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C038P c038p, Size size, int i, int i2, boolean z) {
        Size size2;
        int i3 = i;
        int i4 = i2;
        if (c038p != null) {
            int width = size.getWidth();
            int height = size.getHeight();
            if (!z) {
                double d = width;
                double d2 = height;
                double d3 = i3;
                double d4 = i4;
                if (d / d2 > d3 / d4) {
                    i4 = (int) ((d3 * d2) / d);
                } else {
                    i3 = (int) ((d4 * d) / d2);
                }
                size2 = new Size(i3, i4);
            } else {
                if (((double) width) / ((double) height) > 0.625d) {
                    i4 = (width <= 0 || height <= 0) ? i3 : (width * i3) / height;
                } else {
                    i3 = (width <= 0 || height <= 0) ? i4 : (height * i4) / width;
                }
                size2 = new Size(i4, i3);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("end onMeasure viewSize:");
            sbLIZ.append(size2);
            C20441214yg.LIZIZ("LiveReplayVideoClip", C2188811AlT.LIZIZ(sbLIZ));
            int width2 = size2.getWidth();
            int height2 = size2.getHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c038p.getLayoutParams();
            if (marginLayoutParams.width != width2 || marginLayoutParams.height != height2) {
                marginLayoutParams.width = width2;
                marginLayoutParams.height = height2;
                C786410Ut5.W5(c038p, marginLayoutParams);
            }
            C0Q72.LIZ(c038p, 8.0f);
        }
    }
}

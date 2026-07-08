package X;

import android.view.SurfaceView;
import android.view.ViewGroup;
import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0E9V, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E9V {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C0E48 c0e48, int i, int i2, int i3, int i4, SurfaceView surfaceView, int i5) {
        int[] iArr;
        if (surfaceView != null && surfaceView.getWidth() != 0 && surfaceView.getHeight() != 0) {
            Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            float f = iIntValue2;
            float f2 = iIntValue;
            float f3 = i4;
            if (f3 / i3 > f / f2) {
                iArr = new int[]{0, i5 + ((i4 - iIntValue2) / 2), i3, iIntValue2};
            } else {
                int i6 = (int) (f2 * ((f3 * 1.0f) / f));
                iArr = new int[]{(i3 - i6) / 2, i5, i6, i4};
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) surfaceView.getLayoutParams();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CanvasViewExt setDisplayPos in editorPro ");
            sbLIZ.append(Arrays.toString(iArr));
            sbLIZ.append(" surface w: ");
            sbLIZ.append(surfaceView.getWidth());
            sbLIZ.append(" h: ");
            sbLIZ.append(surfaceView.getHeight());
            sbLIZ.append(" marginTop: ");
            sbLIZ.append(marginLayoutParams.topMargin);
            sbLIZ.append(" marginStart: ");
            sbLIZ.append(marginLayoutParams.getMarginStart());
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            c0e48.getPlayer().LJIILJJIL(iArr[0], iArr[1], iArr[2], iArr[3], null);
        }
    }
}

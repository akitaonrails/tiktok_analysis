package X;

import android.graphics.Color;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567410MNf {
    public static final int LIZIZ(int i) {
        Integer numLIZJ;
        if (LIZJ(-16777216, i)) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bn, C0CHQ.LIZ);
            if (numLIZJ2 != null) {
                return numLIZJ2.intValue();
            }
            return i;
        }
        if (!LIZJ(-1, i) || (numLIZJ = C1308910kAL.LIZJ(R.attr.ea, C0CHQ.LIZ)) == null) {
            return i;
        }
        return numLIZJ.intValue();
    }

    public static CanvasBackground LIZ(int i, Pair pair) {
        int iLIZIZ = LIZIZ(((Number) pair.getFirst()).intValue());
        int iLIZIZ2 = LIZIZ(((Number) pair.getSecond()).intValue());
        if (iLIZIZ == iLIZIZ2) {
            CanvasBackground.Companion.getClass();
            return C567420MNg.LIZ(iLIZIZ);
        }
        CanvasBackground.Companion.getClass();
        CanvasBackground canvasBackground = new CanvasBackground(2);
        canvasBackground.setStartColor(iLIZIZ);
        canvasBackground.setEndColor(iLIZIZ2);
        canvasBackground.setPrimaryColor(i);
        return canvasBackground;
    }

    public static boolean LIZJ(int i, int i2) {
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        int iRed2 = Color.red(i);
        int iGreen2 = Color.green(i);
        int iBlue2 = Color.blue(i);
        if (Math.abs(iRed - iRed2) / 255.0f <= 0.05f && Math.abs(iGreen - iGreen2) / 255.0f <= 0.05f && Math.abs(iBlue - iBlue2) / 255.0f <= 0.05f) {
            return true;
        }
        return false;
    }
}

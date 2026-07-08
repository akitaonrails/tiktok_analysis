package X;

import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: renamed from: X.00qF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C202500qF {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(int i) {
        int iLIZIZ;
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        if (fArr[2] < 0.5f) {
            iLIZIZ = LIZIZ(i, -1);
        } else {
            iLIZIZ = LIZIZ(i, -16777216);
        }
        float[] fArr2 = new float[3];
        Color.colorToHSV(i, fArr2);
        if (fArr2[2] > 0.5f) {
            return new Pair(Integer.valueOf(i), Integer.valueOf(iLIZIZ));
        }
        return new Pair(Integer.valueOf(iLIZIZ), Integer.valueOf(i));
    }

    public static String LIZLLL(int i) {
        try {
            return C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LJ(int i) {
        return C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    public static Integer LJFF(String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LJI(int i) {
        try {
            return C786410Ut5.j4("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static int LIZIZ(int i, int i2) {
        float f = 1 - 0.85f;
        return Color.rgb(C814420VxA.LIZIZ((Color.red(i) * f) + (Color.red(i2) * 0.85f)), C814420VxA.LIZIZ((Color.green(i) * f) + (Color.green(i2) * 0.85f)), C814420VxA.LIZIZ((Color.blue(i) * f) + (Color.blue(i2) * 0.85f)));
    }

    public static int LIZJ(int i, String str) {
        try {
            i = Color.parseColor(str);
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }
}
